// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.documents.DocumentDeleteParams
import com.lightspark.grid.models.documents.DocumentListPageAsync
import com.lightspark.grid.models.documents.DocumentListParams
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.DocumentReplaceResponse
import com.lightspark.grid.models.documents.DocumentRetrieveParams
import com.lightspark.grid.models.documents.DocumentRetrieveResponse
import com.lightspark.grid.models.documents.DocumentUploadParams
import com.lightspark.grid.models.documents.DocumentUploadResponse

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
    ): DocumentRetrieveResponse =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        documentId: String,
        requestOptions: RequestOptions,
    ): DocumentRetrieveResponse =
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
     * Replace an existing document with a new file and/or updated metadata. This is useful when a
     * document was rejected and needs to be re-uploaded. The request must use multipart/form-data.
     */
    suspend fun replace(
        documentId: String,
        params: DocumentReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentReplaceResponse =
        replace(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see replace */
    suspend fun replace(
        params: DocumentReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentReplaceResponse

    /**
     * Upload a verification document for a customer or beneficial owner. The request must use
     * multipart/form-data with the file in the `file` field and metadata in the remaining fields.
     *
     * Supported file types: PDF, JPEG, PNG. Maximum file size: 10 MB.
     */
    suspend fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentUploadResponse

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
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetrieveResponse> =
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
        ): HttpResponseFor<DocumentReplaceResponse> =
            replace(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        suspend fun replace(
            params: DocumentReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentReplaceResponse>

        /**
         * Returns a raw HTTP response for `post /documents`, but is otherwise the same as
         * [DocumentServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentUploadResponse>
    }
}
