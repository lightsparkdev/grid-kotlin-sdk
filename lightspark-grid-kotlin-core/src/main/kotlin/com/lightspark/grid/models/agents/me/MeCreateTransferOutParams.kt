// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.models.transferout.TransferOutRequest
import java.util.Objects

/**
 * Transfer funds from an internal account to an external account for the authenticated agent's
 * customer. Accounts must belong to the agent's customer. Requires the CREATE_TRANSFERS permission
 * in the agent's policy. If the agent's policy requires approval for this amount, the transaction
 * will be created in a pending state and must be approved by the platform via `POST
 * /agents/{agentId}/actions/{actionId}/approve`.
 */
class MeCreateTransferOutParams
private constructor(
    private val idempotencyKey: String?,
    private val transferOutRequest: TransferOutRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): String? = idempotencyKey

    fun transferOutRequest(): TransferOutRequest = transferOutRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        transferOutRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeCreateTransferOutParams].
         *
         * The following fields are required:
         * ```kotlin
         * .transferOutRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MeCreateTransferOutParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var transferOutRequest: TransferOutRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(meCreateTransferOutParams: MeCreateTransferOutParams) = apply {
            idempotencyKey = meCreateTransferOutParams.idempotencyKey
            transferOutRequest = meCreateTransferOutParams.transferOutRequest
            additionalHeaders = meCreateTransferOutParams.additionalHeaders.toBuilder()
            additionalQueryParams = meCreateTransferOutParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        fun transferOutRequest(transferOutRequest: TransferOutRequest) = apply {
            this.transferOutRequest = transferOutRequest
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
         * Returns an immutable instance of [MeCreateTransferOutParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .transferOutRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeCreateTransferOutParams =
            MeCreateTransferOutParams(
                idempotencyKey,
                checkRequired("transferOutRequest", transferOutRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): TransferOutRequest = transferOutRequest

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeCreateTransferOutParams &&
            idempotencyKey == other.idempotencyKey &&
            transferOutRequest == other.transferOutRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, transferOutRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MeCreateTransferOutParams{idempotencyKey=$idempotencyKey, transferOutRequest=$transferOutRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
