// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.credentials.AuthSignedRequestChallenge
import com.lightspark.grid.models.auth.sessions.AuthSession
import com.lightspark.grid.models.auth.sessions.SessionDeleteParams
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionListResponse
import com.lightspark.grid.models.auth.sessions.SessionRefreshParams

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SessionService

    /**
     * Retrieve all active authentication sessions on an Embedded Wallet internal account. A session
     * is created each time a credential is verified via `POST /auth/credentials/{id}/verify`, and
     * remains active until its `expiresAt` passes or it is revoked via `DELETE
     * /auth/sessions/{id}`.
     *
     * The response is not paginated: an internal account is expected to have a small, bounded
     * number of concurrent sessions (one per signed-in device, typically 1–4), so all results are
     * returned inline.
     */
    fun list(
        params: SessionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionListResponse

    /**
     * Revoke an authentication session on an Embedded Wallet internal account. Revocation is a
     * two-step signed-retry flow:
     * 1. Call `DELETE /auth/sessions/{id}` with no headers. The response is `202` with a
     *    `payloadToSign`, `requestId`, and `expiresAt`.
     * 2. Use the session API keypair of a verified session on the same internal account (this can
     *    be the session being revoked, for self-logout) to build an API-key stamp over
     *    `payloadToSign`, then retry the same `DELETE` request with that full stamp as the
     *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header.
     *    The signed retry returns `204`.
     *
     * Sessions also expire on their own. `404` is returned whenever the `id` does not match an
     * active session — whether the session was never issued, was already revoked by a prior call,
     * or has expired past its `expiresAt`. The response code reflects the resource state, not an
     * error in the client's flow: re-revoking an already-revoked or expired session is safe and
     * idempotent at the user intent level.
     */
    fun delete(
        id: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSignedRequestChallenge = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSignedRequestChallenge

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AuthSignedRequestChallenge =
        delete(id, SessionDeleteParams.none(), requestOptions)

    /**
     * Refresh an active Embedded Wallet auth session and create a new session signing key. Session
     * refresh is a two-step signed-retry flow:
     * 1. Call `POST /auth/sessions/{id}/refresh` with the request body `{ "clientPublicKey":
     *    "04..." }` and no signature headers. Grid builds a Turnkey create-read-write-session
     *    payload, binds the supplied `clientPublicKey` into that payload, persists it as a pending
     *    request, and returns `202` with `payloadToSign`, `requestId`, and `expiresAt`.
     * 2. Sign `payloadToSign` with the current session signing key, then retry the same request
     *    with the full API-key stamp as `Grid-Wallet-Signature`, the `requestId` echoed back as
     *    `Request-Id`, and the same `clientPublicKey` in the request body. On success, Grid returns
     *    a new `AuthSession` with an `encryptedSessionSigningKey` sealed to that client public key.
     *
     * The original session must still be active on both steps so it can authorize the refresh. If
     * the session has already expired, use the credential reauthentication flow instead.
     */
    fun refresh(
        id: String,
        params: SessionRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSession = refresh(params.toBuilder().id(id).build(), requestOptions)

    /** @see refresh */
    fun refresh(
        params: SessionRefreshParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthSession

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /auth/sessions`, but is otherwise the same as
         * [SessionService.list].
         */
        @MustBeClosed
        fun list(
            params: SessionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionListResponse>

        /**
         * Returns a raw HTTP response for `delete /auth/sessions/{id}`, but is otherwise the same
         * as [SessionService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSignedRequestChallenge> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSignedRequestChallenge>

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthSignedRequestChallenge> =
            delete(id, SessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/sessions/{id}/refresh`, but is otherwise the
         * same as [SessionService.refresh].
         */
        @MustBeClosed
        fun refresh(
            id: String,
            params: SessionRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSession> = refresh(params.toBuilder().id(id).build(), requestOptions)

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            params: SessionRefreshParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthSession>
    }
}
