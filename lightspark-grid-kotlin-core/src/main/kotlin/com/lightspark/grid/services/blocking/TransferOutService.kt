// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.transferin.Transaction
import com.lightspark.grid.models.transferout.TransferOutCreateParams
import com.lightspark.grid.models.transferout.TransferOutRequest

/**
 * Deprecated endpoints for transferring funds between internal and external accounts with the same
 * currency. Use the quote endpoints under Cross-Currency Transfers instead, which now serve
 * same-currency transfers as well.
 */
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

    /**
     * **Deprecated. Use `POST /quotes` instead.**
     *
     * Same-currency transfers are now served by the quote endpoint. Create a quote with an internal
     * account source and an external account destination and set `immediatelyExecute: true` to move
     * the funds in a single request, exactly as this endpoint does. This endpoint continues to work
     * and its request and response shapes are unchanged.
     *
     * To migrate a request to `POST /quotes`:
     * - add `sourceType: ACCOUNT` to `source` and `destinationType: ACCOUNT` to `destination`; the
     *   account IDs and `destination.paymentRail` are unchanged
     * - rename `amount` to `lockedCurrencyAmount` and add `lockedCurrencySide: SENDING`
     * - `remittanceInformation` and `purposeOfPayment` carry over unchanged
     * - add `immediatelyExecute: true` to keep the single-request behavior
     *
     * The quote response is a `Quote` rather than a `Transaction`; read `transactionId` from it to
     * track the resulting transaction.
     *
     * Transfer funds from an internal account to an external account for a specific customer.
     */
    @Deprecated("deprecated")
    fun create(
        params: TransferOutCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        transferOutRequest: TransferOutRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction =
        create(
            TransferOutCreateParams.builder().transferOutRequest(transferOutRequest).build(),
            requestOptions,
        )

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
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: TransferOutCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            transferOutRequest: TransferOutRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            create(
                TransferOutCreateParams.builder().transferOutRequest(transferOutRequest).build(),
                requestOptions,
            )
    }
}
