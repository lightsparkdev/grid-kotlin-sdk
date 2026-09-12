// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Update a card's `state`, bound `fundingSource`, and / or `maxSpendPerTransaction`,
 * `maxSpendPerDay`, or `maxTransactionsPerDay`. At least one field must be supplied.
 * - `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN → CLOSED`. `CLOSED`
 *   is terminal and irreversible. Any other transition returns `409 INVALID_STATE_TRANSITION`.
 * - `fundingSource`, when supplied, replaces the card's bound internal account. It must belong to
 *   the customer and be denominated in the card's currency. `fundingSource` cannot be supplied
 *   alongside `state: CLOSED`. On card programs where the card issuer makes authorization
 *   decisions, `fundingSource` cannot be combined with any `state` change, so send the changes as
 *   separate requests. On card programs where Grid makes the authorization decision, the
 *   combination remains valid for `state` changes other than `CLOSED`.
 * - `maxSpendPerTransaction`, when supplied, replaces the card-specific per-transaction cap. Supply
 *   a positive integer in the smallest unit of the card's currency to set it or null to clear it.
 *   If the platform config sets `cardConfigs.maxSpendPerTransaction`, Grid enforces the lower of
 *   the card and platform values. The card's `cardCapabilities.supportsSpendLimits` must be true.
 *   `maxSpendPerTransaction` cannot be supplied alongside `state: CLOSED`.
 * - `maxSpendPerDay`, when supplied, replaces the card-specific cap on cumulative new spend during
 *   one UTC calendar day. Supply a positive integer in the smallest unit of the card's currency to
 *   set it or null to clear it. If the platform config sets `cardConfigs.maxSpendPerDay`, Grid
 *   enforces the lower of the card and platform values. Refunds, reversals, and authorization
 *   expiries do not restore capacity during the day. The card's
 *   `cardCapabilities.supportsSpendLimits` must be true. `maxSpendPerDay` cannot be supplied
 *   alongside `state: CLOSED`.
 * - `maxTransactionsPerDay`, when supplied, replaces the card-specific cap on the number of
 *   transactions the card may authorize during one UTC calendar day. Supply a positive integer to
 *   set it or null to clear it. If the platform config sets `cardConfigs.maxTransactionsPerDay`,
 *   Grid enforces the lower of the card and platform values. Refunds, reversals, and authorization
 *   expiries do not restore capacity during the day. `maxTransactionsPerDay` requires the card's
 *   `cardCapabilities.supportsTransactionCountLimit` to be true and cannot be supplied alongside
 *   `state: CLOSED`.
 *
 * This endpoint is authenticated by the platform credential alone and returns `200` directly. It
 * deliberately does not use Grid's 202 → signed-retry pattern: that pattern signs with the session
 * key of a credential on the owning internal account, so it models actions taken *by* the end user
 * on their own credentials or funds. Freezing or closing a card is routinely an action taken
 * *about* a user and without them present - fraud response, offboarding, an ops-driven freeze - and
 * requiring the cardholder's signature would make exactly those cases impossible. Operations that
 * expose sensitive card data (`POST /cards/{id}/reveal`, 3DS password retrieval) are SCA-railed
 * instead, because there the cardholder is the party being served.
 *
 * Effects:
 * - `state: FROZEN`: Authorization Decisioning declines new auths with `CARD_PAUSED`. Existing
 *   pulls and in-flight reconciliation continue — freezing does not pause the lifecycle of
 *   authorizations that already passed.
 * - `state: ACTIVE`: normal authorization behavior resumes.
 * - `state: CLOSED`: terminal close. The card transitions to `state: "CLOSED"` with `stateReason:
 *   "CLOSED_BY_PLATFORM"` and stays in the system for audit and reconciliation. All pending auths
 *   reconcile to a terminal state via the existing reconcile primitive. Inbound clearings received
 *   after close follow the standard force-post / late-presentment path — Lightspark absorbs the
 *   loss if a post-hoc pull on the now-unbound source fails. The funding source is detached.
 *   Refunds already in flight still complete because Lightspark holds the card-reserve keys.
 * - `fundingSource` change: returns the updated card with the new binding and fires no webhook.
 *
 * The `card.state_change` webhook fires on every successful `state` transition.
 */
class CardUpdateParams
private constructor(
    private val id: String?,
    private val cardUpdateRequest: CardUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Update request for `PATCH /cards/{id}`. At least one of `state`, `fundingSource`,
     * `maxSpendPerTransaction`, `maxSpendPerDay`, or `maxTransactionsPerDay` must be supplied.
     * `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN → CLOSED`; any
     * other transition returns `409 INVALID_STATE_TRANSITION`. `CLOSED` is terminal and
     * irreversible and cannot be combined with `fundingSource`, `maxSpendPerTransaction`,
     * `maxSpendPerDay`, or `maxTransactionsPerDay`.
     */
    fun cardUpdateRequest(): CardUpdateRequest = cardUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        cardUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .cardUpdateRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var cardUpdateRequest: CardUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            id = cardUpdateParams.id
            cardUpdateRequest = cardUpdateParams.cardUpdateRequest
            additionalHeaders = cardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Update request for `PATCH /cards/{id}`. At least one of `state`, `fundingSource`,
         * `maxSpendPerTransaction`, `maxSpendPerDay`, or `maxTransactionsPerDay` must be supplied.
         * `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN → CLOSED`; any
         * other transition returns `409 INVALID_STATE_TRANSITION`. `CLOSED` is terminal and
         * irreversible and cannot be combined with `fundingSource`, `maxSpendPerTransaction`,
         * `maxSpendPerDay`, or `maxTransactionsPerDay`.
         */
        fun cardUpdateRequest(cardUpdateRequest: CardUpdateRequest) = apply {
            this.cardUpdateRequest = cardUpdateRequest
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CardUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cardUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardUpdateParams =
            CardUpdateParams(
                id,
                checkRequired("cardUpdateRequest", cardUpdateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CardUpdateRequest = cardUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardUpdateParams &&
            id == other.id &&
            cardUpdateRequest == other.cardUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, cardUpdateRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardUpdateParams{id=$id, cardUpdateRequest=$cardUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
