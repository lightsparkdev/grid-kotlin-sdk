// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.SecurityOptions
import com.lightspark.grid.core.checkRequired
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
import com.lightspark.grid.models.receiver.ExternalAccountLookupResponse
import com.lightspark.grid.models.receiver.ReceiverLookupExternalAccountParams
import com.lightspark.grid.models.receiver.ReceiverLookupUmaParams
import com.lightspark.grid.models.receiver.UmaLookupResponse

/** Endpoints for creating and confirming quotes for cross-currency transfers */
class ReceiverServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReceiverService {

    private val withRawResponse: ReceiverService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReceiverService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReceiverService =
        ReceiverServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun lookupExternalAccount(
        params: ReceiverLookupExternalAccountParams,
        requestOptions: RequestOptions,
    ): ExternalAccountLookupResponse =
        // get /receiver/external-account/{accountId}
        withRawResponse().lookupExternalAccount(params, requestOptions).parse()

    override fun lookupUma(
        params: ReceiverLookupUmaParams,
        requestOptions: RequestOptions,
    ): UmaLookupResponse =
        // get /receiver/uma/{receiverUmaAddress}
        withRawResponse().lookupUma(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReceiverService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReceiverService.WithRawResponse =
            ReceiverServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val lookupExternalAccountHandler: Handler<ExternalAccountLookupResponse> =
            jsonHandler<ExternalAccountLookupResponse>(clientOptions.jsonMapper)

        override fun lookupExternalAccount(
            params: ReceiverLookupExternalAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccountLookupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("receiver", "external-account", params._pathParam(0))
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
                    .use { lookupExternalAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val lookupUmaHandler: Handler<UmaLookupResponse> =
            jsonHandler<UmaLookupResponse>(clientOptions.jsonMapper)

        override fun lookupUma(
            params: ReceiverLookupUmaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UmaLookupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("receiverUmaAddress", params.receiverUmaAddress())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("receiver", "uma", params._pathParam(0))
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
                    .use { lookupUmaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
