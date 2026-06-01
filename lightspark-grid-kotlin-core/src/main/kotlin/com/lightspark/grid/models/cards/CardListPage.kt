// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.CardService
import java.util.Objects

/** @see CardService.list */
class CardListPage
private constructor(
    private val service: CardService,
    private val params: CardListParams,
    private val response: CardListResponse,
) : Page<Card> {

    /**
     * Delegates to [CardListResponse], but gracefully handles missing data.
     *
     * @see CardListResponse.data
     */
    fun data(): List<Card> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardListResponse], but gracefully handles missing data.
     *
     * @see CardListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [CardListResponse], but gracefully handles missing data.
     *
     * @see CardListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [CardListResponse], but gracefully handles missing data.
     *
     * @see CardListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<Card> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CardListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Card> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardListPage].
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

    /** A builder for [CardListPage]. */
    class Builder internal constructor() {

        private var service: CardService? = null
        private var params: CardListParams? = null
        private var response: CardListResponse? = null

        internal fun from(cardListPage: CardListPage) = apply {
            service = cardListPage.service
            params = cardListPage.params
            response = cardListPage.response
        }

        fun service(service: CardService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardListPage].
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
        fun build(): CardListPage =
            CardListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CardListPage{service=$service, params=$params, response=$response}"
}
