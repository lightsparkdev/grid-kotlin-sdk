// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.auth.AuthListSessionsParams
import com.lightspark.grid.models.auth.AuthListSessionsResponse
import com.lightspark.grid.services.blocking.auth.CredentialService

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
interface AuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService

    /**
     * Endpoints for registering and verifying end-user authentication credentials (email OTP,
     * OAuth, passkey) used to sign Embedded Wallet actions.
     */
    fun credentials(): CredentialService

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
    fun listSessions(
        params: AuthListSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthListSessionsResponse

    /** A view of [AuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService.WithRawResponse

        /**
         * Endpoints for registering and verifying end-user authentication credentials (email OTP,
         * OAuth, passkey) used to sign Embedded Wallet actions.
         */
        fun credentials(): CredentialService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /auth/sessions`, but is otherwise the same as
         * [AuthService.listSessions].
         */
        @MustBeClosed
        fun listSessions(
            params: AuthListSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthListSessionsResponse>
    }
}
