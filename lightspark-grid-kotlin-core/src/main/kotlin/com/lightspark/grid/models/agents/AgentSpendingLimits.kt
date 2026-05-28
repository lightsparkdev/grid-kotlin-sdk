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
import java.util.Collections
import java.util.Objects

/**
 * Spending limits that cap the agent's transaction amounts and frequency. All amount fields are
 * integers in the smallest unit of the specified currency. When a transaction is denominated in a
 * different currency, Grid converts using the exchange rate at evaluation time.
 */
class AgentSpendingLimits
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currency: JsonField<String>,
    private val perTransactionLimit: JsonField<Long>,
    private val dailyLimit: JsonField<Long>,
    private val dailyTransactionLimit: JsonField<Long>,
    private val monthlyLimit: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("perTransactionLimit")
        @ExcludeMissing
        perTransactionLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dailyLimit") @ExcludeMissing dailyLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dailyTransactionLimit")
        @ExcludeMissing
        dailyTransactionLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthlyLimit")
        @ExcludeMissing
        monthlyLimit: JsonField<Long> = JsonMissing.of(),
    ) : this(
        currency,
        perTransactionLimit,
        dailyLimit,
        dailyTransactionLimit,
        monthlyLimit,
        mutableMapOf(),
    )

    /**
     * ISO 4217 currency code that all amount limits are denominated in.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Maximum amount the agent can transfer in a single transaction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun perTransactionLimit(): Long = perTransactionLimit.getRequired("perTransactionLimit")

    /**
     * Maximum total amount the agent can transfer per day. Null means no daily limit.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dailyLimit(): Long? = dailyLimit.getNullable("dailyLimit")

    /**
     * Maximum number of transactions the agent can initiate per day.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dailyTransactionLimit(): Long? = dailyTransactionLimit.getNullable("dailyTransactionLimit")

    /**
     * Maximum total amount the agent can transfer per month. Null means no monthly limit.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun monthlyLimit(): Long? = monthlyLimit.getNullable("monthlyLimit")

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [perTransactionLimit].
     *
     * Unlike [perTransactionLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("perTransactionLimit")
    @ExcludeMissing
    fun _perTransactionLimit(): JsonField<Long> = perTransactionLimit

    /**
     * Returns the raw JSON value of [dailyLimit].
     *
     * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dailyLimit") @ExcludeMissing fun _dailyLimit(): JsonField<Long> = dailyLimit

    /**
     * Returns the raw JSON value of [dailyTransactionLimit].
     *
     * Unlike [dailyTransactionLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dailyTransactionLimit")
    @ExcludeMissing
    fun _dailyTransactionLimit(): JsonField<Long> = dailyTransactionLimit

    /**
     * Returns the raw JSON value of [monthlyLimit].
     *
     * Unlike [monthlyLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyLimit")
    @ExcludeMissing
    fun _monthlyLimit(): JsonField<Long> = monthlyLimit

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
         * Returns a mutable builder for constructing an instance of [AgentSpendingLimits].
         *
         * The following fields are required:
         * ```kotlin
         * .currency()
         * .perTransactionLimit()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentSpendingLimits]. */
    class Builder internal constructor() {

        private var currency: JsonField<String>? = null
        private var perTransactionLimit: JsonField<Long>? = null
        private var dailyLimit: JsonField<Long> = JsonMissing.of()
        private var dailyTransactionLimit: JsonField<Long> = JsonMissing.of()
        private var monthlyLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentSpendingLimits: AgentSpendingLimits) = apply {
            currency = agentSpendingLimits.currency
            perTransactionLimit = agentSpendingLimits.perTransactionLimit
            dailyLimit = agentSpendingLimits.dailyLimit
            dailyTransactionLimit = agentSpendingLimits.dailyTransactionLimit
            monthlyLimit = agentSpendingLimits.monthlyLimit
            additionalProperties = agentSpendingLimits.additionalProperties.toMutableMap()
        }

        /** ISO 4217 currency code that all amount limits are denominated in. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Maximum amount the agent can transfer in a single transaction. */
        fun perTransactionLimit(perTransactionLimit: Long) =
            perTransactionLimit(JsonField.of(perTransactionLimit))

        /**
         * Sets [Builder.perTransactionLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perTransactionLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perTransactionLimit(perTransactionLimit: JsonField<Long>) = apply {
            this.perTransactionLimit = perTransactionLimit
        }

        /** Maximum total amount the agent can transfer per day. Null means no daily limit. */
        fun dailyLimit(dailyLimit: Long?) = dailyLimit(JsonField.ofNullable(dailyLimit))

        /**
         * Alias for [Builder.dailyLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dailyLimit(dailyLimit: Long) = dailyLimit(dailyLimit as Long?)

        /**
         * Sets [Builder.dailyLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dailyLimit(dailyLimit: JsonField<Long>) = apply { this.dailyLimit = dailyLimit }

        /** Maximum number of transactions the agent can initiate per day. */
        fun dailyTransactionLimit(dailyTransactionLimit: Long) =
            dailyTransactionLimit(JsonField.of(dailyTransactionLimit))

        /**
         * Sets [Builder.dailyTransactionLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyTransactionLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyTransactionLimit(dailyTransactionLimit: JsonField<Long>) = apply {
            this.dailyTransactionLimit = dailyTransactionLimit
        }

        /** Maximum total amount the agent can transfer per month. Null means no monthly limit. */
        fun monthlyLimit(monthlyLimit: Long?) = monthlyLimit(JsonField.ofNullable(monthlyLimit))

        /**
         * Alias for [Builder.monthlyLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun monthlyLimit(monthlyLimit: Long) = monthlyLimit(monthlyLimit as Long?)

        /**
         * Sets [Builder.monthlyLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyLimit(monthlyLimit: JsonField<Long>) = apply { this.monthlyLimit = monthlyLimit }

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
         * Returns an immutable instance of [AgentSpendingLimits].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .currency()
         * .perTransactionLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentSpendingLimits =
            AgentSpendingLimits(
                checkRequired("currency", currency),
                checkRequired("perTransactionLimit", perTransactionLimit),
                dailyLimit,
                dailyTransactionLimit,
                monthlyLimit,
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
    fun validate(): AgentSpendingLimits = apply {
        if (validated) {
            return@apply
        }

        currency()
        perTransactionLimit()
        dailyLimit()
        dailyTransactionLimit()
        monthlyLimit()
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
        (if (currency.asKnown() == null) 0 else 1) +
            (if (perTransactionLimit.asKnown() == null) 0 else 1) +
            (if (dailyLimit.asKnown() == null) 0 else 1) +
            (if (dailyTransactionLimit.asKnown() == null) 0 else 1) +
            (if (monthlyLimit.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentSpendingLimits &&
            currency == other.currency &&
            perTransactionLimit == other.perTransactionLimit &&
            dailyLimit == other.dailyLimit &&
            dailyTransactionLimit == other.dailyTransactionLimit &&
            monthlyLimit == other.monthlyLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currency,
            perTransactionLimit,
            dailyLimit,
            dailyTransactionLimit,
            monthlyLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentSpendingLimits{currency=$currency, perTransactionLimit=$perTransactionLimit, dailyLimit=$dailyLimit, dailyTransactionLimit=$dailyTransactionLimit, monthlyLimit=$monthlyLimit, additionalProperties=$additionalProperties}"
}
