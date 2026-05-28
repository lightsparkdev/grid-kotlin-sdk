// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate which
 * document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
 * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents. APPLICANT_*
 * types indicate issues with the applicant themselves (sanctions, fraud, criminal records).
 */
class VerificationErrorType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
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

        fun of(value: String) = VerificationErrorType(JsonField.of(value))
    }

    /** An enum containing [VerificationErrorType]'s known values. */
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
     * An enum containing [VerificationErrorType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [VerificationErrorType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
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
        /**
         * An enum member indicating that [VerificationErrorType] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
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
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value is a not a known
     *   member.
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
            else ->
                throw LightsparkGridInvalidDataException("Unknown VerificationErrorType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): VerificationErrorType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationErrorType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
