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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class BusinessCustomerFields
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerType: JsonField<CustomerType>,
    private val address: JsonField<Address>,
    private val beneficialOwners: JsonField<List<BeneficialOwner>>,
    private val businessInfo: JsonField<BusinessInfo>,
    private val kybStatus: JsonField<KybStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerType")
        @ExcludeMissing
        customerType: JsonField<CustomerType> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("beneficialOwners")
        @ExcludeMissing
        beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of(),
        @JsonProperty("businessInfo")
        @ExcludeMissing
        businessInfo: JsonField<BusinessInfo> = JsonMissing.of(),
        @JsonProperty("kybStatus")
        @ExcludeMissing
        kybStatus: JsonField<KybStatus> = JsonMissing.of(),
    ) : this(customerType, address, beneficialOwners, businessInfo, kybStatus, mutableMapOf())

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
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun beneficialOwners(): List<BeneficialOwner>? =
        beneficialOwners.getNullable("beneficialOwners")

    /**
     * Additional information for business entities
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessInfo(): BusinessInfo? = businessInfo.getNullable("businessInfo")

    /**
     * The current KYB status of a business customer
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun kybStatus(): KybStatus? = kybStatus.getNullable("kybStatus")

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
     * Returns the raw JSON value of [beneficialOwners].
     *
     * Unlike [beneficialOwners], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("beneficialOwners")
    @ExcludeMissing
    fun _beneficialOwners(): JsonField<List<BeneficialOwner>> = beneficialOwners

    /**
     * Returns the raw JSON value of [businessInfo].
     *
     * Unlike [businessInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessInfo")
    @ExcludeMissing
    fun _businessInfo(): JsonField<BusinessInfo> = businessInfo

    /**
     * Returns the raw JSON value of [kybStatus].
     *
     * Unlike [kybStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kybStatus") @ExcludeMissing fun _kybStatus(): JsonField<KybStatus> = kybStatus

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
         * Returns a mutable builder for constructing an instance of [BusinessCustomerFields].
         *
         * The following fields are required:
         * ```kotlin
         * .customerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BusinessCustomerFields]. */
    class Builder internal constructor() {

        private var customerType: JsonField<CustomerType>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var beneficialOwners: JsonField<MutableList<BeneficialOwner>>? = null
        private var businessInfo: JsonField<BusinessInfo> = JsonMissing.of()
        private var kybStatus: JsonField<KybStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(businessCustomerFields: BusinessCustomerFields) = apply {
            customerType = businessCustomerFields.customerType
            address = businessCustomerFields.address
            beneficialOwners = businessCustomerFields.beneficialOwners.map { it.toMutableList() }
            businessInfo = businessCustomerFields.businessInfo
            kybStatus = businessCustomerFields.kybStatus
            additionalProperties = businessCustomerFields.additionalProperties.toMutableMap()
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

        fun beneficialOwners(beneficialOwners: List<BeneficialOwner>) =
            beneficialOwners(JsonField.of(beneficialOwners))

        /**
         * Sets [Builder.beneficialOwners] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficialOwners] with a well-typed
         * `List<BeneficialOwner>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun beneficialOwners(beneficialOwners: JsonField<List<BeneficialOwner>>) = apply {
            this.beneficialOwners = beneficialOwners.map { it.toMutableList() }
        }

        /**
         * Adds a single [BeneficialOwner] to [beneficialOwners].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBeneficialOwner(beneficialOwner: BeneficialOwner) = apply {
            beneficialOwners =
                (beneficialOwners ?: JsonField.of(mutableListOf())).also {
                    checkKnown("beneficialOwners", it).add(beneficialOwner)
                }
        }

        /** Additional information for business entities */
        fun businessInfo(businessInfo: BusinessInfo) = businessInfo(JsonField.of(businessInfo))

        /**
         * Sets [Builder.businessInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessInfo] with a well-typed [BusinessInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessInfo(businessInfo: JsonField<BusinessInfo>) = apply {
            this.businessInfo = businessInfo
        }

        /** The current KYB status of a business customer */
        fun kybStatus(kybStatus: KybStatus) = kybStatus(JsonField.of(kybStatus))

        /**
         * Sets [Builder.kybStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kybStatus] with a well-typed [KybStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kybStatus(kybStatus: JsonField<KybStatus>) = apply { this.kybStatus = kybStatus }

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
         * Returns an immutable instance of [BusinessCustomerFields].
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
        fun build(): BusinessCustomerFields =
            BusinessCustomerFields(
                checkRequired("customerType", customerType),
                address,
                (beneficialOwners ?: JsonMissing.of()).map { it.toImmutable() },
                businessInfo,
                kybStatus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BusinessCustomerFields = apply {
        if (validated) {
            return@apply
        }

        customerType().validate()
        address()?.validate()
        beneficialOwners()?.forEach { it.validate() }
        businessInfo()?.validate()
        kybStatus()?.validate()
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
            (beneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (businessInfo.asKnown()?.validity() ?: 0) +
            (kybStatus.asKnown()?.validity() ?: 0)

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

            val BUSINESS = of("BUSINESS")

            fun of(value: String) = CustomerType(JsonField.of(value))
        }

        /** An enum containing [CustomerType]'s known values. */
        enum class Known {
            BUSINESS
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
            BUSINESS,
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
                BUSINESS -> Value.BUSINESS
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
                BUSINESS -> Known.BUSINESS
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

    class BeneficialOwner
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fullName: JsonField<String>,
        private val individualType: JsonField<IndividualType>,
        private val address: JsonField<Address>,
        private val birthDate: JsonField<LocalDate>,
        private val emailAddress: JsonField<String>,
        private val nationality: JsonField<String>,
        private val percentageOwnership: JsonField<Double>,
        private val phoneNumber: JsonField<String>,
        private val taxId: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fullName")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("individualType")
            @ExcludeMissing
            individualType: JsonField<IndividualType> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("birthDate")
            @ExcludeMissing
            birthDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("emailAddress")
            @ExcludeMissing
            emailAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nationality")
            @ExcludeMissing
            nationality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("percentageOwnership")
            @ExcludeMissing
            percentageOwnership: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            fullName,
            individualType,
            address,
            birthDate,
            emailAddress,
            nationality,
            percentageOwnership,
            phoneNumber,
            taxId,
            title,
            mutableMapOf(),
        )

        /**
         * Individual's full name
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fullName(): String = fullName.getRequired("fullName")

        /**
         * Type of individual in the corporation
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun individualType(): IndividualType = individualType.getRequired("individualType")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Address? = address.getNullable("address")

        /**
         * Date of birth in ISO 8601 format (YYYY-MM-DD)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthDate(): LocalDate? = birthDate.getNullable("birthDate")

        /**
         * Email address of the individual
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun emailAddress(): String? = emailAddress.getNullable("emailAddress")

        /**
         * Country code (ISO 3166-1 alpha-2)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nationality(): String? = nationality.getNullable("nationality")

        /**
         * Percent of ownership when individual type is beneficial owner
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun percentageOwnership(): Double? = percentageOwnership.getNullable("percentageOwnership")

        /**
         * Phone number of the individual in E.164 format
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

        /**
         * Tax identification number of the individual. This could be a Social Security Number (SSN)
         * for US individuals, Tax Identification Number (TIN) for non-US individuals, or a Passport
         * Number.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("taxId")

        /**
         * Title at company
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun title(): String? = title.getNullable("title")

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [individualType].
         *
         * Unlike [individualType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individualType")
        @ExcludeMissing
        fun _individualType(): JsonField<IndividualType> = individualType

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
        @JsonProperty("birthDate")
        @ExcludeMissing
        fun _birthDate(): JsonField<LocalDate> = birthDate

        /**
         * Returns the raw JSON value of [emailAddress].
         *
         * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emailAddress")
        @ExcludeMissing
        fun _emailAddress(): JsonField<String> = emailAddress

        /**
         * Returns the raw JSON value of [nationality].
         *
         * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nationality")
        @ExcludeMissing
        fun _nationality(): JsonField<String> = nationality

        /**
         * Returns the raw JSON value of [percentageOwnership].
         *
         * Unlike [percentageOwnership], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("percentageOwnership")
        @ExcludeMissing
        fun _percentageOwnership(): JsonField<Double> = percentageOwnership

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * Returns a mutable builder for constructing an instance of [BeneficialOwner].
             *
             * The following fields are required:
             * ```kotlin
             * .fullName()
             * .individualType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BeneficialOwner]. */
        class Builder internal constructor() {

            private var fullName: JsonField<String>? = null
            private var individualType: JsonField<IndividualType>? = null
            private var address: JsonField<Address> = JsonMissing.of()
            private var birthDate: JsonField<LocalDate> = JsonMissing.of()
            private var emailAddress: JsonField<String> = JsonMissing.of()
            private var nationality: JsonField<String> = JsonMissing.of()
            private var percentageOwnership: JsonField<Double> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(beneficialOwner: BeneficialOwner) = apply {
                fullName = beneficialOwner.fullName
                individualType = beneficialOwner.individualType
                address = beneficialOwner.address
                birthDate = beneficialOwner.birthDate
                emailAddress = beneficialOwner.emailAddress
                nationality = beneficialOwner.nationality
                percentageOwnership = beneficialOwner.percentageOwnership
                phoneNumber = beneficialOwner.phoneNumber
                taxId = beneficialOwner.taxId
                title = beneficialOwner.title
                additionalProperties = beneficialOwner.additionalProperties.toMutableMap()
            }

            /** Individual's full name */
            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            /** Type of individual in the corporation */
            fun individualType(individualType: IndividualType) =
                individualType(JsonField.of(individualType))

            /**
             * Sets [Builder.individualType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualType] with a well-typed [IndividualType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun individualType(individualType: JsonField<IndividualType>) = apply {
                this.individualType = individualType
            }

            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
            fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

            /**
             * Sets [Builder.birthDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

            /** Email address of the individual */
            fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

            /**
             * Sets [Builder.emailAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailAddress(emailAddress: JsonField<String>) = apply {
                this.emailAddress = emailAddress
            }

            /** Country code (ISO 3166-1 alpha-2) */
            fun nationality(nationality: String) = nationality(JsonField.of(nationality))

            /**
             * Sets [Builder.nationality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationality] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationality(nationality: JsonField<String>) = apply {
                this.nationality = nationality
            }

            /** Percent of ownership when individual type is beneficial owner */
            fun percentageOwnership(percentageOwnership: Double) =
                percentageOwnership(JsonField.of(percentageOwnership))

            /**
             * Sets [Builder.percentageOwnership] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentageOwnership] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun percentageOwnership(percentageOwnership: JsonField<Double>) = apply {
                this.percentageOwnership = percentageOwnership
            }

            /** Phone number of the individual in E.164 format */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * Tax identification number of the individual. This could be a Social Security Number
             * (SSN) for US individuals, Tax Identification Number (TIN) for non-US individuals, or
             * a Passport Number.
             */
            fun taxId(taxId: String) = taxId(JsonField.of(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

            /** Title at company */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [BeneficialOwner].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .fullName()
             * .individualType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BeneficialOwner =
                BeneficialOwner(
                    checkRequired("fullName", fullName),
                    checkRequired("individualType", individualType),
                    address,
                    birthDate,
                    emailAddress,
                    nationality,
                    percentageOwnership,
                    phoneNumber,
                    taxId,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BeneficialOwner = apply {
            if (validated) {
                return@apply
            }

            fullName()
            individualType().validate()
            address()?.validate()
            birthDate()
            emailAddress()
            nationality()
            percentageOwnership()
            phoneNumber()
            taxId()
            title()
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
        internal fun validity(): Int =
            (if (fullName.asKnown() == null) 0 else 1) +
                (individualType.asKnown()?.validity() ?: 0) +
                (address.asKnown()?.validity() ?: 0) +
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (emailAddress.asKnown() == null) 0 else 1) +
                (if (nationality.asKnown() == null) 0 else 1) +
                (if (percentageOwnership.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1)

        /** Type of individual in the corporation */
        class IndividualType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val DIRECTOR = of("DIRECTOR")

                val CONTROL_PERSON = of("CONTROL_PERSON")

                val BUSINESS_POINT_OF_CONTACT = of("BUSINESS_POINT_OF_CONTACT")

                val TRUSTEE = of("TRUSTEE")

                val SETTLOR = of("SETTLOR")

                val GENERAL_PARTNER = of("GENERAL_PARTNER")

                fun of(value: String) = IndividualType(JsonField.of(value))
            }

            /** An enum containing [IndividualType]'s known values. */
            enum class Known {
                DIRECTOR,
                CONTROL_PERSON,
                BUSINESS_POINT_OF_CONTACT,
                TRUSTEE,
                SETTLOR,
                GENERAL_PARTNER,
            }

            /**
             * An enum containing [IndividualType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IndividualType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECTOR,
                CONTROL_PERSON,
                BUSINESS_POINT_OF_CONTACT,
                TRUSTEE,
                SETTLOR,
                GENERAL_PARTNER,
                /**
                 * An enum member indicating that [IndividualType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DIRECTOR -> Value.DIRECTOR
                    CONTROL_PERSON -> Value.CONTROL_PERSON
                    BUSINESS_POINT_OF_CONTACT -> Value.BUSINESS_POINT_OF_CONTACT
                    TRUSTEE -> Value.TRUSTEE
                    SETTLOR -> Value.SETTLOR
                    GENERAL_PARTNER -> Value.GENERAL_PARTNER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    DIRECTOR -> Known.DIRECTOR
                    CONTROL_PERSON -> Known.CONTROL_PERSON
                    BUSINESS_POINT_OF_CONTACT -> Known.BUSINESS_POINT_OF_CONTACT
                    TRUSTEE -> Known.TRUSTEE
                    SETTLOR -> Known.SETTLOR
                    GENERAL_PARTNER -> Known.GENERAL_PARTNER
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown IndividualType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): IndividualType = apply {
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

                return other is IndividualType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BeneficialOwner &&
                fullName == other.fullName &&
                individualType == other.individualType &&
                address == other.address &&
                birthDate == other.birthDate &&
                emailAddress == other.emailAddress &&
                nationality == other.nationality &&
                percentageOwnership == other.percentageOwnership &&
                phoneNumber == other.phoneNumber &&
                taxId == other.taxId &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fullName,
                individualType,
                address,
                birthDate,
                emailAddress,
                nationality,
                percentageOwnership,
                phoneNumber,
                taxId,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BeneficialOwner{fullName=$fullName, individualType=$individualType, address=$address, birthDate=$birthDate, emailAddress=$emailAddress, nationality=$nationality, percentageOwnership=$percentageOwnership, phoneNumber=$phoneNumber, taxId=$taxId, title=$title, additionalProperties=$additionalProperties}"
    }

    /** Additional information for business entities */
    class BusinessInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val businessType: JsonField<BusinessType>,
        private val legalName: JsonField<String>,
        private val registrationNumber: JsonField<String>,
        private val taxId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("businessType")
            @ExcludeMissing
            businessType: JsonField<BusinessType> = JsonMissing.of(),
            @JsonProperty("legalName")
            @ExcludeMissing
            legalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registrationNumber")
            @ExcludeMissing
            registrationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        ) : this(businessType, legalName, registrationNumber, taxId, mutableMapOf())

        /**
         * The high-level industry category of the business
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun businessType(): BusinessType? = businessType.getNullable("businessType")

        /**
         * Legal name of the business
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalName(): String? = legalName.getNullable("legalName")

        /**
         * Business registration number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun registrationNumber(): String? = registrationNumber.getNullable("registrationNumber")

        /**
         * Tax identification number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("taxId")

        /**
         * Returns the raw JSON value of [businessType].
         *
         * Unlike [businessType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("businessType")
        @ExcludeMissing
        fun _businessType(): JsonField<BusinessType> = businessType

        /**
         * Returns the raw JSON value of [legalName].
         *
         * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legalName") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

        /**
         * Returns the raw JSON value of [registrationNumber].
         *
         * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [BusinessInfo]. */
            fun builder() = Builder()
        }

        /** A builder for [BusinessInfo]. */
        class Builder internal constructor() {

            private var businessType: JsonField<BusinessType> = JsonMissing.of()
            private var legalName: JsonField<String> = JsonMissing.of()
            private var registrationNumber: JsonField<String> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(businessInfo: BusinessInfo) = apply {
                businessType = businessInfo.businessType
                legalName = businessInfo.legalName
                registrationNumber = businessInfo.registrationNumber
                taxId = businessInfo.taxId
                additionalProperties = businessInfo.additionalProperties.toMutableMap()
            }

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

            /** Legal name of the business */
            fun legalName(legalName: String) = legalName(JsonField.of(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

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
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             */
            fun build(): BusinessInfo =
                BusinessInfo(
                    businessType,
                    legalName,
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

            businessType()?.validate()
            legalName()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (businessType.asKnown()?.validity() ?: 0) +
                (if (legalName.asKnown() == null) 0 else 1) +
                (if (registrationNumber.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1)

        /** The high-level industry category of the business */
        class BusinessType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                 * An enum member indicating that [BusinessType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
                        Value
                            .ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
                        Known
                            .ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

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
                businessType == other.businessType &&
                legalName == other.legalName &&
                registrationNumber == other.registrationNumber &&
                taxId == other.taxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(businessType, legalName, registrationNumber, taxId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BusinessInfo{businessType=$businessType, legalName=$legalName, registrationNumber=$registrationNumber, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    /** The current KYB status of a business customer */
    class KybStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val AWAITING_SUBMISSION = of("AWAITING_SUBMISSION")

            val APPROVED = of("APPROVED")

            val REJECTED = of("REJECTED")

            val PENDING_REVIEW = of("PENDING_REVIEW")

            val EXPIRED = of("EXPIRED")

            val CANCELED = of("CANCELED")

            val MANUALLY_APPROVED = of("MANUALLY_APPROVED")

            val MANUALLY_REJECTED = of("MANUALLY_REJECTED")

            fun of(value: String) = KybStatus(JsonField.of(value))
        }

        /** An enum containing [KybStatus]'s known values. */
        enum class Known {
            AWAITING_SUBMISSION,
            APPROVED,
            REJECTED,
            PENDING_REVIEW,
            EXPIRED,
            CANCELED,
            MANUALLY_APPROVED,
            MANUALLY_REJECTED,
        }

        /**
         * An enum containing [KybStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [KybStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AWAITING_SUBMISSION,
            APPROVED,
            REJECTED,
            PENDING_REVIEW,
            EXPIRED,
            CANCELED,
            MANUALLY_APPROVED,
            MANUALLY_REJECTED,
            /**
             * An enum member indicating that [KybStatus] was instantiated with an unknown value.
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
                AWAITING_SUBMISSION -> Value.AWAITING_SUBMISSION
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
                PENDING_REVIEW -> Value.PENDING_REVIEW
                EXPIRED -> Value.EXPIRED
                CANCELED -> Value.CANCELED
                MANUALLY_APPROVED -> Value.MANUALLY_APPROVED
                MANUALLY_REJECTED -> Value.MANUALLY_REJECTED
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
                AWAITING_SUBMISSION -> Known.AWAITING_SUBMISSION
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                PENDING_REVIEW -> Known.PENDING_REVIEW
                EXPIRED -> Known.EXPIRED
                CANCELED -> Known.CANCELED
                MANUALLY_APPROVED -> Known.MANUALLY_APPROVED
                MANUALLY_REJECTED -> Known.MANUALLY_REJECTED
                else -> throw LightsparkGridInvalidDataException("Unknown KybStatus: $value")
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

        fun validate(): KybStatus = apply {
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

            return other is KybStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessCustomerFields &&
            customerType == other.customerType &&
            address == other.address &&
            beneficialOwners == other.beneficialOwners &&
            businessInfo == other.businessInfo &&
            kybStatus == other.kybStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            customerType,
            address,
            beneficialOwners,
            businessInfo,
            kybStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessCustomerFields{customerType=$customerType, address=$address, beneficialOwners=$beneficialOwners, businessInfo=$businessInfo, kybStatus=$kybStatus, additionalProperties=$additionalProperties}"
}
