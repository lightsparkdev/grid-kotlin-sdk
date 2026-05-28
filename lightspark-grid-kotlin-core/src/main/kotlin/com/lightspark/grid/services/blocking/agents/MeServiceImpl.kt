// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

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
import com.lightspark.grid.core.prepare
import com.lightspark.grid.models.agents.Agent
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.agents.me.MeCreateTransferInParams
import com.lightspark.grid.models.agents.me.MeCreateTransferOutParams
import com.lightspark.grid.models.agents.me.MeListInternalAccountsPage
import com.lightspark.grid.models.agents.me.MeListInternalAccountsPageResponse
import com.lightspark.grid.models.agents.me.MeListInternalAccountsParams
import com.lightspark.grid.models.agents.me.MeRetrieveParams
import com.lightspark.grid.services.blocking.agents.me.ActionService
import com.lightspark.grid.services.blocking.agents.me.ActionServiceImpl
import com.lightspark.grid.services.blocking.agents.me.ExternalAccountService
import com.lightspark.grid.services.blocking.agents.me.ExternalAccountServiceImpl
import com.lightspark.grid.services.blocking.agents.me.QuoteService
import com.lightspark.grid.services.blocking.agents.me.QuoteServiceImpl
import com.lightspark.grid.services.blocking.agents.me.TransactionService
import com.lightspark.grid.services.blocking.agents.me.TransactionServiceImpl

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
class MeServiceImpl internal constructor(private val clientOptions: ClientOptions) : MeService {

    private val withRawResponse: MeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    private val quotes: QuoteService by lazy { QuoteServiceImpl(clientOptions) }

    private val externalAccounts: ExternalAccountService by lazy {
        ExternalAccountServiceImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): MeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeService =
        MeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun transactions(): TransactionService = transactions

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun quotes(): QuoteService = quotes

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun externalAccounts(): ExternalAccountService = externalAccounts

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun actions(): ActionService = actions

    override fun retrieve(params: MeRetrieveParams, requestOptions: RequestOptions): Agent =
        // get /agents/me
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun createTransferIn(
        params: MeCreateTransferInParams,
        requestOptions: RequestOptions,
    ): AgentAction =
        // post /agents/me/transfer-in
        withRawResponse().createTransferIn(params, requestOptions).parse()

    override fun createTransferOut(
        params: MeCreateTransferOutParams,
        requestOptions: RequestOptions,
    ): AgentAction =
        // post /agents/me/transfer-out
        withRawResponse().createTransferOut(params, requestOptions).parse()

    override fun listInternalAccounts(
        params: MeListInternalAccountsParams,
        requestOptions: RequestOptions,
    ): MeListInternalAccountsPage =
        // get /agents/me/internal-accounts
        withRawResponse().listInternalAccounts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val quotes: QuoteService.WithRawResponse by lazy {
            QuoteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalAccounts: ExternalAccountService.WithRawResponse by lazy {
            ExternalAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MeService.WithRawResponse =
            MeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun transactions(): TransactionService.WithRawResponse = transactions

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun quotes(): QuoteService.WithRawResponse = quotes

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun externalAccounts(): ExternalAccountService.WithRawResponse = externalAccounts

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun actions(): ActionService.WithRawResponse = actions

        private val retrieveHandler: Handler<Agent> = jsonHandler<Agent>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me")
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

        private val createTransferInHandler: Handler<AgentAction> =
            jsonHandler<AgentAction>(clientOptions.jsonMapper)

        override fun createTransferIn(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun createTransferOut(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listInternalAccountsHandler: Handler<MeListInternalAccountsPageResponse> =
            jsonHandler<MeListInternalAccountsPageResponse>(clientOptions.jsonMapper)

        override fun listInternalAccounts(
            params: MeListInternalAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeListInternalAccountsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "internal-accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInternalAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MeListInternalAccountsPage.builder()
                            .service(MeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
