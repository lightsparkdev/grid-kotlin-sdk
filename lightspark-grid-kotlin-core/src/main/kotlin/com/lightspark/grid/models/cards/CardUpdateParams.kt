// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Update a card's `state` and / or its bound `fundingSources`. At least one of the two fields must
 * be supplied.
 * - `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN → CLOSED`. `CLOSED`
 *   is terminal and irreversible. Any other transition returns `409 INVALID_STATE_TRANSITION`.
 * - `fundingSources`, when supplied, fully replaces the card's bound funding sources. Array order
 *   determines the priority Authorization Decisioning tries them in. Each id must belong to the
 *   cardholder and be denominated in the card's currency; the list must contain at least one
 *   source. `fundingSources` cannot be supplied alongside `state: CLOSED`.
 *
 * Because both updates are sensitive state changes, this endpoint uses Grid's 202 → signed-retry
 * pattern (same shape as `DELETE /auth/credentials/{id}` and `POST
 * /internal-accounts/{id}/export`):
 * 1. Call `PATCH /cards/{id}` with the target fields and no signing headers. The response is `202`
 *    with a `payloadToSign`, `requestId`, and `expiresAt`.
 * 2. Sign the `payloadToSign` with the session private key of a verified authentication credential
 *    on the card's owning internal account and retry with the signature as the
 *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header. The
 *    signed retry returns `200` with the updated `Card`.
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
 *   loss if a post-hoc pull on the now-unbound source fails. Funding-source bindings are detached.
 *   Refunds already in flight still complete because Lightspark holds the card-reserve keys.
 * - `fundingSources` change: emits `card.funding_source_change` reflecting the new ordered binding.
 *
 * The `card.state_change` webhook fires on every successful `state` transition; the
 * `card.funding_source_change` webhook fires whenever `fundingSources` is updated.
 */
class CardUpdateParams
private constructor(
    private val id: String?,
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val cardUpdateRequest: CardUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * Update request for `PATCH /cards/{id}`. At least one of `state` or `fundingSources` must be
     * supplied. `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN →
     * CLOSED`; any other transition returns `409 INVALID_STATE_TRANSITION`. `CLOSED` is terminal
     * and irreversible and cannot be combined with `fundingSources`. `fundingSources`, when
     * supplied, fully replaces the card's bound funding sources — the array order determines the
     * priority Authorization Decisioning tries them in.
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
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var cardUpdateRequest: CardUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            id = cardUpdateParams.id
            gridWalletSignature = cardUpdateParams.gridWalletSignature
            requestId = cardUpdateParams.requestId
            cardUpdateRequest = cardUpdateParams.cardUpdateRequest
            additionalHeaders = cardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Update request for `PATCH /cards/{id}`. At least one of `state` or `fundingSources` must
         * be supplied. `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN →
         * CLOSED`; any other transition returns `409 INVALID_STATE_TRANSITION`. `CLOSED` is
         * terminal and irreversible and cannot be combined with `fundingSources`. `fundingSources`,
         * when supplied, fully replaces the card's bound funding sources — the array order
         * determines the priority Authorization Decisioning tries them in.
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
                gridWalletSignature,
                requestId,
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

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                gridWalletSignature?.let { put("Grid-Wallet-Signature", it) }
                requestId?.let { put("Request-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardUpdateParams &&
            id == other.id &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            cardUpdateRequest == other.cardUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            gridWalletSignature,
            requestId,
            cardUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CardUpdateParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, cardUpdateRequest=$cardUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
