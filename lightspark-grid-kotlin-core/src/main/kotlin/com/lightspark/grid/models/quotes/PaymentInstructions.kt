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
        fun accountOrWalletInfo(brlAccount: AccountOrWalletInfo.BrlAccount) =
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
        fun accountOrWalletInfo(inrAccount: AccountOrWalletInfo.InrAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofInrAccount(inrAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofPaymentNgnAccount(paymentNgnAccount)`.
         */
        fun accountOrWalletInfo(paymentNgnAccount: AccountOrWalletInfo.PaymentNgnAccountInfo) =
            accountOrWalletInfo(AccountOrWalletInfo.ofPaymentNgnAccount(paymentNgnAccount))

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
        private val brlAccount: BrlAccount? = null,
        private val mxnAccount: MxnAccount? = null,
        private val dkkAccount: DkkAccount? = null,
        private val eurAccount: EurAccount? = null,
        private val inrAccount: InrAccount? = null,
        private val paymentNgnAccount: PaymentNgnAccountInfo? = null,
        private val cadAccount: CadAccount? = null,
        private val gbpAccount: GbpAccount? = null,
        private val hkdAccount: HkdAccount? = null,
        private val idrAccount: IdrAccount? = null,
        private val myrAccount: MyrAccount? = null,
        private val phpAccount: PhpAccount? = null,
        private val sgdAccount: SgdAccount? = null,
        private val thbAccount: ThbAccount? = null,
        private val vndAccount: VndAccount? = null,
        private val paymentSpark: PaymentSparkWalletInfo? = null,
        private val paymentLightningInvoice: PaymentLightningInvoiceInfo? = null,
        private val paymentSolana: PaymentSolanaWalletInfo? = null,
        private val paymentTron: PaymentTronWalletInfo? = null,
        private val paymentPolygon: PaymentPolygonWalletInfo? = null,
        private val paymentBase: PaymentBaseWalletInfo? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usdAccount(): UsdAccount? = usdAccount

        fun brlAccount(): BrlAccount? = brlAccount

        fun mxnAccount(): MxnAccount? = mxnAccount

        fun dkkAccount(): DkkAccount? = dkkAccount

        fun eurAccount(): EurAccount? = eurAccount

        fun inrAccount(): InrAccount? = inrAccount

        fun paymentNgnAccount(): PaymentNgnAccountInfo? = paymentNgnAccount

        fun cadAccount(): CadAccount? = cadAccount

        fun gbpAccount(): GbpAccount? = gbpAccount

        fun hkdAccount(): HkdAccount? = hkdAccount

        fun idrAccount(): IdrAccount? = idrAccount

        fun myrAccount(): MyrAccount? = myrAccount

        fun phpAccount(): PhpAccount? = phpAccount

        fun sgdAccount(): SgdAccount? = sgdAccount

        fun thbAccount(): ThbAccount? = thbAccount

        fun vndAccount(): VndAccount? = vndAccount

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

        fun isPaymentNgnAccount(): Boolean = paymentNgnAccount != null

        fun isCadAccount(): Boolean = cadAccount != null

        fun isGbpAccount(): Boolean = gbpAccount != null

        fun isHkdAccount(): Boolean = hkdAccount != null

        fun isIdrAccount(): Boolean = idrAccount != null

        fun isMyrAccount(): Boolean = myrAccount != null

        fun isPhpAccount(): Boolean = phpAccount != null

        fun isSgdAccount(): Boolean = sgdAccount != null

        fun isThbAccount(): Boolean = thbAccount != null

        fun isVndAccount(): Boolean = vndAccount != null

        fun isPaymentSpark(): Boolean = paymentSpark != null

        fun isPaymentLightningInvoice(): Boolean = paymentLightningInvoice != null

        fun isPaymentSolana(): Boolean = paymentSolana != null

        fun isPaymentTron(): Boolean = paymentTron != null

        fun isPaymentPolygon(): Boolean = paymentPolygon != null

        fun isPaymentBase(): Boolean = paymentBase != null

        fun asUsdAccount(): UsdAccount = usdAccount.getOrThrow("usdAccount")

        fun asBrlAccount(): BrlAccount = brlAccount.getOrThrow("brlAccount")

        fun asMxnAccount(): MxnAccount = mxnAccount.getOrThrow("mxnAccount")

        fun asDkkAccount(): DkkAccount = dkkAccount.getOrThrow("dkkAccount")

        fun asEurAccount(): EurAccount = eurAccount.getOrThrow("eurAccount")

        fun asInrAccount(): InrAccount = inrAccount.getOrThrow("inrAccount")

        fun asPaymentNgnAccount(): PaymentNgnAccountInfo =
            paymentNgnAccount.getOrThrow("paymentNgnAccount")

        fun asCadAccount(): CadAccount = cadAccount.getOrThrow("cadAccount")

        fun asGbpAccount(): GbpAccount = gbpAccount.getOrThrow("gbpAccount")

        fun asHkdAccount(): HkdAccount = hkdAccount.getOrThrow("hkdAccount")

        fun asIdrAccount(): IdrAccount = idrAccount.getOrThrow("idrAccount")

        fun asMyrAccount(): MyrAccount = myrAccount.getOrThrow("myrAccount")

        fun asPhpAccount(): PhpAccount = phpAccount.getOrThrow("phpAccount")

        fun asSgdAccount(): SgdAccount = sgdAccount.getOrThrow("sgdAccount")

        fun asThbAccount(): ThbAccount = thbAccount.getOrThrow("thbAccount")

        fun asVndAccount(): VndAccount = vndAccount.getOrThrow("vndAccount")

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
                paymentNgnAccount != null -> visitor.visitPaymentNgnAccount(paymentNgnAccount)
                cadAccount != null -> visitor.visitCadAccount(cadAccount)
                gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
                hkdAccount != null -> visitor.visitHkdAccount(hkdAccount)
                idrAccount != null -> visitor.visitIdrAccount(idrAccount)
                myrAccount != null -> visitor.visitMyrAccount(myrAccount)
                phpAccount != null -> visitor.visitPhpAccount(phpAccount)
                sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
                thbAccount != null -> visitor.visitThbAccount(thbAccount)
                vndAccount != null -> visitor.visitVndAccount(vndAccount)
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

                    override fun visitBrlAccount(brlAccount: BrlAccount) {
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

                    override fun visitInrAccount(inrAccount: InrAccount) {
                        inrAccount.validate()
                    }

                    override fun visitPaymentNgnAccount(paymentNgnAccount: PaymentNgnAccountInfo) {
                        paymentNgnAccount.validate()
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

                    override fun visitBrlAccount(brlAccount: BrlAccount) = brlAccount.validity()

                    override fun visitMxnAccount(mxnAccount: MxnAccount) = mxnAccount.validity()

                    override fun visitDkkAccount(dkkAccount: DkkAccount) = dkkAccount.validity()

                    override fun visitEurAccount(eurAccount: EurAccount) = eurAccount.validity()

                    override fun visitInrAccount(inrAccount: InrAccount) = inrAccount.validity()

                    override fun visitPaymentNgnAccount(paymentNgnAccount: PaymentNgnAccountInfo) =
                        paymentNgnAccount.validity()

                    override fun visitCadAccount(cadAccount: CadAccount) = cadAccount.validity()

                    override fun visitGbpAccount(gbpAccount: GbpAccount) = gbpAccount.validity()

                    override fun visitHkdAccount(hkdAccount: HkdAccount) = hkdAccount.validity()

                    override fun visitIdrAccount(idrAccount: IdrAccount) = idrAccount.validity()

                    override fun visitMyrAccount(myrAccount: MyrAccount) = myrAccount.validity()

                    override fun visitPhpAccount(phpAccount: PhpAccount) = phpAccount.validity()

                    override fun visitSgdAccount(sgdAccount: SgdAccount) = sgdAccount.validity()

                    override fun visitThbAccount(thbAccount: ThbAccount) = thbAccount.validity()

                    override fun visitVndAccount(vndAccount: VndAccount) = vndAccount.validity()

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
                paymentNgnAccount == other.paymentNgnAccount &&
                cadAccount == other.cadAccount &&
                gbpAccount == other.gbpAccount &&
                hkdAccount == other.hkdAccount &&
                idrAccount == other.idrAccount &&
                myrAccount == other.myrAccount &&
                phpAccount == other.phpAccount &&
                sgdAccount == other.sgdAccount &&
                thbAccount == other.thbAccount &&
                vndAccount == other.vndAccount &&
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
                paymentNgnAccount,
                cadAccount,
                gbpAccount,
                hkdAccount,
                idrAccount,
                myrAccount,
                phpAccount,
                sgdAccount,
                thbAccount,
                vndAccount,
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
                paymentNgnAccount != null ->
                    "AccountOrWalletInfo{paymentNgnAccount=$paymentNgnAccount}"
                cadAccount != null -> "AccountOrWalletInfo{cadAccount=$cadAccount}"
                gbpAccount != null -> "AccountOrWalletInfo{gbpAccount=$gbpAccount}"
                hkdAccount != null -> "AccountOrWalletInfo{hkdAccount=$hkdAccount}"
                idrAccount != null -> "AccountOrWalletInfo{idrAccount=$idrAccount}"
                myrAccount != null -> "AccountOrWalletInfo{myrAccount=$myrAccount}"
                phpAccount != null -> "AccountOrWalletInfo{phpAccount=$phpAccount}"
                sgdAccount != null -> "AccountOrWalletInfo{sgdAccount=$sgdAccount}"
                thbAccount != null -> "AccountOrWalletInfo{thbAccount=$thbAccount}"
                vndAccount != null -> "AccountOrWalletInfo{vndAccount=$vndAccount}"
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

            fun ofBrlAccount(brlAccount: BrlAccount) = AccountOrWalletInfo(brlAccount = brlAccount)

            fun ofMxnAccount(mxnAccount: MxnAccount) = AccountOrWalletInfo(mxnAccount = mxnAccount)

            fun ofDkkAccount(dkkAccount: DkkAccount) = AccountOrWalletInfo(dkkAccount = dkkAccount)

            fun ofEurAccount(eurAccount: EurAccount) = AccountOrWalletInfo(eurAccount = eurAccount)

            fun ofInrAccount(inrAccount: InrAccount) = AccountOrWalletInfo(inrAccount = inrAccount)

            fun ofPaymentNgnAccount(paymentNgnAccount: PaymentNgnAccountInfo) =
                AccountOrWalletInfo(paymentNgnAccount = paymentNgnAccount)

            fun ofCadAccount(cadAccount: CadAccount) = AccountOrWalletInfo(cadAccount = cadAccount)

            fun ofGbpAccount(gbpAccount: GbpAccount) = AccountOrWalletInfo(gbpAccount = gbpAccount)

            fun ofHkdAccount(hkdAccount: HkdAccount) = AccountOrWalletInfo(hkdAccount = hkdAccount)

            fun ofIdrAccount(idrAccount: IdrAccount) = AccountOrWalletInfo(idrAccount = idrAccount)

            fun ofMyrAccount(myrAccount: MyrAccount) = AccountOrWalletInfo(myrAccount = myrAccount)

            fun ofPhpAccount(phpAccount: PhpAccount) = AccountOrWalletInfo(phpAccount = phpAccount)

            fun ofSgdAccount(sgdAccount: SgdAccount) = AccountOrWalletInfo(sgdAccount = sgdAccount)

            fun ofThbAccount(thbAccount: ThbAccount) = AccountOrWalletInfo(thbAccount = thbAccount)

            fun ofVndAccount(vndAccount: VndAccount) = AccountOrWalletInfo(vndAccount = vndAccount)

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

            fun visitBrlAccount(brlAccount: BrlAccount): T

            fun visitMxnAccount(mxnAccount: MxnAccount): T

            fun visitDkkAccount(dkkAccount: DkkAccount): T

            fun visitEurAccount(eurAccount: EurAccount): T

            fun visitInrAccount(inrAccount: InrAccount): T

            fun visitPaymentNgnAccount(paymentNgnAccount: PaymentNgnAccountInfo): T

            fun visitCadAccount(cadAccount: CadAccount): T

            fun visitGbpAccount(gbpAccount: GbpAccount): T

            fun visitHkdAccount(hkdAccount: HkdAccount): T

            fun visitIdrAccount(idrAccount: IdrAccount): T

            fun visitMyrAccount(myrAccount: MyrAccount): T

            fun visitPhpAccount(phpAccount: PhpAccount): T

            fun visitSgdAccount(sgdAccount: SgdAccount): T

            fun visitThbAccount(thbAccount: ThbAccount): T

            fun visitVndAccount(vndAccount: VndAccount): T

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
                    "BRL_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BrlAccount>())?.let {
                            AccountOrWalletInfo(brlAccount = it, _json = json)
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
                    "INR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<InrAccount>())?.let {
                            AccountOrWalletInfo(inrAccount = it, _json = json)
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
                }

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PaymentNgnAccountInfo>())?.let {
                                AccountOrWalletInfo(paymentNgnAccount = it, _json = json)
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
                    value.paymentNgnAccount != null ->
                        generator.writeObject(value.paymentNgnAccount)
                    value.cadAccount != null -> generator.writeObject(value.cadAccount)
                    value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                    value.hkdAccount != null -> generator.writeObject(value.hkdAccount)
                    value.idrAccount != null -> generator.writeObject(value.idrAccount)
                    value.myrAccount != null -> generator.writeObject(value.myrAccount)
                    value.phpAccount != null -> generator.writeObject(value.phpAccount)
                    value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                    value.thbAccount != null -> generator.writeObject(value.thbAccount)
                    value.vndAccount != null -> generator.writeObject(value.vndAccount)
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
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val routingNumber: JsonField<String>,
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
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routingNumber")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                paymentRails,
                reference,
                routingNumber,
                mutableMapOf(),
            )

            /**
             * The account number of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("USD_ACCOUNT")
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
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * The routing number of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routingNumber")

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
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routingNumber")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

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
                 * .paymentRails()
                 * .reference()
                 * .routingNumber()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("USD_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var routingNumber: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usdAccount: UsdAccount) = apply {
                    accountNumber = usdAccount.accountNumber
                    accountType = usdAccount.accountType
                    paymentRails = usdAccount.paymentRails.map { it.toMutableList() }
                    reference = usdAccount.reference
                    routingNumber = usdAccount.routingNumber
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("USD_ACCOUNT")
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

                /** The routing number of the bank */
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
                 * .paymentRails()
                 * .reference()
                 * .routingNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsdAccount =
                    UsdAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("routingNumber", routingNumber),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("USD_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                reference()
                routingNumber()
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
                    accountType.let { if (it == JsonValue.from("USD_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (routingNumber.asKnown() == null) 0 else 1)

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

                    val WIRE = of("WIRE")

                    val RTP = of("RTP")

                    val FEDNOW = of("FEDNOW")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    ACH,
                    WIRE,
                    RTP,
                    FEDNOW,
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
                    WIRE,
                    RTP,
                    FEDNOW,
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
                        WIRE -> Value.WIRE
                        RTP -> Value.RTP
                        FEDNOW -> Value.FEDNOW
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
                        WIRE -> Known.WIRE
                        RTP -> Known.RTP
                        FEDNOW -> Known.FEDNOW
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

                return other is UsdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    routingNumber == other.routingNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    paymentRails,
                    reference,
                    routingNumber,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsdAccount{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, reference=$reference, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
        }

        class BrlAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val pixKey: JsonField<String>,
            private val pixKeyType: JsonField<String>,
            private val taxId: JsonField<String>,
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
                @JsonProperty("pixKey")
                @ExcludeMissing
                pixKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pixKeyType")
                @ExcludeMissing
                pixKeyType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, pixKey, pixKeyType, taxId, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("BRL_ACCOUNT")
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
             * The PIX key of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pixKey(): String = pixKey.getRequired("pixKey")

            /**
             * The type of PIX key of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pixKeyType(): String = pixKeyType.getRequired("pixKeyType")

            /**
             * The tax ID of the bank account
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxId(): String = taxId.getRequired("taxId")

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
             * Returns the raw JSON value of [pixKey].
             *
             * Unlike [pixKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pixKey") @ExcludeMissing fun _pixKey(): JsonField<String> = pixKey

            /**
             * Returns the raw JSON value of [pixKeyType].
             *
             * Unlike [pixKeyType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pixKeyType")
            @ExcludeMissing
            fun _pixKeyType(): JsonField<String> = pixKeyType

            /**
             * Returns the raw JSON value of [taxId].
             *
             * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
                 * .paymentRails()
                 * .pixKey()
                 * .pixKeyType()
                 * .taxId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BrlAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("BRL_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var pixKey: JsonField<String>? = null
                private var pixKeyType: JsonField<String>? = null
                private var taxId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(brlAccount: BrlAccount) = apply {
                    accountType = brlAccount.accountType
                    paymentRails = brlAccount.paymentRails.map { it.toMutableList() }
                    pixKey = brlAccount.pixKey
                    pixKeyType = brlAccount.pixKeyType
                    taxId = brlAccount.taxId
                    additionalProperties = brlAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("BRL_ACCOUNT")
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

                /** The PIX key of the bank */
                fun pixKey(pixKey: String) = pixKey(JsonField.of(pixKey))

                /**
                 * Sets [Builder.pixKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pixKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pixKey(pixKey: JsonField<String>) = apply { this.pixKey = pixKey }

                /** The type of PIX key of the bank */
                fun pixKeyType(pixKeyType: String) = pixKeyType(JsonField.of(pixKeyType))

                /**
                 * Sets [Builder.pixKeyType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pixKeyType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pixKeyType(pixKeyType: JsonField<String>) = apply {
                    this.pixKeyType = pixKeyType
                }

                /** The tax ID of the bank account */
                fun taxId(taxId: String) = taxId(JsonField.of(taxId))

                /**
                 * Sets [Builder.taxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
                 * .paymentRails()
                 * .pixKey()
                 * .pixKeyType()
                 * .taxId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BrlAccount =
                    BrlAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("pixKey", pixKey),
                        checkRequired("pixKeyType", pixKeyType),
                        checkRequired("taxId", taxId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BrlAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("BRL_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                pixKey()
                pixKeyType()
                taxId()
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
                accountType.let { if (it == JsonValue.from("BRL_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (pixKey.asKnown() == null) 0 else 1) +
                    (if (pixKeyType.asKnown() == null) 0 else 1) +
                    (if (taxId.asKnown() == null) 0 else 1)

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

                    val PIX = of("PIX")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    PIX
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
                    PIX,
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
                        PIX -> Value.PIX
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
                        PIX -> Known.PIX
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

                return other is BrlAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    pixKey == other.pixKey &&
                    pixKeyType == other.pixKeyType &&
                    taxId == other.taxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    pixKey,
                    pixKeyType,
                    taxId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BrlAccount{accountType=$accountType, paymentRails=$paymentRails, pixKey=$pixKey, pixKeyType=$pixKeyType, taxId=$taxId, additionalProperties=$additionalProperties}"
        }

        class MxnAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val clabeNumber: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("clabeNumber")
                @ExcludeMissing
                clabeNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, clabeNumber, paymentRails, reference, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("MXN_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

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
                 * Returns a mutable builder for constructing an instance of [MxnAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .clabeNumber()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MxnAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("MXN_ACCOUNT")
                private var clabeNumber: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mxnAccount: MxnAccount) = apply {
                    accountType = mxnAccount.accountType
                    clabeNumber = mxnAccount.clabeNumber
                    paymentRails = mxnAccount.paymentRails.map { it.toMutableList() }
                    reference = mxnAccount.reference
                    additionalProperties = mxnAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("MXN_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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
                 * Returns an immutable instance of [MxnAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .clabeNumber()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MxnAccount =
                    MxnAccount(
                        accountType,
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

                _accountType().let {
                    if (it != JsonValue.from("MXN_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
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
                accountType.let { if (it == JsonValue.from("MXN_ACCOUNT")) 1 else 0 } +
                    (if (clabeNumber.asKnown() == null) 0 else 1) +
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

                    val SPEI = of("SPEI")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    SPEI
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
                    SPEI,
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
                        SPEI -> Value.SPEI
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
                        SPEI -> Known.SPEI
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
            private val accountType: JsonValue,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftBic: JsonField<String>,
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
                @JsonProperty("swiftBic")
                @ExcludeMissing
                swiftBic: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, iban, paymentRails, reference, swiftBic, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("DKK_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * The IBAN of the bank
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
             * The SWIFT BIC of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun swiftBic(): String? = swiftBic.getNullable("swiftBic")

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
             * Returns the raw JSON value of [swiftBic].
             *
             * Unlike [swiftBic], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("swiftBic") @ExcludeMissing fun _swiftBic(): JsonField<String> = swiftBic

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
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DkkAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("DKK_ACCOUNT")
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftBic: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dkkAccount: DkkAccount) = apply {
                    accountType = dkkAccount.accountType
                    iban = dkkAccount.iban
                    paymentRails = dkkAccount.paymentRails.map { it.toMutableList() }
                    reference = dkkAccount.reference
                    swiftBic = dkkAccount.swiftBic
                    additionalProperties = dkkAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("DKK_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** The IBAN of the bank */
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

                /** The SWIFT BIC of the bank */
                fun swiftBic(swiftBic: String) = swiftBic(JsonField.of(swiftBic))

                /**
                 * Sets [Builder.swiftBic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.swiftBic] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun swiftBic(swiftBic: JsonField<String>) = apply { this.swiftBic = swiftBic }

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
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DkkAccount =
                    DkkAccount(
                        accountType,
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        swiftBic,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DkkAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("DKK_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                iban()
                paymentRails().forEach { it.validate() }
                reference()
                swiftBic()
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
                accountType.let { if (it == JsonValue.from("DKK_ACCOUNT")) 1 else 0 } +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (swiftBic.asKnown() == null) 0 else 1)

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

                    val SEPA = of("SEPA")

                    val SEPA_INSTANT = of("SEPA_INSTANT")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    SEPA,
                    SEPA_INSTANT,
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
                    SEPA,
                    SEPA_INSTANT,
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
                        SEPA -> Value.SEPA
                        SEPA_INSTANT -> Value.SEPA_INSTANT
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
                        SEPA -> Known.SEPA
                        SEPA_INSTANT -> Known.SEPA_INSTANT
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

                return other is DkkAccount &&
                    accountType == other.accountType &&
                    iban == other.iban &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftBic == other.swiftBic &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    iban,
                    paymentRails,
                    reference,
                    swiftBic,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DkkAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, reference=$reference, swiftBic=$swiftBic, additionalProperties=$additionalProperties}"
        }

        class EurAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val iban: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftBic: JsonField<String>,
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
                @JsonProperty("swiftBic")
                @ExcludeMissing
                swiftBic: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, iban, paymentRails, reference, swiftBic, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("EUR_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * The IBAN of the bank
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
             * The SWIFT BIC of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun swiftBic(): String? = swiftBic.getNullable("swiftBic")

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
             * Returns the raw JSON value of [swiftBic].
             *
             * Unlike [swiftBic], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("swiftBic") @ExcludeMissing fun _swiftBic(): JsonField<String> = swiftBic

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
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EurAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("EUR_ACCOUNT")
                private var iban: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftBic: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(eurAccount: EurAccount) = apply {
                    accountType = eurAccount.accountType
                    iban = eurAccount.iban
                    paymentRails = eurAccount.paymentRails.map { it.toMutableList() }
                    reference = eurAccount.reference
                    swiftBic = eurAccount.swiftBic
                    additionalProperties = eurAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("EUR_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** The IBAN of the bank */
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

                /** The SWIFT BIC of the bank */
                fun swiftBic(swiftBic: String) = swiftBic(JsonField.of(swiftBic))

                /**
                 * Sets [Builder.swiftBic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.swiftBic] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun swiftBic(swiftBic: JsonField<String>) = apply { this.swiftBic = swiftBic }

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
                 * .iban()
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EurAccount =
                    EurAccount(
                        accountType,
                        checkRequired("iban", iban),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        swiftBic,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EurAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("EUR_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                iban()
                paymentRails().forEach { it.validate() }
                reference()
                swiftBic()
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
                accountType.let { if (it == JsonValue.from("EUR_ACCOUNT")) 1 else 0 } +
                    (if (iban.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (swiftBic.asKnown() == null) 0 else 1)

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

                    val SEPA = of("SEPA")

                    val SEPA_INSTANT = of("SEPA_INSTANT")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    SEPA,
                    SEPA_INSTANT,
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
                    SEPA,
                    SEPA_INSTANT,
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
                        SEPA -> Value.SEPA
                        SEPA_INSTANT -> Value.SEPA_INSTANT
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
                        SEPA -> Known.SEPA
                        SEPA_INSTANT -> Known.SEPA_INSTANT
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

                return other is EurAccount &&
                    accountType == other.accountType &&
                    iban == other.iban &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftBic == other.swiftBic &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    iban,
                    paymentRails,
                    reference,
                    swiftBic,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EurAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, reference=$reference, swiftBic=$swiftBic, additionalProperties=$additionalProperties}"
        }

        class InrAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val vpa: JsonField<String>,
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
                @JsonProperty("vpa") @ExcludeMissing vpa: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, paymentRails, vpa, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("INR_ACCOUNT")
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
             * The VPA of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun vpa(): String = vpa.getRequired("vpa")

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
             * Returns the raw JSON value of [vpa].
             *
             * Unlike [vpa], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vpa") @ExcludeMissing fun _vpa(): JsonField<String> = vpa

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
                 * Returns a mutable builder for constructing an instance of [InrAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .vpa()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [InrAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("INR_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var vpa: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inrAccount: InrAccount) = apply {
                    accountType = inrAccount.accountType
                    paymentRails = inrAccount.paymentRails.map { it.toMutableList() }
                    vpa = inrAccount.vpa
                    additionalProperties = inrAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("INR_ACCOUNT")
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

                /** The VPA of the bank */
                fun vpa(vpa: String) = vpa(JsonField.of(vpa))

                /**
                 * Sets [Builder.vpa] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vpa] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun vpa(vpa: JsonField<String>) = apply { this.vpa = vpa }

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
                 * Returns an immutable instance of [InrAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .vpa()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InrAccount =
                    InrAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("vpa", vpa),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InrAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("INR_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                vpa()
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
                accountType.let { if (it == JsonValue.from("INR_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (vpa.asKnown() == null) 0 else 1)

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

                    val UPI = of("UPI")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    UPI
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
                    UPI,
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
                        UPI -> Value.UPI
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
                        UPI -> Known.UPI
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

                return other is InrAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    vpa == other.vpa &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, paymentRails, vpa, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InrAccount{accountType=$accountType, paymentRails=$paymentRails, vpa=$vpa, additionalProperties=$additionalProperties}"
        }

        class PaymentNgnAccountInfo
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
             * Nigerian bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("NGN_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Name of the bank
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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentNgnAccountInfo].
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

            /** A builder for [PaymentNgnAccountInfo]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("NGN_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentNgnAccountInfo: PaymentNgnAccountInfo) = apply {
                    accountNumber = paymentNgnAccountInfo.accountNumber
                    accountType = paymentNgnAccountInfo.accountType
                    bankName = paymentNgnAccountInfo.bankName
                    paymentRails = paymentNgnAccountInfo.paymentRails.map { it.toMutableList() }
                    reference = paymentNgnAccountInfo.reference
                    additionalProperties = paymentNgnAccountInfo.additionalProperties.toMutableMap()
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("NGN_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Name of the bank */
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
                 * Returns an immutable instance of [PaymentNgnAccountInfo].
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
                fun build(): PaymentNgnAccountInfo =
                    PaymentNgnAccountInfo(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentNgnAccountInfo = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("NGN_ACCOUNT")) {
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
                    accountType.let { if (it == JsonValue.from("NGN_ACCOUNT")) 1 else 0 } +
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

                return other is PaymentNgnAccountInfo &&
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
                "PaymentNgnAccountInfo{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, additionalProperties=$additionalProperties}"
        }

        class CadAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankCode: JsonField<String>,
            private val branchCode: JsonField<String>,
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
                @JsonProperty("bankCode")
                @ExcludeMissing
                bankCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("branchCode")
                @ExcludeMissing
                branchCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
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

            /**
             * Bank account number (7-12 digits)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("CAD_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

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
                 * Returns a mutable builder for constructing an instance of [CadAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
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
                private var accountType: JsonValue = JsonValue.from("CAD_ACCOUNT")
                private var bankCode: JsonField<String>? = null
                private var branchCode: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("CAD_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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
                 * Returns an immutable instance of [CadAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
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
                        accountType,
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
                _accountType().let {
                    if (it != JsonValue.from("CAD_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
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
                    accountType.let { if (it == JsonValue.from("CAD_ACCOUNT")) 1 else 0 } +
                    (if (bankCode.asKnown() == null) 0 else 1) +
                    (if (branchCode.asKnown() == null) 0 else 1) +
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
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val sortCode: JsonField<String>,
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
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sortCode")
                @ExcludeMissing
                sortCode: JsonField<String> = JsonMissing.of(),
            ) : this(accountNumber, accountType, paymentRails, reference, sortCode, mutableMapOf())

            /**
             * UK bank account number (8 digits)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("GBP_ACCOUNT")
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
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * UK bank sort code (6 digits, may include hyphens)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sortCode(): String = sortCode.getRequired("sortCode")

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
             * Returns the raw JSON value of [sortCode].
             *
             * Unlike [sortCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sortCode") @ExcludeMissing fun _sortCode(): JsonField<String> = sortCode

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
                 * .paymentRails()
                 * .reference()
                 * .sortCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [GbpAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("GBP_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var sortCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(gbpAccount: GbpAccount) = apply {
                    accountNumber = gbpAccount.accountNumber
                    accountType = gbpAccount.accountType
                    paymentRails = gbpAccount.paymentRails.map { it.toMutableList() }
                    reference = gbpAccount.reference
                    sortCode = gbpAccount.sortCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("GBP_ACCOUNT")
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

                /** UK bank sort code (6 digits, may include hyphens) */
                fun sortCode(sortCode: String) = sortCode(JsonField.of(sortCode))

                /**
                 * Sets [Builder.sortCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sortCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sortCode(sortCode: JsonField<String>) = apply { this.sortCode = sortCode }

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
                 * .paymentRails()
                 * .reference()
                 * .sortCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GbpAccount =
                    GbpAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("sortCode", sortCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GbpAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("GBP_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                reference()
                sortCode()
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
                    accountType.let { if (it == JsonValue.from("GBP_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (sortCode.asKnown() == null) 0 else 1)

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

                    val FASTER_PAYMENTS = of("FASTER_PAYMENTS")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    FASTER_PAYMENTS
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
                    FASTER_PAYMENTS,
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
                        FASTER_PAYMENTS -> Value.FASTER_PAYMENTS
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
                        FASTER_PAYMENTS -> Known.FASTER_PAYMENTS
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

                return other is GbpAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    sortCode == other.sortCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    paymentRails,
                    reference,
                    sortCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GbpAccount{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, reference=$reference, sortCode=$sortCode, additionalProperties=$additionalProperties}"
        }

        class HkdAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
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
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                reference,
                swiftCode,
                mutableMapOf(),
            )

            /**
             * Hong Kong bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("HKD_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Name of the bank
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
             * SWIFT/BIC code (8 or 11 characters)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
                 * Returns a mutable builder for constructing an instance of [HkdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [HkdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("HKD_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(hkdAccount: HkdAccount) = apply {
                    accountNumber = hkdAccount.accountNumber
                    accountType = hkdAccount.accountType
                    bankName = hkdAccount.bankName
                    paymentRails = hkdAccount.paymentRails.map { it.toMutableList() }
                    reference = hkdAccount.reference
                    swiftCode = hkdAccount.swiftCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("HKD_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Name of the bank */
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

                /** SWIFT/BIC code (8 or 11 characters) */
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
                 * Returns an immutable instance of [HkdAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HkdAccount =
                    HkdAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HkdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("HKD_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("HKD_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
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

                return other is HkdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HkdAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        class IdrAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val phoneNumber: JsonField<String>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
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
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                phoneNumber,
                reference,
                swiftCode,
                mutableMapOf(),
            )

            /**
             * Indonesian bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("IDR_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Name of the bank
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
             * Indonesian phone number for e-wallet payments
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
             * SWIFT/BIC code (8 or 11 characters)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
                 * Returns a mutable builder for constructing an instance of [IdrAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [IdrAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("IDR_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var phoneNumber: JsonField<String>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(idrAccount: IdrAccount) = apply {
                    accountNumber = idrAccount.accountNumber
                    accountType = idrAccount.accountType
                    bankName = idrAccount.bankName
                    paymentRails = idrAccount.paymentRails.map { it.toMutableList() }
                    phoneNumber = idrAccount.phoneNumber
                    reference = idrAccount.reference
                    swiftCode = idrAccount.swiftCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("IDR_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Name of the bank */
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

                /** SWIFT/BIC code (8 or 11 characters) */
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
                 * Returns an immutable instance of [IdrAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .phoneNumber()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): IdrAccount =
                    IdrAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): IdrAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("IDR_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
                paymentRails().forEach { it.validate() }
                phoneNumber()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("IDR_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumber.asKnown() == null) 0 else 1) +
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

                return other is IdrAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    phoneNumber == other.phoneNumber &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    phoneNumber,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IdrAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, phoneNumber=$phoneNumber, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        class MyrAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
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
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                reference,
                swiftCode,
                mutableMapOf(),
            )

            /**
             * Malaysian bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("MYR_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Name of the bank
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
             * SWIFT/BIC code (8 or 11 characters)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
                 * Returns a mutable builder for constructing an instance of [MyrAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MyrAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("MYR_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(myrAccount: MyrAccount) = apply {
                    accountNumber = myrAccount.accountNumber
                    accountType = myrAccount.accountType
                    bankName = myrAccount.bankName
                    paymentRails = myrAccount.paymentRails.map { it.toMutableList() }
                    reference = myrAccount.reference
                    swiftCode = myrAccount.swiftCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("MYR_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Name of the bank */
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

                /** SWIFT/BIC code (8 or 11 characters) */
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
                 * Returns an immutable instance of [MyrAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MyrAccount =
                    MyrAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MyrAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("MYR_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("MYR_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
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

                return other is MyrAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MyrAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        class PhpAccount
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
             * Bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("PHP_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

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
                 * Returns a mutable builder for constructing an instance of [PhpAccount].
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

            /** A builder for [PhpAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("PHP_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("PHP_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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
                 * Returns an immutable instance of [PhpAccount].
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
                fun build(): PhpAccount =
                    PhpAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
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
                _accountType().let {
                    if (it != JsonValue.from("PHP_ACCOUNT")) {
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
                    accountType.let { if (it == JsonValue.from("PHP_ACCOUNT")) 1 else 0 } +
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
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
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
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                reference,
                swiftCode,
                mutableMapOf(),
            )

            /**
             * Bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("SGD_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

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
             * SWIFT/BIC code (8 or 11 characters)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
                 * Returns a mutable builder for constructing an instance of [SgdAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SgdAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("SGD_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(sgdAccount: SgdAccount) = apply {
                    accountNumber = sgdAccount.accountNumber
                    accountType = sgdAccount.accountType
                    bankName = sgdAccount.bankName
                    paymentRails = sgdAccount.paymentRails.map { it.toMutableList() }
                    reference = sgdAccount.reference
                    swiftCode = sgdAccount.swiftCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("SGD_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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

                /** SWIFT/BIC code (8 or 11 characters) */
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
                 * Returns an immutable instance of [SgdAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SgdAccount =
                    SgdAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SgdAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("SGD_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("SGD_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
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

                    val PAYNOW = of("PAYNOW")

                    val FAST = of("FAST")

                    val BANK_TRANSFER = of("BANK_TRANSFER")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    PAYNOW,
                    FAST,
                    BANK_TRANSFER,
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
                    PAYNOW,
                    FAST,
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
                        PAYNOW -> Value.PAYNOW
                        FAST -> Value.FAST
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
                        PAYNOW -> Known.PAYNOW
                        FAST -> Known.FAST
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

                return other is SgdAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SgdAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        class ThbAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
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
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                reference,
                swiftCode,
                mutableMapOf(),
            )

            /**
             * Thai bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("THB_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Name of the bank
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
             * SWIFT/BIC code (8 or 11 characters)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
                 * Returns a mutable builder for constructing an instance of [ThbAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ThbAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("THB_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(thbAccount: ThbAccount) = apply {
                    accountNumber = thbAccount.accountNumber
                    accountType = thbAccount.accountType
                    bankName = thbAccount.bankName
                    paymentRails = thbAccount.paymentRails.map { it.toMutableList() }
                    reference = thbAccount.reference
                    swiftCode = thbAccount.swiftCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("THB_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Name of the bank */
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

                /** SWIFT/BIC code (8 or 11 characters) */
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
                 * Returns an immutable instance of [ThbAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ThbAccount =
                    ThbAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ThbAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("THB_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("THB_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
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

                return other is ThbAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThbAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
        }

        class VndAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
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
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                reference,
                swiftCode,
                mutableMapOf(),
            )

            /**
             * Vietnamese bank account number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("VND_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Name of the bank
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
             * SWIFT/BIC code (8 or 11 characters)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
                 * Returns a mutable builder for constructing an instance of [VndAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [VndAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("VND_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(vndAccount: VndAccount) = apply {
                    accountNumber = vndAccount.accountNumber
                    accountType = vndAccount.accountType
                    bankName = vndAccount.bankName
                    paymentRails = vndAccount.paymentRails.map { it.toMutableList() }
                    reference = vndAccount.reference
                    swiftCode = vndAccount.swiftCode
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("VND_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** Name of the bank */
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

                /** SWIFT/BIC code (8 or 11 characters) */
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
                 * Returns an immutable instance of [VndAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * .bankName()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VndAccount =
                    VndAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VndAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("VND_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("VND_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
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

                return other is VndAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    accountType,
                    bankName,
                    paymentRails,
                    reference,
                    swiftCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VndAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
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
