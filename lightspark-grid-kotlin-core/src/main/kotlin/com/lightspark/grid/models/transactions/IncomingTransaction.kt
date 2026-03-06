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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.transferin.BaseTransactionDestination
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class IncomingTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val destination: JsonField<Destination>,
    private val platformCustomerId: JsonField<String>,
    private val receivedAmount: JsonField<CurrencyAmount>,
    private val status: JsonField<TransactionStatus>,
    private val type: JsonField<Type>,
    private val counterpartyInformation: JsonField<CounterpartyInformation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val failureReason: JsonField<FailureReason>,
    private val rateDetails: JsonField<RateDetails>,
    private val reconciliationInstructions: JsonField<ReconciliationInstructions>,
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
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<Destination> = JsonMissing.of(),
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        platformCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receivedAmount")
        @ExcludeMissing
        receivedAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<TransactionStatus> = JsonMissing.of(),
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
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<FailureReason> = JsonMissing.of(),
        @JsonProperty("rateDetails")
        @ExcludeMissing
        rateDetails: JsonField<RateDetails> = JsonMissing.of(),
        @JsonProperty("reconciliationInstructions")
        @ExcludeMissing
        reconciliationInstructions: JsonField<ReconciliationInstructions> = JsonMissing.of(),
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
        platformCustomerId,
        receivedAmount,
        status,
        type,
        counterpartyInformation,
        createdAt,
        description,
        failureReason,
        rateDetails,
        reconciliationInstructions,
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
     * Amount received in the recipient's currency
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun receivedAmount(): CurrencyAmount = receivedAmount.getRequired("receivedAmount")

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
     * If the transaction failed, this field provides the reason for failure.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun failureReason(): FailureReason? = failureReason.getNullable("failureReason")

    /**
     * Details about the rate and fees for the transaction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rateDetails(): RateDetails? = rateDetails.getNullable("rateDetails")

    /**
     * Included for all transactions except those with "CREATED" status
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciliationInstructions(): ReconciliationInstructions? =
        reconciliationInstructions.getNullable("reconciliationInstructions")

    /**
     * When the payment was or will be settled
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

    /**
     * Source account details
     *
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
     * Returns the raw JSON value of [receivedAmount].
     *
     * Unlike [receivedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivedAmount")
    @ExcludeMissing
    fun _receivedAmount(): JsonField<CurrencyAmount> = receivedAmount

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
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReason")
    @ExcludeMissing
    fun _failureReason(): JsonField<FailureReason> = failureReason

    /**
     * Returns the raw JSON value of [rateDetails].
     *
     * Unlike [rateDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rateDetails")
    @ExcludeMissing
    fun _rateDetails(): JsonField<RateDetails> = rateDetails

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
         * .platformCustomerId()
         * .receivedAmount()
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
        private var destination: JsonField<Destination>? = null
        private var platformCustomerId: JsonField<String>? = null
        private var receivedAmount: JsonField<CurrencyAmount>? = null
        private var status: JsonField<TransactionStatus>? = null
        private var type: JsonField<Type>? = null
        private var counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var failureReason: JsonField<FailureReason> = JsonMissing.of()
        private var rateDetails: JsonField<RateDetails> = JsonMissing.of()
        private var reconciliationInstructions: JsonField<ReconciliationInstructions> =
            JsonMissing.of()
        private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var source: JsonField<TransactionSourceOneOf> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(incomingTransaction: IncomingTransaction) = apply {
            id = incomingTransaction.id
            customerId = incomingTransaction.customerId
            destination = incomingTransaction.destination
            platformCustomerId = incomingTransaction.platformCustomerId
            receivedAmount = incomingTransaction.receivedAmount
            status = incomingTransaction.status
            type = incomingTransaction.type
            counterpartyInformation = incomingTransaction.counterpartyInformation
            createdAt = incomingTransaction.createdAt
            description = incomingTransaction.description
            failureReason = incomingTransaction.failureReason
            rateDetails = incomingTransaction.rateDetails
            reconciliationInstructions = incomingTransaction.reconciliationInstructions
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

        /** Alias for calling [destination] with `Destination.ofAccount(account)`. */
        fun destination(account: Destination.Account) = destination(Destination.ofAccount(account))

        /**
         * Alias for calling [destination] with the following:
         * ```kotlin
         * Destination.Account.builder()
         *     .destinationType(IncomingTransaction.Destination.Account.DestinationType.ACCOUNT)
         *     .accountId(accountId)
         *     .build()
         * ```
         */
        fun accountDestination(accountId: String) =
            destination(
                Destination.Account.builder()
                    .destinationType(
                        IncomingTransaction.Destination.Account.DestinationType.ACCOUNT
                    )
                    .accountId(accountId)
                    .build()
            )

        /** Alias for calling [destination] with `Destination.ofUmaAddress(umaAddress)`. */
        fun destination(umaAddress: Destination.UmaAddress) =
            destination(Destination.ofUmaAddress(umaAddress))

        /**
         * Alias for calling [destination] with the following:
         * ```kotlin
         * Destination.UmaAddress.builder()
         *     .destinationType(IncomingTransaction.Destination.UmaAddress.DestinationType.UMA_ADDRESS)
         *     .umaAddress(umaAddress)
         *     .build()
         * ```
         */
        fun umaAddressDestination(umaAddress: String) =
            destination(
                Destination.UmaAddress.builder()
                    .destinationType(
                        IncomingTransaction.Destination.UmaAddress.DestinationType.UMA_ADDRESS
                    )
                    .umaAddress(umaAddress)
                    .build()
            )

        /**
         * Alias for calling [destination] with
         * `Destination.ofExternalAccountDetails(externalAccountDetails)`.
         */
        fun destination(externalAccountDetails: Destination.ExternalAccountDetails) =
            destination(Destination.ofExternalAccountDetails(externalAccountDetails))

        /**
         * Alias for calling [destination] with the following:
         * ```kotlin
         * Destination.ExternalAccountDetails.builder()
         *     .destinationType(IncomingTransaction.Destination.ExternalAccountDetails.DestinationType.EXTERNAL_ACCOUNT_DETAILS)
         *     .externalAccountDetails(externalAccountDetails)
         *     .build()
         * ```
         */
        fun externalAccountDetailsDestination(externalAccountDetails: ExternalAccountCreate) =
            destination(
                Destination.ExternalAccountDetails.builder()
                    .destinationType(
                        IncomingTransaction.Destination.ExternalAccountDetails.DestinationType
                            .EXTERNAL_ACCOUNT_DETAILS
                    )
                    .externalAccountDetails(externalAccountDetails)
                    .build()
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

        /** Amount received in the recipient's currency */
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

        /** Details about the rate and fees for the transaction. */
        fun rateDetails(rateDetails: RateDetails) = rateDetails(JsonField.of(rateDetails))

        /**
         * Sets [Builder.rateDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateDetails] with a well-typed [RateDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rateDetails(rateDetails: JsonField<RateDetails>) = apply {
            this.rateDetails = rateDetails
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

        /** Alias for calling [source] with `TransactionSourceOneOf.ofUmaAddress(umaAddress)`. */
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
                    .sourceType(TransactionSourceOneOf.RealtimeFunding.SourceType.REALTIME_FUNDING)
                    .currency(currency)
                    .build()
            )

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
         * .platformCustomerId()
         * .receivedAmount()
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
                checkRequired("platformCustomerId", platformCustomerId),
                checkRequired("receivedAmount", receivedAmount),
                checkRequired("status", status),
                checkRequired("type", type),
                counterpartyInformation,
                createdAt,
                description,
                failureReason,
                rateDetails,
                reconciliationInstructions,
                settledAt,
                source,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IncomingTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        customerId()
        destination().validate()
        platformCustomerId()
        receivedAmount().validate()
        status().validate()
        type().validate()
        counterpartyInformation()?.validate()
        createdAt()
        description()
        failureReason()?.validate()
        rateDetails()?.validate()
        reconciliationInstructions()?.validate()
        settledAt()
        source()?.validate()
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
            (receivedAmount.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (counterpartyInformation.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (failureReason.asKnown()?.validity() ?: 0) +
            (rateDetails.asKnown()?.validity() ?: 0) +
            (reconciliationInstructions.asKnown()?.validity() ?: 0) +
            (if (settledAt.asKnown() == null) 0 else 1) +
            (source.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** Destination account details */
    @JsonDeserialize(using = Destination.Deserializer::class)
    @JsonSerialize(using = Destination.Serializer::class)
    class Destination
    private constructor(
        private val account: Account? = null,
        private val umaAddress: UmaAddress? = null,
        private val externalAccountDetails: ExternalAccountDetails? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Destination account details */
        fun account(): Account? = account

        /** UMA address destination details */
        fun umaAddress(): UmaAddress? = umaAddress

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        fun externalAccountDetails(): ExternalAccountDetails? = externalAccountDetails

        fun isAccount(): Boolean = account != null

        fun isUmaAddress(): Boolean = umaAddress != null

        fun isExternalAccountDetails(): Boolean = externalAccountDetails != null

        /** Destination account details */
        fun asAccount(): Account = account.getOrThrow("account")

        /** UMA address destination details */
        fun asUmaAddress(): UmaAddress = umaAddress.getOrThrow("umaAddress")

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        fun asExternalAccountDetails(): ExternalAccountDetails =
            externalAccountDetails.getOrThrow("externalAccountDetails")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                account != null -> visitor.visitAccount(account)
                umaAddress != null -> visitor.visitUmaAddress(umaAddress)
                externalAccountDetails != null ->
                    visitor.visitExternalAccountDetails(externalAccountDetails)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Destination = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAccount(account: Account) {
                        account.validate()
                    }

                    override fun visitUmaAddress(umaAddress: UmaAddress) {
                        umaAddress.validate()
                    }

                    override fun visitExternalAccountDetails(
                        externalAccountDetails: ExternalAccountDetails
                    ) {
                        externalAccountDetails.validate()
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
                    override fun visitAccount(account: Account) = account.validity()

                    override fun visitUmaAddress(umaAddress: UmaAddress) = umaAddress.validity()

                    override fun visitExternalAccountDetails(
                        externalAccountDetails: ExternalAccountDetails
                    ) = externalAccountDetails.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Destination &&
                account == other.account &&
                umaAddress == other.umaAddress &&
                externalAccountDetails == other.externalAccountDetails
        }

        override fun hashCode(): Int = Objects.hash(account, umaAddress, externalAccountDetails)

        override fun toString(): String =
            when {
                account != null -> "Destination{account=$account}"
                umaAddress != null -> "Destination{umaAddress=$umaAddress}"
                externalAccountDetails != null ->
                    "Destination{externalAccountDetails=$externalAccountDetails}"
                _json != null -> "Destination{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Destination")
            }

        companion object {

            /** Destination account details */
            fun ofAccount(account: Account) = Destination(account = account)

            /** UMA address destination details */
            fun ofUmaAddress(umaAddress: UmaAddress) = Destination(umaAddress = umaAddress)

            /**
             * Transaction destination where external account details were provided inline at quote
             * creation rather than using a pre-registered external account.
             */
            fun ofExternalAccountDetails(externalAccountDetails: ExternalAccountDetails) =
                Destination(externalAccountDetails = externalAccountDetails)
        }

        /**
         * An interface that defines how to map each variant of [Destination] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** Destination account details */
            fun visitAccount(account: Account): T

            /** UMA address destination details */
            fun visitUmaAddress(umaAddress: UmaAddress): T

            /**
             * Transaction destination where external account details were provided inline at quote
             * creation rather than using a pre-registered external account.
             */
            fun visitExternalAccountDetails(externalAccountDetails: ExternalAccountDetails): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Account>())?.let {
                                Destination(account = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UmaAddress>())?.let {
                                Destination(umaAddress = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ExternalAccountDetails>())?.let {
                                Destination(externalAccountDetails = it, _json = json)
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
                    value.account != null -> generator.writeObject(value.account)
                    value.umaAddress != null -> generator.writeObject(value.umaAddress)
                    value.externalAccountDetails != null ->
                        generator.writeObject(value.externalAccountDetails)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Destination")
                }
            }
        }

        /** Destination account details */
        class Account
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<String>,
            private val accountId: JsonField<String>,
            private val destinationType: JsonField<DestinationType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountId")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destinationType")
                @ExcludeMissing
                destinationType: JsonField<DestinationType> = JsonMissing.of(),
            ) : this(currency, accountId, destinationType, mutableMapOf())

            fun toBaseTransactionDestination(): BaseTransactionDestination =
                BaseTransactionDestination.builder().currency(currency).build()

            /**
             * Currency code for the destination
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Destination account identifier
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountId(): String = accountId.getRequired("accountId")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun destinationType(): DestinationType = destinationType.getRequired("destinationType")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
             * Returns the raw JSON value of [destinationType].
             *
             * Unlike [destinationType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destinationType")
            @ExcludeMissing
            fun _destinationType(): JsonField<DestinationType> = destinationType

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
                 * Returns a mutable builder for constructing an instance of [Account].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * .destinationType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Account]. */
            class Builder internal constructor() {

                private var currency: JsonField<String> = JsonMissing.of()
                private var accountId: JsonField<String>? = null
                private var destinationType: JsonField<DestinationType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(account: Account) = apply {
                    currency = account.currency
                    accountId = account.accountId
                    destinationType = account.destinationType
                    additionalProperties = account.additionalProperties.toMutableMap()
                }

                /** Currency code for the destination */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

                fun destinationType(destinationType: DestinationType) =
                    destinationType(JsonField.of(destinationType))

                /**
                 * Sets [Builder.destinationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationType] with a well-typed
                 * [DestinationType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun destinationType(destinationType: JsonField<DestinationType>) = apply {
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
                 * Returns an immutable instance of [Account].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * .destinationType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Account =
                    Account(
                        currency,
                        checkRequired("accountId", accountId),
                        checkRequired("destinationType", destinationType),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Account = apply {
                if (validated) {
                    return@apply
                }

                currency()
                accountId()
                destinationType().validate()
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
                    (if (accountId.asKnown() == null) 0 else 1) +
                    (destinationType.asKnown()?.validity() ?: 0)

            class DestinationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACCOUNT = of("ACCOUNT")

                    fun of(value: String) = DestinationType(JsonField.of(value))
                }

                /** An enum containing [DestinationType]'s known values. */
                enum class Known {
                    ACCOUNT
                }

                /**
                 * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DestinationType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    /**
                     * An enum member indicating that [DestinationType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACCOUNT -> Known.ACCOUNT
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown DestinationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): DestinationType = apply {
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

                    return other is DestinationType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Account &&
                    currency == other.currency &&
                    accountId == other.accountId &&
                    destinationType == other.destinationType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(currency, accountId, destinationType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Account{currency=$currency, accountId=$accountId, destinationType=$destinationType, additionalProperties=$additionalProperties}"
        }

        /** UMA address destination details */
        class UmaAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<String>,
            private val destinationType: JsonField<DestinationType>,
            private val umaAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destinationType")
                @ExcludeMissing
                destinationType: JsonField<DestinationType> = JsonMissing.of(),
                @JsonProperty("umaAddress")
                @ExcludeMissing
                umaAddress: JsonField<String> = JsonMissing.of(),
            ) : this(currency, destinationType, umaAddress, mutableMapOf())

            fun toBaseTransactionDestination(): BaseTransactionDestination =
                BaseTransactionDestination.builder().currency(currency).build()

            /**
             * Currency code for the destination
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun destinationType(): DestinationType = destinationType.getRequired("destinationType")

            /**
             * UMA address of the recipient
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun umaAddress(): String = umaAddress.getRequired("umaAddress")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [destinationType].
             *
             * Unlike [destinationType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destinationType")
            @ExcludeMissing
            fun _destinationType(): JsonField<DestinationType> = destinationType

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
                 * Returns a mutable builder for constructing an instance of [UmaAddress].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .destinationType()
                 * .umaAddress()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UmaAddress]. */
            class Builder internal constructor() {

                private var currency: JsonField<String> = JsonMissing.of()
                private var destinationType: JsonField<DestinationType>? = null
                private var umaAddress: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(umaAddress: UmaAddress) = apply {
                    currency = umaAddress.currency
                    destinationType = umaAddress.destinationType
                    this.umaAddress = umaAddress.umaAddress
                    additionalProperties = umaAddress.additionalProperties.toMutableMap()
                }

                /** Currency code for the destination */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun destinationType(destinationType: DestinationType) =
                    destinationType(JsonField.of(destinationType))

                /**
                 * Sets [Builder.destinationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationType] with a well-typed
                 * [DestinationType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun destinationType(destinationType: JsonField<DestinationType>) = apply {
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
                 * Returns an immutable instance of [UmaAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .destinationType()
                 * .umaAddress()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UmaAddress =
                    UmaAddress(
                        currency,
                        checkRequired("destinationType", destinationType),
                        checkRequired("umaAddress", umaAddress),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UmaAddress = apply {
                if (validated) {
                    return@apply
                }

                currency()
                destinationType().validate()
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
                (if (currency.asKnown() == null) 0 else 1) +
                    (destinationType.asKnown()?.validity() ?: 0) +
                    (if (umaAddress.asKnown() == null) 0 else 1)

            class DestinationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val UMA_ADDRESS = of("UMA_ADDRESS")

                    fun of(value: String) = DestinationType(JsonField.of(value))
                }

                /** An enum containing [DestinationType]'s known values. */
                enum class Known {
                    UMA_ADDRESS
                }

                /**
                 * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DestinationType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UMA_ADDRESS,
                    /**
                     * An enum member indicating that [DestinationType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UMA_ADDRESS -> Value.UMA_ADDRESS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        UMA_ADDRESS -> Known.UMA_ADDRESS
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown DestinationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): DestinationType = apply {
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

                    return other is DestinationType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UmaAddress &&
                    currency == other.currency &&
                    destinationType == other.destinationType &&
                    umaAddress == other.umaAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(currency, destinationType, umaAddress, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UmaAddress{currency=$currency, destinationType=$destinationType, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
        }

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        class ExternalAccountDetails
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<String>,
            private val destinationType: JsonField<DestinationType>,
            private val externalAccountDetails: JsonField<ExternalAccountCreate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destinationType")
                @ExcludeMissing
                destinationType: JsonField<DestinationType> = JsonMissing.of(),
                @JsonProperty("externalAccountDetails")
                @ExcludeMissing
                externalAccountDetails: JsonField<ExternalAccountCreate> = JsonMissing.of(),
            ) : this(currency, destinationType, externalAccountDetails, mutableMapOf())

            fun toBaseTransactionDestination(): BaseTransactionDestination =
                BaseTransactionDestination.builder().currency(currency).build()

            /**
             * Currency code for the destination
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun destinationType(): DestinationType = destinationType.getRequired("destinationType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalAccountDetails(): ExternalAccountCreate =
                externalAccountDetails.getRequired("externalAccountDetails")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [destinationType].
             *
             * Unlike [destinationType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destinationType")
            @ExcludeMissing
            fun _destinationType(): JsonField<DestinationType> = destinationType

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
                 * [ExternalAccountDetails].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .destinationType()
                 * .externalAccountDetails()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExternalAccountDetails]. */
            class Builder internal constructor() {

                private var currency: JsonField<String> = JsonMissing.of()
                private var destinationType: JsonField<DestinationType>? = null
                private var externalAccountDetails: JsonField<ExternalAccountCreate>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(externalAccountDetails: ExternalAccountDetails) = apply {
                    currency = externalAccountDetails.currency
                    destinationType = externalAccountDetails.destinationType
                    this.externalAccountDetails = externalAccountDetails.externalAccountDetails
                    additionalProperties =
                        externalAccountDetails.additionalProperties.toMutableMap()
                }

                /** Currency code for the destination */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun destinationType(destinationType: DestinationType) =
                    destinationType(JsonField.of(destinationType))

                /**
                 * Sets [Builder.destinationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationType] with a well-typed
                 * [DestinationType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun destinationType(destinationType: JsonField<DestinationType>) = apply {
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
                 * Returns an immutable instance of [ExternalAccountDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .destinationType()
                 * .externalAccountDetails()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExternalAccountDetails =
                    ExternalAccountDetails(
                        currency,
                        checkRequired("destinationType", destinationType),
                        checkRequired("externalAccountDetails", externalAccountDetails),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExternalAccountDetails = apply {
                if (validated) {
                    return@apply
                }

                currency()
                destinationType().validate()
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
                (if (currency.asKnown() == null) 0 else 1) +
                    (destinationType.asKnown()?.validity() ?: 0) +
                    (externalAccountDetails.asKnown()?.validity() ?: 0)

            class DestinationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EXTERNAL_ACCOUNT_DETAILS = of("EXTERNAL_ACCOUNT_DETAILS")

                    fun of(value: String) = DestinationType(JsonField.of(value))
                }

                /** An enum containing [DestinationType]'s known values. */
                enum class Known {
                    EXTERNAL_ACCOUNT_DETAILS
                }

                /**
                 * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DestinationType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EXTERNAL_ACCOUNT_DETAILS,
                    /**
                     * An enum member indicating that [DestinationType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EXTERNAL_ACCOUNT_DETAILS -> Value.EXTERNAL_ACCOUNT_DETAILS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        EXTERNAL_ACCOUNT_DETAILS -> Known.EXTERNAL_ACCOUNT_DETAILS
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown DestinationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): DestinationType = apply {
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

                    return other is DestinationType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternalAccountDetails &&
                    currency == other.currency &&
                    destinationType == other.destinationType &&
                    externalAccountDetails == other.externalAccountDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    currency,
                    destinationType,
                    externalAccountDetails,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExternalAccountDetails{currency=$currency, destinationType=$destinationType, externalAccountDetails=$externalAccountDetails, additionalProperties=$additionalProperties}"
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

            val INCOMING = of("INCOMING")

            val OUTGOING = of("OUTGOING")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INCOMING,
            OUTGOING,
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
                INCOMING -> Value.INCOMING
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
                INCOMING -> Known.INCOMING
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

            val LNURLP_FAILED = of("LNURLP_FAILED")

            val PAY_REQUEST_FAILED = of("PAY_REQUEST_FAILED")

            val PAYMENT_APPROVAL_WEBHOOK_ERROR = of("PAYMENT_APPROVAL_WEBHOOK_ERROR")

            val PAYMENT_APPROVAL_TIMED_OUT = of("PAYMENT_APPROVAL_TIMED_OUT")

            val OFFRAMP_FAILED = of("OFFRAMP_FAILED")

            val MISSING_MANDATORY_PAYEE_DATA = of("MISSING_MANDATORY_PAYEE_DATA")

            val QUOTE_EXPIRED = of("QUOTE_EXPIRED")

            val QUOTE_EXECUTION_FAILED = of("QUOTE_EXECUTION_FAILED")

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

    /** Details about the rate and fees for the transaction. */
    class RateDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val gridApiFixedFee: JsonField<Long>,
        private val gridApiMultiplier: JsonField<Double>,
        private val gridApiVariableFeeAmount: JsonField<Double>,
        private val gridApiVariableFeeRate: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("gridApiFixedFee")
            @ExcludeMissing
            gridApiFixedFee: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("gridApiMultiplier")
            @ExcludeMissing
            gridApiMultiplier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("gridApiVariableFeeAmount")
            @ExcludeMissing
            gridApiVariableFeeAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("gridApiVariableFeeRate")
            @ExcludeMissing
            gridApiVariableFeeRate: JsonField<Double> = JsonMissing.of(),
        ) : this(
            gridApiFixedFee,
            gridApiMultiplier,
            gridApiVariableFeeAmount,
            gridApiVariableFeeRate,
            mutableMapOf(),
        )

        /**
         * The fixed fee charged by the Grid product to execute the quote in the smallest unit of
         * the receiving currency (eg. cents).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gridApiFixedFee(): Long = gridApiFixedFee.getRequired("gridApiFixedFee")

        /**
         * The underlying multiplier from the mSATS to the receiving currency, including variable
         * fees.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gridApiMultiplier(): Double = gridApiMultiplier.getRequired("gridApiMultiplier")

        /**
         * The variable fee amount charged by the Grid product to execute the quote in the smallest
         * unit of the receiving currency (eg. cents). This is the receiving amount times
         * gridApiVariableFeeRate.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gridApiVariableFeeAmount(): Double =
            gridApiVariableFeeAmount.getRequired("gridApiVariableFeeAmount")

        /**
         * The variable fee rate charged by the Grid product to execute the quote as a percentage of
         * the receiving currency amount.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gridApiVariableFeeRate(): Double =
            gridApiVariableFeeRate.getRequired("gridApiVariableFeeRate")

        /**
         * Returns the raw JSON value of [gridApiFixedFee].
         *
         * Unlike [gridApiFixedFee], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gridApiFixedFee")
        @ExcludeMissing
        fun _gridApiFixedFee(): JsonField<Long> = gridApiFixedFee

        /**
         * Returns the raw JSON value of [gridApiMultiplier].
         *
         * Unlike [gridApiMultiplier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gridApiMultiplier")
        @ExcludeMissing
        fun _gridApiMultiplier(): JsonField<Double> = gridApiMultiplier

        /**
         * Returns the raw JSON value of [gridApiVariableFeeAmount].
         *
         * Unlike [gridApiVariableFeeAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("gridApiVariableFeeAmount")
        @ExcludeMissing
        fun _gridApiVariableFeeAmount(): JsonField<Double> = gridApiVariableFeeAmount

        /**
         * Returns the raw JSON value of [gridApiVariableFeeRate].
         *
         * Unlike [gridApiVariableFeeRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("gridApiVariableFeeRate")
        @ExcludeMissing
        fun _gridApiVariableFeeRate(): JsonField<Double> = gridApiVariableFeeRate

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
             * Returns a mutable builder for constructing an instance of [RateDetails].
             *
             * The following fields are required:
             * ```kotlin
             * .gridApiFixedFee()
             * .gridApiMultiplier()
             * .gridApiVariableFeeAmount()
             * .gridApiVariableFeeRate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RateDetails]. */
        class Builder internal constructor() {

            private var gridApiFixedFee: JsonField<Long>? = null
            private var gridApiMultiplier: JsonField<Double>? = null
            private var gridApiVariableFeeAmount: JsonField<Double>? = null
            private var gridApiVariableFeeRate: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rateDetails: RateDetails) = apply {
                gridApiFixedFee = rateDetails.gridApiFixedFee
                gridApiMultiplier = rateDetails.gridApiMultiplier
                gridApiVariableFeeAmount = rateDetails.gridApiVariableFeeAmount
                gridApiVariableFeeRate = rateDetails.gridApiVariableFeeRate
                additionalProperties = rateDetails.additionalProperties.toMutableMap()
            }

            /**
             * The fixed fee charged by the Grid product to execute the quote in the smallest unit
             * of the receiving currency (eg. cents).
             */
            fun gridApiFixedFee(gridApiFixedFee: Long) =
                gridApiFixedFee(JsonField.of(gridApiFixedFee))

            /**
             * Sets [Builder.gridApiFixedFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gridApiFixedFee] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gridApiFixedFee(gridApiFixedFee: JsonField<Long>) = apply {
                this.gridApiFixedFee = gridApiFixedFee
            }

            /**
             * The underlying multiplier from the mSATS to the receiving currency, including
             * variable fees.
             */
            fun gridApiMultiplier(gridApiMultiplier: Double) =
                gridApiMultiplier(JsonField.of(gridApiMultiplier))

            /**
             * Sets [Builder.gridApiMultiplier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gridApiMultiplier] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gridApiMultiplier(gridApiMultiplier: JsonField<Double>) = apply {
                this.gridApiMultiplier = gridApiMultiplier
            }

            /**
             * The variable fee amount charged by the Grid product to execute the quote in the
             * smallest unit of the receiving currency (eg. cents). This is the receiving amount
             * times gridApiVariableFeeRate.
             */
            fun gridApiVariableFeeAmount(gridApiVariableFeeAmount: Double) =
                gridApiVariableFeeAmount(JsonField.of(gridApiVariableFeeAmount))

            /**
             * Sets [Builder.gridApiVariableFeeAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gridApiVariableFeeAmount] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun gridApiVariableFeeAmount(gridApiVariableFeeAmount: JsonField<Double>) = apply {
                this.gridApiVariableFeeAmount = gridApiVariableFeeAmount
            }

            /**
             * The variable fee rate charged by the Grid product to execute the quote as a
             * percentage of the receiving currency amount.
             */
            fun gridApiVariableFeeRate(gridApiVariableFeeRate: Double) =
                gridApiVariableFeeRate(JsonField.of(gridApiVariableFeeRate))

            /**
             * Sets [Builder.gridApiVariableFeeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gridApiVariableFeeRate] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun gridApiVariableFeeRate(gridApiVariableFeeRate: JsonField<Double>) = apply {
                this.gridApiVariableFeeRate = gridApiVariableFeeRate
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
             * Returns an immutable instance of [RateDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .gridApiFixedFee()
             * .gridApiMultiplier()
             * .gridApiVariableFeeAmount()
             * .gridApiVariableFeeRate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RateDetails =
                RateDetails(
                    checkRequired("gridApiFixedFee", gridApiFixedFee),
                    checkRequired("gridApiMultiplier", gridApiMultiplier),
                    checkRequired("gridApiVariableFeeAmount", gridApiVariableFeeAmount),
                    checkRequired("gridApiVariableFeeRate", gridApiVariableFeeRate),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RateDetails = apply {
            if (validated) {
                return@apply
            }

            gridApiFixedFee()
            gridApiMultiplier()
            gridApiVariableFeeAmount()
            gridApiVariableFeeRate()
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
            (if (gridApiFixedFee.asKnown() == null) 0 else 1) +
                (if (gridApiMultiplier.asKnown() == null) 0 else 1) +
                (if (gridApiVariableFeeAmount.asKnown() == null) 0 else 1) +
                (if (gridApiVariableFeeRate.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RateDetails &&
                gridApiFixedFee == other.gridApiFixedFee &&
                gridApiMultiplier == other.gridApiMultiplier &&
                gridApiVariableFeeAmount == other.gridApiVariableFeeAmount &&
                gridApiVariableFeeRate == other.gridApiVariableFeeRate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                gridApiFixedFee,
                gridApiMultiplier,
                gridApiVariableFeeAmount,
                gridApiVariableFeeRate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RateDetails{gridApiFixedFee=$gridApiFixedFee, gridApiMultiplier=$gridApiMultiplier, gridApiVariableFeeAmount=$gridApiVariableFeeAmount, gridApiVariableFeeRate=$gridApiVariableFeeRate, additionalProperties=$additionalProperties}"
    }

    /** Included for all transactions except those with "CREATED" status */
    class ReconciliationInstructions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reference: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of()
        ) : this(reference, mutableMapOf())

        /**
         * Unique reference code that must be included with the payment to match it with the correct
         * incoming transaction
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

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
             * [ReconciliationInstructions].
             *
             * The following fields are required:
             * ```kotlin
             * .reference()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReconciliationInstructions]. */
        class Builder internal constructor() {

            private var reference: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(reconciliationInstructions: ReconciliationInstructions) = apply {
                reference = reconciliationInstructions.reference
                additionalProperties =
                    reconciliationInstructions.additionalProperties.toMutableMap()
            }

            /**
             * Unique reference code that must be included with the payment to match it with the
             * correct incoming transaction
             */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

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
             * Returns an immutable instance of [ReconciliationInstructions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .reference()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReconciliationInstructions =
                ReconciliationInstructions(
                    checkRequired("reference", reference),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReconciliationInstructions = apply {
            if (validated) {
                return@apply
            }

            reference()
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
        internal fun validity(): Int = (if (reference.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReconciliationInstructions &&
                reference == other.reference &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reference, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReconciliationInstructions{reference=$reference, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IncomingTransaction &&
            id == other.id &&
            customerId == other.customerId &&
            destination == other.destination &&
            platformCustomerId == other.platformCustomerId &&
            receivedAmount == other.receivedAmount &&
            status == other.status &&
            type == other.type &&
            counterpartyInformation == other.counterpartyInformation &&
            createdAt == other.createdAt &&
            description == other.description &&
            failureReason == other.failureReason &&
            rateDetails == other.rateDetails &&
            reconciliationInstructions == other.reconciliationInstructions &&
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
            platformCustomerId,
            receivedAmount,
            status,
            type,
            counterpartyInformation,
            createdAt,
            description,
            failureReason,
            rateDetails,
            reconciliationInstructions,
            settledAt,
            source,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IncomingTransaction{id=$id, customerId=$customerId, destination=$destination, platformCustomerId=$platformCustomerId, receivedAmount=$receivedAmount, status=$status, type=$type, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, failureReason=$failureReason, rateDetails=$rateDetails, reconciliationInstructions=$reconciliationInstructions, settledAt=$settledAt, source=$source, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
