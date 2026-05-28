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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/** Policy governing what an agent can do, how it executes actions, and its spending boundaries. */
class AgentPolicy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultExecutionMode: JsonField<AgentExecutionMode>,
    private val permissions: JsonField<List<AgentPermission>>,
    private val spendingLimits: JsonField<AgentSpendingLimits>,
    private val accountRestrictions: JsonField<AgentAccountRestrictions>,
    private val approvalThresholds: JsonField<AgentApprovalThresholds>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("defaultExecutionMode")
        @ExcludeMissing
        defaultExecutionMode: JsonField<AgentExecutionMode> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<List<AgentPermission>> = JsonMissing.of(),
        @JsonProperty("spendingLimits")
        @ExcludeMissing
        spendingLimits: JsonField<AgentSpendingLimits> = JsonMissing.of(),
        @JsonProperty("accountRestrictions")
        @ExcludeMissing
        accountRestrictions: JsonField<AgentAccountRestrictions> = JsonMissing.of(),
        @JsonProperty("approvalThresholds")
        @ExcludeMissing
        approvalThresholds: JsonField<AgentApprovalThresholds> = JsonMissing.of(),
    ) : this(
        defaultExecutionMode,
        permissions,
        spendingLimits,
        accountRestrictions,
        approvalThresholds,
        mutableMapOf(),
    )

    /**
     * Execution mode controlling whether agent actions require human approval. AUTO: The agent can
     * execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent actions
     * require explicit human approval before execution.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultExecutionMode(): AgentExecutionMode =
        defaultExecutionMode.getRequired("defaultExecutionMode")

    /**
     * List of permissions granted to the agent.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun permissions(): List<AgentPermission> = permissions.getRequired("permissions")

    /**
     * Spending limits that cap the agent's transaction amounts and frequency. All amount fields are
     * integers in the smallest unit of the specified currency. When a transaction is denominated in
     * a different currency, Grid converts using the exchange rate at evaluation time.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendingLimits(): AgentSpendingLimits = spendingLimits.getRequired("spendingLimits")

    /**
     * Optional restrictions that limit the agent to specific accounts or override policy per
     * account.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountRestrictions(): AgentAccountRestrictions? =
        accountRestrictions.getNullable("accountRestrictions")

    /**
     * Thresholds that force approval for high-value transactions, overriding the default execution
     * mode. When a transaction is denominated in a different currency than the threshold, Grid
     * converts using the exchange rate at evaluation time.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun approvalThresholds(): AgentApprovalThresholds? =
        approvalThresholds.getNullable("approvalThresholds")

    /**
     * Returns the raw JSON value of [defaultExecutionMode].
     *
     * Unlike [defaultExecutionMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("defaultExecutionMode")
    @ExcludeMissing
    fun _defaultExecutionMode(): JsonField<AgentExecutionMode> = defaultExecutionMode

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<List<AgentPermission>> = permissions

    /**
     * Returns the raw JSON value of [spendingLimits].
     *
     * Unlike [spendingLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spendingLimits")
    @ExcludeMissing
    fun _spendingLimits(): JsonField<AgentSpendingLimits> = spendingLimits

    /**
     * Returns the raw JSON value of [accountRestrictions].
     *
     * Unlike [accountRestrictions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountRestrictions")
    @ExcludeMissing
    fun _accountRestrictions(): JsonField<AgentAccountRestrictions> = accountRestrictions

    /**
     * Returns the raw JSON value of [approvalThresholds].
     *
     * Unlike [approvalThresholds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approvalThresholds")
    @ExcludeMissing
    fun _approvalThresholds(): JsonField<AgentApprovalThresholds> = approvalThresholds

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
         * Returns a mutable builder for constructing an instance of [AgentPolicy].
         *
         * The following fields are required:
         * ```kotlin
         * .defaultExecutionMode()
         * .permissions()
         * .spendingLimits()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentPolicy]. */
    class Builder internal constructor() {

        private var defaultExecutionMode: JsonField<AgentExecutionMode>? = null
        private var permissions: JsonField<MutableList<AgentPermission>>? = null
        private var spendingLimits: JsonField<AgentSpendingLimits>? = null
        private var accountRestrictions: JsonField<AgentAccountRestrictions> = JsonMissing.of()
        private var approvalThresholds: JsonField<AgentApprovalThresholds> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentPolicy: AgentPolicy) = apply {
            defaultExecutionMode = agentPolicy.defaultExecutionMode
            permissions = agentPolicy.permissions.map { it.toMutableList() }
            spendingLimits = agentPolicy.spendingLimits
            accountRestrictions = agentPolicy.accountRestrictions
            approvalThresholds = agentPolicy.approvalThresholds
            additionalProperties = agentPolicy.additionalProperties.toMutableMap()
        }

        /**
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         */
        fun defaultExecutionMode(defaultExecutionMode: AgentExecutionMode) =
            defaultExecutionMode(JsonField.of(defaultExecutionMode))

        /**
         * Sets [Builder.defaultExecutionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultExecutionMode] with a well-typed
         * [AgentExecutionMode] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultExecutionMode(defaultExecutionMode: JsonField<AgentExecutionMode>) = apply {
            this.defaultExecutionMode = defaultExecutionMode
        }

        /** List of permissions granted to the agent. */
        fun permissions(permissions: List<AgentPermission>) = permissions(JsonField.of(permissions))

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed `List<AgentPermission>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun permissions(permissions: JsonField<List<AgentPermission>>) = apply {
            this.permissions = permissions.map { it.toMutableList() }
        }

        /**
         * Adds a single [AgentPermission] to [permissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermission(permission: AgentPermission) = apply {
            permissions =
                (permissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permissions", it).add(permission)
                }
        }

        /**
         * Spending limits that cap the agent's transaction amounts and frequency. All amount fields
         * are integers in the smallest unit of the specified currency. When a transaction is
         * denominated in a different currency, Grid converts using the exchange rate at evaluation
         * time.
         */
        fun spendingLimits(spendingLimits: AgentSpendingLimits) =
            spendingLimits(JsonField.of(spendingLimits))

        /**
         * Sets [Builder.spendingLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendingLimits] with a well-typed [AgentSpendingLimits]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun spendingLimits(spendingLimits: JsonField<AgentSpendingLimits>) = apply {
            this.spendingLimits = spendingLimits
        }

        /**
         * Optional restrictions that limit the agent to specific accounts or override policy per
         * account.
         */
        fun accountRestrictions(accountRestrictions: AgentAccountRestrictions) =
            accountRestrictions(JsonField.of(accountRestrictions))

        /**
         * Sets [Builder.accountRestrictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountRestrictions] with a well-typed
         * [AgentAccountRestrictions] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountRestrictions(accountRestrictions: JsonField<AgentAccountRestrictions>) = apply {
            this.accountRestrictions = accountRestrictions
        }

        /**
         * Thresholds that force approval for high-value transactions, overriding the default
         * execution mode. When a transaction is denominated in a different currency than the
         * threshold, Grid converts using the exchange rate at evaluation time.
         */
        fun approvalThresholds(approvalThresholds: AgentApprovalThresholds) =
            approvalThresholds(JsonField.of(approvalThresholds))

        /**
         * Sets [Builder.approvalThresholds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvalThresholds] with a well-typed
         * [AgentApprovalThresholds] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun approvalThresholds(approvalThresholds: JsonField<AgentApprovalThresholds>) = apply {
            this.approvalThresholds = approvalThresholds
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
         * Returns an immutable instance of [AgentPolicy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .defaultExecutionMode()
         * .permissions()
         * .spendingLimits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentPolicy =
            AgentPolicy(
                checkRequired("defaultExecutionMode", defaultExecutionMode),
                checkRequired("permissions", permissions).map { it.toImmutable() },
                checkRequired("spendingLimits", spendingLimits),
                accountRestrictions,
                approvalThresholds,
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
    fun validate(): AgentPolicy = apply {
        if (validated) {
            return@apply
        }

        defaultExecutionMode().validate()
        permissions().forEach { it.validate() }
        spendingLimits().validate()
        accountRestrictions()?.validate()
        approvalThresholds()?.validate()
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
        (defaultExecutionMode.asKnown()?.validity() ?: 0) +
            (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (spendingLimits.asKnown()?.validity() ?: 0) +
            (accountRestrictions.asKnown()?.validity() ?: 0) +
            (approvalThresholds.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentPolicy &&
            defaultExecutionMode == other.defaultExecutionMode &&
            permissions == other.permissions &&
            spendingLimits == other.spendingLimits &&
            accountRestrictions == other.accountRestrictions &&
            approvalThresholds == other.approvalThresholds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultExecutionMode,
            permissions,
            spendingLimits,
            accountRestrictions,
            approvalThresholds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentPolicy{defaultExecutionMode=$defaultExecutionMode, permissions=$permissions, spendingLimits=$spendingLimits, accountRestrictions=$accountRestrictions, approvalThresholds=$approvalThresholds, additionalProperties=$additionalProperties}"
}
