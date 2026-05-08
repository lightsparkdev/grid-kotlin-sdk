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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A programmatic agent with scoped permissions and a spending policy, used to automate payment
 * workflows.
 */
class AgentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val isConnected: JsonField<Boolean>,
    private val isPaused: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val policy: JsonField<AgentPolicy>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val usage: JsonField<AgentUsage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isConnected")
        @ExcludeMissing
        isConnected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isPaused") @ExcludeMissing isPaused: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<AgentPolicy> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<AgentUsage> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        customerId,
        isConnected,
        isPaused,
        name,
        policy,
        updatedAt,
        usage,
        mutableMapOf(),
    )

    /**
     * System-generated unique identifier for the agent.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Creation timestamp.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The ID of the customer this agent operates on behalf of.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * Whether the agent has been installed and connected (i.e., its device code has been redeemed).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isConnected(): Boolean = isConnected.getRequired("isConnected")

    /**
     * Whether the agent is currently paused. Paused agents cannot initiate any actions.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPaused(): Boolean = isPaused.getRequired("isPaused")

    /**
     * Human-readable name for the agent.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Policy governing what an agent can do, how it executes actions, and its spending boundaries.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): AgentPolicy = policy.getRequired("policy")

    /**
     * Last update timestamp.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Real-time counters tracking the agent's spending and transaction activity against its policy
     * limits.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): AgentUsage = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [isConnected].
     *
     * Unlike [isConnected], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isConnected")
    @ExcludeMissing
    fun _isConnected(): JsonField<Boolean> = isConnected

    /**
     * Returns the raw JSON value of [isPaused].
     *
     * Unlike [isPaused], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPaused") @ExcludeMissing fun _isPaused(): JsonField<Boolean> = isPaused

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<AgentPolicy> = policy

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<AgentUsage> = usage

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
         * Returns a mutable builder for constructing an instance of [AgentListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customerId()
         * .isConnected()
         * .isPaused()
         * .name()
         * .policy()
         * .updatedAt()
         * .usage()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var isConnected: JsonField<Boolean>? = null
        private var isPaused: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var policy: JsonField<AgentPolicy>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var usage: JsonField<AgentUsage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentListResponse: AgentListResponse) = apply {
            id = agentListResponse.id
            createdAt = agentListResponse.createdAt
            customerId = agentListResponse.customerId
            isConnected = agentListResponse.isConnected
            isPaused = agentListResponse.isPaused
            name = agentListResponse.name
            policy = agentListResponse.policy
            updatedAt = agentListResponse.updatedAt
            usage = agentListResponse.usage
            additionalProperties = agentListResponse.additionalProperties.toMutableMap()
        }

        /** System-generated unique identifier for the agent. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Creation timestamp. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of the customer this agent operates on behalf of. */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * Whether the agent has been installed and connected (i.e., its device code has been
         * redeemed).
         */
        fun isConnected(isConnected: Boolean) = isConnected(JsonField.of(isConnected))

        /**
         * Sets [Builder.isConnected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isConnected] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isConnected(isConnected: JsonField<Boolean>) = apply { this.isConnected = isConnected }

        /** Whether the agent is currently paused. Paused agents cannot initiate any actions. */
        fun isPaused(isPaused: Boolean) = isPaused(JsonField.of(isPaused))

        /**
         * Sets [Builder.isPaused] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPaused] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPaused(isPaused: JsonField<Boolean>) = apply { this.isPaused = isPaused }

        /** Human-readable name for the agent. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Policy governing what an agent can do, how it executes actions, and its spending
         * boundaries.
         */
        fun policy(policy: AgentPolicy) = policy(JsonField.of(policy))

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [AgentPolicy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun policy(policy: JsonField<AgentPolicy>) = apply { this.policy = policy }

        /** Last update timestamp. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Real-time counters tracking the agent's spending and transaction activity against its
         * policy limits.
         */
        fun usage(usage: AgentUsage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [AgentUsage] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usage(usage: JsonField<AgentUsage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [AgentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customerId()
         * .isConnected()
         * .isPaused()
         * .name()
         * .policy()
         * .updatedAt()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentListResponse =
            AgentListResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("isConnected", isConnected),
                checkRequired("isPaused", isPaused),
                checkRequired("name", name),
                checkRequired("policy", policy),
                checkRequired("updatedAt", updatedAt),
                checkRequired("usage", usage),
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
    fun validate(): AgentListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customerId()
        isConnected()
        isPaused()
        name()
        policy().validate()
        updatedAt()
        usage().validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (isConnected.asKnown() == null) 0 else 1) +
            (if (isPaused.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (policy.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (usage.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            isConnected == other.isConnected &&
            isPaused == other.isPaused &&
            name == other.name &&
            policy == other.policy &&
            updatedAt == other.updatedAt &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            customerId,
            isConnected,
            isPaused,
            name,
            policy,
            updatedAt,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentListResponse{id=$id, createdAt=$createdAt, customerId=$customerId, isConnected=$isConnected, isPaused=$isPaused, name=$name, policy=$policy, updatedAt=$updatedAt, usage=$usage, additionalProperties=$additionalProperties}"
}
