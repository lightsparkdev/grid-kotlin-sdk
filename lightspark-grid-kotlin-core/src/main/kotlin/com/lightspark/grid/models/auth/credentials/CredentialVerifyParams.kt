// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Complete the verification step for a previously created authentication credential and issue a
 * session.
 *
 * For `EMAIL_OTP` and `SMS_OTP` credentials, submit the `encryptedOtpBundle` produced by
 * HPKE-encrypting `{otp_code, public_key}` under the `otpEncryptionTargetBundle` returned from
 * registration when present, or from `POST /auth/credentials/{id}/challenge` when registration
 * omitted it or the OTP must be reissued. The server is a pass-through and never sees the plaintext
 * OTP code. On success the response is `202` with a `payloadToSign` carrying the
 * `verificationToken` bound to the client's TEK public key — sign that token with the matching TEK
 * private key, then retry the same request with the full stamp in `Grid-Wallet-Signature` and the
 * `requestId` echoed in `Request-Id`. The signed retry returns `200` with the issued `AuthSession`.
 * The TEK public key becomes the session API key on successful completion. In sandbox mode, the OTP
 * flow runs real HPKE end-to-end against a sandbox enclave keypair — clients build a real
 * `encryptedOtpBundle` against the sandbox `otpEncryptionTargetBundle` and sign a real
 * `verificationToken` with their TEK keypair. The only sandbox shortcut is the magic OTP code
 * (`"000000"`) the user "receives" instead of a real email or SMS delivery.
 *
 * For `OAUTH` credentials, supply a fresh OIDC token (`iat` must be less than 60 seconds before the
 * request) along with the client-generated public key; this is also the reauthentication path after
 * a prior session expired. The token identity (`iss`, `aud`, and `sub`) must match the OAuth
 * credential being verified. In sandbox, the token's `nonce` must equal `sha256(clientPublicKey)`.
 * For `PASSKEY` credentials, the client completes a WebAuthn assertion
 * (`navigator.credentials.get()`) against the Grid-issued `challenge` returned from `POST
 * /auth/credentials/{id}/challenge`, and submits the resulting `assertion` with the `Request-Id`
 * header. The `clientPublicKey` for `PASSKEY` credentials is supplied on the challenge call, where
 * it is bound into the pending session-creation request.
 *
 * On success for `OAUTH` and `PASSKEY`, and on the signed retry for OTP credentials, the response
 * contains an `AuthSession`. For `OAUTH` and `PASSKEY` the session signing key is delivered as
 * `encryptedSessionSigningKey` (HPKE-sealed to the supplied `clientPublicKey`); for OTP credentials
 * the client already holds the session signing key (the TEK private key it generated) and that
 * field is omitted from the response. The `expiresAt` timestamp marks when the session expires.
 */
class CredentialVerifyParams
private constructor(
    private val id: String?,
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val authCredentialVerifyRequest: AuthCredentialVerifyRequestOneOf,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
     * HPKE-encrypts the OTP code (together with its public key) under the
     * `otpEncryptionTargetBundle` returned from registration or `POST
     * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
     * `payloadToSign` carrying a `verificationToken` bound to the client's public key. The client
     * signs that token with the matching private key and retries this request with
     * `Grid-Wallet-Signature` + `Request-Id` headers to obtain the session. Plaintext OTP codes are
     * never sent over the wire.
     */
    fun authCredentialVerifyRequest(): AuthCredentialVerifyRequestOneOf =
        authCredentialVerifyRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        authCredentialVerifyRequest._additionalProperties()

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
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var authCredentialVerifyRequest: AuthCredentialVerifyRequestOneOf? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialVerifyParams: CredentialVerifyParams) = apply {
            id = credentialVerifyParams.id
            gridWalletSignature = credentialVerifyParams.gridWalletSignature
            requestId = credentialVerifyParams.requestId
            authCredentialVerifyRequest = credentialVerifyParams.authCredentialVerifyRequest
            additionalHeaders = credentialVerifyParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialVerifyParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
         * HPKE-encrypts the OTP code (together with its public key) under the
         * `otpEncryptionTargetBundle` returned from registration or `POST
         * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
         * `payloadToSign` carrying a `verificationToken` bound to the client's public key. The
         * client signs that token with the matching private key and retries this request with
         * `Grid-Wallet-Signature` + `Request-Id` headers to obtain the session. Plaintext OTP codes
         * are never sent over the wire.
         */
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
                gridWalletSignature,
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

        return other is CredentialVerifyParams &&
            id == other.id &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            authCredentialVerifyRequest == other.authCredentialVerifyRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            gridWalletSignature,
            requestId,
            authCredentialVerifyRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CredentialVerifyParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, authCredentialVerifyRequest=$authCredentialVerifyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
