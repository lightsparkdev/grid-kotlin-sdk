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
import com.lightspark.grid.models.transferin.Transaction
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = TransactionListResponse.Deserializer::class)
@JsonSerialize(using = TransactionListResponse.Serializer::class)
class TransactionListResponse
private constructor(
    private val incomingTransaction: IncomingTransaction? = null,
    private val outgoingTransaction: OutgoingTransaction? = null,
    private val _json: JsonValue? = null,
) {

    fun incomingTransaction(): IncomingTransaction? = incomingTransaction

    fun outgoingTransaction(): OutgoingTransaction? = outgoingTransaction

    fun isIncomingTransaction(): Boolean = incomingTransaction != null

    fun isOutgoingTransaction(): Boolean = outgoingTransaction != null

    fun asIncomingTransaction(): IncomingTransaction =
        incomingTransaction.getOrThrow("incomingTransaction")

    fun asOutgoingTransaction(): OutgoingTransaction =
        outgoingTransaction.getOrThrow("outgoingTransaction")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            incomingTransaction != null -> visitor.visitIncomingTransaction(incomingTransaction)
            outgoingTransaction != null -> visitor.visitOutgoingTransaction(outgoingTransaction)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TransactionListResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncomingTransaction(incomingTransaction: IncomingTransaction) {
                    incomingTransaction.validate()
                }

                override fun visitOutgoingTransaction(outgoingTransaction: OutgoingTransaction) {
                    outgoingTransaction.validate()
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
                override fun visitIncomingTransaction(incomingTransaction: IncomingTransaction) =
                    incomingTransaction.validity()

                override fun visitOutgoingTransaction(outgoingTransaction: OutgoingTransaction) =
                    outgoingTransaction.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionListResponse &&
            incomingTransaction == other.incomingTransaction &&
            outgoingTransaction == other.outgoingTransaction
    }

    override fun hashCode(): Int = Objects.hash(incomingTransaction, outgoingTransaction)

    override fun toString(): String =
        when {
            incomingTransaction != null ->
                "TransactionListResponse{incomingTransaction=$incomingTransaction}"
            outgoingTransaction != null ->
                "TransactionListResponse{outgoingTransaction=$outgoingTransaction}"
            _json != null -> "TransactionListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TransactionListResponse")
        }

    companion object {

        fun ofIncomingTransaction(incomingTransaction: IncomingTransaction) =
            TransactionListResponse(incomingTransaction = incomingTransaction)

        fun ofOutgoingTransaction(outgoingTransaction: OutgoingTransaction) =
            TransactionListResponse(outgoingTransaction = outgoingTransaction)
    }

    /**
     * An interface that defines how to map each variant of [TransactionListResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitIncomingTransaction(incomingTransaction: IncomingTransaction): T

        fun visitOutgoingTransaction(outgoingTransaction: OutgoingTransaction): T

        /**
         * Maps an unknown variant of [TransactionListResponse] to a value of type [T].
         *
         * An instance of [TransactionListResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown TransactionListResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TransactionListResponse>(TransactionListResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TransactionListResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IncomingTransaction>())?.let {
                            TransactionListResponse(incomingTransaction = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OutgoingTransaction>())?.let {
                            TransactionListResponse(outgoingTransaction = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> TransactionListResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TransactionListResponse>(TransactionListResponse::class) {

        override fun serialize(
            value: TransactionListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.incomingTransaction != null ->
                    generator.writeObject(value.incomingTransaction)
                value.outgoingTransaction != null ->
                    generator.writeObject(value.outgoingTransaction)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TransactionListResponse")
            }
        }
    }

    class OutgoingTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val customerId: JsonField<String>,
        private val destination: JsonField<TransactionDestinationOneOf>,
        private val platformCustomerId: JsonField<String>,
        private val status: JsonField<TransactionStatus>,
        private val type: JsonField<TransactionType>,
        private val counterpartyInformation: JsonField<CounterpartyInformation>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val settledAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val sentAmount: JsonField<CurrencyAmount>,
        private val source: JsonField<TransactionSourceOneOf>,
        private val exchangeRate: JsonField<Double>,
        private val failureReason: JsonField<FailureReason>,
        private val fees: JsonField<Long>,
        private val paymentInstructions: JsonField<List<PaymentInstructions>>,
        private val quoteId: JsonField<String>,
        private val rateDetails: JsonField<OutgoingRateDetails>,
        private val receivedAmount: JsonField<CurrencyAmount>,
        private val refund: JsonField<Refund>,
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
            destination: JsonField<TransactionDestinationOneOf> = JsonMissing.of(),
            @JsonProperty("platformCustomerId")
            @ExcludeMissing
            platformCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<TransactionStatus> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<TransactionType> = JsonMissing.of(),
            @JsonProperty("counterpartyInformation")
            @ExcludeMissing
            counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("settledAt")
            @ExcludeMissing
            settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("sentAmount")
            @ExcludeMissing
            sentAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
            @JsonProperty("source")
            @ExcludeMissing
            source: JsonField<TransactionSourceOneOf> = JsonMissing.of(),
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
        ) : this(
            id,
            customerId,
            destination,
            platformCustomerId,
            status,
            type,
            counterpartyInformation,
            createdAt,
            description,
            settledAt,
            updatedAt,
            sentAmount,
            source,
            exchangeRate,
            failureReason,
            fees,
            paymentInstructions,
            quoteId,
            rateDetails,
            receivedAmount,
            refund,
            mutableMapOf(),
        )

        fun toTransaction(): Transaction =
            Transaction.builder()
                .id(id)
                .customerId(customerId)
                .destination(destination)
                .platformCustomerId(platformCustomerId)
                .status(status)
                .type(type)
                .counterpartyInformation(counterpartyInformation)
                .createdAt(createdAt)
                .description(description)
                .settledAt(settledAt)
                .updatedAt(updatedAt)
                .build()

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
        fun destination(): TransactionDestinationOneOf = destination.getRequired("destination")

        /**
         * Platform-specific ID of the customer (sender for outgoing, recipient for incoming)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

        /**
         * Status of a payment transaction.
         *
         * |Status      |Description                                                                                       |
         * |------------|--------------------------------------------------------------------------------------------------|
         * |`CREATED`   |Initial lookup has been created                                                                   |
         * |`PENDING`   |Quote has been created                                                                            |
         * |`PROCESSING`|Funding has been received and payment initiated                                                   |
         * |`SENT`      |Cross border settlement has been initiated                                                        |
         * |`COMPLETED` |Cross border payment has been received, converted and payment has been sent to the offramp network|
         * |`REJECTED`  |Receiving institution or wallet rejected payment, payment has been refunded                       |
         * |`FAILED`    |An error occurred during payment                                                                  |
         * |`REFUNDED`  |Payment was unable to complete and refunded                                                       |
         * |`EXPIRED`   |Quote has expired                                                                                 |
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): TransactionStatus = status.getRequired("status")

        /**
         * Type of transaction (incoming payment or outgoing payment)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): TransactionType = type.getRequired("type")

        /**
         * Additional information about the counterparty, if available and relevant to the
         * transaction and platform. Only applicable for transactions to/from UMA addresses.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyInformation(): CounterpartyInformation? =
            counterpartyInformation.getNullable("counterpartyInformation")

        /**
         * When the transaction was created
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

        /**
         * Optional memo or description for the payment
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * When the payment was or will be settled
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

        /**
         * When the transaction was last updated
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

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
         * Number of sending currency units per receiving currency unit.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun exchangeRate(): Double? = exchangeRate.getNullable("exchangeRate")

        /**
         * If the transaction failed, this field provides the reason for failure.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun failureReason(): FailureReason? = failureReason.getNullable("failureReason")

        /**
         * The fees associated with the quote in the smallest unit of the sending currency (eg.
         * cents).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fees(): Long? = fees.getNullable("fees")

        /**
         * Payment instructions for executing the payment.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentInstructions(): List<PaymentInstructions>? =
            paymentInstructions.getNullable("paymentInstructions")

        /**
         * The ID of the quote that was used to trigger this payment
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun quoteId(): String? = quoteId.getNullable("quoteId")

        /**
         * Details about the rate and fees for the transaction.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rateDetails(): OutgoingRateDetails? = rateDetails.getNullable("rateDetails")

        /**
         * Amount to be received by recipient in the recipient's currency
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun receivedAmount(): CurrencyAmount? = receivedAmount.getNullable("receivedAmount")

        /**
         * The refund if transaction was refunded.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun refund(): Refund? = refund.getNullable("refund")

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
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<TransactionDestinationOneOf> = destination

        /**
         * Returns the raw JSON value of [platformCustomerId].
         *
         * Unlike [platformCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        fun _platformCustomerId(): JsonField<String> = platformCustomerId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TransactionStatus> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<TransactionType> = type

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [exchangeRate].
         *
         * Unlike [exchangeRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exchangeRate")
        @ExcludeMissing
        fun _exchangeRate(): JsonField<Double> = exchangeRate

        /**
         * Returns the raw JSON value of [failureReason].
         *
         * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [paymentInstructions], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [receivedAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * .status()
             * .type()
             * .sentAmount()
             * .source()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [OutgoingTransaction]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var destination: JsonField<TransactionDestinationOneOf>? = null
            private var platformCustomerId: JsonField<String>? = null
            private var status: JsonField<TransactionStatus>? = null
            private var type: JsonField<TransactionType>? = null
            private var counterpartyInformation: JsonField<CounterpartyInformation> =
                JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var sentAmount: JsonField<CurrencyAmount>? = null
            private var source: JsonField<TransactionSourceOneOf>? = null
            private var exchangeRate: JsonField<Double> = JsonMissing.of()
            private var failureReason: JsonField<FailureReason> = JsonMissing.of()
            private var fees: JsonField<Long> = JsonMissing.of()
            private var paymentInstructions: JsonField<MutableList<PaymentInstructions>>? = null
            private var quoteId: JsonField<String> = JsonMissing.of()
            private var rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of()
            private var receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of()
            private var refund: JsonField<Refund> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(outgoingTransaction: OutgoingTransaction) = apply {
                id = outgoingTransaction.id
                customerId = outgoingTransaction.customerId
                destination = outgoingTransaction.destination
                platformCustomerId = outgoingTransaction.platformCustomerId
                status = outgoingTransaction.status
                type = outgoingTransaction.type
                counterpartyInformation = outgoingTransaction.counterpartyInformation
                createdAt = outgoingTransaction.createdAt
                description = outgoingTransaction.description
                settledAt = outgoingTransaction.settledAt
                updatedAt = outgoingTransaction.updatedAt
                sentAmount = outgoingTransaction.sentAmount
                source = outgoingTransaction.source
                exchangeRate = outgoingTransaction.exchangeRate
                failureReason = outgoingTransaction.failureReason
                fees = outgoingTransaction.fees
                paymentInstructions =
                    outgoingTransaction.paymentInstructions.map { it.toMutableList() }
                quoteId = outgoingTransaction.quoteId
                rateDetails = outgoingTransaction.rateDetails
                receivedAmount = outgoingTransaction.receivedAmount
                refund = outgoingTransaction.refund
                additionalProperties = outgoingTransaction.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the transaction */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** System ID of the customer (sender for outgoing, recipient for incoming) */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Destination account details */
            fun destination(destination: TransactionDestinationOneOf) =
                destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed
             * [TransactionDestinationOneOf] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun destination(destination: JsonField<TransactionDestinationOneOf>) = apply {
                this.destination = destination
            }

            /**
             * Alias for calling [destination] with
             * `TransactionDestinationOneOf.ofAccountTransactionDestination(accountTransactionDestination)`.
             */
            fun destination(
                accountTransactionDestination:
                    TransactionDestinationOneOf.AccountTransactionDestination
            ) =
                destination(
                    TransactionDestinationOneOf.ofAccountTransactionDestination(
                        accountTransactionDestination
                    )
                )

            /**
             * Alias for calling [destination] with
             * `TransactionDestinationOneOf.ofUmaAddressTransactionDestination(umaAddressTransactionDestination)`.
             */
            fun destination(
                umaAddressTransactionDestination:
                    TransactionDestinationOneOf.UmaAddressTransactionDestination
            ) =
                destination(
                    TransactionDestinationOneOf.ofUmaAddressTransactionDestination(
                        umaAddressTransactionDestination
                    )
                )

            /**
             * Alias for calling [destination] with
             * `TransactionDestinationOneOf.ofExternalAccountDetails(externalAccountDetails)`.
             */
            fun destination(
                externalAccountDetails: TransactionDestinationOneOf.ExternalAccountDetails
            ) =
                destination(
                    TransactionDestinationOneOf.ofExternalAccountDetails(externalAccountDetails)
                )

            /**
             * Alias for calling [destination] with the following:
             * ```kotlin
             * TransactionDestinationOneOf.ExternalAccountDetails.builder()
             *     .destinationType(TransactionDestinationOneOf.ExternalAccountDetails.DestinationType.EXTERNAL_ACCOUNT_DETAILS)
             *     .externalAccountDetails(externalAccountDetails)
             *     .build()
             * ```
             */
            fun externalAccountDetailsDestination(externalAccountDetails: ExternalAccountCreate) =
                destination(
                    TransactionDestinationOneOf.ExternalAccountDetails.builder()
                        .destinationType(
                            TransactionDestinationOneOf.ExternalAccountDetails.DestinationType
                                .EXTERNAL_ACCOUNT_DETAILS
                        )
                        .externalAccountDetails(externalAccountDetails)
                        .build()
                )

            /**
             * Platform-specific ID of the customer (sender for outgoing, recipient for incoming)
             */
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

            /**
             * Status of a payment transaction.
             *
             * |Status      |Description                                                                                       |
             * |------------|--------------------------------------------------------------------------------------------------|
             * |`CREATED`   |Initial lookup has been created                                                                   |
             * |`PENDING`   |Quote has been created                                                                            |
             * |`PROCESSING`|Funding has been received and payment initiated                                                   |
             * |`SENT`      |Cross border settlement has been initiated                                                        |
             * |`COMPLETED` |Cross border payment has been received, converted and payment has been sent to the offramp network|
             * |`REJECTED`  |Receiving institution or wallet rejected payment, payment has been refunded                       |
             * |`FAILED`    |An error occurred during payment                                                                  |
             * |`REFUNDED`  |Payment was unable to complete and refunded                                                       |
             * |`EXPIRED`   |Quote has expired                                                                                 |
             */
            fun status(status: TransactionStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [TransactionStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

            /** Type of transaction (incoming payment or outgoing payment) */
            fun type(type: TransactionType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [TransactionType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<TransactionType>) = apply { this.type = type }

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
             * [CounterpartyInformation] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun counterpartyInformation(
                counterpartyInformation: JsonField<CounterpartyInformation>
            ) = apply { this.counterpartyInformation = counterpartyInformation }

            /** When the transaction was created */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Optional memo or description for the payment */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** When the payment was or will be settled */
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

            /** When the transaction was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * You should usually call [Builder.source] with a well-typed [TransactionSourceOneOf]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun source(source: JsonField<TransactionSourceOneOf>) = apply { this.source = source }

            /** Alias for calling [source] with `TransactionSourceOneOf.ofAccount(account)`. */
            fun source(account: TransactionSourceOneOf.Account) =
                source(TransactionSourceOneOf.ofAccount(account))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * TransactionSourceOneOf.Account.builder()
             *     .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
             *     .accountId(accountId)
             *     .build()
             * ```
             */
            fun accountSource(accountId: String) =
                source(
                    TransactionSourceOneOf.Account.builder()
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .accountId(accountId)
                        .build()
                )

            /**
             * Alias for calling [source] with `TransactionSourceOneOf.ofUmaAddress(umaAddress)`.
             */
            fun source(umaAddress: TransactionSourceOneOf.UmaAddress) =
                source(TransactionSourceOneOf.ofUmaAddress(umaAddress))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * TransactionSourceOneOf.UmaAddress.builder()
             *     .sourceType(TransactionSourceOneOf.UmaAddress.SourceType.UMA_ADDRESS)
             *     .umaAddress(umaAddress)
             *     .build()
             * ```
             */
            fun umaAddressSource(umaAddress: String) =
                source(
                    TransactionSourceOneOf.UmaAddress.builder()
                        .sourceType(TransactionSourceOneOf.UmaAddress.SourceType.UMA_ADDRESS)
                        .umaAddress(umaAddress)
                        .build()
                )

            /**
             * Alias for calling [source] with
             * `TransactionSourceOneOf.ofRealtimeFunding(realtimeFunding)`.
             */
            fun source(realtimeFunding: TransactionSourceOneOf.RealtimeFunding) =
                source(TransactionSourceOneOf.ofRealtimeFunding(realtimeFunding))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * TransactionSourceOneOf.RealtimeFunding.builder()
             *     .sourceType(TransactionSourceOneOf.RealtimeFunding.SourceType.REALTIME_FUNDING)
             *     .currency(currency)
             *     .build()
             * ```
             */
            fun realtimeFundingSource(currency: String) =
                source(
                    TransactionSourceOneOf.RealtimeFunding.builder()
                        .sourceType(
                            TransactionSourceOneOf.RealtimeFunding.SourceType.REALTIME_FUNDING
                        )
                        .currency(currency)
                        .build()
                )

            /** Number of sending currency units per receiving currency unit. */
            fun exchangeRate(exchangeRate: Double) = exchangeRate(JsonField.of(exchangeRate))

            /**
             * Sets [Builder.exchangeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exchangeRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exchangeRate(exchangeRate: JsonField<Double>) = apply {
                this.exchangeRate = exchangeRate
            }

            /** If the transaction failed, this field provides the reason for failure. */
            fun failureReason(failureReason: FailureReason) =
                failureReason(JsonField.of(failureReason))

            /**
             * Sets [Builder.failureReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureReason] with a well-typed [FailureReason]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

            /** Payment instructions for executing the payment. */
            fun paymentInstructions(paymentInstructions: List<PaymentInstructions>) =
                paymentInstructions(JsonField.of(paymentInstructions))

            /**
             * Sets [Builder.paymentInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentInstructions] with a well-typed
             * `List<PaymentInstructions>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun paymentInstructions(paymentInstructions: JsonField<List<PaymentInstructions>>) =
                apply {
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
             * You should usually call [Builder.quoteId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

            /** Details about the rate and fees for the transaction. */
            fun rateDetails(rateDetails: OutgoingRateDetails) =
                rateDetails(JsonField.of(rateDetails))

            /**
             * Sets [Builder.rateDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateDetails] with a well-typed [OutgoingRateDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.receivedAmount] with a well-typed [CurrencyAmount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receivedAmount(receivedAmount: JsonField<CurrencyAmount>) = apply {
                this.receivedAmount = receivedAmount
            }

            /** The refund if transaction was refunded. */
            fun refund(refund: Refund) = refund(JsonField.of(refund))

            /**
             * Sets [Builder.refund] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refund] with a well-typed [Refund] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refund(refund: JsonField<Refund>) = apply { this.refund = refund }

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
             * .status()
             * .type()
             * .sentAmount()
             * .source()
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
                    checkRequired("status", status),
                    checkRequired("type", type),
                    counterpartyInformation,
                    createdAt,
                    description,
                    settledAt,
                    updatedAt,
                    checkRequired("sentAmount", sentAmount),
                    checkRequired("source", source),
                    exchangeRate,
                    failureReason,
                    fees,
                    (paymentInstructions ?: JsonMissing.of()).map { it.toImmutable() },
                    quoteId,
                    rateDetails,
                    receivedAmount,
                    refund,
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
            status().validate()
            type().validate()
            counterpartyInformation()?.validate()
            createdAt()
            description()
            settledAt()
            updatedAt()
            sentAmount().validate()
            source().validate()
            exchangeRate()
            failureReason()?.validate()
            fees()
            paymentInstructions()?.forEach { it.validate() }
            quoteId()
            rateDetails()?.validate()
            receivedAmount()?.validate()
            refund()?.validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (destination.asKnown()?.validity() ?: 0) +
                (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (counterpartyInformation.asKnown()?.validity() ?: 0) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (settledAt.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (sentAmount.asKnown()?.validity() ?: 0) +
                (source.asKnown()?.validity() ?: 0) +
                (if (exchangeRate.asKnown() == null) 0 else 1) +
                (failureReason.asKnown()?.validity() ?: 0) +
                (if (fees.asKnown() == null) 0 else 1) +
                (paymentInstructions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (quoteId.asKnown() == null) 0 else 1) +
                (rateDetails.asKnown()?.validity() ?: 0) +
                (receivedAmount.asKnown()?.validity() ?: 0) +
                (refund.asKnown()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val OUTGOING = of("OUTGOING")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OUTGOING
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OUTGOING,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    OUTGOING -> Value.OUTGOING
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
                    OUTGOING -> Known.OUTGOING
                    else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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

        /** If the transaction failed, this field provides the reason for failure. */
        class FailureReason @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown FailureReason: $value")
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
                @JsonProperty("settledAt")
                @ExcludeMissing
                settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(initiatedAt, reference, settledAt, mutableMapOf())

            /**
             * When the refund was initiated
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun initiatedAt(): OffsetDateTime = initiatedAt.getRequired("initiatedAt")

            /**
             * The unique reference code of the refund
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * When the refund was or will be settled
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

            /**
             * Returns the raw JSON value of [initiatedAt].
             *
             * Unlike [initiatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("initiatedAt")
            @ExcludeMissing
            fun _initiatedAt(): JsonField<OffsetDateTime> = initiatedAt

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [settledAt].
             *
             * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Refund]. */
            class Builder internal constructor() {

                private var initiatedAt: JsonField<OffsetDateTime>? = null
                private var reference: JsonField<String>? = null
                private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(refund: Refund) = apply {
                    initiatedAt = refund.initiatedAt
                    reference = refund.reference
                    settledAt = refund.settledAt
                    additionalProperties = refund.additionalProperties.toMutableMap()
                }

                /** When the refund was initiated */
                fun initiatedAt(initiatedAt: OffsetDateTime) =
                    initiatedAt(JsonField.of(initiatedAt))

                /**
                 * Sets [Builder.initiatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.initiatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun initiatedAt(initiatedAt: JsonField<OffsetDateTime>) = apply {
                    this.initiatedAt = initiatedAt
                }

                /** The unique reference code of the refund */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                /** When the refund was or will be settled */
                fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

                /**
                 * Sets [Builder.settledAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settledAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Refund].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .initiatedAt()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Refund =
                    Refund(
                        checkRequired("initiatedAt", initiatedAt),
                        checkRequired("reference", reference),
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
                    (if (settledAt.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Refund &&
                    initiatedAt == other.initiatedAt &&
                    reference == other.reference &&
                    settledAt == other.settledAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(initiatedAt, reference, settledAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Refund{initiatedAt=$initiatedAt, reference=$reference, settledAt=$settledAt, additionalProperties=$additionalProperties}"
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
                status == other.status &&
                type == other.type &&
                counterpartyInformation == other.counterpartyInformation &&
                createdAt == other.createdAt &&
                description == other.description &&
                settledAt == other.settledAt &&
                updatedAt == other.updatedAt &&
                sentAmount == other.sentAmount &&
                source == other.source &&
                exchangeRate == other.exchangeRate &&
                failureReason == other.failureReason &&
                fees == other.fees &&
                paymentInstructions == other.paymentInstructions &&
                quoteId == other.quoteId &&
                rateDetails == other.rateDetails &&
                receivedAmount == other.receivedAmount &&
                refund == other.refund &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                customerId,
                destination,
                platformCustomerId,
                status,
                type,
                counterpartyInformation,
                createdAt,
                description,
                settledAt,
                updatedAt,
                sentAmount,
                source,
                exchangeRate,
                failureReason,
                fees,
                paymentInstructions,
                quoteId,
                rateDetails,
                receivedAmount,
                refund,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutgoingTransaction{id=$id, customerId=$customerId, destination=$destination, platformCustomerId=$platformCustomerId, status=$status, type=$type, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, settledAt=$settledAt, updatedAt=$updatedAt, sentAmount=$sentAmount, source=$source, exchangeRate=$exchangeRate, failureReason=$failureReason, fees=$fees, paymentInstructions=$paymentInstructions, quoteId=$quoteId, rateDetails=$rateDetails, receivedAmount=$receivedAmount, refund=$refund, additionalProperties=$additionalProperties}"
    }
}
