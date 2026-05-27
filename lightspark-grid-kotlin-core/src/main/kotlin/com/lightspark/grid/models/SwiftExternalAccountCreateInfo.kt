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
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BusinessBeneficiary
import java.util.Collections
import java.util.Objects

class SwiftExternalAccountCreateInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountType: JsonField<AccountType>,
    private val bankName: JsonField<String>,
    private val beneficiary: JsonField<Beneficiary>,
    private val country: JsonField<String>,
    private val swiftCode: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val iban: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("bankName") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swiftCode") @ExcludeMissing swiftCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountType,
        bankName,
        beneficiary,
        country,
        swiftCode,
        accountNumber,
        iban,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AccountType = accountType.getRequired("accountType")

    /**
     * The name of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bankName(): String = bankName.getRequired("bankName")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

    /**
     * The ISO 3166-1 alpha-2 country code of the bank account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * The SWIFT/BIC code of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun swiftCode(): String = swiftCode.getRequired("swiftCode")

    /**
     * The bank account number. Required for most corridors. Use iban instead for IBAN-only
     * corridors (e.g. BR, GB).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountNumber(): String? = accountNumber.getNullable("accountNumber")

    /**
     * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
     * accountNumber for all other corridors.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun iban(): String? = iban.getNullable("iban")

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [bankName].
     *
     * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary")
    @ExcludeMissing
    fun _beneficiary(): JsonField<Beneficiary> = beneficiary

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [swiftCode].
     *
     * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swiftCode") @ExcludeMissing fun _swiftCode(): JsonField<String> = swiftCode

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountNumber")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [iban].
     *
     * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

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
         * [SwiftExternalAccountCreateInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .bankName()
         * .beneficiary()
         * .country()
         * .swiftCode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SwiftExternalAccountCreateInfo]. */
    class Builder internal constructor() {

        private var accountType: JsonField<AccountType>? = null
        private var bankName: JsonField<String>? = null
        private var beneficiary: JsonField<Beneficiary>? = null
        private var country: JsonField<String>? = null
        private var swiftCode: JsonField<String>? = null
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var iban: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(swiftExternalAccountCreateInfo: SwiftExternalAccountCreateInfo) = apply {
            accountType = swiftExternalAccountCreateInfo.accountType
            bankName = swiftExternalAccountCreateInfo.bankName
            beneficiary = swiftExternalAccountCreateInfo.beneficiary
            country = swiftExternalAccountCreateInfo.country
            swiftCode = swiftExternalAccountCreateInfo.swiftCode
            accountNumber = swiftExternalAccountCreateInfo.accountNumber
            iban = swiftExternalAccountCreateInfo.iban
            additionalProperties =
                swiftExternalAccountCreateInfo.additionalProperties.toMutableMap()
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

        /** The name of the bank */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /**
         * Sets [Builder.bankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

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
        fun beneficiary(individual: Beneficiary.Individual) =
            beneficiary(Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [beneficiary] with the following:
         * ```kotlin
         * Beneficiary.Individual.builder()
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualBeneficiary(fullName: String) =
            beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

        /** The ISO 3166-1 alpha-2 country code of the bank account */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

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

        /**
         * The bank account number. Required for most corridors. Use iban instead for IBAN-only
         * corridors (e.g. BR, GB).
         */
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

        /**
         * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
         * accountNumber for all other corridors.
         */
        fun iban(iban: String) = iban(JsonField.of(iban))

        /**
         * Sets [Builder.iban] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iban] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iban(iban: JsonField<String>) = apply { this.iban = iban }

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
         * Returns an immutable instance of [SwiftExternalAccountCreateInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountType()
         * .bankName()
         * .beneficiary()
         * .country()
         * .swiftCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SwiftExternalAccountCreateInfo =
            SwiftExternalAccountCreateInfo(
                checkRequired("accountType", accountType),
                checkRequired("bankName", bankName),
                checkRequired("beneficiary", beneficiary),
                checkRequired("country", country),
                checkRequired("swiftCode", swiftCode),
                accountNumber,
                iban,
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
    fun validate(): SwiftExternalAccountCreateInfo = apply {
        if (validated) {
            return@apply
        }

        accountType().validate()
        bankName()
        beneficiary().validate()
        country()
        swiftCode()
        accountNumber()
        iban()
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
            (if (bankName.asKnown() == null) 0 else 1) +
            (beneficiary.asKnown()?.validity() ?: 0) +
            (if (country.asKnown() == null) 0 else 1) +
            (if (swiftCode.asKnown() == null) 0 else 1) +
            (if (accountNumber.asKnown() == null) 0 else 1) +
            (if (iban.asKnown() == null) 0 else 1)

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

            val SWIFT_ACCOUNT = of("SWIFT_ACCOUNT")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            SWIFT_ACCOUNT
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
            SWIFT_ACCOUNT,
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
                SWIFT_ACCOUNT -> Value.SWIFT_ACCOUNT
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
                SWIFT_ACCOUNT -> Known.SWIFT_ACCOUNT
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
        private val individual: Individual? = null,
        private val business: BusinessBeneficiary? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): Individual? = individual

        fun business(): BusinessBeneficiary? = business

        fun isIndividual(): Boolean = individual != null

        fun isBusiness(): Boolean = business != null

        fun asIndividual(): Individual = individual.getOrThrow("individual")

        fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

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
         *     override fun visitIndividual(individual: Individual): String? = individual.toString()
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
                    override fun visitIndividual(individual: Individual) {
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
                    override fun visitIndividual(individual: Individual) = individual.validity()

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

            fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

            fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
        }

        /**
         * An interface that defines how to map each variant of [Beneficiary] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: Individual): T

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
                        return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
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

        class Individual
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val beneficiaryType: JsonValue,
            private val fullName: JsonField<String>,
            private val address: JsonField<Address>,
            private val birthDate: JsonField<String>,
            private val countryOfResidence: JsonField<String>,
            private val email: JsonField<String>,
            private val nationality: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                beneficiaryType: JsonValue = JsonMissing.of(),
                @JsonProperty("fullName")
                @ExcludeMissing
                fullName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("birthDate")
                @ExcludeMissing
                birthDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                countryOfResidence: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nationality")
                @ExcludeMissing
                nationality: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                beneficiaryType,
                fullName,
                address,
                birthDate,
                countryOfResidence,
                email,
                nationality,
                phoneNumber,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("INDIVIDUAL")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("beneficiaryType")
            @ExcludeMissing
            fun _beneficiaryType(): JsonValue = beneficiaryType

            /**
             * The full name of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fullName(): String = fullName.getRequired("fullName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun address(): Address? = address.getNullable("address")

            /**
             * The birth date of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun birthDate(): String? = birthDate.getNullable("birthDate")

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
             * The nationality of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun nationality(): String? = nationality.getNullable("nationality")

            /**
             * The phone number of the beneficiary
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

            /**
             * Returns the raw JSON value of [fullName].
             *
             * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("birthDate")
            @ExcludeMissing
            fun _birthDate(): JsonField<String> = birthDate

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
             * Returns the raw JSON value of [nationality].
             *
             * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nationality")
            @ExcludeMissing
            fun _nationality(): JsonField<String> = nationality

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * Returns a mutable builder for constructing an instance of [Individual].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .fullName()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Individual]. */
            class Builder internal constructor() {

                private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                private var fullName: JsonField<String>? = null
                private var address: JsonField<Address> = JsonMissing.of()
                private var birthDate: JsonField<String> = JsonMissing.of()
                private var countryOfResidence: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var nationality: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(individual: Individual) = apply {
                    beneficiaryType = individual.beneficiaryType
                    fullName = individual.fullName
                    address = individual.address
                    birthDate = individual.birthDate
                    countryOfResidence = individual.countryOfResidence
                    email = individual.email
                    nationality = individual.nationality
                    phoneNumber = individual.phoneNumber
                    additionalProperties = individual.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                    this.beneficiaryType = beneficiaryType
                }

                /** The full name of the beneficiary */
                fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                /**
                 * Sets [Builder.fullName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The birth date of the beneficiary */
                fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                /**
                 * Sets [Builder.birthDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.birthDate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun birthDate(birthDate: JsonField<String>) = apply { this.birthDate = birthDate }

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

                /** The nationality of the beneficiary */
                fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                /**
                 * Sets [Builder.nationality] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nationality] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nationality(nationality: JsonField<String>) = apply {
                    this.nationality = nationality
                }

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
                 * Returns an immutable instance of [Individual].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .fullName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Individual =
                    Individual(
                        beneficiaryType,
                        checkRequired("fullName", fullName),
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
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
            fun validate(): Individual = apply {
                if (validated) {
                    return@apply
                }

                _beneficiaryType().let {
                    if (it != JsonValue.from("INDIVIDUAL")) {
                        throw LightsparkGridInvalidDataException(
                            "'beneficiaryType' is invalid, received $it"
                        )
                    }
                }
                fullName()
                address()?.validate()
                birthDate()
                countryOfResidence()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                    (if (fullName.asKnown() == null) 0 else 1) +
                    (address.asKnown()?.validity() ?: 0) +
                    (if (birthDate.asKnown() == null) 0 else 1) +
                    (if (countryOfResidence.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (if (nationality.asKnown() == null) 0 else 1) +
                    (if (phoneNumber.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Individual &&
                    beneficiaryType == other.beneficiaryType &&
                    fullName == other.fullName &&
                    address == other.address &&
                    birthDate == other.birthDate &&
                    countryOfResidence == other.countryOfResidence &&
                    email == other.email &&
                    nationality == other.nationality &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SwiftExternalAccountCreateInfo &&
            accountType == other.accountType &&
            bankName == other.bankName &&
            beneficiary == other.beneficiary &&
            country == other.country &&
            swiftCode == other.swiftCode &&
            accountNumber == other.accountNumber &&
            iban == other.iban &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountType,
            bankName,
            beneficiary,
            country,
            swiftCode,
            accountNumber,
            iban,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SwiftExternalAccountCreateInfo{accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, country=$country, swiftCode=$swiftCode, accountNumber=$accountNumber, iban=$iban, additionalProperties=$additionalProperties}"
}
