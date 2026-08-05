// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

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
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Enhanced-due-diligence (EDD) fields available as optional patchable attributes on an individual
 * customer. Referenced via `allOf` from `IndividualCustomerFields`, so these appear as top-level
 * optional fields on the customer resource itself; there is no separate EDD resource. The specific
 * set required for a given customer is driven by the KYC provider's per-jurisdiction / per-flow /
 * per-volume-tier rules (surfaced through `MISSING_FIELD` errors on `POST /verifications`).
 */
class IndividualCustomerUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerType: JsonField<CustomerType>,
    private val address: JsonField<Address>,
    private val annualIncomeRange: JsonField<AnnualIncomeRange>,
    private val birthDate: JsonField<LocalDate>,
    private val currencies: JsonField<List<String>>,
    private val email: JsonField<String>,
    private val endUserTermsConsent: JsonField<EndUserTermsConsentRequest>,
    private val expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount>,
    private val expectedMonthlyTransactionVolume: JsonField<ExpectedMonthlyTransactionVolume>,
    private val fullName: JsonField<String>,
    private val kycStatus: JsonField<KycStatus>,
    private val nationality: JsonField<String>,
    private val netWorthRange: JsonField<NetWorthRange>,
    private val pepStatus: JsonField<PepStatus>,
    private val phoneNumber: JsonField<String>,
    private val purposeOfAccount: JsonField<PurposeOfAccount>,
    private val purposeOfAccountOtherDescription: JsonField<String>,
    private val sourceOfFundsCategories: JsonField<List<SourceOfFundsCategory>>,
    private val sourceOfFundsOtherDescription: JsonField<String>,
    private val sourceOfWealthCategories: JsonField<List<SourceOfWealthCategory>>,
    private val sourceOfWealthOtherDescription: JsonField<String>,
    private val taxIdCountryOfIssuance: JsonField<String>,
    private val taxIdentifier: JsonField<String>,
    private val taxIdType: JsonField<TaxIdType>,
    private val umaAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerType")
        @ExcludeMissing
        customerType: JsonField<CustomerType> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("annualIncomeRange")
        @ExcludeMissing
        annualIncomeRange: JsonField<AnnualIncomeRange> = JsonMissing.of(),
        @JsonProperty("birthDate")
        @ExcludeMissing
        birthDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("currencies")
        @ExcludeMissing
        currencies: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endUserTermsConsent")
        @ExcludeMissing
        endUserTermsConsent: JsonField<EndUserTermsConsentRequest> = JsonMissing.of(),
        @JsonProperty("expectedMonthlyTransactionCount")
        @ExcludeMissing
        expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount> =
            JsonMissing.of(),
        @JsonProperty("expectedMonthlyTransactionVolume")
        @ExcludeMissing
        expectedMonthlyTransactionVolume: JsonField<ExpectedMonthlyTransactionVolume> =
            JsonMissing.of(),
        @JsonProperty("fullName") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kycStatus")
        @ExcludeMissing
        kycStatus: JsonField<KycStatus> = JsonMissing.of(),
        @JsonProperty("nationality")
        @ExcludeMissing
        nationality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netWorthRange")
        @ExcludeMissing
        netWorthRange: JsonField<NetWorthRange> = JsonMissing.of(),
        @JsonProperty("pepStatus")
        @ExcludeMissing
        pepStatus: JsonField<PepStatus> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purposeOfAccount")
        @ExcludeMissing
        purposeOfAccount: JsonField<PurposeOfAccount> = JsonMissing.of(),
        @JsonProperty("purposeOfAccountOtherDescription")
        @ExcludeMissing
        purposeOfAccountOtherDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceOfFundsCategories")
        @ExcludeMissing
        sourceOfFundsCategories: JsonField<List<SourceOfFundsCategory>> = JsonMissing.of(),
        @JsonProperty("sourceOfFundsOtherDescription")
        @ExcludeMissing
        sourceOfFundsOtherDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceOfWealthCategories")
        @ExcludeMissing
        sourceOfWealthCategories: JsonField<List<SourceOfWealthCategory>> = JsonMissing.of(),
        @JsonProperty("sourceOfWealthOtherDescription")
        @ExcludeMissing
        sourceOfWealthOtherDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxIdCountryOfIssuance")
        @ExcludeMissing
        taxIdCountryOfIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxIdentifier")
        @ExcludeMissing
        taxIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxIdType")
        @ExcludeMissing
        taxIdType: JsonField<TaxIdType> = JsonMissing.of(),
        @JsonProperty("umaAddress") @ExcludeMissing umaAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        customerType,
        address,
        annualIncomeRange,
        birthDate,
        currencies,
        email,
        endUserTermsConsent,
        expectedMonthlyTransactionCount,
        expectedMonthlyTransactionVolume,
        fullName,
        kycStatus,
        nationality,
        netWorthRange,
        pepStatus,
        phoneNumber,
        purposeOfAccount,
        purposeOfAccountOtherDescription,
        sourceOfFundsCategories,
        sourceOfFundsOtherDescription,
        sourceOfWealthCategories,
        sourceOfWealthOtherDescription,
        taxIdCountryOfIssuance,
        taxIdentifier,
        taxIdType,
        umaAddress,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerType(): CustomerType = customerType.getRequired("customerType")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): Address? = address.getNullable("address")

    /**
     * Bucketed annual income (USD equivalent). Used for enhanced due diligence on higher-risk
     * profiles.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun annualIncomeRange(): AnnualIncomeRange? = annualIncomeRange.getNullable("annualIncomeRange")

    /**
     * Date of birth in ISO 8601 format (YYYY-MM-DD)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun birthDate(): LocalDate? = birthDate.getNullable("birthDate")

    /**
     * Updated list of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD", "EUR";
     * tickers for crypto, e.g. "BTC", "USDC"). Replaces the existing list. Some currency
     * combinations may require separate customers — if so, the request will be rejected with
     * details.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencies(): List<String>? = currencies.getNullable("currencies")

    /**
     * Email address for the customer. For customers with tied Embedded Wallet internal accounts,
     * changing this value also updates every tied `EMAIL_OTP` credential across all tied Embedded
     * Wallets.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * Evidence that the customer accepted the Grid End User Terms. Unregulated platforms must
     * provide this before initiating customer-scoped transactions; those transactions fail until
     * consent is recorded.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endUserTermsConsent(): EndUserTermsConsentRequest? =
        endUserTermsConsent.getNullable("endUserTermsConsent")

    /**
     * Expected number of transactions per month
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedMonthlyTransactionCount(): ExpectedMonthlyTransactionCount? =
        expectedMonthlyTransactionCount.getNullable("expectedMonthlyTransactionCount")

    /**
     * Expected total transaction volume per month in USD equivalent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedMonthlyTransactionVolume(): ExpectedMonthlyTransactionVolume? =
        expectedMonthlyTransactionVolume.getNullable("expectedMonthlyTransactionVolume")

    /**
     * Individual's full name
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fullName(): String? = fullName.getNullable("fullName")

    /**
     * The current KYC status of a customer. `HOLD` means the customer is placed on hold and may be
     * required to update or provide more information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun kycStatus(): KycStatus? = kycStatus.getNullable("kycStatus")

    /**
     * Country code (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nationality(): String? = nationality.getNullable("nationality")

    /**
     * Bucketed total net worth (USD equivalent). Used for enhanced due diligence on higher-risk
     * profiles.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun netWorthRange(): NetWorthRange? = netWorthRange.getNullable("netWorthRange")

    /**
     * Political exposure declaration (Politically Exposed Person status). `HIO` = head of an
     * international organization. `FAMILY_OR_ASSOCIATE` covers close family members and known close
     * associates of a PEP.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pepStatus(): PepStatus? = pepStatus.getNullable("pepStatus")

    /**
     * Phone number for the customer in strict E.164 format. For customers with tied Embedded Wallet
     * internal accounts, changing this value also updates every tied `SMS_OTP` credential across
     * all tied Embedded Wallets. Send phone number and email updates as separate PATCH calls.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

    /**
     * The intended purpose for using the Grid account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purposeOfAccount(): PurposeOfAccount? = purposeOfAccount.getNullable("purposeOfAccount")

    /**
     * Free-form description of the customer's intended purpose for the Grid account. Required when
     * `purposeOfAccount` is `OTHER`; otherwise omitted.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purposeOfAccountOtherDescription(): String? =
        purposeOfAccountOtherDescription.getNullable("purposeOfAccountOtherDescription")

    /**
     * Structured source-of-funds categories (FLOW of funds for this account).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceOfFundsCategories(): List<SourceOfFundsCategory>? =
        sourceOfFundsCategories.getNullable("sourceOfFundsCategories")

    /**
     * Free-form description of the customer's source of funds. Required when
     * `sourceOfFundsCategories` includes `OTHER`; otherwise omitted.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceOfFundsOtherDescription(): String? =
        sourceOfFundsOtherDescription.getNullable("sourceOfFundsOtherDescription")

    /**
     * Structured source-of-wealth categories (STOCK — origin of accumulated wealth).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceOfWealthCategories(): List<SourceOfWealthCategory>? =
        sourceOfWealthCategories.getNullable("sourceOfWealthCategories")

    /**
     * Free-form description of the customer's source of wealth. Required when
     * `sourceOfWealthCategories` includes `OTHER`; otherwise omitted.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceOfWealthOtherDescription(): String? =
        sourceOfWealthOtherDescription.getNullable("sourceOfWealthOtherDescription")

    /**
     * Country that issued the tax identifier (ISO 3166-1 alpha-2). Required when `taxIdType` is
     * `NON_US_TAX_ID`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxIdCountryOfIssuance(): String? =
        taxIdCountryOfIssuance.getNullable("taxIdCountryOfIssuance")

    /**
     * Tax-identification number. For US persons this is the SSN (format `###-##-####`) or ITIN. For
     * non-US persons this is the tax number issued by `taxIdCountryOfIssuance`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxIdentifier(): String? = taxIdentifier.getNullable("taxIdentifier")

    /**
     * Type of tax identification
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxIdType(): TaxIdType? = taxIdType.getNullable("taxIdType")

    /**
     * Optional UMA address identifier. If provided, the customer's UMA address will be updated.
     * This is an optional identifier to route payments to the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun umaAddress(): String? = umaAddress.getNullable("umaAddress")

    /**
     * Returns the raw JSON value of [customerType].
     *
     * Unlike [customerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerType")
    @ExcludeMissing
    fun _customerType(): JsonField<CustomerType> = customerType

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [annualIncomeRange].
     *
     * Unlike [annualIncomeRange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("annualIncomeRange")
    @ExcludeMissing
    fun _annualIncomeRange(): JsonField<AnnualIncomeRange> = annualIncomeRange

    /**
     * Returns the raw JSON value of [birthDate].
     *
     * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("birthDate") @ExcludeMissing fun _birthDate(): JsonField<LocalDate> = birthDate

    /**
     * Returns the raw JSON value of [currencies].
     *
     * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencies")
    @ExcludeMissing
    fun _currencies(): JsonField<List<String>> = currencies

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [endUserTermsConsent].
     *
     * Unlike [endUserTermsConsent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("endUserTermsConsent")
    @ExcludeMissing
    fun _endUserTermsConsent(): JsonField<EndUserTermsConsentRequest> = endUserTermsConsent

    /**
     * Returns the raw JSON value of [expectedMonthlyTransactionCount].
     *
     * Unlike [expectedMonthlyTransactionCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expectedMonthlyTransactionCount")
    @ExcludeMissing
    fun _expectedMonthlyTransactionCount(): JsonField<ExpectedMonthlyTransactionCount> =
        expectedMonthlyTransactionCount

    /**
     * Returns the raw JSON value of [expectedMonthlyTransactionVolume].
     *
     * Unlike [expectedMonthlyTransactionVolume], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expectedMonthlyTransactionVolume")
    @ExcludeMissing
    fun _expectedMonthlyTransactionVolume(): JsonField<ExpectedMonthlyTransactionVolume> =
        expectedMonthlyTransactionVolume

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [kycStatus].
     *
     * Unlike [kycStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kycStatus") @ExcludeMissing fun _kycStatus(): JsonField<KycStatus> = kycStatus

    /**
     * Returns the raw JSON value of [nationality].
     *
     * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nationality") @ExcludeMissing fun _nationality(): JsonField<String> = nationality

    /**
     * Returns the raw JSON value of [netWorthRange].
     *
     * Unlike [netWorthRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("netWorthRange")
    @ExcludeMissing
    fun _netWorthRange(): JsonField<NetWorthRange> = netWorthRange

    /**
     * Returns the raw JSON value of [pepStatus].
     *
     * Unlike [pepStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pepStatus") @ExcludeMissing fun _pepStatus(): JsonField<PepStatus> = pepStatus

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [purposeOfAccount].
     *
     * Unlike [purposeOfAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("purposeOfAccount")
    @ExcludeMissing
    fun _purposeOfAccount(): JsonField<PurposeOfAccount> = purposeOfAccount

    /**
     * Returns the raw JSON value of [purposeOfAccountOtherDescription].
     *
     * Unlike [purposeOfAccountOtherDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("purposeOfAccountOtherDescription")
    @ExcludeMissing
    fun _purposeOfAccountOtherDescription(): JsonField<String> = purposeOfAccountOtherDescription

    /**
     * Returns the raw JSON value of [sourceOfFundsCategories].
     *
     * Unlike [sourceOfFundsCategories], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceOfFundsCategories")
    @ExcludeMissing
    fun _sourceOfFundsCategories(): JsonField<List<SourceOfFundsCategory>> = sourceOfFundsCategories

    /**
     * Returns the raw JSON value of [sourceOfFundsOtherDescription].
     *
     * Unlike [sourceOfFundsOtherDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceOfFundsOtherDescription")
    @ExcludeMissing
    fun _sourceOfFundsOtherDescription(): JsonField<String> = sourceOfFundsOtherDescription

    /**
     * Returns the raw JSON value of [sourceOfWealthCategories].
     *
     * Unlike [sourceOfWealthCategories], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceOfWealthCategories")
    @ExcludeMissing
    fun _sourceOfWealthCategories(): JsonField<List<SourceOfWealthCategory>> =
        sourceOfWealthCategories

    /**
     * Returns the raw JSON value of [sourceOfWealthOtherDescription].
     *
     * Unlike [sourceOfWealthOtherDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceOfWealthOtherDescription")
    @ExcludeMissing
    fun _sourceOfWealthOtherDescription(): JsonField<String> = sourceOfWealthOtherDescription

    /**
     * Returns the raw JSON value of [taxIdCountryOfIssuance].
     *
     * Unlike [taxIdCountryOfIssuance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("taxIdCountryOfIssuance")
    @ExcludeMissing
    fun _taxIdCountryOfIssuance(): JsonField<String> = taxIdCountryOfIssuance

    /**
     * Returns the raw JSON value of [taxIdentifier].
     *
     * Unlike [taxIdentifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxIdentifier")
    @ExcludeMissing
    fun _taxIdentifier(): JsonField<String> = taxIdentifier

    /**
     * Returns the raw JSON value of [taxIdType].
     *
     * Unlike [taxIdType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxIdType") @ExcludeMissing fun _taxIdType(): JsonField<TaxIdType> = taxIdType

    /**
     * Returns the raw JSON value of [umaAddress].
     *
     * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("umaAddress") @ExcludeMissing fun _umaAddress(): JsonField<String> = umaAddress

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
         * [IndividualCustomerUpdateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .customerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IndividualCustomerUpdateRequest]. */
    class Builder internal constructor() {

        private var customerType: JsonField<CustomerType>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var annualIncomeRange: JsonField<AnnualIncomeRange> = JsonMissing.of()
        private var birthDate: JsonField<LocalDate> = JsonMissing.of()
        private var currencies: JsonField<MutableList<String>>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var endUserTermsConsent: JsonField<EndUserTermsConsentRequest> = JsonMissing.of()
        private var expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount> =
            JsonMissing.of()
        private var expectedMonthlyTransactionVolume: JsonField<ExpectedMonthlyTransactionVolume> =
            JsonMissing.of()
        private var fullName: JsonField<String> = JsonMissing.of()
        private var kycStatus: JsonField<KycStatus> = JsonMissing.of()
        private var nationality: JsonField<String> = JsonMissing.of()
        private var netWorthRange: JsonField<NetWorthRange> = JsonMissing.of()
        private var pepStatus: JsonField<PepStatus> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var purposeOfAccount: JsonField<PurposeOfAccount> = JsonMissing.of()
        private var purposeOfAccountOtherDescription: JsonField<String> = JsonMissing.of()
        private var sourceOfFundsCategories: JsonField<MutableList<SourceOfFundsCategory>>? = null
        private var sourceOfFundsOtherDescription: JsonField<String> = JsonMissing.of()
        private var sourceOfWealthCategories: JsonField<MutableList<SourceOfWealthCategory>>? = null
        private var sourceOfWealthOtherDescription: JsonField<String> = JsonMissing.of()
        private var taxIdCountryOfIssuance: JsonField<String> = JsonMissing.of()
        private var taxIdentifier: JsonField<String> = JsonMissing.of()
        private var taxIdType: JsonField<TaxIdType> = JsonMissing.of()
        private var umaAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(individualCustomerUpdateRequest: IndividualCustomerUpdateRequest) =
            apply {
                customerType = individualCustomerUpdateRequest.customerType
                address = individualCustomerUpdateRequest.address
                annualIncomeRange = individualCustomerUpdateRequest.annualIncomeRange
                birthDate = individualCustomerUpdateRequest.birthDate
                currencies = individualCustomerUpdateRequest.currencies.map { it.toMutableList() }
                email = individualCustomerUpdateRequest.email
                endUserTermsConsent = individualCustomerUpdateRequest.endUserTermsConsent
                expectedMonthlyTransactionCount =
                    individualCustomerUpdateRequest.expectedMonthlyTransactionCount
                expectedMonthlyTransactionVolume =
                    individualCustomerUpdateRequest.expectedMonthlyTransactionVolume
                fullName = individualCustomerUpdateRequest.fullName
                kycStatus = individualCustomerUpdateRequest.kycStatus
                nationality = individualCustomerUpdateRequest.nationality
                netWorthRange = individualCustomerUpdateRequest.netWorthRange
                pepStatus = individualCustomerUpdateRequest.pepStatus
                phoneNumber = individualCustomerUpdateRequest.phoneNumber
                purposeOfAccount = individualCustomerUpdateRequest.purposeOfAccount
                purposeOfAccountOtherDescription =
                    individualCustomerUpdateRequest.purposeOfAccountOtherDescription
                sourceOfFundsCategories =
                    individualCustomerUpdateRequest.sourceOfFundsCategories.map {
                        it.toMutableList()
                    }
                sourceOfFundsOtherDescription =
                    individualCustomerUpdateRequest.sourceOfFundsOtherDescription
                sourceOfWealthCategories =
                    individualCustomerUpdateRequest.sourceOfWealthCategories.map {
                        it.toMutableList()
                    }
                sourceOfWealthOtherDescription =
                    individualCustomerUpdateRequest.sourceOfWealthOtherDescription
                taxIdCountryOfIssuance = individualCustomerUpdateRequest.taxIdCountryOfIssuance
                taxIdentifier = individualCustomerUpdateRequest.taxIdentifier
                taxIdType = individualCustomerUpdateRequest.taxIdType
                umaAddress = individualCustomerUpdateRequest.umaAddress
                additionalProperties =
                    individualCustomerUpdateRequest.additionalProperties.toMutableMap()
            }

        fun customerType(customerType: CustomerType) = customerType(JsonField.of(customerType))

        /**
         * Sets [Builder.customerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerType] with a well-typed [CustomerType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerType(customerType: JsonField<CustomerType>) = apply {
            this.customerType = customerType
        }

        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /**
         * Bucketed annual income (USD equivalent). Used for enhanced due diligence on higher-risk
         * profiles.
         */
        fun annualIncomeRange(annualIncomeRange: AnnualIncomeRange) =
            annualIncomeRange(JsonField.of(annualIncomeRange))

        /**
         * Sets [Builder.annualIncomeRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualIncomeRange] with a well-typed [AnnualIncomeRange]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun annualIncomeRange(annualIncomeRange: JsonField<AnnualIncomeRange>) = apply {
            this.annualIncomeRange = annualIncomeRange
        }

        /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
        fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

        /**
         * Sets [Builder.birthDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

        /**
         * Updated list of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD",
         * "EUR"; tickers for crypto, e.g. "BTC", "USDC"). Replaces the existing list. Some currency
         * combinations may require separate customers — if so, the request will be rejected with
         * details.
         */
        fun currencies(currencies: List<String>) = currencies(JsonField.of(currencies))

        /**
         * Sets [Builder.currencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencies] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencies(currencies: JsonField<List<String>>) = apply {
            this.currencies = currencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [currencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCurrency(currency: String) = apply {
            currencies =
                (currencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("currencies", it).add(currency)
                }
        }

        /**
         * Email address for the customer. For customers with tied Embedded Wallet internal
         * accounts, changing this value also updates every tied `EMAIL_OTP` credential across all
         * tied Embedded Wallets.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * Evidence that the customer accepted the Grid End User Terms. Unregulated platforms must
         * provide this before initiating customer-scoped transactions; those transactions fail
         * until consent is recorded.
         */
        fun endUserTermsConsent(endUserTermsConsent: EndUserTermsConsentRequest) =
            endUserTermsConsent(JsonField.of(endUserTermsConsent))

        /**
         * Sets [Builder.endUserTermsConsent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endUserTermsConsent] with a well-typed
         * [EndUserTermsConsentRequest] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun endUserTermsConsent(endUserTermsConsent: JsonField<EndUserTermsConsentRequest>) =
            apply {
                this.endUserTermsConsent = endUserTermsConsent
            }

        /** Expected number of transactions per month */
        fun expectedMonthlyTransactionCount(
            expectedMonthlyTransactionCount: ExpectedMonthlyTransactionCount
        ) = expectedMonthlyTransactionCount(JsonField.of(expectedMonthlyTransactionCount))

        /**
         * Sets [Builder.expectedMonthlyTransactionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedMonthlyTransactionCount] with a well-typed
         * [ExpectedMonthlyTransactionCount] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun expectedMonthlyTransactionCount(
            expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount>
        ) = apply { this.expectedMonthlyTransactionCount = expectedMonthlyTransactionCount }

        /** Expected total transaction volume per month in USD equivalent */
        fun expectedMonthlyTransactionVolume(
            expectedMonthlyTransactionVolume: ExpectedMonthlyTransactionVolume
        ) = expectedMonthlyTransactionVolume(JsonField.of(expectedMonthlyTransactionVolume))

        /**
         * Sets [Builder.expectedMonthlyTransactionVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedMonthlyTransactionVolume] with a well-typed
         * [ExpectedMonthlyTransactionVolume] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun expectedMonthlyTransactionVolume(
            expectedMonthlyTransactionVolume: JsonField<ExpectedMonthlyTransactionVolume>
        ) = apply { this.expectedMonthlyTransactionVolume = expectedMonthlyTransactionVolume }

        /** Individual's full name */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /**
         * The current KYC status of a customer. `HOLD` means the customer is placed on hold and may
         * be required to update or provide more information.
         */
        fun kycStatus(kycStatus: KycStatus) = kycStatus(JsonField.of(kycStatus))

        /**
         * Sets [Builder.kycStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kycStatus] with a well-typed [KycStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kycStatus(kycStatus: JsonField<KycStatus>) = apply { this.kycStatus = kycStatus }

        /** Country code (ISO 3166-1 alpha-2) */
        fun nationality(nationality: String) = nationality(JsonField.of(nationality))

        /**
         * Sets [Builder.nationality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationality] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nationality(nationality: JsonField<String>) = apply { this.nationality = nationality }

        /**
         * Bucketed total net worth (USD equivalent). Used for enhanced due diligence on higher-risk
         * profiles.
         */
        fun netWorthRange(netWorthRange: NetWorthRange) = netWorthRange(JsonField.of(netWorthRange))

        /**
         * Sets [Builder.netWorthRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netWorthRange] with a well-typed [NetWorthRange] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netWorthRange(netWorthRange: JsonField<NetWorthRange>) = apply {
            this.netWorthRange = netWorthRange
        }

        /**
         * Political exposure declaration (Politically Exposed Person status). `HIO` = head of an
         * international organization. `FAMILY_OR_ASSOCIATE` covers close family members and known
         * close associates of a PEP.
         */
        fun pepStatus(pepStatus: PepStatus) = pepStatus(JsonField.of(pepStatus))

        /**
         * Sets [Builder.pepStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pepStatus] with a well-typed [PepStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pepStatus(pepStatus: JsonField<PepStatus>) = apply { this.pepStatus = pepStatus }

        /**
         * Phone number for the customer in strict E.164 format. For customers with tied Embedded
         * Wallet internal accounts, changing this value also updates every tied `SMS_OTP`
         * credential across all tied Embedded Wallets. Send phone number and email updates as
         * separate PATCH calls.
         */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** The intended purpose for using the Grid account */
        fun purposeOfAccount(purposeOfAccount: PurposeOfAccount) =
            purposeOfAccount(JsonField.of(purposeOfAccount))

        /**
         * Sets [Builder.purposeOfAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purposeOfAccount] with a well-typed [PurposeOfAccount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun purposeOfAccount(purposeOfAccount: JsonField<PurposeOfAccount>) = apply {
            this.purposeOfAccount = purposeOfAccount
        }

        /**
         * Free-form description of the customer's intended purpose for the Grid account. Required
         * when `purposeOfAccount` is `OTHER`; otherwise omitted.
         */
        fun purposeOfAccountOtherDescription(purposeOfAccountOtherDescription: String) =
            purposeOfAccountOtherDescription(JsonField.of(purposeOfAccountOtherDescription))

        /**
         * Sets [Builder.purposeOfAccountOtherDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purposeOfAccountOtherDescription] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun purposeOfAccountOtherDescription(purposeOfAccountOtherDescription: JsonField<String>) =
            apply {
                this.purposeOfAccountOtherDescription = purposeOfAccountOtherDescription
            }

        /** Structured source-of-funds categories (FLOW of funds for this account). */
        fun sourceOfFundsCategories(sourceOfFundsCategories: List<SourceOfFundsCategory>) =
            sourceOfFundsCategories(JsonField.of(sourceOfFundsCategories))

        /**
         * Sets [Builder.sourceOfFundsCategories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfFundsCategories] with a well-typed
         * `List<SourceOfFundsCategory>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun sourceOfFundsCategories(
            sourceOfFundsCategories: JsonField<List<SourceOfFundsCategory>>
        ) = apply {
            this.sourceOfFundsCategories = sourceOfFundsCategories.map { it.toMutableList() }
        }

        /**
         * Adds a single [SourceOfFundsCategory] to [sourceOfFundsCategories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourceOfFundsCategory(sourceOfFundsCategory: SourceOfFundsCategory) = apply {
            sourceOfFundsCategories =
                (sourceOfFundsCategories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourceOfFundsCategories", it).add(sourceOfFundsCategory)
                }
        }

        /**
         * Free-form description of the customer's source of funds. Required when
         * `sourceOfFundsCategories` includes `OTHER`; otherwise omitted.
         */
        fun sourceOfFundsOtherDescription(sourceOfFundsOtherDescription: String) =
            sourceOfFundsOtherDescription(JsonField.of(sourceOfFundsOtherDescription))

        /**
         * Sets [Builder.sourceOfFundsOtherDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfFundsOtherDescription] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun sourceOfFundsOtherDescription(sourceOfFundsOtherDescription: JsonField<String>) =
            apply {
                this.sourceOfFundsOtherDescription = sourceOfFundsOtherDescription
            }

        /** Structured source-of-wealth categories (STOCK — origin of accumulated wealth). */
        fun sourceOfWealthCategories(sourceOfWealthCategories: List<SourceOfWealthCategory>) =
            sourceOfWealthCategories(JsonField.of(sourceOfWealthCategories))

        /**
         * Sets [Builder.sourceOfWealthCategories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfWealthCategories] with a well-typed
         * `List<SourceOfWealthCategory>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun sourceOfWealthCategories(
            sourceOfWealthCategories: JsonField<List<SourceOfWealthCategory>>
        ) = apply {
            this.sourceOfWealthCategories = sourceOfWealthCategories.map { it.toMutableList() }
        }

        /**
         * Adds a single [SourceOfWealthCategory] to [sourceOfWealthCategories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourceOfWealthCategory(sourceOfWealthCategory: SourceOfWealthCategory) = apply {
            sourceOfWealthCategories =
                (sourceOfWealthCategories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourceOfWealthCategories", it).add(sourceOfWealthCategory)
                }
        }

        /**
         * Free-form description of the customer's source of wealth. Required when
         * `sourceOfWealthCategories` includes `OTHER`; otherwise omitted.
         */
        fun sourceOfWealthOtherDescription(sourceOfWealthOtherDescription: String) =
            sourceOfWealthOtherDescription(JsonField.of(sourceOfWealthOtherDescription))

        /**
         * Sets [Builder.sourceOfWealthOtherDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfWealthOtherDescription] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun sourceOfWealthOtherDescription(sourceOfWealthOtherDescription: JsonField<String>) =
            apply {
                this.sourceOfWealthOtherDescription = sourceOfWealthOtherDescription
            }

        /**
         * Country that issued the tax identifier (ISO 3166-1 alpha-2). Required when `taxIdType` is
         * `NON_US_TAX_ID`.
         */
        fun taxIdCountryOfIssuance(taxIdCountryOfIssuance: String) =
            taxIdCountryOfIssuance(JsonField.of(taxIdCountryOfIssuance))

        /**
         * Sets [Builder.taxIdCountryOfIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdCountryOfIssuance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxIdCountryOfIssuance(taxIdCountryOfIssuance: JsonField<String>) = apply {
            this.taxIdCountryOfIssuance = taxIdCountryOfIssuance
        }

        /**
         * Tax-identification number. For US persons this is the SSN (format `###-##-####`) or ITIN.
         * For non-US persons this is the tax number issued by `taxIdCountryOfIssuance`.
         */
        fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

        /**
         * Sets [Builder.taxIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdentifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
            this.taxIdentifier = taxIdentifier
        }

        /** Type of tax identification */
        fun taxIdType(taxIdType: TaxIdType) = taxIdType(JsonField.of(taxIdType))

        /**
         * Sets [Builder.taxIdType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdType] with a well-typed [TaxIdType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxIdType(taxIdType: JsonField<TaxIdType>) = apply { this.taxIdType = taxIdType }

        /**
         * Optional UMA address identifier. If provided, the customer's UMA address will be updated.
         * This is an optional identifier to route payments to the customer.
         */
        fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

        /**
         * Sets [Builder.umaAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.umaAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

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
         * Returns an immutable instance of [IndividualCustomerUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customerType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualCustomerUpdateRequest =
            IndividualCustomerUpdateRequest(
                checkRequired("customerType", customerType),
                address,
                annualIncomeRange,
                birthDate,
                (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                email,
                endUserTermsConsent,
                expectedMonthlyTransactionCount,
                expectedMonthlyTransactionVolume,
                fullName,
                kycStatus,
                nationality,
                netWorthRange,
                pepStatus,
                phoneNumber,
                purposeOfAccount,
                purposeOfAccountOtherDescription,
                (sourceOfFundsCategories ?: JsonMissing.of()).map { it.toImmutable() },
                sourceOfFundsOtherDescription,
                (sourceOfWealthCategories ?: JsonMissing.of()).map { it.toImmutable() },
                sourceOfWealthOtherDescription,
                taxIdCountryOfIssuance,
                taxIdentifier,
                taxIdType,
                umaAddress,
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
    fun validate(): IndividualCustomerUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        customerType().validate()
        address()?.validate()
        annualIncomeRange()?.validate()
        birthDate()
        currencies()
        email()
        endUserTermsConsent()?.validate()
        expectedMonthlyTransactionCount()?.validate()
        expectedMonthlyTransactionVolume()?.validate()
        fullName()
        kycStatus()?.validate()
        nationality()
        netWorthRange()?.validate()
        pepStatus()?.validate()
        phoneNumber()
        purposeOfAccount()?.validate()
        purposeOfAccountOtherDescription()
        sourceOfFundsCategories()?.forEach { it.validate() }
        sourceOfFundsOtherDescription()
        sourceOfWealthCategories()?.forEach { it.validate() }
        sourceOfWealthOtherDescription()
        taxIdCountryOfIssuance()
        taxIdentifier()
        taxIdType()?.validate()
        umaAddress()
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
        (customerType.asKnown()?.validity() ?: 0) +
            (address.asKnown()?.validity() ?: 0) +
            (annualIncomeRange.asKnown()?.validity() ?: 0) +
            (if (birthDate.asKnown() == null) 0 else 1) +
            (currencies.asKnown()?.size ?: 0) +
            (if (email.asKnown() == null) 0 else 1) +
            (endUserTermsConsent.asKnown()?.validity() ?: 0) +
            (expectedMonthlyTransactionCount.asKnown()?.validity() ?: 0) +
            (expectedMonthlyTransactionVolume.asKnown()?.validity() ?: 0) +
            (if (fullName.asKnown() == null) 0 else 1) +
            (kycStatus.asKnown()?.validity() ?: 0) +
            (if (nationality.asKnown() == null) 0 else 1) +
            (netWorthRange.asKnown()?.validity() ?: 0) +
            (pepStatus.asKnown()?.validity() ?: 0) +
            (if (phoneNumber.asKnown() == null) 0 else 1) +
            (purposeOfAccount.asKnown()?.validity() ?: 0) +
            (if (purposeOfAccountOtherDescription.asKnown() == null) 0 else 1) +
            (sourceOfFundsCategories.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceOfFundsOtherDescription.asKnown() == null) 0 else 1) +
            (sourceOfWealthCategories.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceOfWealthOtherDescription.asKnown() == null) 0 else 1) +
            (if (taxIdCountryOfIssuance.asKnown() == null) 0 else 1) +
            (if (taxIdentifier.asKnown() == null) 0 else 1) +
            (taxIdType.asKnown()?.validity() ?: 0) +
            (if (umaAddress.asKnown() == null) 0 else 1)

    class CustomerType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val INDIVIDUAL = of("INDIVIDUAL")

            fun of(value: String) = CustomerType(JsonField.of(value))
        }

        /** An enum containing [CustomerType]'s known values. */
        enum class Known {
            INDIVIDUAL
        }

        /**
         * An enum containing [CustomerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CustomerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INDIVIDUAL,
            /**
             * An enum member indicating that [CustomerType] was instantiated with an unknown value.
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
                INDIVIDUAL -> Value.INDIVIDUAL
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
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LightsparkGridInvalidDataException("Unknown CustomerType: $value")
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
        fun validate(): CustomerType = apply {
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

            return other is CustomerType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Bucketed annual income (USD equivalent). Used for enhanced due diligence on higher-risk
     * profiles.
     */
    class AnnualIncomeRange @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val UNDER_50_K = of("UNDER_50K")

            val RANGE_50_K_100_K = of("RANGE_50K_100K")

            val RANGE_100_K_250_K = of("RANGE_100K_250K")

            val RANGE_250_K_1_M = of("RANGE_250K_1M")

            val OVER_1_M = of("OVER_1M")

            fun of(value: String) = AnnualIncomeRange(JsonField.of(value))
        }

        /** An enum containing [AnnualIncomeRange]'s known values. */
        enum class Known {
            UNDER_50_K,
            RANGE_50_K_100_K,
            RANGE_100_K_250_K,
            RANGE_250_K_1_M,
            OVER_1_M,
        }

        /**
         * An enum containing [AnnualIncomeRange]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AnnualIncomeRange] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNDER_50_K,
            RANGE_50_K_100_K,
            RANGE_100_K_250_K,
            RANGE_250_K_1_M,
            OVER_1_M,
            /**
             * An enum member indicating that [AnnualIncomeRange] was instantiated with an unknown
             * value.
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
                UNDER_50_K -> Value.UNDER_50_K
                RANGE_50_K_100_K -> Value.RANGE_50_K_100_K
                RANGE_100_K_250_K -> Value.RANGE_100_K_250_K
                RANGE_250_K_1_M -> Value.RANGE_250_K_1_M
                OVER_1_M -> Value.OVER_1_M
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
                UNDER_50_K -> Known.UNDER_50_K
                RANGE_50_K_100_K -> Known.RANGE_50_K_100_K
                RANGE_100_K_250_K -> Known.RANGE_100_K_250_K
                RANGE_250_K_1_M -> Known.RANGE_250_K_1_M
                OVER_1_M -> Known.OVER_1_M
                else ->
                    throw LightsparkGridInvalidDataException("Unknown AnnualIncomeRange: $value")
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
        fun validate(): AnnualIncomeRange = apply {
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

            return other is AnnualIncomeRange && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Expected number of transactions per month */
    class ExpectedMonthlyTransactionCount
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

            val COUNT_UNDER_10 = of("COUNT_UNDER_10")

            val COUNT_10_TO_100 = of("COUNT_10_TO_100")

            val COUNT_100_TO_500 = of("COUNT_100_TO_500")

            val COUNT_500_TO_1000 = of("COUNT_500_TO_1000")

            val COUNT_OVER_1000 = of("COUNT_OVER_1000")

            fun of(value: String) = ExpectedMonthlyTransactionCount(JsonField.of(value))
        }

        /** An enum containing [ExpectedMonthlyTransactionCount]'s known values. */
        enum class Known {
            COUNT_UNDER_10,
            COUNT_10_TO_100,
            COUNT_100_TO_500,
            COUNT_500_TO_1000,
            COUNT_OVER_1000,
        }

        /**
         * An enum containing [ExpectedMonthlyTransactionCount]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ExpectedMonthlyTransactionCount] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COUNT_UNDER_10,
            COUNT_10_TO_100,
            COUNT_100_TO_500,
            COUNT_500_TO_1000,
            COUNT_OVER_1000,
            /**
             * An enum member indicating that [ExpectedMonthlyTransactionCount] was instantiated
             * with an unknown value.
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
                COUNT_UNDER_10 -> Value.COUNT_UNDER_10
                COUNT_10_TO_100 -> Value.COUNT_10_TO_100
                COUNT_100_TO_500 -> Value.COUNT_100_TO_500
                COUNT_500_TO_1000 -> Value.COUNT_500_TO_1000
                COUNT_OVER_1000 -> Value.COUNT_OVER_1000
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
                COUNT_UNDER_10 -> Known.COUNT_UNDER_10
                COUNT_10_TO_100 -> Known.COUNT_10_TO_100
                COUNT_100_TO_500 -> Known.COUNT_100_TO_500
                COUNT_500_TO_1000 -> Known.COUNT_500_TO_1000
                COUNT_OVER_1000 -> Known.COUNT_OVER_1000
                else ->
                    throw LightsparkGridInvalidDataException(
                        "Unknown ExpectedMonthlyTransactionCount: $value"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ExpectedMonthlyTransactionCount = apply {
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

            return other is ExpectedMonthlyTransactionCount && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Expected total transaction volume per month in USD equivalent */
    class ExpectedMonthlyTransactionVolume
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

            val VOLUME_UNDER_10_K = of("VOLUME_UNDER_10K")

            val VOLUME_10_K_TO_100_K = of("VOLUME_10K_TO_100K")

            val VOLUME_100_K_TO_1_M = of("VOLUME_100K_TO_1M")

            val VOLUME_1_M_TO_10_M = of("VOLUME_1M_TO_10M")

            val VOLUME_OVER_10_M = of("VOLUME_OVER_10M")

            fun of(value: String) = ExpectedMonthlyTransactionVolume(JsonField.of(value))
        }

        /** An enum containing [ExpectedMonthlyTransactionVolume]'s known values. */
        enum class Known {
            VOLUME_UNDER_10_K,
            VOLUME_10_K_TO_100_K,
            VOLUME_100_K_TO_1_M,
            VOLUME_1_M_TO_10_M,
            VOLUME_OVER_10_M,
        }

        /**
         * An enum containing [ExpectedMonthlyTransactionVolume]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ExpectedMonthlyTransactionVolume] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VOLUME_UNDER_10_K,
            VOLUME_10_K_TO_100_K,
            VOLUME_100_K_TO_1_M,
            VOLUME_1_M_TO_10_M,
            VOLUME_OVER_10_M,
            /**
             * An enum member indicating that [ExpectedMonthlyTransactionVolume] was instantiated
             * with an unknown value.
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
                VOLUME_UNDER_10_K -> Value.VOLUME_UNDER_10_K
                VOLUME_10_K_TO_100_K -> Value.VOLUME_10_K_TO_100_K
                VOLUME_100_K_TO_1_M -> Value.VOLUME_100_K_TO_1_M
                VOLUME_1_M_TO_10_M -> Value.VOLUME_1_M_TO_10_M
                VOLUME_OVER_10_M -> Value.VOLUME_OVER_10_M
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
                VOLUME_UNDER_10_K -> Known.VOLUME_UNDER_10_K
                VOLUME_10_K_TO_100_K -> Known.VOLUME_10_K_TO_100_K
                VOLUME_100_K_TO_1_M -> Known.VOLUME_100_K_TO_1_M
                VOLUME_1_M_TO_10_M -> Known.VOLUME_1_M_TO_10_M
                VOLUME_OVER_10_M -> Known.VOLUME_OVER_10_M
                else ->
                    throw LightsparkGridInvalidDataException(
                        "Unknown ExpectedMonthlyTransactionVolume: $value"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ExpectedMonthlyTransactionVolume = apply {
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

            return other is ExpectedMonthlyTransactionVolume && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The current KYC status of a customer. `HOLD` means the customer is placed on hold and may be
     * required to update or provide more information.
     */
    class KycStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val UNVERIFIED = of("UNVERIFIED")

            val PENDING = of("PENDING")

            val APPROVED = of("APPROVED")

            val REJECTED = of("REJECTED")

            val HOLD = of("HOLD")

            fun of(value: String) = KycStatus(JsonField.of(value))
        }

        /** An enum containing [KycStatus]'s known values. */
        enum class Known {
            UNVERIFIED,
            PENDING,
            APPROVED,
            REJECTED,
            HOLD,
        }

        /**
         * An enum containing [KycStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [KycStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNVERIFIED,
            PENDING,
            APPROVED,
            REJECTED,
            HOLD,
            /**
             * An enum member indicating that [KycStatus] was instantiated with an unknown value.
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
                UNVERIFIED -> Value.UNVERIFIED
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
                HOLD -> Value.HOLD
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
                UNVERIFIED -> Known.UNVERIFIED
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                HOLD -> Known.HOLD
                else -> throw LightsparkGridInvalidDataException("Unknown KycStatus: $value")
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
        fun validate(): KycStatus = apply {
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

            return other is KycStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Bucketed total net worth (USD equivalent). Used for enhanced due diligence on higher-risk
     * profiles.
     */
    class NetWorthRange @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val UNDER_100_K = of("UNDER_100K")

            val RANGE_100_K_500_K = of("RANGE_100K_500K")

            val RANGE_500_K_1_M = of("RANGE_500K_1M")

            val RANGE_1_M_5_M = of("RANGE_1M_5M")

            val RANGE_5_M_25_M = of("RANGE_5M_25M")

            val OVER_25_M = of("OVER_25M")

            fun of(value: String) = NetWorthRange(JsonField.of(value))
        }

        /** An enum containing [NetWorthRange]'s known values. */
        enum class Known {
            UNDER_100_K,
            RANGE_100_K_500_K,
            RANGE_500_K_1_M,
            RANGE_1_M_5_M,
            RANGE_5_M_25_M,
            OVER_25_M,
        }

        /**
         * An enum containing [NetWorthRange]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NetWorthRange] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNDER_100_K,
            RANGE_100_K_500_K,
            RANGE_500_K_1_M,
            RANGE_1_M_5_M,
            RANGE_5_M_25_M,
            OVER_25_M,
            /**
             * An enum member indicating that [NetWorthRange] was instantiated with an unknown
             * value.
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
                UNDER_100_K -> Value.UNDER_100_K
                RANGE_100_K_500_K -> Value.RANGE_100_K_500_K
                RANGE_500_K_1_M -> Value.RANGE_500_K_1_M
                RANGE_1_M_5_M -> Value.RANGE_1_M_5_M
                RANGE_5_M_25_M -> Value.RANGE_5_M_25_M
                OVER_25_M -> Value.OVER_25_M
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
                UNDER_100_K -> Known.UNDER_100_K
                RANGE_100_K_500_K -> Known.RANGE_100_K_500_K
                RANGE_500_K_1_M -> Known.RANGE_500_K_1_M
                RANGE_1_M_5_M -> Known.RANGE_1_M_5_M
                RANGE_5_M_25_M -> Known.RANGE_5_M_25_M
                OVER_25_M -> Known.OVER_25_M
                else -> throw LightsparkGridInvalidDataException("Unknown NetWorthRange: $value")
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
        fun validate(): NetWorthRange = apply {
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

            return other is NetWorthRange && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Political exposure declaration (Politically Exposed Person status). `HIO` = head of an
     * international organization. `FAMILY_OR_ASSOCIATE` covers close family members and known close
     * associates of a PEP.
     */
    class PepStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val NONE = of("NONE")

            val DOMESTIC = of("DOMESTIC")

            val FOREIGN = of("FOREIGN")

            val HIO = of("HIO")

            val FAMILY_OR_ASSOCIATE = of("FAMILY_OR_ASSOCIATE")

            fun of(value: String) = PepStatus(JsonField.of(value))
        }

        /** An enum containing [PepStatus]'s known values. */
        enum class Known {
            NONE,
            DOMESTIC,
            FOREIGN,
            HIO,
            FAMILY_OR_ASSOCIATE,
        }

        /**
         * An enum containing [PepStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PepStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            DOMESTIC,
            FOREIGN,
            HIO,
            FAMILY_OR_ASSOCIATE,
            /**
             * An enum member indicating that [PepStatus] was instantiated with an unknown value.
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
                NONE -> Value.NONE
                DOMESTIC -> Value.DOMESTIC
                FOREIGN -> Value.FOREIGN
                HIO -> Value.HIO
                FAMILY_OR_ASSOCIATE -> Value.FAMILY_OR_ASSOCIATE
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
                NONE -> Known.NONE
                DOMESTIC -> Known.DOMESTIC
                FOREIGN -> Known.FOREIGN
                HIO -> Known.HIO
                FAMILY_OR_ASSOCIATE -> Known.FAMILY_OR_ASSOCIATE
                else -> throw LightsparkGridInvalidDataException("Unknown PepStatus: $value")
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
        fun validate(): PepStatus = apply {
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

            return other is PepStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The intended purpose for using the Grid account */
    class PurposeOfAccount @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val CONTRACTOR_PAYOUTS = of("CONTRACTOR_PAYOUTS")

            val CREATOR_PAYOUTS = of("CREATOR_PAYOUTS")

            val EMPLOYEE_PAYOUTS = of("EMPLOYEE_PAYOUTS")

            val MARKETPLACE_SELLER_PAYOUTS = of("MARKETPLACE_SELLER_PAYOUTS")

            val SUPPLIER_PAYMENTS = of("SUPPLIER_PAYMENTS")

            val CROSS_BORDER_B2_B = of("CROSS_BORDER_B2B")

            val AR_AUTOMATION = of("AR_AUTOMATION")

            val AP_AUTOMATION = of("AP_AUTOMATION")

            val EMBEDDED_PAYMENTS = of("EMBEDDED_PAYMENTS")

            val PLATFORM_FEE_COLLECTION = of("PLATFORM_FEE_COLLECTION")

            val P2_P_TRANSFERS = of("P2P_TRANSFERS")

            val CHARITABLE_DONATIONS = of("CHARITABLE_DONATIONS")

            val OTHER = of("OTHER")

            fun of(value: String) = PurposeOfAccount(JsonField.of(value))
        }

        /** An enum containing [PurposeOfAccount]'s known values. */
        enum class Known {
            CONTRACTOR_PAYOUTS,
            CREATOR_PAYOUTS,
            EMPLOYEE_PAYOUTS,
            MARKETPLACE_SELLER_PAYOUTS,
            SUPPLIER_PAYMENTS,
            CROSS_BORDER_B2_B,
            AR_AUTOMATION,
            AP_AUTOMATION,
            EMBEDDED_PAYMENTS,
            PLATFORM_FEE_COLLECTION,
            P2_P_TRANSFERS,
            CHARITABLE_DONATIONS,
            OTHER,
        }

        /**
         * An enum containing [PurposeOfAccount]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PurposeOfAccount] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTRACTOR_PAYOUTS,
            CREATOR_PAYOUTS,
            EMPLOYEE_PAYOUTS,
            MARKETPLACE_SELLER_PAYOUTS,
            SUPPLIER_PAYMENTS,
            CROSS_BORDER_B2_B,
            AR_AUTOMATION,
            AP_AUTOMATION,
            EMBEDDED_PAYMENTS,
            PLATFORM_FEE_COLLECTION,
            P2_P_TRANSFERS,
            CHARITABLE_DONATIONS,
            OTHER,
            /**
             * An enum member indicating that [PurposeOfAccount] was instantiated with an unknown
             * value.
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
                CONTRACTOR_PAYOUTS -> Value.CONTRACTOR_PAYOUTS
                CREATOR_PAYOUTS -> Value.CREATOR_PAYOUTS
                EMPLOYEE_PAYOUTS -> Value.EMPLOYEE_PAYOUTS
                MARKETPLACE_SELLER_PAYOUTS -> Value.MARKETPLACE_SELLER_PAYOUTS
                SUPPLIER_PAYMENTS -> Value.SUPPLIER_PAYMENTS
                CROSS_BORDER_B2_B -> Value.CROSS_BORDER_B2_B
                AR_AUTOMATION -> Value.AR_AUTOMATION
                AP_AUTOMATION -> Value.AP_AUTOMATION
                EMBEDDED_PAYMENTS -> Value.EMBEDDED_PAYMENTS
                PLATFORM_FEE_COLLECTION -> Value.PLATFORM_FEE_COLLECTION
                P2_P_TRANSFERS -> Value.P2_P_TRANSFERS
                CHARITABLE_DONATIONS -> Value.CHARITABLE_DONATIONS
                OTHER -> Value.OTHER
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
                CONTRACTOR_PAYOUTS -> Known.CONTRACTOR_PAYOUTS
                CREATOR_PAYOUTS -> Known.CREATOR_PAYOUTS
                EMPLOYEE_PAYOUTS -> Known.EMPLOYEE_PAYOUTS
                MARKETPLACE_SELLER_PAYOUTS -> Known.MARKETPLACE_SELLER_PAYOUTS
                SUPPLIER_PAYMENTS -> Known.SUPPLIER_PAYMENTS
                CROSS_BORDER_B2_B -> Known.CROSS_BORDER_B2_B
                AR_AUTOMATION -> Known.AR_AUTOMATION
                AP_AUTOMATION -> Known.AP_AUTOMATION
                EMBEDDED_PAYMENTS -> Known.EMBEDDED_PAYMENTS
                PLATFORM_FEE_COLLECTION -> Known.PLATFORM_FEE_COLLECTION
                P2_P_TRANSFERS -> Known.P2_P_TRANSFERS
                CHARITABLE_DONATIONS -> Known.CHARITABLE_DONATIONS
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown PurposeOfAccount: $value")
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
        fun validate(): PurposeOfAccount = apply {
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

            return other is PurposeOfAccount && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A structured source-of-funds category for an individual customer (FLOW of funds into this
     * account). Distinct from `SourceOfFundsCategory`, which covers business customers.
     */
    class SourceOfFundsCategory
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

            val SALARY = of("SALARY")

            val SELF_EMPLOYMENT_INCOME = of("SELF_EMPLOYMENT_INCOME")

            val INVESTMENT_INCOME = of("INVESTMENT_INCOME")

            val PENSION = of("PENSION")

            val RENTAL_INCOME = of("RENTAL_INCOME")

            val GIFT = of("GIFT")

            val INHERITANCE = of("INHERITANCE")

            val LOAN = of("LOAN")

            val SAVINGS = of("SAVINGS")

            val SALE_OF_ASSETS = of("SALE_OF_ASSETS")

            val OTHER = of("OTHER")

            fun of(value: String) = SourceOfFundsCategory(JsonField.of(value))
        }

        /** An enum containing [SourceOfFundsCategory]'s known values. */
        enum class Known {
            SALARY,
            SELF_EMPLOYMENT_INCOME,
            INVESTMENT_INCOME,
            PENSION,
            RENTAL_INCOME,
            GIFT,
            INHERITANCE,
            LOAN,
            SAVINGS,
            SALE_OF_ASSETS,
            OTHER,
        }

        /**
         * An enum containing [SourceOfFundsCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SourceOfFundsCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SALARY,
            SELF_EMPLOYMENT_INCOME,
            INVESTMENT_INCOME,
            PENSION,
            RENTAL_INCOME,
            GIFT,
            INHERITANCE,
            LOAN,
            SAVINGS,
            SALE_OF_ASSETS,
            OTHER,
            /**
             * An enum member indicating that [SourceOfFundsCategory] was instantiated with an
             * unknown value.
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
                SALARY -> Value.SALARY
                SELF_EMPLOYMENT_INCOME -> Value.SELF_EMPLOYMENT_INCOME
                INVESTMENT_INCOME -> Value.INVESTMENT_INCOME
                PENSION -> Value.PENSION
                RENTAL_INCOME -> Value.RENTAL_INCOME
                GIFT -> Value.GIFT
                INHERITANCE -> Value.INHERITANCE
                LOAN -> Value.LOAN
                SAVINGS -> Value.SAVINGS
                SALE_OF_ASSETS -> Value.SALE_OF_ASSETS
                OTHER -> Value.OTHER
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
                SALARY -> Known.SALARY
                SELF_EMPLOYMENT_INCOME -> Known.SELF_EMPLOYMENT_INCOME
                INVESTMENT_INCOME -> Known.INVESTMENT_INCOME
                PENSION -> Known.PENSION
                RENTAL_INCOME -> Known.RENTAL_INCOME
                GIFT -> Known.GIFT
                INHERITANCE -> Known.INHERITANCE
                LOAN -> Known.LOAN
                SAVINGS -> Known.SAVINGS
                SALE_OF_ASSETS -> Known.SALE_OF_ASSETS
                OTHER -> Known.OTHER
                else ->
                    throw LightsparkGridInvalidDataException(
                        "Unknown SourceOfFundsCategory: $value"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): SourceOfFundsCategory = apply {
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

            return other is SourceOfFundsCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Origin of the customer's accumulated wealth (STOCK). Distinct from `SourceOfFundsCategory`
     * which describes the FLOW of funds for this specific account.
     */
    class SourceOfWealthCategory
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

            val SALARY = of("SALARY")

            val BUSINESS_INCOME = of("BUSINESS_INCOME")

            val INVESTMENTS = of("INVESTMENTS")

            val INHERITANCE = of("INHERITANCE")

            val PROPERTY_SALE = of("PROPERTY_SALE")

            val GIFT = of("GIFT")

            val RETIREMENT = of("RETIREMENT")

            val SAVINGS = of("SAVINGS")

            val OTHER = of("OTHER")

            fun of(value: String) = SourceOfWealthCategory(JsonField.of(value))
        }

        /** An enum containing [SourceOfWealthCategory]'s known values. */
        enum class Known {
            SALARY,
            BUSINESS_INCOME,
            INVESTMENTS,
            INHERITANCE,
            PROPERTY_SALE,
            GIFT,
            RETIREMENT,
            SAVINGS,
            OTHER,
        }

        /**
         * An enum containing [SourceOfWealthCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SourceOfWealthCategory] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SALARY,
            BUSINESS_INCOME,
            INVESTMENTS,
            INHERITANCE,
            PROPERTY_SALE,
            GIFT,
            RETIREMENT,
            SAVINGS,
            OTHER,
            /**
             * An enum member indicating that [SourceOfWealthCategory] was instantiated with an
             * unknown value.
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
                SALARY -> Value.SALARY
                BUSINESS_INCOME -> Value.BUSINESS_INCOME
                INVESTMENTS -> Value.INVESTMENTS
                INHERITANCE -> Value.INHERITANCE
                PROPERTY_SALE -> Value.PROPERTY_SALE
                GIFT -> Value.GIFT
                RETIREMENT -> Value.RETIREMENT
                SAVINGS -> Value.SAVINGS
                OTHER -> Value.OTHER
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
                SALARY -> Known.SALARY
                BUSINESS_INCOME -> Known.BUSINESS_INCOME
                INVESTMENTS -> Known.INVESTMENTS
                INHERITANCE -> Known.INHERITANCE
                PROPERTY_SALE -> Known.PROPERTY_SALE
                GIFT -> Known.GIFT
                RETIREMENT -> Known.RETIREMENT
                SAVINGS -> Known.SAVINGS
                OTHER -> Known.OTHER
                else ->
                    throw LightsparkGridInvalidDataException(
                        "Unknown SourceOfWealthCategory: $value"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): SourceOfWealthCategory = apply {
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

            return other is SourceOfWealthCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of tax identification */
    class TaxIdType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SSN = of("SSN")

            val ITIN = of("ITIN")

            val EIN = of("EIN")

            val NON_US_TAX_ID = of("NON_US_TAX_ID")

            fun of(value: String) = TaxIdType(JsonField.of(value))
        }

        /** An enum containing [TaxIdType]'s known values. */
        enum class Known {
            SSN,
            ITIN,
            EIN,
            NON_US_TAX_ID,
        }

        /**
         * An enum containing [TaxIdType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxIdType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SSN,
            ITIN,
            EIN,
            NON_US_TAX_ID,
            /**
             * An enum member indicating that [TaxIdType] was instantiated with an unknown value.
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
                SSN -> Value.SSN
                ITIN -> Value.ITIN
                EIN -> Value.EIN
                NON_US_TAX_ID -> Value.NON_US_TAX_ID
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
                SSN -> Known.SSN
                ITIN -> Known.ITIN
                EIN -> Known.EIN
                NON_US_TAX_ID -> Known.NON_US_TAX_ID
                else -> throw LightsparkGridInvalidDataException("Unknown TaxIdType: $value")
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
        fun validate(): TaxIdType = apply {
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

            return other is TaxIdType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndividualCustomerUpdateRequest &&
            customerType == other.customerType &&
            address == other.address &&
            annualIncomeRange == other.annualIncomeRange &&
            birthDate == other.birthDate &&
            currencies == other.currencies &&
            email == other.email &&
            endUserTermsConsent == other.endUserTermsConsent &&
            expectedMonthlyTransactionCount == other.expectedMonthlyTransactionCount &&
            expectedMonthlyTransactionVolume == other.expectedMonthlyTransactionVolume &&
            fullName == other.fullName &&
            kycStatus == other.kycStatus &&
            nationality == other.nationality &&
            netWorthRange == other.netWorthRange &&
            pepStatus == other.pepStatus &&
            phoneNumber == other.phoneNumber &&
            purposeOfAccount == other.purposeOfAccount &&
            purposeOfAccountOtherDescription == other.purposeOfAccountOtherDescription &&
            sourceOfFundsCategories == other.sourceOfFundsCategories &&
            sourceOfFundsOtherDescription == other.sourceOfFundsOtherDescription &&
            sourceOfWealthCategories == other.sourceOfWealthCategories &&
            sourceOfWealthOtherDescription == other.sourceOfWealthOtherDescription &&
            taxIdCountryOfIssuance == other.taxIdCountryOfIssuance &&
            taxIdentifier == other.taxIdentifier &&
            taxIdType == other.taxIdType &&
            umaAddress == other.umaAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            customerType,
            address,
            annualIncomeRange,
            birthDate,
            currencies,
            email,
            endUserTermsConsent,
            expectedMonthlyTransactionCount,
            expectedMonthlyTransactionVolume,
            fullName,
            kycStatus,
            nationality,
            netWorthRange,
            pepStatus,
            phoneNumber,
            purposeOfAccount,
            purposeOfAccountOtherDescription,
            sourceOfFundsCategories,
            sourceOfFundsOtherDescription,
            sourceOfWealthCategories,
            sourceOfWealthOtherDescription,
            taxIdCountryOfIssuance,
            taxIdentifier,
            taxIdType,
            umaAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualCustomerUpdateRequest{customerType=$customerType, address=$address, annualIncomeRange=$annualIncomeRange, birthDate=$birthDate, currencies=$currencies, email=$email, endUserTermsConsent=$endUserTermsConsent, expectedMonthlyTransactionCount=$expectedMonthlyTransactionCount, expectedMonthlyTransactionVolume=$expectedMonthlyTransactionVolume, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, netWorthRange=$netWorthRange, pepStatus=$pepStatus, phoneNumber=$phoneNumber, purposeOfAccount=$purposeOfAccount, purposeOfAccountOtherDescription=$purposeOfAccountOtherDescription, sourceOfFundsCategories=$sourceOfFundsCategories, sourceOfFundsOtherDescription=$sourceOfFundsOtherDescription, sourceOfWealthCategories=$sourceOfWealthCategories, sourceOfWealthOtherDescription=$sourceOfWealthOtherDescription, taxIdCountryOfIssuance=$taxIdCountryOfIssuance, taxIdentifier=$taxIdentifier, taxIdType=$taxIdType, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
}
