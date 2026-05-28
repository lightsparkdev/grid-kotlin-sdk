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
import java.util.Collections
import java.util.Objects

/** Replace an existing non-identity verification document. */
class NonIdentityDocumentReplaceRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val country: JsonField<String>,
    private val documentType: JsonField<NonIdentityDocumentType>,
    private val file: JsonField<String>,
    private val documentNumber: JsonField<String>,
    private val issuingAuthority: JsonField<String>,
    private val side: JsonField<Side>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentType")
        @ExcludeMissing
        documentType: JsonField<NonIdentityDocumentType> = JsonMissing.of(),
        @JsonProperty("file") @ExcludeMissing file: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentNumber")
        @ExcludeMissing
        documentNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issuingAuthority")
        @ExcludeMissing
        issuingAuthority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
    ) : this(country, documentType, file, documentNumber, issuingAuthority, side, mutableMapOf())

    /**
     * Country that issued the document (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Non-identity verification documents. **Business — Legal presence** —
     * CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION,
     * STATE_REGISTRY_EXCERPT **Business — Control structure** — DIRECTOR_REGISTRY, TRUST_AGREEMENT,
     * STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT **Business — Ownership structure** —
     * SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT **Proof of address** —
     * UTILITY_BILL, RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL, BANK_STATEMENT, TAX_RETURN
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): NonIdentityDocumentType = documentType.getRequired("documentType")

    /**
     * The document file (PDF, JPEG, or PNG, max 10 MB)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): String = file.getRequired("file")

    /**
     * Optional document identification number
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentNumber(): String? = documentNumber.getNullable("documentNumber")

    /**
     * Optional name of the agency or organization that issued the document
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingAuthority(): String? = issuingAuthority.getNullable("issuingAuthority")

    /**
     * Which side of the document (for two-sided documents like driver's licenses)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun side(): Side? = side.getNullable("side")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentType")
    @ExcludeMissing
    fun _documentType(): JsonField<NonIdentityDocumentType> = documentType

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<String> = file

    /**
     * Returns the raw JSON value of [documentNumber].
     *
     * Unlike [documentNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentNumber")
    @ExcludeMissing
    fun _documentNumber(): JsonField<String> = documentNumber

    /**
     * Returns the raw JSON value of [issuingAuthority].
     *
     * Unlike [issuingAuthority], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("issuingAuthority")
    @ExcludeMissing
    fun _issuingAuthority(): JsonField<String> = issuingAuthority

    /**
     * Returns the raw JSON value of [side].
     *
     * Unlike [side], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

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

        private var country: JsonField<String>? = null
        private var documentType: JsonField<NonIdentityDocumentType>? = null
        private var file: JsonField<String>? = null
        private var documentNumber: JsonField<String> = JsonMissing.of()
        private var issuingAuthority: JsonField<String> = JsonMissing.of()
        private var side: JsonField<Side> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(nonIdentityDocumentReplaceRequest: NonIdentityDocumentReplaceRequest) =
            apply {
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
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Non-identity verification documents. **Business — Legal presence** —
         * CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION,
         * STATE_REGISTRY_EXCERPT **Business — Control structure** — DIRECTOR_REGISTRY,
         * TRUST_AGREEMENT, STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT **Business —
         * Ownership structure** — SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT
         * **Proof of address** — UTILITY_BILL, RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL,
         * BANK_STATEMENT, TAX_RETURN
         */
        fun documentType(documentType: NonIdentityDocumentType) =
            documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed
         * [NonIdentityDocumentType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun documentType(documentType: JsonField<NonIdentityDocumentType>) = apply {
            this.documentType = documentType
        }

        /** The document file (PDF, JPEG, or PNG, max 10 MB) */
        fun file(file: String) = file(JsonField.of(file))

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun file(file: JsonField<String>) = apply { this.file = file }

        /** Optional document identification number */
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

        /** Optional name of the agency or organization that issued the document */
        fun issuingAuthority(issuingAuthority: String) =
            issuingAuthority(JsonField.of(issuingAuthority))

        /**
         * Sets [Builder.issuingAuthority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuingAuthority] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuingAuthority(issuingAuthority: JsonField<String>) = apply {
            this.issuingAuthority = issuingAuthority
        }

        /** Which side of the document (for two-sided documents like driver's licenses) */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (country.asKnown() == null) 0 else 1) +
            (documentType.asKnown()?.validity() ?: 0) +
            (if (file.asKnown() == null) 0 else 1) +
            (if (documentNumber.asKnown() == null) 0 else 1) +
            (if (issuingAuthority.asKnown() == null) 0 else 1) +
            (side.asKnown()?.validity() ?: 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
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
