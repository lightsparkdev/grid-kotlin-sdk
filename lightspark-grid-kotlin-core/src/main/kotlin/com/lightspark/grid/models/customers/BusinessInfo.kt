// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

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

/** Additional information required for business entities */
class BusinessInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val legalName: JsonField<String>,
    private val businessType: JsonField<BusinessType>,
    private val registrationNumber: JsonField<String>,
    private val taxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("legalName") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessType")
        @ExcludeMissing
        businessType: JsonField<BusinessType> = JsonMissing.of(),
        @JsonProperty("registrationNumber")
        @ExcludeMissing
        registrationNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
    ) : this(legalName, businessType, registrationNumber, taxId, mutableMapOf())

    /**
     * Legal name of the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = legalName.getRequired("legalName")

    /**
     * The high-level industry category of the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessType(): BusinessType? = businessType.getNullable("businessType")

    /**
     * Business registration number
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun registrationNumber(): String? = registrationNumber.getNullable("registrationNumber")

    /**
     * Tax identification number
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = taxId.getNullable("taxId")

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legalName") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    /**
     * Returns the raw JSON value of [businessType].
     *
     * Unlike [businessType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessType")
    @ExcludeMissing
    fun _businessType(): JsonField<BusinessType> = businessType

    /**
     * Returns the raw JSON value of [registrationNumber].
     *
     * Unlike [registrationNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registrationNumber")
    @ExcludeMissing
    fun _registrationNumber(): JsonField<String> = registrationNumber

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
         * Returns a mutable builder for constructing an instance of [BusinessInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .legalName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BusinessInfo]. */
    class Builder internal constructor() {

        private var legalName: JsonField<String>? = null
        private var businessType: JsonField<BusinessType> = JsonMissing.of()
        private var registrationNumber: JsonField<String> = JsonMissing.of()
        private var taxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(businessInfo: BusinessInfo) = apply {
            legalName = businessInfo.legalName
            businessType = businessInfo.businessType
            registrationNumber = businessInfo.registrationNumber
            taxId = businessInfo.taxId
            additionalProperties = businessInfo.additionalProperties.toMutableMap()
        }

        /** Legal name of the business */
        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        /** The high-level industry category of the business */
        fun businessType(businessType: BusinessType) = businessType(JsonField.of(businessType))

        /**
         * Sets [Builder.businessType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessType] with a well-typed [BusinessType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessType(businessType: JsonField<BusinessType>) = apply {
            this.businessType = businessType
        }

        /** Business registration number */
        fun registrationNumber(registrationNumber: String) =
            registrationNumber(JsonField.of(registrationNumber))

        /**
         * Sets [Builder.registrationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationNumber(registrationNumber: JsonField<String>) = apply {
            this.registrationNumber = registrationNumber
        }

        /** Tax identification number */
        fun taxId(taxId: String) = taxId(JsonField.of(taxId))

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
         * Returns an immutable instance of [BusinessInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .legalName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BusinessInfo =
            BusinessInfo(
                checkRequired("legalName", legalName),
                businessType,
                registrationNumber,
                taxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BusinessInfo = apply {
        if (validated) {
            return@apply
        }

        legalName()
        businessType()?.validate()
        registrationNumber()
        taxId()
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
        (if (legalName.asKnown() == null) 0 else 1) +
            (businessType.asKnown()?.validity() ?: 0) +
            (if (registrationNumber.asKnown() == null) 0 else 1) +
            (if (taxId.asKnown() == null) 0 else 1)

    /** The high-level industry category of the business */
    class BusinessType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES =
                of("MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES")

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /**
             * An enum member indicating that [BusinessType] was instantiated with an unknown value.
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
                MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES ->
                    Value.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
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
                MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES ->
                    Known.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

        private var validated: Boolean = false

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

            return other is BusinessType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessInfo &&
            legalName == other.legalName &&
            businessType == other.businessType &&
            registrationNumber == other.registrationNumber &&
            taxId == other.taxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(legalName, businessType, registrationNumber, taxId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessInfo{legalName=$legalName, businessType=$businessType, registrationNumber=$registrationNumber, taxId=$taxId, additionalProperties=$additionalProperties}"
}
