// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.transferout.TransferOutCreateParams
import com.lightspark.grid.models.transferout.TransferOutCreateResponse

interface TransferOutService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferOutService

    /** Transfer funds from an internal account to an external account for a specific customer. */
    fun create(
        params: TransferOutCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferOutCreateResponse

    /**
     * A view of [TransferOutService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransferOutService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /transfer-out`, but is otherwise the same as
         * [TransferOutService.create].
         */
        @MustBeClosed
        fun create(
            params: TransferOutCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferOutCreateResponse>
    }
}
