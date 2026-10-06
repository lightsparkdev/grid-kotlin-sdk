// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ConfirmStatementDeliveryRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val periodStart: JsonField<LocalDate>,
    private val statementDeliveredAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("periodStart")
        @ExcludeMissing
        periodStart: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("statementDeliveredAt")
        @ExcludeMissing
        statementDeliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(periodStart, statementDeliveredAt, mutableMapOf())

    /**
     * First day of the statement period the receipt covers, a calendar month in US Central time.
     * Must be the first day of a month that has already begun.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodStart(): LocalDate = periodStart.getRequired("periodStart")

    /**
     * When you issued the statement to the customer. Must include a timezone offset, must not be in
     * the future, and must be at or after the end of the period.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementDeliveredAt(): OffsetDateTime =
        statementDeliveredAt.getRequired("statementDeliveredAt")

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("periodStart")
    @ExcludeMissing
    fun _periodStart(): JsonField<LocalDate> = periodStart

    /**
     * Returns the raw JSON value of [statementDeliveredAt].
     *
     * Unlike [statementDeliveredAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statementDeliveredAt")
    @ExcludeMissing
    fun _statementDeliveredAt(): JsonField<OffsetDateTime> = statementDeliveredAt

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
         * [ConfirmStatementDeliveryRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .periodStart()
         * .statementDeliveredAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConfirmStatementDeliveryRequest]. */
    class Builder internal constructor() {

        private var periodStart: JsonField<LocalDate>? = null
        private var statementDeliveredAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(confirmStatementDeliveryRequest: ConfirmStatementDeliveryRequest) =
            apply {
                periodStart = confirmStatementDeliveryRequest.periodStart
                statementDeliveredAt = confirmStatementDeliveryRequest.statementDeliveredAt
                additionalProperties =
                    confirmStatementDeliveryRequest.additionalProperties.toMutableMap()
            }

        /**
         * First day of the statement period the receipt covers, a calendar month in US Central
         * time. Must be the first day of a month that has already begun.
         */
        fun periodStart(periodStart: LocalDate) = periodStart(JsonField.of(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<LocalDate>) = apply {
            this.periodStart = periodStart
        }

        /**
         * When you issued the statement to the customer. Must include a timezone offset, must not
         * be in the future, and must be at or after the end of the period.
         */
        fun statementDeliveredAt(statementDeliveredAt: OffsetDateTime) =
            statementDeliveredAt(JsonField.of(statementDeliveredAt))

        /**
         * Sets [Builder.statementDeliveredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDeliveredAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statementDeliveredAt(statementDeliveredAt: JsonField<OffsetDateTime>) = apply {
            this.statementDeliveredAt = statementDeliveredAt
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
         * Returns an immutable instance of [ConfirmStatementDeliveryRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .periodStart()
         * .statementDeliveredAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfirmStatementDeliveryRequest =
            ConfirmStatementDeliveryRequest(
                checkRequired("periodStart", periodStart),
                checkRequired("statementDeliveredAt", statementDeliveredAt),
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
    fun validate(): ConfirmStatementDeliveryRequest = apply {
        if (validated) {
            return@apply
        }

        periodStart()
        statementDeliveredAt()
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
        (if (periodStart.asKnown() == null) 0 else 1) +
            (if (statementDeliveredAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfirmStatementDeliveryRequest &&
            periodStart == other.periodStart &&
            statementDeliveredAt == other.statementDeliveredAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(periodStart, statementDeliveredAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfirmStatementDeliveryRequest{periodStart=$periodStart, statementDeliveredAt=$statementDeliveredAt, additionalProperties=$additionalProperties}"
}
