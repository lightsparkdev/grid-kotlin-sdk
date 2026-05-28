// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.BdtBeneficiary
import com.lightspark.grid.models.BdtExternalAccountCreateInfo
import com.lightspark.grid.models.BrlExternalAccountCreateInfo
import com.lightspark.grid.models.BwpExternalAccountCreateInfo
import com.lightspark.grid.models.CadExternalAccountCreateInfo
import com.lightspark.grid.models.CopBeneficiary
import com.lightspark.grid.models.CopExternalAccountCreateInfo
import com.lightspark.grid.models.DkkExternalAccountCreateInfo
import com.lightspark.grid.models.EgpExternalAccountCreateInfo
import com.lightspark.grid.models.EthereumWalletExternalAccountInfo
import com.lightspark.grid.models.EurExternalAccountCreateInfo
import com.lightspark.grid.models.GbpExternalAccountCreateInfo
import com.lightspark.grid.models.GhsBeneficiary
import com.lightspark.grid.models.GhsExternalAccountCreateInfo
import com.lightspark.grid.models.GtqExternalAccountCreateInfo
import com.lightspark.grid.models.HkdExternalAccountCreateInfo
import com.lightspark.grid.models.HtgExternalAccountCreateInfo
import com.lightspark.grid.models.IdrExternalAccountCreateInfo
import com.lightspark.grid.models.InrExternalAccountCreateInfo
import com.lightspark.grid.models.JmdExternalAccountCreateInfo
import com.lightspark.grid.models.KesExternalAccountCreateInfo
import com.lightspark.grid.models.MwkExternalAccountCreateInfo
import com.lightspark.grid.models.MxnExternalAccountCreateInfo
import com.lightspark.grid.models.MyrExternalAccountCreateInfo
import com.lightspark.grid.models.NgnExternalAccountCreateInfo
import com.lightspark.grid.models.PhpExternalAccountCreateInfo
import com.lightspark.grid.models.PkrBeneficiary
import com.lightspark.grid.models.PkrExternalAccountCreateInfo
import com.lightspark.grid.models.RwfExternalAccountCreateInfo
import com.lightspark.grid.models.SgdExternalAccountCreateInfo
import com.lightspark.grid.models.SlvBeneficiary
import com.lightspark.grid.models.SlvExternalAccountCreateInfo
import com.lightspark.grid.models.ThbExternalAccountCreateInfo
import com.lightspark.grid.models.TzsExternalAccountCreateInfo
import com.lightspark.grid.models.UgxExternalAccountCreateInfo
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.VndExternalAccountCreateInfo
import com.lightspark.grid.models.XafExternalAccountCreateInfo
import com.lightspark.grid.models.XofExternalAccountCreateInfo
import com.lightspark.grid.models.ZarExternalAccountCreateInfo
import com.lightspark.grid.models.ZmwExternalAccountCreateInfo
import java.util.Collections
import java.util.Objects

class ExternalAccountCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountInfo: JsonField<AccountInfo>,
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
        accountInfo: JsonField<AccountInfo> = JsonMissing.of(),
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
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountInfo(): AccountInfo = accountInfo.getRequired("accountInfo")

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
    fun _accountInfo(): JsonField<AccountInfo> = accountInfo

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

        private var accountInfo: JsonField<AccountInfo>? = null
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

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun accountInfo(accountInfo: AccountInfo) = accountInfo(JsonField.of(accountInfo))

        /**
         * Sets [Builder.accountInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountInfo] with a well-typed [AccountInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountInfo(accountInfo: JsonField<AccountInfo>) = apply {
            this.accountInfo = accountInfo
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofAedAccount(aedAccount)`. */
        fun accountInfo(aedAccount: AedExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofAedAccount(aedAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofBdtAccount(bdtAccount)`. */
        fun accountInfo(bdtAccount: BdtExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofBdtAccount(bdtAccount))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * BdtExternalAccountCreateInfo.builder()
         *     .accountType(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
         *     .beneficiary(beneficiary)
         *     .build()
         * ```
         */
        fun bdtAccountAccountInfo(beneficiary: BdtExternalAccountCreateInfo.Beneficiary) =
            accountInfo(
                BdtExternalAccountCreateInfo.builder()
                    .accountType(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
                    .beneficiary(beneficiary)
                    .build()
            )

        /**
         * Alias for calling [bdtAccountAccountInfo] with
         * `BdtExternalAccountCreateInfo.Beneficiary.ofIndividual(individual)`.
         */
        fun bdtAccountAccountInfo(individual: BdtBeneficiary) =
            bdtAccountAccountInfo(BdtExternalAccountCreateInfo.Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [bdtAccountAccountInfo] with the following:
         * ```kotlin
         * BdtBeneficiary.builder()
         *     .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualBdtAccountAccountInfo(fullName: String) =
            bdtAccountAccountInfo(
                BdtBeneficiary.builder()
                    .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .fullName(fullName)
                    .build()
            )

        /**
         * Alias for calling [bdtAccountAccountInfo] with
         * `BdtExternalAccountCreateInfo.Beneficiary.ofBusiness(business)`.
         */
        fun bdtAccountAccountInfo(business: BusinessBeneficiary) =
            bdtAccountAccountInfo(BdtExternalAccountCreateInfo.Beneficiary.ofBusiness(business))

        /**
         * Alias for calling [bdtAccountAccountInfo] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessBdtAccountAccountInfo(legalName: String) =
            bdtAccountAccountInfo(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

        /** Alias for calling [accountInfo] with `AccountInfo.ofBrlAccount(brlAccount)`. */
        fun accountInfo(brlAccount: BrlExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofBrlAccount(brlAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofBwpAccount(bwpAccount)`. */
        fun accountInfo(bwpAccount: BwpExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofBwpAccount(bwpAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofCadAccount(cadAccount)`. */
        fun accountInfo(cadAccount: CadExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofCadAccount(cadAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofCopAccount(copAccount)`. */
        fun accountInfo(copAccount: CopExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofCopAccount(copAccount))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * CopExternalAccountCreateInfo.builder()
         *     .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
         *     .beneficiary(beneficiary)
         *     .build()
         * ```
         */
        fun copAccountAccountInfo(beneficiary: CopExternalAccountCreateInfo.Beneficiary) =
            accountInfo(
                CopExternalAccountCreateInfo.builder()
                    .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                    .beneficiary(beneficiary)
                    .build()
            )

        /**
         * Alias for calling [copAccountAccountInfo] with
         * `CopExternalAccountCreateInfo.Beneficiary.ofIndividual(individual)`.
         */
        fun copAccountAccountInfo(individual: CopBeneficiary) =
            copAccountAccountInfo(CopExternalAccountCreateInfo.Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [copAccountAccountInfo] with the following:
         * ```kotlin
         * CopBeneficiary.builder()
         *     .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualCopAccountAccountInfo(fullName: String) =
            copAccountAccountInfo(
                CopBeneficiary.builder()
                    .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .fullName(fullName)
                    .build()
            )

        /**
         * Alias for calling [copAccountAccountInfo] with
         * `CopExternalAccountCreateInfo.Beneficiary.ofBusiness(business)`.
         */
        fun copAccountAccountInfo(business: BusinessBeneficiary) =
            copAccountAccountInfo(CopExternalAccountCreateInfo.Beneficiary.ofBusiness(business))

        /**
         * Alias for calling [copAccountAccountInfo] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessCopAccountAccountInfo(legalName: String) =
            copAccountAccountInfo(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

        /** Alias for calling [accountInfo] with `AccountInfo.ofDkkAccount(dkkAccount)`. */
        fun accountInfo(dkkAccount: DkkExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofDkkAccount(dkkAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofEgpAccount(egpAccount)`. */
        fun accountInfo(egpAccount: EgpExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofEgpAccount(egpAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofEurAccount(eurAccount)`. */
        fun accountInfo(eurAccount: EurExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofEurAccount(eurAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofGbpAccount(gbpAccount)`. */
        fun accountInfo(gbpAccount: GbpExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofGbpAccount(gbpAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofGhsAccount(ghsAccount)`. */
        fun accountInfo(ghsAccount: GhsExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofGhsAccount(ghsAccount))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * GhsExternalAccountCreateInfo.builder()
         *     .accountType(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
         *     .beneficiary(beneficiary)
         *     .build()
         * ```
         */
        fun ghsAccountAccountInfo(beneficiary: GhsExternalAccountCreateInfo.Beneficiary) =
            accountInfo(
                GhsExternalAccountCreateInfo.builder()
                    .accountType(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
                    .beneficiary(beneficiary)
                    .build()
            )

        /**
         * Alias for calling [ghsAccountAccountInfo] with
         * `GhsExternalAccountCreateInfo.Beneficiary.ofIndividual(individual)`.
         */
        fun ghsAccountAccountInfo(individual: GhsBeneficiary) =
            ghsAccountAccountInfo(GhsExternalAccountCreateInfo.Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [ghsAccountAccountInfo] with the following:
         * ```kotlin
         * GhsBeneficiary.builder()
         *     .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualGhsAccountAccountInfo(fullName: String) =
            ghsAccountAccountInfo(
                GhsBeneficiary.builder()
                    .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .fullName(fullName)
                    .build()
            )

        /**
         * Alias for calling [ghsAccountAccountInfo] with
         * `GhsExternalAccountCreateInfo.Beneficiary.ofBusiness(business)`.
         */
        fun ghsAccountAccountInfo(business: BusinessBeneficiary) =
            ghsAccountAccountInfo(GhsExternalAccountCreateInfo.Beneficiary.ofBusiness(business))

        /**
         * Alias for calling [ghsAccountAccountInfo] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessGhsAccountAccountInfo(legalName: String) =
            ghsAccountAccountInfo(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

        /** Alias for calling [accountInfo] with `AccountInfo.ofGtqAccount(gtqAccount)`. */
        fun accountInfo(gtqAccount: GtqExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofGtqAccount(gtqAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofHkdAccount(hkdAccount)`. */
        fun accountInfo(hkdAccount: HkdExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofHkdAccount(hkdAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofHtgAccount(htgAccount)`. */
        fun accountInfo(htgAccount: HtgExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofHtgAccount(htgAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofIdrAccount(idrAccount)`. */
        fun accountInfo(idrAccount: IdrExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofIdrAccount(idrAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofInrAccount(inrAccount)`. */
        fun accountInfo(inrAccount: InrExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofInrAccount(inrAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofJmdAccount(jmdAccount)`. */
        fun accountInfo(jmdAccount: JmdExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofJmdAccount(jmdAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofKesAccount(kesAccount)`. */
        fun accountInfo(kesAccount: KesExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofKesAccount(kesAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofMwkAccount(mwkAccount)`. */
        fun accountInfo(mwkAccount: MwkExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofMwkAccount(mwkAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofMxnAccount(mxnAccount)`. */
        fun accountInfo(mxnAccount: MxnExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofMxnAccount(mxnAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofMyrAccount(myrAccount)`. */
        fun accountInfo(myrAccount: MyrExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofMyrAccount(myrAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofNgnAccount(ngnAccount)`. */
        fun accountInfo(ngnAccount: NgnExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofNgnAccount(ngnAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofPhpAccount(phpAccount)`. */
        fun accountInfo(phpAccount: PhpExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofPhpAccount(phpAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofPkrAccount(pkrAccount)`. */
        fun accountInfo(pkrAccount: PkrExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofPkrAccount(pkrAccount))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * PkrExternalAccountCreateInfo.builder()
         *     .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
         *     .beneficiary(beneficiary)
         *     .build()
         * ```
         */
        fun pkrAccountAccountInfo(beneficiary: PkrExternalAccountCreateInfo.Beneficiary) =
            accountInfo(
                PkrExternalAccountCreateInfo.builder()
                    .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
                    .beneficiary(beneficiary)
                    .build()
            )

        /**
         * Alias for calling [pkrAccountAccountInfo] with
         * `PkrExternalAccountCreateInfo.Beneficiary.ofIndividual(individual)`.
         */
        fun pkrAccountAccountInfo(individual: PkrBeneficiary) =
            pkrAccountAccountInfo(PkrExternalAccountCreateInfo.Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [pkrAccountAccountInfo] with the following:
         * ```kotlin
         * PkrBeneficiary.builder()
         *     .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualPkrAccountAccountInfo(fullName: String) =
            pkrAccountAccountInfo(
                PkrBeneficiary.builder()
                    .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .fullName(fullName)
                    .build()
            )

        /**
         * Alias for calling [pkrAccountAccountInfo] with
         * `PkrExternalAccountCreateInfo.Beneficiary.ofBusiness(business)`.
         */
        fun pkrAccountAccountInfo(business: BusinessBeneficiary) =
            pkrAccountAccountInfo(PkrExternalAccountCreateInfo.Beneficiary.ofBusiness(business))

        /**
         * Alias for calling [pkrAccountAccountInfo] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessPkrAccountAccountInfo(legalName: String) =
            pkrAccountAccountInfo(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

        /** Alias for calling [accountInfo] with `AccountInfo.ofRwfAccount(rwfAccount)`. */
        fun accountInfo(rwfAccount: RwfExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofRwfAccount(rwfAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofSgdAccount(sgdAccount)`. */
        fun accountInfo(sgdAccount: SgdExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofSgdAccount(sgdAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofSlvAccount(slvAccount)`. */
        fun accountInfo(slvAccount: SlvExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofSlvAccount(slvAccount))

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * SlvExternalAccountCreateInfo.builder()
         *     .accountType(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
         *     .beneficiary(beneficiary)
         *     .build()
         * ```
         */
        fun slvAccountAccountInfo(beneficiary: SlvExternalAccountCreateInfo.Beneficiary) =
            accountInfo(
                SlvExternalAccountCreateInfo.builder()
                    .accountType(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
                    .beneficiary(beneficiary)
                    .build()
            )

        /**
         * Alias for calling [slvAccountAccountInfo] with
         * `SlvExternalAccountCreateInfo.Beneficiary.ofIndividual(individual)`.
         */
        fun slvAccountAccountInfo(individual: SlvBeneficiary) =
            slvAccountAccountInfo(SlvExternalAccountCreateInfo.Beneficiary.ofIndividual(individual))

        /**
         * Alias for calling [slvAccountAccountInfo] with the following:
         * ```kotlin
         * SlvBeneficiary.builder()
         *     .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
         *     .fullName(fullName)
         *     .build()
         * ```
         */
        fun individualSlvAccountAccountInfo(fullName: String) =
            slvAccountAccountInfo(
                SlvBeneficiary.builder()
                    .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .fullName(fullName)
                    .build()
            )

        /**
         * Alias for calling [slvAccountAccountInfo] with
         * `SlvExternalAccountCreateInfo.Beneficiary.ofBusiness(business)`.
         */
        fun slvAccountAccountInfo(business: BusinessBeneficiary) =
            slvAccountAccountInfo(SlvExternalAccountCreateInfo.Beneficiary.ofBusiness(business))

        /**
         * Alias for calling [slvAccountAccountInfo] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessSlvAccountAccountInfo(legalName: String) =
            slvAccountAccountInfo(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

        /** Alias for calling [accountInfo] with `AccountInfo.ofThbAccount(thbAccount)`. */
        fun accountInfo(thbAccount: ThbExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofThbAccount(thbAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofTzsAccount(tzsAccount)`. */
        fun accountInfo(tzsAccount: TzsExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofTzsAccount(tzsAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofUgxAccount(ugxAccount)`. */
        fun accountInfo(ugxAccount: UgxExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofUgxAccount(ugxAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofUsdAccount(usdAccount)`. */
        fun accountInfo(usdAccount: UsdExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofUsdAccount(usdAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofVndAccount(vndAccount)`. */
        fun accountInfo(vndAccount: VndExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofVndAccount(vndAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofXafAccount(xafAccount)`. */
        fun accountInfo(xafAccount: XafExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofXafAccount(xafAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofXofAccount(xofAccount)`. */
        fun accountInfo(xofAccount: XofExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofXofAccount(xofAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofZarAccount(zarAccount)`. */
        fun accountInfo(zarAccount: ZarExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofZarAccount(zarAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofZmwAccount(zmwAccount)`. */
        fun accountInfo(zmwAccount: ZmwExternalAccountCreateInfo) =
            accountInfo(AccountInfo.ofZmwAccount(zmwAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofSwiftAccount(swiftAccount)`. */
        fun accountInfo(swiftAccount: AccountInfo.SwiftAccount) =
            accountInfo(AccountInfo.ofSwiftAccount(swiftAccount))

        /** Alias for calling [accountInfo] with `AccountInfo.ofBaseWallet(baseWallet)`. */
        fun accountInfo(baseWallet: BaseWalletInfo) =
            accountInfo(AccountInfo.ofBaseWallet(baseWallet))

        /**
         * Alias for calling [accountInfo] with
         * `AccountInfo.ofEthereumWalletExternal(ethereumWalletExternal)`.
         */
        fun accountInfo(ethereumWalletExternal: EthereumWalletExternalAccountInfo) =
            accountInfo(AccountInfo.ofEthereumWalletExternal(ethereumWalletExternal))

        /**
         * Alias for calling [accountInfo] with `AccountInfo.ofLightningWallet(lightningWallet)`.
         */
        fun accountInfo(lightningWallet: LightningWalletInfo) =
            accountInfo(AccountInfo.ofLightningWallet(lightningWallet))

        /** Alias for calling [accountInfo] with `AccountInfo.ofPolygonWallet(polygonWallet)`. */
        fun accountInfo(polygonWallet: PolygonWalletInfo) =
            accountInfo(AccountInfo.ofPolygonWallet(polygonWallet))

        /** Alias for calling [accountInfo] with `AccountInfo.ofSolanaWallet(solanaWallet)`. */
        fun accountInfo(solanaWallet: SolanaWalletInfo) =
            accountInfo(AccountInfo.ofSolanaWallet(solanaWallet))

        /** Alias for calling [accountInfo] with `AccountInfo.ofSparkWallet(sparkWallet)`. */
        fun accountInfo(sparkWallet: SparkWalletInfo) =
            accountInfo(AccountInfo.ofSparkWallet(sparkWallet))

        /** Alias for calling [accountInfo] with `AccountInfo.ofTronWallet(tronWallet)`. */
        fun accountInfo(tronWallet: TronWalletInfo) =
            accountInfo(AccountInfo.ofTronWallet(tronWallet))

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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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

    /**
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     */
    @JsonDeserialize(using = AccountInfo.Deserializer::class)
    @JsonSerialize(using = AccountInfo.Serializer::class)
    class AccountInfo
    private constructor(
        private val aedAccount: AedExternalAccountCreateInfo? = null,
        private val bdtAccount: BdtExternalAccountCreateInfo? = null,
        private val brlAccount: BrlExternalAccountCreateInfo? = null,
        private val bwpAccount: BwpExternalAccountCreateInfo? = null,
        private val cadAccount: CadExternalAccountCreateInfo? = null,
        private val copAccount: CopExternalAccountCreateInfo? = null,
        private val dkkAccount: DkkExternalAccountCreateInfo? = null,
        private val egpAccount: EgpExternalAccountCreateInfo? = null,
        private val eurAccount: EurExternalAccountCreateInfo? = null,
        private val gbpAccount: GbpExternalAccountCreateInfo? = null,
        private val ghsAccount: GhsExternalAccountCreateInfo? = null,
        private val gtqAccount: GtqExternalAccountCreateInfo? = null,
        private val hkdAccount: HkdExternalAccountCreateInfo? = null,
        private val htgAccount: HtgExternalAccountCreateInfo? = null,
        private val idrAccount: IdrExternalAccountCreateInfo? = null,
        private val inrAccount: InrExternalAccountCreateInfo? = null,
        private val jmdAccount: JmdExternalAccountCreateInfo? = null,
        private val kesAccount: KesExternalAccountCreateInfo? = null,
        private val mwkAccount: MwkExternalAccountCreateInfo? = null,
        private val mxnAccount: MxnExternalAccountCreateInfo? = null,
        private val myrAccount: MyrExternalAccountCreateInfo? = null,
        private val ngnAccount: NgnExternalAccountCreateInfo? = null,
        private val phpAccount: PhpExternalAccountCreateInfo? = null,
        private val pkrAccount: PkrExternalAccountCreateInfo? = null,
        private val rwfAccount: RwfExternalAccountCreateInfo? = null,
        private val sgdAccount: SgdExternalAccountCreateInfo? = null,
        private val slvAccount: SlvExternalAccountCreateInfo? = null,
        private val thbAccount: ThbExternalAccountCreateInfo? = null,
        private val tzsAccount: TzsExternalAccountCreateInfo? = null,
        private val ugxAccount: UgxExternalAccountCreateInfo? = null,
        private val usdAccount: UsdExternalAccountCreateInfo? = null,
        private val vndAccount: VndExternalAccountCreateInfo? = null,
        private val xafAccount: XafExternalAccountCreateInfo? = null,
        private val xofAccount: XofExternalAccountCreateInfo? = null,
        private val zarAccount: ZarExternalAccountCreateInfo? = null,
        private val zmwAccount: ZmwExternalAccountCreateInfo? = null,
        private val swiftAccount: SwiftAccount? = null,
        private val baseWallet: BaseWalletInfo? = null,
        private val ethereumWalletExternal: EthereumWalletExternalAccountInfo? = null,
        private val lightningWallet: LightningWalletInfo? = null,
        private val polygonWallet: PolygonWalletInfo? = null,
        private val solanaWallet: SolanaWalletInfo? = null,
        private val sparkWallet: SparkWalletInfo? = null,
        private val tronWallet: TronWalletInfo? = null,
        private val _json: JsonValue? = null,
    ) {

        fun aedAccount(): AedExternalAccountCreateInfo? = aedAccount

        fun bdtAccount(): BdtExternalAccountCreateInfo? = bdtAccount

        fun brlAccount(): BrlExternalAccountCreateInfo? = brlAccount

        fun bwpAccount(): BwpExternalAccountCreateInfo? = bwpAccount

        fun cadAccount(): CadExternalAccountCreateInfo? = cadAccount

        fun copAccount(): CopExternalAccountCreateInfo? = copAccount

        fun dkkAccount(): DkkExternalAccountCreateInfo? = dkkAccount

        fun egpAccount(): EgpExternalAccountCreateInfo? = egpAccount

        fun eurAccount(): EurExternalAccountCreateInfo? = eurAccount

        fun gbpAccount(): GbpExternalAccountCreateInfo? = gbpAccount

        fun ghsAccount(): GhsExternalAccountCreateInfo? = ghsAccount

        fun gtqAccount(): GtqExternalAccountCreateInfo? = gtqAccount

        fun hkdAccount(): HkdExternalAccountCreateInfo? = hkdAccount

        fun htgAccount(): HtgExternalAccountCreateInfo? = htgAccount

        fun idrAccount(): IdrExternalAccountCreateInfo? = idrAccount

        fun inrAccount(): InrExternalAccountCreateInfo? = inrAccount

        fun jmdAccount(): JmdExternalAccountCreateInfo? = jmdAccount

        fun kesAccount(): KesExternalAccountCreateInfo? = kesAccount

        fun mwkAccount(): MwkExternalAccountCreateInfo? = mwkAccount

        fun mxnAccount(): MxnExternalAccountCreateInfo? = mxnAccount

        fun myrAccount(): MyrExternalAccountCreateInfo? = myrAccount

        fun ngnAccount(): NgnExternalAccountCreateInfo? = ngnAccount

        fun phpAccount(): PhpExternalAccountCreateInfo? = phpAccount

        fun pkrAccount(): PkrExternalAccountCreateInfo? = pkrAccount

        fun rwfAccount(): RwfExternalAccountCreateInfo? = rwfAccount

        fun sgdAccount(): SgdExternalAccountCreateInfo? = sgdAccount

        fun slvAccount(): SlvExternalAccountCreateInfo? = slvAccount

        fun thbAccount(): ThbExternalAccountCreateInfo? = thbAccount

        fun tzsAccount(): TzsExternalAccountCreateInfo? = tzsAccount

        fun ugxAccount(): UgxExternalAccountCreateInfo? = ugxAccount

        fun usdAccount(): UsdExternalAccountCreateInfo? = usdAccount

        fun vndAccount(): VndExternalAccountCreateInfo? = vndAccount

        fun xafAccount(): XafExternalAccountCreateInfo? = xafAccount

        fun xofAccount(): XofExternalAccountCreateInfo? = xofAccount

        fun zarAccount(): ZarExternalAccountCreateInfo? = zarAccount

        fun zmwAccount(): ZmwExternalAccountCreateInfo? = zmwAccount

        fun swiftAccount(): SwiftAccount? = swiftAccount

        fun baseWallet(): BaseWalletInfo? = baseWallet

        fun ethereumWalletExternal(): EthereumWalletExternalAccountInfo? = ethereumWalletExternal

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun lightningWallet(): LightningWalletInfo? = lightningWallet

        fun polygonWallet(): PolygonWalletInfo? = polygonWallet

        fun solanaWallet(): SolanaWalletInfo? = solanaWallet

        fun sparkWallet(): SparkWalletInfo? = sparkWallet

        fun tronWallet(): TronWalletInfo? = tronWallet

        fun isAedAccount(): Boolean = aedAccount != null

        fun isBdtAccount(): Boolean = bdtAccount != null

        fun isBrlAccount(): Boolean = brlAccount != null

        fun isBwpAccount(): Boolean = bwpAccount != null

        fun isCadAccount(): Boolean = cadAccount != null

        fun isCopAccount(): Boolean = copAccount != null

        fun isDkkAccount(): Boolean = dkkAccount != null

        fun isEgpAccount(): Boolean = egpAccount != null

        fun isEurAccount(): Boolean = eurAccount != null

        fun isGbpAccount(): Boolean = gbpAccount != null

        fun isGhsAccount(): Boolean = ghsAccount != null

        fun isGtqAccount(): Boolean = gtqAccount != null

        fun isHkdAccount(): Boolean = hkdAccount != null

        fun isHtgAccount(): Boolean = htgAccount != null

        fun isIdrAccount(): Boolean = idrAccount != null

        fun isInrAccount(): Boolean = inrAccount != null

        fun isJmdAccount(): Boolean = jmdAccount != null

        fun isKesAccount(): Boolean = kesAccount != null

        fun isMwkAccount(): Boolean = mwkAccount != null

        fun isMxnAccount(): Boolean = mxnAccount != null

        fun isMyrAccount(): Boolean = myrAccount != null

        fun isNgnAccount(): Boolean = ngnAccount != null

        fun isPhpAccount(): Boolean = phpAccount != null

        fun isPkrAccount(): Boolean = pkrAccount != null

        fun isRwfAccount(): Boolean = rwfAccount != null

        fun isSgdAccount(): Boolean = sgdAccount != null

        fun isSlvAccount(): Boolean = slvAccount != null

        fun isThbAccount(): Boolean = thbAccount != null

        fun isTzsAccount(): Boolean = tzsAccount != null

        fun isUgxAccount(): Boolean = ugxAccount != null

        fun isUsdAccount(): Boolean = usdAccount != null

        fun isVndAccount(): Boolean = vndAccount != null

        fun isXafAccount(): Boolean = xafAccount != null

        fun isXofAccount(): Boolean = xofAccount != null

        fun isZarAccount(): Boolean = zarAccount != null

        fun isZmwAccount(): Boolean = zmwAccount != null

        fun isSwiftAccount(): Boolean = swiftAccount != null

        fun isBaseWallet(): Boolean = baseWallet != null

        fun isEthereumWalletExternal(): Boolean = ethereumWalletExternal != null

        fun isLightningWallet(): Boolean = lightningWallet != null

        fun isPolygonWallet(): Boolean = polygonWallet != null

        fun isSolanaWallet(): Boolean = solanaWallet != null

        fun isSparkWallet(): Boolean = sparkWallet != null

        fun isTronWallet(): Boolean = tronWallet != null

        fun asAedAccount(): AedExternalAccountCreateInfo = aedAccount.getOrThrow("aedAccount")

        fun asBdtAccount(): BdtExternalAccountCreateInfo = bdtAccount.getOrThrow("bdtAccount")

        fun asBrlAccount(): BrlExternalAccountCreateInfo = brlAccount.getOrThrow("brlAccount")

        fun asBwpAccount(): BwpExternalAccountCreateInfo = bwpAccount.getOrThrow("bwpAccount")

        fun asCadAccount(): CadExternalAccountCreateInfo = cadAccount.getOrThrow("cadAccount")

        fun asCopAccount(): CopExternalAccountCreateInfo = copAccount.getOrThrow("copAccount")

        fun asDkkAccount(): DkkExternalAccountCreateInfo = dkkAccount.getOrThrow("dkkAccount")

        fun asEgpAccount(): EgpExternalAccountCreateInfo = egpAccount.getOrThrow("egpAccount")

        fun asEurAccount(): EurExternalAccountCreateInfo = eurAccount.getOrThrow("eurAccount")

        fun asGbpAccount(): GbpExternalAccountCreateInfo = gbpAccount.getOrThrow("gbpAccount")

        fun asGhsAccount(): GhsExternalAccountCreateInfo = ghsAccount.getOrThrow("ghsAccount")

        fun asGtqAccount(): GtqExternalAccountCreateInfo = gtqAccount.getOrThrow("gtqAccount")

        fun asHkdAccount(): HkdExternalAccountCreateInfo = hkdAccount.getOrThrow("hkdAccount")

        fun asHtgAccount(): HtgExternalAccountCreateInfo = htgAccount.getOrThrow("htgAccount")

        fun asIdrAccount(): IdrExternalAccountCreateInfo = idrAccount.getOrThrow("idrAccount")

        fun asInrAccount(): InrExternalAccountCreateInfo = inrAccount.getOrThrow("inrAccount")

        fun asJmdAccount(): JmdExternalAccountCreateInfo = jmdAccount.getOrThrow("jmdAccount")

        fun asKesAccount(): KesExternalAccountCreateInfo = kesAccount.getOrThrow("kesAccount")

        fun asMwkAccount(): MwkExternalAccountCreateInfo = mwkAccount.getOrThrow("mwkAccount")

        fun asMxnAccount(): MxnExternalAccountCreateInfo = mxnAccount.getOrThrow("mxnAccount")

        fun asMyrAccount(): MyrExternalAccountCreateInfo = myrAccount.getOrThrow("myrAccount")

        fun asNgnAccount(): NgnExternalAccountCreateInfo = ngnAccount.getOrThrow("ngnAccount")

        fun asPhpAccount(): PhpExternalAccountCreateInfo = phpAccount.getOrThrow("phpAccount")

        fun asPkrAccount(): PkrExternalAccountCreateInfo = pkrAccount.getOrThrow("pkrAccount")

        fun asRwfAccount(): RwfExternalAccountCreateInfo = rwfAccount.getOrThrow("rwfAccount")

        fun asSgdAccount(): SgdExternalAccountCreateInfo = sgdAccount.getOrThrow("sgdAccount")

        fun asSlvAccount(): SlvExternalAccountCreateInfo = slvAccount.getOrThrow("slvAccount")

        fun asThbAccount(): ThbExternalAccountCreateInfo = thbAccount.getOrThrow("thbAccount")

        fun asTzsAccount(): TzsExternalAccountCreateInfo = tzsAccount.getOrThrow("tzsAccount")

        fun asUgxAccount(): UgxExternalAccountCreateInfo = ugxAccount.getOrThrow("ugxAccount")

        fun asUsdAccount(): UsdExternalAccountCreateInfo = usdAccount.getOrThrow("usdAccount")

        fun asVndAccount(): VndExternalAccountCreateInfo = vndAccount.getOrThrow("vndAccount")

        fun asXafAccount(): XafExternalAccountCreateInfo = xafAccount.getOrThrow("xafAccount")

        fun asXofAccount(): XofExternalAccountCreateInfo = xofAccount.getOrThrow("xofAccount")

        fun asZarAccount(): ZarExternalAccountCreateInfo = zarAccount.getOrThrow("zarAccount")

        fun asZmwAccount(): ZmwExternalAccountCreateInfo = zmwAccount.getOrThrow("zmwAccount")

        fun asSwiftAccount(): SwiftAccount = swiftAccount.getOrThrow("swiftAccount")

        fun asBaseWallet(): BaseWalletInfo = baseWallet.getOrThrow("baseWallet")

        fun asEthereumWalletExternal(): EthereumWalletExternalAccountInfo =
            ethereumWalletExternal.getOrThrow("ethereumWalletExternal")

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun asLightningWallet(): LightningWalletInfo = lightningWallet.getOrThrow("lightningWallet")

        fun asPolygonWallet(): PolygonWalletInfo = polygonWallet.getOrThrow("polygonWallet")

        fun asSolanaWallet(): SolanaWalletInfo = solanaWallet.getOrThrow("solanaWallet")

        fun asSparkWallet(): SparkWalletInfo = sparkWallet.getOrThrow("sparkWallet")

        fun asTronWallet(): TronWalletInfo = tronWallet.getOrThrow("tronWallet")

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
         * val result: String? = accountInfo.accept(object : AccountInfo.Visitor<String?> {
         *     override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo): String? = aedAccount.toString()
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
                aedAccount != null -> visitor.visitAedAccount(aedAccount)
                bdtAccount != null -> visitor.visitBdtAccount(bdtAccount)
                brlAccount != null -> visitor.visitBrlAccount(brlAccount)
                bwpAccount != null -> visitor.visitBwpAccount(bwpAccount)
                cadAccount != null -> visitor.visitCadAccount(cadAccount)
                copAccount != null -> visitor.visitCopAccount(copAccount)
                dkkAccount != null -> visitor.visitDkkAccount(dkkAccount)
                egpAccount != null -> visitor.visitEgpAccount(egpAccount)
                eurAccount != null -> visitor.visitEurAccount(eurAccount)
                gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
                ghsAccount != null -> visitor.visitGhsAccount(ghsAccount)
                gtqAccount != null -> visitor.visitGtqAccount(gtqAccount)
                hkdAccount != null -> visitor.visitHkdAccount(hkdAccount)
                htgAccount != null -> visitor.visitHtgAccount(htgAccount)
                idrAccount != null -> visitor.visitIdrAccount(idrAccount)
                inrAccount != null -> visitor.visitInrAccount(inrAccount)
                jmdAccount != null -> visitor.visitJmdAccount(jmdAccount)
                kesAccount != null -> visitor.visitKesAccount(kesAccount)
                mwkAccount != null -> visitor.visitMwkAccount(mwkAccount)
                mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
                myrAccount != null -> visitor.visitMyrAccount(myrAccount)
                ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
                phpAccount != null -> visitor.visitPhpAccount(phpAccount)
                pkrAccount != null -> visitor.visitPkrAccount(pkrAccount)
                rwfAccount != null -> visitor.visitRwfAccount(rwfAccount)
                sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
                slvAccount != null -> visitor.visitSlvAccount(slvAccount)
                thbAccount != null -> visitor.visitThbAccount(thbAccount)
                tzsAccount != null -> visitor.visitTzsAccount(tzsAccount)
                ugxAccount != null -> visitor.visitUgxAccount(ugxAccount)
                usdAccount != null -> visitor.visitUsdAccount(usdAccount)
                vndAccount != null -> visitor.visitVndAccount(vndAccount)
                xafAccount != null -> visitor.visitXafAccount(xafAccount)
                xofAccount != null -> visitor.visitXofAccount(xofAccount)
                zarAccount != null -> visitor.visitZarAccount(zarAccount)
                zmwAccount != null -> visitor.visitZmwAccount(zmwAccount)
                swiftAccount != null -> visitor.visitSwiftAccount(swiftAccount)
                baseWallet != null -> visitor.visitBaseWallet(baseWallet)
                ethereumWalletExternal != null ->
                    visitor.visitEthereumWalletExternal(ethereumWalletExternal)
                lightningWallet != null -> visitor.visitLightningWallet(lightningWallet)
                polygonWallet != null -> visitor.visitPolygonWallet(polygonWallet)
                solanaWallet != null -> visitor.visitSolanaWallet(solanaWallet)
                sparkWallet != null -> visitor.visitSparkWallet(sparkWallet)
                tronWallet != null -> visitor.visitTronWallet(tronWallet)
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
        fun validate(): AccountInfo = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo) {
                        aedAccount.validate()
                    }

                    override fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) {
                        bdtAccount.validate()
                    }

                    override fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo) {
                        brlAccount.validate()
                    }

                    override fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) {
                        bwpAccount.validate()
                    }

                    override fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo) {
                        cadAccount.validate()
                    }

                    override fun visitCopAccount(copAccount: CopExternalAccountCreateInfo) {
                        copAccount.validate()
                    }

                    override fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) {
                        dkkAccount.validate()
                    }

                    override fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo) {
                        egpAccount.validate()
                    }

                    override fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo) {
                        eurAccount.validate()
                    }

                    override fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) {
                        gbpAccount.validate()
                    }

                    override fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) {
                        ghsAccount.validate()
                    }

                    override fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) {
                        gtqAccount.validate()
                    }

                    override fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) {
                        hkdAccount.validate()
                    }

                    override fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo) {
                        htgAccount.validate()
                    }

                    override fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo) {
                        idrAccount.validate()
                    }

                    override fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo) {
                        inrAccount.validate()
                    }

                    override fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) {
                        jmdAccount.validate()
                    }

                    override fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo) {
                        kesAccount.validate()
                    }

                    override fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) {
                        mwkAccount.validate()
                    }

                    override fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) {
                        mxnAccount.validate()
                    }

                    override fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo) {
                        myrAccount.validate()
                    }

                    override fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) {
                        ngnAccount.validate()
                    }

                    override fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo) {
                        phpAccount.validate()
                    }

                    override fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) {
                        pkrAccount.validate()
                    }

                    override fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) {
                        rwfAccount.validate()
                    }

                    override fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) {
                        sgdAccount.validate()
                    }

                    override fun visitSlvAccount(slvAccount: SlvExternalAccountCreateInfo) {
                        slvAccount.validate()
                    }

                    override fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo) {
                        thbAccount.validate()
                    }

                    override fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) {
                        tzsAccount.validate()
                    }

                    override fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) {
                        ugxAccount.validate()
                    }

                    override fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo) {
                        usdAccount.validate()
                    }

                    override fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo) {
                        vndAccount.validate()
                    }

                    override fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo) {
                        xafAccount.validate()
                    }

                    override fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo) {
                        xofAccount.validate()
                    }

                    override fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo) {
                        zarAccount.validate()
                    }

                    override fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) {
                        zmwAccount.validate()
                    }

                    override fun visitSwiftAccount(swiftAccount: SwiftAccount) {
                        swiftAccount.validate()
                    }

                    override fun visitBaseWallet(baseWallet: BaseWalletInfo) {
                        baseWallet.validate()
                    }

                    override fun visitEthereumWalletExternal(
                        ethereumWalletExternal: EthereumWalletExternalAccountInfo
                    ) {
                        ethereumWalletExternal.validate()
                    }

                    override fun visitLightningWallet(lightningWallet: LightningWalletInfo) {
                        lightningWallet.validate()
                    }

                    override fun visitPolygonWallet(polygonWallet: PolygonWalletInfo) {
                        polygonWallet.validate()
                    }

                    override fun visitSolanaWallet(solanaWallet: SolanaWalletInfo) {
                        solanaWallet.validate()
                    }

                    override fun visitSparkWallet(sparkWallet: SparkWalletInfo) {
                        sparkWallet.validate()
                    }

                    override fun visitTronWallet(tronWallet: TronWalletInfo) {
                        tronWallet.validate()
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
                    override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo) =
                        aedAccount.validity()

                    override fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) =
                        bdtAccount.validity()

                    override fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo) =
                        brlAccount.validity()

                    override fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) =
                        bwpAccount.validity()

                    override fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo) =
                        cadAccount.validity()

                    override fun visitCopAccount(copAccount: CopExternalAccountCreateInfo) =
                        copAccount.validity()

                    override fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) =
                        dkkAccount.validity()

                    override fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo) =
                        egpAccount.validity()

                    override fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo) =
                        eurAccount.validity()

                    override fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) =
                        gbpAccount.validity()

                    override fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) =
                        ghsAccount.validity()

                    override fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) =
                        gtqAccount.validity()

                    override fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) =
                        hkdAccount.validity()

                    override fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo) =
                        htgAccount.validity()

                    override fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo) =
                        idrAccount.validity()

                    override fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo) =
                        inrAccount.validity()

                    override fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) =
                        jmdAccount.validity()

                    override fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo) =
                        kesAccount.validity()

                    override fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) =
                        mwkAccount.validity()

                    override fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) =
                        mxnAccount.validity()

                    override fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo) =
                        myrAccount.validity()

                    override fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) =
                        ngnAccount.validity()

                    override fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo) =
                        phpAccount.validity()

                    override fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) =
                        pkrAccount.validity()

                    override fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) =
                        rwfAccount.validity()

                    override fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) =
                        sgdAccount.validity()

                    override fun visitSlvAccount(slvAccount: SlvExternalAccountCreateInfo) =
                        slvAccount.validity()

                    override fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo) =
                        thbAccount.validity()

                    override fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) =
                        tzsAccount.validity()

                    override fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) =
                        ugxAccount.validity()

                    override fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo) =
                        usdAccount.validity()

                    override fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo) =
                        vndAccount.validity()

                    override fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo) =
                        xafAccount.validity()

                    override fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo) =
                        xofAccount.validity()

                    override fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo) =
                        zarAccount.validity()

                    override fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) =
                        zmwAccount.validity()

                    override fun visitSwiftAccount(swiftAccount: SwiftAccount) =
                        swiftAccount.validity()

                    override fun visitBaseWallet(baseWallet: BaseWalletInfo) = baseWallet.validity()

                    override fun visitEthereumWalletExternal(
                        ethereumWalletExternal: EthereumWalletExternalAccountInfo
                    ) = ethereumWalletExternal.validity()

                    override fun visitLightningWallet(lightningWallet: LightningWalletInfo) =
                        lightningWallet.validity()

                    override fun visitPolygonWallet(polygonWallet: PolygonWalletInfo) =
                        polygonWallet.validity()

                    override fun visitSolanaWallet(solanaWallet: SolanaWalletInfo) =
                        solanaWallet.validity()

                    override fun visitSparkWallet(sparkWallet: SparkWalletInfo) =
                        sparkWallet.validity()

                    override fun visitTronWallet(tronWallet: TronWalletInfo) = tronWallet.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountInfo &&
                aedAccount == other.aedAccount &&
                bdtAccount == other.bdtAccount &&
                brlAccount == other.brlAccount &&
                bwpAccount == other.bwpAccount &&
                cadAccount == other.cadAccount &&
                copAccount == other.copAccount &&
                dkkAccount == other.dkkAccount &&
                egpAccount == other.egpAccount &&
                eurAccount == other.eurAccount &&
                gbpAccount == other.gbpAccount &&
                ghsAccount == other.ghsAccount &&
                gtqAccount == other.gtqAccount &&
                hkdAccount == other.hkdAccount &&
                htgAccount == other.htgAccount &&
                idrAccount == other.idrAccount &&
                inrAccount == other.inrAccount &&
                jmdAccount == other.jmdAccount &&
                kesAccount == other.kesAccount &&
                mwkAccount == other.mwkAccount &&
                mxnAccount == other.mxnAccount &&
                myrAccount == other.myrAccount &&
                ngnAccount == other.ngnAccount &&
                phpAccount == other.phpAccount &&
                pkrAccount == other.pkrAccount &&
                rwfAccount == other.rwfAccount &&
                sgdAccount == other.sgdAccount &&
                slvAccount == other.slvAccount &&
                thbAccount == other.thbAccount &&
                tzsAccount == other.tzsAccount &&
                ugxAccount == other.ugxAccount &&
                usdAccount == other.usdAccount &&
                vndAccount == other.vndAccount &&
                xafAccount == other.xafAccount &&
                xofAccount == other.xofAccount &&
                zarAccount == other.zarAccount &&
                zmwAccount == other.zmwAccount &&
                swiftAccount == other.swiftAccount &&
                baseWallet == other.baseWallet &&
                ethereumWalletExternal == other.ethereumWalletExternal &&
                lightningWallet == other.lightningWallet &&
                polygonWallet == other.polygonWallet &&
                solanaWallet == other.solanaWallet &&
                sparkWallet == other.sparkWallet &&
                tronWallet == other.tronWallet
        }

        override fun hashCode(): Int =
            Objects.hash(
                aedAccount,
                bdtAccount,
                brlAccount,
                bwpAccount,
                cadAccount,
                copAccount,
                dkkAccount,
                egpAccount,
                eurAccount,
                gbpAccount,
                ghsAccount,
                gtqAccount,
                hkdAccount,
                htgAccount,
                idrAccount,
                inrAccount,
                jmdAccount,
                kesAccount,
                mwkAccount,
                mxnAccount,
                myrAccount,
                ngnAccount,
                phpAccount,
                pkrAccount,
                rwfAccount,
                sgdAccount,
                slvAccount,
                thbAccount,
                tzsAccount,
                ugxAccount,
                usdAccount,
                vndAccount,
                xafAccount,
                xofAccount,
                zarAccount,
                zmwAccount,
                swiftAccount,
                baseWallet,
                ethereumWalletExternal,
                lightningWallet,
                polygonWallet,
                solanaWallet,
                sparkWallet,
                tronWallet,
            )

        override fun toString(): String =
            when {
                aedAccount != null -> "AccountInfo{aedAccount=$aedAccount}"
                bdtAccount != null -> "AccountInfo{bdtAccount=$bdtAccount}"
                brlAccount != null -> "AccountInfo{brlAccount=$brlAccount}"
                bwpAccount != null -> "AccountInfo{bwpAccount=$bwpAccount}"
                cadAccount != null -> "AccountInfo{cadAccount=$cadAccount}"
                copAccount != null -> "AccountInfo{copAccount=$copAccount}"
                dkkAccount != null -> "AccountInfo{dkkAccount=$dkkAccount}"
                egpAccount != null -> "AccountInfo{egpAccount=$egpAccount}"
                eurAccount != null -> "AccountInfo{eurAccount=$eurAccount}"
                gbpAccount != null -> "AccountInfo{gbpAccount=$gbpAccount}"
                ghsAccount != null -> "AccountInfo{ghsAccount=$ghsAccount}"
                gtqAccount != null -> "AccountInfo{gtqAccount=$gtqAccount}"
                hkdAccount != null -> "AccountInfo{hkdAccount=$hkdAccount}"
                htgAccount != null -> "AccountInfo{htgAccount=$htgAccount}"
                idrAccount != null -> "AccountInfo{idrAccount=$idrAccount}"
                inrAccount != null -> "AccountInfo{inrAccount=$inrAccount}"
                jmdAccount != null -> "AccountInfo{jmdAccount=$jmdAccount}"
                kesAccount != null -> "AccountInfo{kesAccount=$kesAccount}"
                mwkAccount != null -> "AccountInfo{mwkAccount=$mwkAccount}"
                mxnAccount != null -> "AccountInfo{mxnAccount=$mxnAccount}"
                myrAccount != null -> "AccountInfo{myrAccount=$myrAccount}"
                ngnAccount != null -> "AccountInfo{ngnAccount=$ngnAccount}"
                phpAccount != null -> "AccountInfo{phpAccount=$phpAccount}"
                pkrAccount != null -> "AccountInfo{pkrAccount=$pkrAccount}"
                rwfAccount != null -> "AccountInfo{rwfAccount=$rwfAccount}"
                sgdAccount != null -> "AccountInfo{sgdAccount=$sgdAccount}"
                slvAccount != null -> "AccountInfo{slvAccount=$slvAccount}"
                thbAccount != null -> "AccountInfo{thbAccount=$thbAccount}"
                tzsAccount != null -> "AccountInfo{tzsAccount=$tzsAccount}"
                ugxAccount != null -> "AccountInfo{ugxAccount=$ugxAccount}"
                usdAccount != null -> "AccountInfo{usdAccount=$usdAccount}"
                vndAccount != null -> "AccountInfo{vndAccount=$vndAccount}"
                xafAccount != null -> "AccountInfo{xafAccount=$xafAccount}"
                xofAccount != null -> "AccountInfo{xofAccount=$xofAccount}"
                zarAccount != null -> "AccountInfo{zarAccount=$zarAccount}"
                zmwAccount != null -> "AccountInfo{zmwAccount=$zmwAccount}"
                swiftAccount != null -> "AccountInfo{swiftAccount=$swiftAccount}"
                baseWallet != null -> "AccountInfo{baseWallet=$baseWallet}"
                ethereumWalletExternal != null ->
                    "AccountInfo{ethereumWalletExternal=$ethereumWalletExternal}"
                lightningWallet != null -> "AccountInfo{lightningWallet=$lightningWallet}"
                polygonWallet != null -> "AccountInfo{polygonWallet=$polygonWallet}"
                solanaWallet != null -> "AccountInfo{solanaWallet=$solanaWallet}"
                sparkWallet != null -> "AccountInfo{sparkWallet=$sparkWallet}"
                tronWallet != null -> "AccountInfo{tronWallet=$tronWallet}"
                _json != null -> "AccountInfo{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountInfo")
            }

        companion object {

            fun ofAedAccount(aedAccount: AedExternalAccountCreateInfo) =
                AccountInfo(aedAccount = aedAccount)

            fun ofBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) =
                AccountInfo(bdtAccount = bdtAccount)

            fun ofBrlAccount(brlAccount: BrlExternalAccountCreateInfo) =
                AccountInfo(brlAccount = brlAccount)

            fun ofBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) =
                AccountInfo(bwpAccount = bwpAccount)

            fun ofCadAccount(cadAccount: CadExternalAccountCreateInfo) =
                AccountInfo(cadAccount = cadAccount)

            fun ofCopAccount(copAccount: CopExternalAccountCreateInfo) =
                AccountInfo(copAccount = copAccount)

            fun ofDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) =
                AccountInfo(dkkAccount = dkkAccount)

            fun ofEgpAccount(egpAccount: EgpExternalAccountCreateInfo) =
                AccountInfo(egpAccount = egpAccount)

            fun ofEurAccount(eurAccount: EurExternalAccountCreateInfo) =
                AccountInfo(eurAccount = eurAccount)

            fun ofGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) =
                AccountInfo(gbpAccount = gbpAccount)

            fun ofGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) =
                AccountInfo(ghsAccount = ghsAccount)

            fun ofGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) =
                AccountInfo(gtqAccount = gtqAccount)

            fun ofHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) =
                AccountInfo(hkdAccount = hkdAccount)

            fun ofHtgAccount(htgAccount: HtgExternalAccountCreateInfo) =
                AccountInfo(htgAccount = htgAccount)

            fun ofIdrAccount(idrAccount: IdrExternalAccountCreateInfo) =
                AccountInfo(idrAccount = idrAccount)

            fun ofInrAccount(inrAccount: InrExternalAccountCreateInfo) =
                AccountInfo(inrAccount = inrAccount)

            fun ofJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) =
                AccountInfo(jmdAccount = jmdAccount)

            fun ofKesAccount(kesAccount: KesExternalAccountCreateInfo) =
                AccountInfo(kesAccount = kesAccount)

            fun ofMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) =
                AccountInfo(mwkAccount = mwkAccount)

            fun ofMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) =
                AccountInfo(mxnAccount = mxnAccount)

            fun ofMyrAccount(myrAccount: MyrExternalAccountCreateInfo) =
                AccountInfo(myrAccount = myrAccount)

            fun ofNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) =
                AccountInfo(ngnAccount = ngnAccount)

            fun ofPhpAccount(phpAccount: PhpExternalAccountCreateInfo) =
                AccountInfo(phpAccount = phpAccount)

            fun ofPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) =
                AccountInfo(pkrAccount = pkrAccount)

            fun ofRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) =
                AccountInfo(rwfAccount = rwfAccount)

            fun ofSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) =
                AccountInfo(sgdAccount = sgdAccount)

            fun ofSlvAccount(slvAccount: SlvExternalAccountCreateInfo) =
                AccountInfo(slvAccount = slvAccount)

            fun ofThbAccount(thbAccount: ThbExternalAccountCreateInfo) =
                AccountInfo(thbAccount = thbAccount)

            fun ofTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) =
                AccountInfo(tzsAccount = tzsAccount)

            fun ofUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) =
                AccountInfo(ugxAccount = ugxAccount)

            fun ofUsdAccount(usdAccount: UsdExternalAccountCreateInfo) =
                AccountInfo(usdAccount = usdAccount)

            fun ofVndAccount(vndAccount: VndExternalAccountCreateInfo) =
                AccountInfo(vndAccount = vndAccount)

            fun ofXafAccount(xafAccount: XafExternalAccountCreateInfo) =
                AccountInfo(xafAccount = xafAccount)

            fun ofXofAccount(xofAccount: XofExternalAccountCreateInfo) =
                AccountInfo(xofAccount = xofAccount)

            fun ofZarAccount(zarAccount: ZarExternalAccountCreateInfo) =
                AccountInfo(zarAccount = zarAccount)

            fun ofZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) =
                AccountInfo(zmwAccount = zmwAccount)

            fun ofSwiftAccount(swiftAccount: SwiftAccount) =
                AccountInfo(swiftAccount = swiftAccount)

            fun ofBaseWallet(baseWallet: BaseWalletInfo) = AccountInfo(baseWallet = baseWallet)

            fun ofEthereumWalletExternal(
                ethereumWalletExternal: EthereumWalletExternalAccountInfo
            ) = AccountInfo(ethereumWalletExternal = ethereumWalletExternal)

            /**
             * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or
             * `lightningAddress` must be provided.
             */
            fun ofLightningWallet(lightningWallet: LightningWalletInfo) =
                AccountInfo(lightningWallet = lightningWallet)

            fun ofPolygonWallet(polygonWallet: PolygonWalletInfo) =
                AccountInfo(polygonWallet = polygonWallet)

            fun ofSolanaWallet(solanaWallet: SolanaWalletInfo) =
                AccountInfo(solanaWallet = solanaWallet)

            fun ofSparkWallet(sparkWallet: SparkWalletInfo) = AccountInfo(sparkWallet = sparkWallet)

            fun ofTronWallet(tronWallet: TronWalletInfo) = AccountInfo(tronWallet = tronWallet)
        }

        /**
         * An interface that defines how to map each variant of [AccountInfo] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo): T

            fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo): T

            fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo): T

            fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo): T

            fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo): T

            fun visitCopAccount(copAccount: CopExternalAccountCreateInfo): T

            fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo): T

            fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo): T

            fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo): T

            fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo): T

            fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo): T

            fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo): T

            fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo): T

            fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo): T

            fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo): T

            fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo): T

            fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo): T

            fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo): T

            fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo): T

            fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo): T

            fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo): T

            fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo): T

            fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo): T

            fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo): T

            fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo): T

            fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo): T

            fun visitSlvAccount(slvAccount: SlvExternalAccountCreateInfo): T

            fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo): T

            fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo): T

            fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo): T

            fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo): T

            fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo): T

            fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo): T

            fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo): T

            fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo): T

            fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo): T

            fun visitSwiftAccount(swiftAccount: SwiftAccount): T

            fun visitBaseWallet(baseWallet: BaseWalletInfo): T

            fun visitEthereumWalletExternal(
                ethereumWalletExternal: EthereumWalletExternalAccountInfo
            ): T

            /**
             * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or
             * `lightningAddress` must be provided.
             */
            fun visitLightningWallet(lightningWallet: LightningWalletInfo): T

            fun visitPolygonWallet(polygonWallet: PolygonWalletInfo): T

            fun visitSolanaWallet(solanaWallet: SolanaWalletInfo): T

            fun visitSparkWallet(sparkWallet: SparkWalletInfo): T

            fun visitTronWallet(tronWallet: TronWalletInfo): T

            /**
             * Maps an unknown variant of [AccountInfo] to a value of type [T].
             *
             * An instance of [AccountInfo] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown AccountInfo: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<AccountInfo>(AccountInfo::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AccountInfo {
                val json = JsonValue.fromJsonNode(node)
                val accountType = json.asObject()?.get("accountType")?.asString()

                when (accountType) {
                    "AED_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<AedExternalAccountCreateInfo>())
                            ?.let { AccountInfo(aedAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "BDT_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BdtExternalAccountCreateInfo>())
                            ?.let { AccountInfo(bdtAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "BRL_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BrlExternalAccountCreateInfo>())
                            ?.let { AccountInfo(brlAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "BWP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BwpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(bwpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "CAD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<CadExternalAccountCreateInfo>())
                            ?.let { AccountInfo(cadAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "COP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<CopExternalAccountCreateInfo>())
                            ?.let { AccountInfo(copAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "DKK_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<DkkExternalAccountCreateInfo>())
                            ?.let { AccountInfo(dkkAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "EGP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EgpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(egpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "EUR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EurExternalAccountCreateInfo>())
                            ?.let { AccountInfo(eurAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "GBP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GbpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(gbpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "GHS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GhsExternalAccountCreateInfo>())
                            ?.let { AccountInfo(ghsAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "GTQ_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GtqExternalAccountCreateInfo>())
                            ?.let { AccountInfo(gtqAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "HKD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<HkdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(hkdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "HTG_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<HtgExternalAccountCreateInfo>())
                            ?.let { AccountInfo(htgAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "IDR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<IdrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(idrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "INR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<InrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(inrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "JMD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<JmdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(jmdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "KES_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<KesExternalAccountCreateInfo>())
                            ?.let { AccountInfo(kesAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "MWK_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MwkExternalAccountCreateInfo>())
                            ?.let { AccountInfo(mwkAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "MXN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MxnExternalAccountCreateInfo>())
                            ?.let { AccountInfo(mxnAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "MYR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MyrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(myrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "NGN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<NgnExternalAccountCreateInfo>())
                            ?.let { AccountInfo(ngnAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "PHP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PhpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(phpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "PKR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PkrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(pkrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "RWF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<RwfExternalAccountCreateInfo>())
                            ?.let { AccountInfo(rwfAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "SGD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SgdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(sgdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "SLV_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SlvExternalAccountCreateInfo>())
                            ?.let { AccountInfo(slvAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "THB_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ThbExternalAccountCreateInfo>())
                            ?.let { AccountInfo(thbAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "TZS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<TzsExternalAccountCreateInfo>())
                            ?.let { AccountInfo(tzsAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "UGX_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<UgxExternalAccountCreateInfo>())
                            ?.let { AccountInfo(ugxAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "USD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<UsdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(usdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "VND_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<VndExternalAccountCreateInfo>())
                            ?.let { AccountInfo(vndAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "XAF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<XafExternalAccountCreateInfo>())
                            ?.let { AccountInfo(xafAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "XOF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<XofExternalAccountCreateInfo>())
                            ?.let { AccountInfo(xofAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "ZAR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ZarExternalAccountCreateInfo>())
                            ?.let { AccountInfo(zarAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "ZMW_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ZmwExternalAccountCreateInfo>())
                            ?.let { AccountInfo(zmwAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "SWIFT_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SwiftAccount>())?.let {
                            AccountInfo(swiftAccount = it, _json = json)
                        } ?: AccountInfo(_json = json)
                    }
                }

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<BaseWalletInfo>())?.let {
                                AccountInfo(baseWallet = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<EthereumWalletExternalAccountInfo>(),
                                )
                                ?.let { AccountInfo(ethereumWalletExternal = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<LightningWalletInfo>())?.let {
                                AccountInfo(lightningWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PolygonWalletInfo>())?.let {
                                AccountInfo(polygonWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SolanaWalletInfo>())?.let {
                                AccountInfo(solanaWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SparkWalletInfo>())?.let {
                                AccountInfo(sparkWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TronWalletInfo>())?.let {
                                AccountInfo(tronWallet = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AccountInfo(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<AccountInfo>(AccountInfo::class) {

            override fun serialize(
                value: AccountInfo,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.aedAccount != null -> generator.writeObject(value.aedAccount)
                    value.bdtAccount != null -> generator.writeObject(value.bdtAccount)
                    value.brlAccount != null -> generator.writeObject(value.brlAccount)
                    value.bwpAccount != null -> generator.writeObject(value.bwpAccount)
                    value.cadAccount != null -> generator.writeObject(value.cadAccount)
                    value.copAccount != null -> generator.writeObject(value.copAccount)
                    value.dkkAccount != null -> generator.writeObject(value.dkkAccount)
                    value.egpAccount != null -> generator.writeObject(value.egpAccount)
                    value.eurAccount != null -> generator.writeObject(value.eurAccount)
                    value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                    value.ghsAccount != null -> generator.writeObject(value.ghsAccount)
                    value.gtqAccount != null -> generator.writeObject(value.gtqAccount)
                    value.hkdAccount != null -> generator.writeObject(value.hkdAccount)
                    value.htgAccount != null -> generator.writeObject(value.htgAccount)
                    value.idrAccount != null -> generator.writeObject(value.idrAccount)
                    value.inrAccount != null -> generator.writeObject(value.inrAccount)
                    value.jmdAccount != null -> generator.writeObject(value.jmdAccount)
                    value.kesAccount != null -> generator.writeObject(value.kesAccount)
                    value.mwkAccount != null -> generator.writeObject(value.mwkAccount)
                    value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                    value.myrAccount != null -> generator.writeObject(value.myrAccount)
                    value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                    value.phpAccount != null -> generator.writeObject(value.phpAccount)
                    value.pkrAccount != null -> generator.writeObject(value.pkrAccount)
                    value.rwfAccount != null -> generator.writeObject(value.rwfAccount)
                    value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                    value.slvAccount != null -> generator.writeObject(value.slvAccount)
                    value.thbAccount != null -> generator.writeObject(value.thbAccount)
                    value.tzsAccount != null -> generator.writeObject(value.tzsAccount)
                    value.ugxAccount != null -> generator.writeObject(value.ugxAccount)
                    value.usdAccount != null -> generator.writeObject(value.usdAccount)
                    value.vndAccount != null -> generator.writeObject(value.vndAccount)
                    value.xafAccount != null -> generator.writeObject(value.xafAccount)
                    value.xofAccount != null -> generator.writeObject(value.xofAccount)
                    value.zarAccount != null -> generator.writeObject(value.zarAccount)
                    value.zmwAccount != null -> generator.writeObject(value.zmwAccount)
                    value.swiftAccount != null -> generator.writeObject(value.swiftAccount)
                    value.baseWallet != null -> generator.writeObject(value.baseWallet)
                    value.ethereumWalletExternal != null ->
                        generator.writeObject(value.ethereumWalletExternal)
                    value.lightningWallet != null -> generator.writeObject(value.lightningWallet)
                    value.polygonWallet != null -> generator.writeObject(value.polygonWallet)
                    value.solanaWallet != null -> generator.writeObject(value.solanaWallet)
                    value.sparkWallet != null -> generator.writeObject(value.sparkWallet)
                    value.tronWallet != null -> generator.writeObject(value.tronWallet)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AccountInfo")
                }
            }
        }

        class SwiftAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val beneficiary: JsonField<Beneficiary>,
            private val country: JsonField<String>,
            private val swiftCode: JsonField<String>,
            private val accountNumber: JsonField<String>,
            private val iban: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("beneficiary")
                @ExcludeMissing
                beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountType,
                bankName,
                beneficiary,
                country,
                swiftCode,
                accountNumber,
                iban,
                mutableMapOf(),
            )

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
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

            /**
             * The ISO 3166-1 alpha-2 country code of the bank account
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

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
             * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
             * accountNumber for all other corridors.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun iban(): String? = iban.getNullable("iban")

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [beneficiary].
             *
             * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("beneficiary")
            @ExcludeMissing
            fun _beneficiary(): JsonField<Beneficiary> = beneficiary

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
             * Returns the raw JSON value of [iban].
             *
             * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

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
                 * .bankName()
                 * .beneficiary()
                 * .country()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SwiftAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SWIFT_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var beneficiary: JsonField<Beneficiary>? = null
                private var country: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var iban: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(swiftAccount: SwiftAccount) = apply {
                    accountType = swiftAccount.accountType
                    bankName = swiftAccount.bankName
                    beneficiary = swiftAccount.beneficiary
                    country = swiftAccount.country
                    swiftCode = swiftAccount.swiftCode
                    accountNumber = swiftAccount.accountNumber
                    iban = swiftAccount.iban
                    additionalProperties = swiftAccount.additionalProperties.toMutableMap()
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

                fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

                /**
                 * Sets [Builder.beneficiary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                    this.beneficiary = beneficiary
                }

                /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
                fun beneficiary(individual: Beneficiary.Individual) =
                    beneficiary(Beneficiary.ofIndividual(individual))

                /**
                 * Alias for calling [beneficiary] with the following:
                 * ```kotlin
                 * Beneficiary.Individual.builder()
                 *     .fullName(fullName)
                 *     .build()
                 * ```
                 */
                fun individualBeneficiary(fullName: String) =
                    beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

                /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
                fun beneficiary(business: BusinessBeneficiary) =
                    beneficiary(Beneficiary.ofBusiness(business))

                /**
                 * Alias for calling [beneficiary] with the following:
                 * ```kotlin
                 * BusinessBeneficiary.builder()
                 *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                 *     .legalName(legalName)
                 *     .build()
                 * ```
                 */
                fun businessBeneficiary(legalName: String) =
                    beneficiary(
                        BusinessBeneficiary.builder()
                            .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                            .legalName(legalName)
                            .build()
                    )

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
                 * .bankName()
                 * .beneficiary()
                 * .country()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SwiftAccount =
                    SwiftAccount(
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("beneficiary", beneficiary),
                        checkRequired("country", country),
                        checkRequired("swiftCode", swiftCode),
                        accountNumber,
                        iban,
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

                _accountType().let {
                    if (it != JsonValue.from("SWIFT_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
                beneficiary().validate()
                country()
                swiftCode()
                accountNumber()
                iban()
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
                accountType.let { if (it == JsonValue.from("SWIFT_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (beneficiary.asKnown()?.validity() ?: 0) +
                    (if (country.asKnown() == null) 0 else 1) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (accountNumber.asKnown() == null) 0 else 1) +
                    (if (iban.asKnown() == null) 0 else 1)

            @JsonDeserialize(using = Beneficiary.Deserializer::class)
            @JsonSerialize(using = Beneficiary.Serializer::class)
            class Beneficiary
            private constructor(
                private val individual: Individual? = null,
                private val business: BusinessBeneficiary? = null,
                private val _json: JsonValue? = null,
            ) {

                fun individual(): Individual? = individual

                fun business(): BusinessBeneficiary? = business

                fun isIndividual(): Boolean = individual != null

                fun isBusiness(): Boolean = business != null

                fun asIndividual(): Individual = individual.getOrThrow("individual")

                fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

                fun _json(): JsonValue? = _json

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```kotlin
                 * import com.lightspark.grid.core.JsonValue
                 *
                 * val result: String? = beneficiary.accept(object : Beneficiary.Visitor<String?> {
                 *     override fun visitIndividual(individual: Individual): String? = individual.toString()
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
                 * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden
                 *   in [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        individual != null -> visitor.visitIndividual(individual)
                        business != null -> visitor.visitBusiness(business)
                        else -> visitor.unknown(_json)
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
                fun validate(): Beneficiary = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitIndividual(individual: Individual) {
                                individual.validate()
                            }

                            override fun visitBusiness(business: BusinessBeneficiary) {
                                business.validate()
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
                            override fun visitIndividual(individual: Individual) =
                                individual.validity()

                            override fun visitBusiness(business: BusinessBeneficiary) =
                                business.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Beneficiary &&
                        individual == other.individual &&
                        business == other.business
                }

                override fun hashCode(): Int = Objects.hash(individual, business)

                override fun toString(): String =
                    when {
                        individual != null -> "Beneficiary{individual=$individual}"
                        business != null -> "Beneficiary{business=$business}"
                        _json != null -> "Beneficiary{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }

                companion object {

                    fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                    fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
                }

                /**
                 * An interface that defines how to map each variant of [Beneficiary] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitIndividual(individual: Individual): T

                    fun visitBusiness(business: BusinessBeneficiary): T

                    /**
                     * Maps an unknown variant of [Beneficiary] to a value of type [T].
                     *
                     * An instance of [Beneficiary] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LightsparkGridInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                        val json = JsonValue.fromJsonNode(node)
                        val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                        when (beneficiaryType) {
                            "INDIVIDUAL" -> {
                                return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                    Beneficiary(individual = it, _json = json)
                                } ?: Beneficiary(_json = json)
                            }
                            "BUSINESS" -> {
                                return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                    ?.let { Beneficiary(business = it, _json = json) }
                                    ?: Beneficiary(_json = json)
                            }
                        }

                        return Beneficiary(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                    override fun serialize(
                        value: Beneficiary,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.individual != null -> generator.writeObject(value.individual)
                            value.business != null -> generator.writeObject(value.business)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Beneficiary")
                        }
                    }
                }

                class Individual
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val beneficiaryType: JsonValue,
                    private val fullName: JsonField<String>,
                    private val address: JsonField<Address>,
                    private val birthDate: JsonField<String>,
                    private val countryOfResidence: JsonField<String>,
                    private val email: JsonField<String>,
                    private val nationality: JsonField<String>,
                    private val phoneNumber: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("beneficiaryType")
                        @ExcludeMissing
                        beneficiaryType: JsonValue = JsonMissing.of(),
                        @JsonProperty("fullName")
                        @ExcludeMissing
                        fullName: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("address")
                        @ExcludeMissing
                        address: JsonField<Address> = JsonMissing.of(),
                        @JsonProperty("birthDate")
                        @ExcludeMissing
                        birthDate: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("countryOfResidence")
                        @ExcludeMissing
                        countryOfResidence: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("email")
                        @ExcludeMissing
                        email: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("nationality")
                        @ExcludeMissing
                        nationality: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("phoneNumber")
                        @ExcludeMissing
                        phoneNumber: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        mutableMapOf(),
                    )

                    /**
                     * Expected to always return the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    fun _beneficiaryType(): JsonValue = beneficiaryType

                    /**
                     * The full name of the beneficiary
                     *
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun fullName(): String = fullName.getRequired("fullName")

                    /**
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun address(): Address? = address.getNullable("address")

                    /**
                     * The birth date of the beneficiary
                     *
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun birthDate(): String? = birthDate.getNullable("birthDate")

                    /**
                     * The country of residence of the beneficiary
                     *
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun countryOfResidence(): String? =
                        countryOfResidence.getNullable("countryOfResidence")

                    /**
                     * The email of the beneficiary
                     *
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun email(): String? = email.getNullable("email")

                    /**
                     * The nationality of the beneficiary
                     *
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun nationality(): String? = nationality.getNullable("nationality")

                    /**
                     * The phone number of the beneficiary
                     *
                     * @throws LightsparkGridInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                    /**
                     * Returns the raw JSON value of [fullName].
                     *
                     * Unlike [fullName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fun _fullName(): JsonField<String> = fullName

                    /**
                     * Returns the raw JSON value of [address].
                     *
                     * Unlike [address], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun _address(): JsonField<Address> = address

                    /**
                     * Returns the raw JSON value of [birthDate].
                     *
                     * Unlike [birthDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    fun _birthDate(): JsonField<String> = birthDate

                    /**
                     * Returns the raw JSON value of [countryOfResidence].
                     *
                     * Unlike [countryOfResidence], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    fun _countryOfResidence(): JsonField<String> = countryOfResidence

                    /**
                     * Returns the raw JSON value of [email].
                     *
                     * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                    /**
                     * Returns the raw JSON value of [nationality].
                     *
                     * Unlike [nationality], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    fun _nationality(): JsonField<String> = nationality

                    /**
                     * Returns the raw JSON value of [phoneNumber].
                     *
                     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    fun _phoneNumber(): JsonField<String> = phoneNumber

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
                         * Returns a mutable builder for constructing an instance of [Individual].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .fullName()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Individual]. */
                    class Builder internal constructor() {

                        private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                        private var fullName: JsonField<String>? = null
                        private var address: JsonField<Address> = JsonMissing.of()
                        private var birthDate: JsonField<String> = JsonMissing.of()
                        private var countryOfResidence: JsonField<String> = JsonMissing.of()
                        private var email: JsonField<String> = JsonMissing.of()
                        private var nationality: JsonField<String> = JsonMissing.of()
                        private var phoneNumber: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(individual: Individual) = apply {
                            beneficiaryType = individual.beneficiaryType
                            fullName = individual.fullName
                            address = individual.address
                            birthDate = individual.birthDate
                            countryOfResidence = individual.countryOfResidence
                            email = individual.email
                            nationality = individual.nationality
                            phoneNumber = individual.phoneNumber
                            additionalProperties = individual.additionalProperties.toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("INDIVIDUAL")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                            this.beneficiaryType = beneficiaryType
                        }

                        /** The full name of the beneficiary */
                        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                        /**
                         * Sets [Builder.fullName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fullName] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fullName(fullName: JsonField<String>) = apply {
                            this.fullName = fullName
                        }

                        fun address(address: Address) = address(JsonField.of(address))

                        /**
                         * Sets [Builder.address] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address] with a well-typed [Address]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address(address: JsonField<Address>) = apply { this.address = address }

                        /** The birth date of the beneficiary */
                        fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                        /**
                         * Sets [Builder.birthDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.birthDate] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun birthDate(birthDate: JsonField<String>) = apply {
                            this.birthDate = birthDate
                        }

                        /** The country of residence of the beneficiary */
                        fun countryOfResidence(countryOfResidence: String) =
                            countryOfResidence(JsonField.of(countryOfResidence))

                        /**
                         * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.countryOfResidence] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                            this.countryOfResidence = countryOfResidence
                        }

                        /** The email of the beneficiary */
                        fun email(email: String) = email(JsonField.of(email))

                        /**
                         * Sets [Builder.email] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.email] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun email(email: JsonField<String>) = apply { this.email = email }

                        /** The nationality of the beneficiary */
                        fun nationality(nationality: String) =
                            nationality(JsonField.of(nationality))

                        /**
                         * Sets [Builder.nationality] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.nationality] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun nationality(nationality: JsonField<String>) = apply {
                            this.nationality = nationality
                        }

                        /** The phone number of the beneficiary */
                        fun phoneNumber(phoneNumber: String) =
                            phoneNumber(JsonField.of(phoneNumber))

                        /**
                         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.phoneNumber] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                            this.phoneNumber = phoneNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Individual].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .fullName()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Individual =
                            Individual(
                                beneficiaryType,
                                checkRequired("fullName", fullName),
                                address,
                                birthDate,
                                countryOfResidence,
                                email,
                                nationality,
                                phoneNumber,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LightsparkGridInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Individual = apply {
                        if (validated) {
                            return@apply
                        }

                        _beneficiaryType().let {
                            if (it != JsonValue.from("INDIVIDUAL")) {
                                throw LightsparkGridInvalidDataException(
                                    "'beneficiaryType' is invalid, received $it"
                                )
                            }
                        }
                        fullName()
                        address()?.validate()
                        birthDate()
                        countryOfResidence()
                        email()
                        nationality()
                        phoneNumber()
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
                        beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                            (if (fullName.asKnown() == null) 0 else 1) +
                            (address.asKnown()?.validity() ?: 0) +
                            (if (birthDate.asKnown() == null) 0 else 1) +
                            (if (countryOfResidence.asKnown() == null) 0 else 1) +
                            (if (email.asKnown() == null) 0 else 1) +
                            (if (nationality.asKnown() == null) 0 else 1) +
                            (if (phoneNumber.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Individual &&
                            beneficiaryType == other.beneficiaryType &&
                            fullName == other.fullName &&
                            address == other.address &&
                            birthDate == other.birthDate &&
                            countryOfResidence == other.countryOfResidence &&
                            email == other.email &&
                            nationality == other.nationality &&
                            phoneNumber == other.phoneNumber &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            beneficiaryType,
                            fullName,
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SwiftAccount &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    beneficiary == other.beneficiary &&
                    country == other.country &&
                    swiftCode == other.swiftCode &&
                    accountNumber == other.accountNumber &&
                    iban == other.iban &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    bankName,
                    beneficiary,
                    country,
                    swiftCode,
                    accountNumber,
                    iban,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SwiftAccount{accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, country=$country, swiftCode=$swiftCode, accountNumber=$accountNumber, iban=$iban, additionalProperties=$additionalProperties}"
        }
    }

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
