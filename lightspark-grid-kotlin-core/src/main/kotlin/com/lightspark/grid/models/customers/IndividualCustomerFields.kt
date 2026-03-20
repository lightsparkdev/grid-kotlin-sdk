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
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class IndividualCustomerFields
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerType: JsonField<CustomerType>,
    private val address: JsonField<Address>,
    private val birthDate: JsonField<LocalDate>,
    private val fullName: JsonField<String>,
    private val kycStatus: JsonField<KycStatus>,
    private val nationality: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerType")
        @ExcludeMissing
        customerType: JsonField<CustomerType> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("birthDate")
        @ExcludeMissing
        birthDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("fullName") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kycStatus")
        @ExcludeMissing
        kycStatus: JsonField<KycStatus> = JsonMissing.of(),
        @JsonProperty("nationality")
        @ExcludeMissing
        nationality: JsonField<String> = JsonMissing.of(),
    ) : this(customerType, address, birthDate, fullName, kycStatus, nationality, mutableMapOf())

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerType(): CustomerType = customerType.getRequired("customerType")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): Address? = address.getNullable("address")

    /**
     * Date of birth in ISO 8601 format (YYYY-MM-DD)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun birthDate(): LocalDate? = birthDate.getNullable("birthDate")

    /**
     * Individual's full name
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fullName(): String? = fullName.getNullable("fullName")

    /**
     * The current KYC status of a customer
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun kycStatus(): KycStatus? = kycStatus.getNullable("kycStatus")

    /**
     * Country code (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nationality(): String? = nationality.getNullable("nationality")

    /**
     * Returns the raw JSON value of [customerType].
     *
     * Unlike [customerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerType")
    @ExcludeMissing
    fun _customerType(): JsonField<CustomerType> = customerType

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
    @JsonProperty("birthDate") @ExcludeMissing fun _birthDate(): JsonField<LocalDate> = birthDate

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [kycStatus].
     *
     * Unlike [kycStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kycStatus") @ExcludeMissing fun _kycStatus(): JsonField<KycStatus> = kycStatus

    /**
     * Returns the raw JSON value of [nationality].
     *
     * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nationality") @ExcludeMissing fun _nationality(): JsonField<String> = nationality

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
         * Returns a mutable builder for constructing an instance of [IndividualCustomerFields].
         *
         * The following fields are required:
         * ```kotlin
         * .customerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IndividualCustomerFields]. */
    class Builder internal constructor() {

        private var customerType: JsonField<CustomerType>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var birthDate: JsonField<LocalDate> = JsonMissing.of()
        private var fullName: JsonField<String> = JsonMissing.of()
        private var kycStatus: JsonField<KycStatus> = JsonMissing.of()
        private var nationality: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(individualCustomerFields: IndividualCustomerFields) = apply {
            customerType = individualCustomerFields.customerType
            address = individualCustomerFields.address
            birthDate = individualCustomerFields.birthDate
            fullName = individualCustomerFields.fullName
            kycStatus = individualCustomerFields.kycStatus
            nationality = individualCustomerFields.nationality
            additionalProperties = individualCustomerFields.additionalProperties.toMutableMap()
        }

        fun customerType(customerType: CustomerType) = customerType(JsonField.of(customerType))

        /**
         * Sets [Builder.customerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerType] with a well-typed [CustomerType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerType(customerType: JsonField<CustomerType>) = apply {
            this.customerType = customerType
        }

        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
        fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

        /**
         * Sets [Builder.birthDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

        /** Individual's full name */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /** The current KYC status of a customer */
        fun kycStatus(kycStatus: KycStatus) = kycStatus(JsonField.of(kycStatus))

        /**
         * Sets [Builder.kycStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kycStatus] with a well-typed [KycStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kycStatus(kycStatus: JsonField<KycStatus>) = apply { this.kycStatus = kycStatus }

        /** Country code (ISO 3166-1 alpha-2) */
        fun nationality(nationality: String) = nationality(JsonField.of(nationality))

        /**
         * Sets [Builder.nationality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationality] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nationality(nationality: JsonField<String>) = apply { this.nationality = nationality }

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
         * Returns an immutable instance of [IndividualCustomerFields].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customerType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualCustomerFields =
            IndividualCustomerFields(
                checkRequired("customerType", customerType),
                address,
                birthDate,
                fullName,
                kycStatus,
                nationality,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndividualCustomerFields = apply {
        if (validated) {
            return@apply
        }

        customerType().validate()
        address()?.validate()
        birthDate()
        fullName()
        kycStatus()?.validate()
        nationality()
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
        (customerType.asKnown()?.validity() ?: 0) +
            (address.asKnown()?.validity() ?: 0) +
            (if (birthDate.asKnown() == null) 0 else 1) +
            (if (fullName.asKnown() == null) 0 else 1) +
            (kycStatus.asKnown()?.validity() ?: 0) +
            (if (nationality.asKnown() == null) 0 else 1)

    class CustomerType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            fun of(value: String) = CustomerType(JsonField.of(value))
        }

        /** An enum containing [CustomerType]'s known values. */
        enum class Known {
            INDIVIDUAL
        }

        /**
         * An enum containing [CustomerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CustomerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INDIVIDUAL,
            /**
             * An enum member indicating that [CustomerType] was instantiated with an unknown value.
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
                else -> throw LightsparkGridInvalidDataException("Unknown CustomerType: $value")
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

        fun validate(): CustomerType = apply {
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

            return other is CustomerType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The current KYC status of a customer */
    class KycStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val UNVERIFIED = of("UNVERIFIED")

            val PENDING = of("PENDING")

            val APPROVED = of("APPROVED")

            val REJECTED = of("REJECTED")

            fun of(value: String) = KycStatus(JsonField.of(value))
        }

        /** An enum containing [KycStatus]'s known values. */
        enum class Known {
            UNVERIFIED,
            PENDING,
            APPROVED,
            REJECTED,
        }

        /**
         * An enum containing [KycStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [KycStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNVERIFIED,
            PENDING,
            APPROVED,
            REJECTED,
            /**
             * An enum member indicating that [KycStatus] was instantiated with an unknown value.
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
                UNVERIFIED -> Value.UNVERIFIED
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
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
                UNVERIFIED -> Known.UNVERIFIED
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                else -> throw LightsparkGridInvalidDataException("Unknown KycStatus: $value")
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

        fun validate(): KycStatus = apply {
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

            return other is KycStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndividualCustomerFields &&
            customerType == other.customerType &&
            address == other.address &&
            birthDate == other.birthDate &&
            fullName == other.fullName &&
            kycStatus == other.kycStatus &&
            nationality == other.nationality &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            customerType,
            address,
            birthDate,
            fullName,
            kycStatus,
            nationality,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualCustomerFields{customerType=$customerType, address=$address, birthDate=$birthDate, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, additionalProperties=$additionalProperties}"
}
