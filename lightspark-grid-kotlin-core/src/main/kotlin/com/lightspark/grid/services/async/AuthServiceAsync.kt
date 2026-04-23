// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.AuthListSessionsParams
import com.lightspark.grid.models.auth.AuthListSessionsResponse
import com.lightspark.grid.services.async.auth.CredentialServiceAsync

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
interface AuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthServiceAsync

    /**
     * Endpoints for registering and verifying end-user authentication credentials (email OTP,
     * OAuth, passkey) used to sign Embedded Wallet actions.
     */
    fun credentials(): CredentialServiceAsync

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
    suspend fun listSessions(
        params: AuthListSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthListSessionsResponse

    /** A view of [AuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthServiceAsync.WithRawResponse

        /**
         * Endpoints for registering and verifying end-user authentication credentials (email OTP,
         * OAuth, passkey) used to sign Embedded Wallet actions.
         */
        fun credentials(): CredentialServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /auth/sessions`, but is otherwise the same as
         * [AuthServiceAsync.listSessions].
         */
        @MustBeClosed
        suspend fun listSessions(
            params: AuthListSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthListSessionsResponse>
    }
}
