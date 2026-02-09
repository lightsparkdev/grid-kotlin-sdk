// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.checkRequired
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
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccountFundParams

class InternalAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InternalAccountServiceAsync {

    private val withRawResponse: InternalAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InternalAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InternalAccountServiceAsync =
        InternalAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun fund(
        params: InternalAccountFundParams,
        requestOptions: RequestOptions,
    ): InternalAccount =
        // post /sandbox/internal-accounts/{accountId}/fund
        withRawResponse().fund(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InternalAccountServiceAsync.WithRawResponse =
            InternalAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val fundHandler: Handler<InternalAccount> =
            jsonHandler<InternalAccount>(clientOptions.jsonMapper)

        override suspend fun fund(
            params: InternalAccountFundParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sandbox", "internal-accounts", params._pathParam(0), "fund")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fundHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
