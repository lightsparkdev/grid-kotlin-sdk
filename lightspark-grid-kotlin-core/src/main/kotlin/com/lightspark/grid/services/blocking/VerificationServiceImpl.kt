// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

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
import com.lightspark.grid.models.verifications.VerificationListPage
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
class VerificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationService {

    private val withRawResponse: VerificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VerificationService =
        VerificationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions,
    ): VerificationRetrieveResponse =
        // get /verifications/{verificationId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: VerificationListParams,
        requestOptions: RequestOptions,
    ): VerificationListPage =
        // get /verifications
        withRawResponse().list(params, requestOptions).parse()

    override fun submit(
        params: VerificationSubmitParams,
        requestOptions: RequestOptions,
    ): VerificationSubmitResponse =
        // post /verifications
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VerificationService.WithRawResponse =
            VerificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<VerificationRetrieveResponse> =
            jsonHandler<VerificationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: VerificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications")
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
                    .let {
                        VerificationListPage.builder()
                            .service(VerificationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val submitHandler: Handler<VerificationSubmitResponse> =
            jsonHandler<VerificationSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
