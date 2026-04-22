// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.async.auth.CredentialServiceAsync

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
    }
}
