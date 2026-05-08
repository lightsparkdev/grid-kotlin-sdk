// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

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
import com.lightspark.grid.models.agents.actions.ActionApproveParams
import com.lightspark.grid.models.agents.actions.ActionApproveResponse
import com.lightspark.grid.models.agents.actions.ActionRejectParams
import com.lightspark.grid.models.agents.actions.ActionRejectResponse

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun approve(
        params: ActionApproveParams,
        requestOptions: RequestOptions,
    ): ActionApproveResponse =
        // post /agents/{agentId}/actions/{actionId}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun reject(
        params: ActionRejectParams,
        requestOptions: RequestOptions,
    ): ActionRejectResponse =
        // post /agents/{agentId}/actions/{actionId}/reject
        withRawResponse().reject(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val approveHandler: Handler<ActionApproveResponse> =
            jsonHandler<ActionApproveResponse>(clientOptions.jsonMapper)

        override fun approve(
            params: ActionApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionApproveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("actionId", params.actionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agents",
                        params._pathParam(0),
                        "actions",
                        params._pathParam(1),
                        "approve",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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

        private val rejectHandler: Handler<ActionRejectResponse> =
            jsonHandler<ActionRejectResponse>(clientOptions.jsonMapper)

        override fun reject(
            params: ActionRejectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRejectResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("actionId", params.actionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agents",
                        params._pathParam(0),
                        "actions",
                        params._pathParam(1),
                        "reject",
                    )
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
