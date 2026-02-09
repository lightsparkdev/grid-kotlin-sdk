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
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepare
import com.lightspark.grid.models.platform.PlatformListInternalAccountsParams
import com.lightspark.grid.models.platform.PlatformListInternalAccountsResponse
import com.lightspark.grid.services.blocking.platform.ExternalAccountService
import com.lightspark.grid.services.blocking.platform.ExternalAccountServiceImpl

class PlatformServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlatformService {

    private val withRawResponse: PlatformService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalAccounts: ExternalAccountService by lazy {
        ExternalAccountServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PlatformService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlatformService =
        PlatformServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun externalAccounts(): ExternalAccountService = externalAccounts

    override fun listInternalAccounts(
        params: PlatformListInternalAccountsParams,
        requestOptions: RequestOptions,
    ): PlatformListInternalAccountsResponse =
        // get /platform/internal-accounts
        withRawResponse().listInternalAccounts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlatformService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalAccounts: ExternalAccountService.WithRawResponse by lazy {
            ExternalAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlatformService.WithRawResponse =
            PlatformServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun externalAccounts(): ExternalAccountService.WithRawResponse = externalAccounts

        private val listInternalAccountsHandler: Handler<PlatformListInternalAccountsResponse> =
            jsonHandler<PlatformListInternalAccountsResponse>(clientOptions.jsonMapper)

        override fun listInternalAccounts(
            params: PlatformListInternalAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlatformListInternalAccountsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("platform", "internal-accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
