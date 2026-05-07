// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.actions

import com.lightspark.grid.core.AutoPagerAsync
import com.lightspark.grid.core.PageAsync
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.agents.AgentActionListResponse
import com.lightspark.grid.services.async.agents.me.ActionServiceAsync
import java.util.Objects

/** @see ActionServiceAsync.list */
class ActionListPageAsync
private constructor(
    private val service: ActionServiceAsync,
    private val params: ActionListParams,
    private val response: AgentActionListResponse,
) : PageAsync<AgentAction> {

    /**
     * Delegates to [AgentActionListResponse], but gracefully handles missing data.
     *
     * @see AgentActionListResponse.data
     */
    fun data(): List<AgentAction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AgentActionListResponse], but gracefully handles missing data.
     *
     * @see AgentActionListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [AgentActionListResponse], but gracefully handles missing data.
     *
     * @see AgentActionListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [AgentActionListResponse], but gracefully handles missing data.
     *
     * @see AgentActionListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<AgentAction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): ActionListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): ActionListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgentAction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentActionListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionListPageAsync].
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

    /** A builder for [ActionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ActionServiceAsync? = null
        private var params: ActionListParams? = null
        private var response: AgentActionListResponse? = null

        internal fun from(actionListPageAsync: ActionListPageAsync) = apply {
            service = actionListPageAsync.service
            params = actionListPageAsync.params
            response = actionListPageAsync.response
        }

        fun service(service: ActionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentActionListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ActionListPageAsync].
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
        fun build(): ActionListPageAsync =
            ActionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ActionListPageAsync{service=$service, params=$params, response=$response}"
}
