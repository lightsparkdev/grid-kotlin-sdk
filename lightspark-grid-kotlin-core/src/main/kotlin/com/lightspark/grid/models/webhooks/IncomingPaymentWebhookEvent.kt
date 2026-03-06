// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

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
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.transactions.TransactionType
import com.lightspark.grid.models.transferin.Transaction
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class IncomingPaymentWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, data, timestamp, type, mutableMapOf())

    /**
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * ISO 8601 timestamp of when the webhook was sent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [IncomingPaymentWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IncomingPaymentWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(incomingPaymentWebhookEvent: IncomingPaymentWebhookEvent) = apply {
            id = incomingPaymentWebhookEvent.id
            data = incomingPaymentWebhookEvent.data
            timestamp = incomingPaymentWebhookEvent.timestamp
            type = incomingPaymentWebhookEvent.type
            additionalProperties = incomingPaymentWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this webhook delivery (can be used for idempotency) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** ISO 8601 timestamp of when the webhook was sent */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [IncomingPaymentWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IncomingPaymentWebhookEvent =
            IncomingPaymentWebhookEvent(
                checkRequired("id", id),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IncomingPaymentWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        data().validate()
        timestamp()
        type().validate()
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
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val customerId: JsonField<String>,
        private val destination: JsonField<Transaction.Destination>,
        private val platformCustomerId: JsonField<String>,
        private val status: JsonField<TransactionStatus>,
        private val type: JsonField<TransactionType>,
        private val counterpartyInformation: JsonField<Transaction.CounterpartyInformation>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val settledAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val receivedAmount: JsonField<CurrencyAmount>,
        private val failureReason: JsonField<IncomingTransaction.FailureReason>,
        private val rateDetails: JsonField<IncomingTransaction.RateDetails>,
        private val reconciliationInstructions:
            JsonField<IncomingTransaction.ReconciliationInstructions>,
        private val source: JsonField<TransactionSourceOneOf>,
        private val requestedReceiverCustomerInfoFields:
            JsonField<List<CounterpartyFieldDefinition>>,
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
            destination: JsonField<Transaction.Destination> = JsonMissing.of(),
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
            counterpartyInformation: JsonField<Transaction.CounterpartyInformation> =
                JsonMissing.of(),
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
            @JsonProperty("receivedAmount")
            @ExcludeMissing
            receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
            @JsonProperty("failureReason")
            @ExcludeMissing
            failureReason: JsonField<IncomingTransaction.FailureReason> = JsonMissing.of(),
            @JsonProperty("rateDetails")
            @ExcludeMissing
            rateDetails: JsonField<IncomingTransaction.RateDetails> = JsonMissing.of(),
            @JsonProperty("reconciliationInstructions")
            @ExcludeMissing
            reconciliationInstructions: JsonField<IncomingTransaction.ReconciliationInstructions> =
                JsonMissing.of(),
            @JsonProperty("source")
            @ExcludeMissing
            source: JsonField<TransactionSourceOneOf> = JsonMissing.of(),
            @JsonProperty("requestedReceiverCustomerInfoFields")
            @ExcludeMissing
            requestedReceiverCustomerInfoFields: JsonField<List<CounterpartyFieldDefinition>> =
                JsonMissing.of(),
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
            receivedAmount,
            failureReason,
            rateDetails,
            reconciliationInstructions,
            source,
            requestedReceiverCustomerInfoFields,
            mutableMapOf(),
        )

        fun toIncomingTransaction(): IncomingTransaction =
            IncomingTransaction.builder()
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
                .receivedAmount(receivedAmount)
                .failureReason(failureReason)
                .rateDetails(rateDetails)
                .reconciliationInstructions(reconciliationInstructions)
                .source(source)
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
        fun destination(): Transaction.Destination = destination.getRequired("destination")

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
        fun counterpartyInformation(): Transaction.CounterpartyInformation? =
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
         * Amount received in the recipient's currency
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receivedAmount(): CurrencyAmount = receivedAmount.getRequired("receivedAmount")

        /**
         * If the transaction failed, this field provides the reason for failure.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun failureReason(): IncomingTransaction.FailureReason? =
            failureReason.getNullable("failureReason")

        /**
         * Details about the rate and fees for the transaction.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rateDetails(): IncomingTransaction.RateDetails? = rateDetails.getNullable("rateDetails")

        /**
         * Included for all transactions except those with "CREATED" status
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reconciliationInstructions(): IncomingTransaction.ReconciliationInstructions? =
            reconciliationInstructions.getNullable("reconciliationInstructions")

        /**
         * Source account details
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): TransactionSourceOneOf? = source.getNullable("source")

        /**
         * Information required by the sender's VASP about the recipient. Platform must provide
         * these in the 200 OK response if approving. Note that this only includes fields which Grid
         * does not already have from initial customer registration.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun requestedReceiverCustomerInfoFields(): List<CounterpartyFieldDefinition>? =
            requestedReceiverCustomerInfoFields.getNullable("requestedReceiverCustomerInfoFields")

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
        fun _destination(): JsonField<Transaction.Destination> = destination

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
        fun _counterpartyInformation(): JsonField<Transaction.CounterpartyInformation> =
            counterpartyInformation

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
         * Returns the raw JSON value of [receivedAmount].
         *
         * Unlike [receivedAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receivedAmount")
        @ExcludeMissing
        fun _receivedAmount(): JsonField<CurrencyAmount> = receivedAmount

        /**
         * Returns the raw JSON value of [failureReason].
         *
         * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failureReason")
        @ExcludeMissing
        fun _failureReason(): JsonField<IncomingTransaction.FailureReason> = failureReason

        /**
         * Returns the raw JSON value of [rateDetails].
         *
         * Unlike [rateDetails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rateDetails")
        @ExcludeMissing
        fun _rateDetails(): JsonField<IncomingTransaction.RateDetails> = rateDetails

        /**
         * Returns the raw JSON value of [reconciliationInstructions].
         *
         * Unlike [reconciliationInstructions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reconciliationInstructions")
        @ExcludeMissing
        fun _reconciliationInstructions():
            JsonField<IncomingTransaction.ReconciliationInstructions> = reconciliationInstructions

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<TransactionSourceOneOf> = source

        /**
         * Returns the raw JSON value of [requestedReceiverCustomerInfoFields].
         *
         * Unlike [requestedReceiverCustomerInfoFields], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("requestedReceiverCustomerInfoFields")
        @ExcludeMissing
        fun _requestedReceiverCustomerInfoFields(): JsonField<List<CounterpartyFieldDefinition>> =
            requestedReceiverCustomerInfoFields

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .customerId()
             * .destination()
             * .platformCustomerId()
             * .status()
             * .type()
             * .receivedAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var destination: JsonField<Transaction.Destination>? = null
            private var platformCustomerId: JsonField<String>? = null
            private var status: JsonField<TransactionStatus>? = null
            private var type: JsonField<TransactionType>? = null
            private var counterpartyInformation: JsonField<Transaction.CounterpartyInformation> =
                JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var receivedAmount: JsonField<CurrencyAmount>? = null
            private var failureReason: JsonField<IncomingTransaction.FailureReason> =
                JsonMissing.of()
            private var rateDetails: JsonField<IncomingTransaction.RateDetails> = JsonMissing.of()
            private var reconciliationInstructions:
                JsonField<IncomingTransaction.ReconciliationInstructions> =
                JsonMissing.of()
            private var source: JsonField<TransactionSourceOneOf> = JsonMissing.of()
            private var requestedReceiverCustomerInfoFields:
                JsonField<MutableList<CounterpartyFieldDefinition>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                customerId = data.customerId
                destination = data.destination
                platformCustomerId = data.platformCustomerId
                status = data.status
                type = data.type
                counterpartyInformation = data.counterpartyInformation
                createdAt = data.createdAt
                description = data.description
                settledAt = data.settledAt
                updatedAt = data.updatedAt
                receivedAmount = data.receivedAmount
                failureReason = data.failureReason
                rateDetails = data.rateDetails
                reconciliationInstructions = data.reconciliationInstructions
                source = data.source
                requestedReceiverCustomerInfoFields =
                    data.requestedReceiverCustomerInfoFields.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
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
            fun destination(destination: Transaction.Destination) =
                destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed
             * [Transaction.Destination] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun destination(destination: JsonField<Transaction.Destination>) = apply {
                this.destination = destination
            }

            /**
             * Alias for calling [destination] with `Transaction.Destination.ofAccount(account)`.
             */
            fun destination(account: Transaction.Destination.Account) =
                destination(Transaction.Destination.ofAccount(account))

            /**
             * Alias for calling [destination] with the following:
             * ```kotlin
             * Transaction.Destination.Account.builder()
             *     .destinationType(Transaction.Destination.Account.DestinationType.ACCOUNT)
             *     .accountId(accountId)
             *     .build()
             * ```
             */
            fun accountDestination(accountId: String) =
                destination(
                    Transaction.Destination.Account.builder()
                        .destinationType(Transaction.Destination.Account.DestinationType.ACCOUNT)
                        .accountId(accountId)
                        .build()
                )

            /**
             * Alias for calling [destination] with
             * `Transaction.Destination.ofUmaAddress(umaAddress)`.
             */
            fun destination(umaAddress: Transaction.Destination.UmaAddress) =
                destination(Transaction.Destination.ofUmaAddress(umaAddress))

            /**
             * Alias for calling [destination] with the following:
             * ```kotlin
             * Transaction.Destination.UmaAddress.builder()
             *     .destinationType(Transaction.Destination.UmaAddress.DestinationType.UMA_ADDRESS)
             *     .umaAddress(umaAddress)
             *     .build()
             * ```
             */
            fun umaAddressDestination(umaAddress: String) =
                destination(
                    Transaction.Destination.UmaAddress.builder()
                        .destinationType(
                            Transaction.Destination.UmaAddress.DestinationType.UMA_ADDRESS
                        )
                        .umaAddress(umaAddress)
                        .build()
                )

            /**
             * Alias for calling [destination] with
             * `Transaction.Destination.ofExternalAccountDetails(externalAccountDetails)`.
             */
            fun destination(
                externalAccountDetails: Transaction.Destination.ExternalAccountDetails
            ) =
                destination(
                    Transaction.Destination.ofExternalAccountDetails(externalAccountDetails)
                )

            /**
             * Alias for calling [destination] with the following:
             * ```kotlin
             * Transaction.Destination.ExternalAccountDetails.builder()
             *     .destinationType(Transaction.Destination.ExternalAccountDetails.DestinationType.EXTERNAL_ACCOUNT_DETAILS)
             *     .externalAccountDetails(externalAccountDetails)
             *     .build()
             * ```
             */
            fun externalAccountDetailsDestination(externalAccountDetails: ExternalAccountCreate) =
                destination(
                    Transaction.Destination.ExternalAccountDetails.builder()
                        .destinationType(
                            Transaction.Destination.ExternalAccountDetails.DestinationType
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
            fun counterpartyInformation(
                counterpartyInformation: Transaction.CounterpartyInformation
            ) = counterpartyInformation(JsonField.of(counterpartyInformation))

            /**
             * Sets [Builder.counterpartyInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterpartyInformation] with a well-typed
             * [Transaction.CounterpartyInformation] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun counterpartyInformation(
                counterpartyInformation: JsonField<Transaction.CounterpartyInformation>
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

            /** Amount received in the recipient's currency */
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

            /** If the transaction failed, this field provides the reason for failure. */
            fun failureReason(failureReason: IncomingTransaction.FailureReason) =
                failureReason(JsonField.of(failureReason))

            /**
             * Sets [Builder.failureReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureReason] with a well-typed
             * [IncomingTransaction.FailureReason] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun failureReason(failureReason: JsonField<IncomingTransaction.FailureReason>) = apply {
                this.failureReason = failureReason
            }

            /** Details about the rate and fees for the transaction. */
            fun rateDetails(rateDetails: IncomingTransaction.RateDetails) =
                rateDetails(JsonField.of(rateDetails))

            /**
             * Sets [Builder.rateDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateDetails] with a well-typed
             * [IncomingTransaction.RateDetails] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun rateDetails(rateDetails: JsonField<IncomingTransaction.RateDetails>) = apply {
                this.rateDetails = rateDetails
            }

            /** Included for all transactions except those with "CREATED" status */
            fun reconciliationInstructions(
                reconciliationInstructions: IncomingTransaction.ReconciliationInstructions
            ) = reconciliationInstructions(JsonField.of(reconciliationInstructions))

            /**
             * Sets [Builder.reconciliationInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reconciliationInstructions] with a well-typed
             * [IncomingTransaction.ReconciliationInstructions] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun reconciliationInstructions(
                reconciliationInstructions:
                    JsonField<IncomingTransaction.ReconciliationInstructions>
            ) = apply { this.reconciliationInstructions = reconciliationInstructions }

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

            /**
             * Information required by the sender's VASP about the recipient. Platform must provide
             * these in the 200 OK response if approving. Note that this only includes fields which
             * Grid does not already have from initial customer registration.
             */
            fun requestedReceiverCustomerInfoFields(
                requestedReceiverCustomerInfoFields: List<CounterpartyFieldDefinition>
            ) =
                requestedReceiverCustomerInfoFields(
                    JsonField.of(requestedReceiverCustomerInfoFields)
                )

            /**
             * Sets [Builder.requestedReceiverCustomerInfoFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedReceiverCustomerInfoFields] with a
             * well-typed `List<CounterpartyFieldDefinition>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun requestedReceiverCustomerInfoFields(
                requestedReceiverCustomerInfoFields: JsonField<List<CounterpartyFieldDefinition>>
            ) = apply {
                this.requestedReceiverCustomerInfoFields =
                    requestedReceiverCustomerInfoFields.map { it.toMutableList() }
            }

            /**
             * Adds a single [CounterpartyFieldDefinition] to [requestedReceiverCustomerInfoFields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequestedReceiverCustomerInfoField(
                requestedReceiverCustomerInfoField: CounterpartyFieldDefinition
            ) = apply {
                requestedReceiverCustomerInfoFields =
                    (requestedReceiverCustomerInfoFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requestedReceiverCustomerInfoFields", it)
                            .add(requestedReceiverCustomerInfoField)
                    }
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
             * Returns an immutable instance of [Data].
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
             * .receivedAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
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
                    checkRequired("receivedAmount", receivedAmount),
                    failureReason,
                    rateDetails,
                    reconciliationInstructions,
                    source,
                    (requestedReceiverCustomerInfoFields ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
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
            receivedAmount().validate()
            failureReason()?.validate()
            rateDetails()?.validate()
            reconciliationInstructions()?.validate()
            source()?.validate()
            requestedReceiverCustomerInfoFields()?.forEach { it.validate() }
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
                (receivedAmount.asKnown()?.validity() ?: 0) +
                (failureReason.asKnown()?.validity() ?: 0) +
                (rateDetails.asKnown()?.validity() ?: 0) +
                (reconciliationInstructions.asKnown()?.validity() ?: 0) +
                (source.asKnown()?.validity() ?: 0) +
                (requestedReceiverCustomerInfoFields.asKnown()?.sumOf { it.validity().toInt() }
                    ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
                receivedAmount == other.receivedAmount &&
                failureReason == other.failureReason &&
                rateDetails == other.rateDetails &&
                reconciliationInstructions == other.reconciliationInstructions &&
                source == other.source &&
                requestedReceiverCustomerInfoFields == other.requestedReceiverCustomerInfoFields &&
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
                receivedAmount,
                failureReason,
                rateDetails,
                reconciliationInstructions,
                source,
                requestedReceiverCustomerInfoFields,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, customerId=$customerId, destination=$destination, platformCustomerId=$platformCustomerId, status=$status, type=$type, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, settledAt=$settledAt, updatedAt=$updatedAt, receivedAmount=$receivedAmount, failureReason=$failureReason, rateDetails=$rateDetails, reconciliationInstructions=$reconciliationInstructions, source=$source, requestedReceiverCustomerInfoFields=$requestedReceiverCustomerInfoFields, additionalProperties=$additionalProperties}"
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

            val INCOMING_PAYMENT_PENDING = of("INCOMING_PAYMENT.PENDING")

            val INCOMING_PAYMENT_COMPLETED = of("INCOMING_PAYMENT.COMPLETED")

            val INCOMING_PAYMENT_FAILED = of("INCOMING_PAYMENT.FAILED")

            val OUTGOING_PAYMENT_PENDING = of("OUTGOING_PAYMENT.PENDING")

            val OUTGOING_PAYMENT_PROCESSING = of("OUTGOING_PAYMENT.PROCESSING")

            val OUTGOING_PAYMENT_COMPLETED = of("OUTGOING_PAYMENT.COMPLETED")

            val OUTGOING_PAYMENT_FAILED = of("OUTGOING_PAYMENT.FAILED")

            val OUTGOING_PAYMENT_EXPIRED = of("OUTGOING_PAYMENT.EXPIRED")

            val OUTGOING_PAYMENT_REFUND_PENDING = of("OUTGOING_PAYMENT.REFUND_PENDING")

            val OUTGOING_PAYMENT_REFUND_COMPLETED = of("OUTGOING_PAYMENT.REFUND_COMPLETED")

            val OUTGOING_PAYMENT_REFUND_FAILED = of("OUTGOING_PAYMENT.REFUND_FAILED")

            val CUSTOMER_KYC_APPROVED = of("CUSTOMER.KYC_APPROVED")

            val CUSTOMER_KYC_REJECTED = of("CUSTOMER.KYC_REJECTED")

            val CUSTOMER_KYC_SUBMITTED = of("CUSTOMER.KYC_SUBMITTED")

            val CUSTOMER_KYC_MANUALLY_APPROVED = of("CUSTOMER.KYC_MANUALLY_APPROVED")

            val CUSTOMER_KYC_MANUALLY_REJECTED = of("CUSTOMER.KYC_MANUALLY_REJECTED")

            val CUSTOMER_KYB_APPROVED = of("CUSTOMER.KYB_APPROVED")

            val CUSTOMER_KYB_REJECTED = of("CUSTOMER.KYB_REJECTED")

            val CUSTOMER_KYB_SUBMITTED = of("CUSTOMER.KYB_SUBMITTED")

            val CUSTOMER_KYB_MANUALLY_APPROVED = of("CUSTOMER.KYB_MANUALLY_APPROVED")

            val CUSTOMER_KYB_MANUALLY_REJECTED = of("CUSTOMER.KYB_MANUALLY_REJECTED")

            val INTERNAL_ACCOUNT_BALANCE_UPDATED = of("INTERNAL_ACCOUNT.BALANCE_UPDATED")

            val INVITATION_CLAIMED = of("INVITATION.CLAIMED")

            val BULK_UPLOAD_COMPLETED = of("BULK_UPLOAD.COMPLETED")

            val BULK_UPLOAD_FAILED = of("BULK_UPLOAD.FAILED")

            val TEST = of("TEST")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_SUBMITTED,
            CUSTOMER_KYC_MANUALLY_APPROVED,
            CUSTOMER_KYC_MANUALLY_REJECTED,
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_SUBMITTED,
            CUSTOMER_KYB_MANUALLY_APPROVED,
            CUSTOMER_KYB_MANUALLY_REJECTED,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            TEST,
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
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_SUBMITTED,
            CUSTOMER_KYC_MANUALLY_APPROVED,
            CUSTOMER_KYC_MANUALLY_REJECTED,
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_SUBMITTED,
            CUSTOMER_KYB_MANUALLY_APPROVED,
            CUSTOMER_KYB_MANUALLY_REJECTED,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            TEST,
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
                INCOMING_PAYMENT_PENDING -> Value.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Value.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Value.INCOMING_PAYMENT_FAILED
                OUTGOING_PAYMENT_PENDING -> Value.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Value.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Value.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Value.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Value.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Value.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Value.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Value.OUTGOING_PAYMENT_REFUND_FAILED
                CUSTOMER_KYC_APPROVED -> Value.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Value.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_SUBMITTED -> Value.CUSTOMER_KYC_SUBMITTED
                CUSTOMER_KYC_MANUALLY_APPROVED -> Value.CUSTOMER_KYC_MANUALLY_APPROVED
                CUSTOMER_KYC_MANUALLY_REJECTED -> Value.CUSTOMER_KYC_MANUALLY_REJECTED
                CUSTOMER_KYB_APPROVED -> Value.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Value.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_SUBMITTED -> Value.CUSTOMER_KYB_SUBMITTED
                CUSTOMER_KYB_MANUALLY_APPROVED -> Value.CUSTOMER_KYB_MANUALLY_APPROVED
                CUSTOMER_KYB_MANUALLY_REJECTED -> Value.CUSTOMER_KYB_MANUALLY_REJECTED
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Value.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Value.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Value.BULK_UPLOAD_FAILED
                TEST -> Value.TEST
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
                INCOMING_PAYMENT_PENDING -> Known.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Known.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Known.INCOMING_PAYMENT_FAILED
                OUTGOING_PAYMENT_PENDING -> Known.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Known.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Known.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Known.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Known.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Known.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Known.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Known.OUTGOING_PAYMENT_REFUND_FAILED
                CUSTOMER_KYC_APPROVED -> Known.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Known.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_SUBMITTED -> Known.CUSTOMER_KYC_SUBMITTED
                CUSTOMER_KYC_MANUALLY_APPROVED -> Known.CUSTOMER_KYC_MANUALLY_APPROVED
                CUSTOMER_KYC_MANUALLY_REJECTED -> Known.CUSTOMER_KYC_MANUALLY_REJECTED
                CUSTOMER_KYB_APPROVED -> Known.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Known.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_SUBMITTED -> Known.CUSTOMER_KYB_SUBMITTED
                CUSTOMER_KYB_MANUALLY_APPROVED -> Known.CUSTOMER_KYB_MANUALLY_APPROVED
                CUSTOMER_KYB_MANUALLY_REJECTED -> Known.CUSTOMER_KYB_MANUALLY_REJECTED
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Known.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Known.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Known.BULK_UPLOAD_FAILED
                TEST -> Known.TEST
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IncomingPaymentWebhookEvent &&
            id == other.id &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IncomingPaymentWebhookEvent{id=$id, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
