// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.lightspark.grid.core.AutoPagerAsync
import com.lightspark.grid.core.PageAsync
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.async.BeneficialOwnerServiceAsync
import java.util.Objects

/** @see BeneficialOwnerServiceAsync.list */
class BeneficialOwnerListPageAsync
private constructor(
    private val service: BeneficialOwnerServiceAsync,
    private val params: BeneficialOwnerListParams,
    private val response: BeneficialOwnerListPageResponse,
) : PageAsync<BeneficialOwnerListResponse> {

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.data
     */
    fun data(): List<BeneficialOwnerListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<BeneficialOwnerListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): BeneficialOwnerListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): BeneficialOwnerListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BeneficialOwnerListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BeneficialOwnerListParams = params

    /** The response that this page was parsed from. */
    fun response(): BeneficialOwnerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeneficialOwnerListPageAsync].
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

    /** A builder for [BeneficialOwnerListPageAsync]. */
    class Builder internal constructor() {

        private var service: BeneficialOwnerServiceAsync? = null
        private var params: BeneficialOwnerListParams? = null
        private var response: BeneficialOwnerListPageResponse? = null

        internal fun from(beneficialOwnerListPageAsync: BeneficialOwnerListPageAsync) = apply {
            service = beneficialOwnerListPageAsync.service
            params = beneficialOwnerListPageAsync.params
            response = beneficialOwnerListPageAsync.response
        }

        fun service(service: BeneficialOwnerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BeneficialOwnerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BeneficialOwnerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BeneficialOwnerListPageAsync].
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
        fun build(): BeneficialOwnerListPageAsync =
            BeneficialOwnerListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BeneficialOwnerListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BeneficialOwnerListPageAsync{service=$service, params=$params, response=$response}"
}
