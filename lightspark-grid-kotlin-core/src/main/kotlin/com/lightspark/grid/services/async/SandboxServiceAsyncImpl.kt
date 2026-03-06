// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
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
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.services.async.sandbox.InternalAccountServiceAsync
import com.lightspark.grid.services.async.sandbox.InternalAccountServiceAsyncImpl
import com.lightspark.grid.services.async.sandbox.UmaServiceAsync
import com.lightspark.grid.services.async.sandbox.UmaServiceAsyncImpl
import com.lightspark.grid.services.async.sandbox.WebhookServiceAsync
import com.lightspark.grid.services.async.sandbox.WebhookServiceAsyncImpl

/** Endpoints to trigger test cases in sandbox */
class SandboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxServiceAsync {

    private val withRawResponse: SandboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val uma: UmaServiceAsync by lazy { UmaServiceAsyncImpl(clientOptions) }

    private val internalAccounts: InternalAccountServiceAsync by lazy {
        InternalAccountServiceAsyncImpl(clientOptions)
    }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SandboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxServiceAsync =
        SandboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Endpoints to trigger test cases in sandbox */
    override fun uma(): UmaServiceAsync = uma

    /** Endpoints to trigger test cases in sandbox */
    override fun internalAccounts(): InternalAccountServiceAsync = internalAccounts

    /** Endpoints to trigger test cases in sandbox */
    override fun webhooks(): WebhookServiceAsync = webhooks

    override suspend fun sendFunds(
        params: SandboxSendFundsParams,
        requestOptions: RequestOptions,
    ): OutgoingTransaction =
        // post /sandbox/send
        withRawResponse().sendFunds(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val uma: UmaServiceAsync.WithRawResponse by lazy {
            UmaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val internalAccounts: InternalAccountServiceAsync.WithRawResponse by lazy {
            InternalAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SandboxServiceAsync.WithRawResponse =
            SandboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Endpoints to trigger test cases in sandbox */
        override fun uma(): UmaServiceAsync.WithRawResponse = uma

        /** Endpoints to trigger test cases in sandbox */
        override fun internalAccounts(): InternalAccountServiceAsync.WithRawResponse =
            internalAccounts

        /** Endpoints to trigger test cases in sandbox */
        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        private val sendFundsHandler: Handler<OutgoingTransaction> =
            jsonHandler<OutgoingTransaction>(clientOptions.jsonMapper)

        override suspend fun sendFunds(
            params: SandboxSendFundsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OutgoingTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sandbox", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendFundsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
