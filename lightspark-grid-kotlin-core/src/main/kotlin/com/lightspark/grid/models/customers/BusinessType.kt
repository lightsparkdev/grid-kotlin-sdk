// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/** The high-level industry category of the business */
class BusinessType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AGRICULTURE_FORESTRY_FISHING_AND_HUNTING =
            of("AGRICULTURE_FORESTRY_FISHING_AND_HUNTING")

        val MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION =
            of("MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION")

        val UTILITIES = of("UTILITIES")

        val CONSTRUCTION = of("CONSTRUCTION")

        val MANUFACTURING = of("MANUFACTURING")

        val WHOLESALE_TRADE = of("WHOLESALE_TRADE")

        val RETAIL_TRADE = of("RETAIL_TRADE")

        val TRANSPORTATION_AND_WAREHOUSING = of("TRANSPORTATION_AND_WAREHOUSING")

        val INFORMATION = of("INFORMATION")

        val FINANCE_AND_INSURANCE = of("FINANCE_AND_INSURANCE")

        val REAL_ESTATE_AND_RENTAL_AND_LEASING = of("REAL_ESTATE_AND_RENTAL_AND_LEASING")

        val PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES =
            of("PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES")

        val MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES = of("MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES")

        val ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES =
            of("ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES")

        val EDUCATIONAL_SERVICES = of("EDUCATIONAL_SERVICES")

        val HEALTH_CARE_AND_SOCIAL_ASSISTANCE = of("HEALTH_CARE_AND_SOCIAL_ASSISTANCE")

        val ARTS_ENTERTAINMENT_AND_RECREATION = of("ARTS_ENTERTAINMENT_AND_RECREATION")

        val ACCOMMODATION_AND_FOOD_SERVICES = of("ACCOMMODATION_AND_FOOD_SERVICES")

        val OTHER_SERVICES = of("OTHER_SERVICES")

        val PUBLIC_ADMINISTRATION = of("PUBLIC_ADMINISTRATION")

        fun of(value: String) = BusinessType(JsonField.of(value))
    }

    /** An enum containing [BusinessType]'s known values. */
    enum class Known {
        AGRICULTURE_FORESTRY_FISHING_AND_HUNTING,
        MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION,
        UTILITIES,
        CONSTRUCTION,
        MANUFACTURING,
        WHOLESALE_TRADE,
        RETAIL_TRADE,
        TRANSPORTATION_AND_WAREHOUSING,
        INFORMATION,
        FINANCE_AND_INSURANCE,
        REAL_ESTATE_AND_RENTAL_AND_LEASING,
        PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES,
        MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES,
        ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES,
        EDUCATIONAL_SERVICES,
        HEALTH_CARE_AND_SOCIAL_ASSISTANCE,
        ARTS_ENTERTAINMENT_AND_RECREATION,
        ACCOMMODATION_AND_FOOD_SERVICES,
        OTHER_SERVICES,
        PUBLIC_ADMINISTRATION,
    }

    /**
     * An enum containing [BusinessType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BusinessType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AGRICULTURE_FORESTRY_FISHING_AND_HUNTING,
        MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION,
        UTILITIES,
        CONSTRUCTION,
        MANUFACTURING,
        WHOLESALE_TRADE,
        RETAIL_TRADE,
        TRANSPORTATION_AND_WAREHOUSING,
        INFORMATION,
        FINANCE_AND_INSURANCE,
        REAL_ESTATE_AND_RENTAL_AND_LEASING,
        PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES,
        MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES,
        ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES,
        EDUCATIONAL_SERVICES,
        HEALTH_CARE_AND_SOCIAL_ASSISTANCE,
        ARTS_ENTERTAINMENT_AND_RECREATION,
        ACCOMMODATION_AND_FOOD_SERVICES,
        OTHER_SERVICES,
        PUBLIC_ADMINISTRATION,
        /** An enum member indicating that [BusinessType] was instantiated with an unknown value. */
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
            AGRICULTURE_FORESTRY_FISHING_AND_HUNTING ->
                Value.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
            MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION ->
                Value.MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION
            UTILITIES -> Value.UTILITIES
            CONSTRUCTION -> Value.CONSTRUCTION
            MANUFACTURING -> Value.MANUFACTURING
            WHOLESALE_TRADE -> Value.WHOLESALE_TRADE
            RETAIL_TRADE -> Value.RETAIL_TRADE
            TRANSPORTATION_AND_WAREHOUSING -> Value.TRANSPORTATION_AND_WAREHOUSING
            INFORMATION -> Value.INFORMATION
            FINANCE_AND_INSURANCE -> Value.FINANCE_AND_INSURANCE
            REAL_ESTATE_AND_RENTAL_AND_LEASING -> Value.REAL_ESTATE_AND_RENTAL_AND_LEASING
            PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES ->
                Value.PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES
            MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES -> Value.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
            ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES ->
                Value.ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
            EDUCATIONAL_SERVICES -> Value.EDUCATIONAL_SERVICES
            HEALTH_CARE_AND_SOCIAL_ASSISTANCE -> Value.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
            ARTS_ENTERTAINMENT_AND_RECREATION -> Value.ARTS_ENTERTAINMENT_AND_RECREATION
            ACCOMMODATION_AND_FOOD_SERVICES -> Value.ACCOMMODATION_AND_FOOD_SERVICES
            OTHER_SERVICES -> Value.OTHER_SERVICES
            PUBLIC_ADMINISTRATION -> Value.PUBLIC_ADMINISTRATION
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
            AGRICULTURE_FORESTRY_FISHING_AND_HUNTING ->
                Known.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
            MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION ->
                Known.MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION
            UTILITIES -> Known.UTILITIES
            CONSTRUCTION -> Known.CONSTRUCTION
            MANUFACTURING -> Known.MANUFACTURING
            WHOLESALE_TRADE -> Known.WHOLESALE_TRADE
            RETAIL_TRADE -> Known.RETAIL_TRADE
            TRANSPORTATION_AND_WAREHOUSING -> Known.TRANSPORTATION_AND_WAREHOUSING
            INFORMATION -> Known.INFORMATION
            FINANCE_AND_INSURANCE -> Known.FINANCE_AND_INSURANCE
            REAL_ESTATE_AND_RENTAL_AND_LEASING -> Known.REAL_ESTATE_AND_RENTAL_AND_LEASING
            PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES ->
                Known.PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES
            MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES -> Known.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
            ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES ->
                Known.ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
            EDUCATIONAL_SERVICES -> Known.EDUCATIONAL_SERVICES
            HEALTH_CARE_AND_SOCIAL_ASSISTANCE -> Known.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
            ARTS_ENTERTAINMENT_AND_RECREATION -> Known.ARTS_ENTERTAINMENT_AND_RECREATION
            ACCOMMODATION_AND_FOOD_SERVICES -> Known.ACCOMMODATION_AND_FOOD_SERVICES
            OTHER_SERVICES -> Known.OTHER_SERVICES
            PUBLIC_ADMINISTRATION -> Known.PUBLIC_ADMINISTRATION
            else -> throw LightsparkGridInvalidDataException("Unknown BusinessType: $value")
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
    fun validate(): BusinessType = apply {
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

        return other is BusinessType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
