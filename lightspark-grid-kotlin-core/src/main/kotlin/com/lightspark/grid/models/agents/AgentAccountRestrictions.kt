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
import java.util.Collections
import java.util.Objects

/**
 * Optional restrictions that limit the agent to specific accounts or override policy per account.
 */
class AgentAccountRestrictions
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
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountRules(): List<AccountRule>? = accountRules.getNullable("accountRules")

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
    fun _accountRules(): JsonField<List<AccountRule>> = accountRules

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

        private var accountRules: JsonField<MutableList<AccountRule>>? = null
        private var allowedAccountIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentAccountRestrictions: AgentAccountRestrictions) = apply {
            accountRules = agentAccountRestrictions.accountRules.map { it.toMutableList() }
            allowedAccountIds =
                agentAccountRestrictions.allowedAccountIds.map { it.toMutableList() }
            additionalProperties = agentAccountRestrictions.additionalProperties.toMutableMap()
        }

        /** Per-account rules that override the agent's default policy for specific accounts. */
        fun accountRules(accountRules: List<AccountRule>) = accountRules(JsonField.of(accountRules))

        /**
         * Sets [Builder.accountRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountRules] with a well-typed `List<AccountRule>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * If set, restricts the agent to operate only on the specified internal account IDs. Null
         * means the agent can access all accounts.
         */
        fun allowedAccountIds(allowedAccountIds: List<String>?) =
            allowedAccountIds(JsonField.ofNullable(allowedAccountIds))

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

    /**
     * Per-account policy override that takes precedence over the agent's default policy for a
     * specific account.
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun executionMode(): ExecutionMode? = executionMode.getNullable("executionMode")

        /**
         * Per-transaction limit override, in the smallest unit of the relevant currency. Null
         * inherits from the agent's spending limits.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
         * Unlike [executionMode], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * Execution mode controlling whether agent actions require human approval. AUTO: The
             * agent can execute actions autonomously without explicit approval. APPROVAL_REQUIRED:
             * All agent actions require explicit human approval before execution.
             */
            fun executionMode(executionMode: ExecutionMode) =
                executionMode(JsonField.of(executionMode))

            /**
             * Sets [Builder.executionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executionMode] with a well-typed [ExecutionMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun executionMode(executionMode: JsonField<ExecutionMode>) = apply {
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
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
         * Execution mode controlling whether agent actions require human approval. AUTO: The agent
         * can execute actions autonomously without explicit approval. APPROVAL_REQUIRED: All agent
         * actions require explicit human approval before execution.
         */
        class ExecutionMode @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * An enum containing [ExecutionMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ExecutionMode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                APPROVAL_REQUIRED,
                /**
                 * An enum member indicating that [ExecutionMode] was instantiated with an unknown
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
                        throw LightsparkGridInvalidDataException("Unknown ExecutionMode: $value")
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
            Objects.hash(accountId, executionMode, perTransactionLimit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountRule{accountId=$accountId, executionMode=$executionMode, perTransactionLimit=$perTransactionLimit, additionalProperties=$additionalProperties}"
    }

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
