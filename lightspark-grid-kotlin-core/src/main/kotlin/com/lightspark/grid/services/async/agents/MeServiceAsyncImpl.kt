// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.SecurityOptions
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
import com.lightspark.grid.models.agents.Agent
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.agents.me.MeCreateTransferInParams
import com.lightspark.grid.models.agents.me.MeCreateTransferOutParams
import com.lightspark.grid.models.agents.me.MeListInternalAccountsPageAsync
import com.lightspark.grid.models.agents.me.MeListInternalAccountsParams
import com.lightspark.grid.models.agents.me.MeRetrieveParams
import com.lightspark.grid.models.customers.InternalAccountListResponse
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

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

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
    override fun externalAccounts(): ExternalAccountServiceAsync = externalAccounts

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun actions(): ActionServiceAsync = actions

    override suspend fun retrieve(params: MeRetrieveParams, requestOptions: RequestOptions): Agent =
        // get /agents/me
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun createTransferIn(
        params: MeCreateTransferInParams,
        requestOptions: RequestOptions,
    ): AgentAction =
        // post /agents/me/transfer-in
        withRawResponse().createTransferIn(params, requestOptions).parse()

    override suspend fun createTransferOut(
        params: MeCreateTransferOutParams,
        requestOptions: RequestOptions,
    ): AgentAction =
        // post /agents/me/transfer-out
        withRawResponse().createTransferOut(params, requestOptions).parse()

    override suspend fun listInternalAccounts(
        params: MeListInternalAccountsParams,
        requestOptions: RequestOptions,
    ): MeListInternalAccountsPageAsync =
        // get /agents/me/internal-accounts
        withRawResponse().listInternalAccounts(params, requestOptions).parse()

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

        private val externalAccounts: ExternalAccountServiceAsync.WithRawResponse by lazy {
            ExternalAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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
        override fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse =
            externalAccounts

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val retrieveHandler: Handler<Agent> = jsonHandler<Agent>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: MeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me")
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().agentAuth(true).build(),
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

        private val createTransferInHandler: Handler<AgentAction> =
            jsonHandler<AgentAction>(clientOptions.jsonMapper)

        override suspend fun createTransferIn(
            params: MeCreateTransferInParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentAction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "transfer-in")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().agentAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createTransferInHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createTransferOutHandler: Handler<AgentAction> =
            jsonHandler<AgentAction>(clientOptions.jsonMapper)

        override suspend fun createTransferOut(
            params: MeCreateTransferOutParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentAction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "transfer-out")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().agentAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createTransferOutHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listInternalAccountsHandler: Handler<InternalAccountListResponse> =
            jsonHandler<InternalAccountListResponse>(clientOptions.jsonMapper)

        override suspend fun listInternalAccounts(
            params: MeListInternalAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeListInternalAccountsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "internal-accounts")
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().agentAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInternalAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MeListInternalAccountsPageAsync.builder()
                            .service(MeServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
