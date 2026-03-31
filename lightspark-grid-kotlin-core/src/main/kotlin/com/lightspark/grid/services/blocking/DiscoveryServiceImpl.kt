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
import com.lightspark.grid.models.discoveries.DiscoveryListParams
import com.lightspark.grid.models.discoveries.DiscoveryListResponse

/**
 * Endpoints for discovering available payment rails, banks, and providers for a given country and
 * currency corridor.
 */
class DiscoveryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DiscoveryService {

    private val withRawResponse: DiscoveryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DiscoveryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DiscoveryService =
        DiscoveryServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: DiscoveryListParams,
        requestOptions: RequestOptions,
    ): DiscoveryListResponse =
        // get /discoveries
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DiscoveryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DiscoveryService.WithRawResponse =
            DiscoveryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<DiscoveryListResponse> =
            jsonHandler<DiscoveryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DiscoveryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DiscoveryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("discoveries")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
