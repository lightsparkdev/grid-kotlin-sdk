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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Optional restrictions that limit the agent to specific accounts or override policy per account.
 */
class AgentAccountRestrictions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountRules: JsonField<List<AgentAccountRule>>,
    private val allowedAccountIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountRules")
        @ExcludeMissing
        accountRules: JsonField<List<AgentAccountRule>> = JsonMissing.of(),
        @JsonProperty("allowedAccountIds")
        @ExcludeMissing
        allowedAccountIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(accountRules, allowedAccountIds, mutableMapOf())

    /**
     * Per-account rules that override the agent's default policy for specific accounts.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountRules(): List<AgentAccountRule>? = accountRules.getNullable("accountRules")

    /**
     * If set, restricts the agent to operate only on the specified internal account IDs. Null means
     * the agent can access all accounts.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowedAccountIds(): List<String>? = allowedAccountIds.getNullable("allowedAccountIds")

    /**
     * Returns the raw JSON value of [accountRules].
     *
     * Unlike [accountRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountRules")
    @ExcludeMissing
    fun _accountRules(): JsonField<List<AgentAccountRule>> = accountRules

    /**
     * Returns the raw JSON value of [allowedAccountIds].
     *
     * Unlike [allowedAccountIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowedAccountIds")
    @ExcludeMissing
    fun _allowedAccountIds(): JsonField<List<String>> = allowedAccountIds

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

        /** Returns a mutable builder for constructing an instance of [AgentAccountRestrictions]. */
        fun builder() = Builder()
    }

    /** A builder for [AgentAccountRestrictions]. */
    class Builder internal constructor() {

        private var accountRules: JsonField<MutableList<AgentAccountRule>>? = null
        private var allowedAccountIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentAccountRestrictions: AgentAccountRestrictions) = apply {
            accountRules = agentAccountRestrictions.accountRules.map { it.toMutableList() }
            allowedAccountIds =
                agentAccountRestrictions.allowedAccountIds.map { it.toMutableList() }
            additionalProperties = agentAccountRestrictions.additionalProperties.toMutableMap()
        }

        /** Per-account rules that override the agent's default policy for specific accounts. */
        fun accountRules(accountRules: List<AgentAccountRule>) =
            accountRules(JsonField.of(accountRules))

        /**
         * Sets [Builder.accountRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountRules] with a well-typed `List<AgentAccountRule>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountRules(accountRules: JsonField<List<AgentAccountRule>>) = apply {
            this.accountRules = accountRules.map { it.toMutableList() }
        }

        /**
         * Adds a single [AgentAccountRule] to [accountRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountRule(accountRule: AgentAccountRule) = apply {
            accountRules =
                (accountRules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountRules", it).add(accountRule)
                }
        }

        /**
         * If set, restricts the agent to operate only on the specified internal account IDs. Null
         * means the agent can access all accounts.
         */
        fun allowedAccountIds(allowedAccountIds: List<String>) =
            allowedAccountIds(JsonField.of(allowedAccountIds))

        /**
         * Sets [Builder.allowedAccountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedAccountIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowedAccountIds(allowedAccountIds: JsonField<List<String>>) = apply {
            this.allowedAccountIds = allowedAccountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [allowedAccountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedAccountId(allowedAccountId: String) = apply {
            allowedAccountIds =
                (allowedAccountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedAccountIds", it).add(allowedAccountId)
                }
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
         * Returns an immutable instance of [AgentAccountRestrictions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentAccountRestrictions =
            AgentAccountRestrictions(
                (accountRules ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedAccountIds ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AgentAccountRestrictions = apply {
        if (validated) {
            return@apply
        }

        accountRules()?.forEach { it.validate() }
        allowedAccountIds()
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
        (accountRules.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (allowedAccountIds.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentAccountRestrictions &&
            accountRules == other.accountRules &&
            allowedAccountIds == other.allowedAccountIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountRules, allowedAccountIds, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentAccountRestrictions{accountRules=$accountRules, allowedAccountIds=$allowedAccountIds, additionalProperties=$additionalProperties}"
}
