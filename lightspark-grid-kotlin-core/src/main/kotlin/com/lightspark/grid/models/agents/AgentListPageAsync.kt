// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.AutoPagerAsync
import com.lightspark.grid.core.PageAsync
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.async.AgentServiceAsync
import java.util.Objects

/** @see AgentServiceAsync.list */
class AgentListPageAsync
private constructor(
    private val service: AgentServiceAsync,
    private val params: AgentListParams,
    private val response: AgentListResponse,
) : PageAsync<Agent> {

    /**
     * Delegates to [AgentListResponse], but gracefully handles missing data.
     *
     * @see AgentListResponse.data
     */
    fun data(): List<Agent> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AgentListResponse], but gracefully handles missing data.
     *
     * @see AgentListResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [AgentListResponse], but gracefully handles missing data.
     *
     * @see AgentListResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [AgentListResponse], but gracefully handles missing data.
     *
     * @see AgentListResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<Agent> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AgentListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AgentListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Agent> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentListPageAsync].
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

    /** A builder for [AgentListPageAsync]. */
    class Builder internal constructor() {

        private var service: AgentServiceAsync? = null
        private var params: AgentListParams? = null
        private var response: AgentListResponse? = null

        internal fun from(agentListPageAsync: AgentListPageAsync) = apply {
            service = agentListPageAsync.service
            params = agentListPageAsync.params
            response = agentListPageAsync.response
        }

        fun service(service: AgentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentListPageAsync].
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
        fun build(): AgentListPageAsync =
            AgentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgentListPageAsync{service=$service, params=$params, response=$response}"
}
