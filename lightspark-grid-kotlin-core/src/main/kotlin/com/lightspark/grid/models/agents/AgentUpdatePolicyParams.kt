// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Partially update an agent's policy. Only provided fields will be updated; omitted fields retain
 * their current values. Policy changes take effect immediately.
 */
class AgentUpdatePolicyParams
private constructor(
    private val agentId: String?,
    private val agentPolicyUpdateRequest: AgentPolicyUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun agentId(): String? = agentId

    /**
     * Partial update to an agent's policy. Only provided fields will be updated; omitted fields
     * retain their current values.
     */
    fun agentPolicyUpdateRequest(): AgentPolicyUpdateRequest = agentPolicyUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        agentPolicyUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentUpdatePolicyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .agentPolicyUpdateRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentUpdatePolicyParams]. */
    class Builder internal constructor() {

        private var agentId: String? = null
        private var agentPolicyUpdateRequest: AgentPolicyUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentUpdatePolicyParams: AgentUpdatePolicyParams) = apply {
            agentId = agentUpdatePolicyParams.agentId
            agentPolicyUpdateRequest = agentUpdatePolicyParams.agentPolicyUpdateRequest
            additionalHeaders = agentUpdatePolicyParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentUpdatePolicyParams.additionalQueryParams.toBuilder()
        }

        fun agentId(agentId: String?) = apply { this.agentId = agentId }

        /**
         * Partial update to an agent's policy. Only provided fields will be updated; omitted fields
         * retain their current values.
         */
        fun agentPolicyUpdateRequest(agentPolicyUpdateRequest: AgentPolicyUpdateRequest) = apply {
            this.agentPolicyUpdateRequest = agentPolicyUpdateRequest
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
         * Returns an immutable instance of [AgentUpdatePolicyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .agentPolicyUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentUpdatePolicyParams =
            AgentUpdatePolicyParams(
                agentId,
                checkRequired("agentPolicyUpdateRequest", agentPolicyUpdateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AgentPolicyUpdateRequest = agentPolicyUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> agentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentUpdatePolicyParams &&
            agentId == other.agentId &&
            agentPolicyUpdateRequest == other.agentPolicyUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(agentId, agentPolicyUpdateRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentUpdatePolicyParams{agentId=$agentId, agentPolicyUpdateRequest=$agentPolicyUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
