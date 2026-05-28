// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * Non-identity verification documents. **Business — Legal presence** —
 * CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION,
 * STATE_REGISTRY_EXCERPT **Business — Control structure** — DIRECTOR_REGISTRY, TRUST_AGREEMENT,
 * STATE_COMPANY_REGISTRY, PARTNERSHIP_CONTROL_AGREEMENT **Business — Ownership structure** —
 * SHAREHOLDER_REGISTER, TRUST_AGREEMENT, PARTNERSHIP_AGREEMENT **Proof of address** — UTILITY_BILL,
 * RENT_OR_LEASE_AGREEMENT, ELECTRICITY_BILL, BANK_STATEMENT, TAX_RETURN
 */
class NonIdentityDocumentType
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
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

        fun of(value: String) = NonIdentityDocumentType(JsonField.of(value))
    }

    /** An enum containing [NonIdentityDocumentType]'s known values. */
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
     * An enum containing [NonIdentityDocumentType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [NonIdentityDocumentType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
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
         * An enum member indicating that [NonIdentityDocumentType] was instantiated with an unknown
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
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value is a not a known
     *   member.
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
                throw LightsparkGridInvalidDataException("Unknown NonIdentityDocumentType: $value")
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
    fun validate(): NonIdentityDocumentType = apply {
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

        return other is NonIdentityDocumentType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
