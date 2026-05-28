// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Simulate an inbound card authorization in the sandbox environment. Drives the same internal
 * `authorize` + `reconcile` paths the card issuer would call in production, so platforms can
 * exercise Grid's decisioning + funding-source pull behavior end-to-end without an external network
 * round-trip.
 *
 * The decisioning outcome is controlled by the last three characters of `merchant.descriptor`:
 *
 * | Suffix | Outcome | | ------ | ------- | | `002` | Decline — `INSUFFICIENT_FUNDS` (the pull on
 * the funding source fails) | | `003` | Decline — `CARD_PAUSED` (intended to verify a frozen card
 * refuses auths) | | `005` | Delayed pull (~30s) — exercises the `PENDING → CONFIRMED` path | |
 * `006` | Pull succeeds but the confirmation event reports `FAILED` — exercises the high-urgency
 * `EXCEPTION` alert | | any other | Approved |
 *
 * Production returns `404` on this path.
 */
class SimulateAuthorizationParams
private constructor(
    private val id: String?,
    private val authorizationRequest: AuthorizationRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/authorization`. Drives the
     * same internal authorization + reconcile paths that the issuer would call in production. The
     * decisioning outcome is controlled by the last three characters of `merchant.descriptor` — see
     * the endpoint documentation for the suffix table.
     */
    fun authorizationRequest(): AuthorizationRequest = authorizationRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        authorizationRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimulateAuthorizationParams].
         *
         * The following fields are required:
         * ```kotlin
         * .authorizationRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SimulateAuthorizationParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var authorizationRequest: AuthorizationRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(simulateAuthorizationParams: SimulateAuthorizationParams) = apply {
            id = simulateAuthorizationParams.id
            authorizationRequest = simulateAuthorizationParams.authorizationRequest
            additionalHeaders = simulateAuthorizationParams.additionalHeaders.toBuilder()
            additionalQueryParams = simulateAuthorizationParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/authorization`. Drives
         * the same internal authorization + reconcile paths that the issuer would call in
         * production. The decisioning outcome is controlled by the last three characters of
         * `merchant.descriptor` — see the endpoint documentation for the suffix table.
         */
        fun authorizationRequest(authorizationRequest: AuthorizationRequest) = apply {
            this.authorizationRequest = authorizationRequest
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
         * Returns an immutable instance of [SimulateAuthorizationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .authorizationRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimulateAuthorizationParams =
            SimulateAuthorizationParams(
                id,
                checkRequired("authorizationRequest", authorizationRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AuthorizationRequest = authorizationRequest

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

        return other is SimulateAuthorizationParams &&
            id == other.id &&
            authorizationRequest == other.authorizationRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, authorizationRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SimulateAuthorizationParams{id=$id, authorizationRequest=$authorizationRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
