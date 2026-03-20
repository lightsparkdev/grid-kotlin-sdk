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
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListPage
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListPageResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateResponse

/**
 * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
 * managing beneficial owners and triggering verification for customers.
 */
class BeneficialOwnerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BeneficialOwnerService {

    private val withRawResponse: BeneficialOwnerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BeneficialOwnerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BeneficialOwnerService =
        BeneficialOwnerServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: BeneficialOwnerCreateParams,
        requestOptions: RequestOptions,
    ): BeneficialOwnerCreateResponse =
        // post /beneficial-owners
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions,
    ): BeneficialOwnerRetrieveResponse =
        // get /beneficial-owners/{beneficialOwnerId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions,
    ): BeneficialOwnerUpdateResponse =
        // patch /beneficial-owners/{beneficialOwnerId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions,
    ): BeneficialOwnerListPage =
        // get /beneficial-owners
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BeneficialOwnerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BeneficialOwnerService.WithRawResponse =
            BeneficialOwnerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BeneficialOwnerCreateResponse> =
            jsonHandler<BeneficialOwnerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BeneficialOwnerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("beneficial-owners")
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

        private val retrieveHandler: Handler<BeneficialOwnerRetrieveResponse> =
            jsonHandler<BeneficialOwnerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("beneficialOwnerId", params.beneficialOwnerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("beneficial-owners", params._pathParam(0))
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

        private val updateHandler: Handler<BeneficialOwnerUpdateResponse> =
            jsonHandler<BeneficialOwnerUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("beneficialOwnerId", params.beneficialOwnerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("beneficial-owners", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BeneficialOwnerListPageResponse> =
            jsonHandler<BeneficialOwnerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("beneficial-owners")
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
                        BeneficialOwnerListPage.builder()
                            .service(BeneficialOwnerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
