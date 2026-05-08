// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionListResponse
import com.lightspark.grid.models.auth.sessions.SessionRevokeParams
import com.lightspark.grid.models.auth.sessions.SessionRevokeResponse

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SessionServiceAsync

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
    suspend fun list(
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
     */
    suspend fun revoke(
        id: String,
        params: SessionRevokeParams = SessionRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRevokeResponse = revoke(params.toBuilder().id(id).build(), requestOptions)

    /** @see revoke */
    suspend fun revoke(
        params: SessionRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRevokeResponse

    /** @see revoke */
    suspend fun revoke(id: String, requestOptions: RequestOptions): SessionRevokeResponse =
        revoke(id, SessionRevokeParams.none(), requestOptions)

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /auth/sessions`, but is otherwise the same as
         * [SessionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SessionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionListResponse>

        /**
         * Returns a raw HTTP response for `delete /auth/sessions/{id}`, but is otherwise the same
         * as [SessionServiceAsync.revoke].
         */
        @MustBeClosed
        suspend fun revoke(
            id: String,
            params: SessionRevokeParams = SessionRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRevokeResponse> =
            revoke(params.toBuilder().id(id).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        suspend fun revoke(
            params: SessionRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRevokeResponse>

        /** @see revoke */
        @MustBeClosed
        suspend fun revoke(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRevokeResponse> =
            revoke(id, SessionRevokeParams.none(), requestOptions)
    }
}
