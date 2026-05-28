// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.BeneficialOwnerService
import java.util.Objects

/** @see BeneficialOwnerService.list */
class BeneficialOwnerListPage
private constructor(
    private val service: BeneficialOwnerService,
    private val params: BeneficialOwnerListParams,
    private val response: BeneficialOwnerListPageResponse,
) : Page<BeneficialOwnerListResponse> {

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

    override fun nextPage(): BeneficialOwnerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BeneficialOwnerListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BeneficialOwnerListParams = params

    /** The response that this page was parsed from. */
    fun response(): BeneficialOwnerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeneficialOwnerListPage].
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

    /** A builder for [BeneficialOwnerListPage]. */
    class Builder internal constructor() {

        private var service: BeneficialOwnerService? = null
        private var params: BeneficialOwnerListParams? = null
        private var response: BeneficialOwnerListPageResponse? = null

        internal fun from(beneficialOwnerListPage: BeneficialOwnerListPage) = apply {
            service = beneficialOwnerListPage.service
            params = beneficialOwnerListPage.params
            response = beneficialOwnerListPage.response
        }

        fun service(service: BeneficialOwnerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BeneficialOwnerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BeneficialOwnerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BeneficialOwnerListPage].
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
        fun build(): BeneficialOwnerListPage =
            BeneficialOwnerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BeneficialOwnerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BeneficialOwnerListPage{service=$service, params=$params, response=$response}"
}
