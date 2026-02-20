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
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.TransactionApproveParams
import com.lightspark.grid.models.transactions.TransactionListPage
import com.lightspark.grid.models.transactions.TransactionListPageResponse
import com.lightspark.grid.models.transactions.TransactionListParams
import com.lightspark.grid.models.transactions.TransactionRejectParams
import com.lightspark.grid.models.transactions.TransactionRetrieveParams
import com.lightspark.grid.models.transactions.TransactionRetrieveResponse

class TransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionService {

    private val withRawResponse: TransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionService =
        TransactionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionRetrieveResponse =
        // get /transactions/{transactionId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionListPage =
        // get /transactions
        withRawResponse().list(params, requestOptions).parse()

    override fun approve(
        params: TransactionApproveParams,
        requestOptions: RequestOptions,
    ): IncomingTransaction =
        // post /transactions/{transactionId}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun reject(
        params: TransactionRejectParams,
        requestOptions: RequestOptions,
    ): IncomingTransaction =
        // post /transactions/{transactionId}/reject
        withRawResponse().reject(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionService.WithRawResponse =
            TransactionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<TransactionRetrieveResponse> =
            jsonHandler<TransactionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0))
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

        private val listHandler: Handler<TransactionListPageResponse> =
            jsonHandler<TransactionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions")
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
                        TransactionListPage.builder()
                            .service(TransactionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val approveHandler: Handler<IncomingTransaction> =
            jsonHandler<IncomingTransaction>(clientOptions.jsonMapper)

        override fun approve(
            params: TransactionApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0), "approve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rejectHandler: Handler<IncomingTransaction> =
            jsonHandler<IncomingTransaction>(clientOptions.jsonMapper)

        override fun reject(
            params: TransactionRejectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0), "reject")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rejectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
