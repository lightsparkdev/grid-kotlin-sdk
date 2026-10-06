// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * Every change to this account's balance in a window, in the order the money moved, with the
 * opening and closing balances for that window in the same response.
 *
 * `GET /transactions` returns one row per transaction. This returns one row per change to the
 * balance, and a transaction that moves the balance more than once produces more than one change:
 * an ACH deposit and its later return are two, and a card purchase that clears in two parts is two.
 * Each change's `transactionId` names its transaction, so fetch it from `GET
 * /transactions/{transactionId}` for its type, counterparty, merchant and rail.
 *
 * **The identity to assert:** `openingBalance + Σ(data[].amount) == closingBalance`, summed over
 * every page. The opening and closing balances describe the window rather than the page, so they
 * are the same on every page. Page until `hasMore` is false, then assert the identity.
 *
 * `startDate` and `endDate` are instants in any timezone, UTC included, and the window is
 * half-open: a change at exactly `endDate` belongs to the next window. Consecutive windows
 * therefore tile with no gap and no overlap.
 *
 * A window whose card settlement has not closed is refused with `409 NOT_YET_AVAILABLE`, because
 * its figures could still change. Retry once it has settled.
 *
 * **Fees are inside the changes.** A fee Grid charges comes out of the balance, so it is already in
 * `amount`: inside a send's change, or a change of its own for a withdrawal's fee. Each change's
 * `fee` says how much of its `amount` was a fee, negative when charged and positive when refunded.
 * To show a fee separately, split the change into `amount - fee` and `fee`. Never add `fee` on top
 * of `amount`, or the identity stops holding. Card transactions carry no Grid fee.
 */
class CustomerListBalanceChangesParams
private constructor(
    private val id: String?,
    private val endDate: OffsetDateTime,
    private val startDate: OffsetDateTime,
    private val cursor: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * End of the window, exclusive, in ISO 8601 format. Must carry a timezone, either `Z` for UTC
     * or an offset, and must not be in the future.
     */
    fun endDate(): OffsetDateTime = endDate

    /**
     * Start of the window, inclusive, in ISO 8601 format. Must carry a timezone, either `Z` for UTC
     * or an offset.
     */
    fun startDate(): OffsetDateTime = startDate

    /** Cursor for pagination (returned from previous request) */
    fun cursor(): String? = cursor

    /** Maximum number of changes to return per page */
    fun limit(): Long? = limit

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBalanceChangesParams].
         *
         * The following fields are required:
         * ```kotlin
         * .endDate()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerListBalanceChangesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var endDate: OffsetDateTime? = null
        private var startDate: OffsetDateTime? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerListBalanceChangesParams: CustomerListBalanceChangesParams) =
            apply {
                id = customerListBalanceChangesParams.id
                endDate = customerListBalanceChangesParams.endDate
                startDate = customerListBalanceChangesParams.startDate
                cursor = customerListBalanceChangesParams.cursor
                limit = customerListBalanceChangesParams.limit
                additionalHeaders = customerListBalanceChangesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerListBalanceChangesParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /**
         * End of the window, exclusive, in ISO 8601 format. Must carry a timezone, either `Z` for
         * UTC or an offset, and must not be in the future.
         */
        fun endDate(endDate: OffsetDateTime) = apply { this.endDate = endDate }

        /**
         * Start of the window, inclusive, in ISO 8601 format. Must carry a timezone, either `Z` for
         * UTC or an offset.
         */
        fun startDate(startDate: OffsetDateTime) = apply { this.startDate = startDate }

        /** Cursor for pagination (returned from previous request) */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Maximum number of changes to return per page */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CustomerListBalanceChangesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .endDate()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerListBalanceChangesParams =
            CustomerListBalanceChangesParams(
                id,
                checkRequired("endDate", endDate),
                checkRequired("startDate", startDate),
                cursor,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("endDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endDate))
                put("startDate", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startDate))
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListBalanceChangesParams &&
            id == other.id &&
            endDate == other.endDate &&
            startDate == other.startDate &&
            cursor == other.cursor &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            endDate,
            startDate,
            cursor,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerListBalanceChangesParams{id=$id, endDate=$endDate, startDate=$startDate, cursor=$cursor, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
