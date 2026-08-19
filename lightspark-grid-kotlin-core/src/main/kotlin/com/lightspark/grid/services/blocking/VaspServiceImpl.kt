// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.SecurityOptions
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
import com.lightspark.grid.models.vasps.VaspListParams
import com.lightspark.grid.models.vasps.VaspListResponse

/**
 * Directory of Virtual Asset Service Providers (exchanges and other custodial platforms) recognized
 * for counterparty declarations.
 */
class VaspServiceImpl internal constructor(private val clientOptions: ClientOptions) : VaspService {

    private val withRawResponse: VaspService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VaspService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VaspService =
        VaspServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(params: VaspListParams, requestOptions: RequestOptions): VaspListResponse =
        // get /vasps
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VaspService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VaspService.WithRawResponse =
            VaspServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listHandler: Handler<VaspListResponse> =
            jsonHandler<VaspListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VaspListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaspListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vasps")
                    .build()
                    .prepare(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
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
