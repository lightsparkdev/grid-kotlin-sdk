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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.invitations.CurrencyAmount
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A window of balance changes with the balances that bound it. The opening and closing balances
 * describe the whole window, not the page, so they are the same on every page, and the identity
 * `openingBalance + Σ(data[].amount) == closingBalance` holds only once every page's `data` is
 * summed.
 */
class BalanceChangeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val closingBalance: JsonField<CurrencyAmount>,
    private val data: JsonField<List<BalanceChange>>,
    private val endDate: JsonField<OffsetDateTime>,
    private val hasMore: JsonField<Boolean>,
    private val openingBalance: JsonField<CurrencyAmount>,
    private val startDate: JsonField<OffsetDateTime>,
    private val nextCursor: JsonField<String>,
    private val totalCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("closingBalance")
        @ExcludeMissing
        closingBalance: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<BalanceChange>> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("openingBalance")
        @ExcludeMissing
        openingBalance: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("nextCursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalCount") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        closingBalance,
        data,
        endDate,
        hasMore,
        openingBalance,
        startDate,
        nextCursor,
        totalCount,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun closingBalance(): CurrencyAmount = closingBalance.getRequired("closingBalance")

    /**
     * Balance changes on this page, ordered by `effectiveAt`
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<BalanceChange> = data.getRequired("data")

    /**
     * End of the window, exclusive
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

    /**
     * Indicates if more changes are available beyond this page
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun openingBalance(): CurrencyAmount = openingBalance.getRequired("openingBalance")

    /**
     * Start of the window, inclusive
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

    /**
     * Cursor to retrieve the next page of results (only present if hasMore is true)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nextCursor(): String? = nextCursor.getNullable("nextCursor")

    /**
     * Number of balance changes in the window, across all pages
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun totalCount(): Long? = totalCount.getNullable("totalCount")

    /**
     * Returns the raw JSON value of [closingBalance].
     *
     * Unlike [closingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closingBalance")
    @ExcludeMissing
    fun _closingBalance(): JsonField<CurrencyAmount> = closingBalance

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<BalanceChange>> = data

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMore") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [openingBalance].
     *
     * Unlike [openingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("openingBalance")
    @ExcludeMissing
    fun _openingBalance(): JsonField<CurrencyAmount> = openingBalance

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextCursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalCount") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

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
         * Returns a mutable builder for constructing an instance of [BalanceChangeListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .closingBalance()
         * .data()
         * .endDate()
         * .hasMore()
         * .openingBalance()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceChangeListResponse]. */
    class Builder internal constructor() {

        private var closingBalance: JsonField<CurrencyAmount>? = null
        private var data: JsonField<MutableList<BalanceChange>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var openingBalance: JsonField<CurrencyAmount>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceChangeListResponse: BalanceChangeListResponse) = apply {
            closingBalance = balanceChangeListResponse.closingBalance
            data = balanceChangeListResponse.data.map { it.toMutableList() }
            endDate = balanceChangeListResponse.endDate
            hasMore = balanceChangeListResponse.hasMore
            openingBalance = balanceChangeListResponse.openingBalance
            startDate = balanceChangeListResponse.startDate
            nextCursor = balanceChangeListResponse.nextCursor
            totalCount = balanceChangeListResponse.totalCount
            additionalProperties = balanceChangeListResponse.additionalProperties.toMutableMap()
        }

        fun closingBalance(closingBalance: CurrencyAmount) =
            closingBalance(JsonField.of(closingBalance))

        /**
         * Sets [Builder.closingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closingBalance] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closingBalance(closingBalance: JsonField<CurrencyAmount>) = apply {
            this.closingBalance = closingBalance
        }

        /** Balance changes on this page, ordered by `effectiveAt` */
        fun data(data: List<BalanceChange>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<BalanceChange>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun data(data: JsonField<List<BalanceChange>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [BalanceChange] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: BalanceChange) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** End of the window, exclusive */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** Indicates if more changes are available beyond this page */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun openingBalance(openingBalance: CurrencyAmount) =
            openingBalance(JsonField.of(openingBalance))

        /**
         * Sets [Builder.openingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openingBalance] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openingBalance(openingBalance: JsonField<CurrencyAmount>) = apply {
            this.openingBalance = openingBalance
        }

        /** Start of the window, inclusive */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** Cursor to retrieve the next page of results (only present if hasMore is true) */
        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

        /** Number of balance changes in the window, across all pages */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

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
         * Returns an immutable instance of [BalanceChangeListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .closingBalance()
         * .data()
         * .endDate()
         * .hasMore()
         * .openingBalance()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceChangeListResponse =
            BalanceChangeListResponse(
                checkRequired("closingBalance", closingBalance),
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("endDate", endDate),
                checkRequired("hasMore", hasMore),
                checkRequired("openingBalance", openingBalance),
                checkRequired("startDate", startDate),
                nextCursor,
                totalCount,
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
    fun validate(): BalanceChangeListResponse = apply {
        if (validated) {
            return@apply
        }

        closingBalance().validate()
        data().forEach { it.validate() }
        endDate()
        hasMore()
        openingBalance().validate()
        startDate()
        nextCursor()
        totalCount()
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
        (closingBalance.asKnown()?.validity() ?: 0) +
            (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (hasMore.asKnown() == null) 0 else 1) +
            (openingBalance.asKnown()?.validity() ?: 0) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (if (nextCursor.asKnown() == null) 0 else 1) +
            (if (totalCount.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceChangeListResponse &&
            closingBalance == other.closingBalance &&
            data == other.data &&
            endDate == other.endDate &&
            hasMore == other.hasMore &&
            openingBalance == other.openingBalance &&
            startDate == other.startDate &&
            nextCursor == other.nextCursor &&
            totalCount == other.totalCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            closingBalance,
            data,
            endDate,
            hasMore,
            openingBalance,
            startDate,
            nextCursor,
            totalCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceChangeListResponse{closingBalance=$closingBalance, data=$data, endDate=$endDate, hasMore=$hasMore, openingBalance=$openingBalance, startDate=$startDate, nextCursor=$nextCursor, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
