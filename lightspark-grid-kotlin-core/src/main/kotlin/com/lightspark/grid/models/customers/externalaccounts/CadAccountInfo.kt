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

class CadAccountInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountNumber: JsonField<String>,
    private val accountType: JsonField<AccountType>,
    private val bankCode: JsonField<String>,
    private val beneficiary: JsonField<BeneficiaryOneOf>,
    private val branchCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("bankCode") @ExcludeMissing bankCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<BeneficiaryOneOf> = JsonMissing.of(),
        @JsonProperty("branchCode") @ExcludeMissing branchCode: JsonField<String> = JsonMissing.of(),
    ) : this(accountNumber, accountType, bankCode, beneficiary, branchCode, mutableMapOf())

    /**
     * Bank account number (7-12 digits)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("accountNumber")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AccountType = accountType.getRequired("accountType")

    /**
     * Canadian financial institution number (3 digits)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bankCode(): String = bankCode.getRequired("bankCode")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): BeneficiaryOneOf = beneficiary.getRequired("beneficiary")

    /**
     * Transit number identifying the branch (5 digits)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun branchCode(): String = branchCode.getRequired("branchCode")

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountNumber")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [bankCode].
     *
     * Unlike [bankCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankCode") @ExcludeMissing fun _bankCode(): JsonField<String> = bankCode

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary")
    @ExcludeMissing
    fun _beneficiary(): JsonField<BeneficiaryOneOf> = beneficiary

    /**
     * Returns the raw JSON value of [branchCode].
     *
     * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branchCode") @ExcludeMissing fun _branchCode(): JsonField<String> = branchCode

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
         * Returns a mutable builder for constructing an instance of [CadAccountInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumber()
         * .accountType()
         * .bankCode()
         * .beneficiary()
         * .branchCode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CadAccountInfo]. */
    class Builder internal constructor() {

        private var accountNumber: JsonField<String>? = null
        private var accountType: JsonField<AccountType>? = null
        private var bankCode: JsonField<String>? = null
        private var beneficiary: JsonField<BeneficiaryOneOf>? = null
        private var branchCode: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cadAccountInfo: CadAccountInfo) = apply {
            accountNumber = cadAccountInfo.accountNumber
            accountType = cadAccountInfo.accountType
            bankCode = cadAccountInfo.bankCode
            beneficiary = cadAccountInfo.beneficiary
            branchCode = cadAccountInfo.branchCode
            additionalProperties = cadAccountInfo.additionalProperties.toMutableMap()
        }

        /** Bank account number (7-12 digits) */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [AccountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        /** Canadian financial institution number (3 digits) */
        fun bankCode(bankCode: String) = bankCode(JsonField.of(bankCode))

        /**
         * Sets [Builder.bankCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankCode(bankCode: JsonField<String>) = apply { this.bankCode = bankCode }

        fun beneficiary(beneficiary: BeneficiaryOneOf) = beneficiary(JsonField.of(beneficiary))

        /**
         * Sets [Builder.beneficiary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiary] with a well-typed [BeneficiaryOneOf] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiary(beneficiary: JsonField<BeneficiaryOneOf>) = apply {
            this.beneficiary = beneficiary
        }

        /** Alias for calling [beneficiary] with `BeneficiaryOneOf.ofIndividual(individual)`. */
        fun beneficiary(individual: BeneficiaryOneOf.Individual) =
            beneficiary(BeneficiaryOneOf.ofIndividual(individual))

        /** Alias for calling [beneficiary] with `BeneficiaryOneOf.ofBusiness(business)`. */
        fun beneficiary(business: BeneficiaryOneOf.Business) =
            beneficiary(BeneficiaryOneOf.ofBusiness(business))

        /**
         * Alias for calling [beneficiary] with the following:
         * ```kotlin
         * BeneficiaryOneOf.Business.builder()
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessBeneficiary(legalName: String) =
            beneficiary(BeneficiaryOneOf.Business.builder().legalName(legalName).build())

        /** Transit number identifying the branch (5 digits) */
        fun branchCode(branchCode: String) = branchCode(JsonField.of(branchCode))

        /**
         * Sets [Builder.branchCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branchCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun branchCode(branchCode: JsonField<String>) = apply { this.branchCode = branchCode }

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
         * Returns an immutable instance of [CadAccountInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumber()
         * .accountType()
         * .bankCode()
         * .beneficiary()
         * .branchCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CadAccountInfo =
            CadAccountInfo(
                checkRequired("accountNumber", accountNumber),
                checkRequired("accountType", accountType),
                checkRequired("bankCode", bankCode),
                checkRequired("beneficiary", beneficiary),
                checkRequired("branchCode", branchCode),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CadAccountInfo = apply {
        if (validated) {
            return@apply
        }

        accountNumber()
        accountType().validate()
        bankCode()
        beneficiary().validate()
        branchCode()
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
        (if (accountNumber.asKnown() == null) 0 else 1) +
            (accountType.asKnown()?.validity() ?: 0) +
            (if (bankCode.asKnown() == null) 0 else 1) +
            (beneficiary.asKnown()?.validity() ?: 0) +
            (if (branchCode.asKnown() == null) 0 else 1)

    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CAD_ACCOUNT = of("CAD_ACCOUNT")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            CAD_ACCOUNT
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CAD_ACCOUNT,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                CAD_ACCOUNT -> Value.CAD_ACCOUNT
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
                CAD_ACCOUNT -> Known.CAD_ACCOUNT
                else -> throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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

        fun validate(): AccountType = apply {
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

            return other is AccountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CadAccountInfo &&
            accountNumber == other.accountNumber &&
            accountType == other.accountType &&
            bankCode == other.bankCode &&
            beneficiary == other.beneficiary &&
            branchCode == other.branchCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountNumber,
            accountType,
            bankCode,
            beneficiary,
            branchCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CadAccountInfo{accountNumber=$accountNumber, accountType=$accountType, bankCode=$bankCode, beneficiary=$beneficiary, branchCode=$branchCode, additionalProperties=$additionalProperties}"
}
