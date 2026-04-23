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
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialCreateResponse
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialListResponse
import com.lightspark.grid.models.auth.credentials.CredentialResendChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialResendChallengeResponse
import com.lightspark.grid.models.auth.credentials.CredentialRevokeParams
import com.lightspark.grid.models.auth.credentials.CredentialRevokeResponse
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyResponse

/**
 * Endpoints for registering and verifying end-user authentication credentials (email OTP, OAuth,
 * passkey) used to sign Embedded Wallet actions.
 */
class CredentialServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CredentialService {

    private val withRawResponse: CredentialService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CredentialService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CredentialService =
        CredentialServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions,
    ): CredentialCreateResponse =
        // post /auth/credentials
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: CredentialListParams,
        requestOptions: RequestOptions,
    ): CredentialListResponse =
        // get /auth/credentials
        withRawResponse().list(params, requestOptions).parse()

    override fun resendChallenge(
        params: CredentialResendChallengeParams,
        requestOptions: RequestOptions,
    ): CredentialResendChallengeResponse =
        // post /auth/credentials/{id}/challenge
        withRawResponse().resendChallenge(params, requestOptions).parse()

    override fun revoke(
        params: CredentialRevokeParams,
        requestOptions: RequestOptions,
    ): CredentialRevokeResponse =
        // delete /auth/credentials/{id}
        withRawResponse().revoke(params, requestOptions).parse()

    override fun verify(
        params: CredentialVerifyParams,
        requestOptions: RequestOptions,
    ): CredentialVerifyResponse =
        // post /auth/credentials/{id}/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CredentialService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CredentialService.WithRawResponse =
            CredentialServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CredentialCreateResponse> =
            jsonHandler<CredentialCreateResponse>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<CredentialListResponse> =
            jsonHandler<CredentialListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CredentialListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "credentials")
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

        private val resendChallengeHandler: Handler<CredentialResendChallengeResponse> =
            jsonHandler<CredentialResendChallengeResponse>(clientOptions.jsonMapper)

        override fun resendChallenge(
            params: CredentialResendChallengeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialResendChallengeResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { resendChallengeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val revokeHandler: Handler<CredentialRevokeResponse> =
            jsonHandler<CredentialRevokeResponse>(clientOptions.jsonMapper)

        override fun revoke(
            params: CredentialRevokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialRevokeResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { revokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<CredentialVerifyResponse> =
            jsonHandler<CredentialVerifyResponse>(clientOptions.jsonMapper)

        override fun verify(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
