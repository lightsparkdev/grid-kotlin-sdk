// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.internalaccounts

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
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.PaymentInstructions
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class InternalAccount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val balance: JsonField<CurrencyAmount>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fundingPaymentInstructions: JsonField<List<PaymentInstructions>>,
    private val status: JsonField<Status>,
    private val totalBalance: JsonField<CurrencyAmount>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val label: JsonField<String>,
    private val privateEnabled: JsonField<Boolean>,
    private val sweepRule: JsonField<SweepRule>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance")
        @ExcludeMissing
        balance: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fundingPaymentInstructions")
        @ExcludeMissing
        fundingPaymentInstructions: JsonField<List<PaymentInstructions>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("totalBalance")
        @ExcludeMissing
        totalBalance: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("privateEnabled")
        @ExcludeMissing
        privateEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sweepRule")
        @ExcludeMissing
        sweepRule: JsonField<SweepRule> = JsonMissing.of(),
    ) : this(
        id,
        balance,
        createdAt,
        fundingPaymentInstructions,
        status,
        totalBalance,
        type,
        updatedAt,
        customerId,
        label,
        privateEnabled,
        sweepRule,
        mutableMapOf(),
    )

    /**
     * The ID of the internal account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The balance available to spend, excluding pending and held funds
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balance(): CurrencyAmount = balance.getRequired("balance")

    /**
     * Timestamp when the internal account was created
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Payment instructions for funding the account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fundingPaymentInstructions(): List<PaymentInstructions> =
        fundingPaymentInstructions.getRequired("fundingPaymentInstructions")

    /**
     * Status of a Grid internal account. The status determines whether the account can send or
     * receive payments.
     * - `PENDING`: The account is under review and is being provisioned. The account cannot send or
     *   receive payments until provisioning completes.
     * - `ACTIVE`: The account is ready to send and receive payments.
     * - `CLOSED`: The account cannot send or receive payments. A customer can initiate the closing
     *   of an internal account, after which the account transitions to this status.
     * - `FROZEN`: The account cannot send or receive payments. Grid may freeze an account in
     *   response to compliance or fraud signals; payments are blocked while the account remains
     *   frozen.
     * - `FAILED`: The account could not be provisioned. Grid was unable to create the underlying
     *   account, so it cannot send or receive payments and requires remediation.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The total balance, including pending and held funds
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalBalance(): CurrencyAmount = totalBalance.getRequired("totalBalance")

    /**
     * Classification of an internal account.
     * - `INTERNAL_FIAT`: A Grid-managed fiat holding account (for example, the USD holding account
     *   used as the source for Payouts flows).
     * - `INTERNAL_CRYPTO`: A Grid-managed crypto holding account denominated in a stablecoin such
     *   as USDC.
     * - `EMBEDDED_WALLET`: A self-custodial Embedded Wallet provisioned for the customer. Outbound
     *   transfers require a session signature produced by the customer's device — see the Embedded
     *   Wallets guide.
     * - `RULE_BASED`: An additional account number for an existing account holder, with a routing
     *   rule attached, so incoming payments can be attributed to a specific payer and swept
     *   automatically. Created with `POST /internal-accounts`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Timestamp when the internal account was last updated
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The ID of the customer associated with the internal account. If this field is empty, the
     * internal account belongs to the platform.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = customerId.getNullable("customerId")

    /**
     * The platform-supplied label recorded when the account was created. Null for accounts that
     * carry none.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun label(): String? = label.getNullable("label")

    /**
     * Whether wallet privacy is enabled for the Embedded Wallet. Only present for `EMBEDDED_WALLET`
     * internal accounts.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun privateEnabled(): Boolean? = privateEnabled.getNullable("privateEnabled")

    /**
     * The routing rule attached to this account. Null for accounts that carry no rule, which is
     * every account other than a `RULE_BASED` one.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sweepRule(): SweepRule? = sweepRule.getNullable("sweepRule")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<CurrencyAmount> = balance

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [fundingPaymentInstructions].
     *
     * Unlike [fundingPaymentInstructions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fundingPaymentInstructions")
    @ExcludeMissing
    fun _fundingPaymentInstructions(): JsonField<List<PaymentInstructions>> =
        fundingPaymentInstructions

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [totalBalance].
     *
     * Unlike [totalBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalBalance")
    @ExcludeMissing
    fun _totalBalance(): JsonField<CurrencyAmount> = totalBalance

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [privateEnabled].
     *
     * Unlike [privateEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privateEnabled")
    @ExcludeMissing
    fun _privateEnabled(): JsonField<Boolean> = privateEnabled

    /**
     * Returns the raw JSON value of [sweepRule].
     *
     * Unlike [sweepRule], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sweepRule") @ExcludeMissing fun _sweepRule(): JsonField<SweepRule> = sweepRule

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
         * Returns a mutable builder for constructing an instance of [InternalAccount].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .balance()
         * .createdAt()
         * .fundingPaymentInstructions()
         * .status()
         * .totalBalance()
         * .type()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InternalAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var balance: JsonField<CurrencyAmount>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var fundingPaymentInstructions: JsonField<MutableList<PaymentInstructions>>? = null
        private var status: JsonField<Status>? = null
        private var totalBalance: JsonField<CurrencyAmount>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var privateEnabled: JsonField<Boolean> = JsonMissing.of()
        private var sweepRule: JsonField<SweepRule> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(internalAccount: InternalAccount) = apply {
            id = internalAccount.id
            balance = internalAccount.balance
            createdAt = internalAccount.createdAt
            fundingPaymentInstructions =
                internalAccount.fundingPaymentInstructions.map { it.toMutableList() }
            status = internalAccount.status
            totalBalance = internalAccount.totalBalance
            type = internalAccount.type
            updatedAt = internalAccount.updatedAt
            customerId = internalAccount.customerId
            label = internalAccount.label
            privateEnabled = internalAccount.privateEnabled
            sweepRule = internalAccount.sweepRule
            additionalProperties = internalAccount.additionalProperties.toMutableMap()
        }

        /** The ID of the internal account */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The balance available to spend, excluding pending and held funds */
        fun balance(balance: CurrencyAmount) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balance(balance: JsonField<CurrencyAmount>) = apply { this.balance = balance }

        /** Timestamp when the internal account was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Payment instructions for funding the account */
        fun fundingPaymentInstructions(fundingPaymentInstructions: List<PaymentInstructions>) =
            fundingPaymentInstructions(JsonField.of(fundingPaymentInstructions))

        /**
         * Sets [Builder.fundingPaymentInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingPaymentInstructions] with a well-typed
         * `List<PaymentInstructions>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun fundingPaymentInstructions(
            fundingPaymentInstructions: JsonField<List<PaymentInstructions>>
        ) = apply {
            this.fundingPaymentInstructions = fundingPaymentInstructions.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentInstructions] to [fundingPaymentInstructions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFundingPaymentInstruction(fundingPaymentInstruction: PaymentInstructions) = apply {
            fundingPaymentInstructions =
                (fundingPaymentInstructions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fundingPaymentInstructions", it).add(fundingPaymentInstruction)
                }
        }

        /**
         * Status of a Grid internal account. The status determines whether the account can send or
         * receive payments.
         * - `PENDING`: The account is under review and is being provisioned. The account cannot
         *   send or receive payments until provisioning completes.
         * - `ACTIVE`: The account is ready to send and receive payments.
         * - `CLOSED`: The account cannot send or receive payments. A customer can initiate the
         *   closing of an internal account, after which the account transitions to this status.
         * - `FROZEN`: The account cannot send or receive payments. Grid may freeze an account in
         *   response to compliance or fraud signals; payments are blocked while the account remains
         *   frozen.
         * - `FAILED`: The account could not be provisioned. Grid was unable to create the
         *   underlying account, so it cannot send or receive payments and requires remediation.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The total balance, including pending and held funds */
        fun totalBalance(totalBalance: CurrencyAmount) = totalBalance(JsonField.of(totalBalance))

        /**
         * Sets [Builder.totalBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalBalance] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalBalance(totalBalance: JsonField<CurrencyAmount>) = apply {
            this.totalBalance = totalBalance
        }

        /**
         * Classification of an internal account.
         * - `INTERNAL_FIAT`: A Grid-managed fiat holding account (for example, the USD holding
         *   account used as the source for Payouts flows).
         * - `INTERNAL_CRYPTO`: A Grid-managed crypto holding account denominated in a stablecoin
         *   such as USDC.
         * - `EMBEDDED_WALLET`: A self-custodial Embedded Wallet provisioned for the customer.
         *   Outbound transfers require a session signature produced by the customer's device — see
         *   the Embedded Wallets guide.
         * - `RULE_BASED`: An additional account number for an existing account holder, with a
         *   routing rule attached, so incoming payments can be attributed to a specific payer and
         *   swept automatically. Created with `POST /internal-accounts`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Timestamp when the internal account was last updated */
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
         * The ID of the customer associated with the internal account. If this field is empty, the
         * internal account belongs to the platform.
         */
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
         * The platform-supplied label recorded when the account was created. Null for accounts that
         * carry none.
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * Whether wallet privacy is enabled for the Embedded Wallet. Only present for
         * `EMBEDDED_WALLET` internal accounts.
         */
        fun privateEnabled(privateEnabled: Boolean) = privateEnabled(JsonField.of(privateEnabled))

        /**
         * Sets [Builder.privateEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privateEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privateEnabled(privateEnabled: JsonField<Boolean>) = apply {
            this.privateEnabled = privateEnabled
        }

        /**
         * The routing rule attached to this account. Null for accounts that carry no rule, which is
         * every account other than a `RULE_BASED` one.
         */
        fun sweepRule(sweepRule: SweepRule) = sweepRule(JsonField.of(sweepRule))

        /**
         * Sets [Builder.sweepRule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sweepRule] with a well-typed [SweepRule] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sweepRule(sweepRule: JsonField<SweepRule>) = apply { this.sweepRule = sweepRule }

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
         * Returns an immutable instance of [InternalAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .balance()
         * .createdAt()
         * .fundingPaymentInstructions()
         * .status()
         * .totalBalance()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InternalAccount =
            InternalAccount(
                checkRequired("id", id),
                checkRequired("balance", balance),
                checkRequired("createdAt", createdAt),
                checkRequired("fundingPaymentInstructions", fundingPaymentInstructions).map {
                    it.toImmutable()
                },
                checkRequired("status", status),
                checkRequired("totalBalance", totalBalance),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                customerId,
                label,
                privateEnabled,
                sweepRule,
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
    fun validate(): InternalAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        balance().validate()
        createdAt()
        fundingPaymentInstructions().forEach { it.validate() }
        status().validate()
        totalBalance().validate()
        type().validate()
        updatedAt()
        customerId()
        label()
        privateEnabled()
        sweepRule()?.validate()
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
            (balance.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (fundingPaymentInstructions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (totalBalance.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (label.asKnown() == null) 0 else 1) +
            (if (privateEnabled.asKnown() == null) 0 else 1) +
            (sweepRule.asKnown()?.validity() ?: 0)

    /**
     * Status of a Grid internal account. The status determines whether the account can send or
     * receive payments.
     * - `PENDING`: The account is under review and is being provisioned. The account cannot send or
     *   receive payments until provisioning completes.
     * - `ACTIVE`: The account is ready to send and receive payments.
     * - `CLOSED`: The account cannot send or receive payments. A customer can initiate the closing
     *   of an internal account, after which the account transitions to this status.
     * - `FROZEN`: The account cannot send or receive payments. Grid may freeze an account in
     *   response to compliance or fraud signals; payments are blocked while the account remains
     *   frozen.
     * - `FAILED`: The account could not be provisioned. Grid was unable to create the underlying
     *   account, so it cannot send or receive payments and requires remediation.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PENDING = of("PENDING")

            val ACTIVE = of("ACTIVE")

            val CLOSED = of("CLOSED")

            val FROZEN = of("FROZEN")

            val FAILED = of("FAILED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACTIVE,
            CLOSED,
            FROZEN,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACTIVE,
            CLOSED,
            FROZEN,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                ACTIVE -> Value.ACTIVE
                CLOSED -> Value.CLOSED
                FROZEN -> Value.FROZEN
                FAILED -> Value.FAILED
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
                PENDING -> Known.PENDING
                ACTIVE -> Known.ACTIVE
                CLOSED -> Known.CLOSED
                FROZEN -> Known.FROZEN
                FAILED -> Known.FAILED
                else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Classification of an internal account.
     * - `INTERNAL_FIAT`: A Grid-managed fiat holding account (for example, the USD holding account
     *   used as the source for Payouts flows).
     * - `INTERNAL_CRYPTO`: A Grid-managed crypto holding account denominated in a stablecoin such
     *   as USDC.
     * - `EMBEDDED_WALLET`: A self-custodial Embedded Wallet provisioned for the customer. Outbound
     *   transfers require a session signature produced by the customer's device — see the Embedded
     *   Wallets guide.
     * - `RULE_BASED`: An additional account number for an existing account holder, with a routing
     *   rule attached, so incoming payments can be attributed to a specific payer and swept
     *   automatically. Created with `POST /internal-accounts`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val INTERNAL_FIAT = of("INTERNAL_FIAT")

            val INTERNAL_CRYPTO = of("INTERNAL_CRYPTO")

            val EMBEDDED_WALLET = of("EMBEDDED_WALLET")

            val RULE_BASED = of("RULE_BASED")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INTERNAL_FIAT,
            INTERNAL_CRYPTO,
            EMBEDDED_WALLET,
            RULE_BASED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTERNAL_FIAT,
            INTERNAL_CRYPTO,
            EMBEDDED_WALLET,
            RULE_BASED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                INTERNAL_FIAT -> Value.INTERNAL_FIAT
                INTERNAL_CRYPTO -> Value.INTERNAL_CRYPTO
                EMBEDDED_WALLET -> Value.EMBEDDED_WALLET
                RULE_BASED -> Value.RULE_BASED
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
                INTERNAL_FIAT -> Known.INTERNAL_FIAT
                INTERNAL_CRYPTO -> Known.INTERNAL_CRYPTO
                EMBEDDED_WALLET -> Known.EMBEDDED_WALLET
                RULE_BASED -> Known.RULE_BASED
                else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The routing rule attached to this account. Null for accounts that carry no rule, which is
     * every account other than a `RULE_BASED` one.
     */
    class SweepRule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destination: JsonField<Destination>,
        private val description: JsonField<String>,
        private val maximumAmount: JsonField<CurrencyAmount>,
        private val minimumAmount: JsonField<CurrencyAmount>,
        private val platformFeeOverride: JsonField<PlatformFeeOverride>,
        private val purposeOfPayment: JsonField<PurposeOfPayment>,
        private val remittanceInformation: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destination")
            @ExcludeMissing
            destination: JsonField<Destination> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximumAmount")
            @ExcludeMissing
            maximumAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
            @JsonProperty("minimumAmount")
            @ExcludeMissing
            minimumAmount: JsonField<CurrencyAmount> = JsonMissing.of(),
            @JsonProperty("platformFeeOverride")
            @ExcludeMissing
            platformFeeOverride: JsonField<PlatformFeeOverride> = JsonMissing.of(),
            @JsonProperty("purposeOfPayment")
            @ExcludeMissing
            purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of(),
            @JsonProperty("remittanceInformation")
            @ExcludeMissing
            remittanceInformation: JsonField<String> = JsonMissing.of(),
        ) : this(
            destination,
            description,
            maximumAmount,
            minimumAmount,
            platformFeeOverride,
            purposeOfPayment,
            remittanceInformation,
            mutableMapOf(),
        )

        /**
         * Where funds that settle into this account are swept.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destination(): Destination = destination.getRequired("destination")

        /**
         * Free-form description recorded on each sweep. Not delivered to the recipient.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * **In this rule-based account's currency, not the destination's.** The largest balance the
         * corridor to the destination can carry; a settled balance above it is not swept. Null
         * means no ceiling.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maximumAmount(): CurrencyAmount? = maximumAmount.getNullable("maximumAmount")

        /**
         * **In this rule-based account's currency, not the destination's.** The smallest balance
         * the corridor to the destination can carry; a settled balance below it is not swept. Zero
         * means no floor, which is the case for a same-currency internal destination — a book
         * transfer with no rail, fee or conversion to justify one. Configuration rather than a
         * moving estimate, so there is nothing to re-poll.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun minimumAmount(): CurrencyAmount? = minimumAmount.getNullable("minimumAmount")

        /**
         * Fee terms applied to every sweep this rule drives. Null when the platform's configured
         * fees apply.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun platformFeeOverride(): PlatformFeeOverride? =
            platformFeeOverride.getNullable("platformFeeOverride")

        /**
         * The purpose of payment applied to each sweep.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purposeOfPayment(): PurposeOfPayment? = purposeOfPayment.getNullable("purposeOfPayment")

        /**
         * Free-form information that travels with each sweep to the recipient.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String? =
            remittanceInformation.getNullable("remittanceInformation")

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<Destination> = destination

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximumAmount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<CurrencyAmount> = maximumAmount

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimumAmount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<CurrencyAmount> = minimumAmount

        /**
         * Returns the raw JSON value of [platformFeeOverride].
         *
         * Unlike [platformFeeOverride], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("platformFeeOverride")
        @ExcludeMissing
        fun _platformFeeOverride(): JsonField<PlatformFeeOverride> = platformFeeOverride

        /**
         * Returns the raw JSON value of [purposeOfPayment].
         *
         * Unlike [purposeOfPayment], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("purposeOfPayment")
        @ExcludeMissing
        fun _purposeOfPayment(): JsonField<PurposeOfPayment> = purposeOfPayment

        /**
         * Returns the raw JSON value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remittanceInformation")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

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
             * Returns a mutable builder for constructing an instance of [SweepRule].
             *
             * The following fields are required:
             * ```kotlin
             * .destination()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SweepRule]. */
        class Builder internal constructor() {

            private var destination: JsonField<Destination>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var maximumAmount: JsonField<CurrencyAmount> = JsonMissing.of()
            private var minimumAmount: JsonField<CurrencyAmount> = JsonMissing.of()
            private var platformFeeOverride: JsonField<PlatformFeeOverride> = JsonMissing.of()
            private var purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of()
            private var remittanceInformation: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sweepRule: SweepRule) = apply {
                destination = sweepRule.destination
                description = sweepRule.description
                maximumAmount = sweepRule.maximumAmount
                minimumAmount = sweepRule.minimumAmount
                platformFeeOverride = sweepRule.platformFeeOverride
                purposeOfPayment = sweepRule.purposeOfPayment
                remittanceInformation = sweepRule.remittanceInformation
                additionalProperties = sweepRule.additionalProperties.toMutableMap()
            }

            /** Where funds that settle into this account are swept. */
            fun destination(destination: Destination) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [Destination] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<Destination>) = apply {
                this.destination = destination
            }

            /** Free-form description recorded on each sweep. Not delivered to the recipient. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * **In this rule-based account's currency, not the destination's.** The largest balance
             * the corridor to the destination can carry; a settled balance above it is not swept.
             * Null means no ceiling.
             */
            fun maximumAmount(maximumAmount: CurrencyAmount) =
                maximumAmount(JsonField.of(maximumAmount))

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [CurrencyAmount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maximumAmount(maximumAmount: JsonField<CurrencyAmount>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * **In this rule-based account's currency, not the destination's.** The smallest
             * balance the corridor to the destination can carry; a settled balance below it is not
             * swept. Zero means no floor, which is the case for a same-currency internal
             * destination — a book transfer with no rail, fee or conversion to justify one.
             * Configuration rather than a moving estimate, so there is nothing to re-poll.
             */
            fun minimumAmount(minimumAmount: CurrencyAmount) =
                minimumAmount(JsonField.of(minimumAmount))

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [CurrencyAmount]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minimumAmount(minimumAmount: JsonField<CurrencyAmount>) = apply {
                this.minimumAmount = minimumAmount
            }

            /**
             * Fee terms applied to every sweep this rule drives. Null when the platform's
             * configured fees apply.
             */
            fun platformFeeOverride(platformFeeOverride: PlatformFeeOverride) =
                platformFeeOverride(JsonField.of(platformFeeOverride))

            /**
             * Sets [Builder.platformFeeOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformFeeOverride] with a well-typed
             * [PlatformFeeOverride] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun platformFeeOverride(platformFeeOverride: JsonField<PlatformFeeOverride>) = apply {
                this.platformFeeOverride = platformFeeOverride
            }

            /** The purpose of payment applied to each sweep. */
            fun purposeOfPayment(purposeOfPayment: PurposeOfPayment) =
                purposeOfPayment(JsonField.of(purposeOfPayment))

            /**
             * Sets [Builder.purposeOfPayment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purposeOfPayment] with a well-typed
             * [PurposeOfPayment] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun purposeOfPayment(purposeOfPayment: JsonField<PurposeOfPayment>) = apply {
                this.purposeOfPayment = purposeOfPayment
            }

            /** Free-form information that travels with each sweep to the recipient. */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
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
             * Returns an immutable instance of [SweepRule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .destination()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SweepRule =
                SweepRule(
                    checkRequired("destination", destination),
                    description,
                    maximumAmount,
                    minimumAmount,
                    platformFeeOverride,
                    purposeOfPayment,
                    remittanceInformation,
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
        fun validate(): SweepRule = apply {
            if (validated) {
                return@apply
            }

            destination().validate()
            description()
            maximumAmount()?.validate()
            minimumAmount()?.validate()
            platformFeeOverride()?.validate()
            purposeOfPayment()?.validate()
            remittanceInformation()
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
            (destination.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (maximumAmount.asKnown()?.validity() ?: 0) +
                (minimumAmount.asKnown()?.validity() ?: 0) +
                (platformFeeOverride.asKnown()?.validity() ?: 0) +
                (purposeOfPayment.asKnown()?.validity() ?: 0) +
                (if (remittanceInformation.asKnown() == null) 0 else 1)

        /** Where funds that settle into this account are swept. */
        class Destination
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val paymentRail: JsonField<PaymentRail>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountId")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRail")
                @ExcludeMissing
                paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
            ) : this(accountId, paymentRail, mutableMapOf())

            /**
             * The account that receives the swept funds.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountId(): String = accountId.getRequired("accountId")

            /**
             * The rail each sweep is sent over. Null when a rail is selected automatically per
             * sweep, in which case none is resolved ahead of time.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentRail(): PaymentRail? = paymentRail.getNullable("paymentRail")

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
             * Returns the raw JSON value of [paymentRail].
             *
             * Unlike [paymentRail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRail")
            @ExcludeMissing
            fun _paymentRail(): JsonField<PaymentRail> = paymentRail

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
                 * Returns a mutable builder for constructing an instance of [Destination].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Destination]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var paymentRail: JsonField<PaymentRail> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(destination: Destination) = apply {
                    accountId = destination.accountId
                    paymentRail = destination.paymentRail
                    additionalProperties = destination.additionalProperties.toMutableMap()
                }

                /** The account that receives the swept funds. */
                fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                /**
                 * Sets [Builder.accountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

                /**
                 * The rail each sweep is sent over. Null when a rail is selected automatically per
                 * sweep, in which case none is resolved ahead of time.
                 */
                fun paymentRail(paymentRail: PaymentRail) = paymentRail(JsonField.of(paymentRail))

                /**
                 * Sets [Builder.paymentRail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRail] with a well-typed [PaymentRail]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentRail(paymentRail: JsonField<PaymentRail>) = apply {
                    this.paymentRail = paymentRail
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
                 * Returns an immutable instance of [Destination].
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
                fun build(): Destination =
                    Destination(
                        checkRequired("accountId", accountId),
                        paymentRail,
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
            fun validate(): Destination = apply {
                if (validated) {
                    return@apply
                }

                accountId()
                paymentRail()?.validate()
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
                    (paymentRail.asKnown()?.validity() ?: 0)

            /**
             * The rail each sweep is sent over. Null when a rail is selected automatically per
             * sweep, in which case none is resolved ahead of time.
             */
            class PaymentRail
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ACH")

                    val ACH_COLOMBIA = of("ACH_COLOMBIA")

                    val BANK_TRANSFER = of("BANK_TRANSFER")

                    val BRE_B = of("BRE_B")

                    val CIPS = of("CIPS")

                    val FAST = of("FAST")

                    val FASTER_PAYMENTS = of("FASTER_PAYMENTS")

                    val FEDNOW = of("FEDNOW")

                    val INSTAPAY = of("INSTAPAY")

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    val NEFT = of("NEFT")

                    val PAYNOW = of("PAYNOW")

                    val PESONET = of("PESONET")

                    val PIX = of("PIX")

                    val RTGS = of("RTGS")

                    val RTP = of("RTP")

                    val SEPA = of("SEPA")

                    val SEPA_INSTANT = of("SEPA_INSTANT")

                    val SPEI = of("SPEI")

                    val SWIFT = of("SWIFT")

                    val UNIONPAY = of("UNIONPAY")

                    val UPI = of("UPI")

                    val WIRE = of("WIRE")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    ACH,
                    ACH_COLOMBIA,
                    BANK_TRANSFER,
                    BRE_B,
                    CIPS,
                    FAST,
                    FASTER_PAYMENTS,
                    FEDNOW,
                    INSTAPAY,
                    MOBILE_MONEY,
                    NEFT,
                    PAYNOW,
                    PESONET,
                    PIX,
                    RTGS,
                    RTP,
                    SEPA,
                    SEPA_INSTANT,
                    SPEI,
                    SWIFT,
                    UNIONPAY,
                    UPI,
                    WIRE,
                }

                /**
                 * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH,
                    ACH_COLOMBIA,
                    BANK_TRANSFER,
                    BRE_B,
                    CIPS,
                    FAST,
                    FASTER_PAYMENTS,
                    FEDNOW,
                    INSTAPAY,
                    MOBILE_MONEY,
                    NEFT,
                    PAYNOW,
                    PESONET,
                    PIX,
                    RTGS,
                    RTP,
                    SEPA,
                    SEPA_INSTANT,
                    SPEI,
                    SWIFT,
                    UNIONPAY,
                    UPI,
                    WIRE,
                    /**
                     * An enum member indicating that [PaymentRail] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        ACH_COLOMBIA -> Value.ACH_COLOMBIA
                        BANK_TRANSFER -> Value.BANK_TRANSFER
                        BRE_B -> Value.BRE_B
                        CIPS -> Value.CIPS
                        FAST -> Value.FAST
                        FASTER_PAYMENTS -> Value.FASTER_PAYMENTS
                        FEDNOW -> Value.FEDNOW
                        INSTAPAY -> Value.INSTAPAY
                        MOBILE_MONEY -> Value.MOBILE_MONEY
                        NEFT -> Value.NEFT
                        PAYNOW -> Value.PAYNOW
                        PESONET -> Value.PESONET
                        PIX -> Value.PIX
                        RTGS -> Value.RTGS
                        RTP -> Value.RTP
                        SEPA -> Value.SEPA
                        SEPA_INSTANT -> Value.SEPA_INSTANT
                        SPEI -> Value.SPEI
                        SWIFT -> Value.SWIFT
                        UNIONPAY -> Value.UNIONPAY
                        UPI -> Value.UPI
                        WIRE -> Value.WIRE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        ACH_COLOMBIA -> Known.ACH_COLOMBIA
                        BANK_TRANSFER -> Known.BANK_TRANSFER
                        BRE_B -> Known.BRE_B
                        CIPS -> Known.CIPS
                        FAST -> Known.FAST
                        FASTER_PAYMENTS -> Known.FASTER_PAYMENTS
                        FEDNOW -> Known.FEDNOW
                        INSTAPAY -> Known.INSTAPAY
                        MOBILE_MONEY -> Known.MOBILE_MONEY
                        NEFT -> Known.NEFT
                        PAYNOW -> Known.PAYNOW
                        PESONET -> Known.PESONET
                        PIX -> Known.PIX
                        RTGS -> Known.RTGS
                        RTP -> Known.RTP
                        SEPA -> Known.SEPA
                        SEPA_INSTANT -> Known.SEPA_INSTANT
                        SPEI -> Known.SPEI
                        SWIFT -> Known.SWIFT
                        UNIONPAY -> Known.UNIONPAY
                        UPI -> Known.UPI
                        WIRE -> Known.WIRE
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): PaymentRail = apply {
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

                    return other is PaymentRail && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Destination &&
                    accountId == other.accountId &&
                    paymentRail == other.paymentRail &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, paymentRail, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Destination{accountId=$accountId, paymentRail=$paymentRail, additionalProperties=$additionalProperties}"
        }

        /**
         * Fee terms applied to every sweep this rule drives. Null when the platform's configured
         * fees apply.
         */
        class PlatformFeeOverride
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val platformFixedFee: JsonField<PlatformFixedFee>,
            private val platformVariableFeeBps: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("platformFixedFee")
                @ExcludeMissing
                platformFixedFee: JsonField<PlatformFixedFee> = JsonMissing.of(),
                @JsonProperty("platformVariableFeeBps")
                @ExcludeMissing
                platformVariableFeeBps: JsonField<Long> = JsonMissing.of(),
            ) : this(platformFixedFee, platformVariableFeeBps, mutableMapOf())

            /**
             * Fixed fee charged for this transaction. Must be denominated in the quote's source
             * currency (USD today).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platformFixedFee(): PlatformFixedFee =
                platformFixedFee.getRequired("platformFixedFee")

            /**
             * Variable fee in basis points (1 bps = 0.01%) to apply to the transaction's
             * source-currency amount.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platformVariableFeeBps(): Long =
                platformVariableFeeBps.getRequired("platformVariableFeeBps")

            /**
             * Returns the raw JSON value of [platformFixedFee].
             *
             * Unlike [platformFixedFee], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("platformFixedFee")
            @ExcludeMissing
            fun _platformFixedFee(): JsonField<PlatformFixedFee> = platformFixedFee

            /**
             * Returns the raw JSON value of [platformVariableFeeBps].
             *
             * Unlike [platformVariableFeeBps], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("platformVariableFeeBps")
            @ExcludeMissing
            fun _platformVariableFeeBps(): JsonField<Long> = platformVariableFeeBps

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
                 * Returns a mutable builder for constructing an instance of [PlatformFeeOverride].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .platformFixedFee()
                 * .platformVariableFeeBps()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PlatformFeeOverride]. */
            class Builder internal constructor() {

                private var platformFixedFee: JsonField<PlatformFixedFee>? = null
                private var platformVariableFeeBps: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(platformFeeOverride: PlatformFeeOverride) = apply {
                    platformFixedFee = platformFeeOverride.platformFixedFee
                    platformVariableFeeBps = platformFeeOverride.platformVariableFeeBps
                    additionalProperties = platformFeeOverride.additionalProperties.toMutableMap()
                }

                /**
                 * Fixed fee charged for this transaction. Must be denominated in the quote's source
                 * currency (USD today).
                 */
                fun platformFixedFee(platformFixedFee: PlatformFixedFee) =
                    platformFixedFee(JsonField.of(platformFixedFee))

                /**
                 * Sets [Builder.platformFixedFee] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platformFixedFee] with a well-typed
                 * [PlatformFixedFee] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun platformFixedFee(platformFixedFee: JsonField<PlatformFixedFee>) = apply {
                    this.platformFixedFee = platformFixedFee
                }

                /**
                 * Variable fee in basis points (1 bps = 0.01%) to apply to the transaction's
                 * source-currency amount.
                 */
                fun platformVariableFeeBps(platformVariableFeeBps: Long) =
                    platformVariableFeeBps(JsonField.of(platformVariableFeeBps))

                /**
                 * Sets [Builder.platformVariableFeeBps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platformVariableFeeBps] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun platformVariableFeeBps(platformVariableFeeBps: JsonField<Long>) = apply {
                    this.platformVariableFeeBps = platformVariableFeeBps
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
                 * Returns an immutable instance of [PlatformFeeOverride].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .platformFixedFee()
                 * .platformVariableFeeBps()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlatformFeeOverride =
                    PlatformFeeOverride(
                        checkRequired("platformFixedFee", platformFixedFee),
                        checkRequired("platformVariableFeeBps", platformVariableFeeBps),
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
            fun validate(): PlatformFeeOverride = apply {
                if (validated) {
                    return@apply
                }

                platformFixedFee().validate()
                platformVariableFeeBps()
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
                (platformFixedFee.asKnown()?.validity() ?: 0) +
                    (if (platformVariableFeeBps.asKnown() == null) 0 else 1)

            /**
             * Fixed fee charged for this transaction. Must be denominated in the quote's source
             * currency (USD today).
             */
            class PlatformFixedFee
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for
                 * USD).
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                 * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC"
                 * for USDC, etc.)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [PlatformFixedFee].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .currency()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PlatformFixedFee]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(platformFixedFee: PlatformFixedFee) = apply {
                        amount = platformFixedFee.amount
                        currency = platformFixedFee.currency
                        additionalProperties = platformFixedFee.additionalProperties.toMutableMap()
                    }

                    /**
                     * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents
                     * for USD).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                     * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin,
                     * "USDC" for USDC, etc.)
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [PlatformFixedFee].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PlatformFixedFee =
                        PlatformFixedFee(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
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
                fun validate(): PlatformFixedFee = apply {
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

                    return other is PlatformFixedFee &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlatformFixedFee{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlatformFeeOverride &&
                    platformFixedFee == other.platformFixedFee &&
                    platformVariableFeeBps == other.platformVariableFeeBps &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(platformFixedFee, platformVariableFeeBps, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlatformFeeOverride{platformFixedFee=$platformFixedFee, platformVariableFeeBps=$platformVariableFeeBps, additionalProperties=$additionalProperties}"
        }

        /** The purpose of payment applied to each sweep. */
        class PurposeOfPayment
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

                val GIFT = of("GIFT")

                val SELF = of("SELF")

                val GOODS_OR_SERVICES = of("GOODS_OR_SERVICES")

                val EDUCATION = of("EDUCATION")

                val HEALTH_OR_MEDICAL = of("HEALTH_OR_MEDICAL")

                val REAL_ESTATE_PURCHASE = of("REAL_ESTATE_PURCHASE")

                val TAX_PAYMENT = of("TAX_PAYMENT")

                val LOAN_PAYMENT = of("LOAN_PAYMENT")

                val UTILITY_BILL = of("UTILITY_BILL")

                val DONATION = of("DONATION")

                val TRAVEL = of("TRAVEL")

                val FAMILY_SUPPORT = of("FAMILY_SUPPORT")

                val SALARY_PAYMENT = of("SALARY_PAYMENT")

                val OTHER = of("OTHER")

                fun of(value: String) = PurposeOfPayment(JsonField.of(value))
            }

            /** An enum containing [PurposeOfPayment]'s known values. */
            enum class Known {
                GIFT,
                SELF,
                GOODS_OR_SERVICES,
                EDUCATION,
                HEALTH_OR_MEDICAL,
                REAL_ESTATE_PURCHASE,
                TAX_PAYMENT,
                LOAN_PAYMENT,
                UTILITY_BILL,
                DONATION,
                TRAVEL,
                FAMILY_SUPPORT,
                SALARY_PAYMENT,
                OTHER,
            }

            /**
             * An enum containing [PurposeOfPayment]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PurposeOfPayment] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GIFT,
                SELF,
                GOODS_OR_SERVICES,
                EDUCATION,
                HEALTH_OR_MEDICAL,
                REAL_ESTATE_PURCHASE,
                TAX_PAYMENT,
                LOAN_PAYMENT,
                UTILITY_BILL,
                DONATION,
                TRAVEL,
                FAMILY_SUPPORT,
                SALARY_PAYMENT,
                OTHER,
                /**
                 * An enum member indicating that [PurposeOfPayment] was instantiated with an
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
                    GIFT -> Value.GIFT
                    SELF -> Value.SELF
                    GOODS_OR_SERVICES -> Value.GOODS_OR_SERVICES
                    EDUCATION -> Value.EDUCATION
                    HEALTH_OR_MEDICAL -> Value.HEALTH_OR_MEDICAL
                    REAL_ESTATE_PURCHASE -> Value.REAL_ESTATE_PURCHASE
                    TAX_PAYMENT -> Value.TAX_PAYMENT
                    LOAN_PAYMENT -> Value.LOAN_PAYMENT
                    UTILITY_BILL -> Value.UTILITY_BILL
                    DONATION -> Value.DONATION
                    TRAVEL -> Value.TRAVEL
                    FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                    SALARY_PAYMENT -> Value.SALARY_PAYMENT
                    OTHER -> Value.OTHER
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
                    GIFT -> Known.GIFT
                    SELF -> Known.SELF
                    GOODS_OR_SERVICES -> Known.GOODS_OR_SERVICES
                    EDUCATION -> Known.EDUCATION
                    HEALTH_OR_MEDICAL -> Known.HEALTH_OR_MEDICAL
                    REAL_ESTATE_PURCHASE -> Known.REAL_ESTATE_PURCHASE
                    TAX_PAYMENT -> Known.TAX_PAYMENT
                    LOAN_PAYMENT -> Known.LOAN_PAYMENT
                    UTILITY_BILL -> Known.UTILITY_BILL
                    DONATION -> Known.DONATION
                    TRAVEL -> Known.TRAVEL
                    FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                    SALARY_PAYMENT -> Known.SALARY_PAYMENT
                    OTHER -> Known.OTHER
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown PurposeOfPayment: $value")
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
            fun validate(): PurposeOfPayment = apply {
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

                return other is PurposeOfPayment && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SweepRule &&
                destination == other.destination &&
                description == other.description &&
                maximumAmount == other.maximumAmount &&
                minimumAmount == other.minimumAmount &&
                platformFeeOverride == other.platformFeeOverride &&
                purposeOfPayment == other.purposeOfPayment &&
                remittanceInformation == other.remittanceInformation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                destination,
                description,
                maximumAmount,
                minimumAmount,
                platformFeeOverride,
                purposeOfPayment,
                remittanceInformation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SweepRule{destination=$destination, description=$description, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, platformFeeOverride=$platformFeeOverride, purposeOfPayment=$purposeOfPayment, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InternalAccount &&
            id == other.id &&
            balance == other.balance &&
            createdAt == other.createdAt &&
            fundingPaymentInstructions == other.fundingPaymentInstructions &&
            status == other.status &&
            totalBalance == other.totalBalance &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            customerId == other.customerId &&
            label == other.label &&
            privateEnabled == other.privateEnabled &&
            sweepRule == other.sweepRule &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            balance,
            createdAt,
            fundingPaymentInstructions,
            status,
            totalBalance,
            type,
            updatedAt,
            customerId,
            label,
            privateEnabled,
            sweepRule,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InternalAccount{id=$id, balance=$balance, createdAt=$createdAt, fundingPaymentInstructions=$fundingPaymentInstructions, status=$status, totalBalance=$totalBalance, type=$type, updatedAt=$updatedAt, customerId=$customerId, label=$label, privateEnabled=$privateEnabled, sweepRule=$sweepRule, additionalProperties=$additionalProperties}"
}
