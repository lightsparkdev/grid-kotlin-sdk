// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import com.lightspark.grid.models.sandbox.SandboxSendFundsResponse
import com.lightspark.grid.models.sandbox.SandboxSendTestParams
import com.lightspark.grid.models.sandbox.SandboxSendTestResponse
import com.lightspark.grid.services.blocking.sandbox.InternalAccountService
import com.lightspark.grid.services.blocking.sandbox.UmaService

interface SandboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxService

    fun uma(): UmaService

    fun internalAccounts(): InternalAccountService

    /**
     * Simulate sending funds to the bank account as instructed in the quote. This endpoint is only
     * for the sandbox environment and will fail for production platforms/keys.
     */
    fun sendFunds(
        params: SandboxSendFundsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxSendFundsResponse

    /** Send a test webhook to the configured endpoint */
    fun sendTest(
        params: SandboxSendTestParams = SandboxSendTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxSendTestResponse

    /** @see sendTest */
    fun sendTest(requestOptions: RequestOptions): SandboxSendTestResponse =
        sendTest(SandboxSendTestParams.none(), requestOptions)

    /** A view of [SandboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxService.WithRawResponse

        fun uma(): UmaService.WithRawResponse

        fun internalAccounts(): InternalAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/send`, but is otherwise the same as
         * [SandboxService.sendFunds].
         */
        @MustBeClosed
        fun sendFunds(
            params: SandboxSendFundsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxSendFundsResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks/test`, but is otherwise the same as
         * [SandboxService.sendTest].
         */
        @MustBeClosed
        fun sendTest(
            params: SandboxSendTestParams = SandboxSendTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxSendTestResponse>

        /** @see sendTest */
        @MustBeClosed
        fun sendTest(requestOptions: RequestOptions): HttpResponseFor<SandboxSendTestResponse> =
            sendTest(SandboxSendTestParams.none(), requestOptions)
    }
}
