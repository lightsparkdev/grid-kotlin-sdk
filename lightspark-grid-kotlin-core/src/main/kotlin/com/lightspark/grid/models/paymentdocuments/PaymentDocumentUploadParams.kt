// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.paymentdocuments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.MultipartField
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Upload a supporting document for a payout that requires one.
 * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
 * lists which payouts need documents, the documents each `purposeOfPayment` needs, and what the
 * payout partner checks in them. Upload each file here, then pass the returned `id` values in
 * `documentIds` on `POST /quotes`. Grid attaches the files to the payment before it returns the
 * quote.
 *
 * The request must use multipart/form-data with the file in the `file` field and metadata in the
 * remaining fields. Each request uploads one file. To upload several files, send one request per
 * file. You can send them in parallel. A quote accepts up to 3 documents.
 *
 * Supported formats are PDF, JPEG, and PNG. Grid detects the format from the file contents, not the
 * file name. The file must be from 1 to 8,000,000 bytes. An empty file, a larger file, and any
 * other format return `400 INVALID_INPUT`.
 *
 * A payment document:
 * - can be used until its `expiresAt`, 24 hours after upload
 * - can be used on one quote only, and only on a quote for the customer in `customerId`, or on the
 *   platform's own quote when `customerId` is omitted
 * - has its file deleted by Grid once it is attached to the payment
 *
 * Grid does not check what a document says. The payout partner reviews each document after Grid
 * attaches it, and may reject or delay the payout. A successful attachment means the payout partner
 * received the file, not that it approved it.
 */
class PaymentDocumentUploadParams
private constructor(
    private val paymentDocumentUploadRequest: PaymentDocumentUploadRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * What the file is. To fill a requirement, use one of the types it accepts, as listed in
     * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): PaymentDocumentType = paymentDocumentUploadRequest.documentType()

    /**
     * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files and
     * detects the format from the file contents, not the file name. An empty file, a larger file,
     * and any other format return `400 INVALID_INPUT`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = paymentDocumentUploadRequest.file()

    /**
     * ID of the sending customer whose payment this document supports. The document can only be
     * used on this customer's quotes. Omit it when the platform itself is the sender, as on a quote
     * with no `customerId`. The document can then only be used on the platform's own quotes.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = paymentDocumentUploadRequest.customerId()

    /**
     * Returns the raw multipart value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentType(): MultipartField<PaymentDocumentType> =
        paymentDocumentUploadRequest._documentType()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = paymentDocumentUploadRequest._file()

    /**
     * Returns the raw multipart value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _customerId(): MultipartField<String> = paymentDocumentUploadRequest._customerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        paymentDocumentUploadRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentDocumentUploadParams].
         *
         * The following fields are required:
         * ```kotlin
         * .documentType()
         * .file()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentDocumentUploadParams]. */
    class Builder internal constructor() {

        private var paymentDocumentUploadRequest: PaymentDocumentUploadRequest.Builder =
            PaymentDocumentUploadRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentDocumentUploadParams: PaymentDocumentUploadParams) = apply {
            paymentDocumentUploadRequest =
                paymentDocumentUploadParams.paymentDocumentUploadRequest.toBuilder()
            additionalHeaders = paymentDocumentUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentDocumentUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [documentType]
         * - [file]
         * - [customerId]
         */
        fun paymentDocumentUploadRequest(
            paymentDocumentUploadRequest: PaymentDocumentUploadRequest
        ) = apply { this.paymentDocumentUploadRequest = paymentDocumentUploadRequest.toBuilder() }

        /**
         * What the file is. To fill a requirement, use one of the types it accepts, as listed in
         * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents).
         */
        fun documentType(documentType: PaymentDocumentType) = apply {
            paymentDocumentUploadRequest.documentType(documentType)
        }

        /**
         * Sets [Builder.documentType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentType] with a well-typed [PaymentDocumentType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentType(documentType: MultipartField<PaymentDocumentType>) = apply {
            paymentDocumentUploadRequest.documentType(documentType)
        }

        /**
         * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files and
         * detects the format from the file contents, not the file name. An empty file, a larger
         * file, and any other format return `400 INVALID_INPUT`.
         */
        fun file(file: InputStream) = apply { paymentDocumentUploadRequest.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply {
            paymentDocumentUploadRequest.file(file)
        }

        /**
         * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files and
         * detects the format from the file contents, not the file name. An empty file, a larger
         * file, and any other format return `400 INVALID_INPUT`.
         */
        fun file(file: ByteArray) = apply { paymentDocumentUploadRequest.file(file) }

        /**
         * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files and
         * detects the format from the file contents, not the file name. An empty file, a larger
         * file, and any other format return `400 INVALID_INPUT`.
         */
        fun file(path: Path) = apply { paymentDocumentUploadRequest.file(path) }

        /**
         * ID of the sending customer whose payment this document supports. The document can only be
         * used on this customer's quotes. Omit it when the platform itself is the sender, as on a
         * quote with no `customerId`. The document can then only be used on the platform's own
         * quotes.
         */
        fun customerId(customerId: String) = apply {
            paymentDocumentUploadRequest.customerId(customerId)
        }

        /**
         * Sets [Builder.customerId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: MultipartField<String>) = apply {
            paymentDocumentUploadRequest.customerId(customerId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            paymentDocumentUploadRequest.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            paymentDocumentUploadRequest.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                paymentDocumentUploadRequest.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            paymentDocumentUploadRequest.removeAdditionalProperty(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            paymentDocumentUploadRequest.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [PaymentDocumentUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .documentType()
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentDocumentUploadParams =
            PaymentDocumentUploadParams(
                paymentDocumentUploadRequest.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "documentType" to _documentType(),
                "file" to _file(),
                "customerId" to _customerId(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class PaymentDocumentUploadRequest
    private constructor(
        private val documentType: MultipartField<PaymentDocumentType>,
        private val file: MultipartField<InputStream>,
        private val customerId: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * What the file is. To fill a requirement, use one of the types it accepts, as listed in
         * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): PaymentDocumentType = documentType.value.getRequired("documentType")

        /**
         * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files and
         * detects the format from the file contents, not the file name. An empty file, a larger
         * file, and any other format return `400 INVALID_INPUT`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * ID of the sending customer whose payment this document supports. The document can only be
         * used on this customer's quotes. Omit it when the platform itself is the sender, as on a
         * quote with no `customerId`. The document can then only be used on the platform's own
         * quotes.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.value.getNullable("customerId")

        /**
         * Returns the raw multipart value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("documentType")
        @ExcludeMissing
        fun _documentType(): MultipartField<PaymentDocumentType> = documentType

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): MultipartField<String> = customerId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PaymentDocumentUploadRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * .file()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentDocumentUploadRequest]. */
        class Builder internal constructor() {

            private var documentType: MultipartField<PaymentDocumentType>? = null
            private var file: MultipartField<InputStream>? = null
            private var customerId: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentDocumentUploadRequest: PaymentDocumentUploadRequest) = apply {
                documentType = paymentDocumentUploadRequest.documentType
                file = paymentDocumentUploadRequest.file
                customerId = paymentDocumentUploadRequest.customerId
                additionalProperties =
                    paymentDocumentUploadRequest.additionalProperties.toMutableMap()
            }

            /**
             * What the file is. To fill a requirement, use one of the types it accepts, as listed
             * in
             * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents).
             */
            fun documentType(documentType: PaymentDocumentType) =
                documentType(MultipartField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentType] with a well-typed
             * [PaymentDocumentType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun documentType(documentType: MultipartField<PaymentDocumentType>) = apply {
                this.documentType = documentType
            }

            /**
             * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files
             * and detects the format from the file contents, not the file name. An empty file, a
             * larger file, and any other format return `400 INVALID_INPUT`.
             */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /**
             * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files
             * and detects the format from the file contents, not the file name. An empty file, a
             * larger file, and any other format return `400 INVALID_INPUT`.
             */
            fun file(file: ByteArray) = file(file.inputStream())

            /**
             * The document file, from 1 to 8,000,000 bytes. Grid accepts PDF, JPEG, and PNG files
             * and detects the format from the file contents, not the file name. An empty file, a
             * larger file, and any other format return `400 INVALID_INPUT`.
             */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /**
             * ID of the sending customer whose payment this document supports. The document can
             * only be used on this customer's quotes. Omit it when the platform itself is the
             * sender, as on a quote with no `customerId`. The document can then only be used on the
             * platform's own quotes.
             */
            fun customerId(customerId: String) = customerId(MultipartField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: MultipartField<String>) = apply {
                this.customerId = customerId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PaymentDocumentUploadRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentDocumentUploadRequest =
                PaymentDocumentUploadRequest(
                    checkRequired("documentType", documentType),
                    checkRequired("file", file),
                    customerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): PaymentDocumentUploadRequest = apply {
            if (validated) {
                return@apply
            }

            documentType().validate()
            file()
            customerId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LightsparkGridInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentDocumentUploadRequest &&
                documentType == other.documentType &&
                file == other.file &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentType, file, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentDocumentUploadRequest{documentType=$documentType, file=$file, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentDocumentUploadParams &&
            paymentDocumentUploadRequest == other.paymentDocumentUploadRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(paymentDocumentUploadRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentDocumentUploadParams{paymentDocumentUploadRequest=$paymentDocumentUploadRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
