// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.AutoPagerAsync
import com.lightspark.grid.core.PageAsync
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.async.AgentServiceAsync
import java.util.Objects

/** @see AgentServiceAsync.listApprovals */
class AgentListApprovalsPageAsync
private constructor(
    private val service: AgentServiceAsync,
    private val params: AgentListApprovalsParams,
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

    fun nextPageParams(): AgentListApprovalsParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AgentListApprovalsPageAsync =
        service.listApprovals(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgentAction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentListApprovalsParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentActionListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentListApprovalsPageAsync].
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

    /** A builder for [AgentListApprovalsPageAsync]. */
    class Builder internal constructor() {

        private var service: AgentServiceAsync? = null
        private var params: AgentListApprovalsParams? = null
        private var response: AgentActionListResponse? = null

        internal fun from(agentListApprovalsPageAsync: AgentListApprovalsPageAsync) = apply {
            service = agentListApprovalsPageAsync.service
            params = agentListApprovalsPageAsync.params
            response = agentListApprovalsPageAsync.response
        }

        fun service(service: AgentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentListApprovalsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentActionListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentListApprovalsPageAsync].
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
        fun build(): AgentListApprovalsPageAsync =
            AgentListApprovalsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListApprovalsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgentListApprovalsPageAsync{service=$service, params=$params, response=$response}"
}
