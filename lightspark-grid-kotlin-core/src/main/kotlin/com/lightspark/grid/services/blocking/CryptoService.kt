// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.crypto.CryptoEstimateWithdrawalFeeParams
import com.lightspark.grid.models.crypto.CryptoEstimateWithdrawalFeeResponse

/** Endpoints for creating and confirming quotes for cross-currency transfers */
interface CryptoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CryptoService

    /**
     * Estimate the network and application fees for a cryptocurrency withdrawal from a crypto
     * internal account to an external blockchain address. Use this to show fee information to
     * customers before they initiate a withdrawal.
     */
    fun estimateWithdrawalFee(
        params: CryptoEstimateWithdrawalFeeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CryptoEstimateWithdrawalFeeResponse

    /** A view of [CryptoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CryptoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crypto/estimate-withdrawal-fee`, but is otherwise
         * the same as [CryptoService.estimateWithdrawalFee].
         */
        @MustBeClosed
        fun estimateWithdrawalFee(
            params: CryptoEstimateWithdrawalFeeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CryptoEstimateWithdrawalFeeResponse>
    }
}
