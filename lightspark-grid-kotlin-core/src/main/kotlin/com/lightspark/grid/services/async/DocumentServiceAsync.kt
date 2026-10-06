// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.documents.Document
import com.lightspark.grid.models.documents.DocumentDeleteParams
import com.lightspark.grid.models.documents.DocumentListPageAsync
import com.lightspark.grid.models.documents.DocumentListParams
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.DocumentRetrieveParams
import com.lightspark.grid.models.documents.DocumentUploadParams

/**
 * Endpoints for uploading and managing verification documents for customers and beneficial owners.
 * Supports KYC and KYB document requirements.
 */
interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentServiceAsync

    /** Retrieve details and metadata of a specific document by ID. */
    suspend fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document = retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** @see retrieve */
    suspend fun retrieve(documentId: String, requestOptions: RequestOptions): Document =
        retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

    /** Retrieve a list of documents with optional filtering by document holder. */
    suspend fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DocumentListPageAsync =
        list(DocumentListParams.none(), requestOptions)

    /**
     * Delete an uploaded document. This cannot be undone. Documents that have already been
     * submitted for verification may not be deletable.
     */
    suspend fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(documentId: String, requestOptions: RequestOptions) =
        delete(documentId, DocumentDeleteParams.none(), requestOptions)

    /**
     * Replace an existing document with a new file and/or updated metadata. The request must use
     * multipart/form-data.
     *
     * Use this when a stored document was rejected during review, which arrives as an entry in the
     * verification's `errors` array rather than as an error on upload. Replacing marks the
     * previously submitted file inactive, which a second `POST /documents` would not do: that
     * leaves the rejected file active alongside the new one, and the rejection can carry. Call
     * `POST /verifications` afterwards to start a new review, since existing errors persist until a
     * new review produces a new verdict.
     *
     * A file rejected on upload with `422 DOCUMENT_REJECTED` never creates a document, so there is
     * nothing to replace. Retry those with `POST /documents`.
     *
     * Supported file types: `application/pdf`, `image/jpeg`, and `image/png`. Grid matches on the
     * `Content-Type` of the multipart part, not the file extension. Any other type, and any file
     * over 10 MB, returns `400 INVALID_INPUT`.
     *
     * Grid forwards the file to its verification provider, which screens it as the request is
     * handled and can reject it with `422 DOCUMENT_REJECTED`. To pass that screen, a photo or scan
     * of a document must:
     * - show the whole document, with all four corners inside the frame and nothing overlapping an
     *   edge
     * - be in focus and free of glare, so every field and the machine-readable zone can be read
     * - be in color, not a black-and-white copy
     * - be a photo or scan of the physical document, not a screen capture, and not retouched in an
     *   image editor
     * - be unexpired
     */
    suspend fun replace(
        documentId: String,
        params: DocumentReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document = replace(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see replace */
    suspend fun replace(
        params: DocumentReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /**
     * Upload a verification document for a customer or beneficial owner. The request must use
     * multipart/form-data with the file in the `file` field and metadata in the remaining fields.
     *
     * Supported file types: `application/pdf`, `image/jpeg`, and `image/png`. Grid matches on the
     * `Content-Type` of the multipart part, not the file extension. Any other type, and any file
     * over 10 MB, returns `400 INVALID_INPUT`.
     *
     * Grid forwards the file to its verification provider, which screens it as the request is
     * handled and can reject it with `422 DOCUMENT_REJECTED`. To pass that screen, a photo or scan
     * of a document must:
     * - show the whole document, with all four corners inside the frame and nothing overlapping an
     *   edge
     * - be in focus and free of glare, so every field and the machine-readable zone can be read
     * - be in color, not a black-and-white copy
     * - be a photo or scan of the physical document, not a screen capture, and not retouched in an
     *   image editor
     * - be unexpired
     */
    suspend fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /documents/{documentId}`, but is otherwise the same
         * as [DocumentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Document> =
            retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListPageAsync> =
            list(DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /documents/{documentId}`, but is otherwise the
         * same as [DocumentServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(documentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(documentId, DocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /documents/{documentId}`, but is otherwise the same
         * as [DocumentServiceAsync.replace].
         */
        @MustBeClosed
        suspend fun replace(
            documentId: String,
            params: DocumentReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document> =
            replace(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        suspend fun replace(
            params: DocumentReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `post /documents`, but is otherwise the same as
         * [DocumentServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>
    }
}
