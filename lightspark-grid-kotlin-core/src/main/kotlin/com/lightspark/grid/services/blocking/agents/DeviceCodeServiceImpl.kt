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
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeGetStatusParams
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeGetStatusResponse
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRedeemParams
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRedeemResponse
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRegenerateParams
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRegenerateResponse

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
class DeviceCodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeviceCodeService {

    private val withRawResponse: DeviceCodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeviceCodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceCodeService =
        DeviceCodeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getStatus(
        params: DeviceCodeGetStatusParams,
        requestOptions: RequestOptions,
    ): DeviceCodeGetStatusResponse =
        // get /agents/device-codes/{code}/status
        withRawResponse().getStatus(params, requestOptions).parse()

    override fun redeem(
        params: DeviceCodeRedeemParams,
        requestOptions: RequestOptions,
    ): DeviceCodeRedeemResponse =
        // post /agents/device-codes/{code}/redeem
        withRawResponse().redeem(params, requestOptions).parse()

    override fun regenerate(
        params: DeviceCodeRegenerateParams,
        requestOptions: RequestOptions,
    ): DeviceCodeRegenerateResponse =
        // post /agents/{agentId}/device-codes
        withRawResponse().regenerate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeviceCodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeviceCodeService.WithRawResponse =
            DeviceCodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getStatusHandler: Handler<DeviceCodeGetStatusResponse> =
            jsonHandler<DeviceCodeGetStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: DeviceCodeGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeGetStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "device-codes", params._pathParam(0), "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val redeemHandler: Handler<DeviceCodeRedeemResponse> =
            jsonHandler<DeviceCodeRedeemResponse>(clientOptions.jsonMapper)

        override fun redeem(
            params: DeviceCodeRedeemParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRedeemResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "device-codes", params._pathParam(0), "redeem")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { redeemHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val regenerateHandler: Handler<DeviceCodeRegenerateResponse> =
            jsonHandler<DeviceCodeRegenerateResponse>(clientOptions.jsonMapper)

        override fun regenerate(
            params: DeviceCodeRegenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRegenerateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", params._pathParam(0), "device-codes")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { regenerateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
