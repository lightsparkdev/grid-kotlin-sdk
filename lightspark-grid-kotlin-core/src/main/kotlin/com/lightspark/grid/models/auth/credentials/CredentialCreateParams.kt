// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Register an authentication credential for an Embedded Wallet customer.
 *
 * Embedded Wallet internal accounts are initialized with an `EMAIL_OTP` credential tied to the
 * customer email on the account. Use this endpoint to add another credential (`OAUTH` or
 * `PASSKEY`), or to add `EMAIL_OTP` back after it has been removed. Only one `EMAIL_OTP` credential
 * is supported per internal account; multiple distinct `PASSKEY` credentials may be registered.
 *
 * Adding a credential requires a signature from an existing verified credential on the same
 * account. Call this endpoint with the new credential's details to receive `202` with
 * `payloadToSign` and `requestId`. Use the session API keypair of an existing verified credential
 * (decrypted client-side from its `encryptedSessionSigningKey`) to build an API-key stamp over
 * `payloadToSign`, then retry the same request with that full stamp as the `Grid-Wallet-Signature`
 * header and the `requestId` echoed back as the `Request-Id` header. The signed retry returns `201`
 * with the created `AuthMethod`. For `EMAIL_OTP`, the OTP email is triggered on the signed retry,
 * and the credential must then be activated via `POST /auth/credentials/{id}/verify`.
 */
class CredentialCreateParams
private constructor(
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val authCredentialCreateRequest: AuthCredentialCreateRequestOneOf,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    fun authCredentialCreateRequest(): AuthCredentialCreateRequestOneOf =
        authCredentialCreateRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CredentialCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .authCredentialCreateRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialCreateParams]. */
    class Builder internal constructor() {

        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var authCredentialCreateRequest: AuthCredentialCreateRequestOneOf? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialCreateParams: CredentialCreateParams) = apply {
            gridWalletSignature = credentialCreateParams.gridWalletSignature
            requestId = credentialCreateParams.requestId
            authCredentialCreateRequest = credentialCreateParams.authCredentialCreateRequest
            additionalHeaders = credentialCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialCreateParams.additionalQueryParams.toBuilder()
        }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        fun authCredentialCreateRequest(
            authCredentialCreateRequest: AuthCredentialCreateRequestOneOf
        ) = apply { this.authCredentialCreateRequest = authCredentialCreateRequest }

        /**
         * Alias for calling [authCredentialCreateRequest] with
         * `AuthCredentialCreateRequestOneOf.ofEmailOtp(emailOtp)`.
         */
        fun authCredentialCreateRequest(emailOtp: EmailOtpCredentialCreateRequest) =
            authCredentialCreateRequest(AuthCredentialCreateRequestOneOf.ofEmailOtp(emailOtp))

        /**
         * Alias for calling [authCredentialCreateRequest] with the following:
         * ```kotlin
         * EmailOtpCredentialCreateRequest.builder()
         *     .type(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
         *     .accountId(accountId)
         *     .build()
         * ```
         */
        fun emailOtpAuthCredentialCreateRequest(accountId: String) =
            authCredentialCreateRequest(
                EmailOtpCredentialCreateRequest.builder()
                    .type(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
                    .accountId(accountId)
                    .build()
            )

        /**
         * Alias for calling [authCredentialCreateRequest] with
         * `AuthCredentialCreateRequestOneOf.ofOAuth(oauth)`.
         */
        fun authCredentialCreateRequest(oauth: OAuthCredentialCreateRequest) =
            authCredentialCreateRequest(AuthCredentialCreateRequestOneOf.ofOAuth(oauth))

        /**
         * Alias for calling [authCredentialCreateRequest] with
         * `AuthCredentialCreateRequestOneOf.ofPasskey(passkey)`.
         */
        fun authCredentialCreateRequest(passkey: PasskeyCredentialCreateRequest) =
            authCredentialCreateRequest(AuthCredentialCreateRequestOneOf.ofPasskey(passkey))

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
         * Returns an immutable instance of [CredentialCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .authCredentialCreateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialCreateParams =
            CredentialCreateParams(
                gridWalletSignature,
                requestId,
                checkRequired("authCredentialCreateRequest", authCredentialCreateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AuthCredentialCreateRequestOneOf = authCredentialCreateRequest

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

        return other is CredentialCreateParams &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            authCredentialCreateRequest == other.authCredentialCreateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            gridWalletSignature,
            requestId,
            authCredentialCreateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CredentialCreateParams{gridWalletSignature=$gridWalletSignature, requestId=$requestId, authCredentialCreateRequest=$authCredentialCreateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
