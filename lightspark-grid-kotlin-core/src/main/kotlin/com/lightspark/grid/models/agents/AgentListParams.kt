// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.Params
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Retrieve a paginated list of agents for the authenticated platform. */
class AgentListParams
private constructor(
    private val createdAfter: OffsetDateTime?,
    private val createdBefore: OffsetDateTime?,
    private val cursor: String?,
    private val customerId: String?,
    private val isConnected: Boolean?,
    private val isPaused: Boolean?,
    private val limit: Long?,
    private val updatedAfter: OffsetDateTime?,
    private val updatedBefore: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter agents created after this timestamp (inclusive) */
    fun createdAfter(): OffsetDateTime? = createdAfter

    /** Filter agents created before this timestamp (inclusive) */
    fun createdBefore(): OffsetDateTime? = createdBefore

    /** Cursor for pagination (returned from previous request) */
    fun cursor(): String? = cursor

    /** Filter by customer ID */
    fun customerId(): String? = customerId

    /** Filter by connection status (whether the device code has been redeemed) */
    fun isConnected(): Boolean? = isConnected

    /** Filter by paused status */
    fun isPaused(): Boolean? = isPaused

    /** Maximum number of results to return (default 20, max 100) */
    fun limit(): Long? = limit

    /** Filter agents updated after this timestamp (inclusive) */
    fun updatedAfter(): OffsetDateTime? = updatedAfter

    /** Filter agents updated before this timestamp (inclusive) */
    fun updatedBefore(): OffsetDateTime? = updatedBefore

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): AgentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AgentListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [AgentListParams]. */
    class Builder internal constructor() {

        private var createdAfter: OffsetDateTime? = null
        private var createdBefore: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: String? = null
        private var isConnected: Boolean? = null
        private var isPaused: Boolean? = null
        private var limit: Long? = null
        private var updatedAfter: OffsetDateTime? = null
        private var updatedBefore: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentListParams: AgentListParams) = apply {
            createdAfter = agentListParams.createdAfter
            createdBefore = agentListParams.createdBefore
            cursor = agentListParams.cursor
            customerId = agentListParams.customerId
            isConnected = agentListParams.isConnected
            isPaused = agentListParams.isPaused
            limit = agentListParams.limit
            updatedAfter = agentListParams.updatedAfter
            updatedBefore = agentListParams.updatedBefore
            additionalHeaders = agentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentListParams.additionalQueryParams.toBuilder()
        }

        /** Filter agents created after this timestamp (inclusive) */
        fun createdAfter(createdAfter: OffsetDateTime?) = apply { this.createdAfter = createdAfter }

        /** Filter agents created before this timestamp (inclusive) */
        fun createdBefore(createdBefore: OffsetDateTime?) = apply {
            this.createdBefore = createdBefore
        }

        /** Cursor for pagination (returned from previous request) */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Filter by customer ID */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Filter by connection status (whether the device code has been redeemed) */
        fun isConnected(isConnected: Boolean?) = apply { this.isConnected = isConnected }

        /**
         * Alias for [Builder.isConnected].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isConnected(isConnected: Boolean) = isConnected(isConnected as Boolean?)

        /** Filter by paused status */
        fun isPaused(isPaused: Boolean?) = apply { this.isPaused = isPaused }

        /**
         * Alias for [Builder.isPaused].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isPaused(isPaused: Boolean) = isPaused(isPaused as Boolean?)

        /** Maximum number of results to return (default 20, max 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Filter agents updated after this timestamp (inclusive) */
        fun updatedAfter(updatedAfter: OffsetDateTime?) = apply { this.updatedAfter = updatedAfter }

        /** Filter agents updated before this timestamp (inclusive) */
        fun updatedBefore(updatedBefore: OffsetDateTime?) = apply {
            this.updatedBefore = updatedBefore
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
         * Returns an immutable instance of [AgentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentListParams =
            AgentListParams(
                createdAfter,
                createdBefore,
                cursor,
                customerId,
                isConnected,
                isPaused,
                limit,
                updatedAfter,
                updatedBefore,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAfter?.let {
                    put("createdAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdBefore?.let {
                    put("createdBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                cursor?.let { put("cursor", it) }
                customerId?.let { put("customerId", it) }
                isConnected?.let { put("isConnected", it.toString()) }
                isPaused?.let { put("isPaused", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                updatedAfter?.let {
                    put("updatedAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedBefore?.let {
                    put("updatedBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListParams &&
            createdAfter == other.createdAfter &&
            createdBefore == other.createdBefore &&
            cursor == other.cursor &&
            customerId == other.customerId &&
            isConnected == other.isConnected &&
            isPaused == other.isPaused &&
            limit == other.limit &&
            updatedAfter == other.updatedAfter &&
            updatedBefore == other.updatedBefore &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdAfter,
            createdBefore,
            cursor,
            customerId,
            isConnected,
            isPaused,
            limit,
            updatedAfter,
            updatedBefore,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AgentListParams{createdAfter=$createdAfter, createdBefore=$createdBefore, cursor=$cursor, customerId=$customerId, isConnected=$isConnected, isPaused=$isPaused, limit=$limit, updatedAfter=$updatedAfter, updatedBefore=$updatedBefore, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
