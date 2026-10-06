// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.AutoPagerAsync
import com.lightspark.grid.core.PageAsync
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.async.CustomerServiceAsync
import java.util.Objects

/** @see CustomerServiceAsync.listBalanceChanges */
class CustomerListBalanceChangesPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val params: CustomerListBalanceChangesParams,
    private val response: BalanceChangeListResponse,
) : PageAsync<BalanceChange> {

    /**
     * Delegates to [BalanceChangeListResponse], but gracefully handles missing data.
     *
     * @see BalanceChangeListResponse.data
     */
    fun data(): List<BalanceChange> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BalanceChangeListResponse], but gracefully handles missing data.
     *
     * @see BalanceChangeListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [BalanceChangeListResponse], but gracefully handles missing data.
     *
     * @see BalanceChangeListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [BalanceChangeListResponse], but gracefully handles missing data.
     *
     * @see BalanceChangeListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<BalanceChange> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CustomerListBalanceChangesParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CustomerListBalanceChangesPageAsync =
        service.listBalanceChanges(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceChange> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListBalanceChangesParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceChangeListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBalanceChangesPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerListBalanceChangesPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var params: CustomerListBalanceChangesParams? = null
        private var response: BalanceChangeListResponse? = null

        internal fun from(
            customerListBalanceChangesPageAsync: CustomerListBalanceChangesPageAsync
        ) = apply {
            service = customerListBalanceChangesPageAsync.service
            params = customerListBalanceChangesPageAsync.params
            response = customerListBalanceChangesPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListBalanceChangesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceChangeListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListBalanceChangesPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerListBalanceChangesPageAsync =
            CustomerListBalanceChangesPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListBalanceChangesPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListBalanceChangesPageAsync{service=$service, params=$params, response=$response}"
}
