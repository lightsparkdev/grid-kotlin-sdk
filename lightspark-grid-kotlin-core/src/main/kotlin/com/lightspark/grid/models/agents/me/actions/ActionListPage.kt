// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.actions

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.agents.me.ActionService
import java.util.Objects

/** @see ActionService.list */
class ActionListPage
private constructor(
    private val service: ActionService,
    private val params: ActionListParams,
    private val response: ActionListPageResponse,
) : Page<ActionListResponse> {

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.data
     */
    fun data(): List<ActionListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<ActionListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): ActionListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ActionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ActionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionListPage].
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

    /** A builder for [ActionListPage]. */
    class Builder internal constructor() {

        private var service: ActionService? = null
        private var params: ActionListParams? = null
        private var response: ActionListPageResponse? = null

        internal fun from(actionListPage: ActionListPage) = apply {
            service = actionListPage.service
            params = actionListPage.params
            response = actionListPage.response
        }

        fun service(service: ActionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ActionListPage].
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
        fun build(): ActionListPage =
            ActionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ActionListPage{service=$service, params=$params, response=$response}"
}
