// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

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
import com.lightspark.grid.core.http.multipartFormData
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.paymentdocuments.PaymentDocument
import com.lightspark.grid.models.paymentdocuments.PaymentDocumentRetrieveParams
import com.lightspark.grid.models.paymentdocuments.PaymentDocumentUploadParams

/**
 * Endpoints for creating and confirming quotes for transfers, both same-currency and cross-currency
 */
class PaymentDocumentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PaymentDocumentServiceAsync {

    private val withRawResponse: PaymentDocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentDocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PaymentDocumentServiceAsync =
        PaymentDocumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: PaymentDocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentDocument =
        // get /payment-documents/{paymentDocumentId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun upload(
        params: PaymentDocumentUploadParams,
        requestOptions: RequestOptions,
    ): PaymentDocument =
        // post /payment-documents
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentDocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentDocumentServiceAsync.WithRawResponse =
            PaymentDocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<PaymentDocument> =
            jsonHandler<PaymentDocument>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PaymentDocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentDocument> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentDocumentId", params.paymentDocumentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payment-documents", params._pathParam(0))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadHandler: Handler<PaymentDocument> =
            jsonHandler<PaymentDocument>(clientOptions.jsonMapper)

        override suspend fun upload(
            params: PaymentDocumentUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentDocument> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payment-documents")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().basicAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
