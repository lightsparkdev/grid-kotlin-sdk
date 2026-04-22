// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialCreateResponse
import com.lightspark.grid.models.auth.credentials.CredentialResendChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialResendChallengeResponse
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
     * **First credential on an internal account**
     *
     * If the target internal account does not yet have any authentication credential registered,
     * call this endpoint with the credential details. The response is `201` with the created
     * `AuthMethod`. For `EMAIL_OTP` credentials, this call also triggers a one-time password email
     * to the address on the customer record tied to the internal account; the credential must be
     * activated via `POST /auth/credentials/{id}/verify` before it can sign requests.
     *
     * **Adding an additional credential**
     *
     * Registering an additional credential against an internal account that already has one
     * requires a signature from an existing verified credential. Call this endpoint with the new
     * credential's details; if an existing credential is already registered on the internal account
     * the response is `202` with a `payloadToSign` and a `requestId`. Sign the payload with the
     * session private key of an existing verified credential on the same internal account
     * (decrypted client-side from its `encryptedSessionSigningKey`) and retry the same request with
     * the signature supplied as the `Grid-Wallet-Signature` header and the `requestId` echoed back
     * as the `Request-Id` header. The signed retry returns `201` with the created `AuthMethod`. For
     * `EMAIL_OTP`, the OTP email is triggered on the signed retry, and the credential must then be
     * activated via `POST /auth/credentials/{id}/verify`.
     */
    suspend fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialCreateResponse

    /**
     * Re-issue the challenge for an existing authentication credential.
     *
     * For `EMAIL_OTP` credentials, this triggers a new one-time password email to the address on
     * file. After the user receives the new OTP, call `POST /auth/credentials/{id}/verify` to
     * complete verification and issue a session.
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
     * Complete the verification step for a previously created authentication credential and issue a
     * session signing key.
     *
     * For `EMAIL_OTP` credentials, supply the one-time password that was emailed to the user along
     * with a client-generated public key. On success, the response contains an
     * `encryptedSessionSigningKey` that is encrypted to the supplied `clientPublicKey`, along with
     * an `expiresAt` timestamp marking when the session expires. The `clientPublicKey` is ephemeral
     * and one-time-use per verification request.
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
        ): HttpResponseFor<CredentialCreateResponse>

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
