// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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

class ExternalAccountCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountInfo: JsonField<ExternalAccountInfoOneOf>,
    private val currency: JsonField<String>,
    private val customerId: JsonField<String>,
    private val defaultUmaDepositAccount: JsonField<Boolean>,
    private val platformAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountInfo")
        @ExcludeMissing
        accountInfo: JsonField<ExternalAccountInfoOneOf> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
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
        accountInfo,
        currency,
        customerId,
        defaultUmaDepositAccount,
        platformAccountId,
        mutableMapOf(),
    )

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
     * The ID of the customer for whom to create the external account. If not provided, the external
     * account will be created on behalf of the platform.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = customerId.getNullable("customerId")

    /**
     * Whether to set the external account as the default UMA deposit account. When set to true,
     * incoming payments to this customer's UMA address will be automatically deposited into this
     * external account. False if not provided. Note that only one external account can be set as
     * the default UMA deposit account for a customer, so if there is already a default UMA deposit
     * account, this will override the existing default UMA deposit account. If there is no default
     * UMA deposit account, incoming UMA payments will be deposited into the primary internal
     * account for the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultUmaDepositAccount(): Boolean? =
        defaultUmaDepositAccount.getNullable("defaultUmaDepositAccount")

    /**
     * Your platform's identifier for the account in your system. This can be used to reference the
     * account by your own identifier.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformAccountId(): String? = platformAccountId.getNullable("platformAccountId")

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
         * Returns a mutable builder for constructing an instance of [ExternalAccountCreate].
         *
         * The following fields are required:
         * ```kotlin
         * .accountInfo()
         * .currency()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExternalAccountCreate]. */
    class Builder internal constructor() {

        private var accountInfo: JsonField<ExternalAccountInfoOneOf>? = null
        private var currency: JsonField<String>? = null
        private var customerId: JsonField<String> = JsonMissing.of()
        private var defaultUmaDepositAccount: JsonField<Boolean> = JsonMissing.of()
        private var platformAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountCreate: ExternalAccountCreate) = apply {
            accountInfo = externalAccountCreate.accountInfo
            currency = externalAccountCreate.currency
            customerId = externalAccountCreate.customerId
            defaultUmaDepositAccount = externalAccountCreate.defaultUmaDepositAccount
            platformAccountId = externalAccountCreate.platformAccountId
            additionalProperties = externalAccountCreate.additionalProperties.toMutableMap()
        }

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

        /**
         * The ID of the customer for whom to create the external account. If not provided, the
         * external account will be created on behalf of the platform.
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
         * Whether to set the external account as the default UMA deposit account. When set to true,
         * incoming payments to this customer's UMA address will be automatically deposited into
         * this external account. False if not provided. Note that only one external account can be
         * set as the default UMA deposit account for a customer, so if there is already a default
         * UMA deposit account, this will override the existing default UMA deposit account. If
         * there is no default UMA deposit account, incoming UMA payments will be deposited into the
         * primary internal account for the customer.
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

        /**
         * Your platform's identifier for the account in your system. This can be used to reference
         * the account by your own identifier.
         */
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
         * Returns an immutable instance of [ExternalAccountCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountInfo()
         * .currency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAccountCreate =
            ExternalAccountCreate(
                checkRequired("accountInfo", accountInfo),
                checkRequired("currency", currency),
                customerId,
                defaultUmaDepositAccount,
                platformAccountId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalAccountCreate = apply {
        if (validated) {
            return@apply
        }

        accountInfo().validate()
        currency()
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
        (accountInfo.asKnown()?.validity() ?: 0) +
            (if (currency.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (defaultUmaDepositAccount.asKnown() == null) 0 else 1) +
            (if (platformAccountId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountCreate &&
            accountInfo == other.accountInfo &&
            currency == other.currency &&
            customerId == other.customerId &&
            defaultUmaDepositAccount == other.defaultUmaDepositAccount &&
            platformAccountId == other.platformAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountInfo,
            currency,
            customerId,
            defaultUmaDepositAccount,
            platformAccountId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalAccountCreate{accountInfo=$accountInfo, currency=$currency, customerId=$customerId, defaultUmaDepositAccount=$defaultUmaDepositAccount, platformAccountId=$platformAccountId, additionalProperties=$additionalProperties}"
}
