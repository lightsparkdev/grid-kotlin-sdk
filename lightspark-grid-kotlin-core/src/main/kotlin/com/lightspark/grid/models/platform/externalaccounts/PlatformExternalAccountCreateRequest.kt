// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

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
import com.lightspark.grid.models.SwiftExternalAccountCreateInfo
import com.lightspark.grid.models.ThbExternalAccountCreateInfo
import com.lightspark.grid.models.TzsExternalAccountCreateInfo
import com.lightspark.grid.models.UgxExternalAccountCreateInfo
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.VndExternalAccountCreateInfo
import com.lightspark.grid.models.XafExternalAccountCreateInfo
import com.lightspark.grid.models.XofExternalAccountCreateInfo
import com.lightspark.grid.models.ZarExternalAccountCreateInfo
import com.lightspark.grid.models.ZmwExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.BusinessBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreateInfoOneOf
import java.util.Collections
import java.util.Objects

class PlatformExternalAccountCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountInfo: JsonField<ExternalAccountCreateInfoOneOf>,
    private val currency: JsonField<String>,
    private val platformAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountInfo")
        @ExcludeMissing
        accountInfo: JsonField<ExternalAccountCreateInfoOneOf> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platformAccountId")
        @ExcludeMissing
        platformAccountId: JsonField<String> = JsonMissing.of(),
    ) : this(accountInfo, currency, platformAccountId, mutableMapOf())

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: phoneNumber
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountInfo(): ExternalAccountCreateInfoOneOf = accountInfo.getRequired("accountInfo")

    /**
     * The ISO 4217 currency code
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

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
    fun _accountInfo(): JsonField<ExternalAccountCreateInfoOneOf> = accountInfo

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
         * Returns a mutable builder for constructing an instance of
         * [PlatformExternalAccountCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .accountInfo()
         * .currency()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlatformExternalAccountCreateRequest]. */
    class Builder internal constructor() {

        private var accountInfo: JsonField<ExternalAccountCreateInfoOneOf>? = null
        private var currency: JsonField<String>? = null
        private var platformAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            platformExternalAccountCreateRequest: PlatformExternalAccountCreateRequest
        ) = apply {
            accountInfo = platformExternalAccountCreateRequest.accountInfo
            currency = platformExternalAccountCreateRequest.currency
            platformAccountId = platformExternalAccountCreateRequest.platformAccountId
            additionalProperties =
                platformExternalAccountCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun accountInfo(accountInfo: ExternalAccountCreateInfoOneOf) =
            accountInfo(JsonField.of(accountInfo))

        /**
         * Sets [Builder.accountInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountInfo] with a well-typed
         * [ExternalAccountCreateInfoOneOf] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountInfo(accountInfo: JsonField<ExternalAccountCreateInfoOneOf>) = apply {
            this.accountInfo = accountInfo
        }

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofAedAccount(aedAccount)`.
         */
        fun accountInfo(aedAccount: AedExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofAedAccount(aedAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofBdtAccount(bdtAccount)`.
         */
        fun accountInfo(bdtAccount: BdtExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofBdtAccount(bdtAccount))

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

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofBrlAccount(brlAccount)`.
         */
        fun accountInfo(brlAccount: BrlExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofBrlAccount(brlAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofBwpAccount(bwpAccount)`.
         */
        fun accountInfo(bwpAccount: BwpExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofBwpAccount(bwpAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofCadAccount(cadAccount)`.
         */
        fun accountInfo(cadAccount: CadExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofCadAccount(cadAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofCopAccount(copAccount)`.
         */
        fun accountInfo(copAccount: CopExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofCopAccount(copAccount))

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

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofDkkAccount(dkkAccount)`.
         */
        fun accountInfo(dkkAccount: DkkExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofDkkAccount(dkkAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofEgpAccount(egpAccount)`.
         */
        fun accountInfo(egpAccount: EgpExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofEgpAccount(egpAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofEurAccount(eurAccount)`.
         */
        fun accountInfo(eurAccount: EurExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofEurAccount(eurAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofGbpAccount(gbpAccount)`.
         */
        fun accountInfo(gbpAccount: GbpExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofGbpAccount(gbpAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofGhsAccount(ghsAccount)`.
         */
        fun accountInfo(ghsAccount: GhsExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofGhsAccount(ghsAccount))

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

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofGtqAccount(gtqAccount)`.
         */
        fun accountInfo(gtqAccount: GtqExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofGtqAccount(gtqAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofHkdAccount(hkdAccount)`.
         */
        fun accountInfo(hkdAccount: HkdExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofHkdAccount(hkdAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofHtgAccount(htgAccount)`.
         */
        fun accountInfo(htgAccount: HtgExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofHtgAccount(htgAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofIdrAccount(idrAccount)`.
         */
        fun accountInfo(idrAccount: IdrExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofIdrAccount(idrAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofInrAccount(inrAccount)`.
         */
        fun accountInfo(inrAccount: InrExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofInrAccount(inrAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofJmdAccount(jmdAccount)`.
         */
        fun accountInfo(jmdAccount: JmdExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofJmdAccount(jmdAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofKesAccount(kesAccount)`.
         */
        fun accountInfo(kesAccount: KesExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofKesAccount(kesAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofMwkAccount(mwkAccount)`.
         */
        fun accountInfo(mwkAccount: MwkExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofMwkAccount(mwkAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofMxnAccount(mxnAccount)`.
         */
        fun accountInfo(mxnAccount: MxnExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofMxnAccount(mxnAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofMyrAccount(myrAccount)`.
         */
        fun accountInfo(myrAccount: MyrExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofMyrAccount(myrAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofNgnAccount(ngnAccount)`.
         */
        fun accountInfo(ngnAccount: NgnExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofNgnAccount(ngnAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofPhpAccount(phpAccount)`.
         */
        fun accountInfo(phpAccount: PhpExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofPhpAccount(phpAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofPkrAccount(pkrAccount)`.
         */
        fun accountInfo(pkrAccount: PkrExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofPkrAccount(pkrAccount))

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

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofRwfAccount(rwfAccount)`.
         */
        fun accountInfo(rwfAccount: RwfExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofRwfAccount(rwfAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofSgdAccount(sgdAccount)`.
         */
        fun accountInfo(sgdAccount: SgdExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofSgdAccount(sgdAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofSlvAccount(slvAccount)`.
         */
        fun accountInfo(slvAccount: SlvExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofSlvAccount(slvAccount))

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

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofThbAccount(thbAccount)`.
         */
        fun accountInfo(thbAccount: ThbExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofThbAccount(thbAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofTzsAccount(tzsAccount)`.
         */
        fun accountInfo(tzsAccount: TzsExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofTzsAccount(tzsAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofUgxAccount(ugxAccount)`.
         */
        fun accountInfo(ugxAccount: UgxExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofUgxAccount(ugxAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofUsdAccount(usdAccount)`.
         */
        fun accountInfo(usdAccount: UsdExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofUsdAccount(usdAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofVndAccount(vndAccount)`.
         */
        fun accountInfo(vndAccount: VndExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofVndAccount(vndAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofXafAccount(xafAccount)`.
         */
        fun accountInfo(xafAccount: XafExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofXafAccount(xafAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofXofAccount(xofAccount)`.
         */
        fun accountInfo(xofAccount: XofExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofXofAccount(xofAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofZarAccount(zarAccount)`.
         */
        fun accountInfo(zarAccount: ZarExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofZarAccount(zarAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofZmwAccount(zmwAccount)`.
         */
        fun accountInfo(zmwAccount: ZmwExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofZmwAccount(zmwAccount))

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountCreateInfoOneOf.ofSwiftAccount(swiftAccount)`.
         */
        fun accountInfo(swiftAccount: SwiftExternalAccountCreateInfo) =
            accountInfo(ExternalAccountCreateInfoOneOf.ofSwiftAccount(swiftAccount))

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
         * Returns an immutable instance of [PlatformExternalAccountCreateRequest].
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
        fun build(): PlatformExternalAccountCreateRequest =
            PlatformExternalAccountCreateRequest(
                checkRequired("accountInfo", accountInfo),
                checkRequired("currency", currency),
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
    fun validate(): PlatformExternalAccountCreateRequest = apply {
        if (validated) {
            return@apply
        }

        accountInfo().validate()
        currency()
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
            (if (platformAccountId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformExternalAccountCreateRequest &&
            accountInfo == other.accountInfo &&
            currency == other.currency &&
            platformAccountId == other.platformAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountInfo, currency, platformAccountId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlatformExternalAccountCreateRequest{accountInfo=$accountInfo, currency=$currency, platformAccountId=$platformAccountId, additionalProperties=$additionalProperties}"
}
