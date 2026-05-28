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
import com.lightspark.grid.models.BusinessInfoUpdate
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.util.Collections
import java.util.Objects

/**
 * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer with tied
 * Embedded Wallet internal accounts, Grid updates the customer email and every tied `EMAIL_OTP`
 * credential across all tied Embedded Wallets through the endpoint's signed-retry flow.
 */
class BusinessCustomerUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerType: JsonField<CustomerType>,
    private val address: JsonField<Address>,
    private val businessInfo: JsonField<BusinessInfoUpdate>,
    private val currencies: JsonField<List<String>>,
    private val email: JsonField<String>,
    private val kybStatus: JsonField<KybStatus>,
    private val umaAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerType")
        @ExcludeMissing
        customerType: JsonField<CustomerType> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("businessInfo")
        @ExcludeMissing
        businessInfo: JsonField<BusinessInfoUpdate> = JsonMissing.of(),
        @JsonProperty("currencies")
        @ExcludeMissing
        currencies: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kybStatus")
        @ExcludeMissing
        kybStatus: JsonField<KybStatus> = JsonMissing.of(),
        @JsonProperty("umaAddress") @ExcludeMissing umaAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        customerType,
        address,
        businessInfo,
        currencies,
        email,
        kybStatus,
        umaAddress,
        mutableMapOf(),
    )

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
     * Additional information for business entities
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessInfo(): BusinessInfoUpdate? = businessInfo.getNullable("businessInfo")

    /**
     * Updated list of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD", "EUR";
     * tickers for crypto, e.g. "BTC", "USDC"). Replaces the existing list. Some currency
     * combinations may require separate customers — if so, the request will be rejected with
     * details.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencies(): List<String>? = currencies.getNullable("currencies")

    /**
     * Email address for the customer. For customers with tied Embedded Wallet internal accounts,
     * changing this value also updates every tied `EMAIL_OTP` credential across all tied Embedded
     * Wallets.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * The current KYB status of a business customer
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun kybStatus(): KybStatus? = kybStatus.getNullable("kybStatus")

    /**
     * Optional UMA address identifier. If provided, the customer's UMA address will be updated.
     * This is an optional identifier to route payments to the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun umaAddress(): String? = umaAddress.getNullable("umaAddress")

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
     * Returns the raw JSON value of [businessInfo].
     *
     * Unlike [businessInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessInfo")
    @ExcludeMissing
    fun _businessInfo(): JsonField<BusinessInfoUpdate> = businessInfo

    /**
     * Returns the raw JSON value of [currencies].
     *
     * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencies")
    @ExcludeMissing
    fun _currencies(): JsonField<List<String>> = currencies

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [kybStatus].
     *
     * Unlike [kybStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kybStatus") @ExcludeMissing fun _kybStatus(): JsonField<KybStatus> = kybStatus

    /**
     * Returns the raw JSON value of [umaAddress].
     *
     * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("umaAddress") @ExcludeMissing fun _umaAddress(): JsonField<String> = umaAddress

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
         * [BusinessCustomerUpdateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .customerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BusinessCustomerUpdateRequest]. */
    class Builder internal constructor() {

        private var customerType: JsonField<CustomerType>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var businessInfo: JsonField<BusinessInfoUpdate> = JsonMissing.of()
        private var currencies: JsonField<MutableList<String>>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var kybStatus: JsonField<KybStatus> = JsonMissing.of()
        private var umaAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(businessCustomerUpdateRequest: BusinessCustomerUpdateRequest) = apply {
            customerType = businessCustomerUpdateRequest.customerType
            address = businessCustomerUpdateRequest.address
            businessInfo = businessCustomerUpdateRequest.businessInfo
            currencies = businessCustomerUpdateRequest.currencies.map { it.toMutableList() }
            email = businessCustomerUpdateRequest.email
            kybStatus = businessCustomerUpdateRequest.kybStatus
            umaAddress = businessCustomerUpdateRequest.umaAddress
            additionalProperties = businessCustomerUpdateRequest.additionalProperties.toMutableMap()
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

        /** Additional information for business entities */
        fun businessInfo(businessInfo: BusinessInfoUpdate) =
            businessInfo(JsonField.of(businessInfo))

        /**
         * Sets [Builder.businessInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessInfo] with a well-typed [BusinessInfoUpdate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessInfo(businessInfo: JsonField<BusinessInfoUpdate>) = apply {
            this.businessInfo = businessInfo
        }

        /**
         * Updated list of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD",
         * "EUR"; tickers for crypto, e.g. "BTC", "USDC"). Replaces the existing list. Some currency
         * combinations may require separate customers — if so, the request will be rejected with
         * details.
         */
        fun currencies(currencies: List<String>) = currencies(JsonField.of(currencies))

        /**
         * Sets [Builder.currencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencies] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencies(currencies: JsonField<List<String>>) = apply {
            this.currencies = currencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [currencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCurrency(currency: String) = apply {
            currencies =
                (currencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("currencies", it).add(currency)
                }
        }

        /**
         * Email address for the customer. For customers with tied Embedded Wallet internal
         * accounts, changing this value also updates every tied `EMAIL_OTP` credential across all
         * tied Embedded Wallets.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

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

        /**
         * Optional UMA address identifier. If provided, the customer's UMA address will be updated.
         * This is an optional identifier to route payments to the customer.
         */
        fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

        /**
         * Sets [Builder.umaAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.umaAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

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
         * Returns an immutable instance of [BusinessCustomerUpdateRequest].
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
        fun build(): BusinessCustomerUpdateRequest =
            BusinessCustomerUpdateRequest(
                checkRequired("customerType", customerType),
                address,
                businessInfo,
                (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                email,
                kybStatus,
                umaAddress,
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
    fun validate(): BusinessCustomerUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        customerType().validate()
        address()?.validate()
        businessInfo()?.validate()
        currencies()
        email()
        kybStatus()?.validate()
        umaAddress()
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
            (businessInfo.asKnown()?.validity() ?: 0) +
            (currencies.asKnown()?.size ?: 0) +
            (if (email.asKnown() == null) 0 else 1) +
            (kybStatus.asKnown()?.validity() ?: 0) +
            (if (umaAddress.asKnown() == null) 0 else 1)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessCustomerUpdateRequest &&
            customerType == other.customerType &&
            address == other.address &&
            businessInfo == other.businessInfo &&
            currencies == other.currencies &&
            email == other.email &&
            kybStatus == other.kybStatus &&
            umaAddress == other.umaAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            customerType,
            address,
            businessInfo,
            currencies,
            email,
            kybStatus,
            umaAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessCustomerUpdateRequest{customerType=$customerType, address=$address, businessInfo=$businessInfo, currencies=$currencies, email=$email, kybStatus=$kybStatus, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
}
