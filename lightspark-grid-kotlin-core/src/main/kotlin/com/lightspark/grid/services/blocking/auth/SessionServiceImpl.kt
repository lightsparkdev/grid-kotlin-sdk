// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.handlers.errorBodyHandler
import com.lightspark.grid.core.handlers.errorHandler
import com.lightspark.grid.core.handlers.jsonHandler
import com.lightspark.grid.core.http.HttpMethod
import com.lightspark.grid.core.http.HttpRequest
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponse.Handler
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.core.http.json
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepare
import com.lightspark.grid.models.auth.credentials.AuthSession
import com.lightspark.grid.models.auth.credentials.AuthSignedRequestChallenge
import com.lightspark.grid.models.auth.sessions.SessionDeleteParams
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionListResponse
import com.lightspark.grid.models.auth.sessions.SessionRefreshParams

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
class SessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionService {

    private val withRawResponse: SessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SessionService =
        SessionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: SessionListParams,
        requestOptions: RequestOptions,
    ): SessionListResponse =
        // get /auth/sessions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions,
    ): AuthSignedRequestChallenge =
        // delete /auth/sessions/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun refresh(
        params: SessionRefreshParams,
        requestOptions: RequestOptions,
    ): AuthSession =
        // post /auth/sessions/{id}/refresh
        withRawResponse().refresh(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SessionService.WithRawResponse =
            SessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<SessionListResponse> =
            jsonHandler<SessionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "sessions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<AuthSignedRequestChallenge> =
            jsonHandler<AuthSignedRequestChallenge>(clientOptions.jsonMapper)

        override fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthSignedRequestChallenge> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "sessions", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val refreshHandler: Handler<AuthSession> =
            jsonHandler<AuthSession>(clientOptions.jsonMapper)

        override fun refresh(
            params: SessionRefreshParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "sessions", params._pathParam(0), "refresh")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { refreshHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
