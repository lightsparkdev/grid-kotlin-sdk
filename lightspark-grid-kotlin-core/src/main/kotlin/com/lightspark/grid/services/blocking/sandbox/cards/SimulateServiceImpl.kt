// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.sandbox.cards

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
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateAuthorizationParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateAuthorizationResponse
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateClearingParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateClearingResponse
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateReturnParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateReturnResponse

/** Endpoints to trigger test cases in sandbox */
class SimulateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SimulateService {

    private val withRawResponse: SimulateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SimulateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SimulateService =
        SimulateServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun authorization(
        params: SimulateAuthorizationParams,
        requestOptions: RequestOptions,
    ): SimulateAuthorizationResponse =
        // post /sandbox/cards/{id}/simulate/authorization
        withRawResponse().authorization(params, requestOptions).parse()

    override fun clearing(
        params: SimulateClearingParams,
        requestOptions: RequestOptions,
    ): SimulateClearingResponse =
        // post /sandbox/cards/{id}/simulate/clearing
        withRawResponse().clearing(params, requestOptions).parse()

    override fun return_(
        params: SimulateReturnParams,
        requestOptions: RequestOptions,
    ): SimulateReturnResponse =
        // post /sandbox/cards/{id}/simulate/return
        withRawResponse().return_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimulateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SimulateService.WithRawResponse =
            SimulateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val authorizationHandler: Handler<SimulateAuthorizationResponse> =
            jsonHandler<SimulateAuthorizationResponse>(clientOptions.jsonMapper)

        override fun authorization(
            params: SimulateAuthorizationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimulateAuthorizationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sandbox",
                        "cards",
                        params._pathParam(0),
                        "simulate",
                        "authorization",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { authorizationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val clearingHandler: Handler<SimulateClearingResponse> =
            jsonHandler<SimulateClearingResponse>(clientOptions.jsonMapper)

        override fun clearing(
            params: SimulateClearingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimulateClearingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sandbox",
                        "cards",
                        params._pathParam(0),
                        "simulate",
                        "clearing",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { clearingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val returnHandler: Handler<SimulateReturnResponse> =
            jsonHandler<SimulateReturnResponse>(clientOptions.jsonMapper)

        override fun return_(
            params: SimulateReturnParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimulateReturnResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sandbox", "cards", params._pathParam(0), "simulate", "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { returnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
