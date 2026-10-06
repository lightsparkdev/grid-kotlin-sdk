// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.models.customers.externalaccounts.OwnershipChallengeRequest
import java.util.Objects

/**
 * Start (or restart) ownership verification for a `FIRST_PARTY` self-custody crypto wallet external
 * account in `PENDING_OWNERSHIP_VERIFICATION` or `UNVERIFIED` status. The response carries the
 * method-specific challenge material:
 * - `WALLET_SIGNATURE` — a `messageToSign`; have the wallet sign it exactly and submit the result
 *   to the verify endpoint to complete verification synchronously.
 * - `LIVENESS` — a hosted `verificationLink` (and possibly an embed `token`); the user completes a
 *   biometric flow and verification completes asynchronously. The outcome is delivered via
 *   `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks or by polling the account.
 *
 * Calling this endpoint again abandons any in-flight challenge and issues a new one with the
 * requested method — use it to retry after a failed attempt, to replace an expired challenge, or to
 * switch methods. An `UNVERIFIED` account returns to `PENDING_OWNERSHIP_VERIFICATION` when a new
 * challenge is issued.
 *
 * Completing ownership verification moves the account to `ACTIVE`.
 */
class ExternalAccountChallengeParams
private constructor(
    private val externalAccountId: String?,
    private val ownershipChallengeRequest: OwnershipChallengeRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalAccountId(): String? = externalAccountId

    /**
     * Starts (or restarts) an ownership verification challenge for a crypto wallet external
     * account.
     */
    fun ownershipChallengeRequest(): OwnershipChallengeRequest = ownershipChallengeRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        ownershipChallengeRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalAccountChallengeParams].
         *
         * The following fields are required:
         * ```kotlin
         * .ownershipChallengeRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExternalAccountChallengeParams]. */
    class Builder internal constructor() {

        private var externalAccountId: String? = null
        private var ownershipChallengeRequest: OwnershipChallengeRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(externalAccountChallengeParams: ExternalAccountChallengeParams) = apply {
            externalAccountId = externalAccountChallengeParams.externalAccountId
            ownershipChallengeRequest = externalAccountChallengeParams.ownershipChallengeRequest
            additionalHeaders = externalAccountChallengeParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountChallengeParams.additionalQueryParams.toBuilder()
        }

        fun externalAccountId(externalAccountId: String?) = apply {
            this.externalAccountId = externalAccountId
        }

        /**
         * Starts (or restarts) an ownership verification challenge for a crypto wallet external
         * account.
         */
        fun ownershipChallengeRequest(ownershipChallengeRequest: OwnershipChallengeRequest) =
            apply {
                this.ownershipChallengeRequest = ownershipChallengeRequest
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
         * Returns an immutable instance of [ExternalAccountChallengeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ownershipChallengeRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAccountChallengeParams =
            ExternalAccountChallengeParams(
                externalAccountId,
                checkRequired("ownershipChallengeRequest", ownershipChallengeRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): OwnershipChallengeRequest = ownershipChallengeRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalAccountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountChallengeParams &&
            externalAccountId == other.externalAccountId &&
            ownershipChallengeRequest == other.ownershipChallengeRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalAccountId,
            ownershipChallengeRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExternalAccountChallengeParams{externalAccountId=$externalAccountId, ownershipChallengeRequest=$ownershipChallengeRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
