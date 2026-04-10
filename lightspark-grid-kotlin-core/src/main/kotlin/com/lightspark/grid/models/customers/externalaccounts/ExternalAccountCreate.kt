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
    private val cryptoNetwork: JsonField<String>,
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
        @JsonProperty("cryptoNetwork")
        @ExcludeMissing
        cryptoNetwork: JsonField<String> = JsonMissing.of(),
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
        cryptoNetwork,
        customerId,
        defaultUmaDepositAccount,
        platformAccountId,
        mutableMapOf(),
    )

    /**
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     *
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
     * The blockchain network for this external account. Required when the account is a
     * cryptocurrency wallet. Specifies which network the wallet is on. Example values:
     * SOLANA_MAINNET, SOLANA_DEVNET, ETHEREUM_MAINNET, ETHEREUM_TESTNET, BASE_MAINNET,
     * BASE_TESTNET, SPARK_MAINNET, SPARK_TESTNET, LIGHTNING_MAINNET, LIGHTNING_REGTEST.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cryptoNetwork(): String? = cryptoNetwork.getNullable("cryptoNetwork")

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
     * Returns the raw JSON value of [cryptoNetwork].
     *
     * Unlike [cryptoNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cryptoNetwork")
    @ExcludeMissing
    fun _cryptoNetwork(): JsonField<String> = cryptoNetwork

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
        private var cryptoNetwork: JsonField<String> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var defaultUmaDepositAccount: JsonField<Boolean> = JsonMissing.of()
        private var platformAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountCreate: ExternalAccountCreate) = apply {
            accountInfo = externalAccountCreate.accountInfo
            currency = externalAccountCreate.currency
            cryptoNetwork = externalAccountCreate.cryptoNetwork
            customerId = externalAccountCreate.customerId
            defaultUmaDepositAccount = externalAccountCreate.defaultUmaDepositAccount
            platformAccountId = externalAccountCreate.platformAccountId
            additionalProperties = externalAccountCreate.additionalProperties.toMutableMap()
        }

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
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
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofBrlAccount(brlAccount)`.
         */
        fun accountInfo(brlAccount: BrlExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofBrlAccount(brlAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofCadAccount(cadAccount)`.
         */
        fun accountInfo(cadAccount: ExternalAccountInfoOneOf.CadAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofCadAccount(cadAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount)`.
         */
        fun accountInfo(dkkAccount: DkkExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofEurAccount(eurAccount)`.
         */
        fun accountInfo(eurAccount: ExternalAccountInfoOneOf.EurAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofEurAccount(eurAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)`.
         */
        fun accountInfo(gbpAccount: GbpExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount)`.
         */
        fun accountInfo(hkdAccount: HkdExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofIdrAccount(idrAccount)`.
         */
        fun accountInfo(idrAccount: IdrExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofIdrAccount(idrAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofInrAccount(inrAccount)`.
         */
        fun accountInfo(inrAccount: InrExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofInrAccount(inrAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofKesExternalAccountInfo(kesExternalAccountInfo)`.
         */
        fun accountInfo(kesExternalAccountInfo: ExternalAccountInfoOneOf.KesExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofKesExternalAccountInfo(kesExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofMwkExternalAccountInfo(mwkExternalAccountInfo)`.
         */
        fun accountInfo(mwkExternalAccountInfo: ExternalAccountInfoOneOf.MwkExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofMwkExternalAccountInfo(mwkExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount)`.
         */
        fun accountInfo(mxnAccount: MxnExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofMyrAccount(myrAccount)`.
         */
        fun accountInfo(myrAccount: MyrExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofMyrAccount(myrAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount)`.
         */
        fun accountInfo(ngnAccount: ExternalAccountInfoOneOf.NgnAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofPhpAccount(phpAccount)`.
         */
        fun accountInfo(phpAccount: PhpExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofPhpAccount(phpAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofRwfExternalAccountInfo(rwfExternalAccountInfo)`.
         */
        fun accountInfo(rwfExternalAccountInfo: ExternalAccountInfoOneOf.RwfExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofRwfExternalAccountInfo(rwfExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)`.
         */
        fun accountInfo(sgdAccount: SgdExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofThbAccount(thbAccount)`.
         */
        fun accountInfo(thbAccount: ThbExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofThbAccount(thbAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofTzsExternalAccountInfo(tzsExternalAccountInfo)`.
         */
        fun accountInfo(tzsExternalAccountInfo: ExternalAccountInfoOneOf.TzsExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofTzsExternalAccountInfo(tzsExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofUgxExternalAccountInfo(ugxExternalAccountInfo)`.
         */
        fun accountInfo(ugxExternalAccountInfo: ExternalAccountInfoOneOf.UgxExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofUgxExternalAccountInfo(ugxExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofUsdAccount(usdAccount)`.
         */
        fun accountInfo(usdAccount: UsdExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofUsdAccount(usdAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofVndAccount(vndAccount)`.
         */
        fun accountInfo(vndAccount: VndExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofVndAccount(vndAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofXofExternalAccountInfo(xofExternalAccountInfo)`.
         */
        fun accountInfo(xofExternalAccountInfo: ExternalAccountInfoOneOf.XofExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofXofExternalAccountInfo(xofExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofZarExternalAccountInfo(zarExternalAccountInfo)`.
         */
        fun accountInfo(zarExternalAccountInfo: ExternalAccountInfoOneOf.ZarExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofZarExternalAccountInfo(zarExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofZmwExternalAccountInfo(zmwExternalAccountInfo)`.
         */
        fun accountInfo(zmwExternalAccountInfo: ExternalAccountInfoOneOf.ZmwExternalAccountInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofZmwExternalAccountInfo(zmwExternalAccountInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofSparkWalletInfo(sparkWalletInfo)`.
         */
        fun accountInfo(sparkWalletInfo: SparkWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofSparkWalletInfo(sparkWalletInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofLightningWalletInfo(lightningWalletInfo)`.
         */
        fun accountInfo(lightningWalletInfo: LightningWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofLightningWalletInfo(lightningWalletInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofSolanaWalletInfo(solanaWalletInfo)`.
         */
        fun accountInfo(solanaWalletInfo: SolanaWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofSolanaWalletInfo(solanaWalletInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofTronWalletInfo(tronWalletInfo)`.
         */
        fun accountInfo(tronWalletInfo: TronWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofTronWalletInfo(tronWalletInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofPolygonWalletInfo(polygonWalletInfo)`.
         */
        fun accountInfo(polygonWalletInfo: PolygonWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofPolygonWalletInfo(polygonWalletInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofBaseWalletInfo(baseWalletInfo)`.
         */
        fun accountInfo(baseWalletInfo: BaseWalletInfo) =
            accountInfo(ExternalAccountInfoOneOf.ofBaseWalletInfo(baseWalletInfo))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofEthereumWallet(ethereumWallet)`.
         */
        fun accountInfo(ethereumWallet: ExternalAccountInfoOneOf.EthereumWallet) =
            accountInfo(ExternalAccountInfoOneOf.ofEthereumWallet(ethereumWallet))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * ExternalAccountInfoOneOf.EthereumWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun ethereumWalletAccountInfo(address: String) =
            accountInfo(ExternalAccountInfoOneOf.EthereumWallet.builder().address(address).build())

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofAedAccount(aedAccount)`.
         */
        fun accountInfo(aedAccount: ExternalAccountInfoOneOf.AedAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofAedAccount(aedAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofBwpAccount(bwpAccount)`.
         */
        fun accountInfo(bwpAccount: ExternalAccountInfoOneOf.BwpAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofBwpAccount(bwpAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofXafAccount(xafAccount)`.
         */
        fun accountInfo(xafAccount: ExternalAccountInfoOneOf.XafAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofXafAccount(xafAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofBdtAccount(bdtAccount)`.
         */
        fun accountInfo(bdtAccount: ExternalAccountInfoOneOf.BdtAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofBdtAccount(bdtAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofCopAccount(copAccount)`.
         */
        fun accountInfo(copAccount: ExternalAccountInfoOneOf.CopAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofCopAccount(copAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofEgpAccount(egpAccount)`.
         */
        fun accountInfo(egpAccount: ExternalAccountInfoOneOf.EgpAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofEgpAccount(egpAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofGhsAccount(ghsAccount)`.
         */
        fun accountInfo(ghsAccount: ExternalAccountInfoOneOf.GhsAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofGhsAccount(ghsAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofGtqAccount(gtqAccount)`.
         */
        fun accountInfo(gtqAccount: ExternalAccountInfoOneOf.GtqAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofGtqAccount(gtqAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofHtgAccount(htgAccount)`.
         */
        fun accountInfo(htgAccount: ExternalAccountInfoOneOf.HtgAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofHtgAccount(htgAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofJmdAccount(jmdAccount)`.
         */
        fun accountInfo(jmdAccount: ExternalAccountInfoOneOf.JmdAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofJmdAccount(jmdAccount))

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofPkrAccount(pkrAccount)`.
         */
        fun accountInfo(pkrAccount: ExternalAccountInfoOneOf.PkrAccount) =
            accountInfo(ExternalAccountInfoOneOf.ofPkrAccount(pkrAccount))

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
         * The blockchain network for this external account. Required when the account is a
         * cryptocurrency wallet. Specifies which network the wallet is on. Example values:
         * SOLANA_MAINNET, SOLANA_DEVNET, ETHEREUM_MAINNET, ETHEREUM_TESTNET, BASE_MAINNET,
         * BASE_TESTNET, SPARK_MAINNET, SPARK_TESTNET, LIGHTNING_MAINNET, LIGHTNING_REGTEST.
         */
        fun cryptoNetwork(cryptoNetwork: String) = cryptoNetwork(JsonField.of(cryptoNetwork))

        /**
         * Sets [Builder.cryptoNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cryptoNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cryptoNetwork(cryptoNetwork: JsonField<String>) = apply {
            this.cryptoNetwork = cryptoNetwork
        }

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
                cryptoNetwork,
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
        cryptoNetwork()
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
            (if (cryptoNetwork.asKnown() == null) 0 else 1) +
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
            cryptoNetwork == other.cryptoNetwork &&
            customerId == other.customerId &&
            defaultUmaDepositAccount == other.defaultUmaDepositAccount &&
            platformAccountId == other.platformAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountInfo,
            currency,
            cryptoNetwork,
            customerId,
            defaultUmaDepositAccount,
            platformAccountId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalAccountCreate{accountInfo=$accountInfo, currency=$currency, cryptoNetwork=$cryptoNetwork, customerId=$customerId, defaultUmaDepositAccount=$defaultUmaDepositAccount, platformAccountId=$platformAccountId, additionalProperties=$additionalProperties}"
}
