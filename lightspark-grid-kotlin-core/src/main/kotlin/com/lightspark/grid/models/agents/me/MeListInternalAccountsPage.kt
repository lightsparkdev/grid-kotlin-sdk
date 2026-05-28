// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.models.customers.InternalAccountListResponse
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.services.blocking.agents.MeService
import java.util.Objects

/** @see MeService.listInternalAccounts */
class MeListInternalAccountsPage
private constructor(
    private val service: MeService,
    private val params: MeListInternalAccountsParams,
    private val response: InternalAccountListResponse,
) : Page<InternalAccount> {

    /**
     * Delegates to [InternalAccountListResponse], but gracefully handles missing data.
     *
     * @see InternalAccountListResponse.data
     */
    fun data(): List<InternalAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InternalAccountListResponse], but gracefully handles missing data.
     *
     * @see InternalAccountListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [InternalAccountListResponse], but gracefully handles missing data.
     *
     * @see InternalAccountListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [InternalAccountListResponse], but gracefully handles missing data.
     *
     * @see InternalAccountListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<InternalAccount> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): MeListInternalAccountsParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): MeListInternalAccountsPage =
        service.listInternalAccounts(nextPageParams())

    fun autoPager(): AutoPager<InternalAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MeListInternalAccountsParams = params

    /** The response that this page was parsed from. */
    fun response(): InternalAccountListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeListInternalAccountsPage].
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

    /** A builder for [MeListInternalAccountsPage]. */
    class Builder internal constructor() {

        private var service: MeService? = null
        private var params: MeListInternalAccountsParams? = null
        private var response: InternalAccountListResponse? = null

        internal fun from(meListInternalAccountsPage: MeListInternalAccountsPage) = apply {
            service = meListInternalAccountsPage.service
            params = meListInternalAccountsPage.params
            response = meListInternalAccountsPage.response
        }

        fun service(service: MeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeListInternalAccountsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InternalAccountListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeListInternalAccountsPage].
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
        fun build(): MeListInternalAccountsPage =
            MeListInternalAccountsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeListInternalAccountsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MeListInternalAccountsPage{service=$service, params=$params, response=$response}"
}
