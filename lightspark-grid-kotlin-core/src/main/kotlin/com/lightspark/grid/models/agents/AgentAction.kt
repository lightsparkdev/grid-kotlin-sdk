// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

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
import com.lightspark.grid.models.AgentTransferDetails
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transferin.Transaction
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * An action submitted by an agent that may require platform approval before execution. All
 * agent-initiated operations (quote execution, transfers) are represented as AgentActions, giving
 * the platform a consistent object to approve, reject, and audit regardless of the underlying
 * operation type.
 */
class AgentAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agentId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val platformCustomerId: JsonField<String>,
    private val status: JsonField<AgentActionStatus>,
    private val type: JsonField<AgentActionType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val quote: JsonField<Quote>,
    private val rejectionReason: JsonField<String>,
    private val transaction: JsonField<Transaction>,
    private val transferDetails: JsonField<AgentTransferDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        platformCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<AgentActionStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<AgentActionType> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("quote") @ExcludeMissing quote: JsonField<Quote> = JsonMissing.of(),
        @JsonProperty("rejectionReason")
        @ExcludeMissing
        rejectionReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        transaction: JsonField<Transaction> = JsonMissing.of(),
        @JsonProperty("transferDetails")
        @ExcludeMissing
        transferDetails: JsonField<AgentTransferDetails> = JsonMissing.of(),
    ) : this(
        id,
        agentId,
        createdAt,
        customerId,
        platformCustomerId,
        status,
        type,
        updatedAt,
        quote,
        rejectionReason,
        transaction,
        transferDetails,
        mutableMapOf(),
    )

    /**
     * System-generated unique identifier for this action.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The agent that submitted this action.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agentId")

    /**
     * When the action was submitted by the agent.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The customer on whose behalf the action was submitted.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * Platform-specific ID of the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

    /**
     * Status of an agent action.
     *
     * |Status            |Description                                                           |
     * |------------------|----------------------------------------------------------------------|
     * |`PENDING_APPROVAL`|Submitted by the agent, awaiting platform approval before execution   |
     * |`APPROVED`        |Approved by the platform; execution is in progress or completed       |
     * |`REJECTED`        |Rejected by the platform; the underlying transaction was not executed |
     * |`FAILED`          |Approved but execution failed (e.g. quote expired, insufficient funds)|
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): AgentActionStatus = status.getRequired("status")

    /**
     * The type of action the agent is requesting.
     *
     * | Type            | Description                                              |
     * |-----------------|----------------------------------------------------------|
     * | `EXECUTE_QUOTE` | Execute a cross-currency quote                           |
     * | `TRANSFER_OUT`  | Transfer from an internal account to an external account |
     * | `TRANSFER_IN`   | Transfer from an external account to an internal account |
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): AgentActionType = type.getRequired("type")

    /**
     * When the action was last updated.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The quote being executed. Populated for `EXECUTE_QUOTE` actions; absent for transfer actions.
     * Contains the full amount, currency, destination, and rate details needed to present an
     * approval decision to the user.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun quote(): Quote? = quote.getNullable("quote")

    /**
     * Human-readable reason provided by the platform when rejecting the action. Only present when
     * status is `REJECTED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rejectionReason(): String? = rejectionReason.getNullable("rejectionReason")

    /**
     * The resulting transaction, populated once the action has been approved and execution has
     * begun. Absent while the action is `PENDING_APPROVAL` or `REJECTED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transaction(): Transaction? = transaction.getNullable("transaction")

    /**
     * Details of the transfer being requested. Populated for `TRANSFER_OUT` and `TRANSFER_IN`
     * actions; absent for `EXECUTE_QUOTE` actions.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transferDetails(): AgentTransferDetails? = transferDetails.getNullable("transferDetails")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<AgentActionStatus> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AgentActionType> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [quote].
     *
     * Unlike [quote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quote") @ExcludeMissing fun _quote(): JsonField<Quote> = quote

    /**
     * Returns the raw JSON value of [rejectionReason].
     *
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejectionReason")
    @ExcludeMissing
    fun _rejectionReason(): JsonField<String> = rejectionReason

    /**
     * Returns the raw JSON value of [transaction].
     *
     * Unlike [transaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction")
    @ExcludeMissing
    fun _transaction(): JsonField<Transaction> = transaction

    /**
     * Returns the raw JSON value of [transferDetails].
     *
     * Unlike [transferDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transferDetails")
    @ExcludeMissing
    fun _transferDetails(): JsonField<AgentTransferDetails> = transferDetails

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
         * Returns a mutable builder for constructing an instance of [AgentAction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .agentId()
         * .createdAt()
         * .customerId()
         * .platformCustomerId()
         * .status()
         * .type()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentAction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var agentId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var platformCustomerId: JsonField<String>? = null
        private var status: JsonField<AgentActionStatus>? = null
        private var type: JsonField<AgentActionType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var quote: JsonField<Quote> = JsonMissing.of()
        private var rejectionReason: JsonField<String> = JsonMissing.of()
        private var transaction: JsonField<Transaction> = JsonMissing.of()
        private var transferDetails: JsonField<AgentTransferDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentAction: AgentAction) = apply {
            id = agentAction.id
            agentId = agentAction.agentId
            createdAt = agentAction.createdAt
            customerId = agentAction.customerId
            platformCustomerId = agentAction.platformCustomerId
            status = agentAction.status
            type = agentAction.type
            updatedAt = agentAction.updatedAt
            quote = agentAction.quote
            rejectionReason = agentAction.rejectionReason
            transaction = agentAction.transaction
            transferDetails = agentAction.transferDetails
            additionalProperties = agentAction.additionalProperties.toMutableMap()
        }

        /** System-generated unique identifier for this action. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The agent that submitted this action. */
        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /** When the action was submitted by the agent. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The customer on whose behalf the action was submitted. */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** Platform-specific ID of the customer. */
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
         * Status of an agent action.
         *
         * |Status            |Description                                                           |
         * |------------------|----------------------------------------------------------------------|
         * |`PENDING_APPROVAL`|Submitted by the agent, awaiting platform approval before execution   |
         * |`APPROVED`        |Approved by the platform; execution is in progress or completed       |
         * |`REJECTED`        |Rejected by the platform; the underlying transaction was not executed |
         * |`FAILED`          |Approved but execution failed (e.g. quote expired, insufficient funds)|
         */
        fun status(status: AgentActionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [AgentActionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<AgentActionStatus>) = apply { this.status = status }

        /**
         * The type of action the agent is requesting.
         *
         * | Type            | Description                                              |
         * |-----------------|----------------------------------------------------------|
         * | `EXECUTE_QUOTE` | Execute a cross-currency quote                           |
         * | `TRANSFER_OUT`  | Transfer from an internal account to an external account |
         * | `TRANSFER_IN`   | Transfer from an external account to an internal account |
         */
        fun type(type: AgentActionType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [AgentActionType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<AgentActionType>) = apply { this.type = type }

        /** When the action was last updated. */
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
         * The quote being executed. Populated for `EXECUTE_QUOTE` actions; absent for transfer
         * actions. Contains the full amount, currency, destination, and rate details needed to
         * present an approval decision to the user.
         */
        fun quote(quote: Quote) = quote(JsonField.of(quote))

        /**
         * Sets [Builder.quote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quote] with a well-typed [Quote] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quote(quote: JsonField<Quote>) = apply { this.quote = quote }

        /**
         * Human-readable reason provided by the platform when rejecting the action. Only present
         * when status is `REJECTED`.
         */
        fun rejectionReason(rejectionReason: String) =
            rejectionReason(JsonField.of(rejectionReason))

        /**
         * Sets [Builder.rejectionReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectionReason(rejectionReason: JsonField<String>) = apply {
            this.rejectionReason = rejectionReason
        }

        /**
         * The resulting transaction, populated once the action has been approved and execution has
         * begun. Absent while the action is `PENDING_APPROVAL` or `REJECTED`.
         */
        fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

        /**
         * Sets [Builder.transaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transaction] with a well-typed [Transaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
        }

        /** Alias for calling [transaction] with `Transaction.ofIncoming(incoming)`. */
        fun transaction(incoming: IncomingTransaction) =
            transaction(Transaction.ofIncoming(incoming))

        /** Alias for calling [transaction] with `Transaction.ofOutgoing(outgoing)`. */
        fun transaction(outgoing: OutgoingTransaction) =
            transaction(Transaction.ofOutgoing(outgoing))

        /**
         * Details of the transfer being requested. Populated for `TRANSFER_OUT` and `TRANSFER_IN`
         * actions; absent for `EXECUTE_QUOTE` actions.
         */
        fun transferDetails(transferDetails: AgentTransferDetails) =
            transferDetails(JsonField.of(transferDetails))

        /**
         * Sets [Builder.transferDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transferDetails] with a well-typed
         * [AgentTransferDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun transferDetails(transferDetails: JsonField<AgentTransferDetails>) = apply {
            this.transferDetails = transferDetails
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
         * Returns an immutable instance of [AgentAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .agentId()
         * .createdAt()
         * .customerId()
         * .platformCustomerId()
         * .status()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentAction =
            AgentAction(
                checkRequired("id", id),
                checkRequired("agentId", agentId),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("platformCustomerId", platformCustomerId),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                quote,
                rejectionReason,
                transaction,
                transferDetails,
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
    fun validate(): AgentAction = apply {
        if (validated) {
            return@apply
        }

        id()
        agentId()
        createdAt()
        customerId()
        platformCustomerId()
        status().validate()
        type().validate()
        updatedAt()
        quote()?.validate()
        rejectionReason()
        transaction()?.validate()
        transferDetails()?.validate()
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
            (if (agentId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (quote.asKnown()?.validity() ?: 0) +
            (if (rejectionReason.asKnown() == null) 0 else 1) +
            (transaction.asKnown()?.validity() ?: 0) +
            (transferDetails.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentAction &&
            id == other.id &&
            agentId == other.agentId &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            platformCustomerId == other.platformCustomerId &&
            status == other.status &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            quote == other.quote &&
            rejectionReason == other.rejectionReason &&
            transaction == other.transaction &&
            transferDetails == other.transferDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentId,
            createdAt,
            customerId,
            platformCustomerId,
            status,
            type,
            updatedAt,
            quote,
            rejectionReason,
            transaction,
            transferDetails,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentAction{id=$id, agentId=$agentId, createdAt=$createdAt, customerId=$customerId, platformCustomerId=$platformCustomerId, status=$status, type=$type, updatedAt=$updatedAt, quote=$quote, rejectionReason=$rejectionReason, transaction=$transaction, transferDetails=$transferDetails, additionalProperties=$additionalProperties}"
}
