// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.tokens

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.TokenService
import java.util.Objects

/** @see TokenService.list */
class TokenListPage
private constructor(
    private val service: TokenService,
    private val params: TokenListParams,
    private val response: TokenListResponse,
) : Page<ApiToken> {

    /**
     * Delegates to [TokenListResponse], but gracefully handles missing data.
     *
     * @see TokenListResponse.data
     */
    fun data(): List<ApiToken> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TokenListResponse], but gracefully handles missing data.
     *
     * @see TokenListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [TokenListResponse], but gracefully handles missing data.
     *
     * @see TokenListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [TokenListResponse], but gracefully handles missing data.
     *
     * @see TokenListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<ApiToken> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): TokenListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): TokenListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ApiToken> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenListPage].
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

    /** A builder for [TokenListPage]. */
    class Builder internal constructor() {

        private var service: TokenService? = null
        private var params: TokenListParams? = null
        private var response: TokenListResponse? = null

        internal fun from(tokenListPage: TokenListPage) = apply {
            service = tokenListPage.service
            params = tokenListPage.params
            response = tokenListPage.response
        }

        fun service(service: TokenService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenListPage].
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
        fun build(): TokenListPage =
            TokenListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TokenListPage{service=$service, params=$params, response=$response}"
}
