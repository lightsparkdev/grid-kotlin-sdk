// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

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
import java.util.Collections
import java.util.Objects

/** Details of a transfer-type agent action (TRANSFER_OUT or TRANSFER_IN). */
class AgentTransferDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val destinationAccountId: JsonField<String>,
    private val sourceAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationAccountId")
        @ExcludeMissing
        destinationAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceAccountId")
        @ExcludeMissing
        sourceAccountId: JsonField<String> = JsonMissing.of(),
    ) : this(amount, currency, destinationAccountId, sourceAccountId, mutableMapOf())

    /**
     * Transfer amount in the smallest unit of the specified currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * ISO 4217 currency code for the transfer amount.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * ID of the destination account (internal or external).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destinationAccountId(): String = destinationAccountId.getRequired("destinationAccountId")

    /**
     * ID of the source account (internal or external).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceAccountId(): String = sourceAccountId.getRequired("sourceAccountId")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [destinationAccountId].
     *
     * Unlike [destinationAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("destinationAccountId")
    @ExcludeMissing
    fun _destinationAccountId(): JsonField<String> = destinationAccountId

    /**
     * Returns the raw JSON value of [sourceAccountId].
     *
     * Unlike [sourceAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceAccountId")
    @ExcludeMissing
    fun _sourceAccountId(): JsonField<String> = sourceAccountId

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
         * Returns a mutable builder for constructing an instance of [AgentTransferDetails].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .currency()
         * .destinationAccountId()
         * .sourceAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentTransferDetails]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var currency: JsonField<String>? = null
        private var destinationAccountId: JsonField<String>? = null
        private var sourceAccountId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentTransferDetails: AgentTransferDetails) = apply {
            amount = agentTransferDetails.amount
            currency = agentTransferDetails.currency
            destinationAccountId = agentTransferDetails.destinationAccountId
            sourceAccountId = agentTransferDetails.sourceAccountId
            additionalProperties = agentTransferDetails.additionalProperties.toMutableMap()
        }

        /** Transfer amount in the smallest unit of the specified currency. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** ISO 4217 currency code for the transfer amount. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** ID of the destination account (internal or external). */
        fun destinationAccountId(destinationAccountId: String) =
            destinationAccountId(JsonField.of(destinationAccountId))

        /**
         * Sets [Builder.destinationAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationAccountId(destinationAccountId: JsonField<String>) = apply {
            this.destinationAccountId = destinationAccountId
        }

        /** ID of the source account (internal or external). */
        fun sourceAccountId(sourceAccountId: String) =
            sourceAccountId(JsonField.of(sourceAccountId))

        /**
         * Sets [Builder.sourceAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceAccountId(sourceAccountId: JsonField<String>) = apply {
            this.sourceAccountId = sourceAccountId
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
         * Returns an immutable instance of [AgentTransferDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .currency()
         * .destinationAccountId()
         * .sourceAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentTransferDetails =
            AgentTransferDetails(
                checkRequired("amount", amount),
                checkRequired("currency", currency),
                checkRequired("destinationAccountId", destinationAccountId),
                checkRequired("sourceAccountId", sourceAccountId),
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
    fun validate(): AgentTransferDetails = apply {
        if (validated) {
            return@apply
        }

        amount()
        currency()
        destinationAccountId()
        sourceAccountId()
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
        (if (amount.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (if (destinationAccountId.asKnown() == null) 0 else 1) +
            (if (sourceAccountId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentTransferDetails &&
            amount == other.amount &&
            currency == other.currency &&
            destinationAccountId == other.destinationAccountId &&
            sourceAccountId == other.sourceAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, currency, destinationAccountId, sourceAccountId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentTransferDetails{amount=$amount, currency=$currency, destinationAccountId=$destinationAccountId, sourceAccountId=$sourceAccountId, additionalProperties=$additionalProperties}"
}
