// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.cards.Card
import com.lightspark.grid.models.cards.CardCreateRequest
import com.lightspark.grid.models.cards.CardIssueParams
import com.lightspark.grid.models.cards.CardListPageAsync
import com.lightspark.grid.models.cards.CardListParams
import com.lightspark.grid.models.cards.CardRetrieveParams
import com.lightspark.grid.models.cards.CardUpdateParams

/**
 * Card management endpoints. Issue debit cards against an internal account, freeze / unfreeze,
 * close, manage card funding sources, and list card transactions.
 */
interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync

    /**
     * Retrieve a card by its system-generated id. To display the card's full PAN, CVV, and expiry
     * to the cardholder, request a reveal with `POST /cards/{id}/reveal` — the card resource itself
     * never carries the reveal URL.
     */
    suspend fun retrieve(
        id: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Card =
        retrieve(id, CardRetrieveParams.none(), requestOptions)

    /**
     * Update a card's `state` and / or its bound `fundingSources`. At least one of the two fields
     * must be supplied.
     * - `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN → CLOSED`.
     *   `CLOSED` is terminal and irreversible. Any other transition returns `409
     *   INVALID_STATE_TRANSITION`.
     * - `fundingSources`, when supplied, fully replaces the card's bound funding sources. Array
     *   order determines the priority Authorization Decisioning tries them in. Each id must belong
     *   to the cardholder and be denominated in the card's currency; the list must contain at least
     *   one source. `fundingSources` cannot be supplied alongside `state: CLOSED`.
     *
     * This endpoint is authenticated by the platform credential alone and returns `200` directly.
     * It deliberately does not use Grid's 202 → signed-retry pattern: that pattern signs with the
     * session key of a credential on the owning internal account, so it models actions taken *by*
     * the end user on their own credentials or funds. Freezing or closing a card is routinely an
     * action taken *about* a user and without them present - fraud response, offboarding, an
     * ops-driven freeze - and requiring the cardholder's signature would make exactly those cases
     * impossible. Operations that expose sensitive card data (`POST /cards/{id}/reveal`, 3DS
     * password retrieval) are SCA-railed instead, because there the cardholder is the party being
     * served.
     *
     * Effects:
     * - `state: FROZEN`: Authorization Decisioning declines new auths with `CARD_PAUSED`. Existing
     *   pulls and in-flight reconciliation continue — freezing does not pause the lifecycle of
     *   authorizations that already passed.
     * - `state: ACTIVE`: normal authorization behavior resumes.
     * - `state: CLOSED`: terminal close. The card transitions to `state: "CLOSED"` with
     *   `stateReason: "CLOSED_BY_PLATFORM"` and stays in the system for audit and reconciliation.
     *   All pending auths reconcile to a terminal state via the existing reconcile primitive.
     *   Inbound clearings received after close follow the standard force-post / late-presentment
     *   path — Lightspark absorbs the loss if a post-hoc pull on the now-unbound source fails.
     *   Funding-source bindings are detached. Refunds already in flight still complete because
     *   Lightspark holds the card-reserve keys.
     * - `fundingSources` change: emits `card.funding_source_change` reflecting the new ordered
     *   binding.
     *
     * The `card.state_change` webhook fires on every successful `state` transition; the
     * `card.funding_source_change` webhook fires whenever `fundingSources` is updated.
     */
    suspend fun update(
        id: String,
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /**
     * Retrieve a paginated list of cards. Cards can be filtered by cardholder, bound funding-source
     * internal account, state, and platform-specific card identifier. If no filters are provided,
     * returns all cards visible to the caller.
     */
    suspend fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardListPageAsync =
        list(CardListParams.none(), requestOptions)

    /**
     * Issue a new card for a cardholder. Every card must be bound to at least one funding source at
     * create time. The cardholder must have KYC status `APPROVED` before a card can be issued;
     * otherwise the request is rejected with `CARDHOLDER_KYC_NOT_APPROVED`.
     *
     * If any funding source is an Embedded Wallet internal account, the cardholder must authorize
     * Grid to sign Spark token transactions for that card funding source by completing the
     * delegated-key creation flow with `POST /auth/delegated-keys`. Until an active delegated key
     * exists for that funding source, Authorization Decisioning cannot use it to fund card
     * transactions.
     *
     * New cards start in `state: "PROCESSING"` while the card issuer provisions the card. The
     * `card.state_change` webhook fires on each state transition, including the transition to
     * `ACTIVE` (or to `CLOSED` with `stateReason: "ISSUER_REJECTED"` if provisioning fails).
     */
    suspend fun issue(
        params: CardIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see issue */
    suspend fun issue(
        cardCreateRequest: CardCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card =
        issue(
            CardIssueParams.builder().cardCreateRequest(cardCreateRequest).build(),
            requestOptions,
        )

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cards/{id}`, but is otherwise the same as
         * [CardServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Card> =
            retrieve(id, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{id}`, but is otherwise the same as
         * [CardServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CardListPageAsync> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardServiceAsync.issue].
         */
        @MustBeClosed
        suspend fun issue(
            params: CardIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see issue */
        @MustBeClosed
        suspend fun issue(
            cardCreateRequest: CardCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            issue(
                CardIssueParams.builder().cardCreateRequest(cardCreateRequest).build(),
                requestOptions,
            )
    }
}
