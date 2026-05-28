// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

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
import com.lightspark.grid.models.cards.Card
import com.lightspark.grid.models.cards.CardIssueParams
import com.lightspark.grid.models.cards.CardListPageAsync
import com.lightspark.grid.models.cards.CardListParams
import com.lightspark.grid.models.cards.CardListResponse
import com.lightspark.grid.models.cards.CardRetrieveParams
import com.lightspark.grid.models.cards.CardUpdateParams

/**
 * Card management endpoints. Issue debit cards against an internal account, freeze / unfreeze,
 * close, manage card funding sources, and list card transactions.
 */
class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): Card =
        // get /cards/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: CardUpdateParams, requestOptions: RequestOptions): Card =
        // patch /cards/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CardListPageAsync =
        // get /cards
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun issue(params: CardIssueParams, requestOptions: RequestOptions): Card =
        // post /cards
        withRawResponse().issue(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0))
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
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0))
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
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CardListResponse> =
            jsonHandler<CardListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards")
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
                    .let {
                        CardListPageAsync.builder()
                            .service(CardServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val issueHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override suspend fun issue(
            params: CardIssueParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards")
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
                    .use { issueHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
