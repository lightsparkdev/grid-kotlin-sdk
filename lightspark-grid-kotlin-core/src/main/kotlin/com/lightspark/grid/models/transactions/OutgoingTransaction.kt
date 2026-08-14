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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class OutgoingTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val destination: JsonValue,
    private val direction: JsonField<Direction>,
    private val platformCustomerId: JsonField<String>,
    private val sentAmount: JsonField<CurrencyAmount>,
    private val source: JsonField<TransactionSourceOneOf>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val agentId: JsonField<String>,
    private val counterpartyInformation: JsonField<CounterpartyInformation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val exchangeRate: JsonField<Double>,
    private val expectedSettlementAt: JsonField<OffsetDateTime>,
    private val failureReason: JsonField<FailureReason>,
    private val fees: JsonField<Long>,
    private val paymentInstructions: JsonField<List<PaymentInstructions>>,
    private val paymentRail: JsonField<PaymentRail>,
    private val pendingReason: JsonField<PendingReason>,
    private val platformFees: JsonField<Long>,
    private val quoteId: JsonField<String>,
    private val railSelectionMode: JsonField<RailSelectionMode>,
    private val rateDetails: JsonField<OutgoingRateDetails>,
    private val receiptDeliveryConfirmedAt: JsonField<OffsetDateTime>,
    private val receivedAmount: JsonField<CurrencyAmount>,
    private val reconciliationInstructions: JsonField<ReconciliationInstructions>,
    private val refund: JsonField<Refund>,
    private val settledAt: JsonField<OffsetDateTime>,
    private val settlementTimelineSeconds: JsonField<Long>,
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
        @JsonProperty("sentAmount")
        @ExcludeMissing
        sentAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<TransactionSourceOneOf> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
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
        @JsonProperty("expectedSettlementAt")
        @ExcludeMissing
        expectedSettlementAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<FailureReason> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("paymentInstructions")
        @ExcludeMissing
        paymentInstructions: JsonField<List<PaymentInstructions>> = JsonMissing.of(),
        @JsonProperty("paymentRail")
        @ExcludeMissing
        paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
        @JsonProperty("pendingReason")
        @ExcludeMissing
        pendingReason: JsonField<PendingReason> = JsonMissing.of(),
        @JsonProperty("platformFees")
        @ExcludeMissing
        platformFees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("quoteId") @ExcludeMissing quoteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("railSelectionMode")
        @ExcludeMissing
        railSelectionMode: JsonField<RailSelectionMode> = JsonMissing.of(),
        @JsonProperty("rateDetails")
        @ExcludeMissing
        rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of(),
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
        @JsonProperty("settledAt")
        @ExcludeMissing
        settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("settlementTimelineSeconds")
        @ExcludeMissing
        settlementTimelineSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        customerId,
        destination,
        direction,
        platformCustomerId,
        sentAmount,
        source,
        status,
        type,
        agentId,
        counterpartyInformation,
        createdAt,
        description,
        exchangeRate,
        expectedSettlementAt,
        failureReason,
        fees,
        paymentInstructions,
        paymentRail,
        pendingReason,
        platformFees,
        quoteId,
        railSelectionMode,
        rateDetails,
        receiptDeliveryConfirmedAt,
        receivedAmount,
        reconciliationInstructions,
        refund,
        settledAt,
        settlementTimelineSeconds,
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
     * val myObject: MyClass = outgoingTransaction.destination().convert(MyClass::class.java)
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
     * Amount sent in the sender's currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sentAmount(): CurrencyAmount = sentAmount.getRequired("sentAmount")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): TransactionSourceOneOf = source.getRequired("source")

    /**
     * Status of an outgoing payment transaction.
     *
     * |Status                 |Description                                                                                                                                                           |
     * |-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * |`PENDING`              |Quote is pending confirmation                                                                                                                                         |
     * |`PENDING_AUTHORIZATION`|Awaiting Strong Customer Authentication. Only occurs for customers in a region where SCA is required (e.g. EU); authorize the transaction's `scaChallenge` to proceed.|
     * |`EXPIRED`              |Quote wasn't executed before expiry window                                                                                                                            |
     * |`PROCESSING`           |Executing the quote after receiving funds                                                                                                                             |
     * |`COMPLETED`            |Payout successfully reached the destination                                                                                                                           |
     * |`FAILED`               |Something went wrong — accompanied by a `failureReason`                                                                                                               |
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

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
     * Number of sending currency units per receiving currency unit.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun exchangeRate(): Double? = exchangeRate.getNullable("exchangeRate")

    /**
     * Expected settlement time at the beneficiary. Null for instant rails (settlement is immediate)
     * and before a rail with deferred settlement is resolved.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedSettlementAt(): OffsetDateTime? =
        expectedSettlementAt.getNullable("expectedSettlementAt")

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
     * The payment rail used to settle this transaction (e.g. ACH, WIRE, NEFT, FASTER_PAYMENTS).
     * Uses the same values as the PaymentRail sent on quote requests. Null when no external rail is
     * used (e.g. instant or intra-network transfers, or non-direct-destination transactions) or
     * before a rail is resolved.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentRail(): PaymentRail? = paymentRail.getNullable("paymentRail")

    /**
     * Present when compliance review or required customer action is delaying settlement.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pendingReason(): PendingReason? = pendingReason.getNullable("pendingReason")

    /**
     * The portion of `fees` collected by the platform (platform-configured transaction fees), in
     * the smallest unit of the sending currency. 0 when the platform has no applicable fee
     * configured. Already included in `fees`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformFees(): Long? = platformFees.getNullable("platformFees")

    /**
     * The ID of the quote that was used to trigger this payment
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun quoteId(): String? = quoteId.getNullable("quoteId")

    /**
     * How the rail was chosen — MANUAL when the platform specified a paymentRail on the
     * destination, AUTO when Lightspark selects it. Null when no rail is resolved.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun railSelectionMode(): RailSelectionMode? = railSelectionMode.getNullable("railSelectionMode")

    /**
     * Details about the rate and fees for the transaction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rateDetails(): OutgoingRateDetails? = rateDetails.getNullable("rateDetails")

    /**
     * The time at which the platform confirmed delivery of the receipt to their customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receiptDeliveryConfirmedAt(): OffsetDateTime? =
        receiptDeliveryConfirmedAt.getNullable("receiptDeliveryConfirmedAt")

    /**
     * Amount to be received by recipient in the recipient's currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivedAmount(): CurrencyAmount? = receivedAmount.getNullable("receivedAmount")

    /**
     * Reconciliation details for this transaction. For the on-chain hash of a crypto payout to an
     * external wallet, see the destination's `onChainTransaction` instead.
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
     * When the payment was or will be settled
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

    /**
     * Expected number of seconds from quote creation to settlement. Null when not yet known.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settlementTimelineSeconds(): Long? =
        settlementTimelineSeconds.getNullable("settlementTimelineSeconds")

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
     * Returns the raw JSON value of [expectedSettlementAt].
     *
     * Unlike [expectedSettlementAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expectedSettlementAt")
    @ExcludeMissing
    fun _expectedSettlementAt(): JsonField<OffsetDateTime> = expectedSettlementAt

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
     * Returns the raw JSON value of [paymentRail].
     *
     * Unlike [paymentRail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paymentRail")
    @ExcludeMissing
    fun _paymentRail(): JsonField<PaymentRail> = paymentRail

    /**
     * Returns the raw JSON value of [pendingReason].
     *
     * Unlike [pendingReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pendingReason")
    @ExcludeMissing
    fun _pendingReason(): JsonField<PendingReason> = pendingReason

    /**
     * Returns the raw JSON value of [platformFees].
     *
     * Unlike [platformFees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platformFees")
    @ExcludeMissing
    fun _platformFees(): JsonField<Long> = platformFees

    /**
     * Returns the raw JSON value of [quoteId].
     *
     * Unlike [quoteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quoteId") @ExcludeMissing fun _quoteId(): JsonField<String> = quoteId

    /**
     * Returns the raw JSON value of [railSelectionMode].
     *
     * Unlike [railSelectionMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("railSelectionMode")
    @ExcludeMissing
    fun _railSelectionMode(): JsonField<RailSelectionMode> = railSelectionMode

    /**
     * Returns the raw JSON value of [rateDetails].
     *
     * Unlike [rateDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rateDetails")
    @ExcludeMissing
    fun _rateDetails(): JsonField<OutgoingRateDetails> = rateDetails

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
     * Returns the raw JSON value of [settledAt].
     *
     * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settledAt")
    @ExcludeMissing
    fun _settledAt(): JsonField<OffsetDateTime> = settledAt

    /**
     * Returns the raw JSON value of [settlementTimelineSeconds].
     *
     * Unlike [settlementTimelineSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("settlementTimelineSeconds")
    @ExcludeMissing
    fun _settlementTimelineSeconds(): JsonField<Long> = settlementTimelineSeconds

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
         * .direction()
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
        private var destination: JsonValue? = null
        private var direction: JsonField<Direction>? = null
        private var platformCustomerId: JsonField<String>? = null
        private var sentAmount: JsonField<CurrencyAmount>? = null
        private var source: JsonField<TransactionSourceOneOf>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var agentId: JsonField<String> = JsonMissing.of()
        private var counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var exchangeRate: JsonField<Double> = JsonMissing.of()
        private var expectedSettlementAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var failureReason: JsonField<FailureReason> = JsonMissing.of()
        private var fees: JsonField<Long> = JsonMissing.of()
        private var paymentInstructions: JsonField<MutableList<PaymentInstructions>>? = null
        private var paymentRail: JsonField<PaymentRail> = JsonMissing.of()
        private var pendingReason: JsonField<PendingReason> = JsonMissing.of()
        private var platformFees: JsonField<Long> = JsonMissing.of()
        private var quoteId: JsonField<String> = JsonMissing.of()
        private var railSelectionMode: JsonField<RailSelectionMode> = JsonMissing.of()
        private var rateDetails: JsonField<OutgoingRateDetails> = JsonMissing.of()
        private var receiptDeliveryConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of()
        private var reconciliationInstructions: JsonField<ReconciliationInstructions> =
            JsonMissing.of()
        private var refund: JsonField<Refund> = JsonMissing.of()
        private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var settlementTimelineSeconds: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(outgoingTransaction: OutgoingTransaction) = apply {
            id = outgoingTransaction.id
            customerId = outgoingTransaction.customerId
            destination = outgoingTransaction.destination
            direction = outgoingTransaction.direction
            platformCustomerId = outgoingTransaction.platformCustomerId
            sentAmount = outgoingTransaction.sentAmount
            source = outgoingTransaction.source
            status = outgoingTransaction.status
            type = outgoingTransaction.type
            agentId = outgoingTransaction.agentId
            counterpartyInformation = outgoingTransaction.counterpartyInformation
            createdAt = outgoingTransaction.createdAt
            description = outgoingTransaction.description
            exchangeRate = outgoingTransaction.exchangeRate
            expectedSettlementAt = outgoingTransaction.expectedSettlementAt
            failureReason = outgoingTransaction.failureReason
            fees = outgoingTransaction.fees
            paymentInstructions = outgoingTransaction.paymentInstructions.map { it.toMutableList() }
            paymentRail = outgoingTransaction.paymentRail
            pendingReason = outgoingTransaction.pendingReason
            platformFees = outgoingTransaction.platformFees
            quoteId = outgoingTransaction.quoteId
            railSelectionMode = outgoingTransaction.railSelectionMode
            rateDetails = outgoingTransaction.rateDetails
            receiptDeliveryConfirmedAt = outgoingTransaction.receiptDeliveryConfirmedAt
            receivedAmount = outgoingTransaction.receivedAmount
            reconciliationInstructions = outgoingTransaction.reconciliationInstructions
            refund = outgoingTransaction.refund
            settledAt = outgoingTransaction.settledAt
            settlementTimelineSeconds = outgoingTransaction.settlementTimelineSeconds
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
         * Status of an outgoing payment transaction.
         *
         * |Status                 |Description                                                                                                                                                           |
         * |-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * |`PENDING`              |Quote is pending confirmation                                                                                                                                         |
         * |`PENDING_AUTHORIZATION`|Awaiting Strong Customer Authentication. Only occurs for customers in a region where SCA is required (e.g. EU); authorize the transaction's `scaChallenge` to proceed.|
         * |`EXPIRED`              |Quote wasn't executed before expiry window                                                                                                                            |
         * |`PROCESSING`           |Executing the quote after receiving funds                                                                                                                             |
         * |`COMPLETED`            |Payout successfully reached the destination                                                                                                                           |
         * |`FAILED`               |Something went wrong — accompanied by a `failureReason`                                                                                                               |
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        /**
         * Expected settlement time at the beneficiary. Null for instant rails (settlement is
         * immediate) and before a rail with deferred settlement is resolved.
         */
        fun expectedSettlementAt(expectedSettlementAt: OffsetDateTime) =
            expectedSettlementAt(JsonField.of(expectedSettlementAt))

        /**
         * Sets [Builder.expectedSettlementAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedSettlementAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun expectedSettlementAt(expectedSettlementAt: JsonField<OffsetDateTime>) = apply {
            this.expectedSettlementAt = expectedSettlementAt
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

        /**
         * The payment rail used to settle this transaction (e.g. ACH, WIRE, NEFT, FASTER_PAYMENTS).
         * Uses the same values as the PaymentRail sent on quote requests. Null when no external
         * rail is used (e.g. instant or intra-network transfers, or non-direct-destination
         * transactions) or before a rail is resolved.
         */
        fun paymentRail(paymentRail: PaymentRail?) = paymentRail(JsonField.ofNullable(paymentRail))

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

        /**
         * The portion of `fees` collected by the platform (platform-configured transaction fees),
         * in the smallest unit of the sending currency. 0 when the platform has no applicable fee
         * configured. Already included in `fees`.
         */
        fun platformFees(platformFees: Long) = platformFees(JsonField.of(platformFees))

        /**
         * Sets [Builder.platformFees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformFees] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platformFees(platformFees: JsonField<Long>) = apply { this.platformFees = platformFees }

        /** The ID of the quote that was used to trigger this payment */
        fun quoteId(quoteId: String) = quoteId(JsonField.of(quoteId))

        /**
         * Sets [Builder.quoteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

        /**
         * How the rail was chosen — MANUAL when the platform specified a paymentRail on the
         * destination, AUTO when Lightspark selects it. Null when no rail is resolved.
         */
        fun railSelectionMode(railSelectionMode: RailSelectionMode?) =
            railSelectionMode(JsonField.ofNullable(railSelectionMode))

        /**
         * Sets [Builder.railSelectionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.railSelectionMode] with a well-typed [RailSelectionMode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun railSelectionMode(railSelectionMode: JsonField<RailSelectionMode>) = apply {
            this.railSelectionMode = railSelectionMode
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

        /**
         * Reconciliation details for this transaction. For the on-chain hash of a crypto payout to
         * an external wallet, see the destination's `onChainTransaction` instead.
         */
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

        /**
         * Expected number of seconds from quote creation to settlement. Null when not yet known.
         */
        fun settlementTimelineSeconds(settlementTimelineSeconds: Long?) =
            settlementTimelineSeconds(JsonField.ofNullable(settlementTimelineSeconds))

        /**
         * Alias for [Builder.settlementTimelineSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun settlementTimelineSeconds(settlementTimelineSeconds: Long) =
            settlementTimelineSeconds(settlementTimelineSeconds as Long?)

        /**
         * Sets [Builder.settlementTimelineSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementTimelineSeconds] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun settlementTimelineSeconds(settlementTimelineSeconds: JsonField<Long>) = apply {
            this.settlementTimelineSeconds = settlementTimelineSeconds
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
         * .direction()
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
                checkRequired("direction", direction),
                checkRequired("platformCustomerId", platformCustomerId),
                checkRequired("sentAmount", sentAmount),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("type", type),
                agentId,
                counterpartyInformation,
                createdAt,
                description,
                exchangeRate,
                expectedSettlementAt,
                failureReason,
                fees,
                (paymentInstructions ?: JsonMissing.of()).map { it.toImmutable() },
                paymentRail,
                pendingReason,
                platformFees,
                quoteId,
                railSelectionMode,
                rateDetails,
                receiptDeliveryConfirmedAt,
                receivedAmount,
                reconciliationInstructions,
                refund,
                settledAt,
                settlementTimelineSeconds,
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
    fun validate(): OutgoingTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        customerId()
        direction().validate()
        platformCustomerId()
        sentAmount().validate()
        status().validate()
        type().validate()
        agentId()
        counterpartyInformation()?.validate()
        createdAt()
        description()
        exchangeRate()
        expectedSettlementAt()
        failureReason()?.validate()
        fees()
        paymentInstructions()?.forEach { it.validate() }
        paymentRail()?.validate()
        pendingReason()?.validate()
        platformFees()
        quoteId()
        railSelectionMode()?.validate()
        rateDetails()?.validate()
        receiptDeliveryConfirmedAt()
        receivedAmount()?.validate()
        reconciliationInstructions()?.validate()
        refund()?.validate()
        settledAt()
        settlementTimelineSeconds()
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
            (sentAmount.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (agentId.asKnown() == null) 0 else 1) +
            (counterpartyInformation.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (exchangeRate.asKnown() == null) 0 else 1) +
            (if (expectedSettlementAt.asKnown() == null) 0 else 1) +
            (failureReason.asKnown()?.validity() ?: 0) +
            (if (fees.asKnown() == null) 0 else 1) +
            (paymentInstructions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (paymentRail.asKnown()?.validity() ?: 0) +
            (pendingReason.asKnown()?.validity() ?: 0) +
            (if (platformFees.asKnown() == null) 0 else 1) +
            (if (quoteId.asKnown() == null) 0 else 1) +
            (railSelectionMode.asKnown()?.validity() ?: 0) +
            (rateDetails.asKnown()?.validity() ?: 0) +
            (if (receiptDeliveryConfirmedAt.asKnown() == null) 0 else 1) +
            (receivedAmount.asKnown()?.validity() ?: 0) +
            (reconciliationInstructions.asKnown()?.validity() ?: 0) +
            (refund.asKnown()?.validity() ?: 0) +
            (if (settledAt.asKnown() == null) 0 else 1) +
            (if (settlementTimelineSeconds.asKnown() == null) 0 else 1) +
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

    /**
     * Status of an outgoing payment transaction.
     *
     * |Status                 |Description                                                                                                                                                           |
     * |-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * |`PENDING`              |Quote is pending confirmation                                                                                                                                         |
     * |`PENDING_AUTHORIZATION`|Awaiting Strong Customer Authentication. Only occurs for customers in a region where SCA is required (e.g. EU); authorize the transaction's `scaChallenge` to proceed.|
     * |`EXPIRED`              |Quote wasn't executed before expiry window                                                                                                                            |
     * |`PROCESSING`           |Executing the quote after receiving funds                                                                                                                             |
     * |`COMPLETED`            |Payout successfully reached the destination                                                                                                                           |
     * |`FAILED`               |Something went wrong — accompanied by a `failureReason`                                                                                                               |
     */
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

            val PENDING_AUTHORIZATION = of("PENDING_AUTHORIZATION")

            val PROCESSING = of("PROCESSING")

            val COMPLETED = of("COMPLETED")

            val FAILED = of("FAILED")

            val EXPIRED = of("EXPIRED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            PENDING_AUTHORIZATION,
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
            PENDING_AUTHORIZATION,
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
                PENDING_AUTHORIZATION -> Value.PENDING_AUTHORIZATION
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
                PENDING_AUTHORIZATION -> Known.PENDING_AUTHORIZATION
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OUTGOING,
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

            val QUOTE_EXPIRED = of("QUOTE_EXPIRED")

            val QUOTE_EXECUTION_FAILED = of("QUOTE_EXECUTION_FAILED")

            val FUNDING_AMOUNT_MISMATCH = of("FUNDING_AMOUNT_MISMATCH")

            val SCA_NOT_COMPLETED = of("SCA_NOT_COMPLETED")

            val PAYOUT_RETURNED = of("PAYOUT_RETURNED")

            val LIMIT_EXCEEDED = of("LIMIT_EXCEEDED")

            val ACCOUNT_CANNOT_RECEIVE = of("ACCOUNT_CANNOT_RECEIVE")

            val ACCOUNT_INVALID = of("ACCOUNT_INVALID")

            val COMPLIANCE_REJECTED = of("COMPLIANCE_REJECTED")

            val LIGHTNING_PAYMENT_FAILED = of("LIGHTNING_PAYMENT_FAILED")

            val COUNTERPARTY_POST_TX_FAILED = of("COUNTERPARTY_POST_TX_FAILED")

            fun of(value: String) = FailureReason(JsonField.of(value))
        }

        /** An enum containing [FailureReason]'s known values. */
        enum class Known {
            QUOTE_EXPIRED,
            QUOTE_EXECUTION_FAILED,
            FUNDING_AMOUNT_MISMATCH,
            SCA_NOT_COMPLETED,
            PAYOUT_RETURNED,
            LIMIT_EXCEEDED,
            ACCOUNT_CANNOT_RECEIVE,
            ACCOUNT_INVALID,
            COMPLIANCE_REJECTED,
            LIGHTNING_PAYMENT_FAILED,
            COUNTERPARTY_POST_TX_FAILED,
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
            FUNDING_AMOUNT_MISMATCH,
            SCA_NOT_COMPLETED,
            PAYOUT_RETURNED,
            LIMIT_EXCEEDED,
            ACCOUNT_CANNOT_RECEIVE,
            ACCOUNT_INVALID,
            COMPLIANCE_REJECTED,
            LIGHTNING_PAYMENT_FAILED,
            COUNTERPARTY_POST_TX_FAILED,
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
                FUNDING_AMOUNT_MISMATCH -> Value.FUNDING_AMOUNT_MISMATCH
                SCA_NOT_COMPLETED -> Value.SCA_NOT_COMPLETED
                PAYOUT_RETURNED -> Value.PAYOUT_RETURNED
                LIMIT_EXCEEDED -> Value.LIMIT_EXCEEDED
                ACCOUNT_CANNOT_RECEIVE -> Value.ACCOUNT_CANNOT_RECEIVE
                ACCOUNT_INVALID -> Value.ACCOUNT_INVALID
                COMPLIANCE_REJECTED -> Value.COMPLIANCE_REJECTED
                LIGHTNING_PAYMENT_FAILED -> Value.LIGHTNING_PAYMENT_FAILED
                COUNTERPARTY_POST_TX_FAILED -> Value.COUNTERPARTY_POST_TX_FAILED
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
                FUNDING_AMOUNT_MISMATCH -> Known.FUNDING_AMOUNT_MISMATCH
                SCA_NOT_COMPLETED -> Known.SCA_NOT_COMPLETED
                PAYOUT_RETURNED -> Known.PAYOUT_RETURNED
                LIMIT_EXCEEDED -> Known.LIMIT_EXCEEDED
                ACCOUNT_CANNOT_RECEIVE -> Known.ACCOUNT_CANNOT_RECEIVE
                ACCOUNT_INVALID -> Known.ACCOUNT_INVALID
                COMPLIANCE_REJECTED -> Known.COMPLIANCE_REJECTED
                LIGHTNING_PAYMENT_FAILED -> Known.LIGHTNING_PAYMENT_FAILED
                COUNTERPARTY_POST_TX_FAILED -> Known.COUNTERPARTY_POST_TX_FAILED
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

    /**
     * The payment rail used to settle this transaction (e.g. ACH, WIRE, NEFT, FASTER_PAYMENTS).
     * Uses the same values as the PaymentRail sent on quote requests. Null when no external rail is
     * used (e.g. instant or intra-network transfers, or non-direct-destination transactions) or
     * before a rail is resolved.
     */
    class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val ACH = of("ACH")

            val ACH_COLOMBIA = of("ACH_COLOMBIA")

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            ACH_COLOMBIA,
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
             * An enum member indicating that [PaymentRail] was instantiated with an unknown value.
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
                ACH -> Value.ACH
                ACH_COLOMBIA -> Value.ACH_COLOMBIA
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                ACH_COLOMBIA -> Known.ACH_COLOMBIA
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

    /**
     * How the rail was chosen — MANUAL when the platform specified a paymentRail on the
     * destination, AUTO when Lightspark selects it. Null when no rail is resolved.
     */
    class RailSelectionMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val AUTO = of("AUTO")

            val MANUAL = of("MANUAL")

            fun of(value: String) = RailSelectionMode(JsonField.of(value))
        }

        /** An enum containing [RailSelectionMode]'s known values. */
        enum class Known {
            AUTO,
            MANUAL,
        }

        /**
         * An enum containing [RailSelectionMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RailSelectionMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            MANUAL,
            /**
             * An enum member indicating that [RailSelectionMode] was instantiated with an unknown
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
                AUTO -> Value.AUTO
                MANUAL -> Value.MANUAL
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
                AUTO -> Known.AUTO
                MANUAL -> Known.MANUAL
                else ->
                    throw LightsparkGridInvalidDataException("Unknown RailSelectionMode: $value")
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
        fun validate(): RailSelectionMode = apply {
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

            return other is RailSelectionMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutgoingTransaction &&
            id == other.id &&
            customerId == other.customerId &&
            destination == other.destination &&
            direction == other.direction &&
            platformCustomerId == other.platformCustomerId &&
            sentAmount == other.sentAmount &&
            source == other.source &&
            status == other.status &&
            type == other.type &&
            agentId == other.agentId &&
            counterpartyInformation == other.counterpartyInformation &&
            createdAt == other.createdAt &&
            description == other.description &&
            exchangeRate == other.exchangeRate &&
            expectedSettlementAt == other.expectedSettlementAt &&
            failureReason == other.failureReason &&
            fees == other.fees &&
            paymentInstructions == other.paymentInstructions &&
            paymentRail == other.paymentRail &&
            pendingReason == other.pendingReason &&
            platformFees == other.platformFees &&
            quoteId == other.quoteId &&
            railSelectionMode == other.railSelectionMode &&
            rateDetails == other.rateDetails &&
            receiptDeliveryConfirmedAt == other.receiptDeliveryConfirmedAt &&
            receivedAmount == other.receivedAmount &&
            reconciliationInstructions == other.reconciliationInstructions &&
            refund == other.refund &&
            settledAt == other.settledAt &&
            settlementTimelineSeconds == other.settlementTimelineSeconds &&
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
            sentAmount,
            source,
            status,
            type,
            agentId,
            counterpartyInformation,
            createdAt,
            description,
            exchangeRate,
            expectedSettlementAt,
            failureReason,
            fees,
            paymentInstructions,
            paymentRail,
            pendingReason,
            platformFees,
            quoteId,
            railSelectionMode,
            rateDetails,
            receiptDeliveryConfirmedAt,
            receivedAmount,
            reconciliationInstructions,
            refund,
            settledAt,
            settlementTimelineSeconds,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutgoingTransaction{id=$id, customerId=$customerId, destination=$destination, direction=$direction, platformCustomerId=$platformCustomerId, sentAmount=$sentAmount, source=$source, status=$status, type=$type, agentId=$agentId, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, exchangeRate=$exchangeRate, expectedSettlementAt=$expectedSettlementAt, failureReason=$failureReason, fees=$fees, paymentInstructions=$paymentInstructions, paymentRail=$paymentRail, pendingReason=$pendingReason, platformFees=$platformFees, quoteId=$quoteId, railSelectionMode=$railSelectionMode, rateDetails=$rateDetails, receiptDeliveryConfirmedAt=$receiptDeliveryConfirmedAt, receivedAmount=$receivedAmount, reconciliationInstructions=$reconciliationInstructions, refund=$refund, settledAt=$settledAt, settlementTimelineSeconds=$settlementTimelineSeconds, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
