// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.SecurityOptions
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
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.auth.credentials.AuthCredentialListResponse
import com.lightspark.grid.models.auth.credentials.CredentialChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialChallengeResponse
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialCreateResponse
import com.lightspark.grid.models.auth.credentials.CredentialDeleteParams
import com.lightspark.grid.models.auth.credentials.CredentialDeleteResponse
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyResponse

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
class CredentialServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CredentialServiceAsync {

    private val withRawResponse: CredentialServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CredentialServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CredentialServiceAsync =
        CredentialServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions,
    ): CredentialCreateResponse =
        // post /auth/credentials
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: CredentialListParams,
        requestOptions: RequestOptions,
    ): AuthCredentialListResponse =
        // get /auth/credentials
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: CredentialDeleteParams,
        requestOptions: RequestOptions,
    ): CredentialDeleteResponse =
        // delete /auth/credentials/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun challenge(
        params: CredentialChallengeParams,
        requestOptions: RequestOptions,
    ): CredentialChallengeResponse =
        // post /auth/credentials/{id}/challenge
        withRawResponse().challenge(params, requestOptions).parse()

    override suspend fun verify(
        params: CredentialVerifyParams,
        requestOptions: RequestOptions,
    ): CredentialVerifyResponse =
        // post /auth/credentials/{id}/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CredentialServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CredentialServiceAsync.WithRawResponse =
            CredentialServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CredentialCreateResponse> =
            jsonHandler<CredentialCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CredentialCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "credentials")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AuthCredentialListResponse> =
            jsonHandler<AuthCredentialListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CredentialListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthCredentialListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "credentials")
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<CredentialDeleteResponse> =
            jsonHandler<CredentialDeleteResponse>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: CredentialDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "credentials", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val challengeHandler: Handler<CredentialChallengeResponse> =
            jsonHandler<CredentialChallengeResponse>(clientOptions.jsonMapper)

        override suspend fun challenge(
            params: CredentialChallengeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialChallengeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "credentials", params._pathParam(0), "challenge")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { challengeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<CredentialVerifyResponse> =
            jsonHandler<CredentialVerifyResponse>(clientOptions.jsonMapper)

        override suspend fun verify(
            params: CredentialVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialVerifyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "credentials", params._pathParam(0), "verify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
