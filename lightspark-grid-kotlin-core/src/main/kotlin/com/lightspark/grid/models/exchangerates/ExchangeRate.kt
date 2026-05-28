// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.exchangerates

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Exchange rate information for a currency corridor */
class ExchangeRate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destinationCurrency: JsonField<Currency>,
    private val destinationPaymentRail: JsonValue,
    private val exchangeRate: JsonField<Double>,
    private val fees: JsonField<Fees>,
    private val maxSendingAmount: JsonField<Long>,
    private val minSendingAmount: JsonField<Long>,
    private val receivingAmount: JsonField<Long>,
    private val sendingAmount: JsonField<Long>,
    private val sourceCurrency: JsonField<Currency>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destinationCurrency")
        @ExcludeMissing
        destinationCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("destinationPaymentRail")
        @ExcludeMissing
        destinationPaymentRail: JsonValue = JsonMissing.of(),
        @JsonProperty("exchangeRate")
        @ExcludeMissing
        exchangeRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing fees: JsonField<Fees> = JsonMissing.of(),
        @JsonProperty("maxSendingAmount")
        @ExcludeMissing
        maxSendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minSendingAmount")
        @ExcludeMissing
        minSendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("receivingAmount")
        @ExcludeMissing
        receivingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sendingAmount")
        @ExcludeMissing
        sendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sourceCurrency")
        @ExcludeMissing
        sourceCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        destinationCurrency,
        destinationPaymentRail,
        exchangeRate,
        fees,
        maxSendingAmount,
        minSendingAmount,
        receivingAmount,
        sendingAmount,
        sourceCurrency,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destinationCurrency(): Currency = destinationCurrency.getRequired("destinationCurrency")

    /**
     * The payment rail used for the destination (e.g., UPI, SEPA_INSTANT, MOBILE_MONEY,
     * FASTER_PAYMENTS)
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = exchangeRate.destinationPaymentRail().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("destinationPaymentRail")
    @ExcludeMissing
    fun _destinationPaymentRail(): JsonValue = destinationPaymentRail

    /**
     * Number of sending currency units per receiving currency unit.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exchangeRate(): Double = exchangeRate.getRequired("exchangeRate")

    /**
     * Fees associated with an exchange rate
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fees(): Fees = fees.getRequired("fees")

    /**
     * The maximum supported sending amount in the smallest unit of the source currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxSendingAmount(): Long = maxSendingAmount.getRequired("maxSendingAmount")

    /**
     * The minimum supported sending amount in the smallest unit of the source currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minSendingAmount(): Long = minSendingAmount.getRequired("minSendingAmount")

    /**
     * The receiving amount in the smallest unit of the destination currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun receivingAmount(): Long = receivingAmount.getRequired("receivingAmount")

    /**
     * The sending amount in the smallest unit of the source currency (e.g., cents for USD). Echoed
     * back from the request if provided.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendingAmount(): Long = sendingAmount.getRequired("sendingAmount")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceCurrency(): Currency = sourceCurrency.getRequired("sourceCurrency")

    /**
     * Timestamp when this exchange rate was last refreshed
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [destinationCurrency].
     *
     * Unlike [destinationCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("destinationCurrency")
    @ExcludeMissing
    fun _destinationCurrency(): JsonField<Currency> = destinationCurrency

    /**
     * Returns the raw JSON value of [exchangeRate].
     *
     * Unlike [exchangeRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchangeRate")
    @ExcludeMissing
    fun _exchangeRate(): JsonField<Double> = exchangeRate

    /**
     * Returns the raw JSON value of [fees].
     *
     * Unlike [fees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Fees> = fees

    /**
     * Returns the raw JSON value of [maxSendingAmount].
     *
     * Unlike [maxSendingAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxSendingAmount")
    @ExcludeMissing
    fun _maxSendingAmount(): JsonField<Long> = maxSendingAmount

    /**
     * Returns the raw JSON value of [minSendingAmount].
     *
     * Unlike [minSendingAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minSendingAmount")
    @ExcludeMissing
    fun _minSendingAmount(): JsonField<Long> = minSendingAmount

    /**
     * Returns the raw JSON value of [receivingAmount].
     *
     * Unlike [receivingAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivingAmount")
    @ExcludeMissing
    fun _receivingAmount(): JsonField<Long> = receivingAmount

    /**
     * Returns the raw JSON value of [sendingAmount].
     *
     * Unlike [sendingAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sendingAmount")
    @ExcludeMissing
    fun _sendingAmount(): JsonField<Long> = sendingAmount

    /**
     * Returns the raw JSON value of [sourceCurrency].
     *
     * Unlike [sourceCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceCurrency")
    @ExcludeMissing
    fun _sourceCurrency(): JsonField<Currency> = sourceCurrency

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [ExchangeRate].
         *
         * The following fields are required:
         * ```kotlin
         * .destinationCurrency()
         * .destinationPaymentRail()
         * .exchangeRate()
         * .fees()
         * .maxSendingAmount()
         * .minSendingAmount()
         * .receivingAmount()
         * .sendingAmount()
         * .sourceCurrency()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExchangeRate]. */
    class Builder internal constructor() {

        private var destinationCurrency: JsonField<Currency>? = null
        private var destinationPaymentRail: JsonValue? = null
        private var exchangeRate: JsonField<Double>? = null
        private var fees: JsonField<Fees>? = null
        private var maxSendingAmount: JsonField<Long>? = null
        private var minSendingAmount: JsonField<Long>? = null
        private var receivingAmount: JsonField<Long>? = null
        private var sendingAmount: JsonField<Long>? = null
        private var sourceCurrency: JsonField<Currency>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(exchangeRate: ExchangeRate) = apply {
            destinationCurrency = exchangeRate.destinationCurrency
            destinationPaymentRail = exchangeRate.destinationPaymentRail
            this.exchangeRate = exchangeRate.exchangeRate
            fees = exchangeRate.fees
            maxSendingAmount = exchangeRate.maxSendingAmount
            minSendingAmount = exchangeRate.minSendingAmount
            receivingAmount = exchangeRate.receivingAmount
            sendingAmount = exchangeRate.sendingAmount
            sourceCurrency = exchangeRate.sourceCurrency
            updatedAt = exchangeRate.updatedAt
            additionalProperties = exchangeRate.additionalProperties.toMutableMap()
        }

        fun destinationCurrency(destinationCurrency: Currency) =
            destinationCurrency(JsonField.of(destinationCurrency))

        /**
         * Sets [Builder.destinationCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationCurrency(destinationCurrency: JsonField<Currency>) = apply {
            this.destinationCurrency = destinationCurrency
        }

        /**
         * The payment rail used for the destination (e.g., UPI, SEPA_INSTANT, MOBILE_MONEY,
         * FASTER_PAYMENTS)
         */
        fun destinationPaymentRail(destinationPaymentRail: JsonValue) = apply {
            this.destinationPaymentRail = destinationPaymentRail
        }

        /** Number of sending currency units per receiving currency unit. */
        fun exchangeRate(exchangeRate: Double) = exchangeRate(JsonField.of(exchangeRate))

        /**
         * Sets [Builder.exchangeRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exchangeRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exchangeRate(exchangeRate: JsonField<Double>) = apply {
            this.exchangeRate = exchangeRate
        }

        /** Fees associated with an exchange rate */
        fun fees(fees: Fees) = fees(JsonField.of(fees))

        /**
         * Sets [Builder.fees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fees] with a well-typed [Fees] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fees(fees: JsonField<Fees>) = apply { this.fees = fees }

        /** The maximum supported sending amount in the smallest unit of the source currency. */
        fun maxSendingAmount(maxSendingAmount: Long) =
            maxSendingAmount(JsonField.of(maxSendingAmount))

        /**
         * Sets [Builder.maxSendingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSendingAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxSendingAmount(maxSendingAmount: JsonField<Long>) = apply {
            this.maxSendingAmount = maxSendingAmount
        }

        /** The minimum supported sending amount in the smallest unit of the source currency. */
        fun minSendingAmount(minSendingAmount: Long) =
            minSendingAmount(JsonField.of(minSendingAmount))

        /**
         * Sets [Builder.minSendingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minSendingAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minSendingAmount(minSendingAmount: JsonField<Long>) = apply {
            this.minSendingAmount = minSendingAmount
        }

        /** The receiving amount in the smallest unit of the destination currency */
        fun receivingAmount(receivingAmount: Long) = receivingAmount(JsonField.of(receivingAmount))

        /**
         * Sets [Builder.receivingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun receivingAmount(receivingAmount: JsonField<Long>) = apply {
            this.receivingAmount = receivingAmount
        }

        /**
         * The sending amount in the smallest unit of the source currency (e.g., cents for USD).
         * Echoed back from the request if provided.
         */
        fun sendingAmount(sendingAmount: Long) = sendingAmount(JsonField.of(sendingAmount))

        /**
         * Sets [Builder.sendingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendingAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sendingAmount(sendingAmount: JsonField<Long>) = apply {
            this.sendingAmount = sendingAmount
        }

        fun sourceCurrency(sourceCurrency: Currency) = sourceCurrency(JsonField.of(sourceCurrency))

        /**
         * Sets [Builder.sourceCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceCurrency(sourceCurrency: JsonField<Currency>) = apply {
            this.sourceCurrency = sourceCurrency
        }

        /** Timestamp when this exchange rate was last refreshed */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ExchangeRate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .destinationCurrency()
         * .destinationPaymentRail()
         * .exchangeRate()
         * .fees()
         * .maxSendingAmount()
         * .minSendingAmount()
         * .receivingAmount()
         * .sendingAmount()
         * .sourceCurrency()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExchangeRate =
            ExchangeRate(
                checkRequired("destinationCurrency", destinationCurrency),
                checkRequired("destinationPaymentRail", destinationPaymentRail),
                checkRequired("exchangeRate", exchangeRate),
                checkRequired("fees", fees),
                checkRequired("maxSendingAmount", maxSendingAmount),
                checkRequired("minSendingAmount", minSendingAmount),
                checkRequired("receivingAmount", receivingAmount),
                checkRequired("sendingAmount", sendingAmount),
                checkRequired("sourceCurrency", sourceCurrency),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): ExchangeRate = apply {
        if (validated) {
            return@apply
        }

        destinationCurrency().validate()
        exchangeRate()
        fees().validate()
        maxSendingAmount()
        minSendingAmount()
        receivingAmount()
        sendingAmount()
        sourceCurrency().validate()
        updatedAt()
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
        (destinationCurrency.asKnown()?.validity() ?: 0) +
            (if (exchangeRate.asKnown() == null) 0 else 1) +
            (fees.asKnown()?.validity() ?: 0) +
            (if (maxSendingAmount.asKnown() == null) 0 else 1) +
            (if (minSendingAmount.asKnown() == null) 0 else 1) +
            (if (receivingAmount.asKnown() == null) 0 else 1) +
            (if (sendingAmount.asKnown() == null) 0 else 1) +
            (sourceCurrency.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** Fees associated with an exchange rate */
    class Fees
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fixed: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fixed") @ExcludeMissing fixed: JsonField<Long> = JsonMissing.of()
        ) : this(fixed, mutableMapOf())

        /**
         * Fixed fee in the smallest unit of the sending currency (e.g., cents for USD)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fixed(): Long? = fixed.getNullable("fixed")

        /**
         * Returns the raw JSON value of [fixed].
         *
         * Unlike [fixed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fixed") @ExcludeMissing fun _fixed(): JsonField<Long> = fixed

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

            /** Returns a mutable builder for constructing an instance of [Fees]. */
            fun builder() = Builder()
        }

        /** A builder for [Fees]. */
        class Builder internal constructor() {

            private var fixed: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(fees: Fees) = apply {
                fixed = fees.fixed
                additionalProperties = fees.additionalProperties.toMutableMap()
            }

            /** Fixed fee in the smallest unit of the sending currency (e.g., cents for USD) */
            fun fixed(fixed: Long) = fixed(JsonField.of(fixed))

            /**
             * Sets [Builder.fixed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixed] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fixed(fixed: JsonField<Long>) = apply { this.fixed = fixed }

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
             * Returns an immutable instance of [Fees].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Fees = Fees(fixed, additionalProperties.toMutableMap())
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
        fun validate(): Fees = apply {
            if (validated) {
                return@apply
            }

            fixed()
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
        internal fun validity(): Int = (if (fixed.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Fees &&
                fixed == other.fixed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(fixed, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Fees{fixed=$fixed, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExchangeRate &&
            destinationCurrency == other.destinationCurrency &&
            destinationPaymentRail == other.destinationPaymentRail &&
            exchangeRate == other.exchangeRate &&
            fees == other.fees &&
            maxSendingAmount == other.maxSendingAmount &&
            minSendingAmount == other.minSendingAmount &&
            receivingAmount == other.receivingAmount &&
            sendingAmount == other.sendingAmount &&
            sourceCurrency == other.sourceCurrency &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            destinationCurrency,
            destinationPaymentRail,
            exchangeRate,
            fees,
            maxSendingAmount,
            minSendingAmount,
            receivingAmount,
            sendingAmount,
            sourceCurrency,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExchangeRate{destinationCurrency=$destinationCurrency, destinationPaymentRail=$destinationPaymentRail, exchangeRate=$exchangeRate, fees=$fees, maxSendingAmount=$maxSendingAmount, minSendingAmount=$minSendingAmount, receivingAmount=$receivingAmount, sendingAmount=$sendingAmount, sourceCurrency=$sourceCurrency, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
