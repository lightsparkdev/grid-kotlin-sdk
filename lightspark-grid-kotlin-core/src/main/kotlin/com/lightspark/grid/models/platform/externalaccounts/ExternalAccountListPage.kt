// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListResponse
import com.lightspark.grid.services.blocking.platform.ExternalAccountService
import java.util.Objects

/** @see ExternalAccountService.list */
class ExternalAccountListPage
private constructor(
    private val service: ExternalAccountService,
    private val params: ExternalAccountListParams,
    private val response: ExternalAccountListResponse,
) : Page<ExternalAccount> {

    /**
     * Delegates to [ExternalAccountListResponse], but gracefully handles missing data.
     *
     * @see ExternalAccountListResponse.data
     */
    fun data(): List<ExternalAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExternalAccountListResponse], but gracefully handles missing data.
     *
     * @see ExternalAccountListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [ExternalAccountListResponse], but gracefully handles missing data.
     *
     * @see ExternalAccountListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [ExternalAccountListResponse], but gracefully handles missing data.
     *
     * @see ExternalAccountListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<ExternalAccount> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): ExternalAccountListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ExternalAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalAccountListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountListPage].
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

    /** A builder for [ExternalAccountListPage]. */
    class Builder internal constructor() {

        private var service: ExternalAccountService? = null
        private var params: ExternalAccountListParams? = null
        private var response: ExternalAccountListResponse? = null

        internal fun from(externalAccountListPage: ExternalAccountListPage) = apply {
            service = externalAccountListPage.service
            params = externalAccountListPage.params
            response = externalAccountListPage.response
        }

        fun service(service: ExternalAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalAccountListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalAccountListPage].
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
        fun build(): ExternalAccountListPage =
            ExternalAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExternalAccountListPage{service=$service, params=$params, response=$response}"
}
