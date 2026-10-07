// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MxnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import java.util.Collections
import java.util.Objects

class PaymentInstructions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountOrWalletInfo: JsonField<AccountOrWalletInfo>,
    private val instructionsNotes: JsonField<String>,
    private val isPlatformAccount: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountOrWalletInfo")
        @ExcludeMissing
        accountOrWalletInfo: JsonField<AccountOrWalletInfo> = JsonMissing.of(),
        @JsonProperty("instructionsNotes")
        @ExcludeMissing
        instructionsNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isPlatformAccount")
        @ExcludeMissing
        isPlatformAccount: JsonField<Boolean> = JsonMissing.of(),
    ) : this(accountOrWalletInfo, instructionsNotes, isPlatformAccount, mutableMapOf())

    /**
     * Where to send the funds. Quotes can carry any of these types. Internal accounts return only
     * `USD_ACCOUNT`, `EUR_ACCOUNT`, `SWIFT_ACCOUNT`, and the network wallet types; MXN, BRL, COP,
     * ARS, Lightning, and Bitcoin L1 instructions appear only on real-time funded quotes.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountOrWalletInfo(): AccountOrWalletInfo =
        accountOrWalletInfo.getRequired("accountOrWalletInfo")

    /**
     * Additional human-readable instructions for making the payment
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun instructionsNotes(): String? = instructionsNotes.getNullable("instructionsNotes")

    /**
     * Indicates whether the account is a platform account or a customer account.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isPlatformAccount(): Boolean? = isPlatformAccount.getNullable("isPlatformAccount")

    /**
     * Returns the raw JSON value of [accountOrWalletInfo].
     *
     * Unlike [accountOrWalletInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountOrWalletInfo")
    @ExcludeMissing
    fun _accountOrWalletInfo(): JsonField<AccountOrWalletInfo> = accountOrWalletInfo

    /**
     * Returns the raw JSON value of [instructionsNotes].
     *
     * Unlike [instructionsNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("instructionsNotes")
    @ExcludeMissing
    fun _instructionsNotes(): JsonField<String> = instructionsNotes

    /**
     * Returns the raw JSON value of [isPlatformAccount].
     *
     * Unlike [isPlatformAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isPlatformAccount")
    @ExcludeMissing
    fun _isPlatformAccount(): JsonField<Boolean> = isPlatformAccount

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
         * Returns a mutable builder for constructing an instance of [PaymentInstructions].
         *
         * The following fields are required:
         * ```kotlin
         * .accountOrWalletInfo()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentInstructions]. */
    class Builder internal constructor() {

        private var accountOrWalletInfo: JsonField<AccountOrWalletInfo>? = null
        private var instructionsNotes: JsonField<String> = JsonMissing.of()
        private var isPlatformAccount: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentInstructions: PaymentInstructions) = apply {
            accountOrWalletInfo = paymentInstructions.accountOrWalletInfo
            instructionsNotes = paymentInstructions.instructionsNotes
            isPlatformAccount = paymentInstructions.isPlatformAccount
            additionalProperties = paymentInstructions.additionalProperties.toMutableMap()
        }

        /**
         * Where to send the funds. Quotes can carry any of these types. Internal accounts return
         * only `USD_ACCOUNT`, `EUR_ACCOUNT`, `SWIFT_ACCOUNT`, and the network wallet types; MXN,
         * BRL, COP, ARS, Lightning, and Bitcoin L1 instructions appear only on real-time funded
         * quotes.
         */
        fun accountOrWalletInfo(accountOrWalletInfo: AccountOrWalletInfo) =
            accountOrWalletInfo(JsonField.of(accountOrWalletInfo))

        /**
         * Sets [Builder.accountOrWalletInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountOrWalletInfo] with a well-typed
         * [AccountOrWalletInfo] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accountOrWalletInfo(accountOrWalletInfo: JsonField<AccountOrWalletInfo>) = apply {
            this.accountOrWalletInfo = accountOrWalletInfo
        }

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofUsdAccount(usdAccount)`.
         */
        fun accountOrWalletInfo(usdAccount: AccountOrWalletInfo.UsdAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofUsdAccount(usdAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofEurAccount(eurAccount)`.
         */
        fun accountOrWalletInfo(eurAccount: AccountOrWalletInfo.EurAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofEurAccount(eurAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofSwiftAccount(swiftAccount)`.
         */
        fun accountOrWalletInfo(swiftAccount: AccountOrWalletInfo.SwiftAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofSwiftAccount(swiftAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofMxnAccount(mxnAccount)`.
         */
        fun accountOrWalletInfo(mxnAccount: AccountOrWalletInfo.MxnAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofMxnAccount(mxnAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofBrlAccount(brlAccount)`.
         */
        fun accountOrWalletInfo(brlAccount: AccountOrWalletInfo.BrlAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofBrlAccount(brlAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.BrlAccount.builder()
         *     .accountType(PaymentInstructions.AccountOrWalletInfo.BrlAccount.AccountType.BRL_ACCOUNT)
         *     .qrCode(qrCode)
         *     .build()
         * ```
         */
        fun brlAccountAccountOrWalletInfo(qrCode: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.BrlAccount.builder()
                    .accountType(
                        PaymentInstructions.AccountOrWalletInfo.BrlAccount.AccountType.BRL_ACCOUNT
                    )
                    .qrCode(qrCode)
                    .build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofCopAccount(copAccount)`.
         */
        fun accountOrWalletInfo(copAccount: AccountOrWalletInfo.CopAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofCopAccount(copAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.CopAccount.builder()
         *     .accountType(PaymentInstructions.AccountOrWalletInfo.CopAccount.AccountType.COP_ACCOUNT)
         *     .paymentUrl(paymentUrl)
         *     .build()
         * ```
         */
        fun copAccountAccountOrWalletInfo(paymentUrl: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.CopAccount.builder()
                    .accountType(
                        PaymentInstructions.AccountOrWalletInfo.CopAccount.AccountType.COP_ACCOUNT
                    )
                    .paymentUrl(paymentUrl)
                    .build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofArsAccount(arsAccount)`.
         */
        fun accountOrWalletInfo(arsAccount: AccountOrWalletInfo.ArsAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofArsAccount(arsAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.ArsAccount.builder()
         *     .accountType(PaymentInstructions.AccountOrWalletInfo.ArsAccount.AccountType.ARS_ACCOUNT)
         *     .accountNumber(accountNumber)
         *     .build()
         * ```
         */
        fun arsAccountAccountOrWalletInfo(accountNumber: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.ArsAccount.builder()
                    .accountType(
                        PaymentInstructions.AccountOrWalletInfo.ArsAccount.AccountType.ARS_ACCOUNT
                    )
                    .accountNumber(accountNumber)
                    .build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofSparkWallet(sparkWallet)`.
         */
        fun accountOrWalletInfo(sparkWallet: AccountOrWalletInfo.SparkWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofSparkWallet(sparkWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofLightning(lightning)`.
         */
        fun accountOrWalletInfo(lightning: AccountOrWalletInfo.Lightning) =
            accountOrWalletInfo(AccountOrWalletInfo.ofLightning(lightning))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.Lightning.builder()
         *     .accountType(PaymentInstructions.AccountOrWalletInfo.Lightning.AccountType.LIGHTNING)
         *     .invoice(invoice)
         *     .build()
         * ```
         */
        fun lightningAccountOrWalletInfo(invoice: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.Lightning.builder()
                    .accountType(
                        PaymentInstructions.AccountOrWalletInfo.Lightning.AccountType.LIGHTNING
                    )
                    .invoice(invoice)
                    .build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofBitcoinL1(bitcoinL1)`.
         */
        fun accountOrWalletInfo(bitcoinL1: AccountOrWalletInfo.BitcoinL1) =
            accountOrWalletInfo(AccountOrWalletInfo.ofBitcoinL1(bitcoinL1))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.BitcoinL1.builder()
         *     .accountType(PaymentInstructions.AccountOrWalletInfo.BitcoinL1.AccountType.BITCOIN_L1)
         *     .address(address)
         *     .build()
         * ```
         */
        fun bitcoinL1AccountOrWalletInfo(address: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.BitcoinL1.builder()
                    .accountType(
                        PaymentInstructions.AccountOrWalletInfo.BitcoinL1.AccountType.BITCOIN_L1
                    )
                    .address(address)
                    .build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofSolanaWallet(solanaWallet)`.
         */
        fun accountOrWalletInfo(solanaWallet: AccountOrWalletInfo.SolanaWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofSolanaWallet(solanaWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.SolanaWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun solanaWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(AccountOrWalletInfo.SolanaWallet.builder().address(address).build())

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofEthereumWallet(ethereumWallet)`.
         */
        fun accountOrWalletInfo(ethereumWallet: AccountOrWalletInfo.EthereumWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofEthereumWallet(ethereumWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.EthereumWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun ethereumWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.EthereumWallet.builder().address(address).build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofBaseWallet(baseWallet)`.
         */
        fun accountOrWalletInfo(baseWallet: AccountOrWalletInfo.BaseWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofBaseWallet(baseWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.BaseWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun baseWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(AccountOrWalletInfo.BaseWallet.builder().address(address).build())

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPolygonWallet(polygonWallet)`.
         */
        fun accountOrWalletInfo(polygonWallet: AccountOrWalletInfo.PolygonWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPolygonWallet(polygonWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.PolygonWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun polygonWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.PolygonWallet.builder().address(address).build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofArbitrumWallet(arbitrumWallet)`.
         */
        fun accountOrWalletInfo(arbitrumWallet: AccountOrWalletInfo.ArbitrumWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofArbitrumWallet(arbitrumWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.ArbitrumWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun arbitrumWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.ArbitrumWallet.builder().address(address).build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofTronWallet(tronWallet)`.
         */
        fun accountOrWalletInfo(tronWallet: AccountOrWalletInfo.TronWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofTronWallet(tronWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.TronWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun tronWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(AccountOrWalletInfo.TronWallet.builder().address(address).build())

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPlasmaWallet(plasmaWallet)`.
         */
        fun accountOrWalletInfo(plasmaWallet: AccountOrWalletInfo.PlasmaWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPlasmaWallet(plasmaWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.PlasmaWallet.builder()
         *     .address(address)
         *     .build()
         * ```
         */
        fun plasmaWalletAccountOrWalletInfo(address: String) =
            accountOrWalletInfo(AccountOrWalletInfo.PlasmaWallet.builder().address(address).build())

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofEmbeddedWallet(embeddedWallet)`.
         */
        fun accountOrWalletInfo(embeddedWallet: AccountOrWalletInfo.EmbeddedWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofEmbeddedWallet(embeddedWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.EmbeddedWallet.builder()
         *     .payloadToSign(payloadToSign)
         *     .build()
         * ```
         */
        fun embeddedWalletAccountOrWalletInfo(payloadToSign: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.EmbeddedWallet.builder().payloadToSign(payloadToSign).build()
            )

        /** Additional human-readable instructions for making the payment */
        fun instructionsNotes(instructionsNotes: String) =
            instructionsNotes(JsonField.of(instructionsNotes))

        /**
         * Sets [Builder.instructionsNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructionsNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instructionsNotes(instructionsNotes: JsonField<String>) = apply {
            this.instructionsNotes = instructionsNotes
        }

        /** Indicates whether the account is a platform account or a customer account. */
        fun isPlatformAccount(isPlatformAccount: Boolean) =
            isPlatformAccount(JsonField.of(isPlatformAccount))

        /**
         * Sets [Builder.isPlatformAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPlatformAccount] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isPlatformAccount(isPlatformAccount: JsonField<Boolean>) = apply {
            this.isPlatformAccount = isPlatformAccount
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
         * Returns an immutable instance of [PaymentInstructions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountOrWalletInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentInstructions =
            PaymentInstructions(
                checkRequired("accountOrWalletInfo", accountOrWalletInfo),
                instructionsNotes,
                isPlatformAccount,
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
    fun validate(): PaymentInstructions = apply {
        if (validated) {
            return@apply
        }

        accountOrWalletInfo().validate()
        instructionsNotes()
        isPlatformAccount()
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
        (accountOrWalletInfo.asKnown()?.validity() ?: 0) +
            (if (instructionsNotes.asKnown() == null) 0 else 1) +
            (if (isPlatformAccount.asKnown() == null) 0 else 1)

    /**
     * Where to send the funds. Quotes can carry any of these types. Internal accounts return only
     * `USD_ACCOUNT`, `EUR_ACCOUNT`, `SWIFT_ACCOUNT`, and the network wallet types; MXN, BRL, COP,
     * ARS, Lightning, and Bitcoin L1 instructions appear only on real-time funded quotes.
     */
    @JsonDeserialize(using = AccountOrWalletInfo.Deserializer::class)
    @JsonSerialize(using = AccountOrWalletInfo.Serializer::class)
    class AccountOrWalletInfo
    private constructor(
        private val usdAccount: UsdAccount? = null,
        private val eurAccount: EurAccount? = null,
        private val swiftAccount: SwiftAccount? = null,
        private val mxnAccount: MxnAccount? = null,
        private val brlAccount: BrlAccount? = null,
        private val copAccount: CopAccount? = null,
        private val arsAccount: ArsAccount? = null,
        private val sparkWallet: SparkWallet? = null,
        private val lightning: Lightning? = null,
        private val bitcoinL1: BitcoinL1? = null,
        private val solanaWallet: SolanaWallet? = null,
        private val ethereumWallet: EthereumWallet? = null,
        private val baseWallet: BaseWallet? = null,
        private val polygonWallet: PolygonWallet? = null,
        private val arbitrumWallet: ArbitrumWallet? = null,
        private val tronWallet: TronWallet? = null,
        private val plasmaWallet: PlasmaWallet? = null,
        private val embeddedWallet: EmbeddedWallet? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usdAccount(): UsdAccount? = usdAccount

        fun eurAccount(): EurAccount? = eurAccount

        /**
         * At least one of accountNumber or iban is always present: IBAN-only corridors (e.g. BR,
         * GB) use iban, other corridors use accountNumber, and both appear when the bank exposes
         * both identifiers for the same account.
         */
        fun swiftAccount(): SwiftAccount? = swiftAccount

        fun mxnAccount(): MxnAccount? = mxnAccount

        fun brlAccount(): BrlAccount? = brlAccount

        fun copAccount(): CopAccount? = copAccount

        fun arsAccount(): ArsAccount? = arsAccount

        fun sparkWallet(): SparkWallet? = sparkWallet

        fun lightning(): Lightning? = lightning

        fun bitcoinL1(): BitcoinL1? = bitcoinL1

        fun solanaWallet(): SolanaWallet? = solanaWallet

        fun ethereumWallet(): EthereumWallet? = ethereumWallet

        fun baseWallet(): BaseWallet? = baseWallet

        fun polygonWallet(): PolygonWallet? = polygonWallet

        fun arbitrumWallet(): ArbitrumWallet? = arbitrumWallet

        fun tronWallet(): TronWallet? = tronWallet

        fun plasmaWallet(): PlasmaWallet? = plasmaWallet

        fun embeddedWallet(): EmbeddedWallet? = embeddedWallet

        fun isUsdAccount(): Boolean = usdAccount != null

        fun isEurAccount(): Boolean = eurAccount != null

        fun isSwiftAccount(): Boolean = swiftAccount != null

        fun isMxnAccount(): Boolean = mxnAccount != null

        fun isBrlAccount(): Boolean = brlAccount != null

        fun isCopAccount(): Boolean = copAccount != null

        fun isArsAccount(): Boolean = arsAccount != null

        fun isSparkWallet(): Boolean = sparkWallet != null

        fun isLightning(): Boolean = lightning != null

        fun isBitcoinL1(): Boolean = bitcoinL1 != null

        fun isSolanaWallet(): Boolean = solanaWallet != null

        fun isEthereumWallet(): Boolean = ethereumWallet != null

        fun isBaseWallet(): Boolean = baseWallet != null

        fun isPolygonWallet(): Boolean = polygonWallet != null

        fun isArbitrumWallet(): Boolean = arbitrumWallet != null

        fun isTronWallet(): Boolean = tronWallet != null

        fun isPlasmaWallet(): Boolean = plasmaWallet != null

        fun isEmbeddedWallet(): Boolean = embeddedWallet != null

        fun asUsdAccount(): UsdAccount = usdAccount.getOrThrow("usdAccount")

        fun asEurAccount(): EurAccount = eurAccount.getOrThrow("eurAccount")

        /**
         * At least one of accountNumber or iban is always present: IBAN-only corridors (e.g. BR,
         * GB) use iban, other corridors use accountNumber, and both appear when the bank exposes
         * both identifiers for the same account.
         */
        fun asSwiftAccount(): SwiftAccount = swiftAccount.getOrThrow("swiftAccount")

        fun asMxnAccount(): MxnAccount = mxnAccount.getOrThrow("mxnAccount")

        fun asBrlAccount(): BrlAccount = brlAccount.getOrThrow("brlAccount")

        fun asCopAccount(): CopAccount = copAccount.getOrThrow("copAccount")

        fun asArsAccount(): ArsAccount = arsAccount.getOrThrow("arsAccount")

        fun asSparkWallet(): SparkWallet = sparkWallet.getOrThrow("sparkWallet")

        fun asLightning(): Lightning = lightning.getOrThrow("lightning")

        fun asBitcoinL1(): BitcoinL1 = bitcoinL1.getOrThrow("bitcoinL1")

        fun asSolanaWallet(): SolanaWallet = solanaWallet.getOrThrow("solanaWallet")

        fun asEthereumWallet(): EthereumWallet = ethereumWallet.getOrThrow("ethereumWallet")

        fun asBaseWallet(): BaseWallet = baseWallet.getOrThrow("baseWallet")

        fun asPolygonWallet(): PolygonWallet = polygonWallet.getOrThrow("polygonWallet")

        fun asArbitrumWallet(): ArbitrumWallet = arbitrumWallet.getOrThrow("arbitrumWallet")

        fun asTronWallet(): TronWallet = tronWallet.getOrThrow("tronWallet")

        fun asPlasmaWallet(): PlasmaWallet = plasmaWallet.getOrThrow("plasmaWallet")

        fun asEmbeddedWallet(): EmbeddedWallet = embeddedWallet.getOrThrow("embeddedWallet")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.lightspark.grid.core.JsonValue
         *
         * val result: String? = accountOrWalletInfo.accept(object : AccountOrWalletInfo.Visitor<String?> {
         *     override fun visitUsdAccount(usdAccount: UsdAccount): String? = usdAccount.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usdAccount != null -> visitor.visitUsdAccount(usdAccount)
                eurAccount != null -> visitor.visitEurAccount(eurAccount)
                swiftAccount != null -> visitor.visitSwiftAccount(swiftAccount)
                mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
                brlAccount != null -> visitor.visitBrlAccount(brlAccount)
                copAccount != null -> visitor.visitCopAccount(copAccount)
                arsAccount != null -> visitor.visitArsAccount(arsAccount)
                sparkWallet != null -> visitor.visitSparkWallet(sparkWallet)
                lightning != null -> visitor.visitLightning(lightning)
                bitcoinL1 != null -> visitor.visitBitcoinL1(bitcoinL1)
                solanaWallet != null -> visitor.visitSolanaWallet(solanaWallet)
                ethereumWallet != null -> visitor.visitEthereumWallet(ethereumWallet)
                baseWallet != null -> visitor.visitBaseWallet(baseWallet)
                polygonWallet != null -> visitor.visitPolygonWallet(polygonWallet)
                arbitrumWallet != null -> visitor.visitArbitrumWallet(arbitrumWallet)
                tronWallet != null -> visitor.visitTronWallet(tronWallet)
                plasmaWallet != null -> visitor.visitPlasmaWallet(plasmaWallet)
                embeddedWallet != null -> visitor.visitEmbeddedWallet(embeddedWallet)
                else -> visitor.unknown(_json)
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
        fun validate(): AccountOrWalletInfo = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUsdAccount(usdAccount: UsdAccount) {
                        usdAccount.validate()
                    }

                    override fun visitEurAccount(eurAccount: EurAccount) {
                        eurAccount.validate()
                    }

                    override fun visitSwiftAccount(swiftAccount: SwiftAccount) {
                        swiftAccount.validate()
                    }

                    override fun visitMxnAccount(mxnAccount: MxnAccount) {
                        mxnAccount.validate()
                    }

                    override fun visitBrlAccount(brlAccount: BrlAccount) {
                        brlAccount.validate()
                    }

                    override fun visitCopAccount(copAccount: CopAccount) {
                        copAccount.validate()
                    }

                    override fun visitArsAccount(arsAccount: ArsAccount) {
                        arsAccount.validate()
                    }

                    override fun visitSparkWallet(sparkWallet: SparkWallet) {
                        sparkWallet.validate()
                    }

                    override fun visitLightning(lightning: Lightning) {
                        lightning.validate()
                    }

                    override fun visitBitcoinL1(bitcoinL1: BitcoinL1) {
                        bitcoinL1.validate()
                    }

                    override fun visitSolanaWallet(solanaWallet: SolanaWallet) {
                        solanaWallet.validate()
                    }

                    override fun visitEthereumWallet(ethereumWallet: EthereumWallet) {
                        ethereumWallet.validate()
                    }

                    override fun visitBaseWallet(baseWallet: BaseWallet) {
                        baseWallet.validate()
                    }

                    override fun visitPolygonWallet(polygonWallet: PolygonWallet) {
                        polygonWallet.validate()
                    }

                    override fun visitArbitrumWallet(arbitrumWallet: ArbitrumWallet) {
                        arbitrumWallet.validate()
                    }

                    override fun visitTronWallet(tronWallet: TronWallet) {
                        tronWallet.validate()
                    }

                    override fun visitPlasmaWallet(plasmaWallet: PlasmaWallet) {
                        plasmaWallet.validate()
                    }

                    override fun visitEmbeddedWallet(embeddedWallet: EmbeddedWallet) {
                        embeddedWallet.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUsdAccount(usdAccount: UsdAccount) = usdAccount.validity()

                    override fun visitEurAccount(eurAccount: EurAccount) = eurAccount.validity()

                    override fun visitSwiftAccount(swiftAccount: SwiftAccount) =
                        swiftAccount.validity()

                    override fun visitMxnAccount(mxnAccount: MxnAccount) = mxnAccount.validity()

                    override fun visitBrlAccount(brlAccount: BrlAccount) = brlAccount.validity()

                    override fun visitCopAccount(copAccount: CopAccount) = copAccount.validity()

                    override fun visitArsAccount(arsAccount: ArsAccount) = arsAccount.validity()

                    override fun visitSparkWallet(sparkWallet: SparkWallet) = sparkWallet.validity()

                    override fun visitLightning(lightning: Lightning) = lightning.validity()

                    override fun visitBitcoinL1(bitcoinL1: BitcoinL1) = bitcoinL1.validity()

                    override fun visitSolanaWallet(solanaWallet: SolanaWallet) =
                        solanaWallet.validity()

                    override fun visitEthereumWallet(ethereumWallet: EthereumWallet) =
                        ethereumWallet.validity()

                    override fun visitBaseWallet(baseWallet: BaseWallet) = baseWallet.validity()

                    override fun visitPolygonWallet(polygonWallet: PolygonWallet) =
                        polygonWallet.validity()

                    override fun visitArbitrumWallet(arbitrumWallet: ArbitrumWallet) =
                        arbitrumWallet.validity()

                    override fun visitTronWallet(tronWallet: TronWallet) = tronWallet.validity()

                    override fun visitPlasmaWallet(plasmaWallet: PlasmaWallet) =
                        plasmaWallet.validity()

                    override fun visitEmbeddedWallet(embeddedWallet: EmbeddedWallet) =
                        embeddedWallet.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountOrWalletInfo &&
                usdAccount == other.usdAccount &&
                eurAccount == other.eurAccount &&
                swiftAccount == other.swiftAccount &&
                mxnAccount == other.mxnAccount &&
                brlAccount == other.brlAccount &&
                copAccount == other.copAccount &&
                arsAccount == other.arsAccount &&
                sparkWallet == other.sparkWallet &&
                lightning == other.lightning &&
                bitcoinL1 == other.bitcoinL1 &&
                solanaWallet == other.solanaWallet &&
                ethereumWallet == other.ethereumWallet &&
                baseWallet == other.baseWallet &&
                polygonWallet == other.polygonWallet &&
                arbitrumWallet == other.arbitrumWallet &&
                tronWallet == other.tronWallet &&
                plasmaWallet == other.plasmaWallet &&
                embeddedWallet == other.embeddedWallet
        }

        override fun hashCode(): Int =
            Objects.hash(
                usdAccount,
                eurAccount,
                swiftAccount,
                mxnAccount,
                brlAccount,
                copAccount,
                arsAccount,
                sparkWallet,
                lightning,
                bitcoinL1,
                solanaWallet,
                ethereumWallet,
                baseWallet,
                polygonWallet,
                arbitrumWallet,
                tronWallet,
                plasmaWallet,
                embeddedWallet,
            )

        override fun toString(): String =
            when {
                usdAccount != null -> "AccountOrWalletInfo{usdAccount=$usdAccount}"
                eurAccount != null -> "AccountOrWalletInfo{eurAccount=$eurAccount}"
                swiftAccount != null -> "AccountOrWalletInfo{swiftAccount=$swiftAccount}"
                mxnAccount != null -> "AccountOrWalletInfo{mxnAccount=$mxnAccount}"
                brlAccount != null -> "AccountOrWalletInfo{brlAccount=$brlAccount}"
                copAccount != null -> "AccountOrWalletInfo{copAccount=$copAccount}"
                arsAccount != null -> "AccountOrWalletInfo{arsAccount=$arsAccount}"
                sparkWallet != null -> "AccountOrWalletInfo{sparkWallet=$sparkWallet}"
                lightning != null -> "AccountOrWalletInfo{lightning=$lightning}"
                bitcoinL1 != null -> "AccountOrWalletInfo{bitcoinL1=$bitcoinL1}"
                solanaWallet != null -> "AccountOrWalletInfo{solanaWallet=$solanaWallet}"
                ethereumWallet != null -> "AccountOrWalletInfo{ethereumWallet=$ethereumWallet}"
                baseWallet != null -> "AccountOrWalletInfo{baseWallet=$baseWallet}"
                polygonWallet != null -> "AccountOrWalletInfo{polygonWallet=$polygonWallet}"
                arbitrumWallet != null -> "AccountOrWalletInfo{arbitrumWallet=$arbitrumWallet}"
                tronWallet != null -> "AccountOrWalletInfo{tronWallet=$tronWallet}"
                plasmaWallet != null -> "AccountOrWalletInfo{plasmaWallet=$plasmaWallet}"
                embeddedWallet != null -> "AccountOrWalletInfo{embeddedWallet=$embeddedWallet}"
                _json != null -> "AccountOrWalletInfo{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
            }

        companion object {

            fun ofUsdAccount(usdAccount: UsdAccount) = AccountOrWalletInfo(usdAccount = usdAccount)

            fun ofEurAccount(eurAccount: EurAccount) = AccountOrWalletInfo(eurAccount = eurAccount)

            /**
             * At least one of accountNumber or iban is always present: IBAN-only corridors (e.g.
             * BR, GB) use iban, other corridors use accountNumber, and both appear when the bank
             * exposes both identifiers for the same account.
             */
            fun ofSwiftAccount(swiftAccount: SwiftAccount) =
                AccountOrWalletInfo(swiftAccount = swiftAccount)

            fun ofMxnAccount(mxnAccount: MxnAccount) = AccountOrWalletInfo(mxnAccount = mxnAccount)

            fun ofBrlAccount(brlAccount: BrlAccount) = AccountOrWalletInfo(brlAccount = brlAccount)

            fun ofCopAccount(copAccount: CopAccount) = AccountOrWalletInfo(copAccount = copAccount)

            fun ofArsAccount(arsAccount: ArsAccount) = AccountOrWalletInfo(arsAccount = arsAccount)

            fun ofSparkWallet(sparkWallet: SparkWallet) =
                AccountOrWalletInfo(sparkWallet = sparkWallet)

            fun ofLightning(lightning: Lightning) = AccountOrWalletInfo(lightning = lightning)

            fun ofBitcoinL1(bitcoinL1: BitcoinL1) = AccountOrWalletInfo(bitcoinL1 = bitcoinL1)

            fun ofSolanaWallet(solanaWallet: SolanaWallet) =
                AccountOrWalletInfo(solanaWallet = solanaWallet)

            fun ofEthereumWallet(ethereumWallet: EthereumWallet) =
                AccountOrWalletInfo(ethereumWallet = ethereumWallet)

            fun ofBaseWallet(baseWallet: BaseWallet) = AccountOrWalletInfo(baseWallet = baseWallet)

            fun ofPolygonWallet(polygonWallet: PolygonWallet) =
                AccountOrWalletInfo(polygonWallet = polygonWallet)

            fun ofArbitrumWallet(arbitrumWallet: ArbitrumWallet) =
                AccountOrWalletInfo(arbitrumWallet = arbitrumWallet)

            fun ofTronWallet(tronWallet: TronWallet) = AccountOrWalletInfo(tronWallet = tronWallet)

            fun ofPlasmaWallet(plasmaWallet: PlasmaWallet) =
                AccountOrWalletInfo(plasmaWallet = plasmaWallet)

            fun ofEmbeddedWallet(embeddedWallet: EmbeddedWallet) =
                AccountOrWalletInfo(embeddedWallet = embeddedWallet)
        }

        /**
         * An interface that defines how to map each variant of [AccountOrWalletInfo] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitUsdAccount(usdAccount: UsdAccount): T

            fun visitEurAccount(eurAccount: EurAccount): T

            /**
             * At least one of accountNumber or iban is always present: IBAN-only corridors (e.g.
             * BR, GB) use iban, other corridors use accountNumber, and both appear when the bank
             * exposes both identifiers for the same account.
             */
            fun visitSwiftAccount(swiftAccount: SwiftAccount): T

            fun visitMxnAccount(mxnAccount: MxnAccount): T

            fun visitBrlAccount(brlAccount: BrlAccount): T

            fun visitCopAccount(copAccount: CopAccount): T

            fun visitArsAccount(arsAccount: ArsAccount): T

            fun visitSparkWallet(sparkWallet: SparkWallet): T

            fun visitLightning(lightning: Lightning): T

            fun visitBitcoinL1(bitcoinL1: BitcoinL1): T

            fun visitSolanaWallet(solanaWallet: SolanaWallet): T

            fun visitEthereumWallet(ethereumWallet: EthereumWallet): T

            fun visitBaseWallet(baseWallet: BaseWallet): T

            fun visitPolygonWallet(polygonWallet: PolygonWallet): T

            fun visitArbitrumWallet(arbitrumWallet: ArbitrumWallet): T

            fun visitTronWallet(tronWallet: TronWallet): T

            fun visitPlasmaWallet(plasmaWallet: PlasmaWallet): T

            fun visitEmbeddedWallet(embeddedWallet: EmbeddedWallet): T

            /**
             * Maps an unknown variant of [AccountOrWalletInfo] to a value of type [T].
             *
             * An instance of [AccountOrWalletInfo] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown AccountOrWalletInfo: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<AccountOrWalletInfo>(AccountOrWalletInfo::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AccountOrWalletInfo {
                val json = JsonValue.fromJsonNode(node)
                val accountType = json.asObject()?.get("accountType")?.asString()

                when (accountType) {
                    "USD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<UsdAccount>())?.let {
                            AccountOrWalletInfo(usdAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "EUR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EurAccount>())?.let {
                            AccountOrWalletInfo(eurAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "SWIFT_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SwiftAccount>())?.let {
                            AccountOrWalletInfo(swiftAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "MXN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MxnAccount>())?.let {
                            AccountOrWalletInfo(mxnAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "BRL_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BrlAccount>())?.let {
                            AccountOrWalletInfo(brlAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "COP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<CopAccount>())?.let {
                            AccountOrWalletInfo(copAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "ARS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ArsAccount>())?.let {
                            AccountOrWalletInfo(arsAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "SPARK_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<SparkWallet>())?.let {
                            AccountOrWalletInfo(sparkWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "LIGHTNING" -> {
                        return tryDeserialize(node, jacksonTypeRef<Lightning>())?.let {
                            AccountOrWalletInfo(lightning = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "BITCOIN_L1" -> {
                        return tryDeserialize(node, jacksonTypeRef<BitcoinL1>())?.let {
                            AccountOrWalletInfo(bitcoinL1 = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "SOLANA_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<SolanaWallet>())?.let {
                            AccountOrWalletInfo(solanaWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "ETHEREUM_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<EthereumWallet>())?.let {
                            AccountOrWalletInfo(ethereumWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "BASE_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<BaseWallet>())?.let {
                            AccountOrWalletInfo(baseWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "POLYGON_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<PolygonWallet>())?.let {
                            AccountOrWalletInfo(polygonWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "ARBITRUM_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<ArbitrumWallet>())?.let {
                            AccountOrWalletInfo(arbitrumWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "TRON_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<TronWallet>())?.let {
                            AccountOrWalletInfo(tronWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "PLASMA_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<PlasmaWallet>())?.let {
                            AccountOrWalletInfo(plasmaWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "EMBEDDED_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<EmbeddedWallet>())?.let {
                            AccountOrWalletInfo(embeddedWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                }

                return AccountOrWalletInfo(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<AccountOrWalletInfo>(AccountOrWalletInfo::class) {

            override fun serialize(
                value: AccountOrWalletInfo,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.usdAccount != null -> generator.writeObject(value.usdAccount)
                    value.eurAccount != null -> generator.writeObject(value.eurAccount)
                    value.swiftAccount != null -> generator.writeObject(value.swiftAccount)
                    value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                    value.brlAccount != null -> generator.writeObject(value.brlAccount)
                    value.copAccount != null -> generator.writeObject(value.copAccount)
                    value.arsAccount != null -> generator.writeObject(value.arsAccount)
                    value.sparkWallet != null -> generator.writeObject(value.sparkWallet)
                    value.lightning != null -> generator.writeObject(value.lightning)
                    value.bitcoinL1 != null -> generator.writeObject(value.bitcoinL1)
                    value.solanaWallet != null -> generator.writeObject(value.solanaWallet)
                    value.ethereumWallet != null -> generator.writeObject(value.ethereumWallet)
                    value.baseWallet != null -> generator.writeObject(value.baseWallet)
                    value.polygonWallet != null -> generator.writeObject(value.polygonWallet)
                    value.arbitrumWallet != null -> generator.writeObject(value.arbitrumWallet)
                    value.tronWallet != null -> generator.writeObject(value.tronWallet)
                    value.plasmaWallet != null -> generator.writeObject(value.plasmaWallet)
                    value.embeddedWallet != null -> generator.writeObject(value.embeddedWallet)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
                }
            }
        }

        class UsdAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reference: JsonField<String>,
            private val bankAddress: JsonField<String>,
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<UsdAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<UsdAccountInfo.PaymentRail>>,
            private val routingNumber: JsonField<String>,
            private val bankAccountType: JsonField<UsdAccountInfo.BankAccountType>,
            private val bankName: JsonField<String>,
            private val fiToFiInformation: JsonField<String>,
            private val intermediaryBankName: JsonField<String>,
            private val intermediaryRoutingNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bankAddress")
                @ExcludeMissing
                bankAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<UsdAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<UsdAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("routingNumber")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bankAccountType")
                @ExcludeMissing
                bankAccountType: JsonField<UsdAccountInfo.BankAccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fiToFiInformation")
                @ExcludeMissing
                fiToFiInformation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("intermediaryBankName")
                @ExcludeMissing
                intermediaryBankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("intermediaryRoutingNumber")
                @ExcludeMissing
                intermediaryRoutingNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                reference,
                bankAddress,
                accountNumber,
                accountType,
                paymentRails,
                routingNumber,
                bankAccountType,
                bankName,
                fiToFiInformation,
                intermediaryBankName,
                intermediaryRoutingNumber,
                mutableMapOf(),
            )

            fun toUsdAccountInfo(): UsdAccountInfo =
                UsdAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .routingNumber(routingNumber)
                    .bankAccountType(bankAccountType)
                    .bankName(bankName)
                    .fiToFiInformation(fiToFiInformation)
                    .intermediaryBankName(intermediaryBankName)
                    .intermediaryRoutingNumber(intermediaryRoutingNumber)
                    .build()

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * The postal address of the financial institution holding the account, on a single
             * line. Optional on every rail, and recommended for wires, where some originating banks
             * require the beneficiary institution's address before they will send.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bankAddress(): String? = bankAddress.getNullable("bankAddress")

            /**
             * The account number of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): UsdAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<UsdAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The ABA routing number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routingNumber")

            /**
             * Whether the account is a checking or a savings account. Grid uses this to set the ACH
             * transaction code, so a value that does not match the account causes the receiving
             * bank to return a notification of change.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bankAccountType(): UsdAccountInfo.BankAccountType? =
                bankAccountType.getNullable("bankAccountType")

            /**
             * The name of the financial institution holding the account. Optional on every rail,
             * and recommended for wires, where it identifies the beneficiary's institution on the
             * payment message. Not checked against `GET /discoveries`.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bankName(): String? = bankName.getNullable("bankName")

            /**
             * Bank-to-bank instructions carried alongside the payment. Used on the WIRE rail;
             * ignored on ACH, RTP and FEDNOW.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fiToFiInformation(): String? = fiToFiInformation.getNullable("fiToFiInformation")

            /**
             * The name of the intermediary financial institution, for accounts reachable only
             * through a correspondent bank. Used on the WIRE rail; ignored on ACH, RTP and FEDNOW.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun intermediaryBankName(): String? =
                intermediaryBankName.getNullable("intermediaryBankName")

            /**
             * The ABA routing number of the intermediary financial institution. Used on the WIRE
             * rail; ignored on ACH, RTP and FEDNOW.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun intermediaryRoutingNumber(): String? =
                intermediaryRoutingNumber.getNullable("intermediaryRoutingNumber")

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [bankAddress].
             *
             * Unlike [bankAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankAddress")
            @ExcludeMissing
            fun _bankAddress(): JsonField<String> = bankAddress

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<UsdAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<UsdAccountInfo.PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routingNumber")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /**
             * Returns the raw JSON value of [bankAccountType].
             *
             * Unlike [bankAccountType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bankAccountType")
            @ExcludeMissing
            fun _bankAccountType(): JsonField<UsdAccountInfo.BankAccountType> = bankAccountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [fiToFiInformation].
             *
             * Unlike [fiToFiInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fiToFiInformation")
            @ExcludeMissing
            fun _fiToFiInformation(): JsonField<String> = fiToFiInformation

            /**
             * Returns the raw JSON value of [intermediaryBankName].
             *
             * Unlike [intermediaryBankName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("intermediaryBankName")
            @ExcludeMissing
            fun _intermediaryBankName(): JsonField<String> = intermediaryBankName

            /**
             * Returns the raw JSON value of [intermediaryRoutingNumber].
             *
             * Unlike [intermediaryRoutingNumber], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("intermediaryRoutingNumber")
            @ExcludeMissing
            fun _intermediaryRoutingNumber(): JsonField<String> = intermediaryRoutingNumber

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
                 * Returns a mutable builder for constructing an instance of [UsdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reference()
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .routingNumber()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsdAccount]. */
            class Builder internal constructor() {

                private var reference: JsonField<String>? = null
                private var bankAddress: JsonField<String> = JsonMissing.of()
                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<UsdAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<UsdAccountInfo.PaymentRail>>? = null
                private var routingNumber: JsonField<String>? = null
                private var bankAccountType: JsonField<UsdAccountInfo.BankAccountType> =
                    JsonMissing.of()
                private var bankName: JsonField<String> = JsonMissing.of()
                private var fiToFiInformation: JsonField<String> = JsonMissing.of()
                private var intermediaryBankName: JsonField<String> = JsonMissing.of()
                private var intermediaryRoutingNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usdAccount: UsdAccount) = apply {
                    reference = usdAccount.reference
                    bankAddress = usdAccount.bankAddress
                    accountNumber = usdAccount.accountNumber
                    accountType = usdAccount.accountType
                    paymentRails = usdAccount.paymentRails.map { it.toMutableList() }
                    routingNumber = usdAccount.routingNumber
                    bankAccountType = usdAccount.bankAccountType
                    bankName = usdAccount.bankName
                    fiToFiInformation = usdAccount.fiToFiInformation
                    intermediaryBankName = usdAccount.intermediaryBankName
                    intermediaryRoutingNumber = usdAccount.intermediaryRoutingNumber
                    additionalProperties = usdAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Unique reference code that must be included with the payment to properly credit
                 * it
                 */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                /**
                 * The postal address of the financial institution holding the account, on a single
                 * line. Optional on every rail, and recommended for wires, where some originating
                 * banks require the beneficiary institution's address before they will send.
                 */
                fun bankAddress(bankAddress: String) = bankAddress(JsonField.of(bankAddress))

                /**
                 * Sets [Builder.bankAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankAddress(bankAddress: JsonField<String>) = apply {
                    this.bankAddress = bankAddress
                }

                /** The account number of the bank */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountType(accountType: UsdAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [UsdAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<UsdAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<UsdAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<UsdAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<UsdAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [UsdAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: UsdAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /** The ABA routing number */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /**
                 * Whether the account is a checking or a savings account. Grid uses this to set the
                 * ACH transaction code, so a value that does not match the account causes the
                 * receiving bank to return a notification of change.
                 */
                fun bankAccountType(bankAccountType: UsdAccountInfo.BankAccountType) =
                    bankAccountType(JsonField.of(bankAccountType))

                /**
                 * Sets [Builder.bankAccountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAccountType] with a well-typed
                 * [UsdAccountInfo.BankAccountType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun bankAccountType(bankAccountType: JsonField<UsdAccountInfo.BankAccountType>) =
                    apply {
                        this.bankAccountType = bankAccountType
                    }

                /**
                 * The name of the financial institution holding the account. Optional on every
                 * rail, and recommended for wires, where it identifies the beneficiary's
                 * institution on the payment message. Not checked against `GET /discoveries`.
                 */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                /**
                 * Bank-to-bank instructions carried alongside the payment. Used on the WIRE rail;
                 * ignored on ACH, RTP and FEDNOW.
                 */
                fun fiToFiInformation(fiToFiInformation: String) =
                    fiToFiInformation(JsonField.of(fiToFiInformation))

                /**
                 * Sets [Builder.fiToFiInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fiToFiInformation] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fiToFiInformation(fiToFiInformation: JsonField<String>) = apply {
                    this.fiToFiInformation = fiToFiInformation
                }

                /**
                 * The name of the intermediary financial institution, for accounts reachable only
                 * through a correspondent bank. Used on the WIRE rail; ignored on ACH, RTP and
                 * FEDNOW.
                 */
                fun intermediaryBankName(intermediaryBankName: String) =
                    intermediaryBankName(JsonField.of(intermediaryBankName))

                /**
                 * Sets [Builder.intermediaryBankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.intermediaryBankName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun intermediaryBankName(intermediaryBankName: JsonField<String>) = apply {
                    this.intermediaryBankName = intermediaryBankName
                }

                /**
                 * The ABA routing number of the intermediary financial institution. Used on the
                 * WIRE rail; ignored on ACH, RTP and FEDNOW.
                 */
                fun intermediaryRoutingNumber(intermediaryRoutingNumber: String) =
                    intermediaryRoutingNumber(JsonField.of(intermediaryRoutingNumber))

                /**
                 * Sets [Builder.intermediaryRoutingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.intermediaryRoutingNumber] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun intermediaryRoutingNumber(intermediaryRoutingNumber: JsonField<String>) =
                    apply {
                        this.intermediaryRoutingNumber = intermediaryRoutingNumber
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
                 * Returns an immutable instance of [UsdAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reference()
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .routingNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsdAccount =
                    UsdAccount(
                        checkRequired("reference", reference),
                        bankAddress,
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("routingNumber", routingNumber),
                        bankAccountType,
                        bankName,
                        fiToFiInformation,
                        intermediaryBankName,
                        intermediaryRoutingNumber,
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
            fun validate(): UsdAccount = apply {
                if (validated) {
                    return@apply
                }

                reference()
                bankAddress()
                accountNumber()
                accountType().validate()
                paymentRails().forEach { it.validate() }
                routingNumber()
                bankAccountType()?.validate()
                bankName()
                fiToFiInformation()
                intermediaryBankName()
                intermediaryRoutingNumber()
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
                (if (reference.asKnown() == null) 0 else 1) +
                    (if (bankAddress.asKnown() == null) 0 else 1) +
                    (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (routingNumber.asKnown() == null) 0 else 1) +
                    (bankAccountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (if (fiToFiInformation.asKnown() == null) 0 else 1) +
                    (if (intermediaryBankName.asKnown() == null) 0 else 1) +
                    (if (intermediaryRoutingNumber.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsdAccount &&
                    reference == other.reference &&
                    bankAddress == other.bankAddress &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    routingNumber == other.routingNumber &&
                    bankAccountType == other.bankAccountType &&
                    bankName == other.bankName &&
                    fiToFiInformation == other.fiToFiInformation &&
                    intermediaryBankName == other.intermediaryBankName &&
                    intermediaryRoutingNumber == other.intermediaryRoutingNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    reference,
                    bankAddress,
                    accountNumber,
                    accountType,
                    paymentRails,
                    routingNumber,
                    bankAccountType,
                    bankName,
                    fiToFiInformation,
                    intermediaryBankName,
                    intermediaryRoutingNumber,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsdAccount{reference=$reference, bankAddress=$bankAddress, accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, routingNumber=$routingNumber, bankAccountType=$bankAccountType, bankName=$bankName, fiToFiInformation=$fiToFiInformation, intermediaryBankName=$intermediaryBankName, intermediaryRoutingNumber=$intermediaryRoutingNumber, additionalProperties=$additionalProperties}"
        }

        class EurAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reference: JsonField<String>,
            private val accountType: JsonField<EurAccountInfo.AccountType>,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<EurAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<EurAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<EurAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(reference, accountType, iban, paymentRails, swiftCode, mutableMapOf())

            fun toEurAccountInfo(): EurAccountInfo =
                EurAccountInfo.builder()
                    .accountType(accountType)
                    .iban(iban)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): EurAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The IBAN of the bank account
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun iban(): String = iban.getRequired("iban")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<EurAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank. When omitted, Grid derives it from the IBAN when
             * possible. Provide it when automatic derivation is unavailable.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun swiftCode(): String? = swiftCode.getNullable("swiftCode")

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<EurAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [iban].
             *
             * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<EurAccountInfo.PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [swiftCode].
             *
             * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("swiftCode")
            @ExcludeMissing
            fun _swiftCode(): JsonField<String> = swiftCode

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
                 * Returns a mutable builder for constructing an instance of [EurAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reference()
                 * .accountType()
                 * .iban()
                 * .paymentRails()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EurAccount]. */
            class Builder internal constructor() {

                private var reference: JsonField<String>? = null
                private var accountType: JsonField<EurAccountInfo.AccountType>? = null
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<EurAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(eurAccount: EurAccount) = apply {
                    reference = eurAccount.reference
                    accountType = eurAccount.accountType
                    iban = eurAccount.iban
                    paymentRails = eurAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = eurAccount.swiftCode
                    additionalProperties = eurAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Unique reference code that must be included with the payment to properly credit
                 * it
                 */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                fun accountType(accountType: EurAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [EurAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<EurAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** The IBAN of the bank account */
                fun iban(iban: String) = iban(JsonField.of(iban))

                /**
                 * Sets [Builder.iban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.iban] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun iban(iban: JsonField<String>) = apply { this.iban = iban }

                fun paymentRails(paymentRails: List<EurAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<EurAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<EurAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [EurAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: EurAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /**
                 * The SWIFT/BIC code of the bank. When omitted, Grid derives it from the IBAN when
                 * possible. Provide it when automatic derivation is unavailable.
                 */
                fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

                /**
                 * Sets [Builder.swiftCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.swiftCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun swiftCode(swiftCode: JsonField<String>) = apply { this.swiftCode = swiftCode }

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
                 * Returns an immutable instance of [EurAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reference()
                 * .accountType()
                 * .iban()
                 * .paymentRails()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EurAccount =
                    EurAccount(
                        checkRequired("reference", reference),
                        checkRequired("accountType", accountType),
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        swiftCode,
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
            fun validate(): EurAccount = apply {
                if (validated) {
                    return@apply
                }

                reference()
                accountType().validate()
                iban()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (if (reference.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EurAccount &&
                    reference == other.reference &&
                    accountType == other.accountType &&
                    iban == other.iban &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    reference,
                    accountType,
                    iban,
                    paymentRails,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EurAccount{reference=$reference, accountType=$accountType, iban=$iban, paymentRails=$paymentRails, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        /**
         * At least one of accountNumber or iban is always present: IBAN-only corridors (e.g. BR,
         * GB) use iban, other corridors use accountNumber, and both appear when the bank exposes
         * both identifiers for the same account.
         */
        class SwiftAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountHolderName: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val country: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val accountNumber: JsonField<String>,
            private val bankAddress: JsonField<String>,
            private val iban: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountHolderName")
                @ExcludeMissing
                accountHolderName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bankAddress")
                @ExcludeMissing
                bankAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountHolderName,
                accountType,
                bankName,
                country,
                paymentRails,
                swiftCode,
                accountNumber,
                bankAddress,
                iban,
                reference,
                mutableMapOf(),
            )

            /**
             * The name of the account holder as it must appear on the wire. Remitting banks match
             * this against the beneficiary name field, so payers should copy it exactly.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountHolderName(): String = accountHolderName.getRequired("accountHolderName")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("SWIFT_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * The ISO 3166-1 alpha-2 country code of the bank account
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * The bank account number. Required for most corridors. Use iban instead for IBAN-only
             * corridors (e.g. BR, GB).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountNumber(): String? = accountNumber.getNullable("accountNumber")

            /**
             * The address of the bank holding the account, when known.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bankAddress(): String? = bankAddress.getNullable("bankAddress")

            /**
             * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
             * accountNumber for all other corridors.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun iban(): String? = iban.getNullable("iban")

            /**
             * Reference code to include with the payment when present. SWIFT payments are
             * attributed by the destination account number/IBAN, so this account type typically
             * requires no reference.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reference(): String? = reference.getNullable("reference")

            /**
             * Returns the raw JSON value of [accountHolderName].
             *
             * Unlike [accountHolderName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accountHolderName")
            @ExcludeMissing
            fun _accountHolderName(): JsonField<String> = accountHolderName

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [swiftCode].
             *
             * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("swiftCode")
            @ExcludeMissing
            fun _swiftCode(): JsonField<String> = swiftCode

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [bankAddress].
             *
             * Unlike [bankAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankAddress")
            @ExcludeMissing
            fun _bankAddress(): JsonField<String> = bankAddress

            /**
             * Returns the raw JSON value of [iban].
             *
             * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

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
                 * Returns a mutable builder for constructing an instance of [SwiftAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountHolderName()
                 * .bankName()
                 * .country()
                 * .paymentRails()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SwiftAccount]. */
            class Builder internal constructor() {

                private var accountHolderName: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("SWIFT_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var swiftCode: JsonField<String>? = null
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var bankAddress: JsonField<String> = JsonMissing.of()
                private var iban: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(swiftAccount: SwiftAccount) = apply {
                    accountHolderName = swiftAccount.accountHolderName
                    accountType = swiftAccount.accountType
                    bankName = swiftAccount.bankName
                    country = swiftAccount.country
                    paymentRails = swiftAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = swiftAccount.swiftCode
                    accountNumber = swiftAccount.accountNumber
                    bankAddress = swiftAccount.bankAddress
                    iban = swiftAccount.iban
                    reference = swiftAccount.reference
                    additionalProperties = swiftAccount.additionalProperties.toMutableMap()
                }

                /**
                 * The name of the account holder as it must appear on the wire. Remitting banks
                 * match this against the beneficiary name field, so payers should copy it exactly.
                 */
                fun accountHolderName(accountHolderName: String) =
                    accountHolderName(JsonField.of(accountHolderName))

                /**
                 * Sets [Builder.accountHolderName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountHolderName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountHolderName(accountHolderName: JsonField<String>) = apply {
                    this.accountHolderName = accountHolderName
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("SWIFT_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** The name of the bank */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                /** The ISO 3166-1 alpha-2 country code of the bank account */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun paymentRails(paymentRails: List<PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<PaymentRail>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<PaymentRail>>) = apply {
                    this.paymentRails = paymentRails.map { it.toMutableList() }
                }

                /**
                 * Adds a single [PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /** The SWIFT/BIC code of the bank */
                fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

                /**
                 * Sets [Builder.swiftCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.swiftCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun swiftCode(swiftCode: JsonField<String>) = apply { this.swiftCode = swiftCode }

                /**
                 * The bank account number. Required for most corridors. Use iban instead for
                 * IBAN-only corridors (e.g. BR, GB).
                 */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The address of the bank holding the account, when known. */
                fun bankAddress(bankAddress: String) = bankAddress(JsonField.of(bankAddress))

                /**
                 * Sets [Builder.bankAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankAddress(bankAddress: JsonField<String>) = apply {
                    this.bankAddress = bankAddress
                }

                /**
                 * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
                 * accountNumber for all other corridors.
                 */
                fun iban(iban: String) = iban(JsonField.of(iban))

                /**
                 * Sets [Builder.iban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.iban] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun iban(iban: JsonField<String>) = apply { this.iban = iban }

                /**
                 * Reference code to include with the payment when present. SWIFT payments are
                 * attributed by the destination account number/IBAN, so this account type typically
                 * requires no reference.
                 */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

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
                 * Returns an immutable instance of [SwiftAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountHolderName()
                 * .bankName()
                 * .country()
                 * .paymentRails()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SwiftAccount =
                    SwiftAccount(
                        checkRequired("accountHolderName", accountHolderName),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("country", country),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("swiftCode", swiftCode),
                        accountNumber,
                        bankAddress,
                        iban,
                        reference,
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
            fun validate(): SwiftAccount = apply {
                if (validated) {
                    return@apply
                }

                accountHolderName()
                _accountType().let {
                    if (it != JsonValue.from("SWIFT_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
                country()
                paymentRails().forEach { it.validate() }
                swiftCode()
                accountNumber()
                bankAddress()
                iban()
                reference()
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
                (if (accountHolderName.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("SWIFT_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (if (country.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (accountNumber.asKnown() == null) 0 else 1) +
                    (if (bankAddress.asKnown() == null) 0 else 1) +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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

                    val SWIFT = of("SWIFT")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    SWIFT
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
                    SWIFT,
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
                        SWIFT -> Value.SWIFT
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
                        SWIFT -> Known.SWIFT
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

                return other is SwiftAccount &&
                    accountHolderName == other.accountHolderName &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    country == other.country &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    accountNumber == other.accountNumber &&
                    bankAddress == other.bankAddress &&
                    iban == other.iban &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountHolderName,
                    accountType,
                    bankName,
                    country,
                    paymentRails,
                    swiftCode,
                    accountNumber,
                    bankAddress,
                    iban,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SwiftAccount{accountHolderName=$accountHolderName, accountType=$accountType, bankName=$bankName, country=$country, paymentRails=$paymentRails, swiftCode=$swiftCode, accountNumber=$accountNumber, bankAddress=$bankAddress, iban=$iban, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class MxnAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reference: JsonField<String>,
            private val accountType: JsonField<MxnAccountInfo.AccountType>,
            private val clabeNumber: JsonField<String>,
            private val paymentRails: JsonField<List<MxnAccountInfo.PaymentRail>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<MxnAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("clabeNumber")
                @ExcludeMissing
                clabeNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<MxnAccountInfo.PaymentRail>> = JsonMissing.of(),
            ) : this(reference, accountType, clabeNumber, paymentRails, mutableMapOf())

            fun toMxnAccountInfo(): MxnAccountInfo =
                MxnAccountInfo.builder()
                    .accountType(accountType)
                    .clabeNumber(clabeNumber)
                    .paymentRails(paymentRails)
                    .build()

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): MxnAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The CLABE number of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clabeNumber(): String = clabeNumber.getRequired("clabeNumber")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<MxnAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<MxnAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [clabeNumber].
             *
             * Unlike [clabeNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("clabeNumber")
            @ExcludeMissing
            fun _clabeNumber(): JsonField<String> = clabeNumber

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<MxnAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [MxnAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reference()
                 * .accountType()
                 * .clabeNumber()
                 * .paymentRails()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MxnAccount]. */
            class Builder internal constructor() {

                private var reference: JsonField<String>? = null
                private var accountType: JsonField<MxnAccountInfo.AccountType>? = null
                private var clabeNumber: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<MxnAccountInfo.PaymentRail>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mxnAccount: MxnAccount) = apply {
                    reference = mxnAccount.reference
                    accountType = mxnAccount.accountType
                    clabeNumber = mxnAccount.clabeNumber
                    paymentRails = mxnAccount.paymentRails.map { it.toMutableList() }
                    additionalProperties = mxnAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Unique reference code that must be included with the payment to properly credit
                 * it
                 */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                fun accountType(accountType: MxnAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [MxnAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<MxnAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** The CLABE number of the bank */
                fun clabeNumber(clabeNumber: String) = clabeNumber(JsonField.of(clabeNumber))

                /**
                 * Sets [Builder.clabeNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clabeNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clabeNumber(clabeNumber: JsonField<String>) = apply {
                    this.clabeNumber = clabeNumber
                }

                fun paymentRails(paymentRails: List<MxnAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<MxnAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<MxnAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [MxnAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: MxnAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
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
                 * Returns an immutable instance of [MxnAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reference()
                 * .accountType()
                 * .clabeNumber()
                 * .paymentRails()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MxnAccount =
                    MxnAccount(
                        checkRequired("reference", reference),
                        checkRequired("accountType", accountType),
                        checkRequired("clabeNumber", clabeNumber),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
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
            fun validate(): MxnAccount = apply {
                if (validated) {
                    return@apply
                }

                reference()
                accountType().validate()
                clabeNumber()
                paymentRails().forEach { it.validate() }
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
                (if (reference.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (clabeNumber.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MxnAccount &&
                    reference == other.reference &&
                    accountType == other.accountType &&
                    clabeNumber == other.clabeNumber &&
                    paymentRails == other.paymentRails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    reference,
                    accountType,
                    clabeNumber,
                    paymentRails,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MxnAccount{reference=$reference, accountType=$accountType, clabeNumber=$clabeNumber, paymentRails=$paymentRails, additionalProperties=$additionalProperties}"
        }

        class BrlAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val qrCode: JsonField<String>,
            private val accountType: JsonField<AccountType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("qrCode")
                @ExcludeMissing
                qrCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<AccountType> = JsonMissing.of(),
            ) : this(qrCode, accountType, mutableMapOf())

            /**
             * A PIX QR code payload that can be used to fund the transaction. This can be rendered
             * as a QR code image or pasted into a PIX-compatible banking app.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun qrCode(): String = qrCode.getRequired("qrCode")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountType(): AccountType? = accountType.getNullable("accountType")

            /**
             * Returns the raw JSON value of [qrCode].
             *
             * Unlike [qrCode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("qrCode") @ExcludeMissing fun _qrCode(): JsonField<String> = qrCode

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<AccountType> = accountType

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
                 * Returns a mutable builder for constructing an instance of [BrlAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .qrCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BrlAccount]. */
            class Builder internal constructor() {

                private var qrCode: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(brlAccount: BrlAccount) = apply {
                    qrCode = brlAccount.qrCode
                    accountType = brlAccount.accountType
                    additionalProperties = brlAccount.additionalProperties.toMutableMap()
                }

                /**
                 * A PIX QR code payload that can be used to fund the transaction. This can be
                 * rendered as a QR code image or pasted into a PIX-compatible banking app.
                 */
                fun qrCode(qrCode: String) = qrCode(JsonField.of(qrCode))

                /**
                 * Sets [Builder.qrCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.qrCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun qrCode(qrCode: JsonField<String>) = apply { this.qrCode = qrCode }

                fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed [AccountType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountType(accountType: JsonField<AccountType>) = apply {
                    this.accountType = accountType
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
                 * Returns an immutable instance of [BrlAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .qrCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BrlAccount =
                    BrlAccount(
                        checkRequired("qrCode", qrCode),
                        accountType,
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
            fun validate(): BrlAccount = apply {
                if (validated) {
                    return@apply
                }

                qrCode()
                accountType()?.validate()
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
                (if (qrCode.asKnown() == null) 0 else 1) + (accountType.asKnown()?.validity() ?: 0)

            class AccountType
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

                    val BRL_ACCOUNT = of("BRL_ACCOUNT")

                    fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    BRL_ACCOUNT
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BRL_ACCOUNT,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
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
                        BRL_ACCOUNT -> Value.BRL_ACCOUNT
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
                        BRL_ACCOUNT -> Known.BRL_ACCOUNT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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
                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BrlAccount &&
                    qrCode == other.qrCode &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(qrCode, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BrlAccount{qrCode=$qrCode, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        class CopAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val paymentUrl: JsonField<String>,
            private val accountType: JsonField<AccountType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("paymentUrl")
                @ExcludeMissing
                paymentUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<AccountType> = JsonMissing.of(),
            ) : this(paymentUrl, accountType, mutableMapOf())

            /**
             * A payment URL where the customer can complete their COP deposit.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentUrl(): String = paymentUrl.getRequired("paymentUrl")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountType(): AccountType? = accountType.getNullable("accountType")

            /**
             * Returns the raw JSON value of [paymentUrl].
             *
             * Unlike [paymentUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentUrl")
            @ExcludeMissing
            fun _paymentUrl(): JsonField<String> = paymentUrl

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<AccountType> = accountType

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
                 * Returns a mutable builder for constructing an instance of [CopAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentUrl()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CopAccount]. */
            class Builder internal constructor() {

                private var paymentUrl: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(copAccount: CopAccount) = apply {
                    paymentUrl = copAccount.paymentUrl
                    accountType = copAccount.accountType
                    additionalProperties = copAccount.additionalProperties.toMutableMap()
                }

                /** A payment URL where the customer can complete their COP deposit. */
                fun paymentUrl(paymentUrl: String) = paymentUrl(JsonField.of(paymentUrl))

                /**
                 * Sets [Builder.paymentUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentUrl(paymentUrl: JsonField<String>) = apply {
                    this.paymentUrl = paymentUrl
                }

                fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed [AccountType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountType(accountType: JsonField<AccountType>) = apply {
                    this.accountType = accountType
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
                 * Returns an immutable instance of [CopAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentUrl()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CopAccount =
                    CopAccount(
                        checkRequired("paymentUrl", paymentUrl),
                        accountType,
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
            fun validate(): CopAccount = apply {
                if (validated) {
                    return@apply
                }

                paymentUrl()
                accountType()?.validate()
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
                (if (paymentUrl.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0)

            class AccountType
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

                    val COP_ACCOUNT = of("COP_ACCOUNT")

                    fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    COP_ACCOUNT
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COP_ACCOUNT,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
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
                        COP_ACCOUNT -> Value.COP_ACCOUNT
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
                        COP_ACCOUNT -> Known.COP_ACCOUNT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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
                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CopAccount &&
                    paymentUrl == other.paymentUrl &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(paymentUrl, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CopAccount{paymentUrl=$paymentUrl, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        class ArsAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<AccountType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<AccountType> = JsonMissing.of(),
            ) : this(accountNumber, accountType, mutableMapOf())

            /**
             * The static CVU (Clave Virtual Uniforme) bank account number to pay to.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountType(): AccountType? = accountType.getNullable("accountType")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<AccountType> = accountType

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
                 * Returns a mutable builder for constructing an instance of [ArsAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ArsAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(arsAccount: ArsAccount) = apply {
                    accountNumber = arsAccount.accountNumber
                    accountType = arsAccount.accountType
                    additionalProperties = arsAccount.additionalProperties.toMutableMap()
                }

                /** The static CVU (Clave Virtual Uniforme) bank account number to pay to. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed [AccountType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountType(accountType: JsonField<AccountType>) = apply {
                    this.accountType = accountType
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
                 * Returns an immutable instance of [ArsAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ArsAccount =
                    ArsAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
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
            fun validate(): ArsAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType()?.validate()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0)

            class AccountType
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

                    val ARS_ACCOUNT = of("ARS_ACCOUNT")

                    fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    ARS_ACCOUNT
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ARS_ACCOUNT,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
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
                        ARS_ACCOUNT -> Value.ARS_ACCOUNT
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
                        ARS_ACCOUNT -> Known.ARS_ACCOUNT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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
                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ArsAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountNumber, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ArsAccount{accountNumber=$accountNumber, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        class SparkWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<String>,
            private val invoice: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoice")
                @ExcludeMissing
                invoice: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, address, assetType, invoice, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("SPARK_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Spark wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset or configured Spark token currency code
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun assetType(): String = assetType.getRequired("assetType")

            /**
             * Invoice for the payment
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun invoice(): String? = invoice.getNullable("invoice")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<String> = assetType

            /**
             * Returns the raw JSON value of [invoice].
             *
             * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<String> = invoice

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
                 * Returns a mutable builder for constructing an instance of [SparkWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * .assetType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SparkWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SPARK_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<String>? = null
                private var invoice: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(sparkWallet: SparkWallet) = apply {
                    accountType = sparkWallet.accountType
                    address = sparkWallet.address
                    assetType = sparkWallet.assetType
                    invoice = sparkWallet.invoice
                    additionalProperties = sparkWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("SPARK_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Spark wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset or configured Spark token currency code */
                fun assetType(assetType: String) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<String>) = apply { this.assetType = assetType }

                /** Invoice for the payment */
                fun invoice(invoice: String) = invoice(JsonField.of(invoice))

                /**
                 * Sets [Builder.invoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoice] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoice(invoice: JsonField<String>) = apply { this.invoice = invoice }

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
                 * Returns an immutable instance of [SparkWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * .assetType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SparkWallet =
                    SparkWallet(
                        accountType,
                        checkRequired("address", address),
                        checkRequired("assetType", assetType),
                        invoice,
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
            fun validate(): SparkWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("SPARK_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()
                invoice()
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
                accountType.let { if (it == JsonValue.from("SPARK_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (if (assetType.asKnown() == null) 0 else 1) +
                    (if (invoice.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SparkWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    invoice == other.invoice &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, invoice, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SparkWallet{accountType=$accountType, address=$address, assetType=$assetType, invoice=$invoice, additionalProperties=$additionalProperties}"
        }

        class Lightning
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val invoice: JsonField<String>,
            private val accountType: JsonField<AccountType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("invoice")
                @ExcludeMissing
                invoice: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<AccountType> = JsonMissing.of(),
            ) : this(invoice, accountType, mutableMapOf())

            /**
             * Invoice for the payment
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoice(): String = invoice.getRequired("invoice")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountType(): AccountType? = accountType.getNullable("accountType")

            /**
             * Returns the raw JSON value of [invoice].
             *
             * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<String> = invoice

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<AccountType> = accountType

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
                 * Returns a mutable builder for constructing an instance of [Lightning].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .invoice()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Lightning]. */
            class Builder internal constructor() {

                private var invoice: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(lightning: Lightning) = apply {
                    invoice = lightning.invoice
                    accountType = lightning.accountType
                    additionalProperties = lightning.additionalProperties.toMutableMap()
                }

                /** Invoice for the payment */
                fun invoice(invoice: String) = invoice(JsonField.of(invoice))

                /**
                 * Sets [Builder.invoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoice] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoice(invoice: JsonField<String>) = apply { this.invoice = invoice }

                fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed [AccountType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountType(accountType: JsonField<AccountType>) = apply {
                    this.accountType = accountType
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
                 * Returns an immutable instance of [Lightning].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .invoice()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Lightning =
                    Lightning(
                        checkRequired("invoice", invoice),
                        accountType,
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
            fun validate(): Lightning = apply {
                if (validated) {
                    return@apply
                }

                invoice()
                accountType()?.validate()
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
                (if (invoice.asKnown() == null) 0 else 1) + (accountType.asKnown()?.validity() ?: 0)

            class AccountType
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

                    val LIGHTNING = of("LIGHTNING")

                    fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    LIGHTNING
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LIGHTNING,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
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
                        LIGHTNING -> Value.LIGHTNING
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
                        LIGHTNING -> Known.LIGHTNING
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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
                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Lightning &&
                    invoice == other.invoice &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(invoice, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Lightning{invoice=$invoice, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        class BitcoinL1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val address: JsonField<String>,
            private val accountType: JsonField<AccountType>,
            private val network: JsonField<Network>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<AccountType> = JsonMissing.of(),
                @JsonProperty("network")
                @ExcludeMissing
                network: JsonField<Network> = JsonMissing.of(),
            ) : this(address, accountType, network, mutableMapOf())

            /**
             * On-chain Bitcoin (L1) deposit address to send funds to
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountType(): AccountType? = accountType.getNullable("accountType")

            /**
             * The blockchain network for the deposit address.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun network(): Network? = network.getNullable("network")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<AccountType> = accountType

            /**
             * Returns the raw JSON value of [network].
             *
             * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

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
                 * Returns a mutable builder for constructing an instance of [BitcoinL1].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BitcoinL1]. */
            class Builder internal constructor() {

                private var address: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bitcoinL1: BitcoinL1) = apply {
                    address = bitcoinL1.address
                    accountType = bitcoinL1.accountType
                    network = bitcoinL1.network
                    additionalProperties = bitcoinL1.additionalProperties.toMutableMap()
                }

                /** On-chain Bitcoin (L1) deposit address to send funds to */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed [AccountType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountType(accountType: JsonField<AccountType>) = apply {
                    this.accountType = accountType
                }

                /** The blockchain network for the deposit address. */
                fun network(network: Network) = network(JsonField.of(network))

                /**
                 * Sets [Builder.network] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.network] with a well-typed [Network] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun network(network: JsonField<Network>) = apply { this.network = network }

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
                 * Returns an immutable instance of [BitcoinL1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BitcoinL1 =
                    BitcoinL1(
                        checkRequired("address", address),
                        accountType,
                        network,
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
            fun validate(): BitcoinL1 = apply {
                if (validated) {
                    return@apply
                }

                address()
                accountType()?.validate()
                network()?.validate()
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
                (if (address.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (network.asKnown()?.validity() ?: 0)

            class AccountType
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

                    val BITCOIN_L1 = of("BITCOIN_L1")

                    fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    BITCOIN_L1
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BITCOIN_L1,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
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
                        BITCOIN_L1 -> Value.BITCOIN_L1
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
                        BITCOIN_L1 -> Known.BITCOIN_L1
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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
                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The blockchain network for the deposit address. */
            class Network @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val BITCOIN = of("BITCOIN")

                    fun of(value: String) = Network(JsonField.of(value))
                }

                /** An enum containing [Network]'s known values. */
                enum class Known {
                    BITCOIN
                }

                /**
                 * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Network] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BITCOIN,
                    /**
                     * An enum member indicating that [Network] was instantiated with an unknown
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
                        BITCOIN -> Value.BITCOIN
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
                        BITCOIN -> Known.BITCOIN
                        else -> throw LightsparkGridInvalidDataException("Unknown Network: $value")
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
                fun validate(): Network = apply {
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

                    return other is Network && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BitcoinL1 &&
                    address == other.address &&
                    accountType == other.accountType &&
                    network == other.network &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(address, accountType, network, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BitcoinL1{address=$address, accountType=$accountType, network=$network, additionalProperties=$additionalProperties}"
        }

        class SolanaWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("SOLANA_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Solana wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [SolanaWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SolanaWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SOLANA_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(solanaWallet: SolanaWallet) = apply {
                    accountType = solanaWallet.accountType
                    address = solanaWallet.address
                    assetType = solanaWallet.assetType
                    additionalProperties = solanaWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("SOLANA_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Solana wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [SolanaWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SolanaWallet =
                    SolanaWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): SolanaWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("SOLANA_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("SOLANA_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDC = of("USDC")

                    val USDT = of("USDT")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDC,
                    USDT,
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDC,
                    USDT,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDC -> Value.USDC
                        USDT -> Value.USDT
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
                        USDC -> Known.USDC
                        USDT -> Known.USDT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SolanaWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SolanaWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class EthereumWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("ETHEREUM_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Ethereum L1 wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [EthereumWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EthereumWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("ETHEREUM_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ethereumWallet: EthereumWallet) = apply {
                    accountType = ethereumWallet.accountType
                    address = ethereumWallet.address
                    assetType = ethereumWallet.assetType
                    additionalProperties = ethereumWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("ETHEREUM_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Ethereum L1 wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [EthereumWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EthereumWallet =
                    EthereumWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): EthereumWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("ETHEREUM_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("ETHEREUM_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDC = of("USDC")

                    val USDT = of("USDT")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDC,
                    USDT,
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDC,
                    USDT,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDC -> Value.USDC
                        USDT -> Value.USDT
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
                        USDC -> Known.USDC
                        USDT -> Known.USDT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EthereumWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EthereumWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class BaseWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("BASE_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Base eth wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [BaseWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BaseWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("BASE_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(baseWallet: BaseWallet) = apply {
                    accountType = baseWallet.accountType
                    address = baseWallet.address
                    assetType = baseWallet.assetType
                    additionalProperties = baseWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("BASE_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Base eth wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [BaseWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BaseWallet =
                    BaseWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): BaseWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("BASE_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("BASE_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDC = of("USDC")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDC
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDC,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDC -> Value.USDC
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
                        USDC -> Known.USDC
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BaseWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BaseWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class PolygonWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("POLYGON_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Polygon eth wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [PolygonWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PolygonWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("POLYGON_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(polygonWallet: PolygonWallet) = apply {
                    accountType = polygonWallet.accountType
                    address = polygonWallet.address
                    assetType = polygonWallet.assetType
                    additionalProperties = polygonWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("POLYGON_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Polygon eth wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [PolygonWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PolygonWallet =
                    PolygonWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): PolygonWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("POLYGON_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("POLYGON_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDC = of("USDC")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDC
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDC,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDC -> Value.USDC
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
                        USDC -> Known.USDC
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PolygonWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PolygonWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class ArbitrumWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("ARBITRUM_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Arbitrum wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [ArbitrumWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ArbitrumWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("ARBITRUM_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(arbitrumWallet: ArbitrumWallet) = apply {
                    accountType = arbitrumWallet.accountType
                    address = arbitrumWallet.address
                    assetType = arbitrumWallet.assetType
                    additionalProperties = arbitrumWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("ARBITRUM_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Arbitrum wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [ArbitrumWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ArbitrumWallet =
                    ArbitrumWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): ArbitrumWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("ARBITRUM_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("ARBITRUM_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDC = of("USDC")

                    val USDT = of("USDT")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDC,
                    USDT,
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDC,
                    USDT,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDC -> Value.USDC
                        USDT -> Value.USDT
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
                        USDC -> Known.USDC
                        USDT -> Known.USDT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ArbitrumWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ArbitrumWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class TronWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("TRON_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Tron wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [TronWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TronWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("TRON_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tronWallet: TronWallet) = apply {
                    accountType = tronWallet.accountType
                    address = tronWallet.address
                    assetType = tronWallet.assetType
                    additionalProperties = tronWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("TRON_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Tron wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [TronWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TronWallet =
                    TronWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): TronWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("TRON_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("TRON_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDT = of("USDT")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDT
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDT,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDT -> Value.USDT
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
                        USDT -> Known.USDT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TronWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TronWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class PlasmaWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetType")
                @ExcludeMissing
                assetType: JsonField<AssetType> = JsonMissing.of(),
            ) : this(accountType, address, assetType, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("PLASMA_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Plasma wallet address
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): String = address.getRequired("address")

            /**
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetType(): AssetType? = assetType.getNullable("assetType")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [assetType].
             *
             * Unlike [assetType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetType")
            @ExcludeMissing
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of [PlasmaWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PlasmaWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("PLASMA_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(plasmaWallet: PlasmaWallet) = apply {
                    accountType = plasmaWallet.accountType
                    address = plasmaWallet.address
                    assetType = plasmaWallet.assetType
                    additionalProperties = plasmaWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("PLASMA_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Plasma wallet address */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /** Type of asset */
                fun assetType(assetType: AssetType) = assetType(JsonField.of(assetType))

                /**
                 * Sets [Builder.assetType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetType] with a well-typed [AssetType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetType(assetType: JsonField<AssetType>) = apply {
                    this.assetType = assetType
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
                 * Returns an immutable instance of [PlasmaWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlasmaWallet =
                    PlasmaWallet(
                        accountType,
                        checkRequired("address", address),
                        assetType,
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
            fun validate(): PlasmaWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("PLASMA_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                address()
                assetType()?.validate()
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
                accountType.let { if (it == JsonValue.from("PLASMA_WALLET")) 1 else 0 } +
                    (if (address.asKnown() == null) 0 else 1) +
                    (assetType.asKnown()?.validity() ?: 0)

            /** Type of asset */
            class AssetType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val USDT = of("USDT")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    USDT
                }

                /**
                 * An enum containing [AssetType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AssetType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USDT,
                    /**
                     * An enum member indicating that [AssetType] was instantiated with an unknown
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
                        USDT -> Value.USDT
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
                        USDT -> Known.USDT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown AssetType: $value")
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
                fun validate(): AssetType = apply {
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

                    return other is AssetType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlasmaWallet &&
                    accountType == other.accountType &&
                    address == other.address &&
                    assetType == other.assetType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, address, assetType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlasmaWallet{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class EmbeddedWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val payloadToSign: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("payloadToSign")
                @ExcludeMissing
                payloadToSign: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, payloadToSign, mutableMapOf())

            /**
             * Discriminator value identifying this as Embedded Wallet payment instructions.
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("EMBEDDED_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * JSON-encoded transaction signing payload that must be stamped, as-is (byte-for-byte,
             * without re-serialization), with the session private key of a verified authentication
             * credential on the source Embedded Wallet. The resulting Grid wallet signature is
             * passed as the `Grid-Wallet-Signature` header on `POST /quotes/{quoteId}/execute` to
             * authorize the outbound transfer from the wallet.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun payloadToSign(): String = payloadToSign.getRequired("payloadToSign")

            /**
             * Returns the raw JSON value of [payloadToSign].
             *
             * Unlike [payloadToSign], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payloadToSign")
            @ExcludeMissing
            fun _payloadToSign(): JsonField<String> = payloadToSign

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
                 * Returns a mutable builder for constructing an instance of [EmbeddedWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .payloadToSign()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EmbeddedWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("EMBEDDED_WALLET")
                private var payloadToSign: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(embeddedWallet: EmbeddedWallet) = apply {
                    accountType = embeddedWallet.accountType
                    payloadToSign = embeddedWallet.payloadToSign
                    additionalProperties = embeddedWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("EMBEDDED_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /**
                 * JSON-encoded transaction signing payload that must be stamped, as-is
                 * (byte-for-byte, without re-serialization), with the session private key of a
                 * verified authentication credential on the source Embedded Wallet. The resulting
                 * Grid wallet signature is passed as the `Grid-Wallet-Signature` header on `POST
                 * /quotes/{quoteId}/execute` to authorize the outbound transfer from the wallet.
                 */
                fun payloadToSign(payloadToSign: String) =
                    payloadToSign(JsonField.of(payloadToSign))

                /**
                 * Sets [Builder.payloadToSign] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadToSign] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payloadToSign(payloadToSign: JsonField<String>) = apply {
                    this.payloadToSign = payloadToSign
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
                 * Returns an immutable instance of [EmbeddedWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .payloadToSign()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EmbeddedWallet =
                    EmbeddedWallet(
                        accountType,
                        checkRequired("payloadToSign", payloadToSign),
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
            fun validate(): EmbeddedWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("EMBEDDED_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                payloadToSign()
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
                accountType.let { if (it == JsonValue.from("EMBEDDED_WALLET")) 1 else 0 } +
                    (if (payloadToSign.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EmbeddedWallet &&
                    accountType == other.accountType &&
                    payloadToSign == other.payloadToSign &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, payloadToSign, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmbeddedWallet{accountType=$accountType, payloadToSign=$payloadToSign, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentInstructions &&
            accountOrWalletInfo == other.accountOrWalletInfo &&
            instructionsNotes == other.instructionsNotes &&
            isPlatformAccount == other.isPlatformAccount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountOrWalletInfo,
            instructionsNotes,
            isPlatformAccount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentInstructions{accountOrWalletInfo=$accountOrWalletInfo, instructionsNotes=$instructionsNotes, isPlatformAccount=$isPlatformAccount, additionalProperties=$additionalProperties}"
}
