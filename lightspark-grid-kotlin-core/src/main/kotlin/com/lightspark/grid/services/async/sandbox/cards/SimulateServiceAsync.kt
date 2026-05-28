// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.cards.CardTransaction
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateAuthorizationParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateClearingParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateRefundParams

/** Endpoints to trigger test cases in sandbox */
interface SimulateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SimulateServiceAsync

    /**
     * Simulate an inbound card authorization in the sandbox environment. Drives the same internal
     * `authorize` + `reconcile` paths the card issuer would call in production, so platforms can
     * exercise Grid's decisioning + funding-source pull behavior end-to-end without an external
     * network round-trip.
     *
     * The decisioning outcome is controlled by the last three characters of `merchant.descriptor`:
     *
     * | Suffix | Outcome | | ------ | ------- | | `002` | Decline — `INSUFFICIENT_FUNDS` (the pull
     * on the funding source fails) | | `003` | Decline — `CARD_PAUSED` (intended to verify a frozen
     * card refuses auths) | | `005` | Delayed pull (~30s) — exercises the `PENDING → CONFIRMED`
     * path | | `006` | Pull succeeds but the confirmation event reports `FAILED` — exercises the
     * high-urgency `EXCEPTION` alert | | any other | Approved |
     *
     * Production returns `404` on this path.
     */
    suspend fun authorization(
        id: String,
        params: SimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTransaction = authorization(params.toBuilder().id(id).build(), requestOptions)

    /** @see authorization */
    suspend fun authorization(
        params: SimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTransaction

    /**
     * Simulate a clearing (settlement) event against an existing `CardTransaction` in the sandbox
     * environment.
     * - A clearing `amount` greater than the authorized amount exercises the over-auth
     *   post-hoc-pull path (e.g. restaurant tip on top of a 20% over-auth).
     * - A clearing `amount` of `0` exercises the `AUTHORIZATION_EXPIRY` path — the auth expires
     *   with no clearing posted.
     * - Suffix-driven outcomes on the parent transaction's id govern whether the post-hoc pull
     *   succeeds (use the suffix table from `simulate/authorization` to construct deterministic
     *   test cases).
     *
     * Production returns `404` on this path.
     */
    suspend fun clearing(
        id: String,
        params: SimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTransaction = clearing(params.toBuilder().id(id).build(), requestOptions)

    /** @see clearing */
    suspend fun clearing(
        params: SimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTransaction

    /**
     * Simulate a merchant-initiated `RETURN` against an existing settled card transaction in the
     * sandbox environment. Creates a `CardRefund` on the parent and either flips the parent to
     * `REFUNDED` (full refund) or keeps it `SETTLED` with a non-zero `refundedAmount` (partial
     * refund).
     *
     * Production returns `404` on this path.
     */
    suspend fun refund(
        id: String,
        params: SimulateRefundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTransaction = refund(params.toBuilder().id(id).build(), requestOptions)

    /** @see refund */
    suspend fun refund(
        params: SimulateRefundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTransaction

    /**
     * A view of [SimulateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SimulateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/cards/{id}/simulate/authorization`, but is
         * otherwise the same as [SimulateServiceAsync.authorization].
         */
        @MustBeClosed
        suspend fun authorization(
            id: String,
            params: SimulateAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTransaction> =
            authorization(params.toBuilder().id(id).build(), requestOptions)

        /** @see authorization */
        @MustBeClosed
        suspend fun authorization(
            params: SimulateAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTransaction>

        /**
         * Returns a raw HTTP response for `post /sandbox/cards/{id}/simulate/clearing`, but is
         * otherwise the same as [SimulateServiceAsync.clearing].
         */
        @MustBeClosed
        suspend fun clearing(
            id: String,
            params: SimulateClearingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTransaction> =
            clearing(params.toBuilder().id(id).build(), requestOptions)

        /** @see clearing */
        @MustBeClosed
        suspend fun clearing(
            params: SimulateClearingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTransaction>

        /**
         * Returns a raw HTTP response for `post /sandbox/cards/{id}/simulate/return`, but is
         * otherwise the same as [SimulateServiceAsync.refund].
         */
        @MustBeClosed
        suspend fun refund(
            id: String,
            params: SimulateRefundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTransaction> =
            refund(params.toBuilder().id(id).build(), requestOptions)

        /** @see refund */
        @MustBeClosed
        suspend fun refund(
            params: SimulateRefundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTransaction>
    }
}
