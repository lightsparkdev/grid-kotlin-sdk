// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.paymentdocuments.PaymentDocument
import com.lightspark.grid.models.paymentdocuments.PaymentDocumentRetrieveParams
import com.lightspark.grid.models.paymentdocuments.PaymentDocumentUploadParams

/**
 * Endpoints for creating and confirming quotes for transfers, both same-currency and cross-currency
 */
interface PaymentDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentDocumentServiceAsync

    /**
     * Retrieve a payment document by ID. Use it to check whether the document can still be used on
     * a quote, or which quote it is attached to.
     */
    suspend fun retrieve(
        paymentDocumentId: String,
        params: PaymentDocumentRetrieveParams = PaymentDocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentDocument =
        retrieve(params.toBuilder().paymentDocumentId(paymentDocumentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PaymentDocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentDocument

    /** @see retrieve */
    suspend fun retrieve(
        paymentDocumentId: String,
        requestOptions: RequestOptions,
    ): PaymentDocument =
        retrieve(paymentDocumentId, PaymentDocumentRetrieveParams.none(), requestOptions)

    /**
     * Upload a supporting document for a payout that requires one.
     * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
     * lists which payouts need documents, the documents each `purposeOfPayment` needs, and what the
     * payout partner checks in them. Upload each file here, then pass the returned `id` values in
     * `documentIds` on `POST /quotes`. Grid attaches the files to the payment before it returns the
     * quote.
     *
     * The request must use multipart/form-data with the file in the `file` field and metadata in
     * the remaining fields. Each request uploads one file. To upload several files, send one
     * request per file. You can send them in parallel. A quote accepts up to 3 documents.
     *
     * Supported formats are PDF, JPEG, and PNG. Grid detects the format from the file contents, not
     * the file name. The file must be from 1 to 8,000,000 bytes. An empty file, a larger file, and
     * any other format return `400 INVALID_INPUT`.
     *
     * A payment document:
     * - can be used until its `expiresAt`, 24 hours after upload
     * - can be used on one quote only, and only on a quote for the customer in `customerId`, or on
     *   the platform's own quote when `customerId` is omitted
     * - has its file deleted by Grid once it is attached to the payment
     *
     * Grid does not check what a document says. The payout partner reviews each document after Grid
     * attaches it, and may reject or delay the payout. A successful attachment means the payout
     * partner received the file, not that it approved it.
     */
    suspend fun upload(
        params: PaymentDocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentDocument

    /**
     * A view of [PaymentDocumentServiceAsync] that provides access to raw HTTP responses for each
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
        ): PaymentDocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payment-documents/{paymentDocumentId}`, but is
         * otherwise the same as [PaymentDocumentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            paymentDocumentId: String,
            params: PaymentDocumentRetrieveParams = PaymentDocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentDocument> =
            retrieve(
                params.toBuilder().paymentDocumentId(paymentDocumentId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentDocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentDocument>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            paymentDocumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentDocument> =
            retrieve(paymentDocumentId, PaymentDocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payment-documents`, but is otherwise the same as
         * [PaymentDocumentServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            params: PaymentDocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentDocument>
    }
}
