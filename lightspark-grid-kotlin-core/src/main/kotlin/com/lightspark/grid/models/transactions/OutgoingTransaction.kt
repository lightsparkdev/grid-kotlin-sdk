// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

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
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class OutgoingTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val destination: JsonField<Destination>,
    private val platformCustomerId: JsonField<String>,
    private val sentAmount: JsonField<CurrencyAmount>,
    private val source: JsonField<TransactionSourceOneOf>,
    private val status: JsonField<OutgoingTransactionStatus>,
    private val type: JsonField<Type>,
    private val counterpartyInformation: JsonField<CounterpartyInformation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val exchangeRate: JsonField<Double>,
    private val failureReason: JsonField<FailureReason>,
    private val fees: JsonField<Long>,
    private val paymentInstructions: JsonField<List<PaymentInstructions>>,
    private val quoteId: JsonField<String>,
    private val rateDetails: JsonField<OutgoingRateDetails>,
    private val receivedAmount: JsonField<CurrencyAmount>,
    private val refund: JsonField<Refund>,
    private val settledAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<Destination> = JsonMissing.of(),
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        platformCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sentAmount")
        @ExcludeMissing
        sentAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<TransactionSourceOneOf> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<OutgoingTransactionStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("counterpartyInformation")
        @ExcludeMissing
        counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exchangeRate")
        @ExcludeMissing
        exchangeRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<FailureReason> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("paymentInstructions")
        @ExcludeMissing
        paymentInstructions: JsonField<List<PaymentInstructions>> = JsonMissing.of(),
        @JsonProperty("quoteId") @ExcludeMissing quoteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rateDetails")
        @ExcludeMissing
        rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of(),
        @JsonProperty("receivedAmount")
        @ExcludeMissing
        receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("refund") @ExcludeMissing refund: JsonField<Refund> = JsonMissing.of(),
        @JsonProperty("settledAt")
        @ExcludeMissing
        settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        customerId,
        destination,
        platformCustomerId,
        sentAmount,
        source,
        status,
        type,
        counterpartyInformation,
        createdAt,
        description,
        exchangeRate,
        failureReason,
        fees,
        paymentInstructions,
        quoteId,
        rateDetails,
        receivedAmount,
        refund,
        settledAt,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the transaction
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * System ID of the customer (sender for outgoing, recipient for incoming)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * Destination account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): Destination = destination.getRequired("destination")

    /**
     * Platform-specific ID of the customer (sender for outgoing, recipient for incoming)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

    /**
     * Amount sent in the sender's currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sentAmount(): CurrencyAmount = sentAmount.getRequired("sentAmount")

    /**
     * Source account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): TransactionSourceOneOf = source.getRequired("source")

    /**
     * Status of an outgoing payment transaction.
     *
     * | Status       | Description                                             |
     * |--------------|---------------------------------------------------------|
     * | `PENDING`    | Quote is pending confirmation                           |
     * | `EXPIRED`    | Quote wasn't executed before expiry window              |
     * | `PROCESSING` | Executing the quote after receiving funds               |
     * | `COMPLETED`  | Payout successfully reached the destination             |
     * | `FAILED`     | Something went wrong — accompanied by a `failureReason` |
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): OutgoingTransactionStatus = status.getRequired("status")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Additional information about the counterparty, if available and relevant to the transaction
     * and platform. Only applicable for transactions to/from UMA addresses.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyInformation(): CounterpartyInformation? =
        counterpartyInformation.getNullable("counterpartyInformation")

    /**
     * When the transaction was created
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

    /**
     * Optional memo or description for the payment
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Number of sending currency units per receiving currency unit.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun exchangeRate(): Double? = exchangeRate.getNullable("exchangeRate")

    /**
     * If the transaction failed, this field provides the reason for failure.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun failureReason(): FailureReason? = failureReason.getNullable("failureReason")

    /**
     * The fees associated with the quote in the smallest unit of the sending currency (eg. cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fees(): Long? = fees.getNullable("fees")

    /**
     * Payment instructions for executing the payment.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentInstructions(): List<PaymentInstructions>? =
        paymentInstructions.getNullable("paymentInstructions")

    /**
     * The ID of the quote that was used to trigger this payment
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun quoteId(): String? = quoteId.getNullable("quoteId")

    /**
     * Details about the rate and fees for the transaction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rateDetails(): OutgoingRateDetails? = rateDetails.getNullable("rateDetails")

    /**
     * Amount to be received by recipient in the recipient's currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivedAmount(): CurrencyAmount? = receivedAmount.getNullable("receivedAmount")

    /**
     * The refund if transaction was refunded.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun refund(): Refund? = refund.getNullable("refund")

    /**
     * When the payment was or will be settled
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

    /**
     * When the transaction was last updated
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<Destination> = destination

    /**
     * Returns the raw JSON value of [platformCustomerId].
     *
     * Unlike [platformCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platformCustomerId")
    @ExcludeMissing
    fun _platformCustomerId(): JsonField<String> = platformCustomerId

    /**
     * Returns the raw JSON value of [sentAmount].
     *
     * Unlike [sentAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sentAmount")
    @ExcludeMissing
    fun _sentAmount(): JsonField<CurrencyAmount> = sentAmount

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<TransactionSourceOneOf> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<OutgoingTransactionStatus> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [counterpartyInformation].
     *
     * Unlike [counterpartyInformation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("counterpartyInformation")
    @ExcludeMissing
    fun _counterpartyInformation(): JsonField<CounterpartyInformation> = counterpartyInformation

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [exchangeRate].
     *
     * Unlike [exchangeRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchangeRate")
    @ExcludeMissing
    fun _exchangeRate(): JsonField<Double> = exchangeRate

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReason")
    @ExcludeMissing
    fun _failureReason(): JsonField<FailureReason> = failureReason

    /**
     * Returns the raw JSON value of [fees].
     *
     * Unlike [fees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

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
     * Returns the raw JSON value of [quoteId].
     *
     * Unlike [quoteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quoteId") @ExcludeMissing fun _quoteId(): JsonField<String> = quoteId

    /**
     * Returns the raw JSON value of [rateDetails].
     *
     * Unlike [rateDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rateDetails")
    @ExcludeMissing
    fun _rateDetails(): JsonField<OutgoingRateDetails> = rateDetails

    /**
     * Returns the raw JSON value of [receivedAmount].
     *
     * Unlike [receivedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivedAmount")
    @ExcludeMissing
    fun _receivedAmount(): JsonField<CurrencyAmount> = receivedAmount

    /**
     * Returns the raw JSON value of [refund].
     *
     * Unlike [refund], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund") @ExcludeMissing fun _refund(): JsonField<Refund> = refund

    /**
     * Returns the raw JSON value of [settledAt].
     *
     * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settledAt")
    @ExcludeMissing
    fun _settledAt(): JsonField<OffsetDateTime> = settledAt

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
         * Returns a mutable builder for constructing an instance of [OutgoingTransaction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .customerId()
         * .destination()
         * .platformCustomerId()
         * .sentAmount()
         * .source()
         * .status()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OutgoingTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var destination: JsonField<Destination>? = null
        private var platformCustomerId: JsonField<String>? = null
        private var sentAmount: JsonField<CurrencyAmount>? = null
        private var source: JsonField<TransactionSourceOneOf>? = null
        private var status: JsonField<OutgoingTransactionStatus>? = null
        private var type: JsonField<Type>? = null
        private var counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var exchangeRate: JsonField<Double> = JsonMissing.of()
        private var failureReason: JsonField<FailureReason> = JsonMissing.of()
        private var fees: JsonField<Long> = JsonMissing.of()
        private var paymentInstructions: JsonField<MutableList<PaymentInstructions>>? = null
        private var quoteId: JsonField<String> = JsonMissing.of()
        private var rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of()
        private var receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of()
        private var refund: JsonField<Refund> = JsonMissing.of()
        private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(outgoingTransaction: OutgoingTransaction) = apply {
            id = outgoingTransaction.id
            customerId = outgoingTransaction.customerId
            destination = outgoingTransaction.destination
            platformCustomerId = outgoingTransaction.platformCustomerId
            sentAmount = outgoingTransaction.sentAmount
            source = outgoingTransaction.source
            status = outgoingTransaction.status
            type = outgoingTransaction.type
            counterpartyInformation = outgoingTransaction.counterpartyInformation
            createdAt = outgoingTransaction.createdAt
            description = outgoingTransaction.description
            exchangeRate = outgoingTransaction.exchangeRate
            failureReason = outgoingTransaction.failureReason
            fees = outgoingTransaction.fees
            paymentInstructions = outgoingTransaction.paymentInstructions.map { it.toMutableList() }
            quoteId = outgoingTransaction.quoteId
            rateDetails = outgoingTransaction.rateDetails
            receivedAmount = outgoingTransaction.receivedAmount
            refund = outgoingTransaction.refund
            settledAt = outgoingTransaction.settledAt
            updatedAt = outgoingTransaction.updatedAt
            additionalProperties = outgoingTransaction.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the transaction */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** System ID of the customer (sender for outgoing, recipient for incoming) */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** Destination account details */
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

        /**
         * Alias for calling [destination] with
         * `Destination.ofAccountTransaction(accountTransaction)`.
         */
        fun destination(accountTransaction: Destination.AccountTransactionDestination) =
            destination(Destination.ofAccountTransaction(accountTransaction))

        /**
         * Alias for calling [destination] with
         * `Destination.ofUmaAddressTransaction(umaAddressTransaction)`.
         */
        fun destination(umaAddressTransaction: Destination.UmaAddressTransactionDestination) =
            destination(Destination.ofUmaAddressTransaction(umaAddressTransaction))

        /**
         * Alias for calling [destination] with
         * `Destination.ofExternalAccountDetailsTransaction(externalAccountDetailsTransaction)`.
         */
        fun destination(
            externalAccountDetailsTransaction:
                Destination.ExternalAccountDetailsTransactionDestination
        ) =
            destination(
                Destination.ofExternalAccountDetailsTransaction(externalAccountDetailsTransaction)
            )

        /** Platform-specific ID of the customer (sender for outgoing, recipient for incoming) */
        fun platformCustomerId(platformCustomerId: String) =
            platformCustomerId(JsonField.of(platformCustomerId))

        /**
         * Sets [Builder.platformCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformCustomerId(platformCustomerId: JsonField<String>) = apply {
            this.platformCustomerId = platformCustomerId
        }

        /** Amount sent in the sender's currency */
        fun sentAmount(sentAmount: CurrencyAmount) = sentAmount(JsonField.of(sentAmount))

        /**
         * Sets [Builder.sentAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentAmount] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sentAmount(sentAmount: JsonField<CurrencyAmount>) = apply {
            this.sentAmount = sentAmount
        }

        /** Source account details */
        fun source(source: TransactionSourceOneOf) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [TransactionSourceOneOf] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<TransactionSourceOneOf>) = apply { this.source = source }

        /**
         * Alias for calling [source] with
         * `TransactionSourceOneOf.ofAccountTransactionSource(accountTransactionSource)`.
         */
        fun source(accountTransactionSource: TransactionSourceOneOf.AccountTransactionSource) =
            source(TransactionSourceOneOf.ofAccountTransactionSource(accountTransactionSource))

        /**
         * Alias for calling [source] with
         * `TransactionSourceOneOf.ofUmaAddressTransactionSource(umaAddressTransactionSource)`.
         */
        fun source(
            umaAddressTransactionSource: TransactionSourceOneOf.UmaAddressTransactionSource
        ) =
            source(
                TransactionSourceOneOf.ofUmaAddressTransactionSource(umaAddressTransactionSource)
            )

        /**
         * Alias for calling [source] with
         * `TransactionSourceOneOf.ofRealtimeFundingTransactionSource(realtimeFundingTransactionSource)`.
         */
        fun source(
            realtimeFundingTransactionSource:
                TransactionSourceOneOf.RealtimeFundingTransactionSource
        ) =
            source(
                TransactionSourceOneOf.ofRealtimeFundingTransactionSource(
                    realtimeFundingTransactionSource
                )
            )

        /**
         * Status of an outgoing payment transaction.
         *
         * | Status       | Description                                             |
         * |--------------|---------------------------------------------------------|
         * | `PENDING`    | Quote is pending confirmation                           |
         * | `EXPIRED`    | Quote wasn't executed before expiry window              |
         * | `PROCESSING` | Executing the quote after receiving funds               |
         * | `COMPLETED`  | Payout successfully reached the destination             |
         * | `FAILED`     | Something went wrong — accompanied by a `failureReason` |
         */
        fun status(status: OutgoingTransactionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [OutgoingTransactionStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<OutgoingTransactionStatus>) = apply { this.status = status }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Additional information about the counterparty, if available and relevant to the
         * transaction and platform. Only applicable for transactions to/from UMA addresses.
         */
        fun counterpartyInformation(counterpartyInformation: CounterpartyInformation) =
            counterpartyInformation(JsonField.of(counterpartyInformation))

        /**
         * Sets [Builder.counterpartyInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyInformation] with a well-typed
         * [CounterpartyInformation] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun counterpartyInformation(counterpartyInformation: JsonField<CounterpartyInformation>) =
            apply {
                this.counterpartyInformation = counterpartyInformation
            }

        /** When the transaction was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Optional memo or description for the payment */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /** If the transaction failed, this field provides the reason for failure. */
        fun failureReason(failureReason: FailureReason) = failureReason(JsonField.of(failureReason))

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [FailureReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failureReason(failureReason: JsonField<FailureReason>) = apply {
            this.failureReason = failureReason
        }

        /**
         * The fees associated with the quote in the smallest unit of the sending currency (eg.
         * cents).
         */
        fun fees(fees: Long) = fees(JsonField.of(fees))

        /**
         * Sets [Builder.fees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fees] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

        /** Payment instructions for executing the payment. */
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

        /** The ID of the quote that was used to trigger this payment */
        fun quoteId(quoteId: String) = quoteId(JsonField.of(quoteId))

        /**
         * Sets [Builder.quoteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

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

        /** Amount to be received by recipient in the recipient's currency */
        fun receivedAmount(receivedAmount: CurrencyAmount) =
            receivedAmount(JsonField.of(receivedAmount))

        /**
         * Sets [Builder.receivedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivedAmount] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivedAmount(receivedAmount: JsonField<CurrencyAmount>) = apply {
            this.receivedAmount = receivedAmount
        }

        /** The refund if transaction was refunded. */
        fun refund(refund: Refund) = refund(JsonField.of(refund))

        /**
         * Sets [Builder.refund] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refund] with a well-typed [Refund] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refund(refund: JsonField<Refund>) = apply { this.refund = refund }

        /** When the payment was or will be settled */
        fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

        /**
         * Sets [Builder.settledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply { this.settledAt = settledAt }

        /** When the transaction was last updated */
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
         * Returns an immutable instance of [OutgoingTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .customerId()
         * .destination()
         * .platformCustomerId()
         * .sentAmount()
         * .source()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OutgoingTransaction =
            OutgoingTransaction(
                checkRequired("id", id),
                checkRequired("customerId", customerId),
                checkRequired("destination", destination),
                checkRequired("platformCustomerId", platformCustomerId),
                checkRequired("sentAmount", sentAmount),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("type", type),
                counterpartyInformation,
                createdAt,
                description,
                exchangeRate,
                failureReason,
                fees,
                (paymentInstructions ?: JsonMissing.of()).map { it.toImmutable() },
                quoteId,
                rateDetails,
                receivedAmount,
                refund,
                settledAt,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OutgoingTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        customerId()
        destination().validate()
        platformCustomerId()
        sentAmount().validate()
        source().validate()
        status().validate()
        type().validate()
        counterpartyInformation()?.validate()
        createdAt()
        description()
        exchangeRate()
        failureReason()?.validate()
        fees()
        paymentInstructions()?.forEach { it.validate() }
        quoteId()
        rateDetails()?.validate()
        receivedAmount()?.validate()
        refund()?.validate()
        settledAt()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (destination.asKnown()?.validity() ?: 0) +
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
            (sentAmount.asKnown()?.validity() ?: 0) +
            (source.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (counterpartyInformation.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (exchangeRate.asKnown() == null) 0 else 1) +
            (failureReason.asKnown()?.validity() ?: 0) +
            (if (fees.asKnown() == null) 0 else 1) +
            (paymentInstructions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (quoteId.asKnown() == null) 0 else 1) +
            (rateDetails.asKnown()?.validity() ?: 0) +
            (receivedAmount.asKnown()?.validity() ?: 0) +
            (refund.asKnown()?.validity() ?: 0) +
            (if (settledAt.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** Destination account details */
    @JsonDeserialize(using = Destination.Deserializer::class)
    @JsonSerialize(using = Destination.Serializer::class)
    class Destination
    private constructor(
        private val accountTransaction: AccountTransactionDestination? = null,
        private val umaAddressTransaction: UmaAddressTransactionDestination? = null,
        private val externalAccountDetailsTransaction:
            ExternalAccountDetailsTransactionDestination? =
            null,
        private val _json: JsonValue? = null,
    ) {

        /** Destination account details */
        fun accountTransaction(): AccountTransactionDestination? = accountTransaction

        /** UMA address destination details */
        fun umaAddressTransaction(): UmaAddressTransactionDestination? = umaAddressTransaction

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        fun externalAccountDetailsTransaction(): ExternalAccountDetailsTransactionDestination? =
            externalAccountDetailsTransaction

        fun isAccountTransaction(): Boolean = accountTransaction != null

        fun isUmaAddressTransaction(): Boolean = umaAddressTransaction != null

        fun isExternalAccountDetailsTransaction(): Boolean =
            externalAccountDetailsTransaction != null

        /** Destination account details */
        fun asAccountTransaction(): AccountTransactionDestination =
            accountTransaction.getOrThrow("accountTransaction")

        /** UMA address destination details */
        fun asUmaAddressTransaction(): UmaAddressTransactionDestination =
            umaAddressTransaction.getOrThrow("umaAddressTransaction")

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        fun asExternalAccountDetailsTransaction(): ExternalAccountDetailsTransactionDestination =
            externalAccountDetailsTransaction.getOrThrow("externalAccountDetailsTransaction")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                accountTransaction != null -> visitor.visitAccountTransaction(accountTransaction)
                umaAddressTransaction != null ->
                    visitor.visitUmaAddressTransaction(umaAddressTransaction)
                externalAccountDetailsTransaction != null ->
                    visitor.visitExternalAccountDetailsTransaction(
                        externalAccountDetailsTransaction
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Destination = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAccountTransaction(
                        accountTransaction: AccountTransactionDestination
                    ) {
                        accountTransaction.validate()
                    }

                    override fun visitUmaAddressTransaction(
                        umaAddressTransaction: UmaAddressTransactionDestination
                    ) {
                        umaAddressTransaction.validate()
                    }

                    override fun visitExternalAccountDetailsTransaction(
                        externalAccountDetailsTransaction:
                            ExternalAccountDetailsTransactionDestination
                    ) {
                        externalAccountDetailsTransaction.validate()
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
                    override fun visitAccountTransaction(
                        accountTransaction: AccountTransactionDestination
                    ) = accountTransaction.validity()

                    override fun visitUmaAddressTransaction(
                        umaAddressTransaction: UmaAddressTransactionDestination
                    ) = umaAddressTransaction.validity()

                    override fun visitExternalAccountDetailsTransaction(
                        externalAccountDetailsTransaction:
                            ExternalAccountDetailsTransactionDestination
                    ) = externalAccountDetailsTransaction.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Destination &&
                accountTransaction == other.accountTransaction &&
                umaAddressTransaction == other.umaAddressTransaction &&
                externalAccountDetailsTransaction == other.externalAccountDetailsTransaction
        }

        override fun hashCode(): Int =
            Objects.hash(
                accountTransaction,
                umaAddressTransaction,
                externalAccountDetailsTransaction,
            )

        override fun toString(): String =
            when {
                accountTransaction != null -> "Destination{accountTransaction=$accountTransaction}"
                umaAddressTransaction != null ->
                    "Destination{umaAddressTransaction=$umaAddressTransaction}"
                externalAccountDetailsTransaction != null ->
                    "Destination{externalAccountDetailsTransaction=$externalAccountDetailsTransaction}"
                _json != null -> "Destination{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Destination")
            }

        companion object {

            /** Destination account details */
            fun ofAccountTransaction(accountTransaction: AccountTransactionDestination) =
                Destination(accountTransaction = accountTransaction)

            /** UMA address destination details */
            fun ofUmaAddressTransaction(umaAddressTransaction: UmaAddressTransactionDestination) =
                Destination(umaAddressTransaction = umaAddressTransaction)

            /**
             * Transaction destination where external account details were provided inline at quote
             * creation rather than using a pre-registered external account.
             */
            fun ofExternalAccountDetailsTransaction(
                externalAccountDetailsTransaction: ExternalAccountDetailsTransactionDestination
            ) = Destination(externalAccountDetailsTransaction = externalAccountDetailsTransaction)
        }

        /**
         * An interface that defines how to map each variant of [Destination] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** Destination account details */
            fun visitAccountTransaction(accountTransaction: AccountTransactionDestination): T

            /** UMA address destination details */
            fun visitUmaAddressTransaction(
                umaAddressTransaction: UmaAddressTransactionDestination
            ): T

            /**
             * Transaction destination where external account details were provided inline at quote
             * creation rather than using a pre-registered external account.
             */
            fun visitExternalAccountDetailsTransaction(
                externalAccountDetailsTransaction: ExternalAccountDetailsTransactionDestination
            ): T

            /**
             * Maps an unknown variant of [Destination] to a value of type [T].
             *
             * An instance of [Destination] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Destination: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Destination>(Destination::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Destination {
                val json = JsonValue.fromJsonNode(node)
                val destinationType = json.asObject()?.get("destinationType")?.asString()

                when (destinationType) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AccountTransactionDestination>())
                                ?.let { Destination(accountTransaction = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<UmaAddressTransactionDestination>())
                                ?.let { Destination(umaAddressTransaction = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ExternalAccountDetailsTransactionDestination>(),
                                )
                                ?.let {
                                    Destination(
                                        externalAccountDetailsTransaction = it,
                                        _json = json,
                                    )
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Destination(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Destination>(Destination::class) {

            override fun serialize(
                value: Destination,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.accountTransaction != null ->
                        generator.writeObject(value.accountTransaction)
                    value.umaAddressTransaction != null ->
                        generator.writeObject(value.umaAddressTransaction)
                    value.externalAccountDetailsTransaction != null ->
                        generator.writeObject(value.externalAccountDetailsTransaction)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Destination")
                }
            }
        }

        /** Destination account details */
        class AccountTransactionDestination
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val destinationType: JsonValue,
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
            ) : this(accountId, destinationType, mutableMapOf())

            /**
             * Destination account identifier
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
            @JsonProperty("destinationType")
            @ExcludeMissing
            fun _destinationType(): JsonValue = destinationType

            /**
             * Returns the raw JSON value of [accountId].
             *
             * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountId")
            @ExcludeMissing
            fun _accountId(): JsonField<String> = accountId

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
                 * [AccountTransactionDestination].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AccountTransactionDestination]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var destinationType: JsonValue = JsonValue.from("ACCOUNT")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountTransactionDestination: AccountTransactionDestination) =
                    apply {
                        accountId = accountTransactionDestination.accountId
                        destinationType = accountTransactionDestination.destinationType
                        additionalProperties =
                            accountTransactionDestination.additionalProperties.toMutableMap()
                    }

                /** Destination account identifier */
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
                fun destinationType(destinationType: JsonValue) = apply {
                    this.destinationType = destinationType
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
                 * Returns an immutable instance of [AccountTransactionDestination].
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
                fun build(): AccountTransactionDestination =
                    AccountTransactionDestination(
                        checkRequired("accountId", accountId),
                        destinationType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountTransactionDestination = apply {
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
                    destinationType.let { if (it == JsonValue.from("ACCOUNT")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountTransactionDestination &&
                    accountId == other.accountId &&
                    destinationType == other.destinationType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, destinationType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountTransactionDestination{accountId=$accountId, destinationType=$destinationType, additionalProperties=$additionalProperties}"
        }

        /** UMA address destination details */
        class UmaAddressTransactionDestination
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destinationType: JsonValue,
            private val umaAddress: JsonField<String>,
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
            ) : this(destinationType, umaAddress, mutableMapOf())

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
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun umaAddress(): String = umaAddress.getRequired("umaAddress")

            /**
             * Returns the raw JSON value of [umaAddress].
             *
             * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [UmaAddressTransactionDestination].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .umaAddress()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UmaAddressTransactionDestination]. */
            class Builder internal constructor() {

                private var destinationType: JsonValue = JsonValue.from("UMA_ADDRESS")
                private var umaAddress: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    umaAddressTransactionDestination: UmaAddressTransactionDestination
                ) = apply {
                    destinationType = umaAddressTransactionDestination.destinationType
                    umaAddress = umaAddressTransactionDestination.umaAddress
                    additionalProperties =
                        umaAddressTransactionDestination.additionalProperties.toMutableMap()
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun umaAddress(umaAddress: JsonField<String>) = apply {
                    this.umaAddress = umaAddress
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
                 * Returns an immutable instance of [UmaAddressTransactionDestination].
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
                fun build(): UmaAddressTransactionDestination =
                    UmaAddressTransactionDestination(
                        destinationType,
                        checkRequired("umaAddress", umaAddress),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UmaAddressTransactionDestination = apply {
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
                    (if (umaAddress.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UmaAddressTransactionDestination &&
                    destinationType == other.destinationType &&
                    umaAddress == other.umaAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(destinationType, umaAddress, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UmaAddressTransactionDestination{destinationType=$destinationType, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
        }

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        class ExternalAccountDetailsTransactionDestination
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destinationType: JsonValue,
            private val externalAccountDetails: JsonField<ExternalAccountCreate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("destinationType")
                @ExcludeMissing
                destinationType: JsonValue = JsonMissing.of(),
                @JsonProperty("externalAccountDetails")
                @ExcludeMissing
                externalAccountDetails: JsonField<ExternalAccountCreate> = JsonMissing.of(),
            ) : this(destinationType, externalAccountDetails, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("EXTERNAL_ACCOUNT_DETAILS")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("destinationType")
            @ExcludeMissing
            fun _destinationType(): JsonValue = destinationType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalAccountDetails(): ExternalAccountCreate =
                externalAccountDetails.getRequired("externalAccountDetails")

            /**
             * Returns the raw JSON value of [externalAccountDetails].
             *
             * Unlike [externalAccountDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("externalAccountDetails")
            @ExcludeMissing
            fun _externalAccountDetails(): JsonField<ExternalAccountCreate> = externalAccountDetails

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
                 * [ExternalAccountDetailsTransactionDestination].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .externalAccountDetails()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExternalAccountDetailsTransactionDestination]. */
            class Builder internal constructor() {

                private var destinationType: JsonValue = JsonValue.from("EXTERNAL_ACCOUNT_DETAILS")
                private var externalAccountDetails: JsonField<ExternalAccountCreate>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    externalAccountDetailsTransactionDestination:
                        ExternalAccountDetailsTransactionDestination
                ) = apply {
                    destinationType = externalAccountDetailsTransactionDestination.destinationType
                    externalAccountDetails =
                        externalAccountDetailsTransactionDestination.externalAccountDetails
                    additionalProperties =
                        externalAccountDetailsTransactionDestination.additionalProperties
                            .toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("EXTERNAL_ACCOUNT_DETAILS")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun destinationType(destinationType: JsonValue) = apply {
                    this.destinationType = destinationType
                }

                fun externalAccountDetails(externalAccountDetails: ExternalAccountCreate) =
                    externalAccountDetails(JsonField.of(externalAccountDetails))

                /**
                 * Sets [Builder.externalAccountDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalAccountDetails] with a well-typed
                 * [ExternalAccountCreate] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun externalAccountDetails(
                    externalAccountDetails: JsonField<ExternalAccountCreate>
                ) = apply { this.externalAccountDetails = externalAccountDetails }

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
                 * Returns an immutable instance of [ExternalAccountDetailsTransactionDestination].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .externalAccountDetails()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExternalAccountDetailsTransactionDestination =
                    ExternalAccountDetailsTransactionDestination(
                        destinationType,
                        checkRequired("externalAccountDetails", externalAccountDetails),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExternalAccountDetailsTransactionDestination = apply {
                if (validated) {
                    return@apply
                }

                _destinationType().let {
                    if (it != JsonValue.from("EXTERNAL_ACCOUNT_DETAILS")) {
                        throw LightsparkGridInvalidDataException(
                            "'destinationType' is invalid, received $it"
                        )
                    }
                }
                externalAccountDetails().validate()
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
                destinationType.let {
                    if (it == JsonValue.from("EXTERNAL_ACCOUNT_DETAILS")) 1 else 0
                } + (externalAccountDetails.asKnown()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternalAccountDetailsTransactionDestination &&
                    destinationType == other.destinationType &&
                    externalAccountDetails == other.externalAccountDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(destinationType, externalAccountDetails, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExternalAccountDetailsTransactionDestination{destinationType=$destinationType, externalAccountDetails=$externalAccountDetails, additionalProperties=$additionalProperties}"
        }
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val OUTGOING = of("OUTGOING")

            val INCOMING = of("INCOMING")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OUTGOING,
            INCOMING,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OUTGOING,
            INCOMING,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                OUTGOING -> Value.OUTGOING
                INCOMING -> Value.INCOMING
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
                OUTGOING -> Known.OUTGOING
                INCOMING -> Known.INCOMING
                else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Additional information about the counterparty, if available and relevant to the transaction
     * and platform. Only applicable for transactions to/from UMA addresses.
     */
    class CounterpartyInformation
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CounterpartyInformation].
             */
            fun builder() = Builder()
        }

        /** A builder for [CounterpartyInformation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyInformation: CounterpartyInformation) = apply {
                additionalProperties = counterpartyInformation.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CounterpartyInformation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CounterpartyInformation =
                CounterpartyInformation(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CounterpartyInformation = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyInformation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyInformation{additionalProperties=$additionalProperties}"
    }

    /** If the transaction failed, this field provides the reason for failure. */
    class FailureReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val QUOTE_EXPIRED = of("QUOTE_EXPIRED")

            val QUOTE_EXECUTION_FAILED = of("QUOTE_EXECUTION_FAILED")

            val LIGHTNING_PAYMENT_FAILED = of("LIGHTNING_PAYMENT_FAILED")

            val FUNDING_AMOUNT_MISMATCH = of("FUNDING_AMOUNT_MISMATCH")

            val COUNTERPARTY_POST_TX_FAILED = of("COUNTERPARTY_POST_TX_FAILED")

            val TIMEOUT = of("TIMEOUT")

            fun of(value: String) = FailureReason(JsonField.of(value))
        }

        /** An enum containing [FailureReason]'s known values. */
        enum class Known {
            QUOTE_EXPIRED,
            QUOTE_EXECUTION_FAILED,
            LIGHTNING_PAYMENT_FAILED,
            FUNDING_AMOUNT_MISMATCH,
            COUNTERPARTY_POST_TX_FAILED,
            TIMEOUT,
        }

        /**
         * An enum containing [FailureReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FailureReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUOTE_EXPIRED,
            QUOTE_EXECUTION_FAILED,
            LIGHTNING_PAYMENT_FAILED,
            FUNDING_AMOUNT_MISMATCH,
            COUNTERPARTY_POST_TX_FAILED,
            TIMEOUT,
            /**
             * An enum member indicating that [FailureReason] was instantiated with an unknown
             * value.
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
                QUOTE_EXPIRED -> Value.QUOTE_EXPIRED
                QUOTE_EXECUTION_FAILED -> Value.QUOTE_EXECUTION_FAILED
                LIGHTNING_PAYMENT_FAILED -> Value.LIGHTNING_PAYMENT_FAILED
                FUNDING_AMOUNT_MISMATCH -> Value.FUNDING_AMOUNT_MISMATCH
                COUNTERPARTY_POST_TX_FAILED -> Value.COUNTERPARTY_POST_TX_FAILED
                TIMEOUT -> Value.TIMEOUT
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
                QUOTE_EXPIRED -> Known.QUOTE_EXPIRED
                QUOTE_EXECUTION_FAILED -> Known.QUOTE_EXECUTION_FAILED
                LIGHTNING_PAYMENT_FAILED -> Known.LIGHTNING_PAYMENT_FAILED
                FUNDING_AMOUNT_MISMATCH -> Known.FUNDING_AMOUNT_MISMATCH
                COUNTERPARTY_POST_TX_FAILED -> Known.COUNTERPARTY_POST_TX_FAILED
                TIMEOUT -> Known.TIMEOUT
                else -> throw LightsparkGridInvalidDataException("Unknown FailureReason: $value")
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

        fun validate(): FailureReason = apply {
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

            return other is FailureReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The refund if transaction was refunded. */
    class Refund
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val initiatedAt: JsonField<OffsetDateTime>,
        private val reference: JsonField<String>,
        private val status: JsonField<Status>,
        private val reason: JsonField<Reason>,
        private val settledAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("initiatedAt")
            @ExcludeMissing
            initiatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("settledAt")
            @ExcludeMissing
            settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(initiatedAt, reference, status, reason, settledAt, mutableMapOf())

        /**
         * When the refund was initiated
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun initiatedAt(): OffsetDateTime = initiatedAt.getRequired("initiatedAt")

        /**
         * The unique reference ID of the refund
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * Current status of the refund
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Reason for the refund
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reason(): Reason? = reason.getNullable("reason")

        /**
         * When the refund was settled
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

        /**
         * Returns the raw JSON value of [initiatedAt].
         *
         * Unlike [initiatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("initiatedAt")
        @ExcludeMissing
        fun _initiatedAt(): JsonField<OffsetDateTime> = initiatedAt

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [settledAt].
         *
         * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settledAt")
        @ExcludeMissing
        fun _settledAt(): JsonField<OffsetDateTime> = settledAt

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
             * Returns a mutable builder for constructing an instance of [Refund].
             *
             * The following fields are required:
             * ```kotlin
             * .initiatedAt()
             * .reference()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Refund]. */
        class Builder internal constructor() {

            private var initiatedAt: JsonField<OffsetDateTime>? = null
            private var reference: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(refund: Refund) = apply {
                initiatedAt = refund.initiatedAt
                reference = refund.reference
                status = refund.status
                reason = refund.reason
                settledAt = refund.settledAt
                additionalProperties = refund.additionalProperties.toMutableMap()
            }

            /** When the refund was initiated */
            fun initiatedAt(initiatedAt: OffsetDateTime) = initiatedAt(JsonField.of(initiatedAt))

            /**
             * Sets [Builder.initiatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initiatedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun initiatedAt(initiatedAt: JsonField<OffsetDateTime>) = apply {
                this.initiatedAt = initiatedAt
            }

            /** The unique reference ID of the refund */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** Current status of the refund */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reason for the refund */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** When the refund was settled */
            fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

            /**
             * Sets [Builder.settledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply {
                this.settledAt = settledAt
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
             * Returns an immutable instance of [Refund].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .initiatedAt()
             * .reference()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Refund =
                Refund(
                    checkRequired("initiatedAt", initiatedAt),
                    checkRequired("reference", reference),
                    checkRequired("status", status),
                    reason,
                    settledAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Refund = apply {
            if (validated) {
                return@apply
            }

            initiatedAt()
            reference()
            status().validate()
            reason()?.validate()
            settledAt()
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
            (if (initiatedAt.asKnown() == null) 0 else 1) +
                (if (reference.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (reason.asKnown()?.validity() ?: 0) +
                (if (settledAt.asKnown() == null) 0 else 1)

        /** Current status of the refund */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val PENDING = of("PENDING")

                val COMPLETED = of("COMPLETED")

                val FAILED = of("FAILED")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                COMPLETED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                COMPLETED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
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
                    PENDING -> Known.PENDING
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
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

        /** Reason for the refund */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val TRANSACTION_FAILED = of("TRANSACTION_FAILED")

                val USER_CANCELLATION = of("USER_CANCELLATION")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                TRANSACTION_FAILED,
                USER_CANCELLATION,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRANSACTION_FAILED,
                USER_CANCELLATION,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    TRANSACTION_FAILED -> Value.TRANSACTION_FAILED
                    USER_CANCELLATION -> Value.USER_CANCELLATION
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
                    TRANSACTION_FAILED -> Known.TRANSACTION_FAILED
                    USER_CANCELLATION -> Known.USER_CANCELLATION
                    else -> throw LightsparkGridInvalidDataException("Unknown Reason: $value")
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

            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Refund &&
                initiatedAt == other.initiatedAt &&
                reference == other.reference &&
                status == other.status &&
                reason == other.reason &&
                settledAt == other.settledAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(initiatedAt, reference, status, reason, settledAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Refund{initiatedAt=$initiatedAt, reference=$reference, status=$status, reason=$reason, settledAt=$settledAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutgoingTransaction &&
            id == other.id &&
            customerId == other.customerId &&
            destination == other.destination &&
            platformCustomerId == other.platformCustomerId &&
            sentAmount == other.sentAmount &&
            source == other.source &&
            status == other.status &&
            type == other.type &&
            counterpartyInformation == other.counterpartyInformation &&
            createdAt == other.createdAt &&
            description == other.description &&
            exchangeRate == other.exchangeRate &&
            failureReason == other.failureReason &&
            fees == other.fees &&
            paymentInstructions == other.paymentInstructions &&
            quoteId == other.quoteId &&
            rateDetails == other.rateDetails &&
            receivedAmount == other.receivedAmount &&
            refund == other.refund &&
            settledAt == other.settledAt &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            customerId,
            destination,
            platformCustomerId,
            sentAmount,
            source,
            status,
            type,
            counterpartyInformation,
            createdAt,
            description,
            exchangeRate,
            failureReason,
            fees,
            paymentInstructions,
            quoteId,
            rateDetails,
            receivedAmount,
            refund,
            settledAt,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutgoingTransaction{id=$id, customerId=$customerId, destination=$destination, platformCustomerId=$platformCustomerId, sentAmount=$sentAmount, source=$source, status=$status, type=$type, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, exchangeRate=$exchangeRate, failureReason=$failureReason, fees=$fees, paymentInstructions=$paymentInstructions, quoteId=$quoteId, rateDetails=$rateDetails, receivedAmount=$receivedAmount, refund=$refund, settledAt=$settledAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
