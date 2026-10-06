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
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.AedAccountInfo
import java.util.Collections
import java.util.Objects

class AedExternalAccountInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val beneficiary: JsonField<Beneficiary>,
    private val accountType: JsonField<AedAccountInfo.AccountType>,
    private val iban: JsonField<String>,
    private val paymentRails: JsonField<List<AedAccountInfo.PaymentRail>>,
    private val swiftCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AedAccountInfo.AccountType> = JsonMissing.of(),
        @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paymentRails")
        @ExcludeMissing
        paymentRails: JsonField<List<AedAccountInfo.PaymentRail>> = JsonMissing.of(),
        @JsonProperty("swiftCode") @ExcludeMissing swiftCode: JsonField<String> = JsonMissing.of(),
    ) : this(beneficiary, accountType, iban, paymentRails, swiftCode, mutableMapOf())

    fun toAedAccountInfo(): AedAccountInfo =
        AedAccountInfo.builder()
            .accountType(accountType)
            .iban(iban)
            .paymentRails(paymentRails)
            .swiftCode(swiftCode)
            .build()

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AedAccountInfo.AccountType = accountType.getRequired("accountType")

    /**
     * UAE IBAN (23 characters, starting with AE)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun iban(): String = iban.getRequired("iban")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentRails(): List<AedAccountInfo.PaymentRail> = paymentRails.getRequired("paymentRails")

    /**
     * The SWIFT/BIC code of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swiftCode(): String? = swiftCode.getNullable("swiftCode")

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary")
    @ExcludeMissing
    fun _beneficiary(): JsonField<Beneficiary> = beneficiary

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<AedAccountInfo.AccountType> = accountType

    /**
     * Returns the raw JSON value of [iban].
     *
     * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

    /**
     * Returns the raw JSON value of [paymentRails].
     *
     * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paymentRails")
    @ExcludeMissing
    fun _paymentRails(): JsonField<List<AedAccountInfo.PaymentRail>> = paymentRails

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
         * Returns a mutable builder for constructing an instance of [AedExternalAccountInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .beneficiary()
         * .accountType()
         * .iban()
         * .paymentRails()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AedExternalAccountInfo]. */
    class Builder internal constructor() {

        private var beneficiary: JsonField<Beneficiary>? = null
        private var accountType: JsonField<AedAccountInfo.AccountType>? = null
        private var iban: JsonField<String>? = null
        private var paymentRails: JsonField<MutableList<AedAccountInfo.PaymentRail>>? = null
        private var swiftCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(aedExternalAccountInfo: AedExternalAccountInfo) = apply {
            beneficiary = aedExternalAccountInfo.beneficiary
            accountType = aedExternalAccountInfo.accountType
            iban = aedExternalAccountInfo.iban
            paymentRails = aedExternalAccountInfo.paymentRails.map { it.toMutableList() }
            swiftCode = aedExternalAccountInfo.swiftCode
            additionalProperties = aedExternalAccountInfo.additionalProperties.toMutableMap()
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
        fun beneficiary(individual: AedBeneficiary) =
            beneficiary(Beneficiary.ofIndividual(individual))

        /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
        fun beneficiary(business: Beneficiary.Business) =
            beneficiary(Beneficiary.ofBusiness(business))

        fun accountType(accountType: AedAccountInfo.AccountType) =
            accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed
         * [AedAccountInfo.AccountType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountType(accountType: JsonField<AedAccountInfo.AccountType>) = apply {
            this.accountType = accountType
        }

        /** UAE IBAN (23 characters, starting with AE) */
        fun iban(iban: String) = iban(JsonField.of(iban))

        /**
         * Sets [Builder.iban] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iban] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iban(iban: JsonField<String>) = apply { this.iban = iban }

        fun paymentRails(paymentRails: List<AedAccountInfo.PaymentRail>) =
            paymentRails(JsonField.of(paymentRails))

        /**
         * Sets [Builder.paymentRails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentRails] with a well-typed
         * `List<AedAccountInfo.PaymentRail>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun paymentRails(paymentRails: JsonField<List<AedAccountInfo.PaymentRail>>) = apply {
            this.paymentRails = paymentRails.map { it.toMutableList() }
        }

        /**
         * Adds a single [AedAccountInfo.PaymentRail] to [paymentRails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentRail(paymentRail: AedAccountInfo.PaymentRail) = apply {
            paymentRails =
                (paymentRails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentRails", it).add(paymentRail)
                }
        }

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
         * Returns an immutable instance of [AedExternalAccountInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .beneficiary()
         * .accountType()
         * .iban()
         * .paymentRails()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AedExternalAccountInfo =
            AedExternalAccountInfo(
                checkRequired("beneficiary", beneficiary),
                checkRequired("accountType", accountType),
                checkRequired("iban", iban),
                checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                swiftCode,
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
    fun validate(): AedExternalAccountInfo = apply {
        if (validated) {
            return@apply
        }

        beneficiary().validate()
        accountType().validate()
        iban()
        paymentRails().forEach { it.validate() }
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
        (beneficiary.asKnown()?.validity() ?: 0) +
            (accountType.asKnown()?.validity() ?: 0) +
            (if (iban.asKnown() == null) 0 else 1) +
            (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (swiftCode.asKnown() == null) 0 else 1)

    @JsonDeserialize(using = Beneficiary.Deserializer::class)
    @JsonSerialize(using = Beneficiary.Serializer::class)
    class Beneficiary
    private constructor(
        private val individual: AedBeneficiary? = null,
        private val business: Business? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): AedBeneficiary? = individual

        fun business(): Business? = business

        fun isIndividual(): Boolean = individual != null

        fun isBusiness(): Boolean = business != null

        fun asIndividual(): AedBeneficiary = individual.getOrThrow("individual")

        fun asBusiness(): Business = business.getOrThrow("business")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.lightspark.grid.core.JsonValue
         *
         * val result: String? = beneficiary.accept(object : Beneficiary.Visitor<String?> {
         *     override fun visitIndividual(individual: AedBeneficiary): String? = individual.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                individual != null -> visitor.visitIndividual(individual)
                business != null -> visitor.visitBusiness(business)
                else -> visitor.unknown(_json)
            }

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
        fun validate(): Beneficiary = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIndividual(individual: AedBeneficiary) {
                        individual.validate()
                    }

                    override fun visitBusiness(business: Business) {
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
                    override fun visitIndividual(individual: AedBeneficiary) = individual.validity()

                    override fun visitBusiness(business: Business) = business.validity()

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

            fun ofIndividual(individual: AedBeneficiary) = Beneficiary(individual = individual)

            fun ofBusiness(business: Business) = Beneficiary(business = business)
        }

        /**
         * An interface that defines how to map each variant of [Beneficiary] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: AedBeneficiary): T

            fun visitBusiness(business: Business): T

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
                        return tryDeserialize(node, jacksonTypeRef<AedBeneficiary>())?.let {
                            Beneficiary(individual = it, _json = json)
                        } ?: Beneficiary(_json = json)
                    }
                    "BUSINESS" -> {
                        return tryDeserialize(node, jacksonTypeRef<Business>())?.let {
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

        class Business
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val address: JsonField<Address>,
            private val beneficiaryType: JsonValue,
            private val legalName: JsonField<String>,
            private val countryOfResidence: JsonField<String>,
            private val email: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val registrationNumber: JsonField<String>,
            private val taxId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                beneficiaryType: JsonValue = JsonMissing.of(),
                @JsonProperty("legalName")
                @ExcludeMissing
                legalName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                countryOfResidence: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                registrationNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            ) : this(
                address,
                beneficiaryType,
                legalName,
                countryOfResidence,
                email,
                phoneNumber,
                registrationNumber,
                taxId,
                mutableMapOf(),
            )

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): Address = address.getRequired("address")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("BUSINESS")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("beneficiaryType")
            @ExcludeMissing
            fun _beneficiaryType(): JsonValue = beneficiaryType

            /**
             * The legal name of the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun legalName(): String = legalName.getRequired("legalName")

            /**
             * The country of residence of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun countryOfResidence(): String? = countryOfResidence.getNullable("countryOfResidence")

            /**
             * The email of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

            /**
             * The phone number of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

            /**
             * The company registration number of the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun registrationNumber(): String? = registrationNumber.getNullable("registrationNumber")

            /**
             * The tax identification number of the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun taxId(): String? = taxId.getNullable("taxId")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

            /**
             * Returns the raw JSON value of [legalName].
             *
             * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("legalName")
            @ExcludeMissing
            fun _legalName(): JsonField<String> = legalName

            /**
             * Returns the raw JSON value of [countryOfResidence].
             *
             * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("countryOfResidence")
            @ExcludeMissing
            fun _countryOfResidence(): JsonField<String> = countryOfResidence

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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

                /**
                 * Returns a mutable builder for constructing an instance of [Business].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * .legalName()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Business]. */
            class Builder internal constructor() {

                private var address: JsonField<Address>? = null
                private var beneficiaryType: JsonValue = JsonValue.from("BUSINESS")
                private var legalName: JsonField<String>? = null
                private var countryOfResidence: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var registrationNumber: JsonField<String> = JsonMissing.of()
                private var taxId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(business: Business) = apply {
                    address = business.address
                    beneficiaryType = business.beneficiaryType
                    legalName = business.legalName
                    countryOfResidence = business.countryOfResidence
                    email = business.email
                    phoneNumber = business.phoneNumber
                    registrationNumber = business.registrationNumber
                    taxId = business.taxId
                    additionalProperties = business.additionalProperties.toMutableMap()
                }

                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("BUSINESS")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                    this.beneficiaryType = beneficiaryType
                }

                /** The legal name of the business */
                fun legalName(legalName: String) = legalName(JsonField.of(legalName))

                /**
                 * Sets [Builder.legalName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.legalName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

                /** The country of residence of the beneficiary */
                fun countryOfResidence(countryOfResidence: String) =
                    countryOfResidence(JsonField.of(countryOfResidence))

                /**
                 * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryOfResidence] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                    this.countryOfResidence = countryOfResidence
                }

                /** The email of the beneficiary */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /** The phone number of the beneficiary */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The company registration number of the business */
                fun registrationNumber(registrationNumber: String) =
                    registrationNumber(JsonField.of(registrationNumber))

                /**
                 * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.registrationNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                    this.registrationNumber = registrationNumber
                }

                /** The tax identification number of the business */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Business].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * .legalName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Business =
                    Business(
                        checkRequired("address", address),
                        beneficiaryType,
                        checkRequired("legalName", legalName),
                        countryOfResidence,
                        email,
                        phoneNumber,
                        registrationNumber,
                        taxId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Business = apply {
                if (validated) {
                    return@apply
                }

                address().validate()
                _beneficiaryType().let {
                    if (it != JsonValue.from("BUSINESS")) {
                        throw LightsparkGridInvalidDataException(
                            "'beneficiaryType' is invalid, received $it"
                        )
                    }
                }
                legalName()
                countryOfResidence()
                email()
                phoneNumber()
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
                (address.asKnown()?.validity() ?: 0) +
                    beneficiaryType.let { if (it == JsonValue.from("BUSINESS")) 1 else 0 } +
                    (if (legalName.asKnown() == null) 0 else 1) +
                    (if (countryOfResidence.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (registrationNumber.asKnown() == null) 0 else 1) +
                    (if (taxId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Business &&
                    address == other.address &&
                    beneficiaryType == other.beneficiaryType &&
                    legalName == other.legalName &&
                    countryOfResidence == other.countryOfResidence &&
                    email == other.email &&
                    phoneNumber == other.phoneNumber &&
                    registrationNumber == other.registrationNumber &&
                    taxId == other.taxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    address,
                    beneficiaryType,
                    legalName,
                    countryOfResidence,
                    email,
                    phoneNumber,
                    registrationNumber,
                    taxId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Business{address=$address, beneficiaryType=$beneficiaryType, legalName=$legalName, countryOfResidence=$countryOfResidence, email=$email, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, taxId=$taxId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AedExternalAccountInfo &&
            beneficiary == other.beneficiary &&
            accountType == other.accountType &&
            iban == other.iban &&
            paymentRails == other.paymentRails &&
            swiftCode == other.swiftCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(beneficiary, accountType, iban, paymentRails, swiftCode, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AedExternalAccountInfo{beneficiary=$beneficiary, accountType=$accountType, iban=$iban, paymentRails=$paymentRails, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
}
