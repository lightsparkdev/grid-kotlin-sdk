// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.handlers.emptyHandler
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
import com.lightspark.grid.models.agents.AgentCreateParams
import com.lightspark.grid.models.agents.AgentCreateResponse
import com.lightspark.grid.models.agents.AgentDeleteParams
import com.lightspark.grid.models.agents.AgentListApprovalsPageAsync
import com.lightspark.grid.models.agents.AgentListApprovalsPageResponse
import com.lightspark.grid.models.agents.AgentListApprovalsParams
import com.lightspark.grid.models.agents.AgentListPageAsync
import com.lightspark.grid.models.agents.AgentListPageResponse
import com.lightspark.grid.models.agents.AgentListParams
import com.lightspark.grid.models.agents.AgentRetrieveParams
import com.lightspark.grid.models.agents.AgentRetrieveResponse
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyResponse
import com.lightspark.grid.models.agents.AgentUpdateResponse
import com.lightspark.grid.services.async.agents.ActionServiceAsync
import com.lightspark.grid.services.async.agents.ActionServiceAsyncImpl
import com.lightspark.grid.services.async.agents.DeviceCodeServiceAsync
import com.lightspark.grid.services.async.agents.DeviceCodeServiceAsyncImpl
import com.lightspark.grid.services.async.agents.MeServiceAsync
import com.lightspark.grid.services.async.agents.MeServiceAsyncImpl
import com.lightspark.grid.services.async.agents.TransactionServiceAsync
import com.lightspark.grid.services.async.agents.TransactionServiceAsyncImpl

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val withRawResponse: AgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val me: MeServiceAsync by lazy { MeServiceAsyncImpl(clientOptions) }

    private val deviceCodes: DeviceCodeServiceAsync by lazy {
        DeviceCodeServiceAsyncImpl(clientOptions)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentServiceAsync =
        AgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun me(): MeServiceAsync = me

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    override fun deviceCodes(): DeviceCodeServiceAsync = deviceCodes

    override fun transactions(): TransactionServiceAsync = transactions

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    override fun actions(): ActionServiceAsync = actions

    override suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse =
        // post /agents
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentRetrieveResponse =
        // get /agents/{agentId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions,
    ): AgentUpdateResponse =
        // patch /agents/{agentId}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AgentListParams,
        requestOptions: RequestOptions,
    ): AgentListPageAsync =
        // get /agents
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        // delete /agents/{agentId}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listApprovals(
        params: AgentListApprovalsParams,
        requestOptions: RequestOptions,
    ): AgentListApprovalsPageAsync =
        // get /agents/approvals
        withRawResponse().listApprovals(params, requestOptions).parse()

    override suspend fun updatePolicy(
        params: AgentUpdatePolicyParams,
        requestOptions: RequestOptions,
    ): AgentUpdatePolicyResponse =
        // patch /agents/{agentId}/policy
        withRawResponse().updatePolicy(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val me: MeServiceAsync.WithRawResponse by lazy {
            MeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val deviceCodes: DeviceCodeServiceAsync.WithRawResponse by lazy {
            DeviceCodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentServiceAsync.WithRawResponse =
            AgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun me(): MeServiceAsync.WithRawResponse = me

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        override fun deviceCodes(): DeviceCodeServiceAsync.WithRawResponse = deviceCodes

        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<AgentCreateResponse> =
            jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents")
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

        private val retrieveHandler: Handler<AgentRetrieveResponse> =
            jsonHandler<AgentRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", params._pathParam(0))
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

        private val updateHandler: Handler<AgentUpdateResponse> =
            jsonHandler<AgentUpdateResponse>(clientOptions.jsonMapper)

        override suspend fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
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

        private val listHandler: Handler<AgentListPageResponse> =
            jsonHandler<AgentListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents")
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
                    .let {
                        AgentListPageAsync.builder()
                            .service(AgentServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listApprovalsHandler: Handler<AgentListApprovalsPageResponse> =
            jsonHandler<AgentListApprovalsPageResponse>(clientOptions.jsonMapper)

        override suspend fun listApprovals(
            params: AgentListApprovalsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListApprovalsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "approvals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listApprovalsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AgentListApprovalsPageAsync.builder()
                            .service(AgentServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updatePolicyHandler: Handler<AgentUpdatePolicyResponse> =
            jsonHandler<AgentUpdatePolicyResponse>(clientOptions.jsonMapper)

        override suspend fun updatePolicy(
            params: AgentUpdatePolicyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdatePolicyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", params._pathParam(0), "policy")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updatePolicyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
