// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
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
interface DeviceCodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceCodeServiceAsync

    /**
     * Check whether a device code has been redeemed. Use this to poll for agent installation
     * completion after creating an agent.
     */
    suspend fun getStatus(
        code: String,
        params: DeviceCodeGetStatusParams = DeviceCodeGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeGetStatusResponse =
        getStatus(params.toBuilder().code(code).build(), requestOptions)

    /** @see getStatus */
    suspend fun getStatus(
        params: DeviceCodeGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeGetStatusResponse

    /** @see getStatus */
    suspend fun getStatus(
        code: String,
        requestOptions: RequestOptions,
    ): DeviceCodeGetStatusResponse =
        getStatus(code, DeviceCodeGetStatusParams.none(), requestOptions)

    /**
     * Redeem a device code to obtain agent credentials. This endpoint is called by the agent
     * software during installation. On success, returns a Bearer access token that the agent uses
     * for all subsequent API calls. The token is returned only once and must be stored securely.
     * This endpoint does not require platform authentication — the device code itself serves as
     * proof of authorization.
     */
    suspend fun redeem(
        code: String,
        params: DeviceCodeRedeemParams = DeviceCodeRedeemParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRedeemResponse = redeem(params.toBuilder().code(code).build(), requestOptions)

    /** @see redeem */
    suspend fun redeem(
        params: DeviceCodeRedeemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRedeemResponse

    /** @see redeem */
    suspend fun redeem(code: String, requestOptions: RequestOptions): DeviceCodeRedeemResponse =
        redeem(code, DeviceCodeRedeemParams.none(), requestOptions)

    /**
     * Generate a new device code for an existing agent. Use this when the original device code has
     * expired before being redeemed, or when the agent software needs to be reinstalled. Any
     * previously issued unredeemed device codes for this agent are invalidated.
     */
    suspend fun regenerate(
        agentId: String,
        params: DeviceCodeRegenerateParams = DeviceCodeRegenerateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRegenerateResponse =
        regenerate(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see regenerate */
    suspend fun regenerate(
        params: DeviceCodeRegenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRegenerateResponse

    /** @see regenerate */
    suspend fun regenerate(
        agentId: String,
        requestOptions: RequestOptions,
    ): DeviceCodeRegenerateResponse =
        regenerate(agentId, DeviceCodeRegenerateParams.none(), requestOptions)

    /**
     * A view of [DeviceCodeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeviceCodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agents/device-codes/{code}/status`, but is
         * otherwise the same as [DeviceCodeServiceAsync.getStatus].
         */
        @MustBeClosed
        suspend fun getStatus(
            code: String,
            params: DeviceCodeGetStatusParams = DeviceCodeGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeGetStatusResponse> =
            getStatus(params.toBuilder().code(code).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        suspend fun getStatus(
            params: DeviceCodeGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeGetStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        suspend fun getStatus(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeGetStatusResponse> =
            getStatus(code, DeviceCodeGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/device-codes/{code}/redeem`, but is
         * otherwise the same as [DeviceCodeServiceAsync.redeem].
         */
        @MustBeClosed
        suspend fun redeem(
            code: String,
            params: DeviceCodeRedeemParams = DeviceCodeRedeemParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRedeemResponse> =
            redeem(params.toBuilder().code(code).build(), requestOptions)

        /** @see redeem */
        @MustBeClosed
        suspend fun redeem(
            params: DeviceCodeRedeemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRedeemResponse>

        /** @see redeem */
        @MustBeClosed
        suspend fun redeem(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRedeemResponse> =
            redeem(code, DeviceCodeRedeemParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/{agentId}/device-codes`, but is otherwise
         * the same as [DeviceCodeServiceAsync.regenerate].
         */
        @MustBeClosed
        suspend fun regenerate(
            agentId: String,
            params: DeviceCodeRegenerateParams = DeviceCodeRegenerateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRegenerateResponse> =
            regenerate(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see regenerate */
        @MustBeClosed
        suspend fun regenerate(
            params: DeviceCodeRegenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRegenerateResponse>

        /** @see regenerate */
        @MustBeClosed
        suspend fun regenerate(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRegenerateResponse> =
            regenerate(agentId, DeviceCodeRegenerateParams.none(), requestOptions)
    }
}
