// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

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
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeDeviceCodesParams
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeDeviceCodesResponse
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRedeemParams
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRedeemResponse
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRetrieveStatusParams
import com.lightspark.grid.models.agents.devicecodes.DeviceCodeRetrieveStatusResponse

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
class DeviceCodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeviceCodeServiceAsync {

    private val withRawResponse: DeviceCodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeviceCodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceCodeServiceAsync =
        DeviceCodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun deviceCodes(
        params: DeviceCodeDeviceCodesParams,
        requestOptions: RequestOptions,
    ): DeviceCodeDeviceCodesResponse =
        // post /agents/{agentId}/device-codes
        withRawResponse().deviceCodes(params, requestOptions).parse()

    override suspend fun redeem(
        params: DeviceCodeRedeemParams,
        requestOptions: RequestOptions,
    ): DeviceCodeRedeemResponse =
        // post /agents/device-codes/{code}/redeem
        withRawResponse().redeem(params, requestOptions).parse()

    override suspend fun retrieveStatus(
        params: DeviceCodeRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): DeviceCodeRetrieveStatusResponse =
        // get /agents/device-codes/{code}/status
        withRawResponse().retrieveStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeviceCodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeviceCodeServiceAsync.WithRawResponse =
            DeviceCodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val deviceCodesHandler: Handler<DeviceCodeDeviceCodesResponse> =
            jsonHandler<DeviceCodeDeviceCodesResponse>(clientOptions.jsonMapper)

        override suspend fun deviceCodes(
            params: DeviceCodeDeviceCodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeDeviceCodesResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deviceCodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val redeemHandler: Handler<DeviceCodeRedeemResponse> =
            jsonHandler<DeviceCodeRedeemResponse>(clientOptions.jsonMapper)

        override suspend fun redeem(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveStatusHandler: Handler<DeviceCodeRetrieveStatusResponse> =
            jsonHandler<DeviceCodeRetrieveStatusResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveStatus(
            params: DeviceCodeRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRetrieveStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "device-codes", params._pathParam(0), "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
