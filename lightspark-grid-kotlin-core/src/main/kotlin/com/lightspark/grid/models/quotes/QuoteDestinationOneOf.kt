// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

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
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/** Destination account details */
@JsonDeserialize(using = QuoteDestinationOneOf.Deserializer::class)
@JsonSerialize(using = QuoteDestinationOneOf.Serializer::class)
class QuoteDestinationOneOf
private constructor(
    private val accountDestination: AccountDestination? = null,
    private val umaAddressDestination: UmaAddressDestination? = null,
    private val _json: JsonValue? = null,
) {

    /** Destination account details */
    fun accountDestination(): AccountDestination? = accountDestination

    /** UMA address destination details */
    fun umaAddressDestination(): UmaAddressDestination? = umaAddressDestination

    fun isAccountDestination(): Boolean = accountDestination != null

    fun isUmaAddressDestination(): Boolean = umaAddressDestination != null

    /** Destination account details */
    fun asAccountDestination(): AccountDestination =
        accountDestination.getOrThrow("accountDestination")

    /** UMA address destination details */
    fun asUmaAddressDestination(): UmaAddressDestination =
        umaAddressDestination.getOrThrow("umaAddressDestination")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountDestination != null -> visitor.visitAccountDestination(accountDestination)
            umaAddressDestination != null ->
                visitor.visitUmaAddressDestination(umaAddressDestination)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): QuoteDestinationOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountDestination(accountDestination: AccountDestination) {
                    accountDestination.validate()
                }

                override fun visitUmaAddressDestination(
                    umaAddressDestination: UmaAddressDestination
                ) {
                    umaAddressDestination.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAccountDestination(accountDestination: AccountDestination) =
                    accountDestination.validity()

                override fun visitUmaAddressDestination(
                    umaAddressDestination: UmaAddressDestination
                ) = umaAddressDestination.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteDestinationOneOf &&
            accountDestination == other.accountDestination &&
            umaAddressDestination == other.umaAddressDestination
    }

    override fun hashCode(): Int = Objects.hash(accountDestination, umaAddressDestination)

    override fun toString(): String =
        when {
            accountDestination != null ->
                "QuoteDestinationOneOf{accountDestination=$accountDestination}"
            umaAddressDestination != null ->
                "QuoteDestinationOneOf{umaAddressDestination=$umaAddressDestination}"
            _json != null -> "QuoteDestinationOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid QuoteDestinationOneOf")
        }

    companion object {

        /** Destination account details */
        fun ofAccountDestination(accountDestination: AccountDestination) =
            QuoteDestinationOneOf(accountDestination = accountDestination)

        /** UMA address destination details */
        fun ofUmaAddressDestination(umaAddressDestination: UmaAddressDestination) =
            QuoteDestinationOneOf(umaAddressDestination = umaAddressDestination)
    }

    /**
     * An interface that defines how to map each variant of [QuoteDestinationOneOf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Destination account details */
        fun visitAccountDestination(accountDestination: AccountDestination): T

        /** UMA address destination details */
        fun visitUmaAddressDestination(umaAddressDestination: UmaAddressDestination): T

        /**
         * Maps an unknown variant of [QuoteDestinationOneOf] to a value of type [T].
         *
         * An instance of [QuoteDestinationOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown QuoteDestinationOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<QuoteDestinationOneOf>(QuoteDestinationOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): QuoteDestinationOneOf {
            val json = JsonValue.fromJsonNode(node)
            val destinationType = json.asObject()?.get("destinationType")?.asString()

            when (destinationType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AccountDestination>())?.let {
                            QuoteDestinationOneOf(accountDestination = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UmaAddressDestination>())?.let {
                            QuoteDestinationOneOf(umaAddressDestination = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> QuoteDestinationOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<QuoteDestinationOneOf>(QuoteDestinationOneOf::class) {

        override fun serialize(
            value: QuoteDestinationOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accountDestination != null -> generator.writeObject(value.accountDestination)
                value.umaAddressDestination != null ->
                    generator.writeObject(value.umaAddressDestination)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid QuoteDestinationOneOf")
            }
        }
    }

    /** Destination account details */
    class AccountDestination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val destinationType: JsonValue,
        private val paymentRail: JsonField<PaymentRail>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonValue = JsonMissing.of(),
            @JsonProperty("paymentRail")
            @ExcludeMissing
            paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
        ) : this(accountId, destinationType, paymentRail, mutableMapOf())

        /**
         * Destination account identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonValue = destinationType

        /**
         * The payment rail used for the transfer. Payment rails represent the underlying payment
         * network or system used to move funds between accounts.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentRail(): PaymentRail? = paymentRail.getNullable("paymentRail")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [paymentRail].
         *
         * Unlike [paymentRail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paymentRail")
        @ExcludeMissing
        fun _paymentRail(): JsonField<PaymentRail> = paymentRail

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
             * Returns a mutable builder for constructing an instance of [AccountDestination].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountDestination]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var destinationType: JsonValue = JsonValue.from("ACCOUNT")
            private var paymentRail: JsonField<PaymentRail> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountDestination: AccountDestination) = apply {
                accountId = accountDestination.accountId
                destinationType = accountDestination.destinationType
                paymentRail = accountDestination.paymentRail
                additionalProperties = accountDestination.additionalProperties.toMutableMap()
            }

            /** Destination account identifier */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationType(destinationType: JsonValue) = apply {
                this.destinationType = destinationType
            }

            /**
             * The payment rail used for the transfer. Payment rails represent the underlying
             * payment network or system used to move funds between accounts.
             */
            fun paymentRail(paymentRail: PaymentRail) = paymentRail(JsonField.of(paymentRail))

            /**
             * Sets [Builder.paymentRail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRail] with a well-typed [PaymentRail] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentRail(paymentRail: JsonField<PaymentRail>) = apply {
                this.paymentRail = paymentRail
            }

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
             * Returns an immutable instance of [AccountDestination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountDestination =
                AccountDestination(
                    checkRequired("accountId", accountId),
                    destinationType,
                    paymentRail,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountDestination = apply {
            if (validated) {
                return@apply
            }

            accountId()
            _destinationType().let {
                if (it != JsonValue.from("ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'destinationType' is invalid, received $it"
                    )
                }
            }
            paymentRail()?.validate()
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
            (if (accountId.asKnown() == null) 0 else 1) +
                destinationType.let { if (it == JsonValue.from("ACCOUNT")) 1 else 0 } +
                (paymentRail.asKnown()?.validity() ?: 0)

        /**
         * The payment rail used for the transfer. Payment rails represent the underlying payment
         * network or system used to move funds between accounts.
         */
        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ACH = of("ACH")

                val BANK_TRANSFER = of("BANK_TRANSFER")

                val FAST = of("FAST")

                val FASTER_PAYMENTS = of("FASTER_PAYMENTS")

                val FEDNOW = of("FEDNOW")

                val MOBILE_MONEY = of("MOBILE_MONEY")

                val PAYNOW = of("PAYNOW")

                val PIX = of("PIX")

                val RTP = of("RTP")

                val SEPA = of("SEPA")

                val SEPA_INSTANT = of("SEPA_INSTANT")

                val SPEI = of("SPEI")

                val UPI = of("UPI")

                val WIRE = of("WIRE")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                ACH,
                BANK_TRANSFER,
                FAST,
                FASTER_PAYMENTS,
                FEDNOW,
                MOBILE_MONEY,
                PAYNOW,
                PIX,
                RTP,
                SEPA,
                SEPA_INSTANT,
                SPEI,
                UPI,
                WIRE,
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                BANK_TRANSFER,
                FAST,
                FASTER_PAYMENTS,
                FEDNOW,
                MOBILE_MONEY,
                PAYNOW,
                PIX,
                RTP,
                SEPA,
                SEPA_INSTANT,
                SPEI,
                UPI,
                WIRE,
                /**
                 * An enum member indicating that [PaymentRail] was instantiated with an unknown
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
                    ACH -> Value.ACH
                    BANK_TRANSFER -> Value.BANK_TRANSFER
                    FAST -> Value.FAST
                    FASTER_PAYMENTS -> Value.FASTER_PAYMENTS
                    FEDNOW -> Value.FEDNOW
                    MOBILE_MONEY -> Value.MOBILE_MONEY
                    PAYNOW -> Value.PAYNOW
                    PIX -> Value.PIX
                    RTP -> Value.RTP
                    SEPA -> Value.SEPA
                    SEPA_INSTANT -> Value.SEPA_INSTANT
                    SPEI -> Value.SPEI
                    UPI -> Value.UPI
                    WIRE -> Value.WIRE
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
                    ACH -> Known.ACH
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    FAST -> Known.FAST
                    FASTER_PAYMENTS -> Known.FASTER_PAYMENTS
                    FEDNOW -> Known.FEDNOW
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    PAYNOW -> Known.PAYNOW
                    PIX -> Known.PIX
                    RTP -> Known.RTP
                    SEPA -> Known.SEPA
                    SEPA_INSTANT -> Known.SEPA_INSTANT
                    SPEI -> Known.SPEI
                    UPI -> Known.UPI
                    WIRE -> Known.WIRE
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

            fun validate(): PaymentRail = apply {
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

                return other is PaymentRail && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountDestination &&
                accountId == other.accountId &&
                destinationType == other.destinationType &&
                paymentRail == other.paymentRail &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, destinationType, paymentRail, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountDestination{accountId=$accountId, destinationType=$destinationType, paymentRail=$paymentRail, additionalProperties=$additionalProperties}"
    }

    /** UMA address destination details */
    class UmaAddressDestination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destinationType: JsonValue,
        private val umaAddress: JsonField<String>,
        private val currency: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonValue = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        ) : this(destinationType, umaAddress, currency, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("UMA_ADDRESS")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonValue = destinationType

        /**
         * UMA address of the recipient
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * Currency code for the destination. See
         * [Supported Currencies](https://grid.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
         * for the full list of supported fiat and crypto currencies.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * Returns the raw JSON value of [umaAddress].
         *
         * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("umaAddress")
        @ExcludeMissing
        fun _umaAddress(): JsonField<String> = umaAddress

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
             * Returns a mutable builder for constructing an instance of [UmaAddressDestination].
             *
             * The following fields are required:
             * ```kotlin
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UmaAddressDestination]. */
        class Builder internal constructor() {

            private var destinationType: JsonValue = JsonValue.from("UMA_ADDRESS")
            private var umaAddress: JsonField<String>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(umaAddressDestination: UmaAddressDestination) = apply {
                destinationType = umaAddressDestination.destinationType
                umaAddress = umaAddressDestination.umaAddress
                currency = umaAddressDestination.currency
                additionalProperties = umaAddressDestination.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("UMA_ADDRESS")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationType(destinationType: JsonValue) = apply {
                this.destinationType = destinationType
            }

            /** UMA address of the recipient */
            fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

            /**
             * Sets [Builder.umaAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.umaAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

            /**
             * Currency code for the destination. See
             * [Supported Currencies](https://grid.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
             * for the full list of supported fiat and crypto currencies.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [UmaAddressDestination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UmaAddressDestination =
                UmaAddressDestination(
                    destinationType,
                    checkRequired("umaAddress", umaAddress),
                    currency,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UmaAddressDestination = apply {
            if (validated) {
                return@apply
            }

            _destinationType().let {
                if (it != JsonValue.from("UMA_ADDRESS")) {
                    throw LightsparkGridInvalidDataException(
                        "'destinationType' is invalid, received $it"
                    )
                }
            }
            umaAddress()
            currency()
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
            destinationType.let { if (it == JsonValue.from("UMA_ADDRESS")) 1 else 0 } +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (currency.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UmaAddressDestination &&
                destinationType == other.destinationType &&
                umaAddress == other.umaAddress &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(destinationType, umaAddress, currency, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UmaAddressDestination{destinationType=$destinationType, umaAddress=$umaAddress, currency=$currency, additionalProperties=$additionalProperties}"
    }
}
