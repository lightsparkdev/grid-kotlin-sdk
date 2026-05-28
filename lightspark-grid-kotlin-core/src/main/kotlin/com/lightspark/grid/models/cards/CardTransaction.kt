// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

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
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.sandbox.cards.simulate.CardMerchant
import com.lightspark.grid.models.sandbox.cards.simulate.CardPullSummary
import com.lightspark.grid.models.sandbox.cards.simulate.CardRefundSummary
import com.lightspark.grid.models.sandbox.cards.simulate.CardSettlementSummary
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Parent transaction row for a card authorization and all of the pulls / settlements / refunds that
 * reconcile against it. Child events are rolled up into the `pullSummary`, `refundSummary`, and
 * `settlementSummary` aggregates. Delivered as the payload of the generic transaction webhook
 * stream (extends the Transaction model with a card destination type) on every transition.
 */
class CardTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val authorizedAmount: JsonField<CurrencyAmount>,
    private val authorizedAt: JsonField<OffsetDateTime>,
    private val cardId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val merchant: JsonField<CardMerchant>,
    private val pullSummary: JsonField<CardPullSummary>,
    private val refundSummary: JsonField<CardRefundSummary>,
    private val settlementSummary: JsonField<CardSettlementSummary>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val issuerTransactionToken: JsonField<String>,
    private val lastEventAt: JsonField<OffsetDateTime>,
    private val refundedAmount: JsonField<CurrencyAmount>,
    private val settledAmount: JsonField<CurrencyAmount>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizedAmount")
        @ExcludeMissing
        authorizedAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("authorizedAt")
        @ExcludeMissing
        authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cardId") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("merchant")
        @ExcludeMissing
        merchant: JsonField<CardMerchant> = JsonMissing.of(),
        @JsonProperty("pullSummary")
        @ExcludeMissing
        pullSummary: JsonField<CardPullSummary> = JsonMissing.of(),
        @JsonProperty("refundSummary")
        @ExcludeMissing
        refundSummary: JsonField<CardRefundSummary> = JsonMissing.of(),
        @JsonProperty("settlementSummary")
        @ExcludeMissing
        settlementSummary: JsonField<CardSettlementSummary> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issuerTransactionToken")
        @ExcludeMissing
        issuerTransactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastEventAt")
        @ExcludeMissing
        lastEventAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("refundedAmount")
        @ExcludeMissing
        refundedAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("settledAmount")
        @ExcludeMissing
        settledAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        authorizedAmount,
        authorizedAt,
        cardId,
        createdAt,
        merchant,
        pullSummary,
        refundSummary,
        settlementSummary,
        status,
        updatedAt,
        issuerTransactionToken,
        lastEventAt,
        refundedAmount,
        settledAmount,
        mutableMapOf(),
    )

    /**
     * System-generated unique card transaction identifier
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Internal account id that funded this transaction (the funding source selected by
     * Authorization Decisioning at auth time).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("accountId")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizedAmount(): CurrencyAmount = authorizedAmount.getRequired("authorizedAmount")

    /**
     * When the auth was approved.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorizedAt")

    /**
     * The id of the `Card` this transaction was made on.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = cardId.getRequired("cardId")

    /**
     * Creation timestamp (same as `authorizedAt` for card transactions).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): CardMerchant = merchant.getRequired("merchant")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pullSummary(): CardPullSummary = pullSummary.getRequired("pullSummary")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refundSummary(): CardRefundSummary = refundSummary.getRequired("refundSummary")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementSummary(): CardSettlementSummary =
        settlementSummary.getRequired("settlementSummary")

    /**
     * Lifecycle status of a card transaction.
     *
     * |Status             |Description                                                                                                                                                                                                                                    |
     * |-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * |`AUTHORIZED`       |The auth has been approved and a hold placed on the funding source; no clearing has arrived yet.                                                                                                                                               |
     * |`PARTIALLY_SETTLED`|At least one clearing has arrived and posted, but more clearings are still expected (split shipments, tips, multi-leg trips).                                                                                                                  |
     * |`SETTLED`          |All clearings for the auth have posted and the transaction is closed against the funding source.                                                                                                                                               |
     * |`REFUNDED`         |A `RETURN` was received from the merchant; the net settled amount has been refunded in part or whole.                                                                                                                                          |
     * |`EXCEPTION`        |The transaction settled to the card network but the corresponding pull from the funding source failed (e.g. balance no longer covers the post-hoc clearing). Surfaces high-urgency alerts and is the dashboard query for stuck reconciliations.|
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Last update timestamp.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Opaque identifier for the transaction on the underlying issuer. Used to cross-reference Grid
     * records against issuer dashboards and webhooks.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuerTransactionToken(): String? =
        issuerTransactionToken.getNullable("issuerTransactionToken")

    /**
     * Timestamp of the most recent reconcile event (pull / clearing / refund) against this
     * transaction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastEventAt(): OffsetDateTime? = lastEventAt.getNullable("lastEventAt")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun refundedAmount(): CurrencyAmount? = refundedAmount.getNullable("refundedAmount")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settledAmount(): CurrencyAmount? = settledAmount.getNullable("settledAmount")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [authorizedAmount].
     *
     * Unlike [authorizedAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorizedAmount")
    @ExcludeMissing
    fun _authorizedAmount(): JsonField<CurrencyAmount> = authorizedAmount

    /**
     * Returns the raw JSON value of [authorizedAt].
     *
     * Unlike [authorizedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorizedAt")
    @ExcludeMissing
    fun _authorizedAt(): JsonField<OffsetDateTime> = authorizedAt

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardId") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<CardMerchant> = merchant

    /**
     * Returns the raw JSON value of [pullSummary].
     *
     * Unlike [pullSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pullSummary")
    @ExcludeMissing
    fun _pullSummary(): JsonField<CardPullSummary> = pullSummary

    /**
     * Returns the raw JSON value of [refundSummary].
     *
     * Unlike [refundSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refundSummary")
    @ExcludeMissing
    fun _refundSummary(): JsonField<CardRefundSummary> = refundSummary

    /**
     * Returns the raw JSON value of [settlementSummary].
     *
     * Unlike [settlementSummary], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlementSummary")
    @ExcludeMissing
    fun _settlementSummary(): JsonField<CardSettlementSummary> = settlementSummary

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [issuerTransactionToken].
     *
     * Unlike [issuerTransactionToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("issuerTransactionToken")
    @ExcludeMissing
    fun _issuerTransactionToken(): JsonField<String> = issuerTransactionToken

    /**
     * Returns the raw JSON value of [lastEventAt].
     *
     * Unlike [lastEventAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastEventAt")
    @ExcludeMissing
    fun _lastEventAt(): JsonField<OffsetDateTime> = lastEventAt

    /**
     * Returns the raw JSON value of [refundedAmount].
     *
     * Unlike [refundedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refundedAmount")
    @ExcludeMissing
    fun _refundedAmount(): JsonField<CurrencyAmount> = refundedAmount

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settledAmount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<CurrencyAmount> = settledAmount

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
         * Returns a mutable builder for constructing an instance of [CardTransaction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .authorizedAmount()
         * .authorizedAt()
         * .cardId()
         * .createdAt()
         * .merchant()
         * .pullSummary()
         * .refundSummary()
         * .settlementSummary()
         * .status()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var authorizedAmount: JsonField<CurrencyAmount>? = null
        private var authorizedAt: JsonField<OffsetDateTime>? = null
        private var cardId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var merchant: JsonField<CardMerchant>? = null
        private var pullSummary: JsonField<CardPullSummary>? = null
        private var refundSummary: JsonField<CardRefundSummary>? = null
        private var settlementSummary: JsonField<CardSettlementSummary>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var issuerTransactionToken: JsonField<String> = JsonMissing.of()
        private var lastEventAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var refundedAmount: JsonField<CurrencyAmount> = JsonMissing.of()
        private var settledAmount: JsonField<CurrencyAmount> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardTransaction: CardTransaction) = apply {
            id = cardTransaction.id
            accountId = cardTransaction.accountId
            authorizedAmount = cardTransaction.authorizedAmount
            authorizedAt = cardTransaction.authorizedAt
            cardId = cardTransaction.cardId
            createdAt = cardTransaction.createdAt
            merchant = cardTransaction.merchant
            pullSummary = cardTransaction.pullSummary
            refundSummary = cardTransaction.refundSummary
            settlementSummary = cardTransaction.settlementSummary
            status = cardTransaction.status
            updatedAt = cardTransaction.updatedAt
            issuerTransactionToken = cardTransaction.issuerTransactionToken
            lastEventAt = cardTransaction.lastEventAt
            refundedAmount = cardTransaction.refundedAmount
            settledAmount = cardTransaction.settledAmount
            additionalProperties = cardTransaction.additionalProperties.toMutableMap()
        }

        /** System-generated unique card transaction identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Internal account id that funded this transaction (the funding source selected by
         * Authorization Decisioning at auth time).
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authorizedAmount(authorizedAmount: CurrencyAmount) =
            authorizedAmount(JsonField.of(authorizedAmount))

        /**
         * Sets [Builder.authorizedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizedAmount] with a well-typed [CurrencyAmount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun authorizedAmount(authorizedAmount: JsonField<CurrencyAmount>) = apply {
            this.authorizedAmount = authorizedAmount
        }

        /** When the auth was approved. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = authorizedAt(JsonField.of(authorizedAt))

        /**
         * Sets [Builder.authorizedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            this.authorizedAt = authorizedAt
        }

        /** The id of the `Card` this transaction was made on. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Creation timestamp (same as `authorizedAt` for card transactions). */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun merchant(merchant: CardMerchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [CardMerchant] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchant(merchant: JsonField<CardMerchant>) = apply { this.merchant = merchant }

        fun pullSummary(pullSummary: CardPullSummary) = pullSummary(JsonField.of(pullSummary))

        /**
         * Sets [Builder.pullSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pullSummary] with a well-typed [CardPullSummary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pullSummary(pullSummary: JsonField<CardPullSummary>) = apply {
            this.pullSummary = pullSummary
        }

        fun refundSummary(refundSummary: CardRefundSummary) =
            refundSummary(JsonField.of(refundSummary))

        /**
         * Sets [Builder.refundSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundSummary] with a well-typed [CardRefundSummary]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun refundSummary(refundSummary: JsonField<CardRefundSummary>) = apply {
            this.refundSummary = refundSummary
        }

        fun settlementSummary(settlementSummary: CardSettlementSummary) =
            settlementSummary(JsonField.of(settlementSummary))

        /**
         * Sets [Builder.settlementSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementSummary] with a well-typed
         * [CardSettlementSummary] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun settlementSummary(settlementSummary: JsonField<CardSettlementSummary>) = apply {
            this.settlementSummary = settlementSummary
        }

        /**
         * Lifecycle status of a card transaction.
         *
         * |Status             |Description                                                                                                                                                                                                                                    |
         * |-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * |`AUTHORIZED`       |The auth has been approved and a hold placed on the funding source; no clearing has arrived yet.                                                                                                                                               |
         * |`PARTIALLY_SETTLED`|At least one clearing has arrived and posted, but more clearings are still expected (split shipments, tips, multi-leg trips).                                                                                                                  |
         * |`SETTLED`          |All clearings for the auth have posted and the transaction is closed against the funding source.                                                                                                                                               |
         * |`REFUNDED`         |A `RETURN` was received from the merchant; the net settled amount has been refunded in part or whole.                                                                                                                                          |
         * |`EXCEPTION`        |The transaction settled to the card network but the corresponding pull from the funding source failed (e.g. balance no longer covers the post-hoc clearing). Surfaces high-urgency alerts and is the dashboard query for stuck reconciliations.|
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Last update timestamp. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Opaque identifier for the transaction on the underlying issuer. Used to cross-reference
         * Grid records against issuer dashboards and webhooks.
         */
        fun issuerTransactionToken(issuerTransactionToken: String) =
            issuerTransactionToken(JsonField.of(issuerTransactionToken))

        /**
         * Sets [Builder.issuerTransactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuerTransactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuerTransactionToken(issuerTransactionToken: JsonField<String>) = apply {
            this.issuerTransactionToken = issuerTransactionToken
        }

        /**
         * Timestamp of the most recent reconcile event (pull / clearing / refund) against this
         * transaction.
         */
        fun lastEventAt(lastEventAt: OffsetDateTime) = lastEventAt(JsonField.of(lastEventAt))

        /**
         * Sets [Builder.lastEventAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastEventAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastEventAt(lastEventAt: JsonField<OffsetDateTime>) = apply {
            this.lastEventAt = lastEventAt
        }

        fun refundedAmount(refundedAmount: CurrencyAmount) =
            refundedAmount(JsonField.of(refundedAmount))

        /**
         * Sets [Builder.refundedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundedAmount] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refundedAmount(refundedAmount: JsonField<CurrencyAmount>) = apply {
            this.refundedAmount = refundedAmount
        }

        fun settledAmount(settledAmount: CurrencyAmount) =
            settledAmount(JsonField.of(settledAmount))

        /**
         * Sets [Builder.settledAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAmount] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settledAmount(settledAmount: JsonField<CurrencyAmount>) = apply {
            this.settledAmount = settledAmount
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
         * Returns an immutable instance of [CardTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .authorizedAmount()
         * .authorizedAt()
         * .cardId()
         * .createdAt()
         * .merchant()
         * .pullSummary()
         * .refundSummary()
         * .settlementSummary()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardTransaction =
            CardTransaction(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("authorizedAmount", authorizedAmount),
                checkRequired("authorizedAt", authorizedAt),
                checkRequired("cardId", cardId),
                checkRequired("createdAt", createdAt),
                checkRequired("merchant", merchant),
                checkRequired("pullSummary", pullSummary),
                checkRequired("refundSummary", refundSummary),
                checkRequired("settlementSummary", settlementSummary),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                issuerTransactionToken,
                lastEventAt,
                refundedAmount,
                settledAmount,
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
    fun validate(): CardTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        authorizedAmount().validate()
        authorizedAt()
        cardId()
        createdAt()
        merchant().validate()
        pullSummary().validate()
        refundSummary().validate()
        settlementSummary().validate()
        status().validate()
        updatedAt()
        issuerTransactionToken()
        lastEventAt()
        refundedAmount()?.validate()
        settledAmount()?.validate()
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
            (if (accountId.asKnown() == null) 0 else 1) +
            (authorizedAmount.asKnown()?.validity() ?: 0) +
            (if (authorizedAt.asKnown() == null) 0 else 1) +
            (if (cardId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (merchant.asKnown()?.validity() ?: 0) +
            (pullSummary.asKnown()?.validity() ?: 0) +
            (refundSummary.asKnown()?.validity() ?: 0) +
            (settlementSummary.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (issuerTransactionToken.asKnown() == null) 0 else 1) +
            (if (lastEventAt.asKnown() == null) 0 else 1) +
            (refundedAmount.asKnown()?.validity() ?: 0) +
            (settledAmount.asKnown()?.validity() ?: 0)

    /**
     * Lifecycle status of a card transaction.
     *
     * |Status             |Description                                                                                                                                                                                                                                    |
     * |-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * |`AUTHORIZED`       |The auth has been approved and a hold placed on the funding source; no clearing has arrived yet.                                                                                                                                               |
     * |`PARTIALLY_SETTLED`|At least one clearing has arrived and posted, but more clearings are still expected (split shipments, tips, multi-leg trips).                                                                                                                  |
     * |`SETTLED`          |All clearings for the auth have posted and the transaction is closed against the funding source.                                                                                                                                               |
     * |`REFUNDED`         |A `RETURN` was received from the merchant; the net settled amount has been refunded in part or whole.                                                                                                                                          |
     * |`EXCEPTION`        |The transaction settled to the card network but the corresponding pull from the funding source failed (e.g. balance no longer covers the post-hoc clearing). Surfaces high-urgency alerts and is the dashboard query for stuck reconciliations.|
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

            val AUTHORIZED = of("AUTHORIZED")

            val PARTIALLY_SETTLED = of("PARTIALLY_SETTLED")

            val SETTLED = of("SETTLED")

            val REFUNDED = of("REFUNDED")

            val EXCEPTION = of("EXCEPTION")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            AUTHORIZED,
            PARTIALLY_SETTLED,
            SETTLED,
            REFUNDED,
            EXCEPTION,
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
            AUTHORIZED,
            PARTIALLY_SETTLED,
            SETTLED,
            REFUNDED,
            EXCEPTION,
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
                AUTHORIZED -> Value.AUTHORIZED
                PARTIALLY_SETTLED -> Value.PARTIALLY_SETTLED
                SETTLED -> Value.SETTLED
                REFUNDED -> Value.REFUNDED
                EXCEPTION -> Value.EXCEPTION
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
                AUTHORIZED -> Known.AUTHORIZED
                PARTIALLY_SETTLED -> Known.PARTIALLY_SETTLED
                SETTLED -> Known.SETTLED
                REFUNDED -> Known.REFUNDED
                EXCEPTION -> Known.EXCEPTION
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardTransaction &&
            id == other.id &&
            accountId == other.accountId &&
            authorizedAmount == other.authorizedAmount &&
            authorizedAt == other.authorizedAt &&
            cardId == other.cardId &&
            createdAt == other.createdAt &&
            merchant == other.merchant &&
            pullSummary == other.pullSummary &&
            refundSummary == other.refundSummary &&
            settlementSummary == other.settlementSummary &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            issuerTransactionToken == other.issuerTransactionToken &&
            lastEventAt == other.lastEventAt &&
            refundedAmount == other.refundedAmount &&
            settledAmount == other.settledAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            authorizedAmount,
            authorizedAt,
            cardId,
            createdAt,
            merchant,
            pullSummary,
            refundSummary,
            settlementSummary,
            status,
            updatedAt,
            issuerTransactionToken,
            lastEventAt,
            refundedAmount,
            settledAmount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardTransaction{id=$id, accountId=$accountId, authorizedAmount=$authorizedAmount, authorizedAt=$authorizedAt, cardId=$cardId, createdAt=$createdAt, merchant=$merchant, pullSummary=$pullSummary, refundSummary=$refundSummary, settlementSummary=$settlementSummary, status=$status, updatedAt=$updatedAt, issuerTransactionToken=$issuerTransactionToken, lastEventAt=$lastEventAt, refundedAmount=$refundedAmount, settledAmount=$settledAmount, additionalProperties=$additionalProperties}"
}
