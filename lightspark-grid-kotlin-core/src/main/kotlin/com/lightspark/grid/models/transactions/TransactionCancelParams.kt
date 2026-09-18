// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.immutableEmptyMap
import java.util.Objects

/**
 * Request cancellation of a pending bank transfer — an ACH transfer (push or pull) or a wire —
 * before it has settled, for example a payment or collection initiated outside of the receiving
 * bank's processing window. Whether a transfer can still be cancelled is determined by the banking
 * partner that is settling it: the request is forwarded to the partner's own cancellation facility,
 * and a transfer that the partner has already processed (or that is otherwise past its cancellation
 * window) cannot be cancelled. Cancellation applies to bank-rail transfers; requests for
 * transaction types that cannot be cancelled are rejected.
 */
class TransactionCancelParams
private constructor(
    private val transactionId: String?,
    private val cancelTransactionRequest: CancelTransactionRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun transactionId(): String? = transactionId

    fun cancelTransactionRequest(): CancelTransactionRequest? = cancelTransactionRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        cancelTransactionRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TransactionCancelParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TransactionCancelParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TransactionCancelParams]. */
    class Builder internal constructor() {

        private var transactionId: String? = null
        private var cancelTransactionRequest: CancelTransactionRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionCancelParams: TransactionCancelParams) = apply {
            transactionId = transactionCancelParams.transactionId
            cancelTransactionRequest = transactionCancelParams.cancelTransactionRequest
            additionalHeaders = transactionCancelParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionCancelParams.additionalQueryParams.toBuilder()
        }

        fun transactionId(transactionId: String?) = apply { this.transactionId = transactionId }

        fun cancelTransactionRequest(cancelTransactionRequest: CancelTransactionRequest?) = apply {
            this.cancelTransactionRequest = cancelTransactionRequest
        }

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
         * Returns an immutable instance of [TransactionCancelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionCancelParams =
            TransactionCancelParams(
                transactionId,
                cancelTransactionRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CancelTransactionRequest? = cancelTransactionRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> transactionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionCancelParams &&
            transactionId == other.transactionId &&
            cancelTransactionRequest == other.cancelTransactionRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            transactionId,
            cancelTransactionRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TransactionCancelParams{transactionId=$transactionId, cancelTransactionRequest=$cancelTransactionRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
