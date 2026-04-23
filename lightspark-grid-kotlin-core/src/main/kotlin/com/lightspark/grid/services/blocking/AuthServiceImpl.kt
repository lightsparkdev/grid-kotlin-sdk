// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.blocking.auth.CredentialService
import com.lightspark.grid.services.blocking.auth.CredentialServiceImpl
import com.lightspark.grid.services.blocking.auth.SessionService
import com.lightspark.grid.services.blocking.auth.SessionServiceImpl

class AuthServiceImpl internal constructor(private val clientOptions: ClientOptions) : AuthService {

    private val withRawResponse: AuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val credentials: CredentialService by lazy { CredentialServiceImpl(clientOptions) }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    override fun withRawResponse(): AuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService =
        AuthServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints for registering and verifying end-user authentication credentials (email OTP,
     * OAuth, passkey) used to sign Embedded Wallet actions.
     */
    override fun credentials(): CredentialService = credentials

    /**
     * Endpoints for registering and verifying end-user authentication credentials (email OTP,
     * OAuth, passkey) used to sign Embedded Wallet actions.
     */
    override fun sessions(): SessionService = sessions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthService.WithRawResponse {

        private val credentials: CredentialService.WithRawResponse by lazy {
            CredentialServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sessions: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthService.WithRawResponse =
            AuthServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /**
         * Endpoints for registering and verifying end-user authentication credentials (email OTP,
         * OAuth, passkey) used to sign Embedded Wallet actions.
         */
        override fun credentials(): CredentialService.WithRawResponse = credentials

        /**
         * Endpoints for registering and verifying end-user authentication credentials (email OTP,
         * OAuth, passkey) used to sign Embedded Wallet actions.
         */
        override fun sessions(): SessionService.WithRawResponse = sessions
    }
}
