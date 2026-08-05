// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerCreateRequestOneOfTest {

    @Test
    fun ofIndividual() {
        val individual =
            IndividualCustomerCreateRequest.builder()
                .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
                .address(
                    Address.builder()
                        .country("US")
                        .line1("123 Main Street")
                        .postalCode("94105")
                        .city("San Francisco")
                        .line2("Apt 4B")
                        .state("CA")
                        .build()
                )
                .annualIncomeRange(
                    IndividualCustomerCreateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                )
                .birthDate(LocalDate.parse("1990-01-15"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .endUserTermsConsent(
                    EndUserTermsConsentRequest.builder()
                        .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("198.51.100.24")
                        .termsVersion("V1")
                        .build()
                )
                .expectedMonthlyTransactionCount(
                    IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomerCreateRequest.ExpectedMonthlyTransactionVolume
                        .VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .identifier("123-45-6789")
                .idType(IndividualCustomerCreateRequest.IdType.SSN)
                .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomerCreateRequest.PepStatus.NONE)
                .phoneNumber("+14155551234")
                .platformCustomerId("9f84e0c2a72c4fa")
                .purposeOfAccount(
                    IndividualCustomerCreateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                )
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .region("US")
                .addSourceOfFundsCategory(
                    IndividualCustomerCreateRequest.SourceOfFundsCategory.SALARY
                )
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(
                    IndividualCustomerCreateRequest.SourceOfWealthCategory.SALARY
                )
                .addSourceOfWealthCategory(
                    IndividualCustomerCreateRequest.SourceOfWealthCategory.INVESTMENTS
                )
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .taxIdCountryOfIssuance("US")
                .taxIdentifier("123-45-6789")
                .taxIdType(IndividualCustomerCreateRequest.TaxIdType.SSN)
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val customerCreateRequestOneOf = CustomerCreateRequestOneOf.ofIndividual(individual)

        assertThat(customerCreateRequestOneOf.individual()).isEqualTo(individual)
        assertThat(customerCreateRequestOneOf.business()).isNull()
    }

    @Test
    fun ofIndividualRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreateRequestOneOf =
            CustomerCreateRequestOneOf.ofIndividual(
                IndividualCustomerCreateRequest.builder()
                    .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
                    .address(
                        Address.builder()
                            .country("US")
                            .line1("123 Main Street")
                            .postalCode("94105")
                            .city("San Francisco")
                            .line2("Apt 4B")
                            .state("CA")
                            .build()
                    )
                    .annualIncomeRange(
                        IndividualCustomerCreateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                    )
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .endUserTermsConsent(
                        EndUserTermsConsentRequest.builder()
                            .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                            .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ipAddress("198.51.100.24")
                            .termsVersion("V1")
                            .build()
                    )
                    .expectedMonthlyTransactionCount(
                        IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount
                            .COUNT_100_TO_500
                    )
                    .expectedMonthlyTransactionVolume(
                        IndividualCustomerCreateRequest.ExpectedMonthlyTransactionVolume
                            .VOLUME_100_K_TO_1_M
                    )
                    .fullName("John Michael Doe")
                    .identifier("123-45-6789")
                    .idType(IndividualCustomerCreateRequest.IdType.SSN)
                    .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                    .nationality("US")
                    .netWorthRange(IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M)
                    .pepStatus(IndividualCustomerCreateRequest.PepStatus.NONE)
                    .phoneNumber("+14155551234")
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .purposeOfAccount(
                        IndividualCustomerCreateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                    )
                    .purposeOfAccountOtherDescription("Household budgeting between spouses")
                    .region("US")
                    .addSourceOfFundsCategory(
                        IndividualCustomerCreateRequest.SourceOfFundsCategory.SALARY
                    )
                    .sourceOfFundsOtherDescription("Contest winnings")
                    .addSourceOfWealthCategory(
                        IndividualCustomerCreateRequest.SourceOfWealthCategory.SALARY
                    )
                    .addSourceOfWealthCategory(
                        IndividualCustomerCreateRequest.SourceOfWealthCategory.INVESTMENTS
                    )
                    .sourceOfWealthOtherDescription("Royalty income from published works")
                    .taxIdCountryOfIssuance("US")
                    .taxIdentifier("123-45-6789")
                    .taxIdType(IndividualCustomerCreateRequest.TaxIdType.SSN)
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )

        val roundtrippedCustomerCreateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreateRequestOneOf),
                jacksonTypeRef<CustomerCreateRequestOneOf>(),
            )

        assertThat(roundtrippedCustomerCreateRequestOneOf).isEqualTo(customerCreateRequestOneOf)
    }

    @Test
    fun ofBusiness() {
        val business =
            BusinessCustomerCreateRequest.builder()
                .businessInfo(
                    BusinessCustomerCreateRequest.BusinessInfo.builder()
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .taxId("47-1234567")
                        .businessType(
                            BusinessCustomerCreateRequest.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerCreateRequest.BusinessInfo.EntityType.LLC)
                        .addExpectedCounterpartyCountry("US")
                        .expectedMonthlyTransactionCount(
                            BusinessCustomerCreateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessCustomerCreateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionVolume
                                .VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .naicsCode("541511")
                        .purposeOfAccount(
                            BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                                .CONTRACTOR_PAYOUTS
                        )
                        .purposeOfAccountOtherDescription("Escrow for equipment leases")
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                        .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                        .build()
                )
                .customerType(BusinessCustomerCreateRequest.CustomerType.BUSINESS)
                .address(
                    Address.builder()
                        .country("US")
                        .line1("123 Main Street")
                        .postalCode("94105")
                        .city("San Francisco")
                        .line2("Apt 4B")
                        .state("CA")
                        .build()
                )
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .endUserTermsConsent(
                    EndUserTermsConsentRequest.builder()
                        .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("198.51.100.24")
                        .termsVersion("V1")
                        .build()
                )
                .kybStatus(BusinessCustomerCreateRequest.KybStatus.APPROVED)
                .phoneNumber("+14155551234")
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val customerCreateRequestOneOf = CustomerCreateRequestOneOf.ofBusiness(business)

        assertThat(customerCreateRequestOneOf.individual()).isNull()
        assertThat(customerCreateRequestOneOf.business()).isEqualTo(business)
    }

    @Test
    fun ofBusinessRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreateRequestOneOf =
            CustomerCreateRequestOneOf.ofBusiness(
                BusinessCustomerCreateRequest.builder()
                    .businessInfo(
                        BusinessCustomerCreateRequest.BusinessInfo.builder()
                            .incorporatedOn(LocalDate.parse("2018-03-14"))
                            .legalName("Acme Corporation, Inc.")
                            .taxId("47-1234567")
                            .businessType(
                                BusinessCustomerCreateRequest.BusinessInfo.BusinessType
                                    .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                            )
                            .addCountriesOfOperation("US")
                            .country("US")
                            .doingBusinessAs("Acme")
                            .entityType(BusinessCustomerCreateRequest.BusinessInfo.EntityType.LLC)
                            .addExpectedCounterpartyCountry("US")
                            .expectedMonthlyTransactionCount(
                                BusinessCustomerCreateRequest.BusinessInfo
                                    .ExpectedMonthlyTransactionCount
                                    .COUNT_100_TO_500
                            )
                            .expectedMonthlyTransactionVolume(
                                BusinessCustomerCreateRequest.BusinessInfo
                                    .ExpectedMonthlyTransactionVolume
                                    .VOLUME_100_K_TO_1_M
                            )
                            .addExpectedRecipientJurisdiction("US")
                            .naicsCode("541511")
                            .purposeOfAccount(
                                BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                                    .CONTRACTOR_PAYOUTS
                            )
                            .purposeOfAccountOtherDescription("Escrow for equipment leases")
                            .registrationNumber("5523041")
                            .sourceOfFunds(
                                "Funds derived from customer payments for software services"
                            )
                            .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                            .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                            .build()
                    )
                    .customerType(BusinessCustomerCreateRequest.CustomerType.BUSINESS)
                    .address(
                        Address.builder()
                            .country("US")
                            .line1("123 Main Street")
                            .postalCode("94105")
                            .city("San Francisco")
                            .line2("Apt 4B")
                            .state("CA")
                            .build()
                    )
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .endUserTermsConsent(
                        EndUserTermsConsentRequest.builder()
                            .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                            .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ipAddress("198.51.100.24")
                            .termsVersion("V1")
                            .build()
                    )
                    .kybStatus(BusinessCustomerCreateRequest.KybStatus.APPROVED)
                    .phoneNumber("+14155551234")
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .region("US")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )

        val roundtrippedCustomerCreateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreateRequestOneOf),
                jacksonTypeRef<CustomerCreateRequestOneOf>(),
            )

        assertThat(roundtrippedCustomerCreateRequestOneOf).isEqualTo(customerCreateRequestOneOf)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerCreateRequestOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerCreateRequestOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                customerCreateRequestOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
