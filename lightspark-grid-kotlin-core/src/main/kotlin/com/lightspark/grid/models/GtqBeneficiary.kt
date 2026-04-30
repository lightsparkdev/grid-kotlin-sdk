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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.util.Collections
import java.util.Objects

class GtqBeneficiary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val beneficiaryType: JsonField<BeneficiaryType>,
    private val countryOfResidence: JsonField<String>,
    private val fullName: JsonField<String>,
    private val address: JsonField<Address>,
    private val birthDate: JsonField<String>,
    private val email: JsonField<String>,
    private val nationality: JsonField<String>,
    private val phoneNumber: JsonField<String>,
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
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("birthDate") @ExcludeMissing birthDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nationality")
        @ExcludeMissing
        nationality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        beneficiaryType,
        countryOfResidence,
        fullName,
        address,
        birthDate,
        email,
        nationality,
        phoneNumber,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryType(): BeneficiaryType = beneficiaryType.getRequired("beneficiaryType")

    /**
     * The country of residence of the beneficiary
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
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): Address? = address.getNullable("address")

    /**
     * The birth date of the beneficiary
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun birthDate(): String? = birthDate.getNullable("birthDate")

    /**
     * The email of the beneficiary
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * The nationality of the beneficiary
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nationality(): String? = nationality.getNullable("nationality")

    /**
     * The phone number of the beneficiary
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

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

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [birthDate].
     *
     * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("birthDate") @ExcludeMissing fun _birthDate(): JsonField<String> = birthDate

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [nationality].
     *
     * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nationality") @ExcludeMissing fun _nationality(): JsonField<String> = nationality

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * Returns a mutable builder for constructing an instance of [GtqBeneficiary].
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

    /** A builder for [GtqBeneficiary]. */
    class Builder internal constructor() {

        private var beneficiaryType: JsonField<BeneficiaryType>? = null
        private var countryOfResidence: JsonField<String>? = null
        private var fullName: JsonField<String>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var birthDate: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var nationality: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(gtqBeneficiary: GtqBeneficiary) = apply {
            beneficiaryType = gtqBeneficiary.beneficiaryType
            countryOfResidence = gtqBeneficiary.countryOfResidence
            fullName = gtqBeneficiary.fullName
            address = gtqBeneficiary.address
            birthDate = gtqBeneficiary.birthDate
            email = gtqBeneficiary.email
            nationality = gtqBeneficiary.nationality
            phoneNumber = gtqBeneficiary.phoneNumber
            additionalProperties = gtqBeneficiary.additionalProperties.toMutableMap()
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

        /** The country of residence of the beneficiary */
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

        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /** The birth date of the beneficiary */
        fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

        /**
         * Sets [Builder.birthDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun birthDate(birthDate: JsonField<String>) = apply { this.birthDate = birthDate }

        /** The email of the beneficiary */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The nationality of the beneficiary */
        fun nationality(nationality: String) = nationality(JsonField.of(nationality))

        /**
         * Sets [Builder.nationality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationality] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nationality(nationality: JsonField<String>) = apply { this.nationality = nationality }

        /** The phone number of the beneficiary */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [GtqBeneficiary].
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
        fun build(): GtqBeneficiary =
            GtqBeneficiary(
                checkRequired("beneficiaryType", beneficiaryType),
                checkRequired("countryOfResidence", countryOfResidence),
                checkRequired("fullName", fullName),
                address,
                birthDate,
                email,
                nationality,
                phoneNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GtqBeneficiary = apply {
        if (validated) {
            return@apply
        }

        beneficiaryType().validate()
        countryOfResidence()
        fullName()
        address()?.validate()
        birthDate()
        email()
        nationality()
        phoneNumber()
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
            (if (fullName.asKnown() == null) 0 else 1) +
            (address.asKnown()?.validity() ?: 0) +
            (if (birthDate.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (nationality.asKnown() == null) 0 else 1) +
            (if (phoneNumber.asKnown() == null) 0 else 1)

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

        return other is GtqBeneficiary &&
            beneficiaryType == other.beneficiaryType &&
            countryOfResidence == other.countryOfResidence &&
            fullName == other.fullName &&
            address == other.address &&
            birthDate == other.birthDate &&
            email == other.email &&
            nationality == other.nationality &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            beneficiaryType,
            countryOfResidence,
            fullName,
            address,
            birthDate,
            email,
            nationality,
            phoneNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GtqBeneficiary{beneficiaryType=$beneficiaryType, countryOfResidence=$countryOfResidence, fullName=$fullName, address=$address, birthDate=$birthDate, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
