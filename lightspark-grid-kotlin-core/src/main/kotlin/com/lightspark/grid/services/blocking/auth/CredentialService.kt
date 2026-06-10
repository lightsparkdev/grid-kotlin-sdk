// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.credentials.AuthCredentialCreateRequestOneOf
import com.lightspark.grid.models.auth.credentials.AuthCredentialListResponse
import com.lightspark.grid.models.auth.credentials.AuthCredentialResponseOneOf
import com.lightspark.grid.models.auth.credentials.AuthMethodResponse
import com.lightspark.grid.models.auth.credentials.AuthSession
import com.lightspark.grid.models.auth.credentials.AuthSignedRequestChallenge
import com.lightspark.grid.models.auth.credentials.CredentialChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialDeleteParams
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import com.lightspark.grid.models.auth.credentials.EmailOtpCredentialCreateRequest
import com.lightspark.grid.models.auth.credentials.OAuthCredentialCreateRequest
import com.lightspark.grid.models.auth.credentials.PasskeyCredentialCreateRequest

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
interface CredentialService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CredentialService

    /**
     * Register an authentication credential for an Embedded Wallet customer.
     *
     * Embedded Wallet internal accounts are initialized with an `EMAIL_OTP` credential tied to the
     * customer email on the account. Use this endpoint to add another credential (`OAUTH` or
     * `PASSKEY`), or to add `EMAIL_OTP` back after it has been removed. Only one `EMAIL_OTP`
     * credential is supported per internal account; multiple distinct `PASSKEY` credentials may be
     * registered.
     *
     * Adding a credential requires a signature from an existing verified credential on the same
     * account. Call this endpoint with the new credential's details to receive `202` with
     * `payloadToSign` and `requestId`. Use the session API keypair of an existing verified
     * credential (decrypted client-side from its `encryptedSessionSigningKey`) to build an API-key
     * stamp over `payloadToSign`, then retry the same request with that full stamp as the
     * `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header.
     * The signed retry returns `201` with the created `AuthMethod`. For `EMAIL_OTP`, the OTP email
     * is triggered on the signed retry, and the credential must then be activated via `POST
     * /auth/credentials/{id}/verify`.
     */
    fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethodResponse

    /** @see create */
    fun create(
        authCredentialCreateRequest: AuthCredentialCreateRequestOneOf,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethodResponse =
        create(
            CredentialCreateParams.builder()
                .authCredentialCreateRequest(authCredentialCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethodResponse =
        create(
            AuthCredentialCreateRequestOneOf.ofEmailOtpCredentialCreateRequest(
                emailOtpCredentialCreateRequest
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        oauthCredentialCreateRequest: OAuthCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethodResponse =
        create(
            AuthCredentialCreateRequestOneOf.ofOAuthCredentialCreateRequest(
                oauthCredentialCreateRequest
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethodResponse =
        create(
            AuthCredentialCreateRequestOneOf.ofPasskeyCredentialCreateRequest(
                passkeyCredentialCreateRequest
            ),
            requestOptions,
        )

    /**
     * Retrieve all authentication credentials registered on an Embedded Wallet internal account.
     *
     * The response is not paginated: an internal account is expected to have a small, bounded
     * number of credentials (typically 1–5), so all results are returned inline. Additional
     * per-credential detail (such as active session expiry) is available on `GET /auth/sessions`.
     */
    fun list(
        params: CredentialListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthCredentialListResponse

    /**
     * Revoke an authentication credential on an Embedded Wallet internal account.
     *
     * Revocation is a two-step flow because it must be authorized by a session on a *different*
     * credential on the same internal account:
     * 1. Call `DELETE /auth/credentials/{id}` with no headers. The response is `202` with a
     *    `payloadToSign`, `requestId`, and `expiresAt`.
     * 2. Use the session API keypair of an existing verified credential on the same internal
     *    account — other than the one being revoked — to build an API-key stamp over
     *    `payloadToSign`, then retry the same `DELETE` request with that full stamp as the
     *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header.
     *    The signed retry returns `204`.
     *
     * The account must retain at least one authentication credential; an account with only a single
     * credential cannot use this endpoint to revoke it.
     */
    fun delete(
        id: String,
        params: CredentialDeleteParams = CredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSignedRequestChallenge = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: CredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSignedRequestChallenge

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AuthSignedRequestChallenge =
        delete(id, CredentialDeleteParams.none(), requestOptions)

    /**
     * Re-issue the challenge for an existing authentication credential.
     *
     * For `EMAIL_OTP` credentials, this triggers a new one-time password email to the address on
     * file and returns a fresh `otpEncryptionTargetBundle` for the client to HPKE-encrypt the OTP
     * attempt against. After the user receives the new OTP, build the `encryptedOtpBundle` under
     * the new target bundle and call `POST /auth/credentials/{id}/verify` to begin the secure OTP
     * login flow.
     *
     * `OAUTH` credentials do not have a challenge step. To authenticate or reauthenticate an OAuth
     * credential, call `POST /auth/credentials/{id}/verify` with a fresh OIDC token and a
     * `clientPublicKey`.
     *
     * For `PASSKEY` credentials, this issues a fresh Grid reauthentication challenge. The request
     * body must carry the client's ephemeral `clientPublicKey` so Grid can bake it into the Turnkey
     * session-creation payload the returned challenge is computed from — this seals the resulting
     * session signing key to the client. The response is a `PasskeyAuthChallenge` — the passkey
     * auth method fields plus the WebAuthn `credentialId`, new `challenge`, `requestId`, and
     * `expiresAt`. The `challenge` value is the lowercase hex-encoded SHA-256 digest of the
     * canonical Turnkey session-creation body, not a base64url string. The client base64url-decodes
     * `credentialId` for `allowCredentials[].id` and UTF-8 encodes `challenge` (for example, `new
     * TextEncoder().encode(challenge)`) as the WebAuthn challenge in `navigator.credentials.get()`,
     * then submits the resulting assertion to `POST /auth/credentials/{id}/verify` with
     * `Request-Id: <requestId>` to receive a session.
     */
    fun challenge(
        id: String,
        params: CredentialChallengeParams = CredentialChallengeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthCredentialResponseOneOf = challenge(params.toBuilder().id(id).build(), requestOptions)

    /** @see challenge */
    fun challenge(
        params: CredentialChallengeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthCredentialResponseOneOf

    /** @see challenge */
    fun challenge(id: String, requestOptions: RequestOptions): AuthCredentialResponseOneOf =
        challenge(id, CredentialChallengeParams.none(), requestOptions)

    /**
     * Complete the verification step for a previously created authentication credential and issue a
     * session.
     *
     * For `EMAIL_OTP` credentials, submit the `encryptedOtpBundle` produced by HPKE-encrypting
     * `{otp_code, public_key}` under the `otpEncryptionTargetBundle` returned from registration
     * when present, or from `POST /auth/credentials/{id}/challenge` when registration omitted it or
     * the OTP must be reissued. The server is a pass-through and never sees the plaintext OTP code.
     * On success the response is `202` with a `payloadToSign` carrying the `verificationToken`
     * bound to the client's TEK public key — sign that token with the matching TEK private key,
     * then retry the same request with the full stamp in `Grid-Wallet-Signature` and the
     * `requestId` echoed in `Request-Id`. The signed retry returns `200` with the issued
     * `AuthSession`. The TEK public key becomes the session API key on successful completion. In
     * sandbox mode, the EMAIL_OTP flow runs real HPKE end-to-end against a sandbox enclave keypair
     * — clients build a real `encryptedOtpBundle` against the sandbox `otpEncryptionTargetBundle`
     * and sign a real `verificationToken` with their TEK keypair. The only sandbox shortcut is the
     * magic OTP code (`"000000"`) the user "receives" instead of a real email delivery.
     *
     * For `OAUTH` credentials, supply a fresh OIDC token (`iat` must be less than 60 seconds before
     * the request) along with the client-generated public key; this is also the reauthentication
     * path after a prior session expired. The token identity (`iss`, `aud`, and `sub`) must match
     * the OAuth credential being verified. In sandbox, the token's `nonce` must equal
     * `sha256(clientPublicKey)`. For `PASSKEY` credentials, the client completes a WebAuthn
     * assertion (`navigator.credentials.get()`) against the Grid-issued `challenge` returned from
     * `POST /auth/credentials/{id}/challenge`, and submits the resulting `assertion` with the
     * `Request-Id` header. The `clientPublicKey` for `PASSKEY` credentials is supplied on the
     * challenge call, where it is bound into the pending session-creation request.
     *
     * On success for `OAUTH` and `PASSKEY`, and on the signed retry for `EMAIL_OTP`, the response
     * contains an `AuthSession`. For `OAUTH` and `PASSKEY` the session signing key is delivered as
     * `encryptedSessionSigningKey` (HPKE-sealed to the supplied `clientPublicKey`); for `EMAIL_OTP`
     * the client already holds the session signing key (the TEK private key it generated) and that
     * field is omitted from the response. The `expiresAt` timestamp marks when the session expires.
     */
    fun verify(
        id: String,
        params: CredentialVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSession = verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see verify */
    fun verify(
        params: CredentialVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSession

    /** A view of [CredentialService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CredentialService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/credentials`, but is otherwise the same as
         * [CredentialService.create].
         */
        @MustBeClosed
        fun create(
            params: CredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethodResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            authCredentialCreateRequest: AuthCredentialCreateRequestOneOf,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethodResponse> =
            create(
                CredentialCreateParams.builder()
                    .authCredentialCreateRequest(authCredentialCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethodResponse> =
            create(
                AuthCredentialCreateRequestOneOf.ofEmailOtpCredentialCreateRequest(
                    emailOtpCredentialCreateRequest
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            oauthCredentialCreateRequest: OAuthCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethodResponse> =
            create(
                AuthCredentialCreateRequestOneOf.ofOAuthCredentialCreateRequest(
                    oauthCredentialCreateRequest
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethodResponse> =
            create(
                AuthCredentialCreateRequestOneOf.ofPasskeyCredentialCreateRequest(
                    passkeyCredentialCreateRequest
                ),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /auth/credentials`, but is otherwise the same as
         * [CredentialService.list].
         */
        @MustBeClosed
        fun list(
            params: CredentialListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthCredentialListResponse>

        /**
         * Returns a raw HTTP response for `delete /auth/credentials/{id}`, but is otherwise the
         * same as [CredentialService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: CredentialDeleteParams = CredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSignedRequestChallenge> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSignedRequestChallenge>

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthSignedRequestChallenge> =
            delete(id, CredentialDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/credentials/{id}/challenge`, but is otherwise
         * the same as [CredentialService.challenge].
         */
        @MustBeClosed
        fun challenge(
            id: String,
            params: CredentialChallengeParams = CredentialChallengeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthCredentialResponseOneOf> =
            challenge(params.toBuilder().id(id).build(), requestOptions)

        /** @see challenge */
        @MustBeClosed
        fun challenge(
            params: CredentialChallengeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthCredentialResponseOneOf>

        /** @see challenge */
        @MustBeClosed
        fun challenge(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthCredentialResponseOneOf> =
            challenge(id, CredentialChallengeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/credentials/{id}/verify`, but is otherwise
         * the same as [CredentialService.verify].
         */
        @MustBeClosed
        fun verify(
            id: String,
            params: CredentialVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSession> = verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: CredentialVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSession>
    }
}
