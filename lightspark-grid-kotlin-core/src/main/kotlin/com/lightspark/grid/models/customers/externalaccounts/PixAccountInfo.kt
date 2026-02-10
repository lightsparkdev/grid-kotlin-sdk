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

class PixAccountInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountType: JsonField<AccountType>,
    private val beneficiary: JsonField<BeneficiaryOneOf>,
    private val pixKey: JsonField<String>,
    private val pixKeyType: JsonField<PixKeyType>,
    private val taxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<BeneficiaryOneOf> = JsonMissing.of(),
        @JsonProperty("pixKey") @ExcludeMissing pixKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pixKeyType")
        @ExcludeMissing
        pixKeyType: JsonField<PixKeyType> = JsonMissing.of(),
        @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
    ) : this(accountType, beneficiary, pixKey, pixKeyType, taxId, mutableMapOf())

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AccountType = accountType.getRequired("accountType")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): BeneficiaryOneOf = beneficiary.getRequired("beneficiary")

    /**
     * PIX key for Brazilian instant payments
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pixKey(): String = pixKey.getRequired("pixKey")

    /**
     * Type of PIX key being used
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pixKeyType(): PixKeyType = pixKeyType.getRequired("pixKeyType")

    /**
     * Tax ID of the account holder
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxId(): String = taxId.getRequired("taxId")

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary")
    @ExcludeMissing
    fun _beneficiary(): JsonField<BeneficiaryOneOf> = beneficiary

    /**
     * Returns the raw JSON value of [pixKey].
     *
     * Unlike [pixKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixKey") @ExcludeMissing fun _pixKey(): JsonField<String> = pixKey

    /**
     * Returns the raw JSON value of [pixKeyType].
     *
     * Unlike [pixKeyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixKeyType")
    @ExcludeMissing
    fun _pixKeyType(): JsonField<PixKeyType> = pixKeyType

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
         * Returns a mutable builder for constructing an instance of [PixAccountInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .beneficiary()
         * .pixKey()
         * .pixKeyType()
         * .taxId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PixAccountInfo]. */
    class Builder internal constructor() {

        private var accountType: JsonField<AccountType>? = null
        private var beneficiary: JsonField<BeneficiaryOneOf>? = null
        private var pixKey: JsonField<String>? = null
        private var pixKeyType: JsonField<PixKeyType>? = null
        private var taxId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pixAccountInfo: PixAccountInfo) = apply {
            accountType = pixAccountInfo.accountType
            beneficiary = pixAccountInfo.beneficiary
            pixKey = pixAccountInfo.pixKey
            pixKeyType = pixAccountInfo.pixKeyType
            taxId = pixAccountInfo.taxId
            additionalProperties = pixAccountInfo.additionalProperties.toMutableMap()
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

        /** PIX key for Brazilian instant payments */
        fun pixKey(pixKey: String) = pixKey(JsonField.of(pixKey))

        /**
         * Sets [Builder.pixKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pixKey(pixKey: JsonField<String>) = apply { this.pixKey = pixKey }

        /** Type of PIX key being used */
        fun pixKeyType(pixKeyType: PixKeyType) = pixKeyType(JsonField.of(pixKeyType))

        /**
         * Sets [Builder.pixKeyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixKeyType] with a well-typed [PixKeyType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pixKeyType(pixKeyType: JsonField<PixKeyType>) = apply { this.pixKeyType = pixKeyType }

        /** Tax ID of the account holder */
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
         * Returns an immutable instance of [PixAccountInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .beneficiary()
         * .pixKey()
         * .pixKeyType()
         * .taxId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PixAccountInfo =
            PixAccountInfo(
                checkRequired("accountType", accountType),
                checkRequired("beneficiary", beneficiary),
                checkRequired("pixKey", pixKey),
                checkRequired("pixKeyType", pixKeyType),
                checkRequired("taxId", taxId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PixAccountInfo = apply {
        if (validated) {
            return@apply
        }

        accountType().validate()
        beneficiary().validate()
        pixKey()
        pixKeyType().validate()
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
        (accountType.asKnown()?.validity() ?: 0) +
            (beneficiary.asKnown()?.validity() ?: 0) +
            (if (pixKey.asKnown() == null) 0 else 1) +
            (pixKeyType.asKnown()?.validity() ?: 0) +
            (if (taxId.asKnown() == null) 0 else 1)

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

            val PIX = of("PIX")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            PIX
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
            PIX,
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
                PIX -> Value.PIX
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
                PIX -> Known.PIX
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

    /** Type of PIX key being used */
    class PixKeyType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CPF = of("CPF")

            val CNPJ = of("CNPJ")

            val EMAIL = of("EMAIL")

            val PHONE = of("PHONE")

            val RANDOM = of("RANDOM")

            fun of(value: String) = PixKeyType(JsonField.of(value))
        }

        /** An enum containing [PixKeyType]'s known values. */
        enum class Known {
            CPF,
            CNPJ,
            EMAIL,
            PHONE,
            RANDOM,
        }

        /**
         * An enum containing [PixKeyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PixKeyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CPF,
            CNPJ,
            EMAIL,
            PHONE,
            RANDOM,
            /**
             * An enum member indicating that [PixKeyType] was instantiated with an unknown value.
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
                CPF -> Value.CPF
                CNPJ -> Value.CNPJ
                EMAIL -> Value.EMAIL
                PHONE -> Value.PHONE
                RANDOM -> Value.RANDOM
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
                CPF -> Known.CPF
                CNPJ -> Known.CNPJ
                EMAIL -> Known.EMAIL
                PHONE -> Known.PHONE
                RANDOM -> Known.RANDOM
                else -> throw LightsparkGridInvalidDataException("Unknown PixKeyType: $value")
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

        fun validate(): PixKeyType = apply {
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

            return other is PixKeyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PixAccountInfo &&
            accountType == other.accountType &&
            beneficiary == other.beneficiary &&
            pixKey == other.pixKey &&
            pixKeyType == other.pixKeyType &&
            taxId == other.taxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountType, beneficiary, pixKey, pixKeyType, taxId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PixAccountInfo{accountType=$accountType, beneficiary=$beneficiary, pixKey=$pixKey, pixKeyType=$pixKeyType, taxId=$taxId, additionalProperties=$additionalProperties}"
}
