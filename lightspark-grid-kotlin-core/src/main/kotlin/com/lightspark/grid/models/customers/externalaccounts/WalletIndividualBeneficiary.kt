// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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

class WalletIndividualBeneficiary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val beneficiaryType: JsonField<BeneficiaryType>,
    private val countryOfResidence: JsonField<String>,
    private val fullName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("beneficiaryType")
        @ExcludeMissing
        beneficiaryType: JsonField<BeneficiaryType> = JsonMissing.of(),
        @JsonProperty("countryOfResidence")
        @ExcludeMissing
        countryOfResidence: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fullName") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
    ) : this(beneficiaryType, countryOfResidence, fullName, mutableMapOf())

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryType(): BeneficiaryType = beneficiaryType.getRequired("beneficiaryType")

    /**
     * The country of residence of the beneficiary (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryOfResidence(): String = countryOfResidence.getRequired("countryOfResidence")

    /**
     * The full name of the beneficiary
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullName(): String = fullName.getRequired("fullName")

    /**
     * Returns the raw JSON value of [beneficiaryType].
     *
     * Unlike [beneficiaryType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiaryType")
    @ExcludeMissing
    fun _beneficiaryType(): JsonField<BeneficiaryType> = beneficiaryType

    /**
     * Returns the raw JSON value of [countryOfResidence].
     *
     * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("countryOfResidence")
    @ExcludeMissing
    fun _countryOfResidence(): JsonField<String> = countryOfResidence

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

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
         * Returns a mutable builder for constructing an instance of [WalletIndividualBeneficiary].
         *
         * The following fields are required:
         * ```kotlin
         * .beneficiaryType()
         * .countryOfResidence()
         * .fullName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WalletIndividualBeneficiary]. */
    class Builder internal constructor() {

        private var beneficiaryType: JsonField<BeneficiaryType>? = null
        private var countryOfResidence: JsonField<String>? = null
        private var fullName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(walletIndividualBeneficiary: WalletIndividualBeneficiary) = apply {
            beneficiaryType = walletIndividualBeneficiary.beneficiaryType
            countryOfResidence = walletIndividualBeneficiary.countryOfResidence
            fullName = walletIndividualBeneficiary.fullName
            additionalProperties = walletIndividualBeneficiary.additionalProperties.toMutableMap()
        }

        fun beneficiaryType(beneficiaryType: BeneficiaryType) =
            beneficiaryType(JsonField.of(beneficiaryType))

        /**
         * Sets [Builder.beneficiaryType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryType] with a well-typed [BeneficiaryType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryType(beneficiaryType: JsonField<BeneficiaryType>) = apply {
            this.beneficiaryType = beneficiaryType
        }

        /** The country of residence of the beneficiary (ISO 3166-1 alpha-2) */
        fun countryOfResidence(countryOfResidence: String) =
            countryOfResidence(JsonField.of(countryOfResidence))

        /**
         * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryOfResidence] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
            this.countryOfResidence = countryOfResidence
        }

        /** The full name of the beneficiary */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

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
         * Returns an immutable instance of [WalletIndividualBeneficiary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .beneficiaryType()
         * .countryOfResidence()
         * .fullName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WalletIndividualBeneficiary =
            WalletIndividualBeneficiary(
                checkRequired("beneficiaryType", beneficiaryType),
                checkRequired("countryOfResidence", countryOfResidence),
                checkRequired("fullName", fullName),
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
    fun validate(): WalletIndividualBeneficiary = apply {
        if (validated) {
            return@apply
        }

        beneficiaryType().validate()
        countryOfResidence()
        fullName()
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
        (beneficiaryType.asKnown()?.validity() ?: 0) +
            (if (countryOfResidence.asKnown() == null) 0 else 1) +
            (if (fullName.asKnown() == null) 0 else 1)

    class BeneficiaryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val INDIVIDUAL = of("INDIVIDUAL")

            fun of(value: String) = BeneficiaryType(JsonField.of(value))
        }

        /** An enum containing [BeneficiaryType]'s known values. */
        enum class Known {
            INDIVIDUAL
        }

        /**
         * An enum containing [BeneficiaryType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BeneficiaryType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INDIVIDUAL,
            /**
             * An enum member indicating that [BeneficiaryType] was instantiated with an unknown
             * value.
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
                INDIVIDUAL -> Value.INDIVIDUAL
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
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LightsparkGridInvalidDataException("Unknown BeneficiaryType: $value")
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
        fun validate(): BeneficiaryType = apply {
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

            return other is BeneficiaryType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WalletIndividualBeneficiary &&
            beneficiaryType == other.beneficiaryType &&
            countryOfResidence == other.countryOfResidence &&
            fullName == other.fullName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(beneficiaryType, countryOfResidence, fullName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WalletIndividualBeneficiary{beneficiaryType=$beneficiaryType, countryOfResidence=$countryOfResidence, fullName=$fullName, additionalProperties=$additionalProperties}"
}
