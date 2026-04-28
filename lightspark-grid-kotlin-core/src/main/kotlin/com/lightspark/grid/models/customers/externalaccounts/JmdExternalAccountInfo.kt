// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.JmdBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.JmdAccountInfo
import java.util.Collections
import java.util.Objects

class JmdExternalAccountInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountNumber: JsonField<String>,
    private val accountType: JsonField<JmdAccountInfo.AccountType>,
    private val bankAccountType: JsonField<JmdAccountInfo.BankAccountType>,
    private val branchCode: JsonField<String>,
    private val paymentRails: JsonField<List<JmdAccountInfo.PaymentRail>>,
    private val beneficiary: JsonField<Beneficiary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<JmdAccountInfo.AccountType> = JsonMissing.of(),
        @JsonProperty("bankAccountType")
        @ExcludeMissing
        bankAccountType: JsonField<JmdAccountInfo.BankAccountType> = JsonMissing.of(),
        @JsonProperty("branchCode")
        @ExcludeMissing
        branchCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paymentRails")
        @ExcludeMissing
        paymentRails: JsonField<List<JmdAccountInfo.PaymentRail>> = JsonMissing.of(),
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
    ) : this(
        accountNumber,
        accountType,
        bankAccountType,
        branchCode,
        paymentRails,
        beneficiary,
        mutableMapOf(),
    )

    fun toJmdAccountInfo(): JmdAccountInfo =
        JmdAccountInfo.builder()
            .accountNumber(accountNumber)
            .accountType(accountType)
            .bankAccountType(bankAccountType)
            .branchCode(branchCode)
            .paymentRails(paymentRails)
            .build()

    /**
     * The account number of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("accountNumber")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): JmdAccountInfo.AccountType = accountType.getRequired("accountType")

    /**
     * The bank account type
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bankAccountType(): JmdAccountInfo.BankAccountType =
        bankAccountType.getRequired("bankAccountType")

    /**
     * The branch code
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun branchCode(): String = branchCode.getRequired("branchCode")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentRails(): List<JmdAccountInfo.PaymentRail> = paymentRails.getRequired("paymentRails")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

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
    fun _accountType(): JsonField<JmdAccountInfo.AccountType> = accountType

    /**
     * Returns the raw JSON value of [bankAccountType].
     *
     * Unlike [bankAccountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankAccountType")
    @ExcludeMissing
    fun _bankAccountType(): JsonField<JmdAccountInfo.BankAccountType> = bankAccountType

    /**
     * Returns the raw JSON value of [branchCode].
     *
     * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branchCode") @ExcludeMissing fun _branchCode(): JsonField<String> = branchCode

    /**
     * Returns the raw JSON value of [paymentRails].
     *
     * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paymentRails")
    @ExcludeMissing
    fun _paymentRails(): JsonField<List<JmdAccountInfo.PaymentRail>> = paymentRails

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary")
    @ExcludeMissing
    fun _beneficiary(): JsonField<Beneficiary> = beneficiary

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
         * Returns a mutable builder for constructing an instance of [JmdExternalAccountInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumber()
         * .accountType()
         * .bankAccountType()
         * .branchCode()
         * .paymentRails()
         * .beneficiary()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [JmdExternalAccountInfo]. */
    class Builder internal constructor() {

        private var accountNumber: JsonField<String>? = null
        private var accountType: JsonField<JmdAccountInfo.AccountType>? = null
        private var bankAccountType: JsonField<JmdAccountInfo.BankAccountType>? = null
        private var branchCode: JsonField<String>? = null
        private var paymentRails: JsonField<MutableList<JmdAccountInfo.PaymentRail>>? = null
        private var beneficiary: JsonField<Beneficiary>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(jmdExternalAccountInfo: JmdExternalAccountInfo) = apply {
            accountNumber = jmdExternalAccountInfo.accountNumber
            accountType = jmdExternalAccountInfo.accountType
            bankAccountType = jmdExternalAccountInfo.bankAccountType
            branchCode = jmdExternalAccountInfo.branchCode
            paymentRails = jmdExternalAccountInfo.paymentRails.map { it.toMutableList() }
            beneficiary = jmdExternalAccountInfo.beneficiary
            additionalProperties = jmdExternalAccountInfo.additionalProperties.toMutableMap()
        }

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

        fun accountType(accountType: JmdAccountInfo.AccountType) =
            accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed
         * [JmdAccountInfo.AccountType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountType(accountType: JsonField<JmdAccountInfo.AccountType>) = apply {
            this.accountType = accountType
        }

        /** The bank account type */
        fun bankAccountType(bankAccountType: JmdAccountInfo.BankAccountType) =
            bankAccountType(JsonField.of(bankAccountType))

        /**
         * Sets [Builder.bankAccountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankAccountType] with a well-typed
         * [JmdAccountInfo.BankAccountType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun bankAccountType(bankAccountType: JsonField<JmdAccountInfo.BankAccountType>) = apply {
            this.bankAccountType = bankAccountType
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

        fun paymentRails(paymentRails: List<JmdAccountInfo.PaymentRail>) =
            paymentRails(JsonField.of(paymentRails))

        /**
         * Sets [Builder.paymentRails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentRails] with a well-typed
         * `List<JmdAccountInfo.PaymentRail>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun paymentRails(paymentRails: JsonField<List<JmdAccountInfo.PaymentRail>>) = apply {
            this.paymentRails = paymentRails.map { it.toMutableList() }
        }

        /**
         * Adds a single [JmdAccountInfo.PaymentRail] to [paymentRails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentRail(paymentRail: JmdAccountInfo.PaymentRail) = apply {
            paymentRails =
                (paymentRails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentRails", it).add(paymentRail)
                }
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
        fun beneficiary(individual: JmdBeneficiary) =
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
         * Returns an immutable instance of [JmdExternalAccountInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumber()
         * .accountType()
         * .bankAccountType()
         * .branchCode()
         * .paymentRails()
         * .beneficiary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JmdExternalAccountInfo =
            JmdExternalAccountInfo(
                checkRequired("accountNumber", accountNumber),
                checkRequired("accountType", accountType),
                checkRequired("bankAccountType", bankAccountType),
                checkRequired("branchCode", branchCode),
                checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                checkRequired("beneficiary", beneficiary),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): JmdExternalAccountInfo = apply {
        if (validated) {
            return@apply
        }

        accountNumber()
        accountType().validate()
        bankAccountType().validate()
        branchCode()
        paymentRails().forEach { it.validate() }
        beneficiary().validate()
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
            (bankAccountType.asKnown()?.validity() ?: 0) +
            (if (branchCode.asKnown() == null) 0 else 1) +
            (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (beneficiary.asKnown()?.validity() ?: 0)

    @JsonDeserialize(using = Beneficiary.Deserializer::class)
    @JsonSerialize(using = Beneficiary.Serializer::class)
    class Beneficiary
    private constructor(
        private val individual: JmdBeneficiary? = null,
        private val business: BusinessBeneficiary? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): JmdBeneficiary? = individual

        fun business(): BusinessBeneficiary? = business

        fun isIndividual(): Boolean = individual != null

        fun isBusiness(): Boolean = business != null

        fun asIndividual(): JmdBeneficiary = individual.getOrThrow("individual")

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
                    override fun visitIndividual(individual: JmdBeneficiary) {
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
                    override fun visitIndividual(individual: JmdBeneficiary) = individual.validity()

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

            fun ofIndividual(individual: JmdBeneficiary) = Beneficiary(individual = individual)

            fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
        }

        /**
         * An interface that defines how to map each variant of [Beneficiary] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: JmdBeneficiary): T

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
                        return tryDeserialize(node, jacksonTypeRef<JmdBeneficiary>())?.let {
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

        return other is JmdExternalAccountInfo &&
            accountNumber == other.accountNumber &&
            accountType == other.accountType &&
            bankAccountType == other.bankAccountType &&
            branchCode == other.branchCode &&
            paymentRails == other.paymentRails &&
            beneficiary == other.beneficiary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountNumber,
            accountType,
            bankAccountType,
            branchCode,
            paymentRails,
            beneficiary,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JmdExternalAccountInfo{accountNumber=$accountNumber, accountType=$accountType, bankAccountType=$bankAccountType, branchCode=$branchCode, paymentRails=$paymentRails, beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
}
