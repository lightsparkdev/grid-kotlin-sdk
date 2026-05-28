// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Complete the verification step for a previously created authentication credential and issue a
 * session signing key.
 *
 * For `EMAIL_OTP` credentials, supply the one-time password that was emailed to the user along with
 * a client-generated public key. For `OAUTH` credentials, supply a fresh OIDC token (`iat` must be
 * less than 60 seconds before the request) along with the client-generated public key; this is also
 * the reauthentication path after a prior session expired. The token identity (`iss`, `aud`, and
 * `sub`) must match the OAuth credential being verified. In sandbox, the token's `nonce` must equal
 * `sha256(clientPublicKey)`. For `PASSKEY` credentials, the client completes a WebAuthn assertion
 * (`navigator.credentials.get()`) against the Grid-issued `challenge` returned from `POST
 * /auth/credentials/{id}/challenge`, and submits the resulting `assertion` with the `Request-Id`
 * header. The `clientPublicKey` for `PASSKEY` credentials is supplied on the challenge call, where
 * it is bound into the pending session-creation request.
 *
 * On success, the response contains an `encryptedSessionSigningKey` that is encrypted to the
 * supplied `clientPublicKey`, along with an `expiresAt` timestamp marking when the session expires.
 * The `clientPublicKey` is ephemeral and one-time-use per verification request.
 */
class CredentialVerifyParams
private constructor(
    private val id: String?,
    private val requestId: String?,
    private val authCredentialVerifyRequest: AuthCredentialVerifyRequestOneOf,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun requestId(): String? = requestId

    fun authCredentialVerifyRequest(): AuthCredentialVerifyRequestOneOf =
        authCredentialVerifyRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CredentialVerifyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .authCredentialVerifyRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialVerifyParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var requestId: String? = null
        private var authCredentialVerifyRequest: AuthCredentialVerifyRequestOneOf? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialVerifyParams: CredentialVerifyParams) = apply {
            id = credentialVerifyParams.id
            requestId = credentialVerifyParams.requestId
            authCredentialVerifyRequest = credentialVerifyParams.authCredentialVerifyRequest
            additionalHeaders = credentialVerifyParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialVerifyParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        fun authCredentialVerifyRequest(
            authCredentialVerifyRequest: AuthCredentialVerifyRequestOneOf
        ) = apply { this.authCredentialVerifyRequest = authCredentialVerifyRequest }

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
         * Returns an immutable instance of [CredentialVerifyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .authCredentialVerifyRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialVerifyParams =
            CredentialVerifyParams(
                id,
                requestId,
                checkRequired("authCredentialVerifyRequest", authCredentialVerifyRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AuthCredentialVerifyRequestOneOf = authCredentialVerifyRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                requestId?.let { put("Request-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialVerifyParams &&
            id == other.id &&
            requestId == other.requestId &&
            authCredentialVerifyRequest == other.authCredentialVerifyRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            requestId,
            authCredentialVerifyRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CredentialVerifyParams{id=$id, requestId=$requestId, authCredentialVerifyRequest=$authCredentialVerifyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
