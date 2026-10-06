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

class StatementDelivery
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val internalAccountId: JsonField<String>,
    private val periodStart: JsonField<LocalDate>,
    private val statementDeliveredAt: JsonField<OffsetDateTime>,
    private val fetchedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("internalAccountId")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("periodStart")
        @ExcludeMissing
        periodStart: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("statementDeliveredAt")
        @ExcludeMissing
        statementDeliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fetchedAt")
        @ExcludeMissing
        fetchedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(internalAccountId, periodStart, statementDeliveredAt, fetchedAt, mutableMapOf())

    /**
     * The account whose statement this is
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = internalAccountId.getRequired("internalAccountId")

    /**
     * First day of the statement period
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodStart(): LocalDate = periodStart.getRequired("periodStart")

    /**
     * When the statement was issued, from the first receipt for this period. Later receipts do not
     * move it.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementDeliveredAt(): OffsetDateTime =
        statementDeliveredAt.getRequired("statementDeliveredAt")

    /**
     * When the statement for this period was first read from Grid. Absent if it never has been
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fetchedAt(): OffsetDateTime? = fetchedAt.getNullable("fetchedAt")

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internalAccountId")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

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

    /**
     * Returns the raw JSON value of [fetchedAt].
     *
     * Unlike [fetchedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fetchedAt")
    @ExcludeMissing
    fun _fetchedAt(): JsonField<OffsetDateTime> = fetchedAt

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
         * Returns a mutable builder for constructing an instance of [StatementDelivery].
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountId()
         * .periodStart()
         * .statementDeliveredAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [StatementDelivery]. */
    class Builder internal constructor() {

        private var internalAccountId: JsonField<String>? = null
        private var periodStart: JsonField<LocalDate>? = null
        private var statementDeliveredAt: JsonField<OffsetDateTime>? = null
        private var fetchedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(statementDelivery: StatementDelivery) = apply {
            internalAccountId = statementDelivery.internalAccountId
            periodStart = statementDelivery.periodStart
            statementDeliveredAt = statementDelivery.statementDeliveredAt
            fetchedAt = statementDelivery.fetchedAt
            additionalProperties = statementDelivery.additionalProperties.toMutableMap()
        }

        /** The account whose statement this is */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** First day of the statement period */
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
         * When the statement was issued, from the first receipt for this period. Later receipts do
         * not move it.
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

        /**
         * When the statement for this period was first read from Grid. Absent if it never has been
         */
        fun fetchedAt(fetchedAt: OffsetDateTime) = fetchedAt(JsonField.of(fetchedAt))

        /**
         * Sets [Builder.fetchedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fetchedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fetchedAt(fetchedAt: JsonField<OffsetDateTime>) = apply { this.fetchedAt = fetchedAt }

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
         * Returns an immutable instance of [StatementDelivery].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountId()
         * .periodStart()
         * .statementDeliveredAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatementDelivery =
            StatementDelivery(
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("periodStart", periodStart),
                checkRequired("statementDeliveredAt", statementDeliveredAt),
                fetchedAt,
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
    fun validate(): StatementDelivery = apply {
        if (validated) {
            return@apply
        }

        internalAccountId()
        periodStart()
        statementDeliveredAt()
        fetchedAt()
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
        (if (internalAccountId.asKnown() == null) 0 else 1) +
            (if (periodStart.asKnown() == null) 0 else 1) +
            (if (statementDeliveredAt.asKnown() == null) 0 else 1) +
            (if (fetchedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementDelivery &&
            internalAccountId == other.internalAccountId &&
            periodStart == other.periodStart &&
            statementDeliveredAt == other.statementDeliveredAt &&
            fetchedAt == other.fetchedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            internalAccountId,
            periodStart,
            statementDeliveredAt,
            fetchedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatementDelivery{internalAccountId=$internalAccountId, periodStart=$periodStart, statementDeliveredAt=$statementDeliveredAt, fetchedAt=$fetchedAt, additionalProperties=$additionalProperties}"
}
