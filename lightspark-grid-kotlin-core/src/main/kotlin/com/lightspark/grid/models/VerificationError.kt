// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.documents.DocumentType
import java.util.Collections
import java.util.Objects

class VerificationError
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reason: JsonField<String>,
    private val resourceId: JsonField<String>,
    private val type: JsonField<Type>,
    private val acceptedDocumentTypes: JsonField<List<DocumentType>>,
    private val field: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resourceId")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("acceptedDocumentTypes")
        @ExcludeMissing
        acceptedDocumentTypes: JsonField<List<DocumentType>> = JsonMissing.of(),
        @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
    ) : this(reason, resourceId, type, acceptedDocumentTypes, field, mutableMapOf())

    /**
     * Human-readable description of the issue
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): String = reason.getRequired("reason")

    /**
     * ID of the resource with the issue (Customer, BeneficialOwner, or Document)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceId(): String = resourceId.getRequired("resourceId")

    /**
     * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate which
     * document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
     * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents. APPLICANT_*
     * types indicate issues with the applicant themselves (sanctions, fraud, criminal records).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Document types that would satisfy this requirement. The integrator can upload any one of the
     * listed types. Present when type is MISSING_LEGAL_PRESENCE_DOCUMENT,
     * MISSING_CONTROL_STRUCTURE_DOCUMENT, MISSING_OWNERSHIP_STRUCTURE_DOCUMENT,
     * MISSING_PROOF_OF_ADDRESS_DOCUMENT, MISSING_IDENTITY_DOCUMENT, INVALID_DOCUMENT, or
     * EXPIRED_DOCUMENT.
     *
     * |Error Type                          |Accepted Document Types                                                                                 |
     * |------------------------------------|--------------------------------------------------------------------------------------------------------|
     * |MISSING_LEGAL_PRESENCE_DOCUMENT     |CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT|
     * |MISSING_CONTROL_STRUCTURE_DOCUMENT  |DIRECTOR_REGISTRY, TRUST_AGREEMENT, STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT               |
     * |MISSING_OWNERSHIP_STRUCTURE_DOCUMENT|SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT                                            |
     * |MISSING_PROOF_OF_ADDRESS_DOCUMENT   |UTILITY_BILL, RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL, BANK_STATEMENT, TAX_RETURN                     |
     * |MISSING_IDENTITY_DOCUMENT           |PASSPORT, DRIVERS_LICENSE, NATIONAL_ID                                                                  |
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun acceptedDocumentTypes(): List<DocumentType>? =
        acceptedDocumentTypes.getNullable("acceptedDocumentTypes")

    /**
     * Dot-notation path to the field with the issue. Present when type is MISSING_FIELD or
     * INVALID_FIELD.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun field(): String? = field.getNullable("field")

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resourceId") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [acceptedDocumentTypes].
     *
     * Unlike [acceptedDocumentTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptedDocumentTypes")
    @ExcludeMissing
    fun _acceptedDocumentTypes(): JsonField<List<DocumentType>> = acceptedDocumentTypes

    /**
     * Returns the raw JSON value of [field].
     *
     * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

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
         * Returns a mutable builder for constructing an instance of [VerificationError].
         *
         * The following fields are required:
         * ```kotlin
         * .reason()
         * .resourceId()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VerificationError]. */
    class Builder internal constructor() {

        private var reason: JsonField<String>? = null
        private var resourceId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var acceptedDocumentTypes: JsonField<MutableList<DocumentType>>? = null
        private var field: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(verificationError: VerificationError) = apply {
            reason = verificationError.reason
            resourceId = verificationError.resourceId
            type = verificationError.type
            acceptedDocumentTypes =
                verificationError.acceptedDocumentTypes.map { it.toMutableList() }
            field = verificationError.field
            additionalProperties = verificationError.additionalProperties.toMutableMap()
        }

        /** Human-readable description of the issue */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** ID of the resource with the issue (Customer, BeneficialOwner, or Document) */
        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        /**
         * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate which
         * document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
         * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents.
         * APPLICANT_* types indicate issues with the applicant themselves (sanctions, fraud,
         * criminal records).
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Document types that would satisfy this requirement. The integrator can upload any one of
         * the listed types. Present when type is MISSING_LEGAL_PRESENCE_DOCUMENT,
         * MISSING_CONTROL_STRUCTURE_DOCUMENT, MISSING_OWNERSHIP_STRUCTURE_DOCUMENT,
         * MISSING_PROOF_OF_ADDRESS_DOCUMENT, MISSING_IDENTITY_DOCUMENT, INVALID_DOCUMENT, or
         * EXPIRED_DOCUMENT.
         *
         * |Error Type                          |Accepted Document Types                                                                                 |
         * |------------------------------------|--------------------------------------------------------------------------------------------------------|
         * |MISSING_LEGAL_PRESENCE_DOCUMENT     |CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT|
         * |MISSING_CONTROL_STRUCTURE_DOCUMENT  |DIRECTOR_REGISTRY, TRUST_AGREEMENT, STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT               |
         * |MISSING_OWNERSHIP_STRUCTURE_DOCUMENT|SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT                                            |
         * |MISSING_PROOF_OF_ADDRESS_DOCUMENT   |UTILITY_BILL, RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL, BANK_STATEMENT, TAX_RETURN                     |
         * |MISSING_IDENTITY_DOCUMENT           |PASSPORT, DRIVERS_LICENSE, NATIONAL_ID                                                                  |
         */
        fun acceptedDocumentTypes(acceptedDocumentTypes: List<DocumentType>) =
            acceptedDocumentTypes(JsonField.of(acceptedDocumentTypes))

        /**
         * Sets [Builder.acceptedDocumentTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedDocumentTypes] with a well-typed
         * `List<DocumentType>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun acceptedDocumentTypes(acceptedDocumentTypes: JsonField<List<DocumentType>>) = apply {
            this.acceptedDocumentTypes = acceptedDocumentTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [DocumentType] to [acceptedDocumentTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAcceptedDocumentType(acceptedDocumentType: DocumentType) = apply {
            acceptedDocumentTypes =
                (acceptedDocumentTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("acceptedDocumentTypes", it).add(acceptedDocumentType)
                }
        }

        /**
         * Dot-notation path to the field with the issue. Present when type is MISSING_FIELD or
         * INVALID_FIELD.
         */
        fun field(field: String) = field(JsonField.of(field))

        /**
         * Sets [Builder.field] to an arbitrary JSON value.
         *
         * You should usually call [Builder.field] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun field(field: JsonField<String>) = apply { this.field = field }

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
         * Returns an immutable instance of [VerificationError].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .reason()
         * .resourceId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationError =
            VerificationError(
                checkRequired("reason", reason),
                checkRequired("resourceId", resourceId),
                checkRequired("type", type),
                (acceptedDocumentTypes ?: JsonMissing.of()).map { it.toImmutable() },
                field,
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
    fun validate(): VerificationError = apply {
        if (validated) {
            return@apply
        }

        reason()
        resourceId()
        type().validate()
        acceptedDocumentTypes()?.forEach { it.validate() }
        field()
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
        (if (reason.asKnown() == null) 0 else 1) +
            (if (resourceId.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (acceptedDocumentTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (field.asKnown() == null) 0 else 1)

    /**
     * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate which
     * document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
     * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents. APPLICANT_*
     * types indicate issues with the applicant themselves (sanctions, fraud, criminal records).
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val MISSING_FIELD = of("MISSING_FIELD")

            val INVALID_FIELD = of("INVALID_FIELD")

            val MISSING_LEGAL_PRESENCE_DOCUMENT = of("MISSING_LEGAL_PRESENCE_DOCUMENT")

            val MISSING_CONTROL_STRUCTURE_DOCUMENT = of("MISSING_CONTROL_STRUCTURE_DOCUMENT")

            val MISSING_OWNERSHIP_STRUCTURE_DOCUMENT = of("MISSING_OWNERSHIP_STRUCTURE_DOCUMENT")

            val MISSING_PROOF_OF_ADDRESS_DOCUMENT = of("MISSING_PROOF_OF_ADDRESS_DOCUMENT")

            val MISSING_IDENTITY_DOCUMENT = of("MISSING_IDENTITY_DOCUMENT")

            val INVALID_DOCUMENT = of("INVALID_DOCUMENT")

            val EXPIRED_DOCUMENT = of("EXPIRED_DOCUMENT")

            val POOR_QUALITY_DOCUMENT = of("POOR_QUALITY_DOCUMENT")

            val SUSPECTED_FRAUD_DOCUMENT = of("SUSPECTED_FRAUD_DOCUMENT")

            val WRONG_DOCUMENT_TYPE = of("WRONG_DOCUMENT_TYPE")

            val INCOMPLETE_DOCUMENT = of("INCOMPLETE_DOCUMENT")

            val UNREADABLE_DOCUMENT = of("UNREADABLE_DOCUMENT")

            val DOCUMENT_VERIFICATION_FAILED = of("DOCUMENT_VERIFICATION_FAILED")

            val APPLICANT_SANCTIONED = of("APPLICANT_SANCTIONED")

            val APPLICANT_FRAUD = of("APPLICANT_FRAUD")

            val APPLICANT_CRIMINAL_RECORD = of("APPLICANT_CRIMINAL_RECORD")

            val APPLICANT_REJECTED = of("APPLICANT_REJECTED")

            val MISSING_BENEFICIAL_OWNER = of("MISSING_BENEFICIAL_OWNER")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            MISSING_FIELD,
            INVALID_FIELD,
            MISSING_LEGAL_PRESENCE_DOCUMENT,
            MISSING_CONTROL_STRUCTURE_DOCUMENT,
            MISSING_OWNERSHIP_STRUCTURE_DOCUMENT,
            MISSING_PROOF_OF_ADDRESS_DOCUMENT,
            MISSING_IDENTITY_DOCUMENT,
            INVALID_DOCUMENT,
            EXPIRED_DOCUMENT,
            POOR_QUALITY_DOCUMENT,
            SUSPECTED_FRAUD_DOCUMENT,
            WRONG_DOCUMENT_TYPE,
            INCOMPLETE_DOCUMENT,
            UNREADABLE_DOCUMENT,
            DOCUMENT_VERIFICATION_FAILED,
            APPLICANT_SANCTIONED,
            APPLICANT_FRAUD,
            APPLICANT_CRIMINAL_RECORD,
            APPLICANT_REJECTED,
            MISSING_BENEFICIAL_OWNER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MISSING_FIELD,
            INVALID_FIELD,
            MISSING_LEGAL_PRESENCE_DOCUMENT,
            MISSING_CONTROL_STRUCTURE_DOCUMENT,
            MISSING_OWNERSHIP_STRUCTURE_DOCUMENT,
            MISSING_PROOF_OF_ADDRESS_DOCUMENT,
            MISSING_IDENTITY_DOCUMENT,
            INVALID_DOCUMENT,
            EXPIRED_DOCUMENT,
            POOR_QUALITY_DOCUMENT,
            SUSPECTED_FRAUD_DOCUMENT,
            WRONG_DOCUMENT_TYPE,
            INCOMPLETE_DOCUMENT,
            UNREADABLE_DOCUMENT,
            DOCUMENT_VERIFICATION_FAILED,
            APPLICANT_SANCTIONED,
            APPLICANT_FRAUD,
            APPLICANT_CRIMINAL_RECORD,
            APPLICANT_REJECTED,
            MISSING_BENEFICIAL_OWNER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                MISSING_FIELD -> Value.MISSING_FIELD
                INVALID_FIELD -> Value.INVALID_FIELD
                MISSING_LEGAL_PRESENCE_DOCUMENT -> Value.MISSING_LEGAL_PRESENCE_DOCUMENT
                MISSING_CONTROL_STRUCTURE_DOCUMENT -> Value.MISSING_CONTROL_STRUCTURE_DOCUMENT
                MISSING_OWNERSHIP_STRUCTURE_DOCUMENT -> Value.MISSING_OWNERSHIP_STRUCTURE_DOCUMENT
                MISSING_PROOF_OF_ADDRESS_DOCUMENT -> Value.MISSING_PROOF_OF_ADDRESS_DOCUMENT
                MISSING_IDENTITY_DOCUMENT -> Value.MISSING_IDENTITY_DOCUMENT
                INVALID_DOCUMENT -> Value.INVALID_DOCUMENT
                EXPIRED_DOCUMENT -> Value.EXPIRED_DOCUMENT
                POOR_QUALITY_DOCUMENT -> Value.POOR_QUALITY_DOCUMENT
                SUSPECTED_FRAUD_DOCUMENT -> Value.SUSPECTED_FRAUD_DOCUMENT
                WRONG_DOCUMENT_TYPE -> Value.WRONG_DOCUMENT_TYPE
                INCOMPLETE_DOCUMENT -> Value.INCOMPLETE_DOCUMENT
                UNREADABLE_DOCUMENT -> Value.UNREADABLE_DOCUMENT
                DOCUMENT_VERIFICATION_FAILED -> Value.DOCUMENT_VERIFICATION_FAILED
                APPLICANT_SANCTIONED -> Value.APPLICANT_SANCTIONED
                APPLICANT_FRAUD -> Value.APPLICANT_FRAUD
                APPLICANT_CRIMINAL_RECORD -> Value.APPLICANT_CRIMINAL_RECORD
                APPLICANT_REJECTED -> Value.APPLICANT_REJECTED
                MISSING_BENEFICIAL_OWNER -> Value.MISSING_BENEFICIAL_OWNER
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
                MISSING_FIELD -> Known.MISSING_FIELD
                INVALID_FIELD -> Known.INVALID_FIELD
                MISSING_LEGAL_PRESENCE_DOCUMENT -> Known.MISSING_LEGAL_PRESENCE_DOCUMENT
                MISSING_CONTROL_STRUCTURE_DOCUMENT -> Known.MISSING_CONTROL_STRUCTURE_DOCUMENT
                MISSING_OWNERSHIP_STRUCTURE_DOCUMENT -> Known.MISSING_OWNERSHIP_STRUCTURE_DOCUMENT
                MISSING_PROOF_OF_ADDRESS_DOCUMENT -> Known.MISSING_PROOF_OF_ADDRESS_DOCUMENT
                MISSING_IDENTITY_DOCUMENT -> Known.MISSING_IDENTITY_DOCUMENT
                INVALID_DOCUMENT -> Known.INVALID_DOCUMENT
                EXPIRED_DOCUMENT -> Known.EXPIRED_DOCUMENT
                POOR_QUALITY_DOCUMENT -> Known.POOR_QUALITY_DOCUMENT
                SUSPECTED_FRAUD_DOCUMENT -> Known.SUSPECTED_FRAUD_DOCUMENT
                WRONG_DOCUMENT_TYPE -> Known.WRONG_DOCUMENT_TYPE
                INCOMPLETE_DOCUMENT -> Known.INCOMPLETE_DOCUMENT
                UNREADABLE_DOCUMENT -> Known.UNREADABLE_DOCUMENT
                DOCUMENT_VERIFICATION_FAILED -> Known.DOCUMENT_VERIFICATION_FAILED
                APPLICANT_SANCTIONED -> Known.APPLICANT_SANCTIONED
                APPLICANT_FRAUD -> Known.APPLICANT_FRAUD
                APPLICANT_CRIMINAL_RECORD -> Known.APPLICANT_CRIMINAL_RECORD
                APPLICANT_REJECTED -> Known.APPLICANT_REJECTED
                MISSING_BENEFICIAL_OWNER -> Known.MISSING_BENEFICIAL_OWNER
                else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationError &&
            reason == other.reason &&
            resourceId == other.resourceId &&
            type == other.type &&
            acceptedDocumentTypes == other.acceptedDocumentTypes &&
            field == other.field &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(reason, resourceId, type, acceptedDocumentTypes, field, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationError{reason=$reason, resourceId=$resourceId, type=$type, acceptedDocumentTypes=$acceptedDocumentTypes, field=$field, additionalProperties=$additionalProperties}"
}
