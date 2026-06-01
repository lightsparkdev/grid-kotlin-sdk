// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.invitations

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Claim an UMA invitation by associating it with an invitee UMA address.
 *
 * When an invitation is successfully claimed:
 * 1. The invitation status changes from PENDING to CLAIMED
 * 2. The invitee UMA address is associated with the invitation
 * 3. An INVITATION_CLAIMED webhook is triggered to notify the platform that created the invitation
 *
 * This endpoint allows customers to accept invitations sent to them by other UMA customers.
 */
class InvitationClaimParams
private constructor(
    private val invitationCode: String?,
    private val umaInvitationClaimRequest: UmaInvitationClaimRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun invitationCode(): String? = invitationCode

    fun umaInvitationClaimRequest(): UmaInvitationClaimRequest = umaInvitationClaimRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        umaInvitationClaimRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvitationClaimParams].
         *
         * The following fields are required:
         * ```kotlin
         * .umaInvitationClaimRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvitationClaimParams]. */
    class Builder internal constructor() {

        private var invitationCode: String? = null
        private var umaInvitationClaimRequest: UmaInvitationClaimRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invitationClaimParams: InvitationClaimParams) = apply {
            invitationCode = invitationClaimParams.invitationCode
            umaInvitationClaimRequest = invitationClaimParams.umaInvitationClaimRequest
            additionalHeaders = invitationClaimParams.additionalHeaders.toBuilder()
            additionalQueryParams = invitationClaimParams.additionalQueryParams.toBuilder()
        }

        fun invitationCode(invitationCode: String?) = apply { this.invitationCode = invitationCode }

        fun umaInvitationClaimRequest(umaInvitationClaimRequest: UmaInvitationClaimRequest) =
            apply {
                this.umaInvitationClaimRequest = umaInvitationClaimRequest
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
         * Returns an immutable instance of [InvitationClaimParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .umaInvitationClaimRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvitationClaimParams =
            InvitationClaimParams(
                invitationCode,
                checkRequired("umaInvitationClaimRequest", umaInvitationClaimRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UmaInvitationClaimRequest = umaInvitationClaimRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> invitationCode ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationClaimParams &&
            invitationCode == other.invitationCode &&
            umaInvitationClaimRequest == other.umaInvitationClaimRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            invitationCode,
            umaInvitationClaimRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvitationClaimParams{invitationCode=$invitationCode, umaInvitationClaimRequest=$umaInvitationClaimRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
