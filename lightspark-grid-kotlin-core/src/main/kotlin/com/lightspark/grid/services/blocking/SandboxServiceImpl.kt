// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

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
import com.lightspark.grid.core.prepare
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import com.lightspark.grid.models.sandbox.SandboxSendFundsResponse
import com.lightspark.grid.models.sandbox.SandboxSendTestWebhookParams
import com.lightspark.grid.models.sandbox.SandboxSendTestWebhookResponse
import com.lightspark.grid.services.blocking.sandbox.InternalAccountService
import com.lightspark.grid.services.blocking.sandbox.InternalAccountServiceImpl
import com.lightspark.grid.services.blocking.sandbox.UmaService
import com.lightspark.grid.services.blocking.sandbox.UmaServiceImpl

class SandboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxService {

    private val withRawResponse: SandboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val uma: UmaService by lazy { UmaServiceImpl(clientOptions) }

    private val internalAccounts: InternalAccountService by lazy {
        InternalAccountServiceImpl(clientOptions)
    }

    override fun withRawResponse(): SandboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxService =
        SandboxServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun uma(): UmaService = uma

    override fun internalAccounts(): InternalAccountService = internalAccounts

    override fun sendFunds(
        params: SandboxSendFundsParams,
        requestOptions: RequestOptions,
    ): SandboxSendFundsResponse =
        // post /sandbox/send
        withRawResponse().sendFunds(params, requestOptions).parse()

    override fun sendTestWebhook(
        params: SandboxSendTestWebhookParams,
        requestOptions: RequestOptions,
    ): SandboxSendTestWebhookResponse =
        // post /webhooks/test
        withRawResponse().sendTestWebhook(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val uma: UmaService.WithRawResponse by lazy {
            UmaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val internalAccounts: InternalAccountService.WithRawResponse by lazy {
            InternalAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SandboxService.WithRawResponse =
            SandboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun uma(): UmaService.WithRawResponse = uma

        override fun internalAccounts(): InternalAccountService.WithRawResponse = internalAccounts

        private val sendFundsHandler: Handler<SandboxSendFundsResponse> =
            jsonHandler<SandboxSendFundsResponse>(clientOptions.jsonMapper)

        override fun sendFunds(
            params: SandboxSendFundsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxSendFundsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sandbox", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val sendTestWebhookHandler: Handler<SandboxSendTestWebhookResponse> =
            jsonHandler<SandboxSendTestWebhookResponse>(clientOptions.jsonMapper)

        override fun sendTestWebhook(
            params: SandboxSendTestWebhookParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxSendTestWebhookResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", "test")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendTestWebhookHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
