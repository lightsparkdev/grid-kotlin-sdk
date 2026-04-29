// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.BusinessBeneficiary
import java.util.Collections
import java.util.Objects

class BdtExternalAccountCreateInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountType: JsonField<AccountType>,
    private val beneficiary: JsonField<Beneficiary>,
    private val accountNumber: JsonField<String>,
    private val branchCode: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val swiftCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("branchCode")
        @ExcludeMissing
        branchCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swiftCode") @ExcludeMissing swiftCode: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountType,
        beneficiary,
        accountNumber,
        branchCode,
        phoneNumber,
        swiftCode,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AccountType = accountType.getRequired("accountType")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

    /**
     * The account number of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountNumber(): String? = accountNumber.getNullable("accountNumber")

    /**
     * The branch code
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun branchCode(): String? = branchCode.getNullable("branchCode")

    /**
     * The phone number in international format
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

    /**
     * The SWIFT/BIC code of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swiftCode(): String? = swiftCode.getNullable("swiftCode")

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
    fun _beneficiary(): JsonField<Beneficiary> = beneficiary

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountNumber")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [branchCode].
     *
     * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branchCode") @ExcludeMissing fun _branchCode(): JsonField<String> = branchCode

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [swiftCode].
     *
     * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swiftCode") @ExcludeMissing fun _swiftCode(): JsonField<String> = swiftCode

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
         * Returns a mutable builder for constructing an instance of [BdtExternalAccountCreateInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .beneficiary()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BdtExternalAccountCreateInfo]. */
    class Builder internal constructor() {

        private var accountType: JsonField<AccountType>? = null
        private var beneficiary: JsonField<Beneficiary>? = null
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var branchCode: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var swiftCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bdtExternalAccountCreateInfo: BdtExternalAccountCreateInfo) = apply {
            accountType = bdtExternalAccountCreateInfo.accountType
            beneficiary = bdtExternalAccountCreateInfo.beneficiary
            accountNumber = bdtExternalAccountCreateInfo.accountNumber
            branchCode = bdtExternalAccountCreateInfo.branchCode
            phoneNumber = bdtExternalAccountCreateInfo.phoneNumber
            swiftCode = bdtExternalAccountCreateInfo.swiftCode
            additionalProperties = bdtExternalAccountCreateInfo.additionalProperties.toMutableMap()
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

        fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

        /**
         * Sets [Builder.beneficiary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
            this.beneficiary = beneficiary
        }

        /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
        fun beneficiary(individual: BdtBeneficiary) =
            beneficiary(Beneficiary.ofIndividual(individual))

        /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
        fun beneficiary(business: BusinessBeneficiary) =
            beneficiary(Beneficiary.ofBusiness(business))

        /**
         * Alias for calling [beneficiary] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessBeneficiary(legalName: String) =
            beneficiary(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

        /** The account number of the bank */
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

        /** The branch code */
        fun branchCode(branchCode: String) = branchCode(JsonField.of(branchCode))

        /**
         * Sets [Builder.branchCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branchCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun branchCode(branchCode: JsonField<String>) = apply { this.branchCode = branchCode }

        /** The phone number in international format */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** The SWIFT/BIC code of the bank */
        fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

        /**
         * Sets [Builder.swiftCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swiftCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swiftCode(swiftCode: JsonField<String>) = apply { this.swiftCode = swiftCode }

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
         * Returns an immutable instance of [BdtExternalAccountCreateInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .beneficiary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BdtExternalAccountCreateInfo =
            BdtExternalAccountCreateInfo(
                checkRequired("accountType", accountType),
                checkRequired("beneficiary", beneficiary),
                accountNumber,
                branchCode,
                phoneNumber,
                swiftCode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BdtExternalAccountCreateInfo = apply {
        if (validated) {
            return@apply
        }

        accountType().validate()
        beneficiary().validate()
        accountNumber()
        branchCode()
        phoneNumber()
        swiftCode()
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
            (if (accountNumber.asKnown() == null) 0 else 1) +
            (if (branchCode.asKnown() == null) 0 else 1) +
            (if (phoneNumber.asKnown() == null) 0 else 1) +
            (if (swiftCode.asKnown() == null) 0 else 1)

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

            val BDT_ACCOUNT = of("BDT_ACCOUNT")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            BDT_ACCOUNT
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
            BDT_ACCOUNT,
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
                BDT_ACCOUNT -> Value.BDT_ACCOUNT
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
                BDT_ACCOUNT -> Known.BDT_ACCOUNT
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

    @JsonDeserialize(using = Beneficiary.Deserializer::class)
    @JsonSerialize(using = Beneficiary.Serializer::class)
    class Beneficiary
    private constructor(
        private val individual: BdtBeneficiary? = null,
        private val business: BusinessBeneficiary? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): BdtBeneficiary? = individual

        fun business(): BusinessBeneficiary? = business

        fun isIndividual(): Boolean = individual != null

        fun isBusiness(): Boolean = business != null

        fun asIndividual(): BdtBeneficiary = individual.getOrThrow("individual")

        fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                individual != null -> visitor.visitIndividual(individual)
                business != null -> visitor.visitBusiness(business)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Beneficiary = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIndividual(individual: BdtBeneficiary) {
                        individual.validate()
                    }

                    override fun visitBusiness(business: BusinessBeneficiary) {
                        business.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitIndividual(individual: BdtBeneficiary) = individual.validity()

                    override fun visitBusiness(business: BusinessBeneficiary) = business.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Beneficiary &&
                individual == other.individual &&
                business == other.business
        }

        override fun hashCode(): Int = Objects.hash(individual, business)

        override fun toString(): String =
            when {
                individual != null -> "Beneficiary{individual=$individual}"
                business != null -> "Beneficiary{business=$business}"
                _json != null -> "Beneficiary{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Beneficiary")
            }

        companion object {

            fun ofIndividual(individual: BdtBeneficiary) = Beneficiary(individual = individual)

            fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
        }

        /**
         * An interface that defines how to map each variant of [Beneficiary] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: BdtBeneficiary): T

            fun visitBusiness(business: BusinessBeneficiary): T

            /**
             * Maps an unknown variant of [Beneficiary] to a value of type [T].
             *
             * An instance of [Beneficiary] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                val json = JsonValue.fromJsonNode(node)
                val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                when (beneficiaryType) {
                    "INDIVIDUAL" -> {
                        return tryDeserialize(node, jacksonTypeRef<BdtBeneficiary>())?.let {
                            Beneficiary(individual = it, _json = json)
                        } ?: Beneficiary(_json = json)
                    }
                    "BUSINESS" -> {
                        return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())?.let {
                            Beneficiary(business = it, _json = json)
                        } ?: Beneficiary(_json = json)
                    }
                }

                return Beneficiary(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

            override fun serialize(
                value: Beneficiary,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.individual != null -> generator.writeObject(value.individual)
                    value.business != null -> generator.writeObject(value.business)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BdtExternalAccountCreateInfo &&
            accountType == other.accountType &&
            beneficiary == other.beneficiary &&
            accountNumber == other.accountNumber &&
            branchCode == other.branchCode &&
            phoneNumber == other.phoneNumber &&
            swiftCode == other.swiftCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountType,
            beneficiary,
            accountNumber,
            branchCode,
            phoneNumber,
            swiftCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BdtExternalAccountCreateInfo{accountType=$accountType, beneficiary=$beneficiary, accountNumber=$accountNumber, branchCode=$branchCode, phoneNumber=$phoneNumber, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
}
