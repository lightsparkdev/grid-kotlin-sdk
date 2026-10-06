// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.transferin.Transaction
import com.lightspark.grid.models.transferin.TransferInCreateParams
import com.lightspark.grid.models.transferin.TransferInRequest

/**
 * Deprecated endpoints for transferring funds between internal and external accounts with the same
 * currency. Use the quote endpoints under Cross-Currency Transfers instead, which now serve
 * same-currency transfers as well.
 */
interface TransferInServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferInServiceAsync

    /**
     * **Deprecated. Use `POST /quotes` instead.**
     *
     * Same-currency transfers are now served by the quote endpoint. Create a quote with an external
     * account source and an internal account destination and set `immediatelyExecute: true` to move
     * the funds in a single request, exactly as this endpoint does. This endpoint continues to work
     * and its request and response shapes are unchanged.
     *
     * To migrate a request to `POST /quotes`:
     * - add `sourceType: ACCOUNT` to `source` and `destinationType: ACCOUNT` to `destination`; the
     *   account IDs are unchanged
     * - rename `amount` to `lockedCurrencyAmount` and add `lockedCurrencySide: SENDING`
     * - add `immediatelyExecute: true` to keep the single-request behavior
     *
     * The quote response is a `Quote` rather than a `Transaction`; read `transactionId` from it to
     * track the resulting transaction.
     *
     * Transfer funds from an external account to an internal account for a specific customer. This
     * endpoint should only be used for external account sources with pull functionality (e.g. ACH
     * Pull). Otherwise, use the paymentInstructions on the internal account to deposit funds.
     */
    @Deprecated("deprecated")
    suspend fun create(
        params: TransferInCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see create */
    @Deprecated("deprecated")
    suspend fun create(
        transferInRequest: TransferInRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction =
        create(
            TransferInCreateParams.builder().transferInRequest(transferInRequest).build(),
            requestOptions,
        )

    /**
     * A view of [TransferInServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransferInServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /transfer-in`, but is otherwise the same as
         * [TransferInServiceAsync.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun create(
            params: TransferInCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun create(
            transferInRequest: TransferInRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            create(
                TransferInCreateParams.builder().transferInRequest(transferInRequest).build(),
                requestOptions,
            )
    }
}
