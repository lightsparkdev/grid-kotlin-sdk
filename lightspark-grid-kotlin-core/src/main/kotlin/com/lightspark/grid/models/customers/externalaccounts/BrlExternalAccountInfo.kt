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
import com.lightspark.grid.models.platform.externalaccounts.BaseExternalAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.BrlAccountInfo
import java.util.Collections
import java.util.Objects

class BrlExternalAccountInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountType: JsonField<BrlAccountInfo.AccountType>,
    private val paymentRails: JsonField<List<BrlAccountInfo.PaymentRail>>,
    private val pixKey: JsonField<String>,
    private val pixKeyType: JsonField<String>,
    private val taxId: JsonField<String>,
    private val beneficiary: JsonField<Beneficiary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<BrlAccountInfo.AccountType> = JsonMissing.of(),
        @JsonProperty("paymentRails")
        @ExcludeMissing
        paymentRails: JsonField<List<BrlAccountInfo.PaymentRail>> = JsonMissing.of(),
        @JsonProperty("pixKey") @ExcludeMissing pixKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pixKeyType")
        @ExcludeMissing
        pixKeyType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
    ) : this(accountType, paymentRails, pixKey, pixKeyType, taxId, beneficiary, mutableMapOf())

    fun toBaseExternalAccountInfo(): BaseExternalAccountInfo =
        BaseExternalAccountInfo.builder().build()

    fun toBrlAccountInfo(): BrlAccountInfo =
        BrlAccountInfo.builder()
            .accountType(accountType)
            .paymentRails(paymentRails)
            .pixKey(pixKey)
            .pixKeyType(pixKeyType)
            .taxId(taxId)
            .build()

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): BrlAccountInfo.AccountType = accountType.getRequired("accountType")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentRails(): List<BrlAccountInfo.PaymentRail> = paymentRails.getRequired("paymentRails")

    /**
     * The PIX key of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pixKey(): String = pixKey.getRequired("pixKey")

    /**
     * The type of PIX key of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pixKeyType(): String = pixKeyType.getRequired("pixKeyType")

    /**
     * The tax ID of the bank account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxId(): String = taxId.getRequired("taxId")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<BrlAccountInfo.AccountType> = accountType

    /**
     * Returns the raw JSON value of [paymentRails].
     *
     * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paymentRails")
    @ExcludeMissing
    fun _paymentRails(): JsonField<List<BrlAccountInfo.PaymentRail>> = paymentRails

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
    @JsonProperty("pixKeyType") @ExcludeMissing fun _pixKeyType(): JsonField<String> = pixKeyType

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
         * Returns a mutable builder for constructing an instance of [BrlExternalAccountInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .paymentRails()
         * .pixKey()
         * .pixKeyType()
         * .taxId()
         * .beneficiary()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BrlExternalAccountInfo]. */
    class Builder internal constructor() {

        private var accountType: JsonField<BrlAccountInfo.AccountType>? = null
        private var paymentRails: JsonField<MutableList<BrlAccountInfo.PaymentRail>>? = null
        private var pixKey: JsonField<String>? = null
        private var pixKeyType: JsonField<String>? = null
        private var taxId: JsonField<String>? = null
        private var beneficiary: JsonField<Beneficiary>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(brlExternalAccountInfo: BrlExternalAccountInfo) = apply {
            accountType = brlExternalAccountInfo.accountType
            paymentRails = brlExternalAccountInfo.paymentRails.map { it.toMutableList() }
            pixKey = brlExternalAccountInfo.pixKey
            pixKeyType = brlExternalAccountInfo.pixKeyType
            taxId = brlExternalAccountInfo.taxId
            beneficiary = brlExternalAccountInfo.beneficiary
            additionalProperties = brlExternalAccountInfo.additionalProperties.toMutableMap()
        }

        fun accountType(accountType: BrlAccountInfo.AccountType) =
            accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed
         * [BrlAccountInfo.AccountType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountType(accountType: JsonField<BrlAccountInfo.AccountType>) = apply {
            this.accountType = accountType
        }

        fun paymentRails(paymentRails: List<BrlAccountInfo.PaymentRail>) =
            paymentRails(JsonField.of(paymentRails))

        /**
         * Sets [Builder.paymentRails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentRails] with a well-typed
         * `List<BrlAccountInfo.PaymentRail>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun paymentRails(paymentRails: JsonField<List<BrlAccountInfo.PaymentRail>>) = apply {
            this.paymentRails = paymentRails.map { it.toMutableList() }
        }

        /**
         * Adds a single [BrlAccountInfo.PaymentRail] to [paymentRails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentRail(paymentRail: BrlAccountInfo.PaymentRail) = apply {
            paymentRails =
                (paymentRails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentRails", it).add(paymentRail)
                }
        }

        /** The PIX key of the bank */
        fun pixKey(pixKey: String) = pixKey(JsonField.of(pixKey))

        /**
         * Sets [Builder.pixKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pixKey(pixKey: JsonField<String>) = apply { this.pixKey = pixKey }

        /** The type of PIX key of the bank */
        fun pixKeyType(pixKeyType: String) = pixKeyType(JsonField.of(pixKeyType))

        /**
         * Sets [Builder.pixKeyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixKeyType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pixKeyType(pixKeyType: JsonField<String>) = apply { this.pixKeyType = pixKeyType }

        /** The tax ID of the bank account */
        fun taxId(taxId: String) = taxId(JsonField.of(taxId))

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
        fun beneficiary(individual: BrlBeneficiary) =
            beneficiary(Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [beneficiary] with the following:
         * ```kotlin
         * BrlBeneficiary.builder()
         *     .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualBeneficiary(fullName: String) =
            beneficiary(
                BrlBeneficiary.builder()
                    .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .fullName(fullName)
                    .build()
            )

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
         * Returns an immutable instance of [BrlExternalAccountInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .paymentRails()
         * .pixKey()
         * .pixKeyType()
         * .taxId()
         * .beneficiary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrlExternalAccountInfo =
            BrlExternalAccountInfo(
                checkRequired("accountType", accountType),
                checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                checkRequired("pixKey", pixKey),
                checkRequired("pixKeyType", pixKeyType),
                checkRequired("taxId", taxId),
                checkRequired("beneficiary", beneficiary),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrlExternalAccountInfo = apply {
        if (validated) {
            return@apply
        }

        accountType().validate()
        paymentRails().forEach { it.validate() }
        pixKey()
        pixKeyType()
        taxId()
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
        (accountType.asKnown()?.validity() ?: 0) +
            (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (pixKey.asKnown() == null) 0 else 1) +
            (if (pixKeyType.asKnown() == null) 0 else 1) +
            (if (taxId.asKnown() == null) 0 else 1) +
            (beneficiary.asKnown()?.validity() ?: 0)

    @JsonDeserialize(using = Beneficiary.Deserializer::class)
    @JsonSerialize(using = Beneficiary.Serializer::class)
    class Beneficiary
    private constructor(
        private val individual: BrlBeneficiary? = null,
        private val business: BusinessBeneficiary? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): BrlBeneficiary? = individual

        fun business(): BusinessBeneficiary? = business

        fun isIndividual(): Boolean = individual != null

        fun isBusiness(): Boolean = business != null

        fun asIndividual(): BrlBeneficiary = individual.getOrThrow("individual")

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
                    override fun visitIndividual(individual: BrlBeneficiary) {
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
                    override fun visitIndividual(individual: BrlBeneficiary) = individual.validity()

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

            fun ofIndividual(individual: BrlBeneficiary) = Beneficiary(individual = individual)

            fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
        }

        /**
         * An interface that defines how to map each variant of [Beneficiary] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: BrlBeneficiary): T

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
                        return tryDeserialize(node, jacksonTypeRef<BrlBeneficiary>())?.let {
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

        return other is BrlExternalAccountInfo &&
            accountType == other.accountType &&
            paymentRails == other.paymentRails &&
            pixKey == other.pixKey &&
            pixKeyType == other.pixKeyType &&
            taxId == other.taxId &&
            beneficiary == other.beneficiary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountType,
            paymentRails,
            pixKey,
            pixKeyType,
            taxId,
            beneficiary,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrlExternalAccountInfo{accountType=$accountType, paymentRails=$paymentRails, pixKey=$pixKey, pixKeyType=$pixKeyType, taxId=$taxId, beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
}
