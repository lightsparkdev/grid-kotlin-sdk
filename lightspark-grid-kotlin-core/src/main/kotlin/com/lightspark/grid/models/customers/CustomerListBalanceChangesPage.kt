// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.CustomerService
import java.util.Objects

/** @see CustomerService.listBalanceChanges */
class CustomerListBalanceChangesPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListBalanceChangesParams,
    private val response: BalanceChangeListResponse,
) : Page<BalanceChange> {

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

    override fun nextPage(): CustomerListBalanceChangesPage =
        service.listBalanceChanges(nextPageParams())

    fun autoPager(): AutoPager<BalanceChange> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListBalanceChangesParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceChangeListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListBalanceChangesPage].
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

    /** A builder for [CustomerListBalanceChangesPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListBalanceChangesParams? = null
        private var response: BalanceChangeListResponse? = null

        internal fun from(customerListBalanceChangesPage: CustomerListBalanceChangesPage) = apply {
            service = customerListBalanceChangesPage.service
            params = customerListBalanceChangesPage.params
            response = customerListBalanceChangesPage.response
        }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListBalanceChangesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceChangeListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListBalanceChangesPage].
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
        fun build(): CustomerListBalanceChangesPage =
            CustomerListBalanceChangesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListBalanceChangesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListBalanceChangesPage{service=$service, params=$params, response=$response}"
}
