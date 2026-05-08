// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.credentials.AuthMethod
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialListResponse
import com.lightspark.grid.models.auth.credentials.CredentialResendChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialResendChallengeResponse
import com.lightspark.grid.models.auth.credentials.CredentialRevokeParams
import com.lightspark.grid.models.auth.credentials.CredentialRevokeResponse
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyResponse

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
interface CredentialServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CredentialServiceAsync

    /**
     * Register an authentication credential for an Embedded Wallet customer.
     *
     * Embedded Wallet internal accounts are initialized with an `EMAIL_OTP` credential tied to the
     * customer email on the account. Use this endpoint to add another credential (`OAUTH` or
     * `PASSKEY`), or to add `EMAIL_OTP` back after it has been removed. Only one `EMAIL_OTP`
     * credential and one `PASSKEY` credential are supported per internal account.
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
    suspend fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethod

    /** @see create */
    suspend fun create(
        authCredentialCreateRequest: CredentialCreateParams.AuthCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethod =
        create(
            CredentialCreateParams.builder()
                .authCredentialCreateRequest(authCredentialCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        emailOtp:
            CredentialCreateParams.AuthCredentialCreateRequest.EmailOtpCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethod =
        create(
            CredentialCreateParams.AuthCredentialCreateRequest.ofEmailOtp(emailOtp),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        oauth: CredentialCreateParams.AuthCredentialCreateRequest.OAuthCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethod =
        create(CredentialCreateParams.AuthCredentialCreateRequest.ofOAuth(oauth), requestOptions)

    /** @see create */
    suspend fun create(
        passkey: CredentialCreateParams.AuthCredentialCreateRequest.PasskeyCredentialCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthMethod =
        create(
            CredentialCreateParams.AuthCredentialCreateRequest.ofPasskey(passkey),
            requestOptions,
        )

    /**
     * Retrieve all authentication credentials registered on an Embedded Wallet internal account.
     *
     * The response is not paginated: an internal account is expected to have a small, bounded
     * number of credentials (typically 1–5), so all results are returned inline. Additional
     * per-credential detail (such as active session expiry) is available on `GET /auth/sessions`.
     */
    suspend fun list(
        params: CredentialListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialListResponse

    /**
     * Re-issue the challenge for an existing authentication credential.
     *
     * For `EMAIL_OTP` credentials, this triggers a new one-time password email to the address on
     * file. The response is a plain `AuthMethod`; there is no challenge body to surface because the
     * OTP is delivered out-of-band via email. After the user receives the new OTP, call `POST
     * /auth/credentials/{id}/verify` to complete verification and issue a session.
     *
     * `OAUTH` credentials do not have a challenge step. To authenticate or reauthenticate an OAuth
     * credential, call `POST /auth/credentials/{id}/verify` with a fresh OIDC token and a
     * `clientPublicKey`.
     *
     * For `PASSKEY` credentials, this issues a fresh Grid-generated WebAuthn challenge for
     * reauthentication. The request body must carry the client's ephemeral `clientPublicKey` so
     * Grid can bake it into the Turnkey session-creation payload the returned challenge is computed
     * from — this seals the resulting session signing key to the client. The response is a
     * `PasskeyAuthChallenge` — the base `AuthMethod` fields plus the new `challenge`, `requestId`,
     * and `expiresAt`. The client passes the `challenge` into `navigator.credentials.get()` and
     * submits the resulting assertion to `POST /auth/credentials/{id}/verify` with `Request-Id:
     * <requestId>` to receive a session.
     */
    suspend fun resendChallenge(
        id: String,
        params: CredentialResendChallengeParams = CredentialResendChallengeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialResendChallengeResponse =
        resendChallenge(params.toBuilder().id(id).build(), requestOptions)

    /** @see resendChallenge */
    suspend fun resendChallenge(
        params: CredentialResendChallengeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialResendChallengeResponse

    /** @see resendChallenge */
    suspend fun resendChallenge(
        id: String,
        requestOptions: RequestOptions,
    ): CredentialResendChallengeResponse =
        resendChallenge(id, CredentialResendChallengeParams.none(), requestOptions)

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
    suspend fun revoke(
        id: String,
        params: CredentialRevokeParams = CredentialRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialRevokeResponse = revoke(params.toBuilder().id(id).build(), requestOptions)

    /** @see revoke */
    suspend fun revoke(
        params: CredentialRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialRevokeResponse

    /** @see revoke */
    suspend fun revoke(id: String, requestOptions: RequestOptions): CredentialRevokeResponse =
        revoke(id, CredentialRevokeParams.none(), requestOptions)

    /**
     * Complete the verification step for a previously created authentication credential and issue a
     * session signing key.
     *
     * For `EMAIL_OTP` credentials, supply the one-time password that was emailed to the user along
     * with a client-generated public key. For `OAUTH` credentials, supply a fresh OIDC token (`iat`
     * must be less than 60 seconds before the request) along with the client-generated public key;
     * this is also the reauthentication path after a prior session expired. For `PASSKEY`
     * credentials, the client completes a WebAuthn assertion (`navigator.credentials.get()`)
     * against the Grid-issued `challenge` returned from either `POST /auth/credentials` (first
     * authentication) or `POST /auth/credentials/{id}/challenge` (reauthentication), and submits
     * the resulting `assertion` along with the client-generated public key. The `requestId` that
     * accompanied the challenge must be echoed in the `Request-Id` header so Grid can correlate the
     * assertion with the pending challenge; Grid verifies the WebAuthn signature against the stored
     * credential before issuing the session.
     *
     * On success, the response contains an `encryptedSessionSigningKey` that is encrypted to the
     * supplied `clientPublicKey`, along with an `expiresAt` timestamp marking when the session
     * expires. The `clientPublicKey` is ephemeral and one-time-use per verification request.
     */
    suspend fun verify(
        id: String,
        params: CredentialVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialVerifyResponse = verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see verify */
    suspend fun verify(
        params: CredentialVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialVerifyResponse

    /**
     * A view of [CredentialServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CredentialServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/credentials`, but is otherwise the same as
         * [CredentialServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethod>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            authCredentialCreateRequest: CredentialCreateParams.AuthCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethod> =
            create(
                CredentialCreateParams.builder()
                    .authCredentialCreateRequest(authCredentialCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            emailOtp:
                CredentialCreateParams.AuthCredentialCreateRequest.EmailOtpCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethod> =
            create(
                CredentialCreateParams.AuthCredentialCreateRequest.ofEmailOtp(emailOtp),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            oauth: CredentialCreateParams.AuthCredentialCreateRequest.OAuthCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethod> =
            create(
                CredentialCreateParams.AuthCredentialCreateRequest.ofOAuth(oauth),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            passkey:
                CredentialCreateParams.AuthCredentialCreateRequest.PasskeyCredentialCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthMethod> =
            create(
                CredentialCreateParams.AuthCredentialCreateRequest.ofPasskey(passkey),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /auth/credentials`, but is otherwise the same as
         * [CredentialServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CredentialListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialListResponse>

        /**
         * Returns a raw HTTP response for `post /auth/credentials/{id}/challenge`, but is otherwise
         * the same as [CredentialServiceAsync.resendChallenge].
         */
        @MustBeClosed
        suspend fun resendChallenge(
            id: String,
            params: CredentialResendChallengeParams = CredentialResendChallengeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialResendChallengeResponse> =
            resendChallenge(params.toBuilder().id(id).build(), requestOptions)

        /** @see resendChallenge */
        @MustBeClosed
        suspend fun resendChallenge(
            params: CredentialResendChallengeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialResendChallengeResponse>

        /** @see resendChallenge */
        @MustBeClosed
        suspend fun resendChallenge(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialResendChallengeResponse> =
            resendChallenge(id, CredentialResendChallengeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /auth/credentials/{id}`, but is otherwise the
         * same as [CredentialServiceAsync.revoke].
         */
        @MustBeClosed
        suspend fun revoke(
            id: String,
            params: CredentialRevokeParams = CredentialRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialRevokeResponse> =
            revoke(params.toBuilder().id(id).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        suspend fun revoke(
            params: CredentialRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialRevokeResponse>

        /** @see revoke */
        @MustBeClosed
        suspend fun revoke(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialRevokeResponse> =
            revoke(id, CredentialRevokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/credentials/{id}/verify`, but is otherwise
         * the same as [CredentialServiceAsync.verify].
         */
        @MustBeClosed
        suspend fun verify(
            id: String,
            params: CredentialVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialVerifyResponse> =
            verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        suspend fun verify(
            params: CredentialVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialVerifyResponse>
    }
}
