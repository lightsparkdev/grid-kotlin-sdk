// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.MultipartField
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
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
 * Replace an existing document with a new file and/or updated metadata. This is useful when a
 * document was rejected and needs to be re-uploaded. The request must use multipart/form-data.
 */
class DocumentReplaceParams
private constructor(
    private val documentId: String?,
    private val body: MultipartField<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun documentId(): String? = documentId

    /**
     * Replace an existing document.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun body(): Body = body.value.getRequired("body")

    /**
     * Returns the raw multipart value of [body].
     *
     * Unlike [body], this method doesn't throw if the multipart field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): MultipartField<Body> = body

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
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentReplaceParams]. */
    class Builder internal constructor() {

        private var documentId: String? = null
        private var body: MultipartField<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentReplaceParams: DocumentReplaceParams) = apply {
            documentId = documentReplaceParams.documentId
            body = documentReplaceParams.body
            additionalHeaders = documentReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentReplaceParams.additionalQueryParams.toBuilder()
        }

        fun documentId(documentId: String?) = apply { this.documentId = documentId }

        /** Replace an existing document. */
        fun body(body: Body) =
            body(
                MultipartField.builder<Body>()
                    .value(body)
                    .contentType("application/octet-stream")
                    .build()
            )

        /**
         * Sets [Builder.body] to an arbitrary multipart value.
         *
         * You should usually call [Builder.body] with a well-typed [Body] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: MultipartField<Body>) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofIdentityDocumentReplaceRequest(identityDocumentReplaceRequest)`.
         */
        fun body(identityDocumentReplaceRequest: Body.IdentityDocumentReplaceRequest) =
            body(Body.ofIdentityDocumentReplaceRequest(identityDocumentReplaceRequest))

        /**
         * Alias for calling [body] with
         * `Body.ofNonIdentityDocumentReplaceRequest(nonIdentityDocumentReplaceRequest)`.
         */
        fun body(nonIdentityDocumentReplaceRequest: Body.NonIdentityDocumentReplaceRequest) =
            body(Body.ofNonIdentityDocumentReplaceRequest(nonIdentityDocumentReplaceRequest))

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
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentReplaceParams =
            DocumentReplaceParams(
                documentId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("body" to _body()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> documentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Replace an existing document. */
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val identityDocumentReplaceRequest: IdentityDocumentReplaceRequest? = null,
        private val nonIdentityDocumentReplaceRequest: NonIdentityDocumentReplaceRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Replace an existing identity document. */
        fun identityDocumentReplaceRequest(): IdentityDocumentReplaceRequest? =
            identityDocumentReplaceRequest

        /** Replace an existing non-identity verification document. */
        fun nonIdentityDocumentReplaceRequest(): NonIdentityDocumentReplaceRequest? =
            nonIdentityDocumentReplaceRequest

        fun isIdentityDocumentReplaceRequest(): Boolean = identityDocumentReplaceRequest != null

        fun isNonIdentityDocumentReplaceRequest(): Boolean =
            nonIdentityDocumentReplaceRequest != null

        /** Replace an existing identity document. */
        fun asIdentityDocumentReplaceRequest(): IdentityDocumentReplaceRequest =
            identityDocumentReplaceRequest.getOrThrow("identityDocumentReplaceRequest")

        /** Replace an existing non-identity verification document. */
        fun asNonIdentityDocumentReplaceRequest(): NonIdentityDocumentReplaceRequest =
            nonIdentityDocumentReplaceRequest.getOrThrow("nonIdentityDocumentReplaceRequest")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.lightspark.grid.core.JsonValue
         *
         * val result: String? = body.accept(object : Body.Visitor<String?> {
         *     override fun visitIdentityDocumentReplaceRequest(identityDocumentReplaceRequest: IdentityDocumentReplaceRequest): String? = identityDocumentReplaceRequest.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                identityDocumentReplaceRequest != null ->
                    visitor.visitIdentityDocumentReplaceRequest(identityDocumentReplaceRequest)
                nonIdentityDocumentReplaceRequest != null ->
                    visitor.visitNonIdentityDocumentReplaceRequest(
                        nonIdentityDocumentReplaceRequest
                    )
                else -> visitor.unknown(_json)
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIdentityDocumentReplaceRequest(
                        identityDocumentReplaceRequest: IdentityDocumentReplaceRequest
                    ) {
                        identityDocumentReplaceRequest.validate()
                    }

                    override fun visitNonIdentityDocumentReplaceRequest(
                        nonIdentityDocumentReplaceRequest: NonIdentityDocumentReplaceRequest
                    ) {
                        nonIdentityDocumentReplaceRequest.validate()
                    }
                }
            )
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
                identityDocumentReplaceRequest == other.identityDocumentReplaceRequest &&
                nonIdentityDocumentReplaceRequest == other.nonIdentityDocumentReplaceRequest
        }

        override fun hashCode(): Int =
            Objects.hash(identityDocumentReplaceRequest, nonIdentityDocumentReplaceRequest)

        override fun toString(): String =
            when {
                identityDocumentReplaceRequest != null ->
                    "Body{identityDocumentReplaceRequest=$identityDocumentReplaceRequest}"
                nonIdentityDocumentReplaceRequest != null ->
                    "Body{nonIdentityDocumentReplaceRequest=$nonIdentityDocumentReplaceRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** Replace an existing identity document. */
            fun ofIdentityDocumentReplaceRequest(
                identityDocumentReplaceRequest: IdentityDocumentReplaceRequest
            ) = Body(identityDocumentReplaceRequest = identityDocumentReplaceRequest)

            /** Replace an existing non-identity verification document. */
            fun ofNonIdentityDocumentReplaceRequest(
                nonIdentityDocumentReplaceRequest: NonIdentityDocumentReplaceRequest
            ) = Body(nonIdentityDocumentReplaceRequest = nonIdentityDocumentReplaceRequest)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** Replace an existing identity document. */
            fun visitIdentityDocumentReplaceRequest(
                identityDocumentReplaceRequest: IdentityDocumentReplaceRequest
            ): T

            /** Replace an existing non-identity verification document. */
            fun visitNonIdentityDocumentReplaceRequest(
                nonIdentityDocumentReplaceRequest: NonIdentityDocumentReplaceRequest
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.identityDocumentReplaceRequest != null ->
                        generator.writeObject(value.identityDocumentReplaceRequest)
                    value.nonIdentityDocumentReplaceRequest != null ->
                        generator.writeObject(value.nonIdentityDocumentReplaceRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        /** Replace an existing identity document. */
        class IdentityDocumentReplaceRequest
        private constructor(
            private val country: MultipartField<String>,
            private val documentNumber: MultipartField<String>,
            private val documentType: MultipartField<DocumentType>,
            private val file: MultipartField<InputStream>,
            private val issuingAuthority: MultipartField<String>,
            private val side: MultipartField<Side>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Country that issued the document (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.value.getRequired("country")

            /**
             * Document identification number (e.g., passport number)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentNumber(): String = documentNumber.value.getRequired("documentNumber")

            /**
             * Identity document types issued by a government to verify an individual's identity.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentType(): DocumentType = documentType.value.getRequired("documentType")

            /**
             * The document file (PDF, JPEG, or PNG, max 10 MB)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun file(): InputStream = file.value.getRequired("file")

            /**
             * Name of the government agency or organization that issued the document
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun issuingAuthority(): String = issuingAuthority.value.getRequired("issuingAuthority")

            /**
             * Which side of the document (for two-sided documents like driver's licenses)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun side(): Side? = side.value.getNullable("side")

            /**
             * Returns the raw multipart value of [country].
             *
             * Unlike [country], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("country")
            @ExcludeMissing
            fun _country(): MultipartField<String> = country

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
             * Returns the raw multipart value of [documentType].
             *
             * Unlike [documentType], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("documentType")
            @ExcludeMissing
            fun _documentType(): MultipartField<DocumentType> = documentType

            /**
             * Returns the raw multipart value of [file].
             *
             * Unlike [file], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

            /**
             * Returns the raw multipart value of [issuingAuthority].
             *
             * Unlike [issuingAuthority], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("issuingAuthority")
            @ExcludeMissing
            fun _issuingAuthority(): MultipartField<String> = issuingAuthority

            /**
             * Returns the raw multipart value of [side].
             *
             * Unlike [side], this method doesn't throw if the multipart field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [IdentityDocumentReplaceRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .country()
                 * .documentNumber()
                 * .documentType()
                 * .file()
                 * .issuingAuthority()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [IdentityDocumentReplaceRequest]. */
            class Builder internal constructor() {

                private var country: MultipartField<String>? = null
                private var documentNumber: MultipartField<String>? = null
                private var documentType: MultipartField<DocumentType>? = null
                private var file: MultipartField<InputStream>? = null
                private var issuingAuthority: MultipartField<String>? = null
                private var side: MultipartField<Side> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(identityDocumentReplaceRequest: IdentityDocumentReplaceRequest) =
                    apply {
                        country = identityDocumentReplaceRequest.country
                        documentNumber = identityDocumentReplaceRequest.documentNumber
                        documentType = identityDocumentReplaceRequest.documentType
                        file = identityDocumentReplaceRequest.file
                        issuingAuthority = identityDocumentReplaceRequest.issuingAuthority
                        side = identityDocumentReplaceRequest.side
                        additionalProperties =
                            identityDocumentReplaceRequest.additionalProperties.toMutableMap()
                    }

                /** Country that issued the document (ISO 3166-1 alpha-2) */
                fun country(country: String) = country(MultipartField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: MultipartField<String>) = apply { this.country = country }

                /** Document identification number (e.g., passport number) */
                fun documentNumber(documentNumber: String) =
                    documentNumber(MultipartField.of(documentNumber))

                /**
                 * Sets [Builder.documentNumber] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.documentNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentNumber(documentNumber: MultipartField<String>) = apply {
                    this.documentNumber = documentNumber
                }

                /**
                 * Identity document types issued by a government to verify an individual's
                 * identity.
                 */
                fun documentType(documentType: DocumentType) =
                    documentType(MultipartField.of(documentType))

                /**
                 * Sets [Builder.documentType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.documentType] with a well-typed [DocumentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun documentType(documentType: MultipartField<DocumentType>) = apply {
                    this.documentType = documentType
                }

                /** The document file (PDF, JPEG, or PNG, max 10 MB) */
                fun file(file: InputStream) = file(MultipartField.of(file))

                /**
                 * Sets [Builder.file] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.file] with a well-typed [InputStream] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /** Name of the government agency or organization that issued the document */
                fun issuingAuthority(issuingAuthority: String) =
                    issuingAuthority(MultipartField.of(issuingAuthority))

                /**
                 * Sets [Builder.issuingAuthority] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.issuingAuthority] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun issuingAuthority(issuingAuthority: MultipartField<String>) = apply {
                    this.issuingAuthority = issuingAuthority
                }

                /** Which side of the document (for two-sided documents like driver's licenses) */
                fun side(side: Side) = side(MultipartField.of(side))

                /**
                 * Sets [Builder.side] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.side] with a well-typed [Side] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun side(side: MultipartField<Side>) = apply { this.side = side }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [IdentityDocumentReplaceRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .country()
                 * .documentNumber()
                 * .documentType()
                 * .file()
                 * .issuingAuthority()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): IdentityDocumentReplaceRequest =
                    IdentityDocumentReplaceRequest(
                        checkRequired("country", country),
                        checkRequired("documentNumber", documentNumber),
                        checkRequired("documentType", documentType),
                        checkRequired("file", file),
                        checkRequired("issuingAuthority", issuingAuthority),
                        side,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): IdentityDocumentReplaceRequest = apply {
                if (validated) {
                    return@apply
                }

                country()
                documentNumber()
                documentType().validate()
                file()
                issuingAuthority()
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

            /**
             * Identity document types issued by a government to verify an individual's identity.
             */
            class DocumentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PASSPORT = of("PASSPORT")

                    val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

                    val NATIONAL_ID = of("NATIONAL_ID")

                    fun of(value: String) = DocumentType(JsonField.of(value))
                }

                /** An enum containing [DocumentType]'s known values. */
                enum class Known {
                    PASSPORT,
                    DRIVERS_LICENSE,
                    NATIONAL_ID,
                }

                /**
                 * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DocumentType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PASSPORT,
                    DRIVERS_LICENSE,
                    NATIONAL_ID,
                    /**
                     * An enum member indicating that [DocumentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PASSPORT -> Value.PASSPORT
                        DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                        NATIONAL_ID -> Value.NATIONAL_ID
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        PASSPORT -> Known.PASSPORT
                        DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                        NATIONAL_ID -> Known.NATIONAL_ID
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown DocumentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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
            class Side @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FRONT,
                    BACK,
                    /**
                     * An enum member indicating that [Side] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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

                return other is IdentityDocumentReplaceRequest &&
                    country == other.country &&
                    documentNumber == other.documentNumber &&
                    documentType == other.documentType &&
                    file == other.file &&
                    issuingAuthority == other.issuingAuthority &&
                    side == other.side &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    country,
                    documentNumber,
                    documentType,
                    file,
                    issuingAuthority,
                    side,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IdentityDocumentReplaceRequest{country=$country, documentNumber=$documentNumber, documentType=$documentType, file=$file, issuingAuthority=$issuingAuthority, side=$side, additionalProperties=$additionalProperties}"
        }

        /** Replace an existing non-identity verification document. */
        class NonIdentityDocumentReplaceRequest
        private constructor(
            private val country: MultipartField<String>,
            private val documentType: MultipartField<DocumentType>,
            private val file: MultipartField<InputStream>,
            private val documentNumber: MultipartField<String>,
            private val issuingAuthority: MultipartField<String>,
            private val side: MultipartField<Side>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Country that issued the document (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.value.getRequired("country")

            /**
             * Non-identity verification documents. **Business — Legal presence** —
             * CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION,
             * STATE_REGISTRY_EXCERPT **Business — Control structure** — DIRECTOR_REGISTRY,
             * TRUST_AGREEMENT, STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT **Business —
             * Ownership structure** — SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT
             * **Proof of address** — UTILITY_BILL, RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL,
             * BANK_STATEMENT, TAX_RETURN
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentType(): DocumentType = documentType.value.getRequired("documentType")

            /**
             * The document file (PDF, JPEG, or PNG, max 10 MB)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun file(): InputStream = file.value.getRequired("file")

            /**
             * Optional document identification number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun documentNumber(): String? = documentNumber.value.getNullable("documentNumber")

            /**
             * Optional name of the agency or organization that issued the document
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun issuingAuthority(): String? = issuingAuthority.value.getNullable("issuingAuthority")

            /**
             * Which side of the document (for two-sided documents like driver's licenses)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun side(): Side? = side.value.getNullable("side")

            /**
             * Returns the raw multipart value of [country].
             *
             * Unlike [country], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("country")
            @ExcludeMissing
            fun _country(): MultipartField<String> = country

            /**
             * Returns the raw multipart value of [documentType].
             *
             * Unlike [documentType], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("documentType")
            @ExcludeMissing
            fun _documentType(): MultipartField<DocumentType> = documentType

            /**
             * Returns the raw multipart value of [file].
             *
             * Unlike [file], this method doesn't throw if the multipart field has an unexpected
             * type.
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
             * Returns the raw multipart value of [issuingAuthority].
             *
             * Unlike [issuingAuthority], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("issuingAuthority")
            @ExcludeMissing
            fun _issuingAuthority(): MultipartField<String> = issuingAuthority

            /**
             * Returns the raw multipart value of [side].
             *
             * Unlike [side], this method doesn't throw if the multipart field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [NonIdentityDocumentReplaceRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .country()
                 * .documentType()
                 * .file()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NonIdentityDocumentReplaceRequest]. */
            class Builder internal constructor() {

                private var country: MultipartField<String>? = null
                private var documentType: MultipartField<DocumentType>? = null
                private var file: MultipartField<InputStream>? = null
                private var documentNumber: MultipartField<String> = MultipartField.of(null)
                private var issuingAuthority: MultipartField<String> = MultipartField.of(null)
                private var side: MultipartField<Side> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    nonIdentityDocumentReplaceRequest: NonIdentityDocumentReplaceRequest
                ) = apply {
                    country = nonIdentityDocumentReplaceRequest.country
                    documentType = nonIdentityDocumentReplaceRequest.documentType
                    file = nonIdentityDocumentReplaceRequest.file
                    documentNumber = nonIdentityDocumentReplaceRequest.documentNumber
                    issuingAuthority = nonIdentityDocumentReplaceRequest.issuingAuthority
                    side = nonIdentityDocumentReplaceRequest.side
                    additionalProperties =
                        nonIdentityDocumentReplaceRequest.additionalProperties.toMutableMap()
                }

                /** Country that issued the document (ISO 3166-1 alpha-2) */
                fun country(country: String) = country(MultipartField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: MultipartField<String>) = apply { this.country = country }

                /**
                 * Non-identity verification documents. **Business — Legal presence** —
                 * CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION,
                 * STATE_REGISTRY_EXCERPT **Business — Control structure** — DIRECTOR_REGISTRY,
                 * TRUST_AGREEMENT, STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT **Business
                 * — Ownership structure** — SHAREHOLDER_REGISTER, TRUST_AGREEMENT,
                 * PARTNERSHIP_AGREEMENT **Proof of address** — UTILITY_BILL,
                 * RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL, BANK_STATEMENT, TAX_RETURN
                 */
                fun documentType(documentType: DocumentType) =
                    documentType(MultipartField.of(documentType))

                /**
                 * Sets [Builder.documentType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.documentType] with a well-typed [DocumentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun documentType(documentType: MultipartField<DocumentType>) = apply {
                    this.documentType = documentType
                }

                /** The document file (PDF, JPEG, or PNG, max 10 MB) */
                fun file(file: InputStream) = file(MultipartField.of(file))

                /**
                 * Sets [Builder.file] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.file] with a well-typed [InputStream] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /** Optional document identification number */
                fun documentNumber(documentNumber: String) =
                    documentNumber(MultipartField.of(documentNumber))

                /**
                 * Sets [Builder.documentNumber] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.documentNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentNumber(documentNumber: MultipartField<String>) = apply {
                    this.documentNumber = documentNumber
                }

                /** Optional name of the agency or organization that issued the document */
                fun issuingAuthority(issuingAuthority: String) =
                    issuingAuthority(MultipartField.of(issuingAuthority))

                /**
                 * Sets [Builder.issuingAuthority] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.issuingAuthority] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun issuingAuthority(issuingAuthority: MultipartField<String>) = apply {
                    this.issuingAuthority = issuingAuthority
                }

                /** Which side of the document (for two-sided documents like driver's licenses) */
                fun side(side: Side) = side(MultipartField.of(side))

                /**
                 * Sets [Builder.side] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.side] with a well-typed [Side] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun side(side: MultipartField<Side>) = apply { this.side = side }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NonIdentityDocumentReplaceRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .country()
                 * .documentType()
                 * .file()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NonIdentityDocumentReplaceRequest =
                    NonIdentityDocumentReplaceRequest(
                        checkRequired("country", country),
                        checkRequired("documentType", documentType),
                        checkRequired("file", file),
                        documentNumber,
                        issuingAuthority,
                        side,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): NonIdentityDocumentReplaceRequest = apply {
                if (validated) {
                    return@apply
                }

                country()
                documentType().validate()
                file()
                documentNumber()
                issuingAuthority()
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

            /**
             * Non-identity verification documents. **Business — Legal presence** —
             * CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION,
             * STATE_REGISTRY_EXCERPT **Business — Control structure** — DIRECTOR_REGISTRY,
             * TRUST_AGREEMENT, STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT **Business —
             * Ownership structure** — SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT
             * **Proof of address** — UTILITY_BILL, RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL,
             * BANK_STATEMENT, TAX_RETURN
             */
            class DocumentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

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

                    val ELECTRICITY_BILL = of("ELECTRICITY_BILL")

                    val RENT_OR_LEASE_AGREEMENT = of("RENT_OR_LEASE_AGREEMENT")

                    val DIRECTOR_REGISTRY = of("DIRECTOR_REGISTRY")

                    val TRUST_AGREEMENT = of("TRUST_AGREEMENT")

                    val STATE_COMPANY_REGISTRY = of("STATE_COMPANY_REGISTRY")

                    val PARTNERSHIP_CONTROL_AGREEMENT = of("PARTNERSHIP_CONTROL_AGREEMENT")

                    val PARTNERSHIP_AGREEMENT = of("PARTNERSHIP_AGREEMENT")

                    val SELFIE = of("SELFIE")

                    val OTHER = of("OTHER")

                    fun of(value: String) = DocumentType(JsonField.of(value))
                }

                /** An enum containing [DocumentType]'s known values. */
                enum class Known {
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
                    ELECTRICITY_BILL,
                    RENT_OR_LEASE_AGREEMENT,
                    DIRECTOR_REGISTRY,
                    TRUST_AGREEMENT,
                    STATE_COMPANY_REGISTRY,
                    PARTNERSHIP_CONTROL_AGREEMENT,
                    PARTNERSHIP_AGREEMENT,
                    SELFIE,
                    OTHER,
                }

                /**
                 * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DocumentType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
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
                    ELECTRICITY_BILL,
                    RENT_OR_LEASE_AGREEMENT,
                    DIRECTOR_REGISTRY,
                    TRUST_AGREEMENT,
                    STATE_COMPANY_REGISTRY,
                    PARTNERSHIP_CONTROL_AGREEMENT,
                    PARTNERSHIP_AGREEMENT,
                    SELFIE,
                    OTHER,
                    /**
                     * An enum member indicating that [DocumentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
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
                        ELECTRICITY_BILL -> Value.ELECTRICITY_BILL
                        RENT_OR_LEASE_AGREEMENT -> Value.RENT_OR_LEASE_AGREEMENT
                        DIRECTOR_REGISTRY -> Value.DIRECTOR_REGISTRY
                        TRUST_AGREEMENT -> Value.TRUST_AGREEMENT
                        STATE_COMPANY_REGISTRY -> Value.STATE_COMPANY_REGISTRY
                        PARTNERSHIP_CONTROL_AGREEMENT -> Value.PARTNERSHIP_CONTROL_AGREEMENT
                        PARTNERSHIP_AGREEMENT -> Value.PARTNERSHIP_AGREEMENT
                        SELFIE -> Value.SELFIE
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
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
                        ELECTRICITY_BILL -> Known.ELECTRICITY_BILL
                        RENT_OR_LEASE_AGREEMENT -> Known.RENT_OR_LEASE_AGREEMENT
                        DIRECTOR_REGISTRY -> Known.DIRECTOR_REGISTRY
                        TRUST_AGREEMENT -> Known.TRUST_AGREEMENT
                        STATE_COMPANY_REGISTRY -> Known.STATE_COMPANY_REGISTRY
                        PARTNERSHIP_CONTROL_AGREEMENT -> Known.PARTNERSHIP_CONTROL_AGREEMENT
                        PARTNERSHIP_AGREEMENT -> Known.PARTNERSHIP_AGREEMENT
                        SELFIE -> Known.SELFIE
                        OTHER -> Known.OTHER
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown DocumentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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
            class Side @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FRONT,
                    BACK,
                    /**
                     * An enum member indicating that [Side] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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

                return other is NonIdentityDocumentReplaceRequest &&
                    country == other.country &&
                    documentType == other.documentType &&
                    file == other.file &&
                    documentNumber == other.documentNumber &&
                    issuingAuthority == other.issuingAuthority &&
                    side == other.side &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    country,
                    documentType,
                    file,
                    documentNumber,
                    issuingAuthority,
                    side,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NonIdentityDocumentReplaceRequest{country=$country, documentType=$documentType, file=$file, documentNumber=$documentNumber, issuingAuthority=$issuingAuthority, side=$side, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentReplaceParams &&
            documentId == other.documentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(documentId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentReplaceParams{documentId=$documentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
