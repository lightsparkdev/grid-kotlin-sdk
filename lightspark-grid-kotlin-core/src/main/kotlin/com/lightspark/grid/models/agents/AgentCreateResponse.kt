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
 * Response returned when an agent is created, including the agent and a device code for
 * installation.
 */
class AgentCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agent: JsonField<Agent>,
    private val deviceCode: JsonField<AgentDeviceCode>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent") @ExcludeMissing agent: JsonField<Agent> = JsonMissing.of(),
        @JsonProperty("deviceCode")
        @ExcludeMissing
        deviceCode: JsonField<AgentDeviceCode> = JsonMissing.of(),
    ) : this(agent, deviceCode, mutableMapOf())

    /**
     * A programmatic agent with scoped permissions and a spending policy, used to automate payment
     * workflows.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agent(): Agent = agent.getRequired("agent")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceCode(): AgentDeviceCode = deviceCode.getRequired("deviceCode")

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Agent> = agent

    /**
     * Returns the raw JSON value of [deviceCode].
     *
     * Unlike [deviceCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deviceCode")
    @ExcludeMissing
    fun _deviceCode(): JsonField<AgentDeviceCode> = deviceCode

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
         * Returns a mutable builder for constructing an instance of [AgentCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .agent()
         * .deviceCode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentCreateResponse]. */
    class Builder internal constructor() {

        private var agent: JsonField<Agent>? = null
        private var deviceCode: JsonField<AgentDeviceCode>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentCreateResponse: AgentCreateResponse) = apply {
            agent = agentCreateResponse.agent
            deviceCode = agentCreateResponse.deviceCode
            additionalProperties = agentCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * A programmatic agent with scoped permissions and a spending policy, used to automate
         * payment workflows.
         */
        fun agent(agent: Agent) = agent(JsonField.of(agent))

        /**
         * Sets [Builder.agent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agent] with a well-typed [Agent] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Agent>) = apply { this.agent = agent }

        fun deviceCode(deviceCode: AgentDeviceCode) = deviceCode(JsonField.of(deviceCode))

        /**
         * Sets [Builder.deviceCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceCode] with a well-typed [AgentDeviceCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deviceCode(deviceCode: JsonField<AgentDeviceCode>) = apply {
            this.deviceCode = deviceCode
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
         * Returns an immutable instance of [AgentCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .agent()
         * .deviceCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentCreateResponse =
            AgentCreateResponse(
                checkRequired("agent", agent),
                checkRequired("deviceCode", deviceCode),
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
    fun validate(): AgentCreateResponse = apply {
        if (validated) {
            return@apply
        }

        agent().validate()
        deviceCode().validate()
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
        (agent.asKnown()?.validity() ?: 0) + (deviceCode.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentCreateResponse &&
            agent == other.agent &&
            deviceCode == other.deviceCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(agent, deviceCode, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentCreateResponse{agent=$agent, deviceCode=$deviceCode, additionalProperties=$additionalProperties}"
}
