// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.webhooks.WebhookSendTestParams
import com.lightspark.grid.models.webhooks.WebhookSendTestResponse

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync

    /** Send a test webhook to the configured endpoint */
    suspend fun sendTest(
        params: WebhookSendTestParams = WebhookSendTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSendTestResponse

    /** @see sendTest */
    suspend fun sendTest(requestOptions: RequestOptions): WebhookSendTestResponse =
        sendTest(WebhookSendTestParams.none(), requestOptions)

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/test`, but is otherwise the same as
         * [WebhookServiceAsync.sendTest].
         */
        @MustBeClosed
        suspend fun sendTest(
            params: WebhookSendTestParams = WebhookSendTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSendTestResponse>

        /** @see sendTest */
        @MustBeClosed
        suspend fun sendTest(
            requestOptions: RequestOptions
        ): HttpResponseFor<WebhookSendTestResponse> =
            sendTest(WebhookSendTestParams.none(), requestOptions)
    }
}
