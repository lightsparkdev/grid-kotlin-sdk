// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.AgentService
import java.util.Objects

/** @see AgentService.listApprovals */
class AgentListApprovalsPage
private constructor(
    private val service: AgentService,
    private val params: AgentListApprovalsParams,
    private val response: AgentListApprovalsPageResponse,
) : Page<AgentListApprovalsResponse> {

    /**
     * Delegates to [AgentListApprovalsPageResponse], but gracefully handles missing data.
     *
     * @see AgentListApprovalsPageResponse.data
     */
    fun data(): List<AgentListApprovalsResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AgentListApprovalsPageResponse], but gracefully handles missing data.
     *
     * @see AgentListApprovalsPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [AgentListApprovalsPageResponse], but gracefully handles missing data.
     *
     * @see AgentListApprovalsPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [AgentListApprovalsPageResponse], but gracefully handles missing data.
     *
     * @see AgentListApprovalsPageResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<AgentListApprovalsResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AgentListApprovalsParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AgentListApprovalsPage = service.listApprovals(nextPageParams())

    fun autoPager(): AutoPager<AgentListApprovalsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentListApprovalsParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentListApprovalsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentListApprovalsPage].
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

    /** A builder for [AgentListApprovalsPage]. */
    class Builder internal constructor() {

        private var service: AgentService? = null
        private var params: AgentListApprovalsParams? = null
        private var response: AgentListApprovalsPageResponse? = null

        internal fun from(agentListApprovalsPage: AgentListApprovalsPage) = apply {
            service = agentListApprovalsPage.service
            params = agentListApprovalsPage.params
            response = agentListApprovalsPage.response
        }

        fun service(service: AgentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentListApprovalsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentListApprovalsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentListApprovalsPage].
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
        fun build(): AgentListApprovalsPage =
            AgentListApprovalsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListApprovalsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgentListApprovalsPage{service=$service, params=$params, response=$response}"
}
