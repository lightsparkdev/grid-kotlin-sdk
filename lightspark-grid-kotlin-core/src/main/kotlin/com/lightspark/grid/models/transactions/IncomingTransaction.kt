// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

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
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class IncomingTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val destination: JsonValue,
    private val direction: JsonField<Direction>,
    private val platformCustomerId: JsonField<String>,
    private val status: JsonField<TransactionStatus>,
    private val type: JsonField<Type>,
    private val agentId: JsonField<String>,
    private val counterpartyInformation: JsonField<CounterpartyInformation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val exchangeRate: JsonField<Double>,
    private val failureReason: JsonField<FailureReason>,
    private val fees: JsonField<Long>,
    private val pendingReason: JsonField<PendingReason>,
    private val quoteId: JsonField<String>,
    private val receiptDeliveryConfirmedAt: JsonField<OffsetDateTime>,
    private val receivedAmount: JsonField<CurrencyAmount>,
    private val reconciliationInstructions: JsonField<ReconciliationInstructions>,
    private val refund: JsonField<Refund>,
    private val sentAmount: JsonField<CurrencyAmount>,
    private val settledAt: JsonField<OffsetDateTime>,
    private val source: JsonField<TransactionSourceOneOf>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination") @ExcludeMissing destination: JsonValue = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        platformCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<TransactionStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("pendingReason")
        @ExcludeMissing
        pendingReason: JsonField<PendingReason> = JsonMissing.of(),
        @JsonProperty("quoteId") @ExcludeMissing quoteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiptDeliveryConfirmedAt")
        @ExcludeMissing
        receiptDeliveryConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("receivedAmount")
        @ExcludeMissing
        receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("reconciliationInstructions")
        @ExcludeMissing
        reconciliationInstructions: JsonField<ReconciliationInstructions> = JsonMissing.of(),
        @JsonProperty("refund") @ExcludeMissing refund: JsonField<Refund> = JsonMissing.of(),
        @JsonProperty("sentAmount")
        @ExcludeMissing
        sentAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("settledAt")
        @ExcludeMissing
        settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<TransactionSourceOneOf> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        customerId,
        destination,
        direction,
        platformCustomerId,
        status,
        type,
        agentId,
        counterpartyInformation,
        createdAt,
        description,
        exchangeRate,
        failureReason,
        fees,
        pendingReason,
        quoteId,
        receiptDeliveryConfirmedAt,
        receivedAmount,
        reconciliationInstructions,
        refund,
        sentAmount,
        settledAt,
        source,
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
     * System ID of the customer this transaction belongs to
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = incomingTransaction.destination().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonValue = destination

    /**
     * Whether this transaction credits or debits the customer's account.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * Platform-specific ID of the customer this transaction belongs to
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

    /**
     * Status of a payment transaction.
     *
     * |Status                 |Description                                                                                                                                                                                                                                                                                                            |
     * |-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * |`CREATED`              |Initial lookup has been created                                                                                                                                                                                                                                                                                        |
     * |`PENDING`              |Quote has been created                                                                                                                                                                                                                                                                                                 |
     * |`PENDING_AUTHORIZATION`|Awaiting Strong Customer Authentication. Only occurs for customers in a region where SCA is required (e.g. EU). The challenge is carried by the quote, not the transaction — fetch `GET /quotes/{quoteId}` using the transaction's `quoteId`, then authorize its `scaChallenge` via `POST /quotes/{quoteId}/authorize`.|
     * |`PROCESSING`           |Funding has been received and payment initiated                                                                                                                                                                                                                                                                        |
     * |`COMPLETED`            |Cross border payment has been received, converted and payment has been sent to the offramp network                                                                                                                                                                                                                     |
     * |`REJECTED`             |Receiving institution or wallet rejected payment, payment has been refunded                                                                                                                                                                                                                                            |
     * |`FAILED`               |An error occurred during payment                                                                                                                                                                                                                                                                                       |
     * |`REFUNDED`             |Payment was unable to complete and refunded                                                                                                                                                                                                                                                                            |
     * |`EXPIRED`              |Quote has expired                                                                                                                                                                                                                                                                                                      |
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
    fun type(): Type = type.getRequired("type")

    /**
     * If this transaction was initiated by an agent, the system-generated ID of that agent. Absent
     * for platform-initiated transactions.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agentId(): String? = agentId.getNullable("agentId")

    /**
     * Additional information about the counterparty, if available and relevant to the transaction
     * and platform.
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
     * Number of sending currency units per receiving currency unit. The rate is fee-exclusive: Grid
     * deducts fees from the sending amount before converting at this rate.
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
     * The total fees available from the receive quote in the smallest unit of the sending currency
     * (eg. cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fees(): Long? = fees.getNullable("fees")

    /**
     * Present when compliance review or required customer action is delaying settlement.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pendingReason(): PendingReason? = pendingReason.getNullable("pendingReason")

    /**
     * The ID of the quote that was used to trigger this payment
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun quoteId(): String? = quoteId.getNullable("quoteId")

    /**
     * The time at which the platform confirmed delivery of the receipt to their customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receiptDeliveryConfirmedAt(): OffsetDateTime? =
        receiptDeliveryConfirmedAt.getNullable("receiptDeliveryConfirmedAt")

    /**
     * Amount received in the recipient's currency. This is only absent for rule-based account
     * sweeps if the sweep couldn't be quoted. It's always present otherwise.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivedAmount(): CurrencyAmount? = receivedAmount.getNullable("receivedAmount")

    /**
     * Included for all transactions except those with "CREATED" status
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciliationInstructions(): ReconciliationInstructions? =
        reconciliationInstructions.getNullable("reconciliationInstructions")

    /**
     * The refund if transaction was refunded.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun refund(): Refund? = refund.getNullable("refund")

    /**
     * Amount sent in the sender's currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sentAmount(): CurrencyAmount? = sentAmount.getNullable("sentAmount")

    /**
     * When the payment was or will be settled
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun source(): TransactionSourceOneOf? = source.getNullable("source")

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
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

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
     * Returns the raw JSON value of [pendingReason].
     *
     * Unlike [pendingReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pendingReason")
    @ExcludeMissing
    fun _pendingReason(): JsonField<PendingReason> = pendingReason

    /**
     * Returns the raw JSON value of [quoteId].
     *
     * Unlike [quoteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quoteId") @ExcludeMissing fun _quoteId(): JsonField<String> = quoteId

    /**
     * Returns the raw JSON value of [receiptDeliveryConfirmedAt].
     *
     * Unlike [receiptDeliveryConfirmedAt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("receiptDeliveryConfirmedAt")
    @ExcludeMissing
    fun _receiptDeliveryConfirmedAt(): JsonField<OffsetDateTime> = receiptDeliveryConfirmedAt

    /**
     * Returns the raw JSON value of [receivedAmount].
     *
     * Unlike [receivedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivedAmount")
    @ExcludeMissing
    fun _receivedAmount(): JsonField<CurrencyAmount> = receivedAmount

    /**
     * Returns the raw JSON value of [reconciliationInstructions].
     *
     * Unlike [reconciliationInstructions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("reconciliationInstructions")
    @ExcludeMissing
    fun _reconciliationInstructions(): JsonField<ReconciliationInstructions> =
        reconciliationInstructions

    /**
     * Returns the raw JSON value of [refund].
     *
     * Unlike [refund], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund") @ExcludeMissing fun _refund(): JsonField<Refund> = refund

    /**
     * Returns the raw JSON value of [sentAmount].
     *
     * Unlike [sentAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sentAmount")
    @ExcludeMissing
    fun _sentAmount(): JsonField<CurrencyAmount> = sentAmount

    /**
     * Returns the raw JSON value of [settledAt].
     *
     * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settledAt")
    @ExcludeMissing
    fun _settledAt(): JsonField<OffsetDateTime> = settledAt

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<TransactionSourceOneOf> = source

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
         * Returns a mutable builder for constructing an instance of [IncomingTransaction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .customerId()
         * .destination()
         * .direction()
         * .platformCustomerId()
         * .status()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IncomingTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var destination: JsonValue? = null
        private var direction: JsonField<Direction>? = null
        private var platformCustomerId: JsonField<String>? = null
        private var status: JsonField<TransactionStatus>? = null
        private var type: JsonField<Type>? = null
        private var agentId: JsonField<String> = JsonMissing.of()
        private var counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var exchangeRate: JsonField<Double> = JsonMissing.of()
        private var failureReason: JsonField<FailureReason> = JsonMissing.of()
        private var fees: JsonField<Long> = JsonMissing.of()
        private var pendingReason: JsonField<PendingReason> = JsonMissing.of()
        private var quoteId: JsonField<String> = JsonMissing.of()
        private var receiptDeliveryConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of()
        private var reconciliationInstructions: JsonField<ReconciliationInstructions> =
            JsonMissing.of()
        private var refund: JsonField<Refund> = JsonMissing.of()
        private var sentAmount: JsonField<CurrencyAmount> = JsonMissing.of()
        private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var source: JsonField<TransactionSourceOneOf> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(incomingTransaction: IncomingTransaction) = apply {
            id = incomingTransaction.id
            customerId = incomingTransaction.customerId
            destination = incomingTransaction.destination
            direction = incomingTransaction.direction
            platformCustomerId = incomingTransaction.platformCustomerId
            status = incomingTransaction.status
            type = incomingTransaction.type
            agentId = incomingTransaction.agentId
            counterpartyInformation = incomingTransaction.counterpartyInformation
            createdAt = incomingTransaction.createdAt
            description = incomingTransaction.description
            exchangeRate = incomingTransaction.exchangeRate
            failureReason = incomingTransaction.failureReason
            fees = incomingTransaction.fees
            pendingReason = incomingTransaction.pendingReason
            quoteId = incomingTransaction.quoteId
            receiptDeliveryConfirmedAt = incomingTransaction.receiptDeliveryConfirmedAt
            receivedAmount = incomingTransaction.receivedAmount
            reconciliationInstructions = incomingTransaction.reconciliationInstructions
            refund = incomingTransaction.refund
            sentAmount = incomingTransaction.sentAmount
            settledAt = incomingTransaction.settledAt
            source = incomingTransaction.source
            updatedAt = incomingTransaction.updatedAt
            additionalProperties = incomingTransaction.additionalProperties.toMutableMap()
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

        /** System ID of the customer this transaction belongs to */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun destination(destination: JsonValue) = apply { this.destination = destination }

        /** Whether this transaction credits or debits the customer's account. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** Platform-specific ID of the customer this transaction belongs to */
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
         * |Status                 |Description                                                                                                                                                                                                                                                                                                            |
         * |-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * |`CREATED`              |Initial lookup has been created                                                                                                                                                                                                                                                                                        |
         * |`PENDING`              |Quote has been created                                                                                                                                                                                                                                                                                                 |
         * |`PENDING_AUTHORIZATION`|Awaiting Strong Customer Authentication. Only occurs for customers in a region where SCA is required (e.g. EU). The challenge is carried by the quote, not the transaction — fetch `GET /quotes/{quoteId}` using the transaction's `quoteId`, then authorize its `scaChallenge` via `POST /quotes/{quoteId}/authorize`.|
         * |`PROCESSING`           |Funding has been received and payment initiated                                                                                                                                                                                                                                                                        |
         * |`COMPLETED`            |Cross border payment has been received, converted and payment has been sent to the offramp network                                                                                                                                                                                                                     |
         * |`REJECTED`             |Receiving institution or wallet rejected payment, payment has been refunded                                                                                                                                                                                                                                            |
         * |`FAILED`               |An error occurred during payment                                                                                                                                                                                                                                                                                       |
         * |`REFUNDED`             |Payment was unable to complete and refunded                                                                                                                                                                                                                                                                            |
         * |`EXPIRED`              |Quote has expired                                                                                                                                                                                                                                                                                                      |
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
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * If this transaction was initiated by an agent, the system-generated ID of that agent.
         * Absent for platform-initiated transactions.
         */
        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /**
         * Additional information about the counterparty, if available and relevant to the
         * transaction and platform.
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

        /**
         * Number of sending currency units per receiving currency unit. The rate is fee-exclusive:
         * Grid deducts fees from the sending amount before converting at this rate.
         */
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
         * The total fees available from the receive quote in the smallest unit of the sending
         * currency (eg. cents).
         */
        fun fees(fees: Long) = fees(JsonField.of(fees))

        /**
         * Sets [Builder.fees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fees] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

        /** Present when compliance review or required customer action is delaying settlement. */
        fun pendingReason(pendingReason: PendingReason) = pendingReason(JsonField.of(pendingReason))

        /**
         * Sets [Builder.pendingReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingReason] with a well-typed [PendingReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingReason(pendingReason: JsonField<PendingReason>) = apply {
            this.pendingReason = pendingReason
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

        /** The time at which the platform confirmed delivery of the receipt to their customer. */
        fun receiptDeliveryConfirmedAt(receiptDeliveryConfirmedAt: OffsetDateTime) =
            receiptDeliveryConfirmedAt(JsonField.of(receiptDeliveryConfirmedAt))

        /**
         * Sets [Builder.receiptDeliveryConfirmedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiptDeliveryConfirmedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun receiptDeliveryConfirmedAt(receiptDeliveryConfirmedAt: JsonField<OffsetDateTime>) =
            apply {
                this.receiptDeliveryConfirmedAt = receiptDeliveryConfirmedAt
            }

        /**
         * Amount received in the recipient's currency. This is only absent for rule-based account
         * sweeps if the sweep couldn't be quoted. It's always present otherwise.
         */
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

        /** Included for all transactions except those with "CREATED" status */
        fun reconciliationInstructions(reconciliationInstructions: ReconciliationInstructions) =
            reconciliationInstructions(JsonField.of(reconciliationInstructions))

        /**
         * Sets [Builder.reconciliationInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciliationInstructions] with a well-typed
         * [ReconciliationInstructions] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun reconciliationInstructions(
            reconciliationInstructions: JsonField<ReconciliationInstructions>
        ) = apply { this.reconciliationInstructions = reconciliationInstructions }

        /** The refund if transaction was refunded. */
        fun refund(refund: Refund) = refund(JsonField.of(refund))

        /**
         * Sets [Builder.refund] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refund] with a well-typed [Refund] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refund(refund: JsonField<Refund>) = apply { this.refund = refund }

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

        fun source(source: TransactionSourceOneOf) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [TransactionSourceOneOf] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<TransactionSourceOneOf>) = apply { this.source = source }

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
         * Returns an immutable instance of [IncomingTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .customerId()
         * .destination()
         * .direction()
         * .platformCustomerId()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IncomingTransaction =
            IncomingTransaction(
                checkRequired("id", id),
                checkRequired("customerId", customerId),
                checkRequired("destination", destination),
                checkRequired("direction", direction),
                checkRequired("platformCustomerId", platformCustomerId),
                checkRequired("status", status),
                checkRequired("type", type),
                agentId,
                counterpartyInformation,
                createdAt,
                description,
                exchangeRate,
                failureReason,
                fees,
                pendingReason,
                quoteId,
                receiptDeliveryConfirmedAt,
                receivedAmount,
                reconciliationInstructions,
                refund,
                sentAmount,
                settledAt,
                source,
                updatedAt,
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
    fun validate(): IncomingTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        customerId()
        direction().validate()
        platformCustomerId()
        status().validate()
        type().validate()
        agentId()
        counterpartyInformation()?.validate()
        createdAt()
        description()
        exchangeRate()
        failureReason()?.validate()
        fees()
        pendingReason()?.validate()
        quoteId()
        receiptDeliveryConfirmedAt()
        receivedAmount()?.validate()
        reconciliationInstructions()?.validate()
        refund()?.validate()
        sentAmount()?.validate()
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
            (direction.asKnown()?.validity() ?: 0) +
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (agentId.asKnown() == null) 0 else 1) +
            (counterpartyInformation.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (exchangeRate.asKnown() == null) 0 else 1) +
            (failureReason.asKnown()?.validity() ?: 0) +
            (if (fees.asKnown() == null) 0 else 1) +
            (pendingReason.asKnown()?.validity() ?: 0) +
            (if (quoteId.asKnown() == null) 0 else 1) +
            (if (receiptDeliveryConfirmedAt.asKnown() == null) 0 else 1) +
            (receivedAmount.asKnown()?.validity() ?: 0) +
            (reconciliationInstructions.asKnown()?.validity() ?: 0) +
            (refund.asKnown()?.validity() ?: 0) +
            (sentAmount.asKnown()?.validity() ?: 0) +
            (if (settledAt.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** Whether this transaction credits or debits the customer's account. */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CREDIT = of("CREDIT")

            val DEBIT = of("DEBIT")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw LightsparkGridInvalidDataException("Unknown Direction: $value")
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
        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of transaction (incoming payment or outgoing payment) */
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

            val INCOMING = of("INCOMING")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INCOMING
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
     * and platform.
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

            val LNURLP_FAILED = of("LNURLP_FAILED")

            val PAY_REQUEST_FAILED = of("PAY_REQUEST_FAILED")

            val PAYMENT_APPROVAL_WEBHOOK_ERROR = of("PAYMENT_APPROVAL_WEBHOOK_ERROR")

            val PAYMENT_APPROVAL_TIMED_OUT = of("PAYMENT_APPROVAL_TIMED_OUT")

            val OFFRAMP_FAILED = of("OFFRAMP_FAILED")

            val MISSING_MANDATORY_PAYEE_DATA = of("MISSING_MANDATORY_PAYEE_DATA")

            val QUOTE_EXPIRED = of("QUOTE_EXPIRED")

            val QUOTE_EXECUTION_FAILED = of("QUOTE_EXECUTION_FAILED")

            val COMPLIANCE_REJECTED = of("COMPLIANCE_REJECTED")

            val COLLECTION_FAILED = of("COLLECTION_FAILED")

            val SWEEP_AMOUNT_OUT_OF_RANGE = of("SWEEP_AMOUNT_OUT_OF_RANGE")

            val SWEEP_QUOTE_FAILED = of("SWEEP_QUOTE_FAILED")

            fun of(value: String) = FailureReason(JsonField.of(value))
        }

        /** An enum containing [FailureReason]'s known values. */
        enum class Known {
            LNURLP_FAILED,
            PAY_REQUEST_FAILED,
            PAYMENT_APPROVAL_WEBHOOK_ERROR,
            PAYMENT_APPROVAL_TIMED_OUT,
            OFFRAMP_FAILED,
            MISSING_MANDATORY_PAYEE_DATA,
            QUOTE_EXPIRED,
            QUOTE_EXECUTION_FAILED,
            COMPLIANCE_REJECTED,
            COLLECTION_FAILED,
            SWEEP_AMOUNT_OUT_OF_RANGE,
            SWEEP_QUOTE_FAILED,
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
            LNURLP_FAILED,
            PAY_REQUEST_FAILED,
            PAYMENT_APPROVAL_WEBHOOK_ERROR,
            PAYMENT_APPROVAL_TIMED_OUT,
            OFFRAMP_FAILED,
            MISSING_MANDATORY_PAYEE_DATA,
            QUOTE_EXPIRED,
            QUOTE_EXECUTION_FAILED,
            COMPLIANCE_REJECTED,
            COLLECTION_FAILED,
            SWEEP_AMOUNT_OUT_OF_RANGE,
            SWEEP_QUOTE_FAILED,
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
                LNURLP_FAILED -> Value.LNURLP_FAILED
                PAY_REQUEST_FAILED -> Value.PAY_REQUEST_FAILED
                PAYMENT_APPROVAL_WEBHOOK_ERROR -> Value.PAYMENT_APPROVAL_WEBHOOK_ERROR
                PAYMENT_APPROVAL_TIMED_OUT -> Value.PAYMENT_APPROVAL_TIMED_OUT
                OFFRAMP_FAILED -> Value.OFFRAMP_FAILED
                MISSING_MANDATORY_PAYEE_DATA -> Value.MISSING_MANDATORY_PAYEE_DATA
                QUOTE_EXPIRED -> Value.QUOTE_EXPIRED
                QUOTE_EXECUTION_FAILED -> Value.QUOTE_EXECUTION_FAILED
                COMPLIANCE_REJECTED -> Value.COMPLIANCE_REJECTED
                COLLECTION_FAILED -> Value.COLLECTION_FAILED
                SWEEP_AMOUNT_OUT_OF_RANGE -> Value.SWEEP_AMOUNT_OUT_OF_RANGE
                SWEEP_QUOTE_FAILED -> Value.SWEEP_QUOTE_FAILED
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
                LNURLP_FAILED -> Known.LNURLP_FAILED
                PAY_REQUEST_FAILED -> Known.PAY_REQUEST_FAILED
                PAYMENT_APPROVAL_WEBHOOK_ERROR -> Known.PAYMENT_APPROVAL_WEBHOOK_ERROR
                PAYMENT_APPROVAL_TIMED_OUT -> Known.PAYMENT_APPROVAL_TIMED_OUT
                OFFRAMP_FAILED -> Known.OFFRAMP_FAILED
                MISSING_MANDATORY_PAYEE_DATA -> Known.MISSING_MANDATORY_PAYEE_DATA
                QUOTE_EXPIRED -> Known.QUOTE_EXPIRED
                QUOTE_EXECUTION_FAILED -> Known.QUOTE_EXECUTION_FAILED
                COMPLIANCE_REJECTED -> Known.COMPLIANCE_REJECTED
                COLLECTION_FAILED -> Known.COLLECTION_FAILED
                SWEEP_AMOUNT_OUT_OF_RANGE -> Known.SWEEP_AMOUNT_OUT_OF_RANGE
                SWEEP_QUOTE_FAILED -> Known.SWEEP_QUOTE_FAILED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

    /** Present when compliance review or required customer action is delaying settlement. */
    class PendingReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val COUNTERPARTY_DECLARATION_REQUIRED = of("COUNTERPARTY_DECLARATION_REQUIRED")

            val WALLET_VERIFICATION_REQUIRED = of("WALLET_VERIFICATION_REQUIRED")

            val COUNTERPARTY_INFORMATION_REQUIRED = of("COUNTERPARTY_INFORMATION_REQUIRED")

            val COMPLIANCE_REVIEW = of("COMPLIANCE_REVIEW")

            fun of(value: String) = PendingReason(JsonField.of(value))
        }

        /** An enum containing [PendingReason]'s known values. */
        enum class Known {
            COUNTERPARTY_DECLARATION_REQUIRED,
            WALLET_VERIFICATION_REQUIRED,
            COUNTERPARTY_INFORMATION_REQUIRED,
            COMPLIANCE_REVIEW,
        }

        /**
         * An enum containing [PendingReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PendingReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COUNTERPARTY_DECLARATION_REQUIRED,
            WALLET_VERIFICATION_REQUIRED,
            COUNTERPARTY_INFORMATION_REQUIRED,
            COMPLIANCE_REVIEW,
            /**
             * An enum member indicating that [PendingReason] was instantiated with an unknown
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
                COUNTERPARTY_DECLARATION_REQUIRED -> Value.COUNTERPARTY_DECLARATION_REQUIRED
                WALLET_VERIFICATION_REQUIRED -> Value.WALLET_VERIFICATION_REQUIRED
                COUNTERPARTY_INFORMATION_REQUIRED -> Value.COUNTERPARTY_INFORMATION_REQUIRED
                COMPLIANCE_REVIEW -> Value.COMPLIANCE_REVIEW
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
                COUNTERPARTY_DECLARATION_REQUIRED -> Known.COUNTERPARTY_DECLARATION_REQUIRED
                WALLET_VERIFICATION_REQUIRED -> Known.WALLET_VERIFICATION_REQUIRED
                COUNTERPARTY_INFORMATION_REQUIRED -> Known.COUNTERPARTY_INFORMATION_REQUIRED
                COMPLIANCE_REVIEW -> Known.COMPLIANCE_REVIEW
                else -> throw LightsparkGridInvalidDataException("Unknown PendingReason: $value")
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
        fun validate(): PendingReason = apply {
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

            return other is PendingReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IncomingTransaction &&
            id == other.id &&
            customerId == other.customerId &&
            destination == other.destination &&
            direction == other.direction &&
            platformCustomerId == other.platformCustomerId &&
            status == other.status &&
            type == other.type &&
            agentId == other.agentId &&
            counterpartyInformation == other.counterpartyInformation &&
            createdAt == other.createdAt &&
            description == other.description &&
            exchangeRate == other.exchangeRate &&
            failureReason == other.failureReason &&
            fees == other.fees &&
            pendingReason == other.pendingReason &&
            quoteId == other.quoteId &&
            receiptDeliveryConfirmedAt == other.receiptDeliveryConfirmedAt &&
            receivedAmount == other.receivedAmount &&
            reconciliationInstructions == other.reconciliationInstructions &&
            refund == other.refund &&
            sentAmount == other.sentAmount &&
            settledAt == other.settledAt &&
            source == other.source &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            customerId,
            destination,
            direction,
            platformCustomerId,
            status,
            type,
            agentId,
            counterpartyInformation,
            createdAt,
            description,
            exchangeRate,
            failureReason,
            fees,
            pendingReason,
            quoteId,
            receiptDeliveryConfirmedAt,
            receivedAmount,
            reconciliationInstructions,
            refund,
            sentAmount,
            settledAt,
            source,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IncomingTransaction{id=$id, customerId=$customerId, destination=$destination, direction=$direction, platformCustomerId=$platformCustomerId, status=$status, type=$type, agentId=$agentId, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, exchangeRate=$exchangeRate, failureReason=$failureReason, fees=$fees, pendingReason=$pendingReason, quoteId=$quoteId, receiptDeliveryConfirmedAt=$receiptDeliveryConfirmedAt, receivedAmount=$receivedAmount, reconciliationInstructions=$reconciliationInstructions, refund=$refund, sentAmount=$sentAmount, settledAt=$settledAt, source=$source, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
