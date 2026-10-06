// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Record your monthly receipt that you pulled and issued this account's periodic statement for a
 * period. Grid stores it as the delivery record for that account and period.
 *
 * Send it once a month for each account, after you have issued the statement built from `GET
 * /internal-accounts/{id}/balance-changes`. Send it within five days of the month's end for every
 * customer account: Grid checks then that every account's statement was issued.
 *
 * `periodStart` names the period: the first day of the statement month, as a date. It must be the
 * first of a month, and a month that has already begun.
 *
 * Sending a receipt is idempotent. The stored time is the first receipt's, so calling this again
 * does not move it.
 */
class CustomerConfirmStatementDeliveryParams
private constructor(
    private val id: String?,
    private val confirmStatementDeliveryRequest: ConfirmStatementDeliveryRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun confirmStatementDeliveryRequest(): ConfirmStatementDeliveryRequest =
        confirmStatementDeliveryRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        confirmStatementDeliveryRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerConfirmStatementDeliveryParams].
         *
         * The following fields are required:
         * ```kotlin
         * .confirmStatementDeliveryRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerConfirmStatementDeliveryParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var confirmStatementDeliveryRequest: ConfirmStatementDeliveryRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerConfirmStatementDeliveryParams: CustomerConfirmStatementDeliveryParams
        ) = apply {
            id = customerConfirmStatementDeliveryParams.id
            confirmStatementDeliveryRequest =
                customerConfirmStatementDeliveryParams.confirmStatementDeliveryRequest
            additionalHeaders = customerConfirmStatementDeliveryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerConfirmStatementDeliveryParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun confirmStatementDeliveryRequest(
            confirmStatementDeliveryRequest: ConfirmStatementDeliveryRequest
        ) = apply { this.confirmStatementDeliveryRequest = confirmStatementDeliveryRequest }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CustomerConfirmStatementDeliveryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .confirmStatementDeliveryRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerConfirmStatementDeliveryParams =
            CustomerConfirmStatementDeliveryParams(
                id,
                checkRequired("confirmStatementDeliveryRequest", confirmStatementDeliveryRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ConfirmStatementDeliveryRequest = confirmStatementDeliveryRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerConfirmStatementDeliveryParams &&
            id == other.id &&
            confirmStatementDeliveryRequest == other.confirmStatementDeliveryRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, confirmStatementDeliveryRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerConfirmStatementDeliveryParams{id=$id, confirmStatementDeliveryRequest=$confirmStatementDeliveryRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
