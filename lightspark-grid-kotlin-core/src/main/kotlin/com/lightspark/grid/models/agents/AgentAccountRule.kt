// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Per-account policy override that takes precedence over the agent's default policy for a specific
 * account.
 */
class AgentAccountRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val executionMode: JsonField<AgentExecutionMode>,
    private val perTransactionLimit: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("executionMode")
        @ExcludeMissing
        executionMode: JsonField<AgentExecutionMode> = JsonMissing.of(),
        @JsonProperty("perTransactionLimit")
        @ExcludeMissing
        perTransactionLimit: JsonField<Long> = JsonMissing.of(),
    ) : this(accountId, executionMode, perTransactionLimit, mutableMapOf())

    /**
     * The internal account ID this rule applies to.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("accountId")

    /**
     * Execution mode controlling whether agent actions require human approval. AUTO: The agent can
     * execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent actions
     * require explicit human approval before execution.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun executionMode(): AgentExecutionMode? = executionMode.getNullable("executionMode")

    /**
     * Per-transaction limit override, in the smallest unit of the relevant currency. Null inherits
     * from the agent's spending limits.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun perTransactionLimit(): Long? = perTransactionLimit.getNullable("perTransactionLimit")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [executionMode].
     *
     * Unlike [executionMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executionMode")
    @ExcludeMissing
    fun _executionMode(): JsonField<AgentExecutionMode> = executionMode

    /**
     * Returns the raw JSON value of [perTransactionLimit].
     *
     * Unlike [perTransactionLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("perTransactionLimit")
    @ExcludeMissing
    fun _perTransactionLimit(): JsonField<Long> = perTransactionLimit

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentAccountRule].
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentAccountRule]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var executionMode: JsonField<AgentExecutionMode> = JsonMissing.of()
        private var perTransactionLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentAccountRule: AgentAccountRule) = apply {
            accountId = agentAccountRule.accountId
            executionMode = agentAccountRule.executionMode
            perTransactionLimit = agentAccountRule.perTransactionLimit
            additionalProperties = agentAccountRule.additionalProperties.toMutableMap()
        }

        /** The internal account ID this rule applies to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         */
        fun executionMode(executionMode: AgentExecutionMode) =
            executionMode(JsonField.of(executionMode))

        /**
         * Sets [Builder.executionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionMode] with a well-typed [AgentExecutionMode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun executionMode(executionMode: JsonField<AgentExecutionMode>) = apply {
            this.executionMode = executionMode
        }

        /**
         * Per-transaction limit override, in the smallest unit of the relevant currency. Null
         * inherits from the agent's spending limits.
         */
        fun perTransactionLimit(perTransactionLimit: Long?) =
            perTransactionLimit(JsonField.ofNullable(perTransactionLimit))

        /**
         * Alias for [Builder.perTransactionLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perTransactionLimit(perTransactionLimit: Long) =
            perTransactionLimit(perTransactionLimit as Long?)

        /**
         * Sets [Builder.perTransactionLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perTransactionLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perTransactionLimit(perTransactionLimit: JsonField<Long>) = apply {
            this.perTransactionLimit = perTransactionLimit
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AgentAccountRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentAccountRule =
            AgentAccountRule(
                checkRequired("accountId", accountId),
                executionMode,
                perTransactionLimit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AgentAccountRule = apply {
        if (validated) {
            return@apply
        }

        accountId()
        executionMode()?.validate()
        perTransactionLimit()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LightsparkGridInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (accountId.asKnown() == null) 0 else 1) +
            (executionMode.asKnown()?.validity() ?: 0) +
            (if (perTransactionLimit.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentAccountRule &&
            accountId == other.accountId &&
            executionMode == other.executionMode &&
            perTransactionLimit == other.perTransactionLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountId, executionMode, perTransactionLimit, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentAccountRule{accountId=$accountId, executionMode=$executionMode, perTransactionLimit=$perTransactionLimit, additionalProperties=$additionalProperties}"
}
