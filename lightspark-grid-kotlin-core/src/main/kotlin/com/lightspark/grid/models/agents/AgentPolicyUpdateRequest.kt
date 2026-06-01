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
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Partial update to an agent's policy. Only provided fields will be updated; omitted fields retain
 * their current values.
 */
class AgentPolicyUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountRestrictions: JsonField<AgentAccountRestrictions>,
    private val approvalThresholds: JsonField<AgentApprovalThresholds>,
    private val defaultExecutionMode: JsonField<DefaultExecutionMode>,
    private val permissions: JsonField<List<Permission>>,
    private val spendingLimits: JsonField<SpendingLimits>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountRestrictions")
        @ExcludeMissing
        accountRestrictions: JsonField<AgentAccountRestrictions> = JsonMissing.of(),
        @JsonProperty("approvalThresholds")
        @ExcludeMissing
        approvalThresholds: JsonField<AgentApprovalThresholds> = JsonMissing.of(),
        @JsonProperty("defaultExecutionMode")
        @ExcludeMissing
        defaultExecutionMode: JsonField<DefaultExecutionMode> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<List<Permission>> = JsonMissing.of(),
        @JsonProperty("spendingLimits")
        @ExcludeMissing
        spendingLimits: JsonField<SpendingLimits> = JsonMissing.of(),
    ) : this(
        accountRestrictions,
        approvalThresholds,
        defaultExecutionMode,
        permissions,
        spendingLimits,
        mutableMapOf(),
    )

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
     * Execution mode controlling whether agent actions require human approval. AUTO: The agent can
     * execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent actions
     * require explicit human approval before execution.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultExecutionMode(): DefaultExecutionMode? =
        defaultExecutionMode.getNullable("defaultExecutionMode")

    /**
     * Updated list of permissions. Replaces the entire permissions list when provided.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun permissions(): List<Permission>? = permissions.getNullable("permissions")

    /**
     * Partial update to spending limits. Only provided fields will be updated; omitted fields
     * retain their current values.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun spendingLimits(): SpendingLimits? = spendingLimits.getNullable("spendingLimits")

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

    /**
     * Returns the raw JSON value of [defaultExecutionMode].
     *
     * Unlike [defaultExecutionMode], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Unlike [spendingLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spendingLimits")
    @ExcludeMissing
    fun _spendingLimits(): JsonField<SpendingLimits> = spendingLimits

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

        /** Returns a mutable builder for constructing an instance of [AgentPolicyUpdateRequest]. */
        fun builder() = Builder()
    }

    /** A builder for [AgentPolicyUpdateRequest]. */
    class Builder internal constructor() {

        private var accountRestrictions: JsonField<AgentAccountRestrictions> = JsonMissing.of()
        private var approvalThresholds: JsonField<AgentApprovalThresholds> = JsonMissing.of()
        private var defaultExecutionMode: JsonField<DefaultExecutionMode> = JsonMissing.of()
        private var permissions: JsonField<MutableList<Permission>>? = null
        private var spendingLimits: JsonField<SpendingLimits> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentPolicyUpdateRequest: AgentPolicyUpdateRequest) = apply {
            accountRestrictions = agentPolicyUpdateRequest.accountRestrictions
            approvalThresholds = agentPolicyUpdateRequest.approvalThresholds
            defaultExecutionMode = agentPolicyUpdateRequest.defaultExecutionMode
            permissions = agentPolicyUpdateRequest.permissions.map { it.toMutableList() }
            spendingLimits = agentPolicyUpdateRequest.spendingLimits
            additionalProperties = agentPolicyUpdateRequest.additionalProperties.toMutableMap()
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

        /**
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         */
        fun defaultExecutionMode(defaultExecutionMode: DefaultExecutionMode) =
            defaultExecutionMode(JsonField.of(defaultExecutionMode))

        /**
         * Sets [Builder.defaultExecutionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultExecutionMode] with a well-typed
         * [DefaultExecutionMode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun defaultExecutionMode(defaultExecutionMode: JsonField<DefaultExecutionMode>) = apply {
            this.defaultExecutionMode = defaultExecutionMode
        }

        /** Updated list of permissions. Replaces the entire permissions list when provided. */
        fun permissions(permissions: List<Permission>) = permissions(JsonField.of(permissions))

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed `List<Permission>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Partial update to spending limits. Only provided fields will be updated; omitted fields
         * retain their current values.
         */
        fun spendingLimits(spendingLimits: SpendingLimits) =
            spendingLimits(JsonField.of(spendingLimits))

        /**
         * Sets [Builder.spendingLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendingLimits] with a well-typed [SpendingLimits] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendingLimits(spendingLimits: JsonField<SpendingLimits>) = apply {
            this.spendingLimits = spendingLimits
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
         * Returns an immutable instance of [AgentPolicyUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentPolicyUpdateRequest =
            AgentPolicyUpdateRequest(
                accountRestrictions,
                approvalThresholds,
                defaultExecutionMode,
                (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                spendingLimits,
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
    fun validate(): AgentPolicyUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        accountRestrictions()?.validate()
        approvalThresholds()?.validate()
        defaultExecutionMode()?.validate()
        permissions()?.forEach { it.validate() }
        spendingLimits()?.validate()
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
        (accountRestrictions.asKnown()?.validity() ?: 0) +
            (approvalThresholds.asKnown()?.validity() ?: 0) +
            (defaultExecutionMode.asKnown()?.validity() ?: 0) +
            (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (spendingLimits.asKnown()?.validity() ?: 0)

    /**
     * Execution mode controlling whether agent actions require human approval. AUTO: The agent can
     * execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent actions
     * require explicit human approval before execution.
     */
    class DefaultExecutionMode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * An instance of [DefaultExecutionMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                APPROVAL_REQUIRED -> Known.APPROVAL_REQUIRED
                else ->
                    throw LightsparkGridInvalidDataException("Unknown DefaultExecutionMode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

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
     * VIEW_TRANSACTIONS: Can list and retrieve transactions and account balances. CREATE_TRANSFERS:
     * Can initiate same-currency transfers. CREATE_QUOTES: Can create cross-currency quotes.
     * EXECUTE_QUOTES: Can execute cross-currency quotes. MANAGE_EXTERNAL_ACCOUNTS: Can create and
     * manage external accounts.
     */
    class Permission @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VIEW_TRANSACTIONS,
            CREATE_TRANSFERS,
            CREATE_QUOTES,
            EXECUTE_QUOTES,
            MANAGE_EXTERNAL_ACCOUNTS,
            /**
             * An enum member indicating that [Permission] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

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
     * Partial update to spending limits. Only provided fields will be updated; omitted fields
     * retain their current values.
     */
    class SpendingLimits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val dailyLimit: JsonField<Long>,
        private val dailyTransactionLimit: JsonField<Long>,
        private val monthlyLimit: JsonField<Long>,
        private val perTransactionLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dailyLimit")
            @ExcludeMissing
            dailyLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("dailyTransactionLimit")
            @ExcludeMissing
            dailyTransactionLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthlyLimit")
            @ExcludeMissing
            monthlyLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("perTransactionLimit")
            @ExcludeMissing
            perTransactionLimit: JsonField<Long> = JsonMissing.of(),
        ) : this(
            currency,
            dailyLimit,
            dailyTransactionLimit,
            monthlyLimit,
            perTransactionLimit,
            mutableMapOf(),
        )

        /**
         * ISO 4217 currency code that all amount limits are denominated in. Updating this recasts
         * all existing limits into the new currency denomination.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * Maximum daily spend. Set to null to remove the daily limit.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dailyLimit(): Long? = dailyLimit.getNullable("dailyLimit")

        /**
         * Maximum number of transactions per day.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dailyTransactionLimit(): Long? =
            dailyTransactionLimit.getNullable("dailyTransactionLimit")

        /**
         * Maximum monthly spend. Set to null to remove the monthly limit.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun monthlyLimit(): Long? = monthlyLimit.getNullable("monthlyLimit")

        /**
         * Maximum amount per transaction.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun perTransactionLimit(): Long? = perTransactionLimit.getNullable("perTransactionLimit")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [dailyLimit].
         *
         * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dailyLimit") @ExcludeMissing fun _dailyLimit(): JsonField<Long> = dailyLimit

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

            /** Returns a mutable builder for constructing an instance of [SpendingLimits]. */
            fun builder() = Builder()
        }

        /** A builder for [SpendingLimits]. */
        class Builder internal constructor() {

            private var currency: JsonField<String> = JsonMissing.of()
            private var dailyLimit: JsonField<Long> = JsonMissing.of()
            private var dailyTransactionLimit: JsonField<Long> = JsonMissing.of()
            private var monthlyLimit: JsonField<Long> = JsonMissing.of()
            private var perTransactionLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(spendingLimits: SpendingLimits) = apply {
                currency = spendingLimits.currency
                dailyLimit = spendingLimits.dailyLimit
                dailyTransactionLimit = spendingLimits.dailyTransactionLimit
                monthlyLimit = spendingLimits.monthlyLimit
                perTransactionLimit = spendingLimits.perTransactionLimit
                additionalProperties = spendingLimits.additionalProperties.toMutableMap()
            }

            /**
             * ISO 4217 currency code that all amount limits are denominated in. Updating this
             * recasts all existing limits into the new currency denomination.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Maximum daily spend. Set to null to remove the daily limit. */
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
             * You should usually call [Builder.dailyLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dailyLimit(dailyLimit: JsonField<Long>) = apply { this.dailyLimit = dailyLimit }

            /** Maximum number of transactions per day. */
            fun dailyTransactionLimit(dailyTransactionLimit: Long) =
                dailyTransactionLimit(JsonField.of(dailyTransactionLimit))

            /**
             * Sets [Builder.dailyTransactionLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyTransactionLimit] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dailyTransactionLimit(dailyTransactionLimit: JsonField<Long>) = apply {
                this.dailyTransactionLimit = dailyTransactionLimit
            }

            /** Maximum monthly spend. Set to null to remove the monthly limit. */
            fun monthlyLimit(monthlyLimit: Long?) = monthlyLimit(JsonField.ofNullable(monthlyLimit))

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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlyLimit(monthlyLimit: JsonField<Long>) = apply {
                this.monthlyLimit = monthlyLimit
            }

            /** Maximum amount per transaction. */
            fun perTransactionLimit(perTransactionLimit: Long) =
                perTransactionLimit(JsonField.of(perTransactionLimit))

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
             * Returns an immutable instance of [SpendingLimits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SpendingLimits =
                SpendingLimits(
                    currency,
                    dailyLimit,
                    dailyTransactionLimit,
                    monthlyLimit,
                    perTransactionLimit,
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
        fun validate(): SpendingLimits = apply {
            if (validated) {
                return@apply
            }

            currency()
            dailyLimit()
            dailyTransactionLimit()
            monthlyLimit()
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
            (if (currency.asKnown() == null) 0 else 1) +
                (if (dailyLimit.asKnown() == null) 0 else 1) +
                (if (dailyTransactionLimit.asKnown() == null) 0 else 1) +
                (if (monthlyLimit.asKnown() == null) 0 else 1) +
                (if (perTransactionLimit.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendingLimits &&
                currency == other.currency &&
                dailyLimit == other.dailyLimit &&
                dailyTransactionLimit == other.dailyTransactionLimit &&
                monthlyLimit == other.monthlyLimit &&
                perTransactionLimit == other.perTransactionLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                dailyLimit,
                dailyTransactionLimit,
                monthlyLimit,
                perTransactionLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendingLimits{currency=$currency, dailyLimit=$dailyLimit, dailyTransactionLimit=$dailyTransactionLimit, monthlyLimit=$monthlyLimit, perTransactionLimit=$perTransactionLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentPolicyUpdateRequest &&
            accountRestrictions == other.accountRestrictions &&
            approvalThresholds == other.approvalThresholds &&
            defaultExecutionMode == other.defaultExecutionMode &&
            permissions == other.permissions &&
            spendingLimits == other.spendingLimits &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountRestrictions,
            approvalThresholds,
            defaultExecutionMode,
            permissions,
            spendingLimits,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentPolicyUpdateRequest{accountRestrictions=$accountRestrictions, approvalThresholds=$approvalThresholds, defaultExecutionMode=$defaultExecutionMode, permissions=$permissions, spendingLimits=$spendingLimits, additionalProperties=$additionalProperties}"
}
