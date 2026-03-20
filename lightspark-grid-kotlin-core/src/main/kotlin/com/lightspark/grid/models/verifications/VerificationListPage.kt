// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.lightspark.grid.core.AutoPager
import com.lightspark.grid.core.Page
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.blocking.VerificationService
import java.util.Objects

/** @see VerificationService.list */
class VerificationListPage
private constructor(
    private val service: VerificationService,
    private val params: VerificationListParams,
    private val response: VerificationListPageResponse,
) : Page<VerificationListResponse> {

    /**
     * Delegates to [VerificationListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationListPageResponse.data
     */
    fun data(): List<VerificationListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [VerificationListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("nextCursor")

    /**
     * Delegates to [VerificationListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("hasMore")

    /**
     * Delegates to [VerificationListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationListPageResponse.totalCount
     */
    fun totalCount(): Long? = response._totalCount().getNullable("totalCount")

    override fun items(): List<VerificationListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): VerificationListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): VerificationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VerificationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VerificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerificationListPage].
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

    /** A builder for [VerificationListPage]. */
    class Builder internal constructor() {

        private var service: VerificationService? = null
        private var params: VerificationListParams? = null
        private var response: VerificationListPageResponse? = null

        internal fun from(verificationListPage: VerificationListPage) = apply {
            service = verificationListPage.service
            params = verificationListPage.params
            response = verificationListPage.response
        }

        fun service(service: VerificationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VerificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerificationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerificationListPage].
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
        fun build(): VerificationListPage =
            VerificationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VerificationListPage{service=$service, params=$params, response=$response}"
}
