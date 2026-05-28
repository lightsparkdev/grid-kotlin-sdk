// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

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
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.verifications.VerificationListPageAsync
import com.lightspark.grid.models.verifications.VerificationListPageResponse
import com.lightspark.grid.models.verifications.VerificationListParams
import com.lightspark.grid.models.verifications.VerificationRetrieveParams
import com.lightspark.grid.models.verifications.VerificationRetrieveResponse
import com.lightspark.grid.models.verifications.VerificationSubmitParams
import com.lightspark.grid.models.verifications.VerificationSubmitResponse

/**
 * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
 * managing beneficial owners and triggering verification for customers.
 */
class VerificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationServiceAsync {

    private val withRawResponse: VerificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VerificationServiceAsync =
        VerificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions,
    ): VerificationRetrieveResponse =
        // get /verifications/{verificationId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: VerificationListParams,
        requestOptions: RequestOptions,
    ): VerificationListPageAsync =
        // get /verifications
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun submit(
        params: VerificationSubmitParams,
        requestOptions: RequestOptions,
    ): VerificationSubmitResponse =
        // post /verifications
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VerificationServiceAsync.WithRawResponse =
            VerificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<VerificationRetrieveResponse> =
            jsonHandler<VerificationRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verificationId", params.verificationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<VerificationListPageResponse> =
            jsonHandler<VerificationListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: VerificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications")
                    .build()
                    .prepareAsync(clientOptions, params)
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
                    .let {
                        VerificationListPageAsync.builder()
                            .service(VerificationServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val submitHandler: Handler<VerificationSubmitResponse> =
            jsonHandler<VerificationSubmitResponse>(clientOptions.jsonMapper)

        override suspend fun submit(
            params: VerificationSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationSubmitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
