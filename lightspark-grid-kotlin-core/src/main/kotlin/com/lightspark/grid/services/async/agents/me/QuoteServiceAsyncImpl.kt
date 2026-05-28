// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents.me

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
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.agents.me.quotes.QuoteCreateParams
import com.lightspark.grid.models.agents.me.quotes.QuoteExecuteParams
import com.lightspark.grid.models.agents.me.quotes.QuoteRetrieveParams
import com.lightspark.grid.models.quotes.Quote

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
class QuoteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QuoteServiceAsync {

    private val withRawResponse: QuoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QuoteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QuoteServiceAsync =
        QuoteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(params: QuoteCreateParams, requestOptions: RequestOptions): Quote =
        // post /agents/me/quotes
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: QuoteRetrieveParams,
        requestOptions: RequestOptions,
    ): Quote =
        // get /agents/me/quotes/{quoteId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun execute(
        params: QuoteExecuteParams,
        requestOptions: RequestOptions,
    ): AgentAction =
        // post /agents/me/quotes/{quoteId}/execute
        withRawResponse().execute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QuoteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QuoteServiceAsync.WithRawResponse =
            QuoteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override suspend fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "quotes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
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

        private val retrieveHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: QuoteRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "quotes", params._pathParam(0))
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

        private val executeHandler: Handler<AgentAction> =
            jsonHandler<AgentAction>(clientOptions.jsonMapper)

        override suspend fun execute(
            params: QuoteExecuteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentAction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "quotes", params._pathParam(0), "execute")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { executeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
