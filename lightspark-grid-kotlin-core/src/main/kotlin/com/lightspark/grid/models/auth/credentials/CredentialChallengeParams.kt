// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.immutableEmptyMap
import java.util.Objects

/**
 * Re-issue the challenge for an existing authentication credential.
 *
 * For `EMAIL_OTP` credentials, this triggers a new one-time password email to the address on file.
 * The response is a plain `AuthMethod`; there is no challenge body to surface because the OTP is
 * delivered out-of-band via email. After the user receives the new OTP, call `POST
 * /auth/credentials/{id}/verify` to complete verification and issue a session.
 *
 * `OAUTH` credentials do not have a challenge step. To authenticate or reauthenticate an OAuth
 * credential, call `POST /auth/credentials/{id}/verify` with a fresh OIDC token and a
 * `clientPublicKey`.
 *
 * For `PASSKEY` credentials, this issues a fresh Grid-generated WebAuthn challenge for
 * reauthentication. The request body must carry the client's ephemeral `clientPublicKey` so Grid
 * can bake it into the Turnkey session-creation payload the returned challenge is computed from —
 * this seals the resulting session signing key to the client. The response is a
 * `PasskeyAuthChallenge` — the passkey auth method fields plus the WebAuthn `credentialId`, new
 * `challenge`, `requestId`, and `expiresAt`. The client passes `credentialId` as
 * `allowCredentials[].id` and `challenge` as the WebAuthn challenge in
 * `navigator.credentials.get()`, then submits the resulting assertion to `POST
 * /auth/credentials/{id}/verify` with `Request-Id: <requestId>` to receive a session.
 */
class CredentialChallengeParams
private constructor(
    private val id: String?,
    private val authCredentialChallengeRequest: AuthCredentialChallengeRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Request body for `POST /auth/credentials/{id}/challenge`. Required when re-challenging a
     * `PASSKEY` credential — must carry `clientPublicKey` so Grid can bake it into the Turnkey
     * session-creation payload the returned challenge is computed from. Ignored for `EMAIL_OTP`,
     * where the credential type alone is sufficient because the OTP is delivered out-of-band. OAuth
     * credentials do not use this endpoint; authenticate or reauthenticate them with `POST
     * /auth/credentials/{id}/verify`.
     */
    fun authCredentialChallengeRequest(): AuthCredentialChallengeRequest? =
        authCredentialChallengeRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        authCredentialChallengeRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CredentialChallengeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [CredentialChallengeParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialChallengeParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var authCredentialChallengeRequest: AuthCredentialChallengeRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialChallengeParams: CredentialChallengeParams) = apply {
            id = credentialChallengeParams.id
            authCredentialChallengeRequest =
                credentialChallengeParams.authCredentialChallengeRequest
            additionalHeaders = credentialChallengeParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialChallengeParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Request body for `POST /auth/credentials/{id}/challenge`. Required when re-challenging a
         * `PASSKEY` credential — must carry `clientPublicKey` so Grid can bake it into the Turnkey
         * session-creation payload the returned challenge is computed from. Ignored for
         * `EMAIL_OTP`, where the credential type alone is sufficient because the OTP is delivered
         * out-of-band. OAuth credentials do not use this endpoint; authenticate or reauthenticate
         * them with `POST /auth/credentials/{id}/verify`.
         */
        fun authCredentialChallengeRequest(
            authCredentialChallengeRequest: AuthCredentialChallengeRequest?
        ) = apply { this.authCredentialChallengeRequest = authCredentialChallengeRequest }

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
         * Returns an immutable instance of [CredentialChallengeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CredentialChallengeParams =
            CredentialChallengeParams(
                id,
                authCredentialChallengeRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AuthCredentialChallengeRequest? = authCredentialChallengeRequest

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

        return other is CredentialChallengeParams &&
            id == other.id &&
            authCredentialChallengeRequest == other.authCredentialChallengeRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, authCredentialChallengeRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CredentialChallengeParams{id=$id, authCredentialChallengeRequest=$authCredentialChallengeRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
