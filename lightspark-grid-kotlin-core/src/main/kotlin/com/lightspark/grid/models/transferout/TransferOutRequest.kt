// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferout

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
import com.lightspark.grid.models.transferin.InternalAccountReference
import java.util.Collections
import java.util.Objects

class TransferOutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destination: JsonField<Destination>,
    private val source: JsonField<InternalAccountReference>,
    private val amount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<Destination> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<InternalAccountReference> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
    ) : this(destination, source, amount, mutableMapOf())

    /**
     * Destination external account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): Destination = destination.getRequired("destination")

    /**
     * Source internal account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): InternalAccountReference = source.getRequired("source")

    /**
     * Amount in the smallest unit of the currency (e.g., cents for USD/EUR, satoshis for BTC)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Long? = amount.getNullable("amount")

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<Destination> = destination

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<InternalAccountReference> = source

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
         * Returns a mutable builder for constructing an instance of [TransferOutRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransferOutRequest]. */
    class Builder internal constructor() {

        private var destination: JsonField<Destination>? = null
        private var source: JsonField<InternalAccountReference>? = null
        private var amount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transferOutRequest: TransferOutRequest) = apply {
            destination = transferOutRequest.destination
            source = transferOutRequest.source
            amount = transferOutRequest.amount
            additionalProperties = transferOutRequest.additionalProperties.toMutableMap()
        }

        /** Destination external account details */
        fun destination(destination: Destination) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [Destination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destination(destination: JsonField<Destination>) = apply {
            this.destination = destination
        }

        /** Source internal account details */
        fun source(source: InternalAccountReference) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [InternalAccountReference]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun source(source: JsonField<InternalAccountReference>) = apply { this.source = source }

        /**
         * Amount in the smallest unit of the currency (e.g., cents for USD/EUR, satoshis for BTC)
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
         * Returns an immutable instance of [TransferOutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferOutRequest =
            TransferOutRequest(
                checkRequired("destination", destination),
                checkRequired("source", source),
                amount,
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
    fun validate(): TransferOutRequest = apply {
        if (validated) {
            return@apply
        }

        destination().validate()
        source().validate()
        amount()
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
        (destination.asKnown()?.validity() ?: 0) +
            (source.asKnown()?.validity() ?: 0) +
            (if (amount.asKnown() == null) 0 else 1)

    /** Destination external account details */
    class Destination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val paymentRail: JsonField<PaymentRail>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRail")
            @ExcludeMissing
            paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
        ) : this(accountId, paymentRail, mutableMapOf())

        /**
         * Reference to an external account ID
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

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
             * Returns a mutable builder for constructing an instance of [Destination].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Destination]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var paymentRail: JsonField<PaymentRail> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(destination: Destination) = apply {
                accountId = destination.accountId
                paymentRail = destination.paymentRail
                additionalProperties = destination.additionalProperties.toMutableMap()
            }

            /** Reference to an external account ID */
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
             * Returns an immutable instance of [Destination].
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
            fun build(): Destination =
                Destination(
                    checkRequired("accountId", accountId),
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
        fun validate(): Destination = apply {
            if (validated) {
                return@apply
            }

            accountId()
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
            (if (accountId.asKnown() == null) 0 else 1) + (paymentRail.asKnown()?.validity() ?: 0)

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

                val SWIFT = of("SWIFT")

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
                SWIFT,
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
                SWIFT,
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
                    SWIFT -> Value.SWIFT
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
                    SWIFT -> Known.SWIFT
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

            return other is Destination &&
                accountId == other.accountId &&
                paymentRail == other.paymentRail &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, paymentRail, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Destination{accountId=$accountId, paymentRail=$paymentRail, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferOutRequest &&
            destination == other.destination &&
            source == other.source &&
            amount == other.amount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(destination, source, amount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferOutRequest{destination=$destination, source=$source, amount=$amount, additionalProperties=$additionalProperties}"
}
