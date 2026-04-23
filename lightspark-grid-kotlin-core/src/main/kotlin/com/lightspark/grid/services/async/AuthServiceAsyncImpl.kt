// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.handlers.errorBodyHandler
import com.lightspark.grid.core.handlers.errorHandler
import com.lightspark.grid.core.handlers.jsonHandler
import com.lightspark.grid.core.http.HttpMethod
import com.lightspark.grid.core.http.HttpRequest
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponse.Handler
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.auth.AuthListSessionsParams
import com.lightspark.grid.models.auth.AuthListSessionsResponse
import com.lightspark.grid.services.async.auth.CredentialServiceAsync
import com.lightspark.grid.services.async.auth.CredentialServiceAsyncImpl

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val withRawResponse: AuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val credentials: CredentialServiceAsync by lazy {
        CredentialServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AuthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthServiceAsync =
        AuthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints for registering and verifying end-user authentication credentials (email OTP,
     * OAuth, passkey) used to sign Embedded Wallet actions.
     */
    override fun credentials(): CredentialServiceAsync = credentials

    override suspend fun listSessions(
        params: AuthListSessionsParams,
        requestOptions: RequestOptions,
    ): AuthListSessionsResponse =
        // get /auth/sessions
        withRawResponse().listSessions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val credentials: CredentialServiceAsync.WithRawResponse by lazy {
            CredentialServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthServiceAsync.WithRawResponse =
            AuthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * Endpoints for registering and verifying end-user authentication credentials (email OTP,
         * OAuth, passkey) used to sign Embedded Wallet actions.
         */
        override fun credentials(): CredentialServiceAsync.WithRawResponse = credentials

        private val listSessionsHandler: Handler<AuthListSessionsResponse> =
            jsonHandler<AuthListSessionsResponse>(clientOptions.jsonMapper)

        override suspend fun listSessions(
            params: AuthListSessionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthListSessionsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "sessions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSessionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
