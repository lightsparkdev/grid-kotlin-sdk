// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.lightspark.grid.core.MultipartField
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import java.util.Objects

/**
 * Replace an existing document with a new file and/or updated metadata. This is useful when a
 * document was rejected and needs to be re-uploaded. The request must use multipart/form-data.
 */
class DocumentReplaceParams
private constructor(
    private val documentId: String?,
    private val documentReplaceRequest: DocumentReplaceRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun documentId(): String? = documentId

    /** Replace an existing document. */
    fun documentReplaceRequest(): DocumentReplaceRequest = documentReplaceRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentReplaceParams].
         *
         * The following fields are required:
         * ```kotlin
         * .documentReplaceRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentReplaceParams]. */
    class Builder internal constructor() {

        private var documentId: String? = null
        private var documentReplaceRequest: DocumentReplaceRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentReplaceParams: DocumentReplaceParams) = apply {
            documentId = documentReplaceParams.documentId
            documentReplaceRequest = documentReplaceParams.documentReplaceRequest
            additionalHeaders = documentReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentReplaceParams.additionalQueryParams.toBuilder()
        }

        fun documentId(documentId: String?) = apply { this.documentId = documentId }

        /** Replace an existing document. */
        fun documentReplaceRequest(documentReplaceRequest: DocumentReplaceRequest) = apply {
            this.documentReplaceRequest = documentReplaceRequest
        }

        /**
         * Alias for calling [documentReplaceRequest] with
         * `DocumentReplaceRequest.ofIdentity(identity)`.
         */
        fun documentReplaceRequest(identity: IdentityDocumentReplaceRequest) =
            documentReplaceRequest(DocumentReplaceRequest.ofIdentity(identity))

        /**
         * Alias for calling [documentReplaceRequest] with
         * `DocumentReplaceRequest.ofNonIdentity(nonIdentity)`.
         */
        fun documentReplaceRequest(nonIdentity: NonIdentityDocumentReplaceRequest) =
            documentReplaceRequest(DocumentReplaceRequest.ofNonIdentity(nonIdentity))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DocumentReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .documentReplaceRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentReplaceParams =
            DocumentReplaceParams(
                documentId,
                checkRequired("documentReplaceRequest", documentReplaceRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("DocumentReplaceRequest" to _documentReplaceRequest()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> documentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentReplaceParams &&
            documentId == other.documentId &&
            documentReplaceRequest == other.documentReplaceRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(documentId, documentReplaceRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentReplaceParams{documentId=$documentId, documentReplaceRequest=$documentReplaceRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
