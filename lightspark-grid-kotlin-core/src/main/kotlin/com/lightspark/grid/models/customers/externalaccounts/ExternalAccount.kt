// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class ExternalAccount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountInfo: JsonField<ExternalAccountInfoOneOf>,
    private val currency: JsonField<String>,
    private val status: JsonField<Status>,
    private val beneficiaryVerificationStatus: JsonField<BeneficiaryVerificationStatus>,
    private val beneficiaryVerifiedData: JsonField<BeneficiaryVerifiedData>,
    private val customerId: JsonField<String>,
    private val defaultUmaDepositAccount: JsonField<Boolean>,
    private val platformAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountInfo")
        @ExcludeMissing
        accountInfo: JsonField<ExternalAccountInfoOneOf> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("beneficiaryVerificationStatus")
        @ExcludeMissing
        beneficiaryVerificationStatus: JsonField<BeneficiaryVerificationStatus> = JsonMissing.of(),
        @JsonProperty("beneficiaryVerifiedData")
        @ExcludeMissing
        beneficiaryVerifiedData: JsonField<BeneficiaryVerifiedData> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultUmaDepositAccount")
        @ExcludeMissing
        defaultUmaDepositAccount: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("platformAccountId")
        @ExcludeMissing
        platformAccountId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountInfo,
        currency,
        status,
        beneficiaryVerificationStatus,
        beneficiaryVerifiedData,
        customerId,
        defaultUmaDepositAccount,
        platformAccountId,
        mutableMapOf(),
    )

    /**
     * The system generated identifier of this account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountInfo(): ExternalAccountInfoOneOf = accountInfo.getRequired("accountInfo")

    /**
     * The ISO 4217 currency code
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Status of the external account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The result of verifying the beneficiary name against the account holder name
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun beneficiaryVerificationStatus(): BeneficiaryVerificationStatus? =
        beneficiaryVerificationStatus.getNullable("beneficiaryVerificationStatus")

    /**
     * Verified beneficiary data returned by the payment rail, if available
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun beneficiaryVerifiedData(): BeneficiaryVerifiedData? =
        beneficiaryVerifiedData.getNullable("beneficiaryVerifiedData")

    /**
     * The customer this account is tied to, or null if the account is on behalf of the platform.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = customerId.getNullable("customerId")

    /**
     * Whether this account is the default UMA deposit account for the customer. If true, incoming
     * UMA payments to this customer's UMA address will be automatically deposited into this account
     * instead of the primary internal account. False if not provided. Note that at most, one
     * external account can be set as the default UMA deposit account for a customer. If there is no
     * default UMA deposit account, incoming UMA payments will be deposited into the primary
     * internal account for the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultUmaDepositAccount(): Boolean? =
        defaultUmaDepositAccount.getNullable("defaultUmaDepositAccount")

    /**
     * Optional platform-specific identifier for this account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformAccountId(): String? = platformAccountId.getNullable("platformAccountId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountInfo].
     *
     * Unlike [accountInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountInfo")
    @ExcludeMissing
    fun _accountInfo(): JsonField<ExternalAccountInfoOneOf> = accountInfo

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [beneficiaryVerificationStatus].
     *
     * Unlike [beneficiaryVerificationStatus], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficiaryVerificationStatus")
    @ExcludeMissing
    fun _beneficiaryVerificationStatus(): JsonField<BeneficiaryVerificationStatus> =
        beneficiaryVerificationStatus

    /**
     * Returns the raw JSON value of [beneficiaryVerifiedData].
     *
     * Unlike [beneficiaryVerifiedData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("beneficiaryVerifiedData")
    @ExcludeMissing
    fun _beneficiaryVerifiedData(): JsonField<BeneficiaryVerifiedData> = beneficiaryVerifiedData

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [defaultUmaDepositAccount].
     *
     * Unlike [defaultUmaDepositAccount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("defaultUmaDepositAccount")
    @ExcludeMissing
    fun _defaultUmaDepositAccount(): JsonField<Boolean> = defaultUmaDepositAccount

    /**
     * Returns the raw JSON value of [platformAccountId].
     *
     * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platformAccountId")
    @ExcludeMissing
    fun _platformAccountId(): JsonField<String> = platformAccountId

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
         * Returns a mutable builder for constructing an instance of [ExternalAccount].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountInfo()
         * .currency()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExternalAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountInfo: JsonField<ExternalAccountInfoOneOf>? = null
        private var currency: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var beneficiaryVerificationStatus: JsonField<BeneficiaryVerificationStatus> =
            JsonMissing.of()
        private var beneficiaryVerifiedData: JsonField<BeneficiaryVerifiedData> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var defaultUmaDepositAccount: JsonField<Boolean> = JsonMissing.of()
        private var platformAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccount: ExternalAccount) = apply {
            id = externalAccount.id
            accountInfo = externalAccount.accountInfo
            currency = externalAccount.currency
            status = externalAccount.status
            beneficiaryVerificationStatus = externalAccount.beneficiaryVerificationStatus
            beneficiaryVerifiedData = externalAccount.beneficiaryVerifiedData
            customerId = externalAccount.customerId
            defaultUmaDepositAccount = externalAccount.defaultUmaDepositAccount
            platformAccountId = externalAccount.platformAccountId
            additionalProperties = externalAccount.additionalProperties.toMutableMap()
        }

        /** The system generated identifier of this account */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accountInfo(accountInfo: ExternalAccountInfoOneOf) =
            accountInfo(JsonField.of(accountInfo))

        /**
         * Sets [Builder.accountInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountInfo] with a well-typed
         * [ExternalAccountInfoOneOf] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountInfo(accountInfo: JsonField<ExternalAccountInfoOneOf>) = apply {
            this.accountInfo = accountInfo
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofUsAccount(usAccount)`.
         */
        fun accountInfo(usAccount: UsAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofUsAccount(usAccount))

        /** Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofClabe(clabe)`. */
        fun accountInfo(clabe: ClabeAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofClabe(clabe))

        /** Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofPix(pix)`. */
        fun accountInfo(pix: PixAccountInfo) = accountInfo(ExternalAccountInfoOneOf.ofPix(pix))

        /** Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofIban(iban)`. */
        fun accountInfo(iban: IbanAccountInfo) = accountInfo(ExternalAccountInfoOneOf.ofIban(iban))

        /** Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofUpi(upi)`. */
        fun accountInfo(upi: UpiAccountInfo) = accountInfo(ExternalAccountInfoOneOf.ofUpi(upi))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount)`.
         */
        fun accountInfo(ngnAccount: NgnAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofCadAccount(cadAccount)`.
         */
        fun accountInfo(cadAccount: CadAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofCadAccount(cadAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)`.
         */
        fun accountInfo(gbpAccount: GbpAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofPhpAccount(phpAccount)`.
         */
        fun accountInfo(phpAccount: PhpAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofPhpAccount(phpAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)`.
         */
        fun accountInfo(sgdAccount: SgdAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet)`.
         */
        fun accountInfo(sparkWallet: SparkWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * SparkWalletInfo.builder()
         *     .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun sparkWalletAccountInfo(address: String) =
            accountInfo(
                SparkWalletInfo.builder()
                    .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
                    .address(address)
                    .build()
            )

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofLightning(lightning)`.
         */
        fun accountInfo(lightning: LightningWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofLightning(lightning))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofSolanaWallet(solanaWallet)`.
         */
        fun accountInfo(solanaWallet: SolanaWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofSolanaWallet(solanaWallet))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * SolanaWalletInfo.builder()
         *     .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun solanaWalletAccountInfo(address: String) =
            accountInfo(
                SolanaWalletInfo.builder()
                    .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                    .address(address)
                    .build()
            )

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofTronWallet(tronWallet)`.
         */
        fun accountInfo(tronWallet: TronWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofTronWallet(tronWallet))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * TronWalletInfo.builder()
         *     .accountType(TronWalletInfo.AccountType.TRON_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun tronWalletAccountInfo(address: String) =
            accountInfo(
                TronWalletInfo.builder()
                    .accountType(TronWalletInfo.AccountType.TRON_WALLET)
                    .address(address)
                    .build()
            )

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofPolygonWallet(polygonWallet)`.
         */
        fun accountInfo(polygonWallet: PolygonWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofPolygonWallet(polygonWallet))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * PolygonWalletInfo.builder()
         *     .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun polygonWalletAccountInfo(address: String) =
            accountInfo(
                PolygonWalletInfo.builder()
                    .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                    .address(address)
                    .build()
            )

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofBaseWallet(baseWallet)`.
         */
        fun accountInfo(baseWallet: BaseWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofBaseWallet(baseWallet))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * BaseWalletInfo.builder()
         *     .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun baseWalletAccountInfo(address: String) =
            accountInfo(
                BaseWalletInfo.builder()
                    .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
                    .address(address)
                    .build()
            )

        /** The ISO 4217 currency code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Status of the external account */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The result of verifying the beneficiary name against the account holder name */
        fun beneficiaryVerificationStatus(
            beneficiaryVerificationStatus: BeneficiaryVerificationStatus
        ) = beneficiaryVerificationStatus(JsonField.of(beneficiaryVerificationStatus))

        /**
         * Sets [Builder.beneficiaryVerificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryVerificationStatus] with a well-typed
         * [BeneficiaryVerificationStatus] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun beneficiaryVerificationStatus(
            beneficiaryVerificationStatus: JsonField<BeneficiaryVerificationStatus>
        ) = apply { this.beneficiaryVerificationStatus = beneficiaryVerificationStatus }

        /** Verified beneficiary data returned by the payment rail, if available */
        fun beneficiaryVerifiedData(beneficiaryVerifiedData: BeneficiaryVerifiedData) =
            beneficiaryVerifiedData(JsonField.of(beneficiaryVerifiedData))

        /**
         * Sets [Builder.beneficiaryVerifiedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryVerifiedData] with a well-typed
         * [BeneficiaryVerifiedData] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun beneficiaryVerifiedData(beneficiaryVerifiedData: JsonField<BeneficiaryVerifiedData>) =
            apply {
                this.beneficiaryVerifiedData = beneficiaryVerifiedData
            }

        /**
         * The customer this account is tied to, or null if the account is on behalf of the
         * platform.
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
         * Whether this account is the default UMA deposit account for the customer. If true,
         * incoming UMA payments to this customer's UMA address will be automatically deposited into
         * this account instead of the primary internal account. False if not provided. Note that at
         * most, one external account can be set as the default UMA deposit account for a customer.
         * If there is no default UMA deposit account, incoming UMA payments will be deposited into
         * the primary internal account for the customer.
         */
        fun defaultUmaDepositAccount(defaultUmaDepositAccount: Boolean) =
            defaultUmaDepositAccount(JsonField.of(defaultUmaDepositAccount))

        /**
         * Sets [Builder.defaultUmaDepositAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultUmaDepositAccount] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultUmaDepositAccount(defaultUmaDepositAccount: JsonField<Boolean>) = apply {
            this.defaultUmaDepositAccount = defaultUmaDepositAccount
        }

        /** Optional platform-specific identifier for this account */
        fun platformAccountId(platformAccountId: String) =
            platformAccountId(JsonField.of(platformAccountId))

        /**
         * Sets [Builder.platformAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformAccountId(platformAccountId: JsonField<String>) = apply {
            this.platformAccountId = platformAccountId
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
         * Returns an immutable instance of [ExternalAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountInfo()
         * .currency()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAccount =
            ExternalAccount(
                checkRequired("id", id),
                checkRequired("accountInfo", accountInfo),
                checkRequired("currency", currency),
                checkRequired("status", status),
                beneficiaryVerificationStatus,
                beneficiaryVerifiedData,
                customerId,
                defaultUmaDepositAccount,
                platformAccountId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountInfo().validate()
        currency()
        status().validate()
        beneficiaryVerificationStatus()?.validate()
        beneficiaryVerifiedData()?.validate()
        customerId()
        defaultUmaDepositAccount()
        platformAccountId()
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
            (accountInfo.asKnown()?.validity() ?: 0) +
            (if (currency.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (beneficiaryVerificationStatus.asKnown()?.validity() ?: 0) +
            (beneficiaryVerifiedData.asKnown()?.validity() ?: 0) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (defaultUmaDepositAccount.asKnown() == null) 0 else 1) +
            (if (platformAccountId.asKnown() == null) 0 else 1)

    /** Status of the external account */
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

            val UNDER_REVIEW = of("UNDER_REVIEW")

            val INACTIVE = of("INACTIVE")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACTIVE,
            UNDER_REVIEW,
            INACTIVE,
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
            UNDER_REVIEW,
            INACTIVE,
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
                UNDER_REVIEW -> Value.UNDER_REVIEW
                INACTIVE -> Value.INACTIVE
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
                UNDER_REVIEW -> Known.UNDER_REVIEW
                INACTIVE -> Known.INACTIVE
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

    /** The result of verifying the beneficiary name against the account holder name */
    class BeneficiaryVerificationStatus
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

            val MATCHED = of("MATCHED")

            val PARTIAL_MATCH = of("PARTIAL_MATCH")

            val NOT_MATCHED = of("NOT_MATCHED")

            val UNSUPPORTED = of("UNSUPPORTED")

            val CHECKED_BY_RECEIVING_FI = of("CHECKED_BY_RECEIVING_FI")

            val PENDING = of("PENDING")

            fun of(value: String) = BeneficiaryVerificationStatus(JsonField.of(value))
        }

        /** An enum containing [BeneficiaryVerificationStatus]'s known values. */
        enum class Known {
            MATCHED,
            PARTIAL_MATCH,
            NOT_MATCHED,
            UNSUPPORTED,
            CHECKED_BY_RECEIVING_FI,
            PENDING,
        }

        /**
         * An enum containing [BeneficiaryVerificationStatus]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [BeneficiaryVerificationStatus] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MATCHED,
            PARTIAL_MATCH,
            NOT_MATCHED,
            UNSUPPORTED,
            CHECKED_BY_RECEIVING_FI,
            PENDING,
            /**
             * An enum member indicating that [BeneficiaryVerificationStatus] was instantiated with
             * an unknown value.
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
                MATCHED -> Value.MATCHED
                PARTIAL_MATCH -> Value.PARTIAL_MATCH
                NOT_MATCHED -> Value.NOT_MATCHED
                UNSUPPORTED -> Value.UNSUPPORTED
                CHECKED_BY_RECEIVING_FI -> Value.CHECKED_BY_RECEIVING_FI
                PENDING -> Value.PENDING
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
                MATCHED -> Known.MATCHED
                PARTIAL_MATCH -> Known.PARTIAL_MATCH
                NOT_MATCHED -> Known.NOT_MATCHED
                UNSUPPORTED -> Known.UNSUPPORTED
                CHECKED_BY_RECEIVING_FI -> Known.CHECKED_BY_RECEIVING_FI
                PENDING -> Known.PENDING
                else ->
                    throw LightsparkGridInvalidDataException(
                        "Unknown BeneficiaryVerificationStatus: $value"
                    )
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

        fun validate(): BeneficiaryVerificationStatus = apply {
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

            return other is BeneficiaryVerificationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Verified beneficiary data returned by the payment rail, if available */
    class BeneficiaryVerifiedData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fullName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fullName") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of()
        ) : this(fullName, mutableMapOf())

        /**
         * The verified full name of the account holder as returned by the payment rail
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fullName(): String? = fullName.getNullable("fullName")

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

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
             * Returns a mutable builder for constructing an instance of [BeneficiaryVerifiedData].
             */
            fun builder() = Builder()
        }

        /** A builder for [BeneficiaryVerifiedData]. */
        class Builder internal constructor() {

            private var fullName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(beneficiaryVerifiedData: BeneficiaryVerifiedData) = apply {
                fullName = beneficiaryVerifiedData.fullName
                additionalProperties = beneficiaryVerifiedData.additionalProperties.toMutableMap()
            }

            /** The verified full name of the account holder as returned by the payment rail */
            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

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
             * Returns an immutable instance of [BeneficiaryVerifiedData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BeneficiaryVerifiedData =
                BeneficiaryVerifiedData(fullName, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): BeneficiaryVerifiedData = apply {
            if (validated) {
                return@apply
            }

            fullName()
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
        internal fun validity(): Int = (if (fullName.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BeneficiaryVerifiedData &&
                fullName == other.fullName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(fullName, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BeneficiaryVerifiedData{fullName=$fullName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccount &&
            id == other.id &&
            accountInfo == other.accountInfo &&
            currency == other.currency &&
            status == other.status &&
            beneficiaryVerificationStatus == other.beneficiaryVerificationStatus &&
            beneficiaryVerifiedData == other.beneficiaryVerifiedData &&
            customerId == other.customerId &&
            defaultUmaDepositAccount == other.defaultUmaDepositAccount &&
            platformAccountId == other.platformAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountInfo,
            currency,
            status,
            beneficiaryVerificationStatus,
            beneficiaryVerifiedData,
            customerId,
            defaultUmaDepositAccount,
            platformAccountId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalAccount{id=$id, accountInfo=$accountInfo, currency=$currency, status=$status, beneficiaryVerificationStatus=$beneficiaryVerificationStatus, beneficiaryVerifiedData=$beneficiaryVerifiedData, customerId=$customerId, defaultUmaDepositAccount=$defaultUmaDepositAccount, platformAccountId=$platformAccountId, additionalProperties=$additionalProperties}"
}
