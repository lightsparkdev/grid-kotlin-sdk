// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

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
import com.lightspark.grid.core.prepare
import com.lightspark.grid.models.agents.AgentCreateParams
import com.lightspark.grid.models.agents.AgentCreateResponse
import com.lightspark.grid.models.agents.AgentDeleteParams
import com.lightspark.grid.models.agents.AgentListPage
import com.lightspark.grid.models.agents.AgentListPageResponse
import com.lightspark.grid.models.agents.AgentListParams
import com.lightspark.grid.models.agents.AgentRetrieveApprovalsParams
import com.lightspark.grid.models.agents.AgentRetrieveApprovalsResponse
import com.lightspark.grid.models.agents.AgentRetrieveParams
import com.lightspark.grid.models.agents.AgentRetrieveResponse
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyResponse
import com.lightspark.grid.models.agents.AgentUpdateResponse
import com.lightspark.grid.services.blocking.agents.ActionService
import com.lightspark.grid.services.blocking.agents.ActionServiceImpl
import com.lightspark.grid.services.blocking.agents.DeviceCodeService
import com.lightspark.grid.services.blocking.agents.DeviceCodeServiceImpl
import com.lightspark.grid.services.blocking.agents.MeService
import com.lightspark.grid.services.blocking.agents.MeServiceImpl

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val me: MeService by lazy { MeServiceImpl(clientOptions) }

    private val deviceCodes: DeviceCodeService by lazy { DeviceCodeServiceImpl(clientOptions) }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    override fun me(): MeService = me

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    override fun deviceCodes(): DeviceCodeService = deviceCodes

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    override fun actions(): ActionService = actions

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse =
        // post /agents
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentRetrieveResponse =
        // get /agents/{agentId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions,
    ): AgentUpdateResponse =
        // patch /agents/{agentId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AgentListParams, requestOptions: RequestOptions): AgentListPage =
        // get /agents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        // delete /agents/{agentId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun retrieveApprovals(
        params: AgentRetrieveApprovalsParams,
        requestOptions: RequestOptions,
    ): AgentRetrieveApprovalsResponse =
        // get /agents/approvals
        withRawResponse().retrieveApprovals(params, requestOptions).parse()

    override fun updatePolicy(
        params: AgentUpdatePolicyParams,
        requestOptions: RequestOptions,
    ): AgentUpdatePolicyResponse =
        // patch /agents/{agentId}/policy
        withRawResponse().updatePolicy(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val me: MeService.WithRawResponse by lazy {
            MeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val deviceCodes: DeviceCodeService.WithRawResponse by lazy {
            DeviceCodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        override fun me(): MeService.WithRawResponse = me

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        override fun deviceCodes(): DeviceCodeService.WithRawResponse = deviceCodes

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<AgentCreateResponse> =
            jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
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

        private val retrieveHandler: Handler<AgentRetrieveResponse> =
            jsonHandler<AgentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val updateHandler: Handler<AgentUpdateResponse> =
            jsonHandler<AgentUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
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

        private val listHandler: Handler<AgentListPageResponse> =
            jsonHandler<AgentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents")
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
                        AgentListPage.builder()
                            .service(AgentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val retrieveApprovalsHandler: Handler<AgentRetrieveApprovalsResponse> =
            jsonHandler<AgentRetrieveApprovalsResponse>(clientOptions.jsonMapper)

        override fun retrieveApprovals(
            params: AgentRetrieveApprovalsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentRetrieveApprovalsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "approvals")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveApprovalsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updatePolicyHandler: Handler<AgentUpdatePolicyResponse> =
            jsonHandler<AgentUpdatePolicyResponse>(clientOptions.jsonMapper)

        override fun updatePolicy(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
