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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Quote
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val destination: JsonField<QuoteDestinationOneOf>,
    private val exchangeRate: JsonField<Double>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val feesIncluded: JsonField<Long>,
    private val quoteId: JsonField<String>,
    private val receivingCurrency: JsonField<Currency>,
    private val sendingCurrency: JsonField<Currency>,
    private val source: JsonField<Source>,
    private val status: JsonField<Status>,
    private val totalReceivingAmount: JsonField<Long>,
    private val totalSendingAmount: JsonField<Long>,
    private val transactionId: JsonField<String>,
    private val paymentInstructions: JsonField<List<PaymentInstructions>>,
    private val rateDetails: JsonField<OutgoingRateDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<QuoteDestinationOneOf> = JsonMissing.of(),
        @JsonProperty("exchangeRate")
        @ExcludeMissing
        exchangeRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("feesIncluded")
        @ExcludeMissing
        feesIncluded: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("quoteId") @ExcludeMissing quoteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receivingCurrency")
        @ExcludeMissing
        receivingCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("sendingCurrency")
        @ExcludeMissing
        sendingCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("totalReceivingAmount")
        @ExcludeMissing
        totalReceivingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalSendingAmount")
        @ExcludeMissing
        totalSendingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paymentInstructions")
        @ExcludeMissing
        paymentInstructions: JsonField<List<PaymentInstructions>> = JsonMissing.of(),
        @JsonProperty("rateDetails")
        @ExcludeMissing
        rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of(),
    ) : this(
        createdAt,
        destination,
        exchangeRate,
        expiresAt,
        feesIncluded,
        quoteId,
        receivingCurrency,
        sendingCurrency,
        source,
        status,
        totalReceivingAmount,
        totalSendingAmount,
        transactionId,
        paymentInstructions,
        rateDetails,
        mutableMapOf(),
    )

    /**
     * When this quote was created
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Destination account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): QuoteDestinationOneOf = destination.getRequired("destination")

    /**
     * Number of sending currency units per receiving currency unit.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exchangeRate(): Double = exchangeRate.getRequired("exchangeRate")

    /**
     * When this quote expires (typically 1-5 minutes after creation)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * The fees associated with the quote in the smallest unit of the sending currency (eg. cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feesIncluded(): Long = feesIncluded.getRequired("feesIncluded")

    /**
     * Unique identifier for this quote
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quoteId(): String = quoteId.getRequired("quoteId")

    /**
     * Currency for the receiving amount
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun receivingCurrency(): Currency = receivingCurrency.getRequired("receivingCurrency")

    /**
     * Currency for the sending amount
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendingCurrency(): Currency = sendingCurrency.getRequired("sendingCurrency")

    /**
     * Source account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * Current status of the quote
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The total amount that will be received in the smallest unit of the receiving currency (eg.
     * cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalReceivingAmount(): Long = totalReceivingAmount.getRequired("totalReceivingAmount")

    /**
     * The total amount that will be sent in the smallest unit of the sending currency (eg. cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalSendingAmount(): Long = totalSendingAmount.getRequired("totalSendingAmount")

    /**
     * The ID of the transaction created from this quote.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionId(): String = transactionId.getRequired("transactionId")

    /**
     * Payment instructions for executing the payment. This is not required when using an internal
     * account source.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentInstructions(): List<PaymentInstructions>? =
        paymentInstructions.getNullable("paymentInstructions")

    /**
     * Details about the rate and fees for the transaction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rateDetails(): OutgoingRateDetails? = rateDetails.getNullable("rateDetails")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<QuoteDestinationOneOf> = destination

    /**
     * Returns the raw JSON value of [exchangeRate].
     *
     * Unlike [exchangeRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchangeRate")
    @ExcludeMissing
    fun _exchangeRate(): JsonField<Double> = exchangeRate

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [feesIncluded].
     *
     * Unlike [feesIncluded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feesIncluded")
    @ExcludeMissing
    fun _feesIncluded(): JsonField<Long> = feesIncluded

    /**
     * Returns the raw JSON value of [quoteId].
     *
     * Unlike [quoteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quoteId") @ExcludeMissing fun _quoteId(): JsonField<String> = quoteId

    /**
     * Returns the raw JSON value of [receivingCurrency].
     *
     * Unlike [receivingCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receivingCurrency")
    @ExcludeMissing
    fun _receivingCurrency(): JsonField<Currency> = receivingCurrency

    /**
     * Returns the raw JSON value of [sendingCurrency].
     *
     * Unlike [sendingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sendingCurrency")
    @ExcludeMissing
    fun _sendingCurrency(): JsonField<Currency> = sendingCurrency

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [totalReceivingAmount].
     *
     * Unlike [totalReceivingAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalReceivingAmount")
    @ExcludeMissing
    fun _totalReceivingAmount(): JsonField<Long> = totalReceivingAmount

    /**
     * Returns the raw JSON value of [totalSendingAmount].
     *
     * Unlike [totalSendingAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalSendingAmount")
    @ExcludeMissing
    fun _totalSendingAmount(): JsonField<Long> = totalSendingAmount

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [paymentInstructions].
     *
     * Unlike [paymentInstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("paymentInstructions")
    @ExcludeMissing
    fun _paymentInstructions(): JsonField<List<PaymentInstructions>> = paymentInstructions

    /**
     * Returns the raw JSON value of [rateDetails].
     *
     * Unlike [rateDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rateDetails")
    @ExcludeMissing
    fun _rateDetails(): JsonField<OutgoingRateDetails> = rateDetails

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
         * Returns a mutable builder for constructing an instance of [Quote].
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .destination()
         * .exchangeRate()
         * .expiresAt()
         * .feesIncluded()
         * .quoteId()
         * .receivingCurrency()
         * .sendingCurrency()
         * .source()
         * .status()
         * .totalReceivingAmount()
         * .totalSendingAmount()
         * .transactionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Quote]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var destination: JsonField<QuoteDestinationOneOf>? = null
        private var exchangeRate: JsonField<Double>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var feesIncluded: JsonField<Long>? = null
        private var quoteId: JsonField<String>? = null
        private var receivingCurrency: JsonField<Currency>? = null
        private var sendingCurrency: JsonField<Currency>? = null
        private var source: JsonField<Source>? = null
        private var status: JsonField<Status>? = null
        private var totalReceivingAmount: JsonField<Long>? = null
        private var totalSendingAmount: JsonField<Long>? = null
        private var transactionId: JsonField<String>? = null
        private var paymentInstructions: JsonField<MutableList<PaymentInstructions>>? = null
        private var rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(quote: Quote) = apply {
            createdAt = quote.createdAt
            destination = quote.destination
            exchangeRate = quote.exchangeRate
            expiresAt = quote.expiresAt
            feesIncluded = quote.feesIncluded
            quoteId = quote.quoteId
            receivingCurrency = quote.receivingCurrency
            sendingCurrency = quote.sendingCurrency
            source = quote.source
            status = quote.status
            totalReceivingAmount = quote.totalReceivingAmount
            totalSendingAmount = quote.totalSendingAmount
            transactionId = quote.transactionId
            paymentInstructions = quote.paymentInstructions.map { it.toMutableList() }
            rateDetails = quote.rateDetails
            additionalProperties = quote.additionalProperties.toMutableMap()
        }

        /** When this quote was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Destination account details */
        fun destination(destination: QuoteDestinationOneOf) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [QuoteDestinationOneOf]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destination(destination: JsonField<QuoteDestinationOneOf>) = apply {
            this.destination = destination
        }

        /**
         * Alias for calling [destination] with
         * `QuoteDestinationOneOf.ofAccountDestination(accountDestination)`.
         */
        fun destination(accountDestination: QuoteDestinationOneOf.AccountDestination) =
            destination(QuoteDestinationOneOf.ofAccountDestination(accountDestination))

        /**
         * Alias for calling [destination] with
         * `QuoteDestinationOneOf.ofUmaAddressDestination(umaAddressDestination)`.
         */
        fun destination(umaAddressDestination: QuoteDestinationOneOf.UmaAddressDestination) =
            destination(QuoteDestinationOneOf.ofUmaAddressDestination(umaAddressDestination))

        /**
         * Alias for calling [destination] with
         * `QuoteDestinationOneOf.ofExternalAccountDetailsDestination(externalAccountDetailsDestination)`.
         */
        fun destination(
            externalAccountDetailsDestination:
                QuoteDestinationOneOf.ExternalAccountDetailsDestination
        ) =
            destination(
                QuoteDestinationOneOf.ofExternalAccountDetailsDestination(
                    externalAccountDetailsDestination
                )
            )

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

        /** When this quote expires (typically 1-5 minutes after creation) */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * The fees associated with the quote in the smallest unit of the sending currency (eg.
         * cents).
         */
        fun feesIncluded(feesIncluded: Long) = feesIncluded(JsonField.of(feesIncluded))

        /**
         * Sets [Builder.feesIncluded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feesIncluded] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feesIncluded(feesIncluded: JsonField<Long>) = apply { this.feesIncluded = feesIncluded }

        /** Unique identifier for this quote */
        fun quoteId(quoteId: String) = quoteId(JsonField.of(quoteId))

        /**
         * Sets [Builder.quoteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

        /** Currency for the receiving amount */
        fun receivingCurrency(receivingCurrency: Currency) =
            receivingCurrency(JsonField.of(receivingCurrency))

        /**
         * Sets [Builder.receivingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingCurrency(receivingCurrency: JsonField<Currency>) = apply {
            this.receivingCurrency = receivingCurrency
        }

        /** Currency for the sending amount */
        fun sendingCurrency(sendingCurrency: Currency) =
            sendingCurrency(JsonField.of(sendingCurrency))

        /**
         * Sets [Builder.sendingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendingCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendingCurrency(sendingCurrency: JsonField<Currency>) = apply {
            this.sendingCurrency = sendingCurrency
        }

        /** Source account details */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** Alias for calling [source] with `Source.ofAccountQuote(accountQuote)`. */
        fun source(accountQuote: Source.AccountQuoteSource) =
            source(Source.ofAccountQuote(accountQuote))

        /**
         * Alias for calling [source] with `Source.ofRealtimeFundingQuote(realtimeFundingQuote)`.
         */
        fun source(realtimeFundingQuote: Source.RealtimeFundingQuoteSource) =
            source(Source.ofRealtimeFundingQuote(realtimeFundingQuote))

        /** Current status of the quote */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The total amount that will be received in the smallest unit of the receiving currency
         * (eg. cents).
         */
        fun totalReceivingAmount(totalReceivingAmount: Long) =
            totalReceivingAmount(JsonField.of(totalReceivingAmount))

        /**
         * Sets [Builder.totalReceivingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalReceivingAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalReceivingAmount(totalReceivingAmount: JsonField<Long>) = apply {
            this.totalReceivingAmount = totalReceivingAmount
        }

        /**
         * The total amount that will be sent in the smallest unit of the sending currency (eg.
         * cents).
         */
        fun totalSendingAmount(totalSendingAmount: Long) =
            totalSendingAmount(JsonField.of(totalSendingAmount))

        /**
         * Sets [Builder.totalSendingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSendingAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalSendingAmount(totalSendingAmount: JsonField<Long>) = apply {
            this.totalSendingAmount = totalSendingAmount
        }

        /** The ID of the transaction created from this quote. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Payment instructions for executing the payment. This is not required when using an
         * internal account source.
         */
        fun paymentInstructions(paymentInstructions: List<PaymentInstructions>) =
            paymentInstructions(JsonField.of(paymentInstructions))

        /**
         * Sets [Builder.paymentInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentInstructions] with a well-typed
         * `List<PaymentInstructions>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun paymentInstructions(paymentInstructions: JsonField<List<PaymentInstructions>>) = apply {
            this.paymentInstructions = paymentInstructions.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentInstructions] to [paymentInstructions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentInstruction(paymentInstruction: PaymentInstructions) = apply {
            paymentInstructions =
                (paymentInstructions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentInstructions", it).add(paymentInstruction)
                }
        }

        /** Details about the rate and fees for the transaction. */
        fun rateDetails(rateDetails: OutgoingRateDetails) = rateDetails(JsonField.of(rateDetails))

        /**
         * Sets [Builder.rateDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateDetails] with a well-typed [OutgoingRateDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rateDetails(rateDetails: JsonField<OutgoingRateDetails>) = apply {
            this.rateDetails = rateDetails
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
         * Returns an immutable instance of [Quote].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .destination()
         * .exchangeRate()
         * .expiresAt()
         * .feesIncluded()
         * .quoteId()
         * .receivingCurrency()
         * .sendingCurrency()
         * .source()
         * .status()
         * .totalReceivingAmount()
         * .totalSendingAmount()
         * .transactionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Quote =
            Quote(
                checkRequired("createdAt", createdAt),
                checkRequired("destination", destination),
                checkRequired("exchangeRate", exchangeRate),
                checkRequired("expiresAt", expiresAt),
                checkRequired("feesIncluded", feesIncluded),
                checkRequired("quoteId", quoteId),
                checkRequired("receivingCurrency", receivingCurrency),
                checkRequired("sendingCurrency", sendingCurrency),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("totalReceivingAmount", totalReceivingAmount),
                checkRequired("totalSendingAmount", totalSendingAmount),
                checkRequired("transactionId", transactionId),
                (paymentInstructions ?: JsonMissing.of()).map { it.toImmutable() },
                rateDetails,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Quote = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        destination().validate()
        exchangeRate()
        expiresAt()
        feesIncluded()
        quoteId()
        receivingCurrency().validate()
        sendingCurrency().validate()
        source().validate()
        status().validate()
        totalReceivingAmount()
        totalSendingAmount()
        transactionId()
        paymentInstructions()?.forEach { it.validate() }
        rateDetails()?.validate()
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
        (if (createdAt.asKnown() == null) 0 else 1) +
            (destination.asKnown()?.validity() ?: 0) +
            (if (exchangeRate.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (feesIncluded.asKnown() == null) 0 else 1) +
            (if (quoteId.asKnown() == null) 0 else 1) +
            (receivingCurrency.asKnown()?.validity() ?: 0) +
            (sendingCurrency.asKnown()?.validity() ?: 0) +
            (source.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (totalReceivingAmount.asKnown() == null) 0 else 1) +
            (if (totalSendingAmount.asKnown() == null) 0 else 1) +
            (if (transactionId.asKnown() == null) 0 else 1) +
            (paymentInstructions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (rateDetails.asKnown()?.validity() ?: 0)

    /** Source account details */
    @JsonDeserialize(using = Source.Deserializer::class)
    @JsonSerialize(using = Source.Serializer::class)
    class Source
    private constructor(
        private val accountQuote: AccountQuoteSource? = null,
        private val realtimeFundingQuote: RealtimeFundingQuoteSource? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Source account details */
        fun accountQuote(): AccountQuoteSource? = accountQuote

        /**
         * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
         * etc.). This will require manual just-in-time funding using `paymentInstructions` in the
         * response. Because quotes expire quickly, this option is only valid for instant payment
         * methods. Do not try to fund a quote with a non-instant payment method (ACH, etc.).
         */
        fun realtimeFundingQuote(): RealtimeFundingQuoteSource? = realtimeFundingQuote

        fun isAccountQuote(): Boolean = accountQuote != null

        fun isRealtimeFundingQuote(): Boolean = realtimeFundingQuote != null

        /** Source account details */
        fun asAccountQuote(): AccountQuoteSource = accountQuote.getOrThrow("accountQuote")

        /**
         * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
         * etc.). This will require manual just-in-time funding using `paymentInstructions` in the
         * response. Because quotes expire quickly, this option is only valid for instant payment
         * methods. Do not try to fund a quote with a non-instant payment method (ACH, etc.).
         */
        fun asRealtimeFundingQuote(): RealtimeFundingQuoteSource =
            realtimeFundingQuote.getOrThrow("realtimeFundingQuote")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                accountQuote != null -> visitor.visitAccountQuote(accountQuote)
                realtimeFundingQuote != null ->
                    visitor.visitRealtimeFundingQuote(realtimeFundingQuote)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAccountQuote(accountQuote: AccountQuoteSource) {
                        accountQuote.validate()
                    }

                    override fun visitRealtimeFundingQuote(
                        realtimeFundingQuote: RealtimeFundingQuoteSource
                    ) {
                        realtimeFundingQuote.validate()
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
                    override fun visitAccountQuote(accountQuote: AccountQuoteSource) =
                        accountQuote.validity()

                    override fun visitRealtimeFundingQuote(
                        realtimeFundingQuote: RealtimeFundingQuoteSource
                    ) = realtimeFundingQuote.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                accountQuote == other.accountQuote &&
                realtimeFundingQuote == other.realtimeFundingQuote
        }

        override fun hashCode(): Int = Objects.hash(accountQuote, realtimeFundingQuote)

        override fun toString(): String =
            when {
                accountQuote != null -> "Source{accountQuote=$accountQuote}"
                realtimeFundingQuote != null -> "Source{realtimeFundingQuote=$realtimeFundingQuote}"
                _json != null -> "Source{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Source")
            }

        companion object {

            /** Source account details */
            fun ofAccountQuote(accountQuote: AccountQuoteSource) =
                Source(accountQuote = accountQuote)

            /**
             * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
             * etc.). This will require manual just-in-time funding using `paymentInstructions` in
             * the response. Because quotes expire quickly, this option is only valid for instant
             * payment methods. Do not try to fund a quote with a non-instant payment method (ACH,
             * etc.).
             */
            fun ofRealtimeFundingQuote(realtimeFundingQuote: RealtimeFundingQuoteSource) =
                Source(realtimeFundingQuote = realtimeFundingQuote)
        }

        /** An interface that defines how to map each variant of [Source] to a value of type [T]. */
        interface Visitor<out T> {

            /** Source account details */
            fun visitAccountQuote(accountQuote: AccountQuoteSource): T

            /**
             * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
             * etc.). This will require manual just-in-time funding using `paymentInstructions` in
             * the response. Because quotes expire quickly, this option is only valid for instant
             * payment methods. Do not try to fund a quote with a non-instant payment method (ACH,
             * etc.).
             */
            fun visitRealtimeFundingQuote(realtimeFundingQuote: RealtimeFundingQuoteSource): T

            /**
             * Maps an unknown variant of [Source] to a value of type [T].
             *
             * An instance of [Source] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Source: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Source>(Source::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Source {
                val json = JsonValue.fromJsonNode(node)
                val sourceType = json.asObject()?.get("sourceType")?.asString()

                when (sourceType) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AccountQuoteSource>())?.let {
                                Source(accountQuote = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RealtimeFundingQuoteSource>())
                                ?.let { Source(realtimeFundingQuote = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Source(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Source>(Source::class) {

            override fun serialize(
                value: Source,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.accountQuote != null -> generator.writeObject(value.accountQuote)
                    value.realtimeFundingQuote != null ->
                        generator.writeObject(value.realtimeFundingQuote)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Source")
                }
            }
        }

        /** Source account details */
        class AccountQuoteSource
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val sourceType: JsonValue,
            private val customerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountId")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sourceType")
                @ExcludeMissing
                sourceType: JsonValue = JsonMissing.of(),
                @JsonProperty("customerId")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
            ) : this(accountId, sourceType, customerId, mutableMapOf())

            /**
             * Source account identifier
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
            @JsonProperty("sourceType") @ExcludeMissing fun _sourceType(): JsonValue = sourceType

            /**
             * Required when funding from an FBO account to identify the customer on whose behalf
             * the transaction is being initiated. Otherwise, will default to the customerId of the
             * account owner.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun customerId(): String? = customerId.getNullable("customerId")

            /**
             * Returns the raw JSON value of [accountId].
             *
             * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountId")
            @ExcludeMissing
            fun _accountId(): JsonField<String> = accountId

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customerId")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

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
                 * Returns a mutable builder for constructing an instance of [AccountQuoteSource].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AccountQuoteSource]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var sourceType: JsonValue = JsonValue.from("ACCOUNT")
                private var customerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountQuoteSource: AccountQuoteSource) = apply {
                    accountId = accountQuoteSource.accountId
                    sourceType = accountQuoteSource.sourceType
                    customerId = accountQuoteSource.customerId
                    additionalProperties = accountQuoteSource.additionalProperties.toMutableMap()
                }

                /** Source account identifier */
                fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                /**
                 * Sets [Builder.accountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                fun sourceType(sourceType: JsonValue) = apply { this.sourceType = sourceType }

                /**
                 * Required when funding from an FBO account to identify the customer on whose
                 * behalf the transaction is being initiated. Otherwise, will default to the
                 * customerId of the account owner.
                 */
                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
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
                 * Returns an immutable instance of [AccountQuoteSource].
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
                fun build(): AccountQuoteSource =
                    AccountQuoteSource(
                        checkRequired("accountId", accountId),
                        sourceType,
                        customerId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountQuoteSource = apply {
                if (validated) {
                    return@apply
                }

                accountId()
                _sourceType().let {
                    if (it != JsonValue.from("ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'sourceType' is invalid, received $it"
                        )
                    }
                }
                customerId()
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
                    sourceType.let { if (it == JsonValue.from("ACCOUNT")) 1 else 0 } +
                    (if (customerId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountQuoteSource &&
                    accountId == other.accountId &&
                    sourceType == other.sourceType &&
                    customerId == other.customerId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, sourceType, customerId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountQuoteSource{accountId=$accountId, sourceType=$sourceType, customerId=$customerId, additionalProperties=$additionalProperties}"
        }

        /**
         * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
         * etc.). This will require manual just-in-time funding using `paymentInstructions` in the
         * response. Because quotes expire quickly, this option is only valid for instant payment
         * methods. Do not try to fund a quote with a non-instant payment method (ACH, etc.).
         */
        class RealtimeFundingQuoteSource
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<String>,
            private val sourceType: JsonValue,
            private val customerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sourceType")
                @ExcludeMissing
                sourceType: JsonValue = JsonMissing.of(),
                @JsonProperty("customerId")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
            ) : this(currency, sourceType, customerId, mutableMapOf())

            /**
             * Currency code for the funding source. See
             * [Supported Currencies](https://grid.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
             * for the full list of supported fiat and crypto currencies.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("REALTIME_FUNDING")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("sourceType") @ExcludeMissing fun _sourceType(): JsonValue = sourceType

            /**
             * Source customer ID. If this transaction is being initiated on behalf of a customer,
             * this is required. If customerId is not provided, the quote will be created on behalf
             * of the platform itself.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun customerId(): String? = customerId.getNullable("customerId")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customerId")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

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
                 * [RealtimeFundingQuoteSource].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [RealtimeFundingQuoteSource]. */
            class Builder internal constructor() {

                private var currency: JsonField<String>? = null
                private var sourceType: JsonValue = JsonValue.from("REALTIME_FUNDING")
                private var customerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(realtimeFundingQuoteSource: RealtimeFundingQuoteSource) = apply {
                    currency = realtimeFundingQuoteSource.currency
                    sourceType = realtimeFundingQuoteSource.sourceType
                    customerId = realtimeFundingQuoteSource.customerId
                    additionalProperties =
                        realtimeFundingQuoteSource.additionalProperties.toMutableMap()
                }

                /**
                 * Currency code for the funding source. See
                 * [Supported Currencies](https://grid.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
                 * for the full list of supported fiat and crypto currencies.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("REALTIME_FUNDING")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sourceType(sourceType: JsonValue) = apply { this.sourceType = sourceType }

                /**
                 * Source customer ID. If this transaction is being initiated on behalf of a
                 * customer, this is required. If customerId is not provided, the quote will be
                 * created on behalf of the platform itself.
                 */
                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
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
                 * Returns an immutable instance of [RealtimeFundingQuoteSource].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RealtimeFundingQuoteSource =
                    RealtimeFundingQuoteSource(
                        checkRequired("currency", currency),
                        sourceType,
                        customerId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RealtimeFundingQuoteSource = apply {
                if (validated) {
                    return@apply
                }

                currency()
                _sourceType().let {
                    if (it != JsonValue.from("REALTIME_FUNDING")) {
                        throw LightsparkGridInvalidDataException(
                            "'sourceType' is invalid, received $it"
                        )
                    }
                }
                customerId()
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
                    sourceType.let { if (it == JsonValue.from("REALTIME_FUNDING")) 1 else 0 } +
                    (if (customerId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RealtimeFundingQuoteSource &&
                    currency == other.currency &&
                    sourceType == other.sourceType &&
                    customerId == other.customerId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(currency, sourceType, customerId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RealtimeFundingQuoteSource{currency=$currency, sourceType=$sourceType, customerId=$customerId, additionalProperties=$additionalProperties}"
        }
    }

    /** Current status of the quote */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PENDING = of("PENDING")

            val PROCESSING = of("PROCESSING")

            val COMPLETED = of("COMPLETED")

            val FAILED = of("FAILED")

            val EXPIRED = of("EXPIRED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            PROCESSING,
            COMPLETED,
            FAILED,
            EXPIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            PROCESSING,
            COMPLETED,
            FAILED,
            EXPIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                EXPIRED -> Value.EXPIRED
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
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                EXPIRED -> Known.EXPIRED
                else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Quote &&
            createdAt == other.createdAt &&
            destination == other.destination &&
            exchangeRate == other.exchangeRate &&
            expiresAt == other.expiresAt &&
            feesIncluded == other.feesIncluded &&
            quoteId == other.quoteId &&
            receivingCurrency == other.receivingCurrency &&
            sendingCurrency == other.sendingCurrency &&
            source == other.source &&
            status == other.status &&
            totalReceivingAmount == other.totalReceivingAmount &&
            totalSendingAmount == other.totalSendingAmount &&
            transactionId == other.transactionId &&
            paymentInstructions == other.paymentInstructions &&
            rateDetails == other.rateDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            destination,
            exchangeRate,
            expiresAt,
            feesIncluded,
            quoteId,
            receivingCurrency,
            sendingCurrency,
            source,
            status,
            totalReceivingAmount,
            totalSendingAmount,
            transactionId,
            paymentInstructions,
            rateDetails,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Quote{createdAt=$createdAt, destination=$destination, exchangeRate=$exchangeRate, expiresAt=$expiresAt, feesIncluded=$feesIncluded, quoteId=$quoteId, receivingCurrency=$receivingCurrency, sendingCurrency=$sendingCurrency, source=$source, status=$status, totalReceivingAmount=$totalReceivingAmount, totalSendingAmount=$totalSendingAmount, transactionId=$transactionId, paymentInstructions=$paymentInstructions, rateDetails=$rateDetails, additionalProperties=$additionalProperties}"
}
