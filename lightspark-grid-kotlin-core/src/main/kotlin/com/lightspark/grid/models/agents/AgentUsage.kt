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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Real-time counters tracking the agent's spending and transaction activity against its policy
 * limits.
 */
class AgentUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dailySpend: JsonField<Long>,
    private val dailyTransactionCount: JsonField<Long>,
    private val monthlySpend: JsonField<Long>,
    private val dailyResetDate: JsonField<LocalDate>,
    private val monthlyResetMonth: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dailySpend") @ExcludeMissing dailySpend: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dailyTransactionCount")
        @ExcludeMissing
        dailyTransactionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthlySpend")
        @ExcludeMissing
        monthlySpend: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dailyResetDate")
        @ExcludeMissing
        dailyResetDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("monthlyResetMonth")
        @ExcludeMissing
        monthlyResetMonth: JsonField<String> = JsonMissing.of(),
    ) : this(
        dailySpend,
        dailyTransactionCount,
        monthlySpend,
        dailyResetDate,
        monthlyResetMonth,
        mutableMapOf(),
    )

    /**
     * Total amount spent by the agent today, in the smallest unit of the policy's
     * `spendingLimits.currency`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailySpend(): Long = dailySpend.getRequired("dailySpend")

    /**
     * Number of transactions initiated by the agent today.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailyTransactionCount(): Long = dailyTransactionCount.getRequired("dailyTransactionCount")

    /**
     * Total amount spent by the agent this month, in the smallest unit of the policy's
     * `spendingLimits.currency`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun monthlySpend(): Long = monthlySpend.getRequired("monthlySpend")

    /**
     * The date when daily usage counters will reset.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dailyResetDate(): LocalDate? = dailyResetDate.getNullable("dailyResetDate")

    /**
     * The year-month (YYYY-MM) when monthly usage counters will reset.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun monthlyResetMonth(): String? = monthlyResetMonth.getNullable("monthlyResetMonth")

    /**
     * Returns the raw JSON value of [dailySpend].
     *
     * Unlike [dailySpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dailySpend") @ExcludeMissing fun _dailySpend(): JsonField<Long> = dailySpend

    /**
     * Returns the raw JSON value of [dailyTransactionCount].
     *
     * Unlike [dailyTransactionCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dailyTransactionCount")
    @ExcludeMissing
    fun _dailyTransactionCount(): JsonField<Long> = dailyTransactionCount

    /**
     * Returns the raw JSON value of [monthlySpend].
     *
     * Unlike [monthlySpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlySpend")
    @ExcludeMissing
    fun _monthlySpend(): JsonField<Long> = monthlySpend

    /**
     * Returns the raw JSON value of [dailyResetDate].
     *
     * Unlike [dailyResetDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dailyResetDate")
    @ExcludeMissing
    fun _dailyResetDate(): JsonField<LocalDate> = dailyResetDate

    /**
     * Returns the raw JSON value of [monthlyResetMonth].
     *
     * Unlike [monthlyResetMonth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("monthlyResetMonth")
    @ExcludeMissing
    fun _monthlyResetMonth(): JsonField<String> = monthlyResetMonth

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
         * Returns a mutable builder for constructing an instance of [AgentUsage].
         *
         * The following fields are required:
         * ```kotlin
         * .dailySpend()
         * .dailyTransactionCount()
         * .monthlySpend()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentUsage]. */
    class Builder internal constructor() {

        private var dailySpend: JsonField<Long>? = null
        private var dailyTransactionCount: JsonField<Long>? = null
        private var monthlySpend: JsonField<Long>? = null
        private var dailyResetDate: JsonField<LocalDate> = JsonMissing.of()
        private var monthlyResetMonth: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentUsage: AgentUsage) = apply {
            dailySpend = agentUsage.dailySpend
            dailyTransactionCount = agentUsage.dailyTransactionCount
            monthlySpend = agentUsage.monthlySpend
            dailyResetDate = agentUsage.dailyResetDate
            monthlyResetMonth = agentUsage.monthlyResetMonth
            additionalProperties = agentUsage.additionalProperties.toMutableMap()
        }

        /**
         * Total amount spent by the agent today, in the smallest unit of the policy's
         * `spendingLimits.currency`.
         */
        fun dailySpend(dailySpend: Long) = dailySpend(JsonField.of(dailySpend))

        /**
         * Sets [Builder.dailySpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpend] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dailySpend(dailySpend: JsonField<Long>) = apply { this.dailySpend = dailySpend }

        /** Number of transactions initiated by the agent today. */
        fun dailyTransactionCount(dailyTransactionCount: Long) =
            dailyTransactionCount(JsonField.of(dailyTransactionCount))

        /**
         * Sets [Builder.dailyTransactionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyTransactionCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyTransactionCount(dailyTransactionCount: JsonField<Long>) = apply {
            this.dailyTransactionCount = dailyTransactionCount
        }

        /**
         * Total amount spent by the agent this month, in the smallest unit of the policy's
         * `spendingLimits.currency`.
         */
        fun monthlySpend(monthlySpend: Long) = monthlySpend(JsonField.of(monthlySpend))

        /**
         * Sets [Builder.monthlySpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlySpend] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlySpend(monthlySpend: JsonField<Long>) = apply { this.monthlySpend = monthlySpend }

        /** The date when daily usage counters will reset. */
        fun dailyResetDate(dailyResetDate: LocalDate) = dailyResetDate(JsonField.of(dailyResetDate))

        /**
         * Sets [Builder.dailyResetDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyResetDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyResetDate(dailyResetDate: JsonField<LocalDate>) = apply {
            this.dailyResetDate = dailyResetDate
        }

        /** The year-month (YYYY-MM) when monthly usage counters will reset. */
        fun monthlyResetMonth(monthlyResetMonth: String) =
            monthlyResetMonth(JsonField.of(monthlyResetMonth))

        /**
         * Sets [Builder.monthlyResetMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyResetMonth] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun monthlyResetMonth(monthlyResetMonth: JsonField<String>) = apply {
            this.monthlyResetMonth = monthlyResetMonth
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
         * Returns an immutable instance of [AgentUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .dailySpend()
         * .dailyTransactionCount()
         * .monthlySpend()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentUsage =
            AgentUsage(
                checkRequired("dailySpend", dailySpend),
                checkRequired("dailyTransactionCount", dailyTransactionCount),
                checkRequired("monthlySpend", monthlySpend),
                dailyResetDate,
                monthlyResetMonth,
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
    fun validate(): AgentUsage = apply {
        if (validated) {
            return@apply
        }

        dailySpend()
        dailyTransactionCount()
        monthlySpend()
        dailyResetDate()
        monthlyResetMonth()
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
        (if (dailySpend.asKnown() == null) 0 else 1) +
            (if (dailyTransactionCount.asKnown() == null) 0 else 1) +
            (if (monthlySpend.asKnown() == null) 0 else 1) +
            (if (dailyResetDate.asKnown() == null) 0 else 1) +
            (if (monthlyResetMonth.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentUsage &&
            dailySpend == other.dailySpend &&
            dailyTransactionCount == other.dailyTransactionCount &&
            monthlySpend == other.monthlySpend &&
            dailyResetDate == other.dailyResetDate &&
            monthlyResetMonth == other.monthlyResetMonth &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dailySpend,
            dailyTransactionCount,
            monthlySpend,
            dailyResetDate,
            monthlyResetMonth,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentUsage{dailySpend=$dailySpend, dailyTransactionCount=$dailyTransactionCount, monthlySpend=$monthlySpend, dailyResetDate=$dailyResetDate, monthlyResetMonth=$monthlyResetMonth, additionalProperties=$additionalProperties}"
}
