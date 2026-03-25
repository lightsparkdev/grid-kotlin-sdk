// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class DocumentUploadResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val country: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val documentHolder: JsonField<String>,
    private val documentType: JsonField<DocumentType>,
    private val fileName: JsonField<String>,
    private val documentNumber: JsonField<String>,
    private val side: JsonField<Side>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("documentHolder")
        @ExcludeMissing
        documentHolder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentType")
        @ExcludeMissing
        documentType: JsonField<DocumentType> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentNumber")
        @ExcludeMissing
        documentNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        country,
        createdAt,
        documentHolder,
        documentType,
        fileName,
        documentNumber,
        side,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this document
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Country that issued the document (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * When this document was uploaded
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * ID of the entity that owns this document. Can be a Customer ID or a BeneficialOwner ID.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentHolder(): String = documentHolder.getRequired("documentHolder")

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
    fun documentType(): DocumentType = documentType.getRequired("documentType")

    /**
     * Original file name of the uploaded document
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = fileName.getRequired("fileName")

    /**
     * Document identification number (e.g., passport number)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentNumber(): String? = documentNumber.getNullable("documentNumber")

    /**
     * Which side of the document this upload represents. Relevant for two-sided documents like
     * driver's licenses or national IDs.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun side(): Side? = side.getNullable("side")

    /**
     * When this document was last updated
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [documentHolder].
     *
     * Unlike [documentHolder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentHolder")
    @ExcludeMissing
    fun _documentHolder(): JsonField<String> = documentHolder

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentType")
    @ExcludeMissing
    fun _documentType(): JsonField<DocumentType> = documentType

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

    /**
     * Returns the raw JSON value of [documentNumber].
     *
     * Unlike [documentNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentNumber")
    @ExcludeMissing
    fun _documentNumber(): JsonField<String> = documentNumber

    /**
     * Returns the raw JSON value of [side].
     *
     * Unlike [side], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [DocumentUploadResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .country()
         * .createdAt()
         * .documentHolder()
         * .documentType()
         * .fileName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentUploadResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var documentHolder: JsonField<String>? = null
        private var documentType: JsonField<DocumentType>? = null
        private var fileName: JsonField<String>? = null
        private var documentNumber: JsonField<String> = JsonMissing.of()
        private var side: JsonField<Side> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(documentUploadResponse: DocumentUploadResponse) = apply {
            id = documentUploadResponse.id
            country = documentUploadResponse.country
            createdAt = documentUploadResponse.createdAt
            documentHolder = documentUploadResponse.documentHolder
            documentType = documentUploadResponse.documentType
            fileName = documentUploadResponse.fileName
            documentNumber = documentUploadResponse.documentNumber
            side = documentUploadResponse.side
            updatedAt = documentUploadResponse.updatedAt
            additionalProperties = documentUploadResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this document */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Country that issued the document (ISO 3166-1 alpha-2) */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** When this document was uploaded */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * ID of the entity that owns this document. Can be a Customer ID or a BeneficialOwner ID.
         */
        fun documentHolder(documentHolder: String) = documentHolder(JsonField.of(documentHolder))

        /**
         * Sets [Builder.documentHolder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentHolder] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentHolder(documentHolder: JsonField<String>) = apply {
            this.documentHolder = documentHolder
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
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** Original file name of the uploaded document */
        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        /** Document identification number (e.g., passport number) */
        fun documentNumber(documentNumber: String) = documentNumber(JsonField.of(documentNumber))

        /**
         * Sets [Builder.documentNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentNumber(documentNumber: JsonField<String>) = apply {
            this.documentNumber = documentNumber
        }

        /**
         * Which side of the document this upload represents. Relevant for two-sided documents like
         * driver's licenses or national IDs.
         */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** When this document was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [DocumentUploadResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .country()
         * .createdAt()
         * .documentHolder()
         * .documentType()
         * .fileName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUploadResponse =
            DocumentUploadResponse(
                checkRequired("id", id),
                checkRequired("country", country),
                checkRequired("createdAt", createdAt),
                checkRequired("documentHolder", documentHolder),
                checkRequired("documentType", documentType),
                checkRequired("fileName", fileName),
                documentNumber,
                side,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentUploadResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        country()
        createdAt()
        documentHolder()
        documentType().validate()
        fileName()
        documentNumber()
        side()?.validate()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (country.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (documentHolder.asKnown() == null) 0 else 1) +
            (documentType.asKnown()?.validity() ?: 0) +
            (if (fileName.asKnown() == null) 0 else 1) +
            (if (documentNumber.asKnown() == null) 0 else 1) +
            (side.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

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

    /**
     * Which side of the document this upload represents. Relevant for two-sided documents like
     * driver's licenses or national IDs.
     */
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

        return other is DocumentUploadResponse &&
            id == other.id &&
            country == other.country &&
            createdAt == other.createdAt &&
            documentHolder == other.documentHolder &&
            documentType == other.documentType &&
            fileName == other.fileName &&
            documentNumber == other.documentNumber &&
            side == other.side &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            country,
            createdAt,
            documentHolder,
            documentType,
            fileName,
            documentNumber,
            side,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentUploadResponse{id=$id, country=$country, createdAt=$createdAt, documentHolder=$documentHolder, documentType=$documentType, fileName=$fileName, documentNumber=$documentNumber, side=$side, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
