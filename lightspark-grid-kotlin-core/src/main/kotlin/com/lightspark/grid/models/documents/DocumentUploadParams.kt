// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
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
 * Upload a verification document for a customer or beneficial owner. The request must use
 * multipart/form-data with the file in the `file` field and metadata in the remaining fields.
 *
 * Supported file types: PDF, JPEG, PNG. Maximum file size: 10 MB.
 */
class DocumentUploadParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Country that issued the document (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = body.country()

    /**
     * ID of the entity that owns this document. Can be a Customer ID or a BeneficialOwner ID.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentHolder(): String = body.documentHolder()

    /**
     * Type of identity or business verification document. Document types are grouped by
     * verification category: **Identity** — PASSPORT, DRIVERS_LICENSE, NATIONAL_ID **Business —
     * Legal presence** — CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION,
     * ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT **Business — Company details** —
     * INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION,
     * ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE,
     * GOOD_STANDING_CERTIFICATE **Business — Control structure** — ARTICLES_OF_INCORPORATION,
     * ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT,
     * STATE_REGISTRY_EXCERPT **Business — Ownership structure** — SHAREHOLDER_REGISTER,
     * INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT,
     * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION **Proof of address** — PROOF_OF_ADDRESS
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): DocumentType = body.documentType()

    /**
     * The document file (PDF, JPEG, or PNG, max 10 MB)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * Document identification number (e.g., passport number)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentNumber(): String? = body.documentNumber()

    /**
     * Which side of the document (for two-sided documents like driver's licenses)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun side(): Side? = body.side()

    /**
     * Returns the raw multipart value of [country].
     *
     * Unlike [country], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _country(): MultipartField<String> = body._country()

    /**
     * Returns the raw multipart value of [documentHolder].
     *
     * Unlike [documentHolder], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentHolder(): MultipartField<String> = body._documentHolder()

    /**
     * Returns the raw multipart value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentType(): MultipartField<DocumentType> = body._documentType()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [documentNumber].
     *
     * Unlike [documentNumber], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentNumber(): MultipartField<String> = body._documentNumber()

    /**
     * Returns the raw multipart value of [side].
     *
     * Unlike [side], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _side(): MultipartField<Side> = body._side()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentUploadParams].
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * .documentHolder()
         * .documentType()
         * .file()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentUploadParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentUploadParams: DocumentUploadParams) = apply {
            body = documentUploadParams.body.toBuilder()
            additionalHeaders = documentUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [country]
         * - [documentHolder]
         * - [documentType]
         * - [file]
         * - [documentNumber]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Country that issued the document (ISO 3166-1 alpha-2) */
        fun country(country: String) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary multipart value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: MultipartField<String>) = apply { body.country(country) }

        /**
         * ID of the entity that owns this document. Can be a Customer ID or a BeneficialOwner ID.
         */
        fun documentHolder(documentHolder: String) = apply { body.documentHolder(documentHolder) }

        /**
         * Sets [Builder.documentHolder] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentHolder] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentHolder(documentHolder: MultipartField<String>) = apply {
            body.documentHolder(documentHolder)
        }

        /**
         * Type of identity or business verification document. Document types are grouped by
         * verification category: **Identity** — PASSPORT, DRIVERS_LICENSE, NATIONAL_ID **Business —
         * Legal presence** — CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT **Business — Company details** —
         * INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE,
         * GOOD_STANDING_CERTIFICATE **Business — Control structure** — ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT,
         * STATE_REGISTRY_EXCERPT **Business — Ownership structure** — SHAREHOLDER_REGISTER,
         * INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT,
         * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION **Proof of address** —
         * PROOF_OF_ADDRESS
         */
        fun documentType(documentType: DocumentType) = apply { body.documentType(documentType) }

        /**
         * Sets [Builder.documentType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: MultipartField<DocumentType>) = apply {
            body.documentType(documentType)
        }

        /** The document file (PDF, JPEG, or PNG, max 10 MB) */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** The document file (PDF, JPEG, or PNG, max 10 MB) */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** The document file (PDF, JPEG, or PNG, max 10 MB) */
        fun file(path: Path) = apply { body.file(path) }

        /** Document identification number (e.g., passport number) */
        fun documentNumber(documentNumber: String) = apply { body.documentNumber(documentNumber) }

        /**
         * Sets [Builder.documentNumber] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentNumber(documentNumber: MultipartField<String>) = apply {
            body.documentNumber(documentNumber)
        }

        /** Which side of the document (for two-sided documents like driver's licenses) */
        fun side(side: Side) = apply { body.side(side) }

        /**
         * Sets [Builder.side] to an arbitrary multipart value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: MultipartField<Side>) = apply { body.side(side) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [DocumentUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * .documentHolder()
         * .documentType()
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUploadParams =
            DocumentUploadParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "country" to _country(),
                "documentHolder" to _documentHolder(),
                "documentType" to _documentType(),
                "file" to _file(),
                "documentNumber" to _documentNumber(),
                "side" to _side(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val country: MultipartField<String>,
        private val documentHolder: MultipartField<String>,
        private val documentType: MultipartField<DocumentType>,
        private val file: MultipartField<InputStream>,
        private val documentNumber: MultipartField<String>,
        private val side: MultipartField<Side>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Country that issued the document (ISO 3166-1 alpha-2)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.value.getRequired("country")

        /**
         * ID of the entity that owns this document. Can be a Customer ID or a BeneficialOwner ID.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentHolder(): String = documentHolder.value.getRequired("documentHolder")

        /**
         * Type of identity or business verification document. Document types are grouped by
         * verification category: **Identity** — PASSPORT, DRIVERS_LICENSE, NATIONAL_ID **Business —
         * Legal presence** — CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT **Business — Company details** —
         * INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE,
         * GOOD_STANDING_CERTIFICATE **Business — Control structure** — ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT,
         * STATE_REGISTRY_EXCERPT **Business — Ownership structure** — SHAREHOLDER_REGISTER,
         * INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT,
         * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION **Proof of address** —
         * PROOF_OF_ADDRESS
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.value.getRequired("documentType")

        /**
         * The document file (PDF, JPEG, or PNG, max 10 MB)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * Document identification number (e.g., passport number)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentNumber(): String? = documentNumber.value.getNullable("documentNumber")

        /**
         * Which side of the document (for two-sided documents like driver's licenses)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun side(): Side? = side.value.getNullable("side")

        /**
         * Returns the raw multipart value of [country].
         *
         * Unlike [country], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): MultipartField<String> = country

        /**
         * Returns the raw multipart value of [documentHolder].
         *
         * Unlike [documentHolder], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("documentHolder")
        @ExcludeMissing
        fun _documentHolder(): MultipartField<String> = documentHolder

        /**
         * Returns the raw multipart value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("documentType")
        @ExcludeMissing
        fun _documentType(): MultipartField<DocumentType> = documentType

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [documentNumber].
         *
         * Unlike [documentNumber], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("documentNumber")
        @ExcludeMissing
        fun _documentNumber(): MultipartField<String> = documentNumber

        /**
         * Returns the raw multipart value of [side].
         *
         * Unlike [side], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("side") @ExcludeMissing fun _side(): MultipartField<Side> = side

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .documentHolder()
             * .documentType()
             * .file()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var country: MultipartField<String>? = null
            private var documentHolder: MultipartField<String>? = null
            private var documentType: MultipartField<DocumentType>? = null
            private var file: MultipartField<InputStream>? = null
            private var documentNumber: MultipartField<String> = MultipartField.of(null)
            private var side: MultipartField<Side> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                country = body.country
                documentHolder = body.documentHolder
                documentType = body.documentType
                file = body.file
                documentNumber = body.documentNumber
                side = body.side
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Country that issued the document (ISO 3166-1 alpha-2) */
            fun country(country: String) = country(MultipartField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary multipart value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: MultipartField<String>) = apply { this.country = country }

            /**
             * ID of the entity that owns this document. Can be a Customer ID or a BeneficialOwner
             * ID.
             */
            fun documentHolder(documentHolder: String) =
                documentHolder(MultipartField.of(documentHolder))

            /**
             * Sets [Builder.documentHolder] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentHolder] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentHolder(documentHolder: MultipartField<String>) = apply {
                this.documentHolder = documentHolder
            }

            /**
             * Type of identity or business verification document. Document types are grouped by
             * verification category: **Identity** — PASSPORT, DRIVERS_LICENSE, NATIONAL_ID
             * **Business — Legal presence** — CERTIFICATE_OF_INCORPORATION,
             * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT **Business
             * — Company details** — INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT,
             * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION,
             * INCUMBENCY_CERTIFICATE, GOOD_STANDING_CERTIFICATE **Business — Control structure** —
             * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE,
             * INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT **Business — Ownership structure** —
             * SHAREHOLDER_REGISTER, INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE,
             * STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION **Proof of
             * address** — PROOF_OF_ADDRESS
             */
            fun documentType(documentType: DocumentType) =
                documentType(MultipartField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: MultipartField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** The document file (PDF, JPEG, or PNG, max 10 MB) */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** The document file (PDF, JPEG, or PNG, max 10 MB) */
            fun file(file: ByteArray) = file(file.inputStream())

            /** The document file (PDF, JPEG, or PNG, max 10 MB) */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Document identification number (e.g., passport number) */
            fun documentNumber(documentNumber: String) =
                documentNumber(MultipartField.of(documentNumber))

            /**
             * Sets [Builder.documentNumber] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentNumber(documentNumber: MultipartField<String>) = apply {
                this.documentNumber = documentNumber
            }

            /** Which side of the document (for two-sided documents like driver's licenses) */
            fun side(side: Side) = side(MultipartField.of(side))

            /**
             * Sets [Builder.side] to an arbitrary multipart value.
             *
             * You should usually call [Builder.side] with a well-typed [Side] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun side(side: MultipartField<Side>) = apply { this.side = side }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .documentHolder()
             * .documentType()
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("country", country),
                    checkRequired("documentHolder", documentHolder),
                    checkRequired("documentType", documentType),
                    checkRequired("file", file),
                    documentNumber,
                    side,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            country()
            documentHolder()
            documentType().validate()
            file()
            documentNumber()
            side()?.validate()
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

            return other is Body &&
                country == other.country &&
                documentHolder == other.documentHolder &&
                documentType == other.documentType &&
                file == other.file &&
                documentNumber == other.documentNumber &&
                side == other.side &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                country,
                documentHolder,
                documentType,
                file,
                documentNumber,
                side,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{country=$country, documentHolder=$documentHolder, documentType=$documentType, file=$file, documentNumber=$documentNumber, side=$side, additionalProperties=$additionalProperties}"
    }

    /**
     * Type of identity or business verification document. Document types are grouped by
     * verification category: **Identity** — PASSPORT, DRIVERS_LICENSE, NATIONAL_ID **Business —
     * Legal presence** — CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION,
     * ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT **Business — Company details** —
     * INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION,
     * ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE,
     * GOOD_STANDING_CERTIFICATE **Business — Control structure** — ARTICLES_OF_INCORPORATION,
     * ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT,
     * STATE_REGISTRY_EXCERPT **Business — Ownership structure** — SHAREHOLDER_REGISTER,
     * INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT,
     * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION **Proof of address** — PROOF_OF_ADDRESS
     */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PASSPORT = of("PASSPORT")

            val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

            val NATIONAL_ID = of("NATIONAL_ID")

            val PROOF_OF_ADDRESS = of("PROOF_OF_ADDRESS")

            val BANK_STATEMENT = of("BANK_STATEMENT")

            val TAX_RETURN = of("TAX_RETURN")

            val CERTIFICATE_OF_INCORPORATION = of("CERTIFICATE_OF_INCORPORATION")

            val ARTICLES_OF_INCORPORATION = of("ARTICLES_OF_INCORPORATION")

            val ARTICLES_OF_ASSOCIATION = of("ARTICLES_OF_ASSOCIATION")

            val STATE_REGISTRY_EXCERPT = of("STATE_REGISTRY_EXCERPT")

            val GOOD_STANDING_CERTIFICATE = of("GOOD_STANDING_CERTIFICATE")

            val INFORMATION_STATEMENT = of("INFORMATION_STATEMENT")

            val INCUMBENCY_CERTIFICATE = of("INCUMBENCY_CERTIFICATE")

            val BUSINESS_LICENSE = of("BUSINESS_LICENSE")

            val SHAREHOLDER_REGISTER = of("SHAREHOLDER_REGISTER")

            val POWER_OF_ATTORNEY = of("POWER_OF_ATTORNEY")

            val UTILITY_BILL = of("UTILITY_BILL")

            val SELFIE = of("SELFIE")

            val OTHER = of("OTHER")

            fun of(value: String) = DocumentType(JsonField.of(value))
        }

        /** An enum containing [DocumentType]'s known values. */
        enum class Known {
            PASSPORT,
            DRIVERS_LICENSE,
            NATIONAL_ID,
            PROOF_OF_ADDRESS,
            BANK_STATEMENT,
            TAX_RETURN,
            CERTIFICATE_OF_INCORPORATION,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ASSOCIATION,
            STATE_REGISTRY_EXCERPT,
            GOOD_STANDING_CERTIFICATE,
            INFORMATION_STATEMENT,
            INCUMBENCY_CERTIFICATE,
            BUSINESS_LICENSE,
            SHAREHOLDER_REGISTER,
            POWER_OF_ATTORNEY,
            UTILITY_BILL,
            SELFIE,
            OTHER,
        }

        /**
         * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PASSPORT,
            DRIVERS_LICENSE,
            NATIONAL_ID,
            PROOF_OF_ADDRESS,
            BANK_STATEMENT,
            TAX_RETURN,
            CERTIFICATE_OF_INCORPORATION,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ASSOCIATION,
            STATE_REGISTRY_EXCERPT,
            GOOD_STANDING_CERTIFICATE,
            INFORMATION_STATEMENT,
            INCUMBENCY_CERTIFICATE,
            BUSINESS_LICENSE,
            SHAREHOLDER_REGISTER,
            POWER_OF_ATTORNEY,
            UTILITY_BILL,
            SELFIE,
            OTHER,
            /**
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PASSPORT -> Value.PASSPORT
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                NATIONAL_ID -> Value.NATIONAL_ID
                PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                BANK_STATEMENT -> Value.BANK_STATEMENT
                TAX_RETURN -> Value.TAX_RETURN
                CERTIFICATE_OF_INCORPORATION -> Value.CERTIFICATE_OF_INCORPORATION
                ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ASSOCIATION -> Value.ARTICLES_OF_ASSOCIATION
                STATE_REGISTRY_EXCERPT -> Value.STATE_REGISTRY_EXCERPT
                GOOD_STANDING_CERTIFICATE -> Value.GOOD_STANDING_CERTIFICATE
                INFORMATION_STATEMENT -> Value.INFORMATION_STATEMENT
                INCUMBENCY_CERTIFICATE -> Value.INCUMBENCY_CERTIFICATE
                BUSINESS_LICENSE -> Value.BUSINESS_LICENSE
                SHAREHOLDER_REGISTER -> Value.SHAREHOLDER_REGISTER
                POWER_OF_ATTORNEY -> Value.POWER_OF_ATTORNEY
                UTILITY_BILL -> Value.UTILITY_BILL
                SELFIE -> Value.SELFIE
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                PASSPORT -> Known.PASSPORT
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                NATIONAL_ID -> Known.NATIONAL_ID
                PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                BANK_STATEMENT -> Known.BANK_STATEMENT
                TAX_RETURN -> Known.TAX_RETURN
                CERTIFICATE_OF_INCORPORATION -> Known.CERTIFICATE_OF_INCORPORATION
                ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ASSOCIATION -> Known.ARTICLES_OF_ASSOCIATION
                STATE_REGISTRY_EXCERPT -> Known.STATE_REGISTRY_EXCERPT
                GOOD_STANDING_CERTIFICATE -> Known.GOOD_STANDING_CERTIFICATE
                INFORMATION_STATEMENT -> Known.INFORMATION_STATEMENT
                INCUMBENCY_CERTIFICATE -> Known.INCUMBENCY_CERTIFICATE
                BUSINESS_LICENSE -> Known.BUSINESS_LICENSE
                SHAREHOLDER_REGISTER -> Known.SHAREHOLDER_REGISTER
                POWER_OF_ATTORNEY -> Known.POWER_OF_ATTORNEY
                UTILITY_BILL -> Known.UTILITY_BILL
                SELFIE -> Known.SELFIE
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown DocumentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): DocumentType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LightsparkGridInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Which side of the document (for two-sided documents like driver's licenses) */
    class Side @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FRONT = of("FRONT")

            val BACK = of("BACK")

            fun of(value: String) = Side(JsonField.of(value))
        }

        /** An enum containing [Side]'s known values. */
        enum class Known {
            FRONT,
            BACK,
        }

        /**
         * An enum containing [Side]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Side] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FRONT,
            BACK,
            /** An enum member indicating that [Side] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FRONT -> Value.FRONT
                BACK -> Value.BACK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                FRONT -> Known.FRONT
                BACK -> Known.BACK
                else -> throw LightsparkGridInvalidDataException("Unknown Side: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Side = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LightsparkGridInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Side && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
