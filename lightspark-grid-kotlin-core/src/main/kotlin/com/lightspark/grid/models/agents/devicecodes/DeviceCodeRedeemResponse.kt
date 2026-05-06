// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

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
import com.lightspark.grid.models.agents.AgentPolicy
import java.util.Collections
import java.util.Objects

class DeviceCodeRedeemResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessToken: JsonField<String>,
    private val agentId: JsonField<String>,
    private val agentName: JsonField<String>,
    private val policy: JsonField<AgentPolicy>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accessToken")
        @ExcludeMissing
        accessToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agentName") @ExcludeMissing agentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<AgentPolicy> = JsonMissing.of(),
    ) : this(accessToken, agentId, agentName, policy, mutableMapOf())

    /**
     * Bearer token used to authenticate all subsequent API calls as this agent. Pass as
     * `Authorization: Bearer <accessToken>`. This token is returned only once and must be stored
     * securely — it cannot be retrieved again.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessToken(): String = accessToken.getRequired("accessToken")

    /**
     * The agent's system-generated ID.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agentId")

    /**
     * The agent's name.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentName(): String = agentName.getRequired("agentName")

    /**
     * Policy governing what an agent can do, how it executes actions, and its spending boundaries.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): AgentPolicy = policy.getRequired("policy")

    /**
     * Returns the raw JSON value of [accessToken].
     *
     * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessToken") @ExcludeMissing fun _accessToken(): JsonField<String> = accessToken

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [agentName].
     *
     * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentName") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<AgentPolicy> = policy

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
         * Returns a mutable builder for constructing an instance of [DeviceCodeRedeemResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .accessToken()
         * .agentId()
         * .agentName()
         * .policy()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DeviceCodeRedeemResponse]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String>? = null
        private var agentId: JsonField<String>? = null
        private var agentName: JsonField<String>? = null
        private var policy: JsonField<AgentPolicy>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(deviceCodeRedeemResponse: DeviceCodeRedeemResponse) = apply {
            accessToken = deviceCodeRedeemResponse.accessToken
            agentId = deviceCodeRedeemResponse.agentId
            agentName = deviceCodeRedeemResponse.agentName
            policy = deviceCodeRedeemResponse.policy
            additionalProperties = deviceCodeRedeemResponse.additionalProperties.toMutableMap()
        }

        /**
         * Bearer token used to authenticate all subsequent API calls as this agent. Pass as
         * `Authorization: Bearer <accessToken>`. This token is returned only once and must be
         * stored securely — it cannot be retrieved again.
         */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * Sets [Builder.accessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** The agent's system-generated ID. */
        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /** The agent's name. */
        fun agentName(agentName: String) = agentName(JsonField.of(agentName))

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

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
         * Returns an immutable instance of [DeviceCodeRedeemResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accessToken()
         * .agentId()
         * .agentName()
         * .policy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeviceCodeRedeemResponse =
            DeviceCodeRedeemResponse(
                checkRequired("accessToken", accessToken),
                checkRequired("agentId", agentId),
                checkRequired("agentName", agentName),
                checkRequired("policy", policy),
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
    fun validate(): DeviceCodeRedeemResponse = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        agentId()
        agentName()
        policy().validate()
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
        (if (accessToken.asKnown() == null) 0 else 1) +
            (if (agentId.asKnown() == null) 0 else 1) +
            (if (agentName.asKnown() == null) 0 else 1) +
            (policy.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeviceCodeRedeemResponse &&
            accessToken == other.accessToken &&
            agentId == other.agentId &&
            agentName == other.agentName &&
            policy == other.policy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessToken, agentId, agentName, policy, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeviceCodeRedeemResponse{accessToken=$accessToken, agentId=$agentId, agentName=$agentName, policy=$policy, additionalProperties=$additionalProperties}"
}
