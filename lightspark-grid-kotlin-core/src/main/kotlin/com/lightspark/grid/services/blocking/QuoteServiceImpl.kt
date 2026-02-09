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
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteExecuteParams
import com.lightspark.grid.models.quotes.QuoteListPage
import com.lightspark.grid.models.quotes.QuoteListPageResponse
import com.lightspark.grid.models.quotes.QuoteListParams
import com.lightspark.grid.models.quotes.QuoteRetrieveParams

class QuoteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QuoteService {

    private val withRawResponse: QuoteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QuoteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QuoteService =
        QuoteServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: QuoteCreateParams, requestOptions: RequestOptions): Quote =
        // post /quotes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: QuoteRetrieveParams, requestOptions: RequestOptions): Quote =
        // get /quotes/{quoteId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: QuoteListParams, requestOptions: RequestOptions): QuoteListPage =
        // get /quotes
        withRawResponse().list(params, requestOptions).parse()

    override fun execute(params: QuoteExecuteParams, requestOptions: RequestOptions): Quote =
        // post /quotes/{quoteId}/execute
        withRawResponse().execute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QuoteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QuoteService.WithRawResponse =
            QuoteServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes")
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

        private val retrieveHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .addPathSegments("quotes", params._pathParam(0))
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

        private val listHandler: Handler<QuoteListPageResponse> =
            jsonHandler<QuoteListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: QuoteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes")
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
                        QuoteListPage.builder()
                            .service(QuoteServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val executeHandler: Handler<Quote> = jsonHandler<Quote>(clientOptions.jsonMapper)

        override fun execute(
            params: QuoteExecuteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Quote> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quoteId", params.quoteId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("quotes", params._pathParam(0), "execute")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
