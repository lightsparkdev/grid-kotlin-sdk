// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
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
interface DeviceCodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceCodeService

    /**
     * Generate a new device code for an existing agent. Use this when the original device code has
     * expired before being redeemed, or when the agent software needs to be reinstalled. Any
     * previously issued unredeemed device codes for this agent are invalidated.
     */
    fun deviceCodes(
        agentId: String,
        params: DeviceCodeDeviceCodesParams = DeviceCodeDeviceCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeDeviceCodesResponse =
        deviceCodes(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see deviceCodes */
    fun deviceCodes(
        params: DeviceCodeDeviceCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeDeviceCodesResponse

    /** @see deviceCodes */
    fun deviceCodes(
        agentId: String,
        requestOptions: RequestOptions,
    ): DeviceCodeDeviceCodesResponse =
        deviceCodes(agentId, DeviceCodeDeviceCodesParams.none(), requestOptions)

    /**
     * Redeem a device code to obtain agent credentials. This endpoint is called by the agent
     * software during installation. On success, returns a Bearer access token that the agent uses
     * for all subsequent API calls. The token is returned only once and must be stored securely.
     * This endpoint does not require platform authentication — the device code itself serves as
     * proof of authorization.
     */
    fun redeem(
        code: String,
        params: DeviceCodeRedeemParams = DeviceCodeRedeemParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRedeemResponse = redeem(params.toBuilder().code(code).build(), requestOptions)

    /** @see redeem */
    fun redeem(
        params: DeviceCodeRedeemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRedeemResponse

    /** @see redeem */
    fun redeem(code: String, requestOptions: RequestOptions): DeviceCodeRedeemResponse =
        redeem(code, DeviceCodeRedeemParams.none(), requestOptions)

    /**
     * Check whether a device code has been redeemed. Use this to poll for agent installation
     * completion after creating an agent.
     */
    fun retrieveStatus(
        code: String,
        params: DeviceCodeRetrieveStatusParams = DeviceCodeRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRetrieveStatusResponse =
        retrieveStatus(params.toBuilder().code(code).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: DeviceCodeRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceCodeRetrieveStatusResponse

    /** @see retrieveStatus */
    fun retrieveStatus(
        code: String,
        requestOptions: RequestOptions,
    ): DeviceCodeRetrieveStatusResponse =
        retrieveStatus(code, DeviceCodeRetrieveStatusParams.none(), requestOptions)

    /** A view of [DeviceCodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeviceCodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agents/{agentId}/device-codes`, but is otherwise
         * the same as [DeviceCodeService.deviceCodes].
         */
        @MustBeClosed
        fun deviceCodes(
            agentId: String,
            params: DeviceCodeDeviceCodesParams = DeviceCodeDeviceCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeDeviceCodesResponse> =
            deviceCodes(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see deviceCodes */
        @MustBeClosed
        fun deviceCodes(
            params: DeviceCodeDeviceCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeDeviceCodesResponse>

        /** @see deviceCodes */
        @MustBeClosed
        fun deviceCodes(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeDeviceCodesResponse> =
            deviceCodes(agentId, DeviceCodeDeviceCodesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/device-codes/{code}/redeem`, but is
         * otherwise the same as [DeviceCodeService.redeem].
         */
        @MustBeClosed
        fun redeem(
            code: String,
            params: DeviceCodeRedeemParams = DeviceCodeRedeemParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRedeemResponse> =
            redeem(params.toBuilder().code(code).build(), requestOptions)

        /** @see redeem */
        @MustBeClosed
        fun redeem(
            params: DeviceCodeRedeemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRedeemResponse>

        /** @see redeem */
        @MustBeClosed
        fun redeem(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRedeemResponse> =
            redeem(code, DeviceCodeRedeemParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agents/device-codes/{code}/status`, but is
         * otherwise the same as [DeviceCodeService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(
            code: String,
            params: DeviceCodeRetrieveStatusParams = DeviceCodeRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().code(code).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: DeviceCodeRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceCodeRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceCodeRetrieveStatusResponse> =
            retrieveStatus(code, DeviceCodeRetrieveStatusParams.none(), requestOptions)
    }
}
