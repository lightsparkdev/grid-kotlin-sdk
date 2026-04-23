// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.blocking.auth.CredentialService
import com.lightspark.grid.services.blocking.auth.SessionService

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
     * Endpoints for registering and verifying end-user authentication credentials (email OTP,
     * OAuth, passkey) used to sign Embedded Wallet actions.
     */
    fun sessions(): SessionService

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
         * Endpoints for registering and verifying end-user authentication credentials (email OTP,
         * OAuth, passkey) used to sign Embedded Wallet actions.
         */
        fun sessions(): SessionService.WithRawResponse
    }
}
