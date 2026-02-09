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
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.platform.PlatformListInternalAccountsParams
import com.lightspark.grid.models.platform.PlatformListInternalAccountsResponse
import com.lightspark.grid.services.async.platform.ExternalAccountServiceAsync
import com.lightspark.grid.services.async.platform.ExternalAccountServiceAsyncImpl

class PlatformServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlatformServiceAsync {

    private val withRawResponse: PlatformServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PlatformServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlatformServiceAsync =
        PlatformServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun externalAccounts(): ExternalAccountServiceAsync = externalAccounts

    override suspend fun listInternalAccounts(
        params: PlatformListInternalAccountsParams,
        requestOptions: RequestOptions,
    ): PlatformListInternalAccountsResponse =
        // get /platform/internal-accounts
        withRawResponse().listInternalAccounts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlatformServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalAccounts: ExternalAccountServiceAsync.WithRawResponse by lazy {
            ExternalAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlatformServiceAsync.WithRawResponse =
            PlatformServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse =
            externalAccounts

        private val listInternalAccountsHandler: Handler<PlatformListInternalAccountsResponse> =
            jsonHandler<PlatformListInternalAccountsResponse>(clientOptions.jsonMapper)

        override suspend fun listInternalAccounts(
            params: PlatformListInternalAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlatformListInternalAccountsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("platform", "internal-accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInternalAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
