// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A programmatic agent with scoped permissions and a spending policy, used to automate payment
 * workflows.
 */
class AgentRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val isConnected: JsonField<Boolean>,
    private val isPaused: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val policy: JsonField<Policy>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val usage: JsonField<Usage>,
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
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
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
    fun policy(): Policy = policy.getRequired("policy")

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
    fun usage(): Usage = usage.getRequired("usage")

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
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<Policy> = policy

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
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
         * Returns a mutable builder for constructing an instance of [AgentRetrieveResponse].
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

    /** A builder for [AgentRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var isConnected: JsonField<Boolean>? = null
        private var isPaused: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var policy: JsonField<Policy>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentRetrieveResponse: AgentRetrieveResponse) = apply {
            id = agentRetrieveResponse.id
            createdAt = agentRetrieveResponse.createdAt
            customerId = agentRetrieveResponse.customerId
            isConnected = agentRetrieveResponse.isConnected
            isPaused = agentRetrieveResponse.isPaused
            name = agentRetrieveResponse.name
            policy = agentRetrieveResponse.policy
            updatedAt = agentRetrieveResponse.updatedAt
            usage = agentRetrieveResponse.usage
            additionalProperties = agentRetrieveResponse.additionalProperties.toMutableMap()
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
        fun policy(policy: Policy) = policy(JsonField.of(policy))

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<Policy>) = apply { this.policy = policy }

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
        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [AgentRetrieveResponse].
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
        fun build(): AgentRetrieveResponse =
            AgentRetrieveResponse(
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
    fun validate(): AgentRetrieveResponse = apply {
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

    /**
     * Policy governing what an agent can do, how it executes actions, and its spending boundaries.
     */
    class Policy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val defaultExecutionMode: JsonField<DefaultExecutionMode>,
        private val permissions: JsonField<List<Permission>>,
        private val spendingLimits: JsonField<SpendingLimits>,
        private val accountRestrictions: JsonField<AccountRestrictions>,
        private val approvalThresholds: JsonField<ApprovalThresholds>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("defaultExecutionMode")
            @ExcludeMissing
            defaultExecutionMode: JsonField<DefaultExecutionMode> = JsonMissing.of(),
            @JsonProperty("permissions")
            @ExcludeMissing
            permissions: JsonField<List<Permission>> = JsonMissing.of(),
            @JsonProperty("spendingLimits")
            @ExcludeMissing
            spendingLimits: JsonField<SpendingLimits> = JsonMissing.of(),
            @JsonProperty("accountRestrictions")
            @ExcludeMissing
            accountRestrictions: JsonField<AccountRestrictions> = JsonMissing.of(),
            @JsonProperty("approvalThresholds")
            @ExcludeMissing
            approvalThresholds: JsonField<ApprovalThresholds> = JsonMissing.of(),
        ) : this(
            defaultExecutionMode,
            permissions,
            spendingLimits,
            accountRestrictions,
            approvalThresholds,
            mutableMapOf(),
        )

        /**
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun defaultExecutionMode(): DefaultExecutionMode =
            defaultExecutionMode.getRequired("defaultExecutionMode")

        /**
         * List of permissions granted to the agent.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun permissions(): List<Permission> = permissions.getRequired("permissions")

        /**
         * Spending limits that cap the agent's transaction amounts and frequency. All amount fields
         * are integers in the smallest unit of the specified currency. When a transaction is
         * denominated in a different currency, Grid converts using the exchange rate at evaluation
         * time.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun spendingLimits(): SpendingLimits = spendingLimits.getRequired("spendingLimits")

        /**
         * Optional restrictions that limit the agent to specific accounts or override policy per
         * account.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountRestrictions(): AccountRestrictions? =
            accountRestrictions.getNullable("accountRestrictions")

        /**
         * Thresholds that force approval for high-value transactions, overriding the default
         * execution mode. When a transaction is denominated in a different currency than the
         * threshold, Grid converts using the exchange rate at evaluation time.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun approvalThresholds(): ApprovalThresholds? =
            approvalThresholds.getNullable("approvalThresholds")

        /**
         * Returns the raw JSON value of [defaultExecutionMode].
         *
         * Unlike [defaultExecutionMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("defaultExecutionMode")
        @ExcludeMissing
        fun _defaultExecutionMode(): JsonField<DefaultExecutionMode> = defaultExecutionMode

        /**
         * Returns the raw JSON value of [permissions].
         *
         * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permissions")
        @ExcludeMissing
        fun _permissions(): JsonField<List<Permission>> = permissions

        /**
         * Returns the raw JSON value of [spendingLimits].
         *
         * Unlike [spendingLimits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spendingLimits")
        @ExcludeMissing
        fun _spendingLimits(): JsonField<SpendingLimits> = spendingLimits

        /**
         * Returns the raw JSON value of [accountRestrictions].
         *
         * Unlike [accountRestrictions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accountRestrictions")
        @ExcludeMissing
        fun _accountRestrictions(): JsonField<AccountRestrictions> = accountRestrictions

        /**
         * Returns the raw JSON value of [approvalThresholds].
         *
         * Unlike [approvalThresholds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("approvalThresholds")
        @ExcludeMissing
        fun _approvalThresholds(): JsonField<ApprovalThresholds> = approvalThresholds

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
             * Returns a mutable builder for constructing an instance of [Policy].
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

        /** A builder for [Policy]. */
        class Builder internal constructor() {

            private var defaultExecutionMode: JsonField<DefaultExecutionMode>? = null
            private var permissions: JsonField<MutableList<Permission>>? = null
            private var spendingLimits: JsonField<SpendingLimits>? = null
            private var accountRestrictions: JsonField<AccountRestrictions> = JsonMissing.of()
            private var approvalThresholds: JsonField<ApprovalThresholds> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(policy: Policy) = apply {
                defaultExecutionMode = policy.defaultExecutionMode
                permissions = policy.permissions.map { it.toMutableList() }
                spendingLimits = policy.spendingLimits
                accountRestrictions = policy.accountRestrictions
                approvalThresholds = policy.approvalThresholds
                additionalProperties = policy.additionalProperties.toMutableMap()
            }

            /**
             * Execution mode controlling whether agent actions require human approval. AUTO: The
             * agent can execute actions autonomously without explicit approval. APPROVAL_REQUIRED:
             * All agent actions require explicit human approval before execution.
             */
            fun defaultExecutionMode(defaultExecutionMode: DefaultExecutionMode) =
                defaultExecutionMode(JsonField.of(defaultExecutionMode))

            /**
             * Sets [Builder.defaultExecutionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultExecutionMode] with a well-typed
             * [DefaultExecutionMode] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun defaultExecutionMode(defaultExecutionMode: JsonField<DefaultExecutionMode>) =
                apply {
                    this.defaultExecutionMode = defaultExecutionMode
                }

            /** List of permissions granted to the agent. */
            fun permissions(permissions: List<Permission>) = permissions(JsonField.of(permissions))

            /**
             * Sets [Builder.permissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permissions] with a well-typed `List<Permission>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun permissions(permissions: JsonField<List<Permission>>) = apply {
                this.permissions = permissions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Permission] to [permissions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPermission(permission: Permission) = apply {
                permissions =
                    (permissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("permissions", it).add(permission)
                    }
            }

            /**
             * Spending limits that cap the agent's transaction amounts and frequency. All amount
             * fields are integers in the smallest unit of the specified currency. When a
             * transaction is denominated in a different currency, Grid converts using the exchange
             * rate at evaluation time.
             */
            fun spendingLimits(spendingLimits: SpendingLimits) =
                spendingLimits(JsonField.of(spendingLimits))

            /**
             * Sets [Builder.spendingLimits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spendingLimits] with a well-typed [SpendingLimits]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun spendingLimits(spendingLimits: JsonField<SpendingLimits>) = apply {
                this.spendingLimits = spendingLimits
            }

            /**
             * Optional restrictions that limit the agent to specific accounts or override policy
             * per account.
             */
            fun accountRestrictions(accountRestrictions: AccountRestrictions) =
                accountRestrictions(JsonField.of(accountRestrictions))

            /**
             * Sets [Builder.accountRestrictions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountRestrictions] with a well-typed
             * [AccountRestrictions] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun accountRestrictions(accountRestrictions: JsonField<AccountRestrictions>) = apply {
                this.accountRestrictions = accountRestrictions
            }

            /**
             * Thresholds that force approval for high-value transactions, overriding the default
             * execution mode. When a transaction is denominated in a different currency than the
             * threshold, Grid converts using the exchange rate at evaluation time.
             */
            fun approvalThresholds(approvalThresholds: ApprovalThresholds) =
                approvalThresholds(JsonField.of(approvalThresholds))

            /**
             * Sets [Builder.approvalThresholds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvalThresholds] with a well-typed
             * [ApprovalThresholds] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun approvalThresholds(approvalThresholds: JsonField<ApprovalThresholds>) = apply {
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
             * Returns an immutable instance of [Policy].
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
            fun build(): Policy =
                Policy(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Policy = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (defaultExecutionMode.asKnown()?.validity() ?: 0) +
                (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (spendingLimits.asKnown()?.validity() ?: 0) +
                (accountRestrictions.asKnown()?.validity() ?: 0) +
                (approvalThresholds.asKnown()?.validity() ?: 0)

        /**
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         */
        class DefaultExecutionMode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AUTO = of("AUTO")

                val APPROVAL_REQUIRED = of("APPROVAL_REQUIRED")

                fun of(value: String) = DefaultExecutionMode(JsonField.of(value))
            }

            /** An enum containing [DefaultExecutionMode]'s known values. */
            enum class Known {
                AUTO,
                APPROVAL_REQUIRED,
            }

            /**
             * An enum containing [DefaultExecutionMode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DefaultExecutionMode] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                APPROVAL_REQUIRED,
                /**
                 * An enum member indicating that [DefaultExecutionMode] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTO -> Value.AUTO
                    APPROVAL_REQUIRED -> Value.APPROVAL_REQUIRED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    AUTO -> Known.AUTO
                    APPROVAL_REQUIRED -> Known.APPROVAL_REQUIRED
                    else ->
                        throw LightsparkGridInvalidDataException(
                            "Unknown DefaultExecutionMode: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): DefaultExecutionMode = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DefaultExecutionMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Permission granted to an agent that determines what actions it can perform.
         * VIEW_TRANSACTIONS: Can list and retrieve transactions and account balances.
         * CREATE_TRANSFERS: Can initiate same-currency transfers. CREATE_QUOTES: Can create
         * cross-currency quotes. EXECUTE_QUOTES: Can execute cross-currency quotes.
         * MANAGE_EXTERNAL_ACCOUNTS: Can create and manage external accounts.
         */
        class Permission @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val VIEW_TRANSACTIONS = of("VIEW_TRANSACTIONS")

                val CREATE_TRANSFERS = of("CREATE_TRANSFERS")

                val CREATE_QUOTES = of("CREATE_QUOTES")

                val EXECUTE_QUOTES = of("EXECUTE_QUOTES")

                val MANAGE_EXTERNAL_ACCOUNTS = of("MANAGE_EXTERNAL_ACCOUNTS")

                fun of(value: String) = Permission(JsonField.of(value))
            }

            /** An enum containing [Permission]'s known values. */
            enum class Known {
                VIEW_TRANSACTIONS,
                CREATE_TRANSFERS,
                CREATE_QUOTES,
                EXECUTE_QUOTES,
                MANAGE_EXTERNAL_ACCOUNTS,
            }

            /**
             * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Permission] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VIEW_TRANSACTIONS,
                CREATE_TRANSFERS,
                CREATE_QUOTES,
                EXECUTE_QUOTES,
                MANAGE_EXTERNAL_ACCOUNTS,
                /**
                 * An enum member indicating that [Permission] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    VIEW_TRANSACTIONS -> Value.VIEW_TRANSACTIONS
                    CREATE_TRANSFERS -> Value.CREATE_TRANSFERS
                    CREATE_QUOTES -> Value.CREATE_QUOTES
                    EXECUTE_QUOTES -> Value.EXECUTE_QUOTES
                    MANAGE_EXTERNAL_ACCOUNTS -> Value.MANAGE_EXTERNAL_ACCOUNTS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    VIEW_TRANSACTIONS -> Known.VIEW_TRANSACTIONS
                    CREATE_TRANSFERS -> Known.CREATE_TRANSFERS
                    CREATE_QUOTES -> Known.CREATE_QUOTES
                    EXECUTE_QUOTES -> Known.EXECUTE_QUOTES
                    MANAGE_EXTERNAL_ACCOUNTS -> Known.MANAGE_EXTERNAL_ACCOUNTS
                    else -> throw LightsparkGridInvalidDataException("Unknown Permission: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Permission = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Permission && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Spending limits that cap the agent's transaction amounts and frequency. All amount fields
         * are integers in the smallest unit of the specified currency. When a transaction is
         * denominated in a different currency, Grid converts using the exchange rate at evaluation
         * time.
         */
        class SpendingLimits
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<String>,
            private val perTransactionLimit: JsonField<Long>,
            private val dailyLimit: JsonField<Long>,
            private val dailyTransactionLimit: JsonField<Long>,
            private val monthlyLimit: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("perTransactionLimit")
                @ExcludeMissing
                perTransactionLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("dailyLimit")
                @ExcludeMissing
                dailyLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("dailyTransactionLimit")
                @ExcludeMissing
                dailyTransactionLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("monthlyLimit")
                @ExcludeMissing
                monthlyLimit: JsonField<Long> = JsonMissing.of(),
            ) : this(
                currency,
                perTransactionLimit,
                dailyLimit,
                dailyTransactionLimit,
                monthlyLimit,
                mutableMapOf(),
            )

            /**
             * ISO 4217 currency code that all amount limits are denominated in.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Maximum amount the agent can transfer in a single transaction.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun perTransactionLimit(): Long = perTransactionLimit.getRequired("perTransactionLimit")

            /**
             * Maximum total amount the agent can transfer per day. Null means no daily limit.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dailyLimit(): Long? = dailyLimit.getNullable("dailyLimit")

            /**
             * Maximum number of transactions the agent can initiate per day.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dailyTransactionLimit(): Long? =
                dailyTransactionLimit.getNullable("dailyTransactionLimit")

            /**
             * Maximum total amount the agent can transfer per month. Null means no monthly limit.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun monthlyLimit(): Long? = monthlyLimit.getNullable("monthlyLimit")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [perTransactionLimit].
             *
             * Unlike [perTransactionLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("perTransactionLimit")
            @ExcludeMissing
            fun _perTransactionLimit(): JsonField<Long> = perTransactionLimit

            /**
             * Returns the raw JSON value of [dailyLimit].
             *
             * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dailyLimit")
            @ExcludeMissing
            fun _dailyLimit(): JsonField<Long> = dailyLimit

            /**
             * Returns the raw JSON value of [dailyTransactionLimit].
             *
             * Unlike [dailyTransactionLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("dailyTransactionLimit")
            @ExcludeMissing
            fun _dailyTransactionLimit(): JsonField<Long> = dailyTransactionLimit

            /**
             * Returns the raw JSON value of [monthlyLimit].
             *
             * Unlike [monthlyLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("monthlyLimit")
            @ExcludeMissing
            fun _monthlyLimit(): JsonField<Long> = monthlyLimit

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
                 * Returns a mutable builder for constructing an instance of [SpendingLimits].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .perTransactionLimit()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SpendingLimits]. */
            class Builder internal constructor() {

                private var currency: JsonField<String>? = null
                private var perTransactionLimit: JsonField<Long>? = null
                private var dailyLimit: JsonField<Long> = JsonMissing.of()
                private var dailyTransactionLimit: JsonField<Long> = JsonMissing.of()
                private var monthlyLimit: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(spendingLimits: SpendingLimits) = apply {
                    currency = spendingLimits.currency
                    perTransactionLimit = spendingLimits.perTransactionLimit
                    dailyLimit = spendingLimits.dailyLimit
                    dailyTransactionLimit = spendingLimits.dailyTransactionLimit
                    monthlyLimit = spendingLimits.monthlyLimit
                    additionalProperties = spendingLimits.additionalProperties.toMutableMap()
                }

                /** ISO 4217 currency code that all amount limits are denominated in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Maximum amount the agent can transfer in a single transaction. */
                fun perTransactionLimit(perTransactionLimit: Long) =
                    perTransactionLimit(JsonField.of(perTransactionLimit))

                /**
                 * Sets [Builder.perTransactionLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perTransactionLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perTransactionLimit(perTransactionLimit: JsonField<Long>) = apply {
                    this.perTransactionLimit = perTransactionLimit
                }

                /**
                 * Maximum total amount the agent can transfer per day. Null means no daily limit.
                 */
                fun dailyLimit(dailyLimit: Long?) = dailyLimit(JsonField.ofNullable(dailyLimit))

                /**
                 * Alias for [Builder.dailyLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun dailyLimit(dailyLimit: Long) = dailyLimit(dailyLimit as Long?)

                /**
                 * Sets [Builder.dailyLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dailyLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dailyLimit(dailyLimit: JsonField<Long>) = apply { this.dailyLimit = dailyLimit }

                /** Maximum number of transactions the agent can initiate per day. */
                fun dailyTransactionLimit(dailyTransactionLimit: Long) =
                    dailyTransactionLimit(JsonField.of(dailyTransactionLimit))

                /**
                 * Sets [Builder.dailyTransactionLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dailyTransactionLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dailyTransactionLimit(dailyTransactionLimit: JsonField<Long>) = apply {
                    this.dailyTransactionLimit = dailyTransactionLimit
                }

                /**
                 * Maximum total amount the agent can transfer per month. Null means no monthly
                 * limit.
                 */
                fun monthlyLimit(monthlyLimit: Long?) =
                    monthlyLimit(JsonField.ofNullable(monthlyLimit))

                /**
                 * Alias for [Builder.monthlyLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun monthlyLimit(monthlyLimit: Long) = monthlyLimit(monthlyLimit as Long?)

                /**
                 * Sets [Builder.monthlyLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monthlyLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun monthlyLimit(monthlyLimit: JsonField<Long>) = apply {
                    this.monthlyLimit = monthlyLimit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SpendingLimits].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .perTransactionLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SpendingLimits =
                    SpendingLimits(
                        checkRequired("currency", currency),
                        checkRequired("perTransactionLimit", perTransactionLimit),
                        dailyLimit,
                        dailyTransactionLimit,
                        monthlyLimit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): SpendingLimits = apply {
                if (validated) {
                    return@apply
                }

                currency()
                perTransactionLimit()
                dailyLimit()
                dailyTransactionLimit()
                monthlyLimit()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (currency.asKnown() == null) 0 else 1) +
                    (if (perTransactionLimit.asKnown() == null) 0 else 1) +
                    (if (dailyLimit.asKnown() == null) 0 else 1) +
                    (if (dailyTransactionLimit.asKnown() == null) 0 else 1) +
                    (if (monthlyLimit.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SpendingLimits &&
                    currency == other.currency &&
                    perTransactionLimit == other.perTransactionLimit &&
                    dailyLimit == other.dailyLimit &&
                    dailyTransactionLimit == other.dailyTransactionLimit &&
                    monthlyLimit == other.monthlyLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    currency,
                    perTransactionLimit,
                    dailyLimit,
                    dailyTransactionLimit,
                    monthlyLimit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpendingLimits{currency=$currency, perTransactionLimit=$perTransactionLimit, dailyLimit=$dailyLimit, dailyTransactionLimit=$dailyTransactionLimit, monthlyLimit=$monthlyLimit, additionalProperties=$additionalProperties}"
        }

        /**
         * Optional restrictions that limit the agent to specific accounts or override policy per
         * account.
         */
        class AccountRestrictions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountRules: JsonField<List<AccountRule>>,
            private val allowedAccountIds: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountRules")
                @ExcludeMissing
                accountRules: JsonField<List<AccountRule>> = JsonMissing.of(),
                @JsonProperty("allowedAccountIds")
                @ExcludeMissing
                allowedAccountIds: JsonField<List<String>> = JsonMissing.of(),
            ) : this(accountRules, allowedAccountIds, mutableMapOf())

            /**
             * Per-account rules that override the agent's default policy for specific accounts.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountRules(): List<AccountRule>? = accountRules.getNullable("accountRules")

            /**
             * If set, restricts the agent to operate only on the specified internal account IDs.
             * Null means the agent can access all accounts.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun allowedAccountIds(): List<String>? =
                allowedAccountIds.getNullable("allowedAccountIds")

            /**
             * Returns the raw JSON value of [accountRules].
             *
             * Unlike [accountRules], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountRules")
            @ExcludeMissing
            fun _accountRules(): JsonField<List<AccountRule>> = accountRules

            /**
             * Returns the raw JSON value of [allowedAccountIds].
             *
             * Unlike [allowedAccountIds], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [AccountRestrictions].
                 */
                fun builder() = Builder()
            }

            /** A builder for [AccountRestrictions]. */
            class Builder internal constructor() {

                private var accountRules: JsonField<MutableList<AccountRule>>? = null
                private var allowedAccountIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountRestrictions: AccountRestrictions) = apply {
                    accountRules = accountRestrictions.accountRules.map { it.toMutableList() }
                    allowedAccountIds =
                        accountRestrictions.allowedAccountIds.map { it.toMutableList() }
                    additionalProperties = accountRestrictions.additionalProperties.toMutableMap()
                }

                /**
                 * Per-account rules that override the agent's default policy for specific accounts.
                 */
                fun accountRules(accountRules: List<AccountRule>) =
                    accountRules(JsonField.of(accountRules))

                /**
                 * Sets [Builder.accountRules] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountRules] with a well-typed
                 * `List<AccountRule>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun accountRules(accountRules: JsonField<List<AccountRule>>) = apply {
                    this.accountRules = accountRules.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AccountRule] to [accountRules].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAccountRule(accountRule: AccountRule) = apply {
                    accountRules =
                        (accountRules ?: JsonField.of(mutableListOf())).also {
                            checkKnown("accountRules", it).add(accountRule)
                        }
                }

                /**
                 * If set, restricts the agent to operate only on the specified internal account
                 * IDs. Null means the agent can access all accounts.
                 */
                fun allowedAccountIds(allowedAccountIds: List<String>?) =
                    allowedAccountIds(JsonField.ofNullable(allowedAccountIds))

                /**
                 * Sets [Builder.allowedAccountIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedAccountIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AccountRestrictions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AccountRestrictions =
                    AccountRestrictions(
                        (accountRules ?: JsonMissing.of()).map { it.toImmutable() },
                        (allowedAccountIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): AccountRestrictions = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (accountRules.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (allowedAccountIds.asKnown()?.size ?: 0)

            /**
             * Per-account policy override that takes precedence over the agent's default policy for
             * a specific account.
             */
            class AccountRule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accountId: JsonField<String>,
                private val executionMode: JsonField<ExecutionMode>,
                private val perTransactionLimit: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("accountId")
                    @ExcludeMissing
                    accountId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("executionMode")
                    @ExcludeMissing
                    executionMode: JsonField<ExecutionMode> = JsonMissing.of(),
                    @JsonProperty("perTransactionLimit")
                    @ExcludeMissing
                    perTransactionLimit: JsonField<Long> = JsonMissing.of(),
                ) : this(accountId, executionMode, perTransactionLimit, mutableMapOf())

                /**
                 * The internal account ID this rule applies to.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accountId(): String = accountId.getRequired("accountId")

                /**
                 * Execution mode controlling whether agent actions require human approval. AUTO:
                 * The agent can execute actions autonomously without explicit approval.
                 * APPROVAL_REQUIRED: All agent actions require explicit human approval before
                 * execution.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun executionMode(): ExecutionMode? = executionMode.getNullable("executionMode")

                /**
                 * Per-transaction limit override, in the smallest unit of the relevant currency.
                 * Null inherits from the agent's spending limits.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun perTransactionLimit(): Long? =
                    perTransactionLimit.getNullable("perTransactionLimit")

                /**
                 * Returns the raw JSON value of [accountId].
                 *
                 * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("accountId")
                @ExcludeMissing
                fun _accountId(): JsonField<String> = accountId

                /**
                 * Returns the raw JSON value of [executionMode].
                 *
                 * Unlike [executionMode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("executionMode")
                @ExcludeMissing
                fun _executionMode(): JsonField<ExecutionMode> = executionMode

                /**
                 * Returns the raw JSON value of [perTransactionLimit].
                 *
                 * Unlike [perTransactionLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [AccountRule].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .accountId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AccountRule]. */
                class Builder internal constructor() {

                    private var accountId: JsonField<String>? = null
                    private var executionMode: JsonField<ExecutionMode> = JsonMissing.of()
                    private var perTransactionLimit: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(accountRule: AccountRule) = apply {
                        accountId = accountRule.accountId
                        executionMode = accountRule.executionMode
                        perTransactionLimit = accountRule.perTransactionLimit
                        additionalProperties = accountRule.additionalProperties.toMutableMap()
                    }

                    /** The internal account ID this rule applies to. */
                    fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                    /**
                     * Sets [Builder.accountId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun accountId(accountId: JsonField<String>) = apply {
                        this.accountId = accountId
                    }

                    /**
                     * Execution mode controlling whether agent actions require human approval.
                     * AUTO: The agent can execute actions autonomously without explicit approval.
                     * APPROVAL_REQUIRED: All agent actions require explicit human approval before
                     * execution.
                     */
                    fun executionMode(executionMode: ExecutionMode) =
                        executionMode(JsonField.of(executionMode))

                    /**
                     * Sets [Builder.executionMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.executionMode] with a well-typed
                     * [ExecutionMode] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun executionMode(executionMode: JsonField<ExecutionMode>) = apply {
                        this.executionMode = executionMode
                    }

                    /**
                     * Per-transaction limit override, in the smallest unit of the relevant
                     * currency. Null inherits from the agent's spending limits.
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
                     * You should usually call [Builder.perTransactionLimit] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AccountRule].
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
                    fun build(): AccountRule =
                        AccountRule(
                            checkRequired("accountId", accountId),
                            executionMode,
                            perTransactionLimit,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): AccountRule = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (accountId.asKnown() == null) 0 else 1) +
                        (executionMode.asKnown()?.validity() ?: 0) +
                        (if (perTransactionLimit.asKnown() == null) 0 else 1)

                /**
                 * Execution mode controlling whether agent actions require human approval. AUTO:
                 * The agent can execute actions autonomously without explicit approval.
                 * APPROVAL_REQUIRED: All agent actions require explicit human approval before
                 * execution.
                 */
                class ExecutionMode
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val AUTO = of("AUTO")

                        val APPROVAL_REQUIRED = of("APPROVAL_REQUIRED")

                        fun of(value: String) = ExecutionMode(JsonField.of(value))
                    }

                    /** An enum containing [ExecutionMode]'s known values. */
                    enum class Known {
                        AUTO,
                        APPROVAL_REQUIRED,
                    }

                    /**
                     * An enum containing [ExecutionMode]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ExecutionMode] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AUTO,
                        APPROVAL_REQUIRED,
                        /**
                         * An enum member indicating that [ExecutionMode] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            AUTO -> Value.AUTO
                            APPROVAL_REQUIRED -> Value.APPROVAL_REQUIRED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AUTO -> Known.AUTO
                            APPROVAL_REQUIRED -> Known.APPROVAL_REQUIRED
                            else ->
                                throw LightsparkGridInvalidDataException(
                                    "Unknown ExecutionMode: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LightsparkGridInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LightsparkGridInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ExecutionMode = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ExecutionMode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AccountRule &&
                        accountId == other.accountId &&
                        executionMode == other.executionMode &&
                        perTransactionLimit == other.perTransactionLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        accountId,
                        executionMode,
                        perTransactionLimit,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccountRule{accountId=$accountId, executionMode=$executionMode, perTransactionLimit=$perTransactionLimit, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountRestrictions &&
                    accountRules == other.accountRules &&
                    allowedAccountIds == other.allowedAccountIds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountRules, allowedAccountIds, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountRestrictions{accountRules=$accountRules, allowedAccountIds=$allowedAccountIds, additionalProperties=$additionalProperties}"
        }

        /**
         * Thresholds that force approval for high-value transactions, overriding the default
         * execution mode. When a transaction is denominated in a different currency than the
         * threshold, Grid converts using the exchange rate at evaluation time.
         */
        class ApprovalThresholds
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * If set, any transaction above this amount (in the smallest unit of the specified
             * currency) will require explicit approval even when the agent's defaultExecutionMode
             * is AUTO. Null means no threshold override.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * ISO 4217 currency code that the amount threshold is denominated in. Required when
             * amount is set.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
                 * Returns a mutable builder for constructing an instance of [ApprovalThresholds].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ApprovalThresholds]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(approvalThresholds: ApprovalThresholds) = apply {
                    amount = approvalThresholds.amount
                    currency = approvalThresholds.currency
                    additionalProperties = approvalThresholds.additionalProperties.toMutableMap()
                }

                /**
                 * If set, any transaction above this amount (in the smallest unit of the specified
                 * currency) will require explicit approval even when the agent's
                 * defaultExecutionMode is AUTO. Null means no threshold override.
                 */
                fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

                /**
                 * Alias for [Builder.amount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amount(amount: Long) = amount(amount as Long?)

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency code that the amount threshold is denominated in. Required when
                 * amount is set.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ApprovalThresholds].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ApprovalThresholds =
                    ApprovalThresholds(amount, currency, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): ApprovalThresholds = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApprovalThresholds &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApprovalThresholds{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Policy &&
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
            "Policy{defaultExecutionMode=$defaultExecutionMode, permissions=$permissions, spendingLimits=$spendingLimits, accountRestrictions=$accountRestrictions, approvalThresholds=$approvalThresholds, additionalProperties=$additionalProperties}"
    }

    /**
     * Real-time counters tracking the agent's spending and transaction activity against its policy
     * limits.
     */
    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dailySpend: JsonField<Long>,
        private val dailyTransactionCount: JsonField<Long>,
        private val monthlySpend: JsonField<Long>,
        private val dailyResetDate: JsonField<LocalDate>,
        private val monthlyResetMonth: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dailySpend")
            @ExcludeMissing
            dailySpend: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("dailyTransactionCount")
            @ExcludeMissing
            dailyTransactionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthlySpend")
            @ExcludeMissing
            monthlySpend: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("dailyResetDate")
            @ExcludeMissing
            dailyResetDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("monthlyResetMonth")
            @ExcludeMissing
            monthlyResetMonth: JsonField<String> = JsonMissing.of(),
        ) : this(
            dailySpend,
            dailyTransactionCount,
            monthlySpend,
            dailyResetDate,
            monthlyResetMonth,
            mutableMapOf(),
        )

        /**
         * Total amount spent by the agent today, in the smallest unit of the policy's
         * `spendingLimits.currency`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dailySpend(): Long = dailySpend.getRequired("dailySpend")

        /**
         * Number of transactions initiated by the agent today.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dailyTransactionCount(): Long =
            dailyTransactionCount.getRequired("dailyTransactionCount")

        /**
         * Total amount spent by the agent this month, in the smallest unit of the policy's
         * `spendingLimits.currency`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthlySpend(): Long = monthlySpend.getRequired("monthlySpend")

        /**
         * The date when daily usage counters will reset.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dailyResetDate(): LocalDate? = dailyResetDate.getNullable("dailyResetDate")

        /**
         * The year-month (YYYY-MM) when monthly usage counters will reset.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun monthlyResetMonth(): String? = monthlyResetMonth.getNullable("monthlyResetMonth")

        /**
         * Returns the raw JSON value of [dailySpend].
         *
         * Unlike [dailySpend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dailySpend") @ExcludeMissing fun _dailySpend(): JsonField<Long> = dailySpend

        /**
         * Returns the raw JSON value of [dailyTransactionCount].
         *
         * Unlike [dailyTransactionCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dailyTransactionCount")
        @ExcludeMissing
        fun _dailyTransactionCount(): JsonField<Long> = dailyTransactionCount

        /**
         * Returns the raw JSON value of [monthlySpend].
         *
         * Unlike [monthlySpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthlySpend")
        @ExcludeMissing
        fun _monthlySpend(): JsonField<Long> = monthlySpend

        /**
         * Returns the raw JSON value of [dailyResetDate].
         *
         * Unlike [dailyResetDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dailyResetDate")
        @ExcludeMissing
        fun _dailyResetDate(): JsonField<LocalDate> = dailyResetDate

        /**
         * Returns the raw JSON value of [monthlyResetMonth].
         *
         * Unlike [monthlyResetMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthlyResetMonth")
        @ExcludeMissing
        fun _monthlyResetMonth(): JsonField<String> = monthlyResetMonth

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
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```kotlin
             * .dailySpend()
             * .dailyTransactionCount()
             * .monthlySpend()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var dailySpend: JsonField<Long>? = null
            private var dailyTransactionCount: JsonField<Long>? = null
            private var monthlySpend: JsonField<Long>? = null
            private var dailyResetDate: JsonField<LocalDate> = JsonMissing.of()
            private var monthlyResetMonth: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(usage: Usage) = apply {
                dailySpend = usage.dailySpend
                dailyTransactionCount = usage.dailyTransactionCount
                monthlySpend = usage.monthlySpend
                dailyResetDate = usage.dailyResetDate
                monthlyResetMonth = usage.monthlyResetMonth
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            /**
             * Total amount spent by the agent today, in the smallest unit of the policy's
             * `spendingLimits.currency`.
             */
            fun dailySpend(dailySpend: Long) = dailySpend(JsonField.of(dailySpend))

            /**
             * Sets [Builder.dailySpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailySpend] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dailySpend(dailySpend: JsonField<Long>) = apply { this.dailySpend = dailySpend }

            /** Number of transactions initiated by the agent today. */
            fun dailyTransactionCount(dailyTransactionCount: Long) =
                dailyTransactionCount(JsonField.of(dailyTransactionCount))

            /**
             * Sets [Builder.dailyTransactionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyTransactionCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dailyTransactionCount(dailyTransactionCount: JsonField<Long>) = apply {
                this.dailyTransactionCount = dailyTransactionCount
            }

            /**
             * Total amount spent by the agent this month, in the smallest unit of the policy's
             * `spendingLimits.currency`.
             */
            fun monthlySpend(monthlySpend: Long) = monthlySpend(JsonField.of(monthlySpend))

            /**
             * Sets [Builder.monthlySpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlySpend] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlySpend(monthlySpend: JsonField<Long>) = apply {
                this.monthlySpend = monthlySpend
            }

            /** The date when daily usage counters will reset. */
            fun dailyResetDate(dailyResetDate: LocalDate) =
                dailyResetDate(JsonField.of(dailyResetDate))

            /**
             * Sets [Builder.dailyResetDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyResetDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dailyResetDate(dailyResetDate: JsonField<LocalDate>) = apply {
                this.dailyResetDate = dailyResetDate
            }

            /** The year-month (YYYY-MM) when monthly usage counters will reset. */
            fun monthlyResetMonth(monthlyResetMonth: String) =
                monthlyResetMonth(JsonField.of(monthlyResetMonth))

            /**
             * Sets [Builder.monthlyResetMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyResetMonth] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlyResetMonth(monthlyResetMonth: JsonField<String>) = apply {
                this.monthlyResetMonth = monthlyResetMonth
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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .dailySpend()
             * .dailyTransactionCount()
             * .monthlySpend()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("dailySpend", dailySpend),
                    checkRequired("dailyTransactionCount", dailyTransactionCount),
                    checkRequired("monthlySpend", monthlySpend),
                    dailyResetDate,
                    monthlyResetMonth,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            dailySpend()
            dailyTransactionCount()
            monthlySpend()
            dailyResetDate()
            monthlyResetMonth()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (dailySpend.asKnown() == null) 0 else 1) +
                (if (dailyTransactionCount.asKnown() == null) 0 else 1) +
                (if (monthlySpend.asKnown() == null) 0 else 1) +
                (if (dailyResetDate.asKnown() == null) 0 else 1) +
                (if (monthlyResetMonth.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                dailySpend == other.dailySpend &&
                dailyTransactionCount == other.dailyTransactionCount &&
                monthlySpend == other.monthlySpend &&
                dailyResetDate == other.dailyResetDate &&
                monthlyResetMonth == other.monthlyResetMonth &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dailySpend,
                dailyTransactionCount,
                monthlySpend,
                dailyResetDate,
                monthlyResetMonth,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{dailySpend=$dailySpend, dailyTransactionCount=$dailyTransactionCount, monthlySpend=$monthlySpend, dailyResetDate=$dailyResetDate, monthlyResetMonth=$monthlyResetMonth, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentRetrieveResponse &&
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
        "AgentRetrieveResponse{id=$id, createdAt=$createdAt, customerId=$customerId, isConnected=$isConnected, isPaused=$isPaused, name=$name, policy=$policy, updatedAt=$updatedAt, usage=$usage, additionalProperties=$additionalProperties}"
}
