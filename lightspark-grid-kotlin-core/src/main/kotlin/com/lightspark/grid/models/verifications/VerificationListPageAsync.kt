// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.lightspark.grid.core.AutoPagerAsync
import com.lightspark.grid.core.PageAsync
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.services.async.VerificationServiceAsync
import java.util.Objects

/** @see VerificationServiceAsync.list */
class VerificationListPageAsync
private constructor(
    private val service: VerificationServiceAsync,
    private val params: VerificationListParams,
    private val response: VerificationListPageResponse,
) : PageAsync<VerificationListResponse> {

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

    override suspend fun nextPage(): VerificationListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerificationListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VerificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerificationListPageAsync].
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

    /** A builder for [VerificationListPageAsync]. */
    class Builder internal constructor() {

        private var service: VerificationServiceAsync? = null
        private var params: VerificationListParams? = null
        private var response: VerificationListPageResponse? = null

        internal fun from(verificationListPageAsync: VerificationListPageAsync) = apply {
            service = verificationListPageAsync.service
            params = verificationListPageAsync.params
            response = verificationListPageAsync.response
        }

        fun service(service: VerificationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VerificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerificationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerificationListPageAsync].
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
        fun build(): VerificationListPageAsync =
            VerificationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VerificationListPageAsync{service=$service, params=$params, response=$response}"
}
