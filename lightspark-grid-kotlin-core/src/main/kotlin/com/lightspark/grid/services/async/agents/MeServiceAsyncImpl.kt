// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
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
import com.lightspark.grid.models.agents.me.MeListParams
import com.lightspark.grid.models.agents.me.MeListResponse
import com.lightspark.grid.models.agents.me.MeRetrieveInternalAccountsParams
import com.lightspark.grid.models.agents.me.MeRetrieveInternalAccountsResponse
import com.lightspark.grid.models.agents.me.MeTransferInParams
import com.lightspark.grid.models.agents.me.MeTransferInResponse
import com.lightspark.grid.models.agents.me.MeTransferOutParams
import com.lightspark.grid.models.agents.me.MeTransferOutResponse
import com.lightspark.grid.services.async.agents.me.ActionServiceAsync
import com.lightspark.grid.services.async.agents.me.ActionServiceAsyncImpl
import com.lightspark.grid.services.async.agents.me.ExternalAccountServiceAsync
import com.lightspark.grid.services.async.agents.me.ExternalAccountServiceAsyncImpl
import com.lightspark.grid.services.async.agents.me.QuoteServiceAsync
import com.lightspark.grid.services.async.agents.me.QuoteServiceAsyncImpl
import com.lightspark.grid.services.async.agents.me.TransactionServiceAsync
import com.lightspark.grid.services.async.agents.me.TransactionServiceAsyncImpl

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
class MeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeServiceAsync {

    private val withRawResponse: MeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    private val quotes: QuoteServiceAsync by lazy { QuoteServiceAsyncImpl(clientOptions) }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeServiceAsync =
        MeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun transactions(): TransactionServiceAsync = transactions

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun quotes(): QuoteServiceAsync = quotes

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun actions(): ActionServiceAsync = actions

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun externalAccounts(): ExternalAccountServiceAsync = externalAccounts

    override suspend fun list(
        params: MeListParams,
        requestOptions: RequestOptions,
    ): MeListResponse =
        // get /agents/me
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun retrieveInternalAccounts(
        params: MeRetrieveInternalAccountsParams,
        requestOptions: RequestOptions,
    ): MeRetrieveInternalAccountsResponse =
        // get /agents/me/internal-accounts
        withRawResponse().retrieveInternalAccounts(params, requestOptions).parse()

    override suspend fun transferIn(
        params: MeTransferInParams,
        requestOptions: RequestOptions,
    ): MeTransferInResponse =
        // post /agents/me/transfer-in
        withRawResponse().transferIn(params, requestOptions).parse()

    override suspend fun transferOut(
        params: MeTransferOutParams,
        requestOptions: RequestOptions,
    ): MeTransferOutResponse =
        // post /agents/me/transfer-out
        withRawResponse().transferOut(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val quotes: QuoteServiceAsync.WithRawResponse by lazy {
            QuoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalAccounts: ExternalAccountServiceAsync.WithRawResponse by lazy {
            ExternalAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MeServiceAsync.WithRawResponse =
            MeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun quotes(): QuoteServiceAsync.WithRawResponse = quotes

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse =
            externalAccounts

        private val listHandler: Handler<MeListResponse> =
            jsonHandler<MeListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: MeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me")
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
            }
        }

        private val retrieveInternalAccountsHandler: Handler<MeRetrieveInternalAccountsResponse> =
            jsonHandler<MeRetrieveInternalAccountsResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveInternalAccounts(
            params: MeRetrieveInternalAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeRetrieveInternalAccountsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "internal-accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveInternalAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferInHandler: Handler<MeTransferInResponse> =
            jsonHandler<MeTransferInResponse>(clientOptions.jsonMapper)

        override suspend fun transferIn(
            params: MeTransferInParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeTransferInResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "transfer-in")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transferInHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferOutHandler: Handler<MeTransferOutResponse> =
            jsonHandler<MeTransferOutResponse>(clientOptions.jsonMapper)

        override suspend fun transferOut(
            params: MeTransferOutParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeTransferOutResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "transfer-out")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transferOutHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
