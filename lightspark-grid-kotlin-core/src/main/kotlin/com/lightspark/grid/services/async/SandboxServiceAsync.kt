// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import com.lightspark.grid.models.sandbox.SandboxSendFundsResponse
import com.lightspark.grid.models.sandbox.SandboxSendTestParams
import com.lightspark.grid.models.sandbox.SandboxSendTestResponse
import com.lightspark.grid.services.async.sandbox.InternalAccountServiceAsync
import com.lightspark.grid.services.async.sandbox.UmaServiceAsync

interface SandboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxServiceAsync

    /** Endpoints to trigger test cases in sandbox */
    fun uma(): UmaServiceAsync

    /** Endpoints to trigger test cases in sandbox */
    fun internalAccounts(): InternalAccountServiceAsync

    /**
     * Simulate sending funds to the bank account as instructed in the quote. This endpoint is only
     * for the sandbox environment and will fail for production platforms/keys.
     */
    suspend fun sendFunds(
        params: SandboxSendFundsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxSendFundsResponse

    /** Send a test webhook to the configured endpoint */
    suspend fun sendTest(
        params: SandboxSendTestParams = SandboxSendTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxSendTestResponse

    /** @see sendTest */
    suspend fun sendTest(requestOptions: RequestOptions): SandboxSendTestResponse =
        sendTest(SandboxSendTestParams.none(), requestOptions)

    /**
     * A view of [SandboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SandboxServiceAsync.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun uma(): UmaServiceAsync.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun internalAccounts(): InternalAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/send`, but is otherwise the same as
         * [SandboxServiceAsync.sendFunds].
         */
        @MustBeClosed
        suspend fun sendFunds(
            params: SandboxSendFundsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxSendFundsResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks/test`, but is otherwise the same as
         * [SandboxServiceAsync.sendTest].
         */
        @MustBeClosed
        suspend fun sendTest(
            params: SandboxSendTestParams = SandboxSendTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxSendTestResponse>

        /** @see sendTest */
        @MustBeClosed
        suspend fun sendTest(
            requestOptions: RequestOptions
        ): HttpResponseFor<SandboxSendTestResponse> =
            sendTest(SandboxSendTestParams.none(), requestOptions)
    }
}
