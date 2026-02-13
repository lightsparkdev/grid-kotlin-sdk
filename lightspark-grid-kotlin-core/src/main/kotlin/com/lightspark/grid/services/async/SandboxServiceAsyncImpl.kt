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
import com.lightspark.grid.models.sandbox.SandboxSendFundsResponse
import com.lightspark.grid.services.async.sandbox.InternalAccountServiceAsync
import com.lightspark.grid.services.async.sandbox.InternalAccountServiceAsyncImpl
import com.lightspark.grid.services.async.sandbox.UmaServiceAsync
import com.lightspark.grid.services.async.sandbox.UmaServiceAsyncImpl

class SandboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxServiceAsync {

    private val withRawResponse: SandboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val uma: UmaServiceAsync by lazy { UmaServiceAsyncImpl(clientOptions) }

    private val internalAccounts: InternalAccountServiceAsync by lazy {
        InternalAccountServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SandboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxServiceAsync =
        SandboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun uma(): UmaServiceAsync = uma

    override fun internalAccounts(): InternalAccountServiceAsync = internalAccounts

    override suspend fun sendFunds(
        params: SandboxSendFundsParams,
        requestOptions: RequestOptions,
    ): SandboxSendFundsResponse =
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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SandboxServiceAsync.WithRawResponse =
            SandboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun uma(): UmaServiceAsync.WithRawResponse = uma

        override fun internalAccounts(): InternalAccountServiceAsync.WithRawResponse =
            internalAccounts

        private val sendFundsHandler: Handler<SandboxSendFundsResponse> =
            jsonHandler<SandboxSendFundsResponse>(clientOptions.jsonMapper)

        override suspend fun sendFunds(
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
