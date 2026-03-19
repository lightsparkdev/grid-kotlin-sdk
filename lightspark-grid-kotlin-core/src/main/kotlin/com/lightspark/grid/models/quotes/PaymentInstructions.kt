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
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.platform.externalaccounts.BrlAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.CadAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.DkkAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GbpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.HkdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.IdrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.InrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MxnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MyrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.NgnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.PhpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.SgdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ThbAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.VndAccountInfo
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
         * `AccountOrWalletInfo.ofBrlAccount(brlAccount)`.
         */
        fun accountOrWalletInfo(brlAccount: BrlAccountInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofBrlAccount(brlAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofMxnAccount(mxnAccount)`.
         */
        fun accountOrWalletInfo(mxnAccount: AccountOrWalletInfo.MxnAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofMxnAccount(mxnAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofDkkAccount(dkkAccount)`.
         */
        fun accountOrWalletInfo(dkkAccount: AccountOrWalletInfo.DkkAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofDkkAccount(dkkAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofEurAccount(eurAccount)`.
         */
        fun accountOrWalletInfo(eurAccount: AccountOrWalletInfo.EurAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofEurAccount(eurAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofInrAccount(inrAccount)`.
         */
        fun accountOrWalletInfo(inrAccount: InrAccountInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofInrAccount(inrAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofNgnAccount(ngnAccount)`.
         */
        fun accountOrWalletInfo(ngnAccount: AccountOrWalletInfo.NgnAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofNgnAccount(ngnAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofCadAccount(cadAccount)`.
         */
        fun accountOrWalletInfo(cadAccount: AccountOrWalletInfo.CadAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofCadAccount(cadAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofGbpAccount(gbpAccount)`.
         */
        fun accountOrWalletInfo(gbpAccount: AccountOrWalletInfo.GbpAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofGbpAccount(gbpAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofHkdAccount(hkdAccount)`.
         */
        fun accountOrWalletInfo(hkdAccount: AccountOrWalletInfo.HkdAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofHkdAccount(hkdAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofIdrAccount(idrAccount)`.
         */
        fun accountOrWalletInfo(idrAccount: AccountOrWalletInfo.IdrAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofIdrAccount(idrAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofMyrAccount(myrAccount)`.
         */
        fun accountOrWalletInfo(myrAccount: AccountOrWalletInfo.MyrAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofMyrAccount(myrAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPhpAccount(phpAccount)`.
         */
        fun accountOrWalletInfo(phpAccount: AccountOrWalletInfo.PhpAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPhpAccount(phpAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofSgdAccount(sgdAccount)`.
         */
        fun accountOrWalletInfo(sgdAccount: AccountOrWalletInfo.SgdAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofSgdAccount(sgdAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofThbAccount(thbAccount)`.
         */
        fun accountOrWalletInfo(thbAccount: AccountOrWalletInfo.ThbAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofThbAccount(thbAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofVndAccount(vndAccount)`.
         */
        fun accountOrWalletInfo(vndAccount: AccountOrWalletInfo.VndAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofVndAccount(vndAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofAedAccount(aedAccount)`.
         */
        fun accountOrWalletInfo(aedAccount: AccountOrWalletInfo.AedAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofAedAccount(aedAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofKesAccount(kesAccount)`.
         */
        fun accountOrWalletInfo(kesAccount: AccountOrWalletInfo.KesAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofKesAccount(kesAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofMwkAccount(mwkAccount)`.
         */
        fun accountOrWalletInfo(mwkAccount: AccountOrWalletInfo.MwkAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofMwkAccount(mwkAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofRwfAccount(rwfAccount)`.
         */
        fun accountOrWalletInfo(rwfAccount: AccountOrWalletInfo.RwfAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofRwfAccount(rwfAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofTzsAccount(tzsAccount)`.
         */
        fun accountOrWalletInfo(tzsAccount: AccountOrWalletInfo.TzsAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofTzsAccount(tzsAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofUgxAccount(ugxAccount)`.
         */
        fun accountOrWalletInfo(ugxAccount: AccountOrWalletInfo.UgxAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofUgxAccount(ugxAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofXofAccount(xofAccount)`.
         */
        fun accountOrWalletInfo(xofAccount: AccountOrWalletInfo.XofAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofXofAccount(xofAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofZarAccount(zarAccount)`.
         */
        fun accountOrWalletInfo(zarAccount: AccountOrWalletInfo.ZarAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofZarAccount(zarAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofZmwAccount(zmwAccount)`.
         */
        fun accountOrWalletInfo(zmwAccount: AccountOrWalletInfo.ZmwAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofZmwAccount(zmwAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofBwpAccount(bwpAccount)`.
         */
        fun accountOrWalletInfo(bwpAccount: AccountOrWalletInfo.BwpAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofBwpAccount(bwpAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofXafAccount(xafAccount)`.
         */
        fun accountOrWalletInfo(xafAccount: AccountOrWalletInfo.XafAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofXafAccount(xafAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentSpark(paymentSpark)`.
         */
        fun accountOrWalletInfo(paymentSpark: AccountOrWalletInfo.PaymentSparkWalletInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentSpark(paymentSpark))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentLightningInvoice(paymentLightningInvoice)`.
         */
        fun accountOrWalletInfo(
            paymentLightningInvoice: AccountOrWalletInfo.PaymentLightningInvoiceInfo
        ) =
            accountOrWalletInfo(
                AccountOrWalletInfo.ofPaymentLightningInvoice(paymentLightningInvoice)
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentSolana(paymentSolana)`.
         */
        fun accountOrWalletInfo(paymentSolana: AccountOrWalletInfo.PaymentSolanaWalletInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentSolana(paymentSolana))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentTron(paymentTron)`.
         */
        fun accountOrWalletInfo(paymentTron: AccountOrWalletInfo.PaymentTronWalletInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentTron(paymentTron))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentPolygon(paymentPolygon)`.
         */
        fun accountOrWalletInfo(paymentPolygon: AccountOrWalletInfo.PaymentPolygonWalletInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentPolygon(paymentPolygon))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentBase(paymentBase)`.
         */
        fun accountOrWalletInfo(paymentBase: AccountOrWalletInfo.PaymentBaseWalletInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentBase(paymentBase))

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

    @JsonDeserialize(using = AccountOrWalletInfo.Deserializer::class)
    @JsonSerialize(using = AccountOrWalletInfo.Serializer::class)
    class AccountOrWalletInfo
    private constructor(
        private val usdAccount: UsdAccount? = null,
        private val brlAccount: BrlAccountInfo? = null,
        private val mxnAccount: MxnAccount? = null,
        private val dkkAccount: DkkAccount? = null,
        private val eurAccount: EurAccount? = null,
        private val inrAccount: InrAccountInfo? = null,
        private val ngnAccount: NgnAccount? = null,
        private val cadAccount: CadAccount? = null,
        private val gbpAccount: GbpAccount? = null,
        private val hkdAccount: HkdAccount? = null,
        private val idrAccount: IdrAccount? = null,
        private val myrAccount: MyrAccount? = null,
        private val phpAccount: PhpAccount? = null,
        private val sgdAccount: SgdAccount? = null,
        private val thbAccount: ThbAccount? = null,
        private val vndAccount: VndAccount? = null,
        private val aedAccount: AedAccount? = null,
        private val kesAccount: KesAccount? = null,
        private val mwkAccount: MwkAccount? = null,
        private val rwfAccount: RwfAccount? = null,
        private val tzsAccount: TzsAccount? = null,
        private val ugxAccount: UgxAccount? = null,
        private val xofAccount: XofAccount? = null,
        private val zarAccount: ZarAccount? = null,
        private val zmwAccount: ZmwAccount? = null,
        private val bwpAccount: BwpAccount? = null,
        private val xafAccount: XafAccount? = null,
        private val paymentSpark: PaymentSparkWalletInfo? = null,
        private val paymentLightningInvoice: PaymentLightningInvoiceInfo? = null,
        private val paymentSolana: PaymentSolanaWalletInfo? = null,
        private val paymentTron: PaymentTronWalletInfo? = null,
        private val paymentPolygon: PaymentPolygonWalletInfo? = null,
        private val paymentBase: PaymentBaseWalletInfo? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usdAccount(): UsdAccount? = usdAccount

        fun brlAccount(): BrlAccountInfo? = brlAccount

        fun mxnAccount(): MxnAccount? = mxnAccount

        fun dkkAccount(): DkkAccount? = dkkAccount

        fun eurAccount(): EurAccount? = eurAccount

        fun inrAccount(): InrAccountInfo? = inrAccount

        fun ngnAccount(): NgnAccount? = ngnAccount

        fun cadAccount(): CadAccount? = cadAccount

        fun gbpAccount(): GbpAccount? = gbpAccount

        fun hkdAccount(): HkdAccount? = hkdAccount

        fun idrAccount(): IdrAccount? = idrAccount

        fun myrAccount(): MyrAccount? = myrAccount

        fun phpAccount(): PhpAccount? = phpAccount

        fun sgdAccount(): SgdAccount? = sgdAccount

        fun thbAccount(): ThbAccount? = thbAccount

        fun vndAccount(): VndAccount? = vndAccount

        fun aedAccount(): AedAccount? = aedAccount

        fun kesAccount(): KesAccount? = kesAccount

        fun mwkAccount(): MwkAccount? = mwkAccount

        fun rwfAccount(): RwfAccount? = rwfAccount

        fun tzsAccount(): TzsAccount? = tzsAccount

        fun ugxAccount(): UgxAccount? = ugxAccount

        fun xofAccount(): XofAccount? = xofAccount

        fun zarAccount(): ZarAccount? = zarAccount

        fun zmwAccount(): ZmwAccount? = zmwAccount

        fun bwpAccount(): BwpAccount? = bwpAccount

        fun xafAccount(): XafAccount? = xafAccount

        fun paymentSpark(): PaymentSparkWalletInfo? = paymentSpark

        fun paymentLightningInvoice(): PaymentLightningInvoiceInfo? = paymentLightningInvoice

        fun paymentSolana(): PaymentSolanaWalletInfo? = paymentSolana

        fun paymentTron(): PaymentTronWalletInfo? = paymentTron

        fun paymentPolygon(): PaymentPolygonWalletInfo? = paymentPolygon

        fun paymentBase(): PaymentBaseWalletInfo? = paymentBase

        fun isUsdAccount(): Boolean = usdAccount != null

        fun isBrlAccount(): Boolean = brlAccount != null

        fun isMxnAccount(): Boolean = mxnAccount != null

        fun isDkkAccount(): Boolean = dkkAccount != null

        fun isEurAccount(): Boolean = eurAccount != null

        fun isInrAccount(): Boolean = inrAccount != null

        fun isNgnAccount(): Boolean = ngnAccount != null

        fun isCadAccount(): Boolean = cadAccount != null

        fun isGbpAccount(): Boolean = gbpAccount != null

        fun isHkdAccount(): Boolean = hkdAccount != null

        fun isIdrAccount(): Boolean = idrAccount != null

        fun isMyrAccount(): Boolean = myrAccount != null

        fun isPhpAccount(): Boolean = phpAccount != null

        fun isSgdAccount(): Boolean = sgdAccount != null

        fun isThbAccount(): Boolean = thbAccount != null

        fun isVndAccount(): Boolean = vndAccount != null

        fun isAedAccount(): Boolean = aedAccount != null

        fun isKesAccount(): Boolean = kesAccount != null

        fun isMwkAccount(): Boolean = mwkAccount != null

        fun isRwfAccount(): Boolean = rwfAccount != null

        fun isTzsAccount(): Boolean = tzsAccount != null

        fun isUgxAccount(): Boolean = ugxAccount != null

        fun isXofAccount(): Boolean = xofAccount != null

        fun isZarAccount(): Boolean = zarAccount != null

        fun isZmwAccount(): Boolean = zmwAccount != null

        fun isBwpAccount(): Boolean = bwpAccount != null

        fun isXafAccount(): Boolean = xafAccount != null

        fun isPaymentSpark(): Boolean = paymentSpark != null

        fun isPaymentLightningInvoice(): Boolean = paymentLightningInvoice != null

        fun isPaymentSolana(): Boolean = paymentSolana != null

        fun isPaymentTron(): Boolean = paymentTron != null

        fun isPaymentPolygon(): Boolean = paymentPolygon != null

        fun isPaymentBase(): Boolean = paymentBase != null

        fun asUsdAccount(): UsdAccount = usdAccount.getOrThrow("usdAccount")

        fun asBrlAccount(): BrlAccountInfo = brlAccount.getOrThrow("brlAccount")

        fun asMxnAccount(): MxnAccount = mxnAccount.getOrThrow("mxnAccount")

        fun asDkkAccount(): DkkAccount = dkkAccount.getOrThrow("dkkAccount")

        fun asEurAccount(): EurAccount = eurAccount.getOrThrow("eurAccount")

        fun asInrAccount(): InrAccountInfo = inrAccount.getOrThrow("inrAccount")

        fun asNgnAccount(): NgnAccount = ngnAccount.getOrThrow("ngnAccount")

        fun asCadAccount(): CadAccount = cadAccount.getOrThrow("cadAccount")

        fun asGbpAccount(): GbpAccount = gbpAccount.getOrThrow("gbpAccount")

        fun asHkdAccount(): HkdAccount = hkdAccount.getOrThrow("hkdAccount")

        fun asIdrAccount(): IdrAccount = idrAccount.getOrThrow("idrAccount")

        fun asMyrAccount(): MyrAccount = myrAccount.getOrThrow("myrAccount")

        fun asPhpAccount(): PhpAccount = phpAccount.getOrThrow("phpAccount")

        fun asSgdAccount(): SgdAccount = sgdAccount.getOrThrow("sgdAccount")

        fun asThbAccount(): ThbAccount = thbAccount.getOrThrow("thbAccount")

        fun asVndAccount(): VndAccount = vndAccount.getOrThrow("vndAccount")

        fun asAedAccount(): AedAccount = aedAccount.getOrThrow("aedAccount")

        fun asKesAccount(): KesAccount = kesAccount.getOrThrow("kesAccount")

        fun asMwkAccount(): MwkAccount = mwkAccount.getOrThrow("mwkAccount")

        fun asRwfAccount(): RwfAccount = rwfAccount.getOrThrow("rwfAccount")

        fun asTzsAccount(): TzsAccount = tzsAccount.getOrThrow("tzsAccount")

        fun asUgxAccount(): UgxAccount = ugxAccount.getOrThrow("ugxAccount")

        fun asXofAccount(): XofAccount = xofAccount.getOrThrow("xofAccount")

        fun asZarAccount(): ZarAccount = zarAccount.getOrThrow("zarAccount")

        fun asZmwAccount(): ZmwAccount = zmwAccount.getOrThrow("zmwAccount")

        fun asBwpAccount(): BwpAccount = bwpAccount.getOrThrow("bwpAccount")

        fun asXafAccount(): XafAccount = xafAccount.getOrThrow("xafAccount")

        fun asPaymentSpark(): PaymentSparkWalletInfo = paymentSpark.getOrThrow("paymentSpark")

        fun asPaymentLightningInvoice(): PaymentLightningInvoiceInfo =
            paymentLightningInvoice.getOrThrow("paymentLightningInvoice")

        fun asPaymentSolana(): PaymentSolanaWalletInfo = paymentSolana.getOrThrow("paymentSolana")

        fun asPaymentTron(): PaymentTronWalletInfo = paymentTron.getOrThrow("paymentTron")

        fun asPaymentPolygon(): PaymentPolygonWalletInfo =
            paymentPolygon.getOrThrow("paymentPolygon")

        fun asPaymentBase(): PaymentBaseWalletInfo = paymentBase.getOrThrow("paymentBase")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usdAccount != null -> visitor.visitUsdAccount(usdAccount)
                brlAccount != null -> visitor.visitBrlAccount(brlAccount)
                mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
                dkkAccount != null -> visitor.visitDkkAccount(dkkAccount)
                eurAccount != null -> visitor.visitEurAccount(eurAccount)
                inrAccount != null -> visitor.visitInrAccount(inrAccount)
                ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
                cadAccount != null -> visitor.visitCadAccount(cadAccount)
                gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
                hkdAccount != null -> visitor.visitHkdAccount(hkdAccount)
                idrAccount != null -> visitor.visitIdrAccount(idrAccount)
                myrAccount != null -> visitor.visitMyrAccount(myrAccount)
                phpAccount != null -> visitor.visitPhpAccount(phpAccount)
                sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
                thbAccount != null -> visitor.visitThbAccount(thbAccount)
                vndAccount != null -> visitor.visitVndAccount(vndAccount)
                aedAccount != null -> visitor.visitAedAccount(aedAccount)
                kesAccount != null -> visitor.visitKesAccount(kesAccount)
                mwkAccount != null -> visitor.visitMwkAccount(mwkAccount)
                rwfAccount != null -> visitor.visitRwfAccount(rwfAccount)
                tzsAccount != null -> visitor.visitTzsAccount(tzsAccount)
                ugxAccount != null -> visitor.visitUgxAccount(ugxAccount)
                xofAccount != null -> visitor.visitXofAccount(xofAccount)
                zarAccount != null -> visitor.visitZarAccount(zarAccount)
                zmwAccount != null -> visitor.visitZmwAccount(zmwAccount)
                bwpAccount != null -> visitor.visitBwpAccount(bwpAccount)
                xafAccount != null -> visitor.visitXafAccount(xafAccount)
                paymentSpark != null -> visitor.visitPaymentSpark(paymentSpark)
                paymentLightningInvoice != null ->
                    visitor.visitPaymentLightningInvoice(paymentLightningInvoice)
                paymentSolana != null -> visitor.visitPaymentSolana(paymentSolana)
                paymentTron != null -> visitor.visitPaymentTron(paymentTron)
                paymentPolygon != null -> visitor.visitPaymentPolygon(paymentPolygon)
                paymentBase != null -> visitor.visitPaymentBase(paymentBase)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AccountOrWalletInfo = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUsdAccount(usdAccount: UsdAccount) {
                        usdAccount.validate()
                    }

                    override fun visitBrlAccount(brlAccount: BrlAccountInfo) {
                        brlAccount.validate()
                    }

                    override fun visitMxnAccount(mxnAccount: MxnAccount) {
                        mxnAccount.validate()
                    }

                    override fun visitDkkAccount(dkkAccount: DkkAccount) {
                        dkkAccount.validate()
                    }

                    override fun visitEurAccount(eurAccount: EurAccount) {
                        eurAccount.validate()
                    }

                    override fun visitInrAccount(inrAccount: InrAccountInfo) {
                        inrAccount.validate()
                    }

                    override fun visitNgnAccount(ngnAccount: NgnAccount) {
                        ngnAccount.validate()
                    }

                    override fun visitCadAccount(cadAccount: CadAccount) {
                        cadAccount.validate()
                    }

                    override fun visitGbpAccount(gbpAccount: GbpAccount) {
                        gbpAccount.validate()
                    }

                    override fun visitHkdAccount(hkdAccount: HkdAccount) {
                        hkdAccount.validate()
                    }

                    override fun visitIdrAccount(idrAccount: IdrAccount) {
                        idrAccount.validate()
                    }

                    override fun visitMyrAccount(myrAccount: MyrAccount) {
                        myrAccount.validate()
                    }

                    override fun visitPhpAccount(phpAccount: PhpAccount) {
                        phpAccount.validate()
                    }

                    override fun visitSgdAccount(sgdAccount: SgdAccount) {
                        sgdAccount.validate()
                    }

                    override fun visitThbAccount(thbAccount: ThbAccount) {
                        thbAccount.validate()
                    }

                    override fun visitVndAccount(vndAccount: VndAccount) {
                        vndAccount.validate()
                    }

                    override fun visitAedAccount(aedAccount: AedAccount) {
                        aedAccount.validate()
                    }

                    override fun visitKesAccount(kesAccount: KesAccount) {
                        kesAccount.validate()
                    }

                    override fun visitMwkAccount(mwkAccount: MwkAccount) {
                        mwkAccount.validate()
                    }

                    override fun visitRwfAccount(rwfAccount: RwfAccount) {
                        rwfAccount.validate()
                    }

                    override fun visitTzsAccount(tzsAccount: TzsAccount) {
                        tzsAccount.validate()
                    }

                    override fun visitUgxAccount(ugxAccount: UgxAccount) {
                        ugxAccount.validate()
                    }

                    override fun visitXofAccount(xofAccount: XofAccount) {
                        xofAccount.validate()
                    }

                    override fun visitZarAccount(zarAccount: ZarAccount) {
                        zarAccount.validate()
                    }

                    override fun visitZmwAccount(zmwAccount: ZmwAccount) {
                        zmwAccount.validate()
                    }

                    override fun visitBwpAccount(bwpAccount: BwpAccount) {
                        bwpAccount.validate()
                    }

                    override fun visitXafAccount(xafAccount: XafAccount) {
                        xafAccount.validate()
                    }

                    override fun visitPaymentSpark(paymentSpark: PaymentSparkWalletInfo) {
                        paymentSpark.validate()
                    }

                    override fun visitPaymentLightningInvoice(
                        paymentLightningInvoice: PaymentLightningInvoiceInfo
                    ) {
                        paymentLightningInvoice.validate()
                    }

                    override fun visitPaymentSolana(paymentSolana: PaymentSolanaWalletInfo) {
                        paymentSolana.validate()
                    }

                    override fun visitPaymentTron(paymentTron: PaymentTronWalletInfo) {
                        paymentTron.validate()
                    }

                    override fun visitPaymentPolygon(paymentPolygon: PaymentPolygonWalletInfo) {
                        paymentPolygon.validate()
                    }

                    override fun visitPaymentBase(paymentBase: PaymentBaseWalletInfo) {
                        paymentBase.validate()
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

                    override fun visitBrlAccount(brlAccount: BrlAccountInfo) = brlAccount.validity()

                    override fun visitMxnAccount(mxnAccount: MxnAccount) = mxnAccount.validity()

                    override fun visitDkkAccount(dkkAccount: DkkAccount) = dkkAccount.validity()

                    override fun visitEurAccount(eurAccount: EurAccount) = eurAccount.validity()

                    override fun visitInrAccount(inrAccount: InrAccountInfo) = inrAccount.validity()

                    override fun visitNgnAccount(ngnAccount: NgnAccount) = ngnAccount.validity()

                    override fun visitCadAccount(cadAccount: CadAccount) = cadAccount.validity()

                    override fun visitGbpAccount(gbpAccount: GbpAccount) = gbpAccount.validity()

                    override fun visitHkdAccount(hkdAccount: HkdAccount) = hkdAccount.validity()

                    override fun visitIdrAccount(idrAccount: IdrAccount) = idrAccount.validity()

                    override fun visitMyrAccount(myrAccount: MyrAccount) = myrAccount.validity()

                    override fun visitPhpAccount(phpAccount: PhpAccount) = phpAccount.validity()

                    override fun visitSgdAccount(sgdAccount: SgdAccount) = sgdAccount.validity()

                    override fun visitThbAccount(thbAccount: ThbAccount) = thbAccount.validity()

                    override fun visitVndAccount(vndAccount: VndAccount) = vndAccount.validity()

                    override fun visitAedAccount(aedAccount: AedAccount) = aedAccount.validity()

                    override fun visitKesAccount(kesAccount: KesAccount) = kesAccount.validity()

                    override fun visitMwkAccount(mwkAccount: MwkAccount) = mwkAccount.validity()

                    override fun visitRwfAccount(rwfAccount: RwfAccount) = rwfAccount.validity()

                    override fun visitTzsAccount(tzsAccount: TzsAccount) = tzsAccount.validity()

                    override fun visitUgxAccount(ugxAccount: UgxAccount) = ugxAccount.validity()

                    override fun visitXofAccount(xofAccount: XofAccount) = xofAccount.validity()

                    override fun visitZarAccount(zarAccount: ZarAccount) = zarAccount.validity()

                    override fun visitZmwAccount(zmwAccount: ZmwAccount) = zmwAccount.validity()

                    override fun visitBwpAccount(bwpAccount: BwpAccount) = bwpAccount.validity()

                    override fun visitXafAccount(xafAccount: XafAccount) = xafAccount.validity()

                    override fun visitPaymentSpark(paymentSpark: PaymentSparkWalletInfo) =
                        paymentSpark.validity()

                    override fun visitPaymentLightningInvoice(
                        paymentLightningInvoice: PaymentLightningInvoiceInfo
                    ) = paymentLightningInvoice.validity()

                    override fun visitPaymentSolana(paymentSolana: PaymentSolanaWalletInfo) =
                        paymentSolana.validity()

                    override fun visitPaymentTron(paymentTron: PaymentTronWalletInfo) =
                        paymentTron.validity()

                    override fun visitPaymentPolygon(paymentPolygon: PaymentPolygonWalletInfo) =
                        paymentPolygon.validity()

                    override fun visitPaymentBase(paymentBase: PaymentBaseWalletInfo) =
                        paymentBase.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountOrWalletInfo &&
                usdAccount == other.usdAccount &&
                brlAccount == other.brlAccount &&
                mxnAccount == other.mxnAccount &&
                dkkAccount == other.dkkAccount &&
                eurAccount == other.eurAccount &&
                inrAccount == other.inrAccount &&
                ngnAccount == other.ngnAccount &&
                cadAccount == other.cadAccount &&
                gbpAccount == other.gbpAccount &&
                hkdAccount == other.hkdAccount &&
                idrAccount == other.idrAccount &&
                myrAccount == other.myrAccount &&
                phpAccount == other.phpAccount &&
                sgdAccount == other.sgdAccount &&
                thbAccount == other.thbAccount &&
                vndAccount == other.vndAccount &&
                aedAccount == other.aedAccount &&
                kesAccount == other.kesAccount &&
                mwkAccount == other.mwkAccount &&
                rwfAccount == other.rwfAccount &&
                tzsAccount == other.tzsAccount &&
                ugxAccount == other.ugxAccount &&
                xofAccount == other.xofAccount &&
                zarAccount == other.zarAccount &&
                zmwAccount == other.zmwAccount &&
                bwpAccount == other.bwpAccount &&
                xafAccount == other.xafAccount &&
                paymentSpark == other.paymentSpark &&
                paymentLightningInvoice == other.paymentLightningInvoice &&
                paymentSolana == other.paymentSolana &&
                paymentTron == other.paymentTron &&
                paymentPolygon == other.paymentPolygon &&
                paymentBase == other.paymentBase
        }

        override fun hashCode(): Int =
            Objects.hash(
                usdAccount,
                brlAccount,
                mxnAccount,
                dkkAccount,
                eurAccount,
                inrAccount,
                ngnAccount,
                cadAccount,
                gbpAccount,
                hkdAccount,
                idrAccount,
                myrAccount,
                phpAccount,
                sgdAccount,
                thbAccount,
                vndAccount,
                aedAccount,
                kesAccount,
                mwkAccount,
                rwfAccount,
                tzsAccount,
                ugxAccount,
                xofAccount,
                zarAccount,
                zmwAccount,
                bwpAccount,
                xafAccount,
                paymentSpark,
                paymentLightningInvoice,
                paymentSolana,
                paymentTron,
                paymentPolygon,
                paymentBase,
            )

        override fun toString(): String =
            when {
                usdAccount != null -> "AccountOrWalletInfo{usdAccount=$usdAccount}"
                brlAccount != null -> "AccountOrWalletInfo{brlAccount=$brlAccount}"
                mxnAccount != null -> "AccountOrWalletInfo{mxnAccount=$mxnAccount}"
                dkkAccount != null -> "AccountOrWalletInfo{dkkAccount=$dkkAccount}"
                eurAccount != null -> "AccountOrWalletInfo{eurAccount=$eurAccount}"
                inrAccount != null -> "AccountOrWalletInfo{inrAccount=$inrAccount}"
                ngnAccount != null -> "AccountOrWalletInfo{ngnAccount=$ngnAccount}"
                cadAccount != null -> "AccountOrWalletInfo{cadAccount=$cadAccount}"
                gbpAccount != null -> "AccountOrWalletInfo{gbpAccount=$gbpAccount}"
                hkdAccount != null -> "AccountOrWalletInfo{hkdAccount=$hkdAccount}"
                idrAccount != null -> "AccountOrWalletInfo{idrAccount=$idrAccount}"
                myrAccount != null -> "AccountOrWalletInfo{myrAccount=$myrAccount}"
                phpAccount != null -> "AccountOrWalletInfo{phpAccount=$phpAccount}"
                sgdAccount != null -> "AccountOrWalletInfo{sgdAccount=$sgdAccount}"
                thbAccount != null -> "AccountOrWalletInfo{thbAccount=$thbAccount}"
                vndAccount != null -> "AccountOrWalletInfo{vndAccount=$vndAccount}"
                aedAccount != null -> "AccountOrWalletInfo{aedAccount=$aedAccount}"
                kesAccount != null -> "AccountOrWalletInfo{kesAccount=$kesAccount}"
                mwkAccount != null -> "AccountOrWalletInfo{mwkAccount=$mwkAccount}"
                rwfAccount != null -> "AccountOrWalletInfo{rwfAccount=$rwfAccount}"
                tzsAccount != null -> "AccountOrWalletInfo{tzsAccount=$tzsAccount}"
                ugxAccount != null -> "AccountOrWalletInfo{ugxAccount=$ugxAccount}"
                xofAccount != null -> "AccountOrWalletInfo{xofAccount=$xofAccount}"
                zarAccount != null -> "AccountOrWalletInfo{zarAccount=$zarAccount}"
                zmwAccount != null -> "AccountOrWalletInfo{zmwAccount=$zmwAccount}"
                bwpAccount != null -> "AccountOrWalletInfo{bwpAccount=$bwpAccount}"
                xafAccount != null -> "AccountOrWalletInfo{xafAccount=$xafAccount}"
                paymentSpark != null -> "AccountOrWalletInfo{paymentSpark=$paymentSpark}"
                paymentLightningInvoice != null ->
                    "AccountOrWalletInfo{paymentLightningInvoice=$paymentLightningInvoice}"
                paymentSolana != null -> "AccountOrWalletInfo{paymentSolana=$paymentSolana}"
                paymentTron != null -> "AccountOrWalletInfo{paymentTron=$paymentTron}"
                paymentPolygon != null -> "AccountOrWalletInfo{paymentPolygon=$paymentPolygon}"
                paymentBase != null -> "AccountOrWalletInfo{paymentBase=$paymentBase}"
                _json != null -> "AccountOrWalletInfo{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
            }

        companion object {

            fun ofUsdAccount(usdAccount: UsdAccount) = AccountOrWalletInfo(usdAccount = usdAccount)

            fun ofBrlAccount(brlAccount: BrlAccountInfo) =
                AccountOrWalletInfo(brlAccount = brlAccount)

            fun ofMxnAccount(mxnAccount: MxnAccount) = AccountOrWalletInfo(mxnAccount = mxnAccount)

            fun ofDkkAccount(dkkAccount: DkkAccount) = AccountOrWalletInfo(dkkAccount = dkkAccount)

            fun ofEurAccount(eurAccount: EurAccount) = AccountOrWalletInfo(eurAccount = eurAccount)

            fun ofInrAccount(inrAccount: InrAccountInfo) =
                AccountOrWalletInfo(inrAccount = inrAccount)

            fun ofNgnAccount(ngnAccount: NgnAccount) = AccountOrWalletInfo(ngnAccount = ngnAccount)

            fun ofCadAccount(cadAccount: CadAccount) = AccountOrWalletInfo(cadAccount = cadAccount)

            fun ofGbpAccount(gbpAccount: GbpAccount) = AccountOrWalletInfo(gbpAccount = gbpAccount)

            fun ofHkdAccount(hkdAccount: HkdAccount) = AccountOrWalletInfo(hkdAccount = hkdAccount)

            fun ofIdrAccount(idrAccount: IdrAccount) = AccountOrWalletInfo(idrAccount = idrAccount)

            fun ofMyrAccount(myrAccount: MyrAccount) = AccountOrWalletInfo(myrAccount = myrAccount)

            fun ofPhpAccount(phpAccount: PhpAccount) = AccountOrWalletInfo(phpAccount = phpAccount)

            fun ofSgdAccount(sgdAccount: SgdAccount) = AccountOrWalletInfo(sgdAccount = sgdAccount)

            fun ofThbAccount(thbAccount: ThbAccount) = AccountOrWalletInfo(thbAccount = thbAccount)

            fun ofVndAccount(vndAccount: VndAccount) = AccountOrWalletInfo(vndAccount = vndAccount)

            fun ofAedAccount(aedAccount: AedAccount) = AccountOrWalletInfo(aedAccount = aedAccount)

            fun ofKesAccount(kesAccount: KesAccount) = AccountOrWalletInfo(kesAccount = kesAccount)

            fun ofMwkAccount(mwkAccount: MwkAccount) = AccountOrWalletInfo(mwkAccount = mwkAccount)

            fun ofRwfAccount(rwfAccount: RwfAccount) = AccountOrWalletInfo(rwfAccount = rwfAccount)

            fun ofTzsAccount(tzsAccount: TzsAccount) = AccountOrWalletInfo(tzsAccount = tzsAccount)

            fun ofUgxAccount(ugxAccount: UgxAccount) = AccountOrWalletInfo(ugxAccount = ugxAccount)

            fun ofXofAccount(xofAccount: XofAccount) = AccountOrWalletInfo(xofAccount = xofAccount)

            fun ofZarAccount(zarAccount: ZarAccount) = AccountOrWalletInfo(zarAccount = zarAccount)

            fun ofZmwAccount(zmwAccount: ZmwAccount) = AccountOrWalletInfo(zmwAccount = zmwAccount)

            fun ofBwpAccount(bwpAccount: BwpAccount) = AccountOrWalletInfo(bwpAccount = bwpAccount)

            fun ofXafAccount(xafAccount: XafAccount) = AccountOrWalletInfo(xafAccount = xafAccount)

            fun ofPaymentSpark(paymentSpark: PaymentSparkWalletInfo) =
                AccountOrWalletInfo(paymentSpark = paymentSpark)

            fun ofPaymentLightningInvoice(paymentLightningInvoice: PaymentLightningInvoiceInfo) =
                AccountOrWalletInfo(paymentLightningInvoice = paymentLightningInvoice)

            fun ofPaymentSolana(paymentSolana: PaymentSolanaWalletInfo) =
                AccountOrWalletInfo(paymentSolana = paymentSolana)

            fun ofPaymentTron(paymentTron: PaymentTronWalletInfo) =
                AccountOrWalletInfo(paymentTron = paymentTron)

            fun ofPaymentPolygon(paymentPolygon: PaymentPolygonWalletInfo) =
                AccountOrWalletInfo(paymentPolygon = paymentPolygon)

            fun ofPaymentBase(paymentBase: PaymentBaseWalletInfo) =
                AccountOrWalletInfo(paymentBase = paymentBase)
        }

        /**
         * An interface that defines how to map each variant of [AccountOrWalletInfo] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitUsdAccount(usdAccount: UsdAccount): T

            fun visitBrlAccount(brlAccount: BrlAccountInfo): T

            fun visitMxnAccount(mxnAccount: MxnAccount): T

            fun visitDkkAccount(dkkAccount: DkkAccount): T

            fun visitEurAccount(eurAccount: EurAccount): T

            fun visitInrAccount(inrAccount: InrAccountInfo): T

            fun visitNgnAccount(ngnAccount: NgnAccount): T

            fun visitCadAccount(cadAccount: CadAccount): T

            fun visitGbpAccount(gbpAccount: GbpAccount): T

            fun visitHkdAccount(hkdAccount: HkdAccount): T

            fun visitIdrAccount(idrAccount: IdrAccount): T

            fun visitMyrAccount(myrAccount: MyrAccount): T

            fun visitPhpAccount(phpAccount: PhpAccount): T

            fun visitSgdAccount(sgdAccount: SgdAccount): T

            fun visitThbAccount(thbAccount: ThbAccount): T

            fun visitVndAccount(vndAccount: VndAccount): T

            fun visitAedAccount(aedAccount: AedAccount): T

            fun visitKesAccount(kesAccount: KesAccount): T

            fun visitMwkAccount(mwkAccount: MwkAccount): T

            fun visitRwfAccount(rwfAccount: RwfAccount): T

            fun visitTzsAccount(tzsAccount: TzsAccount): T

            fun visitUgxAccount(ugxAccount: UgxAccount): T

            fun visitXofAccount(xofAccount: XofAccount): T

            fun visitZarAccount(zarAccount: ZarAccount): T

            fun visitZmwAccount(zmwAccount: ZmwAccount): T

            fun visitBwpAccount(bwpAccount: BwpAccount): T

            fun visitXafAccount(xafAccount: XafAccount): T

            fun visitPaymentSpark(paymentSpark: PaymentSparkWalletInfo): T

            fun visitPaymentLightningInvoice(
                paymentLightningInvoice: PaymentLightningInvoiceInfo
            ): T

            fun visitPaymentSolana(paymentSolana: PaymentSolanaWalletInfo): T

            fun visitPaymentTron(paymentTron: PaymentTronWalletInfo): T

            fun visitPaymentPolygon(paymentPolygon: PaymentPolygonWalletInfo): T

            fun visitPaymentBase(paymentBase: PaymentBaseWalletInfo): T

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
                    "MXN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MxnAccount>())?.let {
                            AccountOrWalletInfo(mxnAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "DKK_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<DkkAccount>())?.let {
                            AccountOrWalletInfo(dkkAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "EUR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EurAccount>())?.let {
                            AccountOrWalletInfo(eurAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "NGN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<NgnAccount>())?.let {
                            AccountOrWalletInfo(ngnAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "CAD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<CadAccount>())?.let {
                            AccountOrWalletInfo(cadAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "GBP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GbpAccount>())?.let {
                            AccountOrWalletInfo(gbpAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "HKD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<HkdAccount>())?.let {
                            AccountOrWalletInfo(hkdAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "IDR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<IdrAccount>())?.let {
                            AccountOrWalletInfo(idrAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "MYR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MyrAccount>())?.let {
                            AccountOrWalletInfo(myrAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "PHP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PhpAccount>())?.let {
                            AccountOrWalletInfo(phpAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "SGD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SgdAccount>())?.let {
                            AccountOrWalletInfo(sgdAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "THB_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ThbAccount>())?.let {
                            AccountOrWalletInfo(thbAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "VND_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<VndAccount>())?.let {
                            AccountOrWalletInfo(vndAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "AED_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<AedAccount>())?.let {
                            AccountOrWalletInfo(aedAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "KES_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<KesAccount>())?.let {
                            AccountOrWalletInfo(kesAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "MWK_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MwkAccount>())?.let {
                            AccountOrWalletInfo(mwkAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "RWF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<RwfAccount>())?.let {
                            AccountOrWalletInfo(rwfAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "TZS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<TzsAccount>())?.let {
                            AccountOrWalletInfo(tzsAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "UGX_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<UgxAccount>())?.let {
                            AccountOrWalletInfo(ugxAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "XOF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<XofAccount>())?.let {
                            AccountOrWalletInfo(xofAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "ZAR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ZarAccount>())?.let {
                            AccountOrWalletInfo(zarAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "ZMW_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ZmwAccount>())?.let {
                            AccountOrWalletInfo(zmwAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "BWP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BwpAccount>())?.let {
                            AccountOrWalletInfo(bwpAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "XAF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<XafAccount>())?.let {
                            AccountOrWalletInfo(xafAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                }

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<BrlAccountInfo>())?.let {
                                AccountOrWalletInfo(brlAccount = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InrAccountInfo>())?.let {
                                AccountOrWalletInfo(inrAccount = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentSparkWalletInfo>())?.let {
                                AccountOrWalletInfo(paymentSpark = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentLightningInvoiceInfo>())
                                ?.let {
                                    AccountOrWalletInfo(paymentLightningInvoice = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PaymentSolanaWalletInfo>())?.let {
                                AccountOrWalletInfo(paymentSolana = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentTronWalletInfo>())?.let {
                                AccountOrWalletInfo(paymentTron = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentPolygonWalletInfo>())?.let {
                                AccountOrWalletInfo(paymentPolygon = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentBaseWalletInfo>())?.let {
                                AccountOrWalletInfo(paymentBase = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AccountOrWalletInfo(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
                    value.brlAccount != null -> generator.writeObject(value.brlAccount)
                    value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                    value.dkkAccount != null -> generator.writeObject(value.dkkAccount)
                    value.eurAccount != null -> generator.writeObject(value.eurAccount)
                    value.inrAccount != null -> generator.writeObject(value.inrAccount)
                    value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                    value.cadAccount != null -> generator.writeObject(value.cadAccount)
                    value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                    value.hkdAccount != null -> generator.writeObject(value.hkdAccount)
                    value.idrAccount != null -> generator.writeObject(value.idrAccount)
                    value.myrAccount != null -> generator.writeObject(value.myrAccount)
                    value.phpAccount != null -> generator.writeObject(value.phpAccount)
                    value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                    value.thbAccount != null -> generator.writeObject(value.thbAccount)
                    value.vndAccount != null -> generator.writeObject(value.vndAccount)
                    value.aedAccount != null -> generator.writeObject(value.aedAccount)
                    value.kesAccount != null -> generator.writeObject(value.kesAccount)
                    value.mwkAccount != null -> generator.writeObject(value.mwkAccount)
                    value.rwfAccount != null -> generator.writeObject(value.rwfAccount)
                    value.tzsAccount != null -> generator.writeObject(value.tzsAccount)
                    value.ugxAccount != null -> generator.writeObject(value.ugxAccount)
                    value.xofAccount != null -> generator.writeObject(value.xofAccount)
                    value.zarAccount != null -> generator.writeObject(value.zarAccount)
                    value.zmwAccount != null -> generator.writeObject(value.zmwAccount)
                    value.bwpAccount != null -> generator.writeObject(value.bwpAccount)
                    value.xafAccount != null -> generator.writeObject(value.xafAccount)
                    value.paymentSpark != null -> generator.writeObject(value.paymentSpark)
                    value.paymentLightningInvoice != null ->
                        generator.writeObject(value.paymentLightningInvoice)
                    value.paymentSolana != null -> generator.writeObject(value.paymentSolana)
                    value.paymentTron != null -> generator.writeObject(value.paymentTron)
                    value.paymentPolygon != null -> generator.writeObject(value.paymentPolygon)
                    value.paymentBase != null -> generator.writeObject(value.paymentBase)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
                }
            }
        }

        class UsdAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<UsdAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<UsdAccountInfo.PaymentRail>>,
            private val routingNumber: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
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
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                paymentRails,
                routingNumber,
                reference,
                mutableMapOf(),
            )

            fun toUsdAccountInfo(): UsdAccountInfo =
                UsdAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .routingNumber(routingNumber)
                    .build()

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
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
                 * Returns a mutable builder for constructing an instance of [UsdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .routingNumber()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<UsdAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<UsdAccountInfo.PaymentRail>>? = null
                private var routingNumber: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usdAccount: UsdAccount) = apply {
                    accountNumber = usdAccount.accountNumber
                    accountType = usdAccount.accountType
                    paymentRails = usdAccount.paymentRails.map { it.toMutableList() }
                    routingNumber = usdAccount.routingNumber
                    reference = usdAccount.reference
                    additionalProperties = usdAccount.additionalProperties.toMutableMap()
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
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .routingNumber()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsdAccount =
                    UsdAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                paymentRails().forEach { it.validate() }
                routingNumber()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (routingNumber.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    routingNumber == other.routingNumber &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    paymentRails,
                    routingNumber,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsdAccount{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, routingNumber=$routingNumber, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class MxnAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonField<MxnAccountInfo.AccountType>,
            private val clabeNumber: JsonField<String>,
            private val paymentRails: JsonField<List<MxnAccountInfo.PaymentRail>>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<MxnAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("clabeNumber")
                @ExcludeMissing
                clabeNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<MxnAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, clabeNumber, paymentRails, reference, mutableMapOf())

            fun toMxnAccountInfo(): MxnAccountInfo =
                MxnAccountInfo.builder()
                    .accountType(accountType)
                    .clabeNumber(clabeNumber)
                    .paymentRails(paymentRails)
                    .build()

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
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
                 * Returns a mutable builder for constructing an instance of [MxnAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .clabeNumber()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MxnAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<MxnAccountInfo.AccountType>? = null
                private var clabeNumber: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<MxnAccountInfo.PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mxnAccount: MxnAccount) = apply {
                    accountType = mxnAccount.accountType
                    clabeNumber = mxnAccount.clabeNumber
                    paymentRails = mxnAccount.paymentRails.map { it.toMutableList() }
                    reference = mxnAccount.reference
                    additionalProperties = mxnAccount.additionalProperties.toMutableMap()
                }

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
                 * .accountType()
                 * .clabeNumber()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MxnAccount =
                    MxnAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("clabeNumber", clabeNumber),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MxnAccount = apply {
                if (validated) {
                    return@apply
                }

                accountType().validate()
                clabeNumber()
                paymentRails().forEach { it.validate() }
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (if (clabeNumber.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MxnAccount &&
                    accountType == other.accountType &&
                    clabeNumber == other.clabeNumber &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    clabeNumber,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MxnAccount{accountType=$accountType, clabeNumber=$clabeNumber, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class DkkAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonField<DkkAccountInfo.AccountType>,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<DkkAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<DkkAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<DkkAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, iban, paymentRails, swiftCode, reference, mutableMapOf())

            fun toDkkAccountInfo(): DkkAccountInfo =
                DkkAccountInfo.builder()
                    .accountType(accountType)
                    .iban(iban)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): DkkAccountInfo.AccountType = accountType.getRequired("accountType")

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
            fun paymentRails(): List<DkkAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun swiftCode(): String? = swiftCode.getNullable("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<DkkAccountInfo.AccountType> = accountType

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
            fun _paymentRails(): JsonField<List<DkkAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [DkkAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DkkAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<DkkAccountInfo.AccountType>? = null
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<DkkAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dkkAccount: DkkAccount) = apply {
                    accountType = dkkAccount.accountType
                    iban = dkkAccount.iban
                    paymentRails = dkkAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = dkkAccount.swiftCode
                    reference = dkkAccount.reference
                    additionalProperties = dkkAccount.additionalProperties.toMutableMap()
                }

                fun accountType(accountType: DkkAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [DkkAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<DkkAccountInfo.AccountType>) = apply {
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

                fun paymentRails(paymentRails: List<DkkAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<DkkAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<DkkAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [DkkAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: DkkAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [DkkAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DkkAccount =
                    DkkAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        swiftCode,
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DkkAccount = apply {
                if (validated) {
                    return@apply
                }

                accountType().validate()
                iban()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DkkAccount &&
                    accountType == other.accountType &&
                    iban == other.iban &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    iban,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DkkAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class EurAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonField<EurAccountInfo.AccountType>,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<EurAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
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
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, iban, paymentRails, swiftCode, reference, mutableMapOf())

            fun toEurAccountInfo(): EurAccountInfo =
                EurAccountInfo.builder()
                    .accountType(accountType)
                    .iban(iban)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

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
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun swiftCode(): String? = swiftCode.getNullable("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
                 * Returns a mutable builder for constructing an instance of [EurAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EurAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<EurAccountInfo.AccountType>? = null
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<EurAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(eurAccount: EurAccount) = apply {
                    accountType = eurAccount.accountType
                    iban = eurAccount.iban
                    paymentRails = eurAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = eurAccount.swiftCode
                    reference = eurAccount.reference
                    additionalProperties = eurAccount.additionalProperties.toMutableMap()
                }

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
                 * .accountType()
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EurAccount =
                    EurAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        swiftCode,
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EurAccount = apply {
                if (validated) {
                    return@apply
                }

                accountType().validate()
                iban()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EurAccount &&
                    accountType == other.accountType &&
                    iban == other.iban &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    iban,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EurAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class NgnAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<NgnAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<NgnAccountInfo.PaymentRail>>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<NgnAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<NgnAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, accountType, bankName, paymentRails, reference, mutableMapOf())

            fun toNgnAccountInfo(): NgnAccountInfo =
                NgnAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .build()

            /**
             * Nigerian bank account number
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
            fun accountType(): NgnAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<NgnAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<NgnAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<NgnAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [NgnAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NgnAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<NgnAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<NgnAccountInfo.PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ngnAccount: NgnAccount) = apply {
                    accountNumber = ngnAccount.accountNumber
                    accountType = ngnAccount.accountType
                    bankName = ngnAccount.bankName
                    paymentRails = ngnAccount.paymentRails.map { it.toMutableList() }
                    reference = ngnAccount.reference
                    additionalProperties = ngnAccount.additionalProperties.toMutableMap()
                }

                /** Nigerian bank account number */
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

                fun accountType(accountType: NgnAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [NgnAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<NgnAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<NgnAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<NgnAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<NgnAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [NgnAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: NgnAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
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
                 * Returns an immutable instance of [NgnAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NgnAccount =
                    NgnAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NgnAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NgnAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NgnAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class CadAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<CadAccountInfo.AccountType>,
            private val bankCode: JsonField<String>,
            private val branchCode: JsonField<String>,
            private val paymentRails: JsonField<List<CadAccountInfo.PaymentRail>>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<CadAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankCode")
                @ExcludeMissing
                bankCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("branchCode")
                @ExcludeMissing
                branchCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<CadAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankCode,
                branchCode,
                paymentRails,
                reference,
                mutableMapOf(),
            )

            fun toCadAccountInfo(): CadAccountInfo =
                CadAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankCode(bankCode)
                    .branchCode(branchCode)
                    .paymentRails(paymentRails)
                    .build()

            /**
             * Bank account number (7-12 digits)
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
            fun accountType(): CadAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * Canadian financial institution number (3 digits)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankCode(): String = bankCode.getRequired("bankCode")

            /**
             * Transit number identifying the branch (5 digits)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun branchCode(): String = branchCode.getRequired("branchCode")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<CadAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<CadAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankCode].
             *
             * Unlike [bankCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankCode") @ExcludeMissing fun _bankCode(): JsonField<String> = bankCode

            /**
             * Returns the raw JSON value of [branchCode].
             *
             * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("branchCode")
            @ExcludeMissing
            fun _branchCode(): JsonField<String> = branchCode

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<CadAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [CadAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankCode()
                 * .branchCode()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CadAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<CadAccountInfo.AccountType>? = null
                private var bankCode: JsonField<String>? = null
                private var branchCode: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<CadAccountInfo.PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cadAccount: CadAccount) = apply {
                    accountNumber = cadAccount.accountNumber
                    accountType = cadAccount.accountType
                    bankCode = cadAccount.bankCode
                    branchCode = cadAccount.branchCode
                    paymentRails = cadAccount.paymentRails.map { it.toMutableList() }
                    reference = cadAccount.reference
                    additionalProperties = cadAccount.additionalProperties.toMutableMap()
                }

                /** Bank account number (7-12 digits) */
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

                fun accountType(accountType: CadAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [CadAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<CadAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** Canadian financial institution number (3 digits) */
                fun bankCode(bankCode: String) = bankCode(JsonField.of(bankCode))

                /**
                 * Sets [Builder.bankCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankCode(bankCode: JsonField<String>) = apply { this.bankCode = bankCode }

                /** Transit number identifying the branch (5 digits) */
                fun branchCode(branchCode: String) = branchCode(JsonField.of(branchCode))

                /**
                 * Sets [Builder.branchCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.branchCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun branchCode(branchCode: JsonField<String>) = apply {
                    this.branchCode = branchCode
                }

                fun paymentRails(paymentRails: List<CadAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<CadAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<CadAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [CadAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: CadAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
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
                 * Returns an immutable instance of [CadAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankCode()
                 * .branchCode()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CadAccount =
                    CadAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankCode", bankCode),
                        checkRequired("branchCode", branchCode),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CadAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankCode()
                branchCode()
                paymentRails().forEach { it.validate() }
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankCode.asKnown() == null) 0 else 1) +
                    (if (branchCode.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CadAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankCode == other.bankCode &&
                    branchCode == other.branchCode &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankCode,
                    branchCode,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CadAccount{accountNumber=$accountNumber, accountType=$accountType, bankCode=$bankCode, branchCode=$branchCode, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class GbpAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<GbpAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<GbpAccountInfo.PaymentRail>>,
            private val sortCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<GbpAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<GbpAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("sortCode")
                @ExcludeMissing
                sortCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, accountType, paymentRails, sortCode, reference, mutableMapOf())

            fun toGbpAccountInfo(): GbpAccountInfo =
                GbpAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .sortCode(sortCode)
                    .build()

            /**
             * UK bank account number (8 digits)
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
            fun accountType(): GbpAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<GbpAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The UK sort code
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sortCode(): String = sortCode.getRequired("sortCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<GbpAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<GbpAccountInfo.PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [sortCode].
             *
             * Unlike [sortCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sortCode") @ExcludeMissing fun _sortCode(): JsonField<String> = sortCode

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
                 * Returns a mutable builder for constructing an instance of [GbpAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .sortCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [GbpAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<GbpAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<GbpAccountInfo.PaymentRail>>? = null
                private var sortCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(gbpAccount: GbpAccount) = apply {
                    accountNumber = gbpAccount.accountNumber
                    accountType = gbpAccount.accountType
                    paymentRails = gbpAccount.paymentRails.map { it.toMutableList() }
                    sortCode = gbpAccount.sortCode
                    reference = gbpAccount.reference
                    additionalProperties = gbpAccount.additionalProperties.toMutableMap()
                }

                /** UK bank account number (8 digits) */
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

                fun accountType(accountType: GbpAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [GbpAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<GbpAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<GbpAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<GbpAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<GbpAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [GbpAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: GbpAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /** The UK sort code */
                fun sortCode(sortCode: String) = sortCode(JsonField.of(sortCode))

                /**
                 * Sets [Builder.sortCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sortCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sortCode(sortCode: JsonField<String>) = apply { this.sortCode = sortCode }

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
                 * Returns an immutable instance of [GbpAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .sortCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GbpAccount =
                    GbpAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("sortCode", sortCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GbpAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                paymentRails().forEach { it.validate() }
                sortCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (sortCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GbpAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    sortCode == other.sortCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    paymentRails,
                    sortCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GbpAccount{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, sortCode=$sortCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class HkdAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<HkdAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<HkdAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<HkdAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<HkdAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toHkdAccountInfo(): HkdAccountInfo =
                HkdAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Hong Kong bank account number
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
            fun accountType(): HkdAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<HkdAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<HkdAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<HkdAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [HkdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [HkdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<HkdAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<HkdAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(hkdAccount: HkdAccount) = apply {
                    accountNumber = hkdAccount.accountNumber
                    accountType = hkdAccount.accountType
                    bankName = hkdAccount.bankName
                    paymentRails = hkdAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = hkdAccount.swiftCode
                    reference = hkdAccount.reference
                    additionalProperties = hkdAccount.additionalProperties.toMutableMap()
                }

                /** Hong Kong bank account number */
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

                fun accountType(accountType: HkdAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [HkdAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<HkdAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<HkdAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<HkdAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<HkdAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [HkdAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: HkdAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [HkdAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HkdAccount =
                    HkdAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("swiftCode", swiftCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HkdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HkdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HkdAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class IdrAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<IdrAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<IdrAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<IdrAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<IdrAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                phoneNumber,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toIdrAccountInfo(): IdrAccountInfo =
                IdrAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Indonesian bank account number
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
            fun accountType(): IdrAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<IdrAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * Indonesian phone number for e-wallet payments
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<IdrAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<IdrAccountInfo.PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * Returns a mutable builder for constructing an instance of [IdrAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .phoneNumber()
                 * .swiftCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [IdrAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<IdrAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<IdrAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(idrAccount: IdrAccount) = apply {
                    accountNumber = idrAccount.accountNumber
                    accountType = idrAccount.accountType
                    bankName = idrAccount.bankName
                    paymentRails = idrAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = idrAccount.phoneNumber
                    swiftCode = idrAccount.swiftCode
                    reference = idrAccount.reference
                    additionalProperties = idrAccount.additionalProperties.toMutableMap()
                }

                /** Indonesian bank account number */
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

                fun accountType(accountType: IdrAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [IdrAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<IdrAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<IdrAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<IdrAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<IdrAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [IdrAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: IdrAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /** Indonesian phone number for e-wallet payments */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
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
                 * Returns an immutable instance of [IdrAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .phoneNumber()
                 * .swiftCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): IdrAccount =
                    IdrAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("swiftCode", swiftCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): IdrAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                phoneNumber()
                swiftCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is IdrAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    phoneNumber,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IdrAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, phoneNumber=$phoneNumber, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class MyrAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<MyrAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<MyrAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<MyrAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<MyrAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toMyrAccountInfo(): MyrAccountInfo =
                MyrAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Malaysian bank account number
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
            fun accountType(): MyrAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<MyrAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<MyrAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<MyrAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [MyrAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MyrAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<MyrAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<MyrAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(myrAccount: MyrAccount) = apply {
                    accountNumber = myrAccount.accountNumber
                    accountType = myrAccount.accountType
                    bankName = myrAccount.bankName
                    paymentRails = myrAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = myrAccount.swiftCode
                    reference = myrAccount.reference
                    additionalProperties = myrAccount.additionalProperties.toMutableMap()
                }

                /** Malaysian bank account number */
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

                fun accountType(accountType: MyrAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [MyrAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<MyrAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<MyrAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<MyrAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<MyrAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [MyrAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: MyrAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [MyrAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MyrAccount =
                    MyrAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("swiftCode", swiftCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MyrAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MyrAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MyrAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class PhpAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<PhpAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PhpAccountInfo.PaymentRail>>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<PhpAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PhpAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, accountType, bankName, paymentRails, reference, mutableMapOf())

            fun toPhpAccountInfo(): PhpAccountInfo =
                PhpAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .build()

            /**
             * Bank account number
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
            fun accountType(): PhpAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * Name of the beneficiary's bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PhpAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<PhpAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<PhpAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [PhpAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PhpAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<PhpAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PhpAccountInfo.PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(phpAccount: PhpAccount) = apply {
                    accountNumber = phpAccount.accountNumber
                    accountType = phpAccount.accountType
                    bankName = phpAccount.bankName
                    paymentRails = phpAccount.paymentRails.map { it.toMutableList() }
                    reference = phpAccount.reference
                    additionalProperties = phpAccount.additionalProperties.toMutableMap()
                }

                /** Bank account number */
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

                fun accountType(accountType: PhpAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [PhpAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<PhpAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** Name of the beneficiary's bank */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                fun paymentRails(paymentRails: List<PhpAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<PhpAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<PhpAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [PhpAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: PhpAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
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
                 * Returns an immutable instance of [PhpAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PhpAccount =
                    PhpAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PhpAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhpAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhpAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class SgdAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<SgdAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<SgdAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<SgdAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<SgdAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toSgdAccountInfo(): SgdAccountInfo =
                SgdAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Bank account number
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
            fun accountType(): SgdAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * Name of the beneficiary's bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<SgdAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<SgdAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<SgdAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [SgdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SgdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<SgdAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<SgdAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(sgdAccount: SgdAccount) = apply {
                    accountNumber = sgdAccount.accountNumber
                    accountType = sgdAccount.accountType
                    bankName = sgdAccount.bankName
                    paymentRails = sgdAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = sgdAccount.swiftCode
                    reference = sgdAccount.reference
                    additionalProperties = sgdAccount.additionalProperties.toMutableMap()
                }

                /** Bank account number */
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

                fun accountType(accountType: SgdAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [SgdAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<SgdAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** Name of the beneficiary's bank */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                fun paymentRails(paymentRails: List<SgdAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<SgdAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<SgdAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [SgdAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: SgdAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [SgdAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SgdAccount =
                    SgdAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("swiftCode", swiftCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SgdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SgdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SgdAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class ThbAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<ThbAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<ThbAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<ThbAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<ThbAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toThbAccountInfo(): ThbAccountInfo =
                ThbAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Thai bank account number
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
            fun accountType(): ThbAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<ThbAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<ThbAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<ThbAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [ThbAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ThbAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<ThbAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<ThbAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(thbAccount: ThbAccount) = apply {
                    accountNumber = thbAccount.accountNumber
                    accountType = thbAccount.accountType
                    bankName = thbAccount.bankName
                    paymentRails = thbAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = thbAccount.swiftCode
                    reference = thbAccount.reference
                    additionalProperties = thbAccount.additionalProperties.toMutableMap()
                }

                /** Thai bank account number */
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

                fun accountType(accountType: ThbAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [ThbAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<ThbAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<ThbAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<ThbAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<ThbAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [ThbAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: ThbAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [ThbAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ThbAccount =
                    ThbAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("swiftCode", swiftCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ThbAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ThbAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThbAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class VndAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<VndAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<VndAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<VndAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<VndAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toVndAccountInfo(): VndAccountInfo =
                VndAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .swiftCode(swiftCode)
                    .build()

            /**
             * Vietnamese bank account number
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
            fun accountType(): VndAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<VndAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
            fun _accountType(): JsonField<VndAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<VndAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [VndAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [VndAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<VndAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<VndAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(vndAccount: VndAccount) = apply {
                    accountNumber = vndAccount.accountNumber
                    accountType = vndAccount.accountType
                    bankName = vndAccount.bankName
                    paymentRails = vndAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = vndAccount.swiftCode
                    reference = vndAccount.reference
                    additionalProperties = vndAccount.additionalProperties.toMutableMap()
                }

                /** Vietnamese bank account number */
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

                fun accountType(accountType: VndAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [VndAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<VndAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<VndAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<VndAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<VndAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [VndAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: VndAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [VndAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .swiftCode()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VndAccount =
                    VndAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("swiftCode", swiftCode),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VndAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                swiftCode()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VndAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VndAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class AedAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, iban, paymentRails, reference, swiftCode, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("AED_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * UAE IBAN (23 characters, starting with AE)
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
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun swiftCode(): String? = swiftCode.getNullable("swiftCode")

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
            fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [AedAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AedAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("AED_ACCOUNT")
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(aedAccount: AedAccount) = apply {
                    accountType = aedAccount.accountType
                    iban = aedAccount.iban
                    paymentRails = aedAccount.paymentRails.map { it.toMutableList() }
                    reference = aedAccount.reference
                    swiftCode = aedAccount.swiftCode
                    additionalProperties = aedAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("AED_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** UAE IBAN (23 characters, starting with AE) */
                fun iban(iban: String) = iban(JsonField.of(iban))

                /**
                 * Sets [Builder.iban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.iban] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun iban(iban: JsonField<String>) = apply { this.iban = iban }

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
                 * Returns an immutable instance of [AedAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AedAccount =
                    AedAccount(
                        accountType,
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        swiftCode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AedAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("AED_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                iban()
                paymentRails().forEach { it.validate() }
                reference()
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
                accountType.let { if (it == JsonValue.from("AED_ACCOUNT")) 1 else 0 } +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (swiftCode.asKnown() == null) 0 else 1)

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

                    val BANK_TRANSFER = of("BANK_TRANSFER")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    BANK_TRANSFER
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
                    BANK_TRANSFER,
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
                        BANK_TRANSFER -> Value.BANK_TRANSFER
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
                        BANK_TRANSFER -> Known.BANK_TRANSFER
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

                return other is AedAccount &&
                    accountType == other.accountType &&
                    iban == other.iban &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    iban,
                    paymentRails,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AedAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        class KesAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("KES_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Kenyan mobile money phone number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [KesAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [KesAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("KES_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(kesAccount: KesAccount) = apply {
                    accountType = kesAccount.accountType
                    paymentRails = kesAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = kesAccount.phoneNumber
                    provider = kesAccount.provider
                    reference = kesAccount.reference
                    additionalProperties = kesAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("KES_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** Kenyan mobile money phone number */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [KesAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): KesAccount =
                    KesAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): KesAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("KES_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("KES_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is KesAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KesAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class MwkAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("MWK_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [MwkAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MwkAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("MWK_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mwkAccount: MwkAccount) = apply {
                    accountType = mwkAccount.accountType
                    paymentRails = mwkAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = mwkAccount.phoneNumber
                    provider = mwkAccount.provider
                    reference = mwkAccount.reference
                    additionalProperties = mwkAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("MWK_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** The phone number in international format */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [MwkAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MwkAccount =
                    MwkAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MwkAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("MWK_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("MWK_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is MwkAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MwkAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class RwfAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("RWF_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Rwandan mobile money phone number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [RwfAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [RwfAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("RWF_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(rwfAccount: RwfAccount) = apply {
                    accountType = rwfAccount.accountType
                    paymentRails = rwfAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = rwfAccount.phoneNumber
                    provider = rwfAccount.provider
                    reference = rwfAccount.reference
                    additionalProperties = rwfAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("RWF_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** Rwandan mobile money phone number */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [RwfAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RwfAccount =
                    RwfAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RwfAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("RWF_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("RWF_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is RwfAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RwfAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class TzsAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("TZS_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Tanzanian mobile money phone number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [TzsAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TzsAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("TZS_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tzsAccount: TzsAccount) = apply {
                    accountType = tzsAccount.accountType
                    paymentRails = tzsAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = tzsAccount.phoneNumber
                    provider = tzsAccount.provider
                    reference = tzsAccount.reference
                    additionalProperties = tzsAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("TZS_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** Tanzanian mobile money phone number */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [TzsAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TzsAccount =
                    TzsAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TzsAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("TZS_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("TZS_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is TzsAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TzsAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class UgxAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("UGX_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [UgxAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UgxAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("UGX_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ugxAccount: UgxAccount) = apply {
                    accountType = ugxAccount.accountType
                    paymentRails = ugxAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = ugxAccount.phoneNumber
                    provider = ugxAccount.provider
                    reference = ugxAccount.reference
                    additionalProperties = ugxAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("UGX_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** The phone number in international format */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [UgxAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UgxAccount =
                    UgxAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UgxAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("UGX_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("UGX_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is UgxAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UgxAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class XofAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val region: JsonField<Region>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            ) : this(
                accountType,
                paymentRails,
                phoneNumber,
                provider,
                reference,
                region,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("XOF_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * Country code within the West African CFA franc zone
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun region(): Region = region.getRequired("region")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

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
                 * Returns a mutable builder for constructing an instance of [XofAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * .region()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [XofAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("XOF_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var region: JsonField<Region>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(xofAccount: XofAccount) = apply {
                    accountType = xofAccount.accountType
                    paymentRails = xofAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = xofAccount.phoneNumber
                    provider = xofAccount.provider
                    reference = xofAccount.reference
                    region = xofAccount.region
                    additionalProperties = xofAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("XOF_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** The phone number in international format */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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

                /** Country code within the West African CFA franc zone */
                fun region(region: Region) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [Region] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<Region>) = apply { this.region = region }

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
                 * Returns an immutable instance of [XofAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * .region()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): XofAccount =
                    XofAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        checkRequired("region", region),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): XofAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("XOF_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
                reference()
                region().validate()
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
                accountType.let { if (it == JsonValue.from("XOF_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (region.asKnown()?.validity() ?: 0)

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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

            /** Country code within the West African CFA franc zone */
            class Region @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val BJ = of("BJ")

                    val CI = of("CI")

                    val SN = of("SN")

                    val TG = of("TG")

                    fun of(value: String) = Region(JsonField.of(value))
                }

                /** An enum containing [Region]'s known values. */
                enum class Known {
                    BJ,
                    CI,
                    SN,
                    TG,
                }

                /**
                 * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Region] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BJ,
                    CI,
                    SN,
                    TG,
                    /**
                     * An enum member indicating that [Region] was instantiated with an unknown
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
                        BJ -> Value.BJ
                        CI -> Value.CI
                        SN -> Value.SN
                        TG -> Value.TG
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
                        BJ -> Known.BJ
                        CI -> Known.CI
                        SN -> Known.SN
                        TG -> Known.TG
                        else -> throw LightsparkGridInvalidDataException("Unknown Region: $value")
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

                fun validate(): Region = apply {
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

                    return other is Region && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is XofAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    region == other.region &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    region,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "XofAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, region=$region, additionalProperties=$additionalProperties}"
        }

        class ZarAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, accountType, bankName, paymentRails, reference, mutableMapOf())

            /**
             * South African bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("ZAR_ACCOUNT")
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
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

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
                 * Returns a mutable builder for constructing an instance of [ZarAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ZarAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("ZAR_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(zarAccount: ZarAccount) = apply {
                    accountNumber = zarAccount.accountNumber
                    accountType = zarAccount.accountType
                    bankName = zarAccount.bankName
                    paymentRails = zarAccount.paymentRails.map { it.toMutableList() }
                    reference = zarAccount.reference
                    additionalProperties = zarAccount.additionalProperties.toMutableMap()
                }

                /** South African bank account number */
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("ZAR_ACCOUNT")
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
                 * Returns an immutable instance of [ZarAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ZarAccount =
                    ZarAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ZarAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("ZAR_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
                paymentRails().forEach { it.validate() }
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("ZAR_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
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

                    val BANK_TRANSFER = of("BANK_TRANSFER")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    BANK_TRANSFER
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
                    BANK_TRANSFER,
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
                        BANK_TRANSFER -> Value.BANK_TRANSFER
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
                        BANK_TRANSFER -> Known.BANK_TRANSFER
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

                return other is ZarAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ZarAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class ZmwAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("ZMW_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Zambian mobile money phone number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [ZmwAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ZmwAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("ZMW_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(zmwAccount: ZmwAccount) = apply {
                    accountType = zmwAccount.accountType
                    paymentRails = zmwAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = zmwAccount.phoneNumber
                    provider = zmwAccount.provider
                    reference = zmwAccount.reference
                    additionalProperties = zmwAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("ZMW_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** Zambian mobile money phone number */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [ZmwAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ZmwAccount =
                    ZmwAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ZmwAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("ZMW_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("ZMW_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is ZmwAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ZmwAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class BwpAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, provider, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("BWP_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
                 * Returns a mutable builder for constructing an instance of [BwpAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BwpAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("BWP_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bwpAccount: BwpAccount) = apply {
                    accountType = bwpAccount.accountType
                    paymentRails = bwpAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = bwpAccount.phoneNumber
                    provider = bwpAccount.provider
                    reference = bwpAccount.reference
                    additionalProperties = bwpAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("BWP_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** The phone number in international format */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [BwpAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BwpAccount =
                    BwpAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BwpAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("BWP_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
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
                accountType.let { if (it == JsonValue.from("BWP_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

                return other is BwpAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BwpAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class XafAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val region: JsonField<Region>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            ) : this(
                accountType,
                paymentRails,
                phoneNumber,
                provider,
                reference,
                region,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("XAF_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The mobile money provider name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * Country code within the Central African CFA franc zone
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun region(): Region = region.getRequired("region")

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

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
                 * Returns a mutable builder for constructing an instance of [XafAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * .region()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [XafAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("XAF_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var region: JsonField<Region>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(xafAccount: XafAccount) = apply {
                    accountType = xafAccount.accountType
                    paymentRails = xafAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = xafAccount.phoneNumber
                    provider = xafAccount.provider
                    reference = xafAccount.reference
                    region = xafAccount.region
                    additionalProperties = xafAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("XAF_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** The phone number in international format */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The mobile money provider name */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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

                /** Country code within the Central African CFA franc zone */
                fun region(region: Region) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [Region] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<Region>) = apply { this.region = region }

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
                 * Returns an immutable instance of [XafAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .reference()
                 * .region()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): XafAccount =
                    XafAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("reference", reference),
                        checkRequired("region", region),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): XafAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("XAF_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
                reference()
                region().validate()
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
                accountType.let { if (it == JsonValue.from("XAF_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (region.asKnown()?.validity() ?: 0)

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

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    MOBILE_MONEY
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
                    MOBILE_MONEY,
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
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        MOBILE_MONEY -> Known.MOBILE_MONEY
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

            /** Country code within the Central African CFA franc zone */
            class Region @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val CM = of("CM")

                    val CG = of("CG")

                    fun of(value: String) = Region(JsonField.of(value))
                }

                /** An enum containing [Region]'s known values. */
                enum class Known {
                    CM,
                    CG,
                }

                /**
                 * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Region] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CM,
                    CG,
                    /**
                     * An enum member indicating that [Region] was instantiated with an unknown
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
                        CM -> Value.CM
                        CG -> Value.CG
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
                        CM -> Known.CM
                        CG -> Known.CG
                        else -> throw LightsparkGridInvalidDataException("Unknown Region: $value")
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

                fun validate(): Region = apply {
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

                    return other is Region && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is XafAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    reference == other.reference &&
                    region == other.region &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    reference,
                    region,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "XafAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, reference=$reference, region=$region, additionalProperties=$additionalProperties}"
        }

        class PaymentSparkWalletInfo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val address: JsonField<String>,
            private val assetType: JsonField<AssetType>,
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
                assetType: JsonField<AssetType> = JsonMissing.of(),
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
             * Type of asset
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun assetType(): AssetType = assetType.getRequired("assetType")

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
            fun _assetType(): JsonField<AssetType> = assetType

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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentSparkWalletInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * .assetType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentSparkWalletInfo]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SPARK_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType>? = null
                private var invoice: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentSparkWalletInfo: PaymentSparkWalletInfo) = apply {
                    accountType = paymentSparkWalletInfo.accountType
                    address = paymentSparkWalletInfo.address
                    assetType = paymentSparkWalletInfo.assetType
                    invoice = paymentSparkWalletInfo.invoice
                    additionalProperties =
                        paymentSparkWalletInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentSparkWalletInfo].
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
                fun build(): PaymentSparkWalletInfo =
                    PaymentSparkWalletInfo(
                        accountType,
                        checkRequired("address", address),
                        checkRequired("assetType", assetType),
                        invoice,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentSparkWalletInfo = apply {
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
                assetType().validate()
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
                    (assetType.asKnown()?.validity() ?: 0) +
                    (if (invoice.asKnown() == null) 0 else 1)

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

                    val BTC = of("BTC")

                    val USDB = of("USDB")

                    fun of(value: String) = AssetType(JsonField.of(value))
                }

                /** An enum containing [AssetType]'s known values. */
                enum class Known {
                    BTC,
                    USDB,
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
                    BTC,
                    USDB,
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
                        BTC -> Value.BTC
                        USDB -> Value.USDB
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
                        BTC -> Known.BTC
                        USDB -> Known.USDB
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

                return other is PaymentSparkWalletInfo &&
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
                "PaymentSparkWalletInfo{accountType=$accountType, address=$address, assetType=$assetType, invoice=$invoice, additionalProperties=$additionalProperties}"
        }

        class PaymentLightningInvoiceInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentLightningInvoiceInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .invoice()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentLightningInvoiceInfo]. */
            class Builder internal constructor() {

                private var invoice: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentLightningInvoiceInfo: PaymentLightningInvoiceInfo) =
                    apply {
                        invoice = paymentLightningInvoiceInfo.invoice
                        accountType = paymentLightningInvoiceInfo.accountType
                        additionalProperties =
                            paymentLightningInvoiceInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentLightningInvoiceInfo].
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
                fun build(): PaymentLightningInvoiceInfo =
                    PaymentLightningInvoiceInfo(
                        checkRequired("invoice", invoice),
                        accountType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentLightningInvoiceInfo = apply {
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

                return other is PaymentLightningInvoiceInfo &&
                    invoice == other.invoice &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(invoice, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentLightningInvoiceInfo{invoice=$invoice, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        class PaymentSolanaWalletInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentSolanaWalletInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentSolanaWalletInfo]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SOLANA_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentSolanaWalletInfo: PaymentSolanaWalletInfo) = apply {
                    accountType = paymentSolanaWalletInfo.accountType
                    address = paymentSolanaWalletInfo.address
                    assetType = paymentSolanaWalletInfo.assetType
                    additionalProperties =
                        paymentSolanaWalletInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentSolanaWalletInfo].
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
                fun build(): PaymentSolanaWalletInfo =
                    PaymentSolanaWalletInfo(
                        accountType,
                        checkRequired("address", address),
                        assetType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentSolanaWalletInfo = apply {
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

                return other is PaymentSolanaWalletInfo &&
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
                "PaymentSolanaWalletInfo{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class PaymentTronWalletInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentTronWalletInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentTronWalletInfo]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("TRON_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentTronWalletInfo: PaymentTronWalletInfo) = apply {
                    accountType = paymentTronWalletInfo.accountType
                    address = paymentTronWalletInfo.address
                    assetType = paymentTronWalletInfo.assetType
                    additionalProperties = paymentTronWalletInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentTronWalletInfo].
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
                fun build(): PaymentTronWalletInfo =
                    PaymentTronWalletInfo(
                        accountType,
                        checkRequired("address", address),
                        assetType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentTronWalletInfo = apply {
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

                return other is PaymentTronWalletInfo &&
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
                "PaymentTronWalletInfo{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class PaymentPolygonWalletInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentPolygonWalletInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentPolygonWalletInfo]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("POLYGON_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentPolygonWalletInfo: PaymentPolygonWalletInfo) = apply {
                    accountType = paymentPolygonWalletInfo.accountType
                    address = paymentPolygonWalletInfo.address
                    assetType = paymentPolygonWalletInfo.assetType
                    additionalProperties =
                        paymentPolygonWalletInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentPolygonWalletInfo].
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
                fun build(): PaymentPolygonWalletInfo =
                    PaymentPolygonWalletInfo(
                        accountType,
                        checkRequired("address", address),
                        assetType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentPolygonWalletInfo = apply {
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

                return other is PaymentPolygonWalletInfo &&
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
                "PaymentPolygonWalletInfo{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
        }

        class PaymentBaseWalletInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentBaseWalletInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentBaseWalletInfo]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("BASE_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentBaseWalletInfo: PaymentBaseWalletInfo) = apply {
                    accountType = paymentBaseWalletInfo.accountType
                    address = paymentBaseWalletInfo.address
                    assetType = paymentBaseWalletInfo.assetType
                    additionalProperties = paymentBaseWalletInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentBaseWalletInfo].
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
                fun build(): PaymentBaseWalletInfo =
                    PaymentBaseWalletInfo(
                        accountType,
                        checkRequired("address", address),
                        assetType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentBaseWalletInfo = apply {
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

                return other is PaymentBaseWalletInfo &&
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
                "PaymentBaseWalletInfo{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
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
