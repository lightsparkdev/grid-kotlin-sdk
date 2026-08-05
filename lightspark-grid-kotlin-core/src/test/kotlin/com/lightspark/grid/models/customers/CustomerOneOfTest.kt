// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.BeneficialOwner
import com.lightspark.grid.models.BusinessCustomer
import com.lightspark.grid.models.IndividualCustomer
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerOneOfTest {

    @Test
    fun ofIndividualCustomer() {
        val individualCustomer =
            IndividualCustomer.builder()
                .customerType(JsonValue.from("INDIVIDUAL"))
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .contactVerification(
                    Customer.ContactVerification.builder()
                        .email(Customer.ContactVerification.Email.VERIFIED)
                        .phone(Customer.ContactVerification.Phone.VERIFIED)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .isDeleted(false)
                .phoneNumber("+14155551234")
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .annualIncomeRange(IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K)
                .birthDate(LocalDate.parse("1990-01-15"))
                .expectedMonthlyTransactionCount(
                    IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomer.PepStatus.NONE)
                .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.INVESTMENTS)
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .taxIdCountryOfIssuance("US")
                .taxIdentifier("123-45-6789")
                .taxIdType(IndividualCustomer.TaxIdType.SSN)
                .build()

        val customerOneOf = CustomerOneOf.ofIndividualCustomer(individualCustomer)

        assertThat(customerOneOf.individualCustomer()).isEqualTo(individualCustomer)
        assertThat(customerOneOf.businessCustomer()).isNull()
    }

    @Test
    fun ofIndividualCustomerRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerOneOf =
            CustomerOneOf.ofIndividualCustomer(
                IndividualCustomer.builder()
                    .customerType(JsonValue.from("INDIVIDUAL"))
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .contactVerification(
                        Customer.ContactVerification.builder()
                            .email(Customer.ContactVerification.Email.VERIFIED)
                            .phone(Customer.ContactVerification.Phone.VERIFIED)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .isDeleted(false)
                    .phoneNumber("+14155551234")
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .annualIncomeRange(IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K)
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .expectedMonthlyTransactionCount(
                        IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                    )
                    .expectedMonthlyTransactionVolume(
                        IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                    )
                    .fullName("John Michael Doe")
                    .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                    .nationality("US")
                    .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                    .pepStatus(IndividualCustomer.PepStatus.NONE)
                    .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                    .purposeOfAccountOtherDescription("Household budgeting between spouses")
                    .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                    .sourceOfFundsOtherDescription("Contest winnings")
                    .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                    .addSourceOfWealthCategory(
                        IndividualCustomer.SourceOfWealthCategory.INVESTMENTS
                    )
                    .sourceOfWealthOtherDescription("Royalty income from published works")
                    .taxIdCountryOfIssuance("US")
                    .taxIdentifier("123-45-6789")
                    .taxIdType(IndividualCustomer.TaxIdType.SSN)
                    .build()
            )

        val roundtrippedCustomerOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerOneOf),
                jacksonTypeRef<CustomerOneOf>(),
            )

        assertThat(roundtrippedCustomerOneOf).isEqualTo(customerOneOf)
    }

    @Test
    fun ofBusinessCustomer() {
        val businessCustomer =
            BusinessCustomer.builder()
                .customerType(JsonValue.from("BUSINESS"))
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .contactVerification(
                    Customer.ContactVerification.builder()
                        .email(Customer.ContactVerification.Email.VERIFIED)
                        .phone(Customer.ContactVerification.Phone.VERIFIED)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .isDeleted(false)
                .phoneNumber("+14155551234")
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .addBeneficialOwner(
                    BeneficialOwner.builder()
                        .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .kycStatus(BeneficialOwner.KycStatus.APPROVED)
                        .ownershipPercentage(51L)
                        .personalInfo(
                            BeneficialOwnerPersonalInfo.builder()
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
                                .birthDate(LocalDate.parse("1978-06-15"))
                                .firstName("Jane")
                                .identifier("123-45-6789")
                                .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                                .lastName("Smith")
                                .nationality("US")
                                .countryOfIssuance("US")
                                .email("jane.smith@acmecorp.com")
                                .middleName("Marie")
                                .phoneNumber("+14155550192")
                                .build()
                        )
                        .addRole(BeneficialOwner.Role.UBO)
                        .addRole(BeneficialOwner.Role.DIRECTOR)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .businessInfo(
                    BusinessCustomer.BusinessInfo.builder()
                        .legalName("Acme Corporation, Inc.")
                        .businessType(
                            BusinessCustomer.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomer.BusinessInfo.EntityType.LLC)
                        .addExpectedCounterpartyCountry("US")
                        .expectedMonthlyTransactionCount(
                            BusinessCustomer.BusinessInfo.ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessCustomer.BusinessInfo.ExpectedMonthlyTransactionVolume
                                .VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .naicsCode("541511")
                        .purposeOfAccount(
                            BusinessCustomer.BusinessInfo.PurposeOfAccount.CONTRACTOR_PAYOUTS
                        )
                        .purposeOfAccountOtherDescription("Escrow for equipment leases")
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                        .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                        .taxId("47-1234567")
                        .build()
                )
                .kybStatus(BusinessCustomer.KybStatus.APPROVED)
                .build()

        val customerOneOf = CustomerOneOf.ofBusinessCustomer(businessCustomer)

        assertThat(customerOneOf.individualCustomer()).isNull()
        assertThat(customerOneOf.businessCustomer()).isEqualTo(businessCustomer)
    }

    @Test
    fun ofBusinessCustomerRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerOneOf =
            CustomerOneOf.ofBusinessCustomer(
                BusinessCustomer.builder()
                    .customerType(JsonValue.from("BUSINESS"))
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .contactVerification(
                        Customer.ContactVerification.builder()
                            .email(Customer.ContactVerification.Email.VERIFIED)
                            .phone(Customer.ContactVerification.Phone.VERIFIED)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .isDeleted(false)
                    .phoneNumber("+14155551234")
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .addBeneficialOwner(
                        BeneficialOwner.builder()
                            .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .kycStatus(BeneficialOwner.KycStatus.APPROVED)
                            .ownershipPercentage(51L)
                            .personalInfo(
                                BeneficialOwnerPersonalInfo.builder()
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
                                    .birthDate(LocalDate.parse("1978-06-15"))
                                    .firstName("Jane")
                                    .identifier("123-45-6789")
                                    .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                                    .lastName("Smith")
                                    .nationality("US")
                                    .countryOfIssuance("US")
                                    .email("jane.smith@acmecorp.com")
                                    .middleName("Marie")
                                    .phoneNumber("+14155550192")
                                    .build()
                            )
                            .addRole(BeneficialOwner.Role.UBO)
                            .addRole(BeneficialOwner.Role.DIRECTOR)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .build()
                    )
                    .businessInfo(
                        BusinessCustomer.BusinessInfo.builder()
                            .legalName("Acme Corporation, Inc.")
                            .businessType(
                                BusinessCustomer.BusinessInfo.BusinessType
                                    .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                            )
                            .addCountriesOfOperation("US")
                            .country("US")
                            .doingBusinessAs("Acme")
                            .entityType(BusinessCustomer.BusinessInfo.EntityType.LLC)
                            .addExpectedCounterpartyCountry("US")
                            .expectedMonthlyTransactionCount(
                                BusinessCustomer.BusinessInfo.ExpectedMonthlyTransactionCount
                                    .COUNT_100_TO_500
                            )
                            .expectedMonthlyTransactionVolume(
                                BusinessCustomer.BusinessInfo.ExpectedMonthlyTransactionVolume
                                    .VOLUME_100_K_TO_1_M
                            )
                            .addExpectedRecipientJurisdiction("US")
                            .incorporatedOn(LocalDate.parse("2018-03-14"))
                            .naicsCode("541511")
                            .purposeOfAccount(
                                BusinessCustomer.BusinessInfo.PurposeOfAccount.CONTRACTOR_PAYOUTS
                            )
                            .purposeOfAccountOtherDescription("Escrow for equipment leases")
                            .registrationNumber("5523041")
                            .sourceOfFunds(
                                "Funds derived from customer payments for software services"
                            )
                            .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                            .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                            .taxId("47-1234567")
                            .build()
                    )
                    .kybStatus(BusinessCustomer.KybStatus.APPROVED)
                    .build()
            )

        val roundtrippedCustomerOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerOneOf),
                jacksonTypeRef<CustomerOneOf>(),
            )

        assertThat(roundtrippedCustomerOneOf).isEqualTo(customerOneOf)
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
        val customerOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerOneOf>())

        val e = assertThrows<LightsparkGridInvalidDataException> { customerOneOf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
