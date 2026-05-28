// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Simulate a clearing (settlement) event against an existing `CardTransaction` in the sandbox
 * environment.
 * - A clearing `amount` greater than the authorized amount exercises the over-auth post-hoc-pull
 *   path (e.g. restaurant tip on top of a 20% over-auth).
 * - A clearing `amount` of `0` exercises the `AUTHORIZATION_EXPIRY` path — the auth expires with no
 *   clearing posted.
 * - Suffix-driven outcomes on the parent transaction's id govern whether the post-hoc pull succeeds
 *   (use the suffix table from `simulate/authorization` to construct deterministic test cases).
 *
 * Production returns `404` on this path.
 */
class SimulateClearingParams
private constructor(
    private val id: String?,
    private val clearingRequest: ClearingRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/clearing`. Drives a clearing
     * event against an existing `CardTransaction`. Pass an `amount` greater than the authorized
     * amount to exercise the over-auth / restaurant-tip post-hoc-pull path; pass `0` to exercise
     * `AUTHORIZATION_EXPIRY`. Suffix-driven outcomes on the parent transaction's id govern whether
     * the post-hoc pull succeeds.
     */
    fun clearingRequest(): ClearingRequest = clearingRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        clearingRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimulateClearingParams].
         *
         * The following fields are required:
         * ```kotlin
         * .clearingRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SimulateClearingParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var clearingRequest: ClearingRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(simulateClearingParams: SimulateClearingParams) = apply {
            id = simulateClearingParams.id
            clearingRequest = simulateClearingParams.clearingRequest
            additionalHeaders = simulateClearingParams.additionalHeaders.toBuilder()
            additionalQueryParams = simulateClearingParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/clearing`. Drives a
         * clearing event against an existing `CardTransaction`. Pass an `amount` greater than the
         * authorized amount to exercise the over-auth / restaurant-tip post-hoc-pull path; pass `0`
         * to exercise `AUTHORIZATION_EXPIRY`. Suffix-driven outcomes on the parent transaction's id
         * govern whether the post-hoc pull succeeds.
         */
        fun clearingRequest(clearingRequest: ClearingRequest) = apply {
            this.clearingRequest = clearingRequest
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
         * Returns an immutable instance of [SimulateClearingParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .clearingRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimulateClearingParams =
            SimulateClearingParams(
                id,
                checkRequired("clearingRequest", clearingRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ClearingRequest = clearingRequest

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

        return other is SimulateClearingParams &&
            id == other.id &&
            clearingRequest == other.clearingRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, clearingRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SimulateClearingParams{id=$id, clearingRequest=$clearingRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
