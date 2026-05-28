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
import com.lightspark.grid.models.crypto.CryptoEstimateWithdrawalFeeParams
import com.lightspark.grid.models.crypto.CryptoEstimateWithdrawalFeeResponse

/** Endpoints for creating and confirming quotes for cross-currency transfers */
class CryptoServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CryptoService {

    private val withRawResponse: CryptoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CryptoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CryptoService =
        CryptoServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun estimateWithdrawalFee(
        params: CryptoEstimateWithdrawalFeeParams,
        requestOptions: RequestOptions,
    ): CryptoEstimateWithdrawalFeeResponse =
        // post /crypto/estimate-withdrawal-fee
        withRawResponse().estimateWithdrawalFee(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CryptoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CryptoService.WithRawResponse =
            CryptoServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val estimateWithdrawalFeeHandler: Handler<CryptoEstimateWithdrawalFeeResponse> =
            jsonHandler<CryptoEstimateWithdrawalFeeResponse>(clientOptions.jsonMapper)

        override fun estimateWithdrawalFee(
            params: CryptoEstimateWithdrawalFeeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CryptoEstimateWithdrawalFeeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crypto", "estimate-withdrawal-fee")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { estimateWithdrawalFeeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
