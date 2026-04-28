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
import com.lightspark.grid.models.platform.externalaccounts.AedAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.BdtAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.BwpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.CadAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.DkkAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EgpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GbpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GhsAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GtqAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.HkdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.HtgAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.IdrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.InrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.JmdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.KesAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MwkAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MxnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MyrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.NgnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.PhpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.PkrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.RwfAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.SgdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ThbAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.TzsAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UgxAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.VndAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.XafAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.XofAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ZarAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ZmwAccountInfo
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
         * `AccountOrWalletInfo.ofPaymentBrlAccount(paymentBrlAccount)`.
         */
        fun accountOrWalletInfo(paymentBrlAccount: AccountOrWalletInfo.PaymentBrlAccountInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentBrlAccount(paymentBrlAccount))

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
         * `AccountOrWalletInfo.ofBdtAccount(bdtAccount)`.
         */
        fun accountOrWalletInfo(bdtAccount: AccountOrWalletInfo.BdtAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofBdtAccount(bdtAccount))

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
         *     .accountNumber(accountNumber)
         *     .build()
         * ```
         */
        fun arsAccountAccountOrWalletInfo(accountNumber: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.ArsAccount.builder().accountNumber(accountNumber).build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentCopAccount(paymentCopAccount)`.
         */
        fun accountOrWalletInfo(paymentCopAccount: AccountOrWalletInfo.PaymentCopAccountInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentCopAccount(paymentCopAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofEgpAccount(egpAccount)`.
         */
        fun accountOrWalletInfo(egpAccount: AccountOrWalletInfo.EgpAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofEgpAccount(egpAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofGhsAccount(ghsAccount)`.
         */
        fun accountOrWalletInfo(ghsAccount: AccountOrWalletInfo.GhsAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofGhsAccount(ghsAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofGtqAccount(gtqAccount)`.
         */
        fun accountOrWalletInfo(gtqAccount: AccountOrWalletInfo.GtqAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofGtqAccount(gtqAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofHtgAccount(htgAccount)`.
         */
        fun accountOrWalletInfo(htgAccount: AccountOrWalletInfo.HtgAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofHtgAccount(htgAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofJmdAccount(jmdAccount)`.
         */
        fun accountOrWalletInfo(jmdAccount: AccountOrWalletInfo.JmdAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofJmdAccount(jmdAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPkrAccount(pkrAccount)`.
         */
        fun accountOrWalletInfo(pkrAccount: AccountOrWalletInfo.PkrAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPkrAccount(pkrAccount))

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

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentEthereum(paymentEthereum)`.
         */
        fun accountOrWalletInfo(paymentEthereum: AccountOrWalletInfo.PaymentEthereumWalletInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentEthereum(paymentEthereum))

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
        private val paymentBrlAccount: PaymentBrlAccountInfo? = null,
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
        private val bdtAccount: BdtAccount? = null,
        private val arsAccount: ArsAccount? = null,
        private val paymentCopAccount: PaymentCopAccountInfo? = null,
        private val egpAccount: EgpAccount? = null,
        private val ghsAccount: GhsAccount? = null,
        private val gtqAccount: GtqAccount? = null,
        private val htgAccount: HtgAccount? = null,
        private val jmdAccount: JmdAccount? = null,
        private val pkrAccount: PkrAccount? = null,
        private val paymentSpark: PaymentSparkWalletInfo? = null,
        private val paymentLightningInvoice: PaymentLightningInvoiceInfo? = null,
        private val paymentSolana: PaymentSolanaWalletInfo? = null,
        private val paymentTron: PaymentTronWalletInfo? = null,
        private val paymentPolygon: PaymentPolygonWalletInfo? = null,
        private val paymentBase: PaymentBaseWalletInfo? = null,
        private val paymentEthereum: PaymentEthereumWalletInfo? = null,
        private val embeddedWallet: EmbeddedWallet? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usdAccount(): UsdAccount? = usdAccount

        fun paymentBrlAccount(): PaymentBrlAccountInfo? = paymentBrlAccount

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

        fun bdtAccount(): BdtAccount? = bdtAccount

        fun arsAccount(): ArsAccount? = arsAccount

        fun paymentCopAccount(): PaymentCopAccountInfo? = paymentCopAccount

        fun egpAccount(): EgpAccount? = egpAccount

        fun ghsAccount(): GhsAccount? = ghsAccount

        fun gtqAccount(): GtqAccount? = gtqAccount

        fun htgAccount(): HtgAccount? = htgAccount

        fun jmdAccount(): JmdAccount? = jmdAccount

        fun pkrAccount(): PkrAccount? = pkrAccount

        fun paymentSpark(): PaymentSparkWalletInfo? = paymentSpark

        fun paymentLightningInvoice(): PaymentLightningInvoiceInfo? = paymentLightningInvoice

        fun paymentSolana(): PaymentSolanaWalletInfo? = paymentSolana

        fun paymentTron(): PaymentTronWalletInfo? = paymentTron

        fun paymentPolygon(): PaymentPolygonWalletInfo? = paymentPolygon

        fun paymentBase(): PaymentBaseWalletInfo? = paymentBase

        fun paymentEthereum(): PaymentEthereumWalletInfo? = paymentEthereum

        fun embeddedWallet(): EmbeddedWallet? = embeddedWallet

        fun isUsdAccount(): Boolean = usdAccount != null

        fun isPaymentBrlAccount(): Boolean = paymentBrlAccount != null

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

        fun isBdtAccount(): Boolean = bdtAccount != null

        fun isArsAccount(): Boolean = arsAccount != null

        fun isPaymentCopAccount(): Boolean = paymentCopAccount != null

        fun isEgpAccount(): Boolean = egpAccount != null

        fun isGhsAccount(): Boolean = ghsAccount != null

        fun isGtqAccount(): Boolean = gtqAccount != null

        fun isHtgAccount(): Boolean = htgAccount != null

        fun isJmdAccount(): Boolean = jmdAccount != null

        fun isPkrAccount(): Boolean = pkrAccount != null

        fun isPaymentSpark(): Boolean = paymentSpark != null

        fun isPaymentLightningInvoice(): Boolean = paymentLightningInvoice != null

        fun isPaymentSolana(): Boolean = paymentSolana != null

        fun isPaymentTron(): Boolean = paymentTron != null

        fun isPaymentPolygon(): Boolean = paymentPolygon != null

        fun isPaymentBase(): Boolean = paymentBase != null

        fun isPaymentEthereum(): Boolean = paymentEthereum != null

        fun isEmbeddedWallet(): Boolean = embeddedWallet != null

        fun asUsdAccount(): UsdAccount = usdAccount.getOrThrow("usdAccount")

        fun asPaymentBrlAccount(): PaymentBrlAccountInfo =
            paymentBrlAccount.getOrThrow("paymentBrlAccount")

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

        fun asBdtAccount(): BdtAccount = bdtAccount.getOrThrow("bdtAccount")

        fun asArsAccount(): ArsAccount = arsAccount.getOrThrow("arsAccount")

        fun asPaymentCopAccount(): PaymentCopAccountInfo =
            paymentCopAccount.getOrThrow("paymentCopAccount")

        fun asEgpAccount(): EgpAccount = egpAccount.getOrThrow("egpAccount")

        fun asGhsAccount(): GhsAccount = ghsAccount.getOrThrow("ghsAccount")

        fun asGtqAccount(): GtqAccount = gtqAccount.getOrThrow("gtqAccount")

        fun asHtgAccount(): HtgAccount = htgAccount.getOrThrow("htgAccount")

        fun asJmdAccount(): JmdAccount = jmdAccount.getOrThrow("jmdAccount")

        fun asPkrAccount(): PkrAccount = pkrAccount.getOrThrow("pkrAccount")

        fun asPaymentSpark(): PaymentSparkWalletInfo = paymentSpark.getOrThrow("paymentSpark")

        fun asPaymentLightningInvoice(): PaymentLightningInvoiceInfo =
            paymentLightningInvoice.getOrThrow("paymentLightningInvoice")

        fun asPaymentSolana(): PaymentSolanaWalletInfo = paymentSolana.getOrThrow("paymentSolana")

        fun asPaymentTron(): PaymentTronWalletInfo = paymentTron.getOrThrow("paymentTron")

        fun asPaymentPolygon(): PaymentPolygonWalletInfo =
            paymentPolygon.getOrThrow("paymentPolygon")

        fun asPaymentBase(): PaymentBaseWalletInfo = paymentBase.getOrThrow("paymentBase")

        fun asPaymentEthereum(): PaymentEthereumWalletInfo =
            paymentEthereum.getOrThrow("paymentEthereum")

        fun asEmbeddedWallet(): EmbeddedWallet = embeddedWallet.getOrThrow("embeddedWallet")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usdAccount != null -> visitor.visitUsdAccount(usdAccount)
                paymentBrlAccount != null -> visitor.visitPaymentBrlAccount(paymentBrlAccount)
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
                bdtAccount != null -> visitor.visitBdtAccount(bdtAccount)
                arsAccount != null -> visitor.visitArsAccount(arsAccount)
                paymentCopAccount != null -> visitor.visitPaymentCopAccount(paymentCopAccount)
                egpAccount != null -> visitor.visitEgpAccount(egpAccount)
                ghsAccount != null -> visitor.visitGhsAccount(ghsAccount)
                gtqAccount != null -> visitor.visitGtqAccount(gtqAccount)
                htgAccount != null -> visitor.visitHtgAccount(htgAccount)
                jmdAccount != null -> visitor.visitJmdAccount(jmdAccount)
                pkrAccount != null -> visitor.visitPkrAccount(pkrAccount)
                paymentSpark != null -> visitor.visitPaymentSpark(paymentSpark)
                paymentLightningInvoice != null ->
                    visitor.visitPaymentLightningInvoice(paymentLightningInvoice)
                paymentSolana != null -> visitor.visitPaymentSolana(paymentSolana)
                paymentTron != null -> visitor.visitPaymentTron(paymentTron)
                paymentPolygon != null -> visitor.visitPaymentPolygon(paymentPolygon)
                paymentBase != null -> visitor.visitPaymentBase(paymentBase)
                paymentEthereum != null -> visitor.visitPaymentEthereum(paymentEthereum)
                embeddedWallet != null -> visitor.visitEmbeddedWallet(embeddedWallet)
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

                    override fun visitPaymentBrlAccount(paymentBrlAccount: PaymentBrlAccountInfo) {
                        paymentBrlAccount.validate()
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

                    override fun visitBdtAccount(bdtAccount: BdtAccount) {
                        bdtAccount.validate()
                    }

                    override fun visitArsAccount(arsAccount: ArsAccount) {
                        arsAccount.validate()
                    }

                    override fun visitPaymentCopAccount(paymentCopAccount: PaymentCopAccountInfo) {
                        paymentCopAccount.validate()
                    }

                    override fun visitEgpAccount(egpAccount: EgpAccount) {
                        egpAccount.validate()
                    }

                    override fun visitGhsAccount(ghsAccount: GhsAccount) {
                        ghsAccount.validate()
                    }

                    override fun visitGtqAccount(gtqAccount: GtqAccount) {
                        gtqAccount.validate()
                    }

                    override fun visitHtgAccount(htgAccount: HtgAccount) {
                        htgAccount.validate()
                    }

                    override fun visitJmdAccount(jmdAccount: JmdAccount) {
                        jmdAccount.validate()
                    }

                    override fun visitPkrAccount(pkrAccount: PkrAccount) {
                        pkrAccount.validate()
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

                    override fun visitPaymentEthereum(paymentEthereum: PaymentEthereumWalletInfo) {
                        paymentEthereum.validate()
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

                    override fun visitPaymentBrlAccount(paymentBrlAccount: PaymentBrlAccountInfo) =
                        paymentBrlAccount.validity()

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

                    override fun visitBdtAccount(bdtAccount: BdtAccount) = bdtAccount.validity()

                    override fun visitArsAccount(arsAccount: ArsAccount) = arsAccount.validity()

                    override fun visitPaymentCopAccount(paymentCopAccount: PaymentCopAccountInfo) =
                        paymentCopAccount.validity()

                    override fun visitEgpAccount(egpAccount: EgpAccount) = egpAccount.validity()

                    override fun visitGhsAccount(ghsAccount: GhsAccount) = ghsAccount.validity()

                    override fun visitGtqAccount(gtqAccount: GtqAccount) = gtqAccount.validity()

                    override fun visitHtgAccount(htgAccount: HtgAccount) = htgAccount.validity()

                    override fun visitJmdAccount(jmdAccount: JmdAccount) = jmdAccount.validity()

                    override fun visitPkrAccount(pkrAccount: PkrAccount) = pkrAccount.validity()

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

                    override fun visitPaymentEthereum(paymentEthereum: PaymentEthereumWalletInfo) =
                        paymentEthereum.validity()

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
                paymentBrlAccount == other.paymentBrlAccount &&
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
                bdtAccount == other.bdtAccount &&
                arsAccount == other.arsAccount &&
                paymentCopAccount == other.paymentCopAccount &&
                egpAccount == other.egpAccount &&
                ghsAccount == other.ghsAccount &&
                gtqAccount == other.gtqAccount &&
                htgAccount == other.htgAccount &&
                jmdAccount == other.jmdAccount &&
                pkrAccount == other.pkrAccount &&
                paymentSpark == other.paymentSpark &&
                paymentLightningInvoice == other.paymentLightningInvoice &&
                paymentSolana == other.paymentSolana &&
                paymentTron == other.paymentTron &&
                paymentPolygon == other.paymentPolygon &&
                paymentBase == other.paymentBase &&
                paymentEthereum == other.paymentEthereum &&
                embeddedWallet == other.embeddedWallet
        }

        override fun hashCode(): Int =
            Objects.hash(
                usdAccount,
                paymentBrlAccount,
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
                bdtAccount,
                arsAccount,
                paymentCopAccount,
                egpAccount,
                ghsAccount,
                gtqAccount,
                htgAccount,
                jmdAccount,
                pkrAccount,
                paymentSpark,
                paymentLightningInvoice,
                paymentSolana,
                paymentTron,
                paymentPolygon,
                paymentBase,
                paymentEthereum,
                embeddedWallet,
            )

        override fun toString(): String =
            when {
                usdAccount != null -> "AccountOrWalletInfo{usdAccount=$usdAccount}"
                paymentBrlAccount != null ->
                    "AccountOrWalletInfo{paymentBrlAccount=$paymentBrlAccount}"
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
                bdtAccount != null -> "AccountOrWalletInfo{bdtAccount=$bdtAccount}"
                arsAccount != null -> "AccountOrWalletInfo{arsAccount=$arsAccount}"
                paymentCopAccount != null ->
                    "AccountOrWalletInfo{paymentCopAccount=$paymentCopAccount}"
                egpAccount != null -> "AccountOrWalletInfo{egpAccount=$egpAccount}"
                ghsAccount != null -> "AccountOrWalletInfo{ghsAccount=$ghsAccount}"
                gtqAccount != null -> "AccountOrWalletInfo{gtqAccount=$gtqAccount}"
                htgAccount != null -> "AccountOrWalletInfo{htgAccount=$htgAccount}"
                jmdAccount != null -> "AccountOrWalletInfo{jmdAccount=$jmdAccount}"
                pkrAccount != null -> "AccountOrWalletInfo{pkrAccount=$pkrAccount}"
                paymentSpark != null -> "AccountOrWalletInfo{paymentSpark=$paymentSpark}"
                paymentLightningInvoice != null ->
                    "AccountOrWalletInfo{paymentLightningInvoice=$paymentLightningInvoice}"
                paymentSolana != null -> "AccountOrWalletInfo{paymentSolana=$paymentSolana}"
                paymentTron != null -> "AccountOrWalletInfo{paymentTron=$paymentTron}"
                paymentPolygon != null -> "AccountOrWalletInfo{paymentPolygon=$paymentPolygon}"
                paymentBase != null -> "AccountOrWalletInfo{paymentBase=$paymentBase}"
                paymentEthereum != null -> "AccountOrWalletInfo{paymentEthereum=$paymentEthereum}"
                embeddedWallet != null -> "AccountOrWalletInfo{embeddedWallet=$embeddedWallet}"
                _json != null -> "AccountOrWalletInfo{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
            }

        companion object {

            fun ofUsdAccount(usdAccount: UsdAccount) = AccountOrWalletInfo(usdAccount = usdAccount)

            fun ofPaymentBrlAccount(paymentBrlAccount: PaymentBrlAccountInfo) =
                AccountOrWalletInfo(paymentBrlAccount = paymentBrlAccount)

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

            fun ofBdtAccount(bdtAccount: BdtAccount) = AccountOrWalletInfo(bdtAccount = bdtAccount)

            fun ofArsAccount(arsAccount: ArsAccount) = AccountOrWalletInfo(arsAccount = arsAccount)

            fun ofPaymentCopAccount(paymentCopAccount: PaymentCopAccountInfo) =
                AccountOrWalletInfo(paymentCopAccount = paymentCopAccount)

            fun ofEgpAccount(egpAccount: EgpAccount) = AccountOrWalletInfo(egpAccount = egpAccount)

            fun ofGhsAccount(ghsAccount: GhsAccount) = AccountOrWalletInfo(ghsAccount = ghsAccount)

            fun ofGtqAccount(gtqAccount: GtqAccount) = AccountOrWalletInfo(gtqAccount = gtqAccount)

            fun ofHtgAccount(htgAccount: HtgAccount) = AccountOrWalletInfo(htgAccount = htgAccount)

            fun ofJmdAccount(jmdAccount: JmdAccount) = AccountOrWalletInfo(jmdAccount = jmdAccount)

            fun ofPkrAccount(pkrAccount: PkrAccount) = AccountOrWalletInfo(pkrAccount = pkrAccount)

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

            fun ofPaymentEthereum(paymentEthereum: PaymentEthereumWalletInfo) =
                AccountOrWalletInfo(paymentEthereum = paymentEthereum)

            fun ofEmbeddedWallet(embeddedWallet: EmbeddedWallet) =
                AccountOrWalletInfo(embeddedWallet = embeddedWallet)
        }

        /**
         * An interface that defines how to map each variant of [AccountOrWalletInfo] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitUsdAccount(usdAccount: UsdAccount): T

            fun visitPaymentBrlAccount(paymentBrlAccount: PaymentBrlAccountInfo): T

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

            fun visitBdtAccount(bdtAccount: BdtAccount): T

            fun visitArsAccount(arsAccount: ArsAccount): T

            fun visitPaymentCopAccount(paymentCopAccount: PaymentCopAccountInfo): T

            fun visitEgpAccount(egpAccount: EgpAccount): T

            fun visitGhsAccount(ghsAccount: GhsAccount): T

            fun visitGtqAccount(gtqAccount: GtqAccount): T

            fun visitHtgAccount(htgAccount: HtgAccount): T

            fun visitJmdAccount(jmdAccount: JmdAccount): T

            fun visitPkrAccount(pkrAccount: PkrAccount): T

            fun visitPaymentSpark(paymentSpark: PaymentSparkWalletInfo): T

            fun visitPaymentLightningInvoice(
                paymentLightningInvoice: PaymentLightningInvoiceInfo
            ): T

            fun visitPaymentSolana(paymentSolana: PaymentSolanaWalletInfo): T

            fun visitPaymentTron(paymentTron: PaymentTronWalletInfo): T

            fun visitPaymentPolygon(paymentPolygon: PaymentPolygonWalletInfo): T

            fun visitPaymentBase(paymentBase: PaymentBaseWalletInfo): T

            fun visitPaymentEthereum(paymentEthereum: PaymentEthereumWalletInfo): T

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
                    "BDT_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BdtAccount>())?.let {
                            AccountOrWalletInfo(bdtAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "ARS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ArsAccount>())?.let {
                            AccountOrWalletInfo(arsAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "EGP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EgpAccount>())?.let {
                            AccountOrWalletInfo(egpAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "GHS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GhsAccount>())?.let {
                            AccountOrWalletInfo(ghsAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "GTQ_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GtqAccount>())?.let {
                            AccountOrWalletInfo(gtqAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "HTG_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<HtgAccount>())?.let {
                            AccountOrWalletInfo(htgAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "JMD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<JmdAccount>())?.let {
                            AccountOrWalletInfo(jmdAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "PKR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PkrAccount>())?.let {
                            AccountOrWalletInfo(pkrAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "EMBEDDED_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<EmbeddedWallet>())?.let {
                            AccountOrWalletInfo(embeddedWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                }

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PaymentBrlAccountInfo>())?.let {
                                AccountOrWalletInfo(paymentBrlAccount = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InrAccountInfo>())?.let {
                                AccountOrWalletInfo(inrAccount = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentCopAccountInfo>())?.let {
                                AccountOrWalletInfo(paymentCopAccount = it, _json = json)
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
                            tryDeserialize(node, jacksonTypeRef<PaymentEthereumWalletInfo>())?.let {
                                AccountOrWalletInfo(paymentEthereum = it, _json = json)
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
                    value.paymentBrlAccount != null ->
                        generator.writeObject(value.paymentBrlAccount)
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
                    value.bdtAccount != null -> generator.writeObject(value.bdtAccount)
                    value.arsAccount != null -> generator.writeObject(value.arsAccount)
                    value.paymentCopAccount != null ->
                        generator.writeObject(value.paymentCopAccount)
                    value.egpAccount != null -> generator.writeObject(value.egpAccount)
                    value.ghsAccount != null -> generator.writeObject(value.ghsAccount)
                    value.gtqAccount != null -> generator.writeObject(value.gtqAccount)
                    value.htgAccount != null -> generator.writeObject(value.htgAccount)
                    value.jmdAccount != null -> generator.writeObject(value.jmdAccount)
                    value.pkrAccount != null -> generator.writeObject(value.pkrAccount)
                    value.paymentSpark != null -> generator.writeObject(value.paymentSpark)
                    value.paymentLightningInvoice != null ->
                        generator.writeObject(value.paymentLightningInvoice)
                    value.paymentSolana != null -> generator.writeObject(value.paymentSolana)
                    value.paymentTron != null -> generator.writeObject(value.paymentTron)
                    value.paymentPolygon != null -> generator.writeObject(value.paymentPolygon)
                    value.paymentBase != null -> generator.writeObject(value.paymentBase)
                    value.paymentEthereum != null -> generator.writeObject(value.paymentEthereum)
                    value.embeddedWallet != null -> generator.writeObject(value.embeddedWallet)
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

        class PaymentBrlAccountInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentBrlAccountInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .qrCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentBrlAccountInfo]. */
            class Builder internal constructor() {

                private var qrCode: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentBrlAccountInfo: PaymentBrlAccountInfo) = apply {
                    qrCode = paymentBrlAccountInfo.qrCode
                    accountType = paymentBrlAccountInfo.accountType
                    additionalProperties = paymentBrlAccountInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentBrlAccountInfo].
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
                fun build(): PaymentBrlAccountInfo =
                    PaymentBrlAccountInfo(
                        checkRequired("qrCode", qrCode),
                        accountType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentBrlAccountInfo = apply {
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

                return other is PaymentBrlAccountInfo &&
                    qrCode == other.qrCode &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(qrCode, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentBrlAccountInfo{qrCode=$qrCode, accountType=$accountType, additionalProperties=$additionalProperties}"
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
             * Danish IBAN (18 characters, starting with DK)
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

                /** Danish IBAN (18 characters, starting with DK) */
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
            private val accountType: JsonField<AedAccountInfo.AccountType>,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<AedAccountInfo.PaymentRail>>,
            private val swiftCode: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<AedAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<AedAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, iban, paymentRails, swiftCode, reference, mutableMapOf())

            fun toAedAccountInfo(): AedAccountInfo =
                AedAccountInfo.builder()
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
            fun accountType(): AedAccountInfo.AccountType = accountType.getRequired("accountType")

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
            fun paymentRails(): List<AedAccountInfo.PaymentRail> =
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
            fun _accountType(): JsonField<AedAccountInfo.AccountType> = accountType

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
            fun _paymentRails(): JsonField<List<AedAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [AedAccount].
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

            /** A builder for [AedAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<AedAccountInfo.AccountType>? = null
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<AedAccountInfo.PaymentRail>>? = null
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(aedAccount: AedAccount) = apply {
                    accountType = aedAccount.accountType
                    iban = aedAccount.iban
                    paymentRails = aedAccount.paymentRails.map { it.toMutableList() }
                    swiftCode = aedAccount.swiftCode
                    reference = aedAccount.reference
                    additionalProperties = aedAccount.additionalProperties.toMutableMap()
                }

                fun accountType(accountType: AedAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [AedAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<AedAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

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

                fun paymentRails(paymentRails: List<AedAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<AedAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<AedAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [AedAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: AedAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [AedAccount].
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
                fun build(): AedAccount =
                    AedAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        swiftCode,
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AedAccount = apply {
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

                return other is AedAccount &&
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
                "AedAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class KesAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonField<KesAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<KesAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<KesAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<KesAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toKesAccountInfo(): KesAccountInfo =
                KesAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): KesAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<KesAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<KesAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<KesAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<KesAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<KesAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: KesAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [KesAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<KesAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<KesAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<KesAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<KesAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [KesAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: KesAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<MwkAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<MwkAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<MwkAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<MwkAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toMwkAccountInfo(): MwkAccountInfo =
                MwkAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): MwkAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<MwkAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<MwkAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<MwkAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<MwkAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<MwkAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: MwkAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [MwkAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<MwkAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<MwkAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<MwkAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<MwkAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [MwkAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: MwkAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<RwfAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<RwfAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<RwfAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<RwfAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toRwfAccountInfo(): RwfAccountInfo =
                RwfAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): RwfAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<RwfAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<RwfAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<RwfAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<RwfAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<RwfAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: RwfAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [RwfAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<RwfAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<RwfAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<RwfAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<RwfAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [RwfAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: RwfAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<TzsAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<TzsAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<TzsAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<TzsAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toTzsAccountInfo(): TzsAccountInfo =
                TzsAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): TzsAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<TzsAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<TzsAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<TzsAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<TzsAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<TzsAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: TzsAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [TzsAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<TzsAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<TzsAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<TzsAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<TzsAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [TzsAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: TzsAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<UgxAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<UgxAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<UgxAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<UgxAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toUgxAccountInfo(): UgxAccountInfo =
                UgxAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): UgxAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<UgxAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<UgxAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<UgxAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<UgxAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<UgxAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: UgxAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [UgxAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<UgxAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<UgxAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<UgxAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<UgxAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [UgxAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: UgxAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<XofAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<XofAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val region: JsonField<XofAccountInfo.Region>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<XofAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<XofAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<XofAccountInfo.Region> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountType,
                paymentRails,
                phoneNumber,
                provider,
                region,
                reference,
                mutableMapOf(),
            )

            fun toXofAccountInfo(): XofAccountInfo =
                XofAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .region(region)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): XofAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<XofAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Country code within the West African CFA franc zone
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun region(): XofAccountInfo.Region = region.getRequired("region")

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
            fun _accountType(): JsonField<XofAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<XofAccountInfo.PaymentRail>> = paymentRails

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
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region")
            @ExcludeMissing
            fun _region(): JsonField<XofAccountInfo.Region> = region

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
                 * Returns a mutable builder for constructing an instance of [XofAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .region()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [XofAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<XofAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<XofAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var region: JsonField<XofAccountInfo.Region>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(xofAccount: XofAccount) = apply {
                    accountType = xofAccount.accountType
                    paymentRails = xofAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = xofAccount.phoneNumber
                    provider = xofAccount.provider
                    region = xofAccount.region
                    reference = xofAccount.reference
                    additionalProperties = xofAccount.additionalProperties.toMutableMap()
                }

                fun accountType(accountType: XofAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [XofAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<XofAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<XofAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<XofAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<XofAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [XofAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: XofAccountInfo.PaymentRail) = apply {
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

                /** Country code within the West African CFA franc zone */
                fun region(region: XofAccountInfo.Region) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed
                 * [XofAccountInfo.Region] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun region(region: JsonField<XofAccountInfo.Region>) = apply {
                    this.region = region
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
                 * Returns an immutable instance of [XofAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .region()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): XofAccount =
                    XofAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("region", region),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): XofAccount = apply {
                if (validated) {
                    return@apply
                }

                accountType().validate()
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
                region().validate()
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
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (region.asKnown()?.validity() ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is XofAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    region == other.region &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    region,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "XofAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, region=$region, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class ZarAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<ZarAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<ZarAccountInfo.PaymentRail>>,
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
                accountType: JsonField<ZarAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<ZarAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, accountType, bankName, paymentRails, reference, mutableMapOf())

            fun toZarAccountInfo(): ZarAccountInfo =
                ZarAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .build()

            /**
             * South African bank account number
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
            fun accountType(): ZarAccountInfo.AccountType = accountType.getRequired("accountType")

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
            fun paymentRails(): List<ZarAccountInfo.PaymentRail> =
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
            fun _accountType(): JsonField<ZarAccountInfo.AccountType> = accountType

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
            fun _paymentRails(): JsonField<List<ZarAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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
                private var accountType: JsonField<ZarAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<ZarAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: ZarAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [ZarAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<ZarAccountInfo.AccountType>) = apply {
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

                fun paymentRails(paymentRails: List<ZarAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<ZarAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<ZarAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [ZarAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: ZarAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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
            private val accountType: JsonField<ZmwAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<ZmwAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<ZmwAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<ZmwAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toZmwAccountInfo(): ZmwAccountInfo =
                ZmwAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): ZmwAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<ZmwAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<ZmwAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<ZmwAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<ZmwAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<ZmwAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: ZmwAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [ZmwAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<ZmwAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<ZmwAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<ZmwAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<ZmwAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [ZmwAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: ZmwAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<BwpAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<BwpAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<BwpAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<BwpAccountInfo.PaymentRail>> = JsonMissing.of(),
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

            fun toBwpAccountInfo(): BwpAccountInfo =
                BwpAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): BwpAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<BwpAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Returns the raw JSON value of [accountType].
             *
             * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountType")
            @ExcludeMissing
            fun _accountType(): JsonField<BwpAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<BwpAccountInfo.PaymentRail>> = paymentRails

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
                 * .accountType()
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

                private var accountType: JsonField<BwpAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<BwpAccountInfo.PaymentRail>>? = null
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

                fun accountType(accountType: BwpAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [BwpAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<BwpAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<BwpAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<BwpAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<BwpAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [BwpAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: BwpAccountInfo.PaymentRail) = apply {
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
                 * .accountType()
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
                        checkRequired("accountType", accountType),
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

                accountType().validate()
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
                (accountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

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
            private val accountType: JsonField<XafAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<XafAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val provider: JsonField<String>,
            private val region: JsonField<XafAccountInfo.Region>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<XafAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<XafAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<XafAccountInfo.Region> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountType,
                paymentRails,
                phoneNumber,
                provider,
                region,
                reference,
                mutableMapOf(),
            )

            fun toXafAccountInfo(): XafAccountInfo =
                XafAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .provider(provider)
                    .region(region)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): XafAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<XafAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

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
             * Country code within the Central African CFA franc zone
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun region(): XafAccountInfo.Region = region.getRequired("region")

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
            fun _accountType(): JsonField<XafAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<XafAccountInfo.PaymentRail>> = paymentRails

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
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region")
            @ExcludeMissing
            fun _region(): JsonField<XafAccountInfo.Region> = region

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
                 * Returns a mutable builder for constructing an instance of [XafAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .region()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [XafAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<XafAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<XafAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var provider: JsonField<String>? = null
                private var region: JsonField<XafAccountInfo.Region>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(xafAccount: XafAccount) = apply {
                    accountType = xafAccount.accountType
                    paymentRails = xafAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = xafAccount.phoneNumber
                    provider = xafAccount.provider
                    region = xafAccount.region
                    reference = xafAccount.reference
                    additionalProperties = xafAccount.additionalProperties.toMutableMap()
                }

                fun accountType(accountType: XafAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [XafAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<XafAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<XafAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<XafAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<XafAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [XafAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: XafAccountInfo.PaymentRail) = apply {
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

                /** Country code within the Central African CFA franc zone */
                fun region(region: XafAccountInfo.Region) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed
                 * [XafAccountInfo.Region] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun region(region: JsonField<XafAccountInfo.Region>) = apply {
                    this.region = region
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
                 * Returns an immutable instance of [XafAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .provider()
                 * .region()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): XafAccount =
                    XafAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("provider", provider),
                        checkRequired("region", region),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): XafAccount = apply {
                if (validated) {
                    return@apply
                }

                accountType().validate()
                paymentRails().forEach { it.validate() }
                phoneNumber()
                provider()
                region().validate()
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
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (provider.asKnown() == null) 0 else 1) +
                    (region.asKnown()?.validity() ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is XafAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    provider == other.provider &&
                    region == other.region &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    provider,
                    region,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "XafAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, region=$region, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class BdtAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<BdtAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<BdtAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val branchCode: JsonField<String>,
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
                accountType: JsonField<BdtAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<BdtAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("branchCode")
                @ExcludeMissing
                branchCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                paymentRails,
                phoneNumber,
                branchCode,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toBdtAccountInfo(): BdtAccountInfo =
                BdtAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .branchCode(branchCode)
                    .swiftCode(swiftCode)
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
            fun accountType(): BdtAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<BdtAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * The branch code
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun branchCode(): String? = branchCode.getNullable("branchCode")

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
            fun _accountType(): JsonField<BdtAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<BdtAccountInfo.PaymentRail>> = paymentRails

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
             * Returns the raw JSON value of [branchCode].
             *
             * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("branchCode")
            @ExcludeMissing
            fun _branchCode(): JsonField<String> = branchCode

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
                 * Returns a mutable builder for constructing an instance of [BdtAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BdtAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<BdtAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<BdtAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var branchCode: JsonField<String> = JsonMissing.of()
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bdtAccount: BdtAccount) = apply {
                    accountNumber = bdtAccount.accountNumber
                    accountType = bdtAccount.accountType
                    paymentRails = bdtAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = bdtAccount.phoneNumber
                    branchCode = bdtAccount.branchCode
                    swiftCode = bdtAccount.swiftCode
                    reference = bdtAccount.reference
                    additionalProperties = bdtAccount.additionalProperties.toMutableMap()
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

                fun accountType(accountType: BdtAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [BdtAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<BdtAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<BdtAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<BdtAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<BdtAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [BdtAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: BdtAccountInfo.PaymentRail) = apply {
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

                /** The branch code */
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
                 * Returns an immutable instance of [BdtAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BdtAccount =
                    BdtAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        branchCode,
                        swiftCode,
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BdtAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                paymentRails().forEach { it.validate() }
                phoneNumber()
                branchCode()
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
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (branchCode.asKnown() == null) 0 else 1) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BdtAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    branchCode == other.branchCode &&
                    swiftCode == other.swiftCode &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    paymentRails,
                    phoneNumber,
                    branchCode,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BdtAccount{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, branchCode=$branchCode, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class ArsAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
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
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("ARS_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

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
                private var accountType: JsonValue = JsonValue.from("ARS_ACCOUNT")
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("ARS_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

            fun validate(): ArsAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("ARS_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
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
                    accountType.let { if (it == JsonValue.from("ARS_ACCOUNT")) 1 else 0 }

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

        class PaymentCopAccountInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentCopAccountInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentUrl()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentCopAccountInfo]. */
            class Builder internal constructor() {

                private var paymentUrl: JsonField<String>? = null
                private var accountType: JsonField<AccountType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentCopAccountInfo: PaymentCopAccountInfo) = apply {
                    paymentUrl = paymentCopAccountInfo.paymentUrl
                    accountType = paymentCopAccountInfo.accountType
                    additionalProperties = paymentCopAccountInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentCopAccountInfo].
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
                fun build(): PaymentCopAccountInfo =
                    PaymentCopAccountInfo(
                        checkRequired("paymentUrl", paymentUrl),
                        accountType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentCopAccountInfo = apply {
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

                return other is PaymentCopAccountInfo &&
                    paymentUrl == other.paymentUrl &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(paymentUrl, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentCopAccountInfo{paymentUrl=$paymentUrl, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        class EgpAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<EgpAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<EgpAccountInfo.PaymentRail>>,
            private val iban: JsonField<String>,
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
                accountType: JsonField<EgpAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<EgpAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
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
                iban,
                swiftCode,
                reference,
                mutableMapOf(),
            )

            fun toEgpAccountInfo(): EgpAccountInfo =
                EgpAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .iban(iban)
                    .swiftCode(swiftCode)
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
            fun accountType(): EgpAccountInfo.AccountType = accountType.getRequired("accountType")

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
            fun paymentRails(): List<EgpAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * Egyptian IBAN (29 characters, starting with EG)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun iban(): String? = iban.getNullable("iban")

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
            fun _accountType(): JsonField<EgpAccountInfo.AccountType> = accountType

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
            fun _paymentRails(): JsonField<List<EgpAccountInfo.PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [iban].
             *
             * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

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
                 * Returns a mutable builder for constructing an instance of [EgpAccount].
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

            /** A builder for [EgpAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<EgpAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<EgpAccountInfo.PaymentRail>>? = null
                private var iban: JsonField<String> = JsonMissing.of()
                private var swiftCode: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(egpAccount: EgpAccount) = apply {
                    accountNumber = egpAccount.accountNumber
                    accountType = egpAccount.accountType
                    bankName = egpAccount.bankName
                    paymentRails = egpAccount.paymentRails.map { it.toMutableList() }
                    iban = egpAccount.iban
                    swiftCode = egpAccount.swiftCode
                    reference = egpAccount.reference
                    additionalProperties = egpAccount.additionalProperties.toMutableMap()
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

                fun accountType(accountType: EgpAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [EgpAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<EgpAccountInfo.AccountType>) = apply {
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

                fun paymentRails(paymentRails: List<EgpAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<EgpAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<EgpAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [EgpAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: EgpAccountInfo.PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /** Egyptian IBAN (29 characters, starting with EG) */
                fun iban(iban: String) = iban(JsonField.of(iban))

                /**
                 * Sets [Builder.iban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.iban] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun iban(iban: JsonField<String>) = apply { this.iban = iban }

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
                 * Returns an immutable instance of [EgpAccount].
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
                fun build(): EgpAccount =
                    EgpAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        iban,
                        swiftCode,
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EgpAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                iban()
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
                    (if (iban.asKnown() == null) 0 else 1) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EgpAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    iban == other.iban &&
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
                    iban,
                    swiftCode,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EgpAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, iban=$iban, swiftCode=$swiftCode, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class GhsAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<GhsAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<GhsAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
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
                accountType: JsonField<GhsAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<GhsAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                paymentRails,
                phoneNumber,
                reference,
                mutableMapOf(),
            )

            fun toGhsAccountInfo(): GhsAccountInfo =
                GhsAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
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
            fun accountType(): GhsAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<GhsAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

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
            fun _accountType(): JsonField<GhsAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<GhsAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [GhsAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [GhsAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<GhsAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<GhsAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ghsAccount: GhsAccount) = apply {
                    accountNumber = ghsAccount.accountNumber
                    accountType = ghsAccount.accountType
                    paymentRails = ghsAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = ghsAccount.phoneNumber
                    reference = ghsAccount.reference
                    additionalProperties = ghsAccount.additionalProperties.toMutableMap()
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

                fun accountType(accountType: GhsAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [GhsAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<GhsAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<GhsAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<GhsAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<GhsAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [GhsAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: GhsAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [GhsAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GhsAccount =
                    GhsAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GhsAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                paymentRails().forEach { it.validate() }
                phoneNumber()
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
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GhsAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    paymentRails,
                    phoneNumber,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GhsAccount{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class GtqAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<GtqAccountInfo.AccountType>,
            private val bankAccountType: JsonField<GtqAccountInfo.BankAccountType>,
            private val paymentRails: JsonField<List<GtqAccountInfo.PaymentRail>>,
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
                accountType: JsonField<GtqAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankAccountType")
                @ExcludeMissing
                bankAccountType: JsonField<GtqAccountInfo.BankAccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<GtqAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankAccountType,
                paymentRails,
                reference,
                mutableMapOf(),
            )

            fun toGtqAccountInfo(): GtqAccountInfo =
                GtqAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankAccountType(bankAccountType)
                    .paymentRails(paymentRails)
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
            fun accountType(): GtqAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The bank account type
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankAccountType(): GtqAccountInfo.BankAccountType =
                bankAccountType.getRequired("bankAccountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<GtqAccountInfo.PaymentRail> =
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
            fun _accountType(): JsonField<GtqAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankAccountType].
             *
             * Unlike [bankAccountType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bankAccountType")
            @ExcludeMissing
            fun _bankAccountType(): JsonField<GtqAccountInfo.BankAccountType> = bankAccountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<GtqAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [GtqAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankAccountType()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [GtqAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<GtqAccountInfo.AccountType>? = null
                private var bankAccountType: JsonField<GtqAccountInfo.BankAccountType>? = null
                private var paymentRails: JsonField<MutableList<GtqAccountInfo.PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(gtqAccount: GtqAccount) = apply {
                    accountNumber = gtqAccount.accountNumber
                    accountType = gtqAccount.accountType
                    bankAccountType = gtqAccount.bankAccountType
                    paymentRails = gtqAccount.paymentRails.map { it.toMutableList() }
                    reference = gtqAccount.reference
                    additionalProperties = gtqAccount.additionalProperties.toMutableMap()
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

                fun accountType(accountType: GtqAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [GtqAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<GtqAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** The bank account type */
                fun bankAccountType(bankAccountType: GtqAccountInfo.BankAccountType) =
                    bankAccountType(JsonField.of(bankAccountType))

                /**
                 * Sets [Builder.bankAccountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAccountType] with a well-typed
                 * [GtqAccountInfo.BankAccountType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun bankAccountType(bankAccountType: JsonField<GtqAccountInfo.BankAccountType>) =
                    apply {
                        this.bankAccountType = bankAccountType
                    }

                fun paymentRails(paymentRails: List<GtqAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<GtqAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<GtqAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [GtqAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: GtqAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [GtqAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankAccountType()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GtqAccount =
                    GtqAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankAccountType", bankAccountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GtqAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankAccountType().validate()
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
                    (bankAccountType.asKnown()?.validity() ?: 0) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GtqAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankAccountType == other.bankAccountType &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankAccountType,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GtqAccount{accountNumber=$accountNumber, accountType=$accountType, bankAccountType=$bankAccountType, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class HtgAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonField<HtgAccountInfo.AccountType>,
            private val paymentRails: JsonField<List<HtgAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonField<HtgAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<HtgAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, phoneNumber, reference, mutableMapOf())

            fun toHtgAccountInfo(): HtgAccountInfo =
                HtgAccountInfo.builder()
                    .accountType(accountType)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .build()

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountType(): HtgAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<HtgAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

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
            fun _accountType(): JsonField<HtgAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<HtgAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [HtgAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [HtgAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonField<HtgAccountInfo.AccountType>? = null
                private var paymentRails: JsonField<MutableList<HtgAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(htgAccount: HtgAccount) = apply {
                    accountType = htgAccount.accountType
                    paymentRails = htgAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = htgAccount.phoneNumber
                    reference = htgAccount.reference
                    additionalProperties = htgAccount.additionalProperties.toMutableMap()
                }

                fun accountType(accountType: HtgAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [HtgAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<HtgAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                fun paymentRails(paymentRails: List<HtgAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<HtgAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<HtgAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [HtgAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: HtgAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [HtgAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountType()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HtgAccount =
                    HtgAccount(
                        checkRequired("accountType", accountType),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HtgAccount = apply {
                if (validated) {
                    return@apply
                }

                accountType().validate()
                paymentRails().forEach { it.validate() }
                phoneNumber()
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
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HtgAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    phoneNumber,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HtgAccount{accountType=$accountType, paymentRails=$paymentRails, phoneNumber=$phoneNumber, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class JmdAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<JmdAccountInfo.AccountType>,
            private val bankAccountType: JsonField<JmdAccountInfo.BankAccountType>,
            private val branchCode: JsonField<String>,
            private val paymentRails: JsonField<List<JmdAccountInfo.PaymentRail>>,
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
                accountType: JsonField<JmdAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankAccountType")
                @ExcludeMissing
                bankAccountType: JsonField<JmdAccountInfo.BankAccountType> = JsonMissing.of(),
                @JsonProperty("branchCode")
                @ExcludeMissing
                branchCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<JmdAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankAccountType,
                branchCode,
                paymentRails,
                reference,
                mutableMapOf(),
            )

            fun toJmdAccountInfo(): JmdAccountInfo =
                JmdAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankAccountType(bankAccountType)
                    .branchCode(branchCode)
                    .paymentRails(paymentRails)
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
            fun accountType(): JmdAccountInfo.AccountType = accountType.getRequired("accountType")

            /**
             * The bank account type
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankAccountType(): JmdAccountInfo.BankAccountType =
                bankAccountType.getRequired("bankAccountType")

            /**
             * The branch code
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
            fun paymentRails(): List<JmdAccountInfo.PaymentRail> =
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
            fun _accountType(): JsonField<JmdAccountInfo.AccountType> = accountType

            /**
             * Returns the raw JSON value of [bankAccountType].
             *
             * Unlike [bankAccountType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bankAccountType")
            @ExcludeMissing
            fun _bankAccountType(): JsonField<JmdAccountInfo.BankAccountType> = bankAccountType

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
            fun _paymentRails(): JsonField<List<JmdAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [JmdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankAccountType()
                 * .branchCode()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [JmdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<JmdAccountInfo.AccountType>? = null
                private var bankAccountType: JsonField<JmdAccountInfo.BankAccountType>? = null
                private var branchCode: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<JmdAccountInfo.PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(jmdAccount: JmdAccount) = apply {
                    accountNumber = jmdAccount.accountNumber
                    accountType = jmdAccount.accountType
                    bankAccountType = jmdAccount.bankAccountType
                    branchCode = jmdAccount.branchCode
                    paymentRails = jmdAccount.paymentRails.map { it.toMutableList() }
                    reference = jmdAccount.reference
                    additionalProperties = jmdAccount.additionalProperties.toMutableMap()
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

                fun accountType(accountType: JmdAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [JmdAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<JmdAccountInfo.AccountType>) = apply {
                    this.accountType = accountType
                }

                /** The bank account type */
                fun bankAccountType(bankAccountType: JmdAccountInfo.BankAccountType) =
                    bankAccountType(JsonField.of(bankAccountType))

                /**
                 * Sets [Builder.bankAccountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAccountType] with a well-typed
                 * [JmdAccountInfo.BankAccountType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun bankAccountType(bankAccountType: JsonField<JmdAccountInfo.BankAccountType>) =
                    apply {
                        this.bankAccountType = bankAccountType
                    }

                /** The branch code */
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

                fun paymentRails(paymentRails: List<JmdAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<JmdAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<JmdAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [JmdAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: JmdAccountInfo.PaymentRail) = apply {
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
                 * Returns an immutable instance of [JmdAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankAccountType()
                 * .branchCode()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): JmdAccount =
                    JmdAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankAccountType", bankAccountType),
                        checkRequired("branchCode", branchCode),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): JmdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankAccountType().validate()
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
                    (bankAccountType.asKnown()?.validity() ?: 0) +
                    (if (branchCode.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is JmdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankAccountType == other.bankAccountType &&
                    branchCode == other.branchCode &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankAccountType,
                    branchCode,
                    paymentRails,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JmdAccount{accountNumber=$accountNumber, accountType=$accountType, bankAccountType=$bankAccountType, branchCode=$branchCode, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class PkrAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonField<PkrAccountInfo.AccountType>,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PkrAccountInfo.PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val iban: JsonField<String>,
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
                accountType: JsonField<PkrAccountInfo.AccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PkrAccountInfo.PaymentRail>> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                phoneNumber,
                iban,
                reference,
                mutableMapOf(),
            )

            fun toPkrAccountInfo(): PkrAccountInfo =
                PkrAccountInfo.builder()
                    .accountNumber(accountNumber)
                    .accountType(accountType)
                    .bankName(bankName)
                    .paymentRails(paymentRails)
                    .phoneNumber(phoneNumber)
                    .iban(iban)
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
            fun accountType(): PkrAccountInfo.AccountType = accountType.getRequired("accountType")

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
            fun paymentRails(): List<PkrAccountInfo.PaymentRail> =
                paymentRails.getRequired("paymentRails")

            /**
             * The phone number in international format
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

            /**
             * Pakistani IBAN (24 characters, starting with PK)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun iban(): String? = iban.getNullable("iban")

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
            fun _accountType(): JsonField<PkrAccountInfo.AccountType> = accountType

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
            fun _paymentRails(): JsonField<List<PkrAccountInfo.PaymentRail>> = paymentRails

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
                 * Returns a mutable builder for constructing an instance of [PkrAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .accountType()
                 * .bankName()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PkrAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonField<PkrAccountInfo.AccountType>? = null
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PkrAccountInfo.PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var iban: JsonField<String> = JsonMissing.of()
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(pkrAccount: PkrAccount) = apply {
                    accountNumber = pkrAccount.accountNumber
                    accountType = pkrAccount.accountType
                    bankName = pkrAccount.bankName
                    paymentRails = pkrAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = pkrAccount.phoneNumber
                    iban = pkrAccount.iban
                    reference = pkrAccount.reference
                    additionalProperties = pkrAccount.additionalProperties.toMutableMap()
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

                fun accountType(accountType: PkrAccountInfo.AccountType) =
                    accountType(JsonField.of(accountType))

                /**
                 * Sets [Builder.accountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountType] with a well-typed
                 * [PkrAccountInfo.AccountType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun accountType(accountType: JsonField<PkrAccountInfo.AccountType>) = apply {
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

                fun paymentRails(paymentRails: List<PkrAccountInfo.PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<PkrAccountInfo.PaymentRail>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<PkrAccountInfo.PaymentRail>>) =
                    apply {
                        this.paymentRails = paymentRails.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [PkrAccountInfo.PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: PkrAccountInfo.PaymentRail) = apply {
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

                /** Pakistani IBAN (24 characters, starting with PK) */
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
                 * Returns an immutable instance of [PkrAccount].
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
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PkrAccount =
                    PkrAccount(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("accountType", accountType),
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        iban,
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PkrAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountType().validate()
                bankName()
                paymentRails().forEach { it.validate() }
                phoneNumber()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (if (reference.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PkrAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    iban == other.iban &&
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
                    iban,
                    reference,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PkrAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, phoneNumber=$phoneNumber, iban=$iban, reference=$reference, additionalProperties=$additionalProperties}"
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

        class PaymentEthereumWalletInfo
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentEthereumWalletInfo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .address()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PaymentEthereumWalletInfo]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("ETHEREUM_WALLET")
                private var address: JsonField<String>? = null
                private var assetType: JsonField<AssetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentEthereumWalletInfo: PaymentEthereumWalletInfo) = apply {
                    accountType = paymentEthereumWalletInfo.accountType
                    address = paymentEthereumWalletInfo.address
                    assetType = paymentEthereumWalletInfo.assetType
                    additionalProperties =
                        paymentEthereumWalletInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PaymentEthereumWalletInfo].
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
                fun build(): PaymentEthereumWalletInfo =
                    PaymentEthereumWalletInfo(
                        accountType,
                        checkRequired("address", address),
                        assetType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentEthereumWalletInfo = apply {
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

                return other is PaymentEthereumWalletInfo &&
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
                "PaymentEthereumWalletInfo{accountType=$accountType, address=$address, assetType=$assetType, additionalProperties=$additionalProperties}"
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
             * JSON-encoded transaction signing payload that must be signed, as-is (byte-for-byte,
             * without re-serialization), with the session private key of a verified authentication
             * credential on the source Embedded Wallet. The resulting signature is base64-encoded
             * and passed as the `Grid-Wallet-Signature` header on `POST /quotes/{quoteId}/execute`
             * to authorize the outbound transfer from the wallet.
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
                 * JSON-encoded transaction signing payload that must be signed, as-is
                 * (byte-for-byte, without re-serialization), with the session private key of a
                 * verified authentication credential on the source Embedded Wallet. The resulting
                 * signature is base64-encoded and passed as the `Grid-Wallet-Signature` header on
                 * `POST /quotes/{quoteId}/execute` to authorize the outbound transfer from the
                 * wallet.
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
