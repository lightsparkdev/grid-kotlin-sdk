// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.transferin.Transaction
import com.lightspark.grid.models.transferin.TransferInCreateParams
import com.lightspark.grid.models.transferin.TransferInRequest

/**
 * Endpoints for transferring funds between internal and external accounts with the same currency
 */
interface TransferInService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferInService

    /**
     * Transfer funds from an external account to an internal account for a specific customer. This
     * endpoint should only be used for external account sources with pull functionality (e.g. ACH
     * Pull). Otherwise, use the paymentInstructions on the internal account to deposit funds.
     */
    fun create(
        params: TransferInCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see create */
    fun create(
        transferInRequest: TransferInRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction =
        create(
            TransferInCreateParams.builder().transferInRequest(transferInRequest).build(),
            requestOptions,
        )

    /** A view of [TransferInService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransferInService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /transfer-in`, but is otherwise the same as
         * [TransferInService.create].
         */
        @MustBeClosed
        fun create(
            params: TransferInCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see create */
        @MustBeClosed
        fun create(
            transferInRequest: TransferInRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            create(
                TransferInCreateParams.builder().transferInRequest(transferInRequest).build(),
                requestOptions,
            )
    }
}
