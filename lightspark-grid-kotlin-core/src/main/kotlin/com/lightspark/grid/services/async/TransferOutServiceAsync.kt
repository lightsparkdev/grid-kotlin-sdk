// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.transferout.TransferOutCreateParams
import com.lightspark.grid.models.transferout.TransferOutCreateResponse

interface TransferOutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferOutServiceAsync

    /** Transfer funds from an internal account to an external account for a specific customer. */
    suspend fun create(
        params: TransferOutCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferOutCreateResponse

    /**
     * A view of [TransferOutServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransferOutServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /transfer-out`, but is otherwise the same as
         * [TransferOutServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TransferOutCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferOutCreateResponse>
    }
}
