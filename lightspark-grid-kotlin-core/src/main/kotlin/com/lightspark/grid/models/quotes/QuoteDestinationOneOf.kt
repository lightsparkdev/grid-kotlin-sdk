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

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.lightspark.grid.core.JsonValue
     *
     * val result: String? = quoteDestinationOneOf.accept(object : QuoteDestinationOneOf.Visitor<String?> {
     *     override fun visitAccountDestination(accountDestination: AccountDestination): String? = accountDestination.toString()
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
            accountDestination != null -> visitor.visitAccountDestination(accountDestination)
            umaAddressDestination != null ->
                visitor.visitUmaAddressDestination(umaAddressDestination)
            else -> visitor.unknown(_json)
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

            when (destinationType) {
                "ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<AccountDestination>())?.let {
                        QuoteDestinationOneOf(accountDestination = it, _json = json)
                    } ?: QuoteDestinationOneOf(_json = json)
                }
                "UMA_ADDRESS" -> {
                    return tryDeserialize(node, jacksonTypeRef<UmaAddressDestination>())?.let {
                        QuoteDestinationOneOf(umaAddressDestination = it, _json = json)
                    } ?: QuoteDestinationOneOf(_json = json)
                }
            }

            return QuoteDestinationOneOf(_json = json)
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
        private val destinationType: JsonField<DestinationType>,
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
            destinationType: JsonField<DestinationType> = JsonMissing.of(),
            @JsonProperty("paymentRail")
            @ExcludeMissing
            paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
        ) : this(accountId, destinationType, paymentRail, mutableMapOf())

        fun toBaseDestination(): BaseDestination = BaseDestination.builder().build()

        /**
         * Destination account identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationType(): DestinationType = destinationType.getRequired("destinationType")

        /**
         * The payment rail to use for the transfer. Must be one of the rails supported by the
         * destination account. If not specified, the system will select a default rail.
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
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<DestinationType> = destinationType

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
             * .destinationType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountDestination]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var destinationType: JsonField<DestinationType>? = null
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

            fun destinationType(destinationType: DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed [DestinationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationType(destinationType: JsonField<DestinationType>) = apply {
                this.destinationType = destinationType
            }

            /**
             * The payment rail to use for the transfer. Must be one of the rails supported by the
             * destination account. If not specified, the system will select a default rail.
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
             * .destinationType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountDestination =
                AccountDestination(
                    checkRequired("accountId", accountId),
                    checkRequired("destinationType", destinationType),
                    paymentRail,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): AccountDestination = apply {
            if (validated) {
                return@apply
            }

            accountId()
            destinationType().validate()
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
                (destinationType.asKnown()?.validity() ?: 0) +
                (paymentRail.asKnown()?.validity() ?: 0)

        class DestinationType
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

                val ACCOUNT = of("ACCOUNT")

                fun of(value: String) = DestinationType(JsonField.of(value))
            }

            /** An enum containing [DestinationType]'s known values. */
            enum class Known {
                ACCOUNT
            }

            /**
             * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DestinationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT,
                /**
                 * An enum member indicating that [DestinationType] was instantiated with an unknown
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
                    ACCOUNT -> Value.ACCOUNT
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
                    ACCOUNT -> Known.ACCOUNT
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown DestinationType: $value")
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
            fun validate(): DestinationType = apply {
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

                return other is DestinationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The payment rail to use for the transfer. Must be one of the rails supported by the
         * destination account. If not specified, the system will select a default rail.
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

                val ACH_COLOMBIA = of("ACH_COLOMBIA")

                val ACH_SAME_DAY = of("ACH_SAME_DAY")

                val BANK_TRANSFER = of("BANK_TRANSFER")

                val BRE_B = of("BRE_B")

                val CIPS = of("CIPS")

                val FAST = of("FAST")

                val FASTER_PAYMENTS = of("FASTER_PAYMENTS")

                val FEDNOW = of("FEDNOW")

                val INSTAPAY = of("INSTAPAY")

                val MOBILE_MONEY = of("MOBILE_MONEY")

                val NEFT = of("NEFT")

                val PAYNOW = of("PAYNOW")

                val PESONET = of("PESONET")

                val PIX = of("PIX")

                val RTGS = of("RTGS")

                val RTP = of("RTP")

                val SEPA = of("SEPA")

                val SEPA_INSTANT = of("SEPA_INSTANT")

                val SPEI = of("SPEI")

                val SWIFT = of("SWIFT")

                val UNIONPAY = of("UNIONPAY")

                val UPI = of("UPI")

                val WIRE = of("WIRE")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                ACH,
                ACH_COLOMBIA,
                ACH_SAME_DAY,
                BANK_TRANSFER,
                BRE_B,
                CIPS,
                FAST,
                FASTER_PAYMENTS,
                FEDNOW,
                INSTAPAY,
                MOBILE_MONEY,
                NEFT,
                PAYNOW,
                PESONET,
                PIX,
                RTGS,
                RTP,
                SEPA,
                SEPA_INSTANT,
                SPEI,
                SWIFT,
                UNIONPAY,
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
                ACH_COLOMBIA,
                ACH_SAME_DAY,
                BANK_TRANSFER,
                BRE_B,
                CIPS,
                FAST,
                FASTER_PAYMENTS,
                FEDNOW,
                INSTAPAY,
                MOBILE_MONEY,
                NEFT,
                PAYNOW,
                PESONET,
                PIX,
                RTGS,
                RTP,
                SEPA,
                SEPA_INSTANT,
                SPEI,
                SWIFT,
                UNIONPAY,
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
                    ACH_COLOMBIA -> Value.ACH_COLOMBIA
                    ACH_SAME_DAY -> Value.ACH_SAME_DAY
                    BANK_TRANSFER -> Value.BANK_TRANSFER
                    BRE_B -> Value.BRE_B
                    CIPS -> Value.CIPS
                    FAST -> Value.FAST
                    FASTER_PAYMENTS -> Value.FASTER_PAYMENTS
                    FEDNOW -> Value.FEDNOW
                    INSTAPAY -> Value.INSTAPAY
                    MOBILE_MONEY -> Value.MOBILE_MONEY
                    NEFT -> Value.NEFT
                    PAYNOW -> Value.PAYNOW
                    PESONET -> Value.PESONET
                    PIX -> Value.PIX
                    RTGS -> Value.RTGS
                    RTP -> Value.RTP
                    SEPA -> Value.SEPA
                    SEPA_INSTANT -> Value.SEPA_INSTANT
                    SPEI -> Value.SPEI
                    SWIFT -> Value.SWIFT
                    UNIONPAY -> Value.UNIONPAY
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
                    ACH_COLOMBIA -> Known.ACH_COLOMBIA
                    ACH_SAME_DAY -> Known.ACH_SAME_DAY
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    BRE_B -> Known.BRE_B
                    CIPS -> Known.CIPS
                    FAST -> Known.FAST
                    FASTER_PAYMENTS -> Known.FASTER_PAYMENTS
                    FEDNOW -> Known.FEDNOW
                    INSTAPAY -> Known.INSTAPAY
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    NEFT -> Known.NEFT
                    PAYNOW -> Known.PAYNOW
                    PESONET -> Known.PESONET
                    PIX -> Known.PIX
                    RTGS -> Known.RTGS
                    RTP -> Known.RTP
                    SEPA -> Known.SEPA
                    SEPA_INSTANT -> Known.SEPA_INSTANT
                    SPEI -> Known.SPEI
                    SWIFT -> Known.SWIFT
                    UNIONPAY -> Known.UNIONPAY
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
        private val currency: JsonField<String>,
        private val destinationType: JsonField<DestinationType>,
        private val umaAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<DestinationType> = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
        ) : this(currency, destinationType, umaAddress, mutableMapOf())

        fun toBaseDestination(): BaseDestination = BaseDestination.builder().build()

        /**
         * Currency code for the destination. See
         * [Supported Currencies](https://docs.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
         * for the full list of supported fiat and crypto currencies.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationType(): DestinationType = destinationType.getRequired("destinationType")

        /**
         * UMA address of the recipient
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<DestinationType> = destinationType

        /**
         * Returns the raw JSON value of [umaAddress].
         *
         * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("umaAddress")
        @ExcludeMissing
        fun _umaAddress(): JsonField<String> = umaAddress

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
             * .currency()
             * .destinationType()
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UmaAddressDestination]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var destinationType: JsonField<DestinationType>? = null
            private var umaAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(umaAddressDestination: UmaAddressDestination) = apply {
                currency = umaAddressDestination.currency
                destinationType = umaAddressDestination.destinationType
                umaAddress = umaAddressDestination.umaAddress
                additionalProperties = umaAddressDestination.additionalProperties.toMutableMap()
            }

            /**
             * Currency code for the destination. See
             * [Supported Currencies](https://docs.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
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

            fun destinationType(destinationType: DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed [DestinationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationType(destinationType: JsonField<DestinationType>) = apply {
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
             * .currency()
             * .destinationType()
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UmaAddressDestination =
                UmaAddressDestination(
                    checkRequired("currency", currency),
                    checkRequired("destinationType", destinationType),
                    checkRequired("umaAddress", umaAddress),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UmaAddressDestination = apply {
            if (validated) {
                return@apply
            }

            currency()
            destinationType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (currency.asKnown() == null) 0 else 1) +
                (destinationType.asKnown()?.validity() ?: 0) +
                (if (umaAddress.asKnown() == null) 0 else 1)

        class DestinationType
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

                val UMA_ADDRESS = of("UMA_ADDRESS")

                fun of(value: String) = DestinationType(JsonField.of(value))
            }

            /** An enum containing [DestinationType]'s known values. */
            enum class Known {
                UMA_ADDRESS
            }

            /**
             * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DestinationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UMA_ADDRESS,
                /**
                 * An enum member indicating that [DestinationType] was instantiated with an unknown
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
                    UMA_ADDRESS -> Value.UMA_ADDRESS
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
                    UMA_ADDRESS -> Known.UMA_ADDRESS
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown DestinationType: $value")
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
            fun validate(): DestinationType = apply {
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

                return other is DestinationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UmaAddressDestination &&
                currency == other.currency &&
                destinationType == other.destinationType &&
                umaAddress == other.umaAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, destinationType, umaAddress, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UmaAddressDestination{currency=$currency, destinationType=$destinationType, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
    }
}
