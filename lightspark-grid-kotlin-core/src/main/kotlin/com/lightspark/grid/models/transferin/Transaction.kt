// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

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
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.transactions.TransactionType
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Transaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val destination: JsonField<Destination>,
    private val platformCustomerId: JsonField<String>,
    private val status: JsonField<TransactionStatus>,
    private val type: JsonField<TransactionType>,
    private val counterpartyInformation: JsonField<CounterpartyInformation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
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
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<TransactionStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<TransactionType> = JsonMissing.of(),
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
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [Transaction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .customerId()
         * .destination()
         * .platformCustomerId()
         * .status()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Transaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var destination: JsonField<Destination>? = null
        private var platformCustomerId: JsonField<String>? = null
        private var status: JsonField<TransactionStatus>? = null
        private var type: JsonField<TransactionType>? = null
        private var counterpartyInformation: JsonField<CounterpartyInformation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transaction: Transaction) = apply {
            id = transaction.id
            customerId = transaction.customerId
            destination = transaction.destination
            platformCustomerId = transaction.platformCustomerId
            status = transaction.status
            type = transaction.type
            counterpartyInformation = transaction.counterpartyInformation
            createdAt = transaction.createdAt
            description = transaction.description
            settledAt = transaction.settledAt
            updatedAt = transaction.updatedAt
            additionalProperties = transaction.additionalProperties.toMutableMap()
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
         *     .accountId(accountId)
         *     .build()
         * ```
         */
        fun accountDestination(accountId: String) =
            destination(Destination.Account.builder().accountId(accountId).build())

        /** Alias for calling [destination] with `Destination.ofUmaAddress(umaAddress)`. */
        fun destination(umaAddress: Destination.UmaAddress) =
            destination(Destination.ofUmaAddress(umaAddress))

        /**
         * Alias for calling [destination] with the following:
         * ```kotlin
         * Destination.UmaAddress.builder()
         *     .umaAddress(umaAddress)
         *     .build()
         * ```
         */
        fun umaAddressDestination(umaAddress: String) =
            destination(Destination.UmaAddress.builder().umaAddress(umaAddress).build())

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
         *     .externalAccountDetails(externalAccountDetails)
         *     .build()
         * ```
         */
        fun externalAccountDetailsDestination(externalAccountDetails: ExternalAccountCreate) =
            destination(
                Destination.ExternalAccountDetails.builder()
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
         * You should usually call [Builder.type] with a well-typed [TransactionType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [Transaction].
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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Transaction =
            Transaction(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Transaction = apply {
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
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (counterpartyInformation.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (settledAt.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    @JsonDeserialize(using = Destination.Deserializer::class)
    @JsonSerialize(using = Destination.Serializer::class)
    class Destination
    private constructor(
        private val account: Account? = null,
        private val umaAddress: UmaAddress? = null,
        private val externalAccountDetails: ExternalAccountDetails? = null,
        private val _json: JsonValue? = null,
    ) {

        fun account(): Account? = account

        fun umaAddress(): UmaAddress? = umaAddress

        fun externalAccountDetails(): ExternalAccountDetails? = externalAccountDetails

        fun isAccount(): Boolean = account != null

        fun isUmaAddress(): Boolean = umaAddress != null

        fun isExternalAccountDetails(): Boolean = externalAccountDetails != null

        fun asAccount(): Account = account.getOrThrow("account")

        fun asUmaAddress(): UmaAddress = umaAddress.getOrThrow("umaAddress")

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

            fun ofAccount(account: Account) = Destination(account = account)

            fun ofUmaAddress(umaAddress: UmaAddress) = Destination(umaAddress = umaAddress)

            fun ofExternalAccountDetails(externalAccountDetails: ExternalAccountDetails) =
                Destination(externalAccountDetails = externalAccountDetails)
        }

        /**
         * An interface that defines how to map each variant of [Destination] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitAccount(account: Account): T

            fun visitUmaAddress(umaAddress: UmaAddress): T

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
                val destinationType = json.asObject()?.get("destinationType")?.asString()

                when (destinationType) {
                    "ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<Account>())?.let {
                            Destination(account = it, _json = json)
                        } ?: Destination(_json = json)
                    }
                    "UMA_ADDRESS" -> {
                        return tryDeserialize(node, jacksonTypeRef<UmaAddress>())?.let {
                            Destination(umaAddress = it, _json = json)
                        } ?: Destination(_json = json)
                    }
                    "EXTERNAL_ACCOUNT_DETAILS" -> {
                        return tryDeserialize(node, jacksonTypeRef<ExternalAccountDetails>())?.let {
                            Destination(externalAccountDetails = it, _json = json)
                        } ?: Destination(_json = json)
                    }
                }

                return Destination(_json = json)
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

        class Account
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val destinationType: JsonValue,
            private val currency: JsonField<String>,
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
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(accountId, destinationType, currency, mutableMapOf())

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
             * Currency code for the destination
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

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
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Account]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var destinationType: JsonValue = JsonValue.from("ACCOUNT")
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(account: Account) = apply {
                    accountId = account.accountId
                    destinationType = account.destinationType
                    currency = account.currency
                    additionalProperties = account.additionalProperties.toMutableMap()
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
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Account =
                    Account(
                        checkRequired("accountId", accountId),
                        destinationType,
                        currency,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Account = apply {
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
                currency()
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
                    destinationType.let { if (it == JsonValue.from("ACCOUNT")) 1 else 0 } +
                    (if (currency.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Account &&
                    accountId == other.accountId &&
                    destinationType == other.destinationType &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, destinationType, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Account{accountId=$accountId, destinationType=$destinationType, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class UmaAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destinationType: JsonValue,
            private val umaAddress: JsonField<String>,
            private val currency: JsonField<String>,
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
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(destinationType, umaAddress, currency, mutableMapOf())

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
             * Currency code for the destination
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Returns the raw JSON value of [umaAddress].
             *
             * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("umaAddress")
            @ExcludeMissing
            fun _umaAddress(): JsonField<String> = umaAddress

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
                 * .umaAddress()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UmaAddress]. */
            class Builder internal constructor() {

                private var destinationType: JsonValue = JsonValue.from("UMA_ADDRESS")
                private var umaAddress: JsonField<String>? = null
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(umaAddress: UmaAddress) = apply {
                    destinationType = umaAddress.destinationType
                    this.umaAddress = umaAddress.umaAddress
                    currency = umaAddress.currency
                    additionalProperties = umaAddress.additionalProperties.toMutableMap()
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
                 * .umaAddress()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UmaAddress =
                    UmaAddress(
                        destinationType,
                        checkRequired("umaAddress", umaAddress),
                        currency,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UmaAddress = apply {
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
                currency()
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
                    (if (umaAddress.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UmaAddress &&
                    destinationType == other.destinationType &&
                    umaAddress == other.umaAddress &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(destinationType, umaAddress, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UmaAddress{destinationType=$destinationType, umaAddress=$umaAddress, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class ExternalAccountDetails
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destinationType: JsonValue,
            private val externalAccountDetails: JsonField<ExternalAccountCreate>,
            private val currency: JsonField<String>,
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
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(destinationType, externalAccountDetails, currency, mutableMapOf())

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
             * Currency code for the destination
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Returns the raw JSON value of [externalAccountDetails].
             *
             * Unlike [externalAccountDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("externalAccountDetails")
            @ExcludeMissing
            fun _externalAccountDetails(): JsonField<ExternalAccountCreate> = externalAccountDetails

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
                 * .externalAccountDetails()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExternalAccountDetails]. */
            class Builder internal constructor() {

                private var destinationType: JsonValue = JsonValue.from("EXTERNAL_ACCOUNT_DETAILS")
                private var externalAccountDetails: JsonField<ExternalAccountCreate>? = null
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(externalAccountDetails: ExternalAccountDetails) = apply {
                    destinationType = externalAccountDetails.destinationType
                    this.externalAccountDetails = externalAccountDetails.externalAccountDetails
                    currency = externalAccountDetails.currency
                    additionalProperties =
                        externalAccountDetails.additionalProperties.toMutableMap()
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
                 * .externalAccountDetails()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExternalAccountDetails =
                    ExternalAccountDetails(
                        destinationType,
                        checkRequired("externalAccountDetails", externalAccountDetails),
                        currency,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExternalAccountDetails = apply {
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
                currency()
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
                } +
                    (externalAccountDetails.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternalAccountDetails &&
                    destinationType == other.destinationType &&
                    externalAccountDetails == other.externalAccountDetails &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    destinationType,
                    externalAccountDetails,
                    currency,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExternalAccountDetails{destinationType=$destinationType, externalAccountDetails=$externalAccountDetails, currency=$currency, additionalProperties=$additionalProperties}"
        }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction &&
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Transaction{id=$id, customerId=$customerId, destination=$destination, platformCustomerId=$platformCustomerId, status=$status, type=$type, counterpartyInformation=$counterpartyInformation, createdAt=$createdAt, description=$description, settledAt=$settledAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
