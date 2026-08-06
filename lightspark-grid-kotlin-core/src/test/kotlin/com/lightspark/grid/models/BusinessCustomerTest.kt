// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
import com.lightspark.grid.models.customers.Customer
import com.lightspark.grid.models.customers.EndUserTermsConsentRequest
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessCustomerTest {

    @Test
    fun create() {
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
                        .primaryContactFirstName("Jane")
                        .primaryContactLastName("Smith")
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

        assertThat(businessCustomer._customerType()).isEqualTo(JsonValue.from("BUSINESS"))
        assertThat(businessCustomer.platformCustomerId()).isEqualTo("9f84e0c2a72c4fa")
        assertThat(businessCustomer.umaAddress()).isEqualTo("\$john.doe@uma.domain.com")
        assertThat(businessCustomer.id()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(businessCustomer.contactVerification())
            .isEqualTo(
                Customer.ContactVerification.builder()
                    .email(Customer.ContactVerification.Email.VERIFIED)
                    .phone(Customer.ContactVerification.Phone.VERIFIED)
                    .build()
            )
        assertThat(businessCustomer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(businessCustomer.currencies()).containsExactly("USD", "USDC")
        assertThat(businessCustomer.email()).isEqualTo("john.doe@example.com")
        assertThat(businessCustomer.endUserTermsConsent())
            .isEqualTo(
                EndUserTermsConsentRequest.builder()
                    .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipAddress("198.51.100.24")
                    .termsVersion("V1")
                    .build()
            )
        assertThat(businessCustomer.isDeleted()).isEqualTo(false)
        assertThat(businessCustomer.phoneNumber()).isEqualTo("+14155551234")
        assertThat(businessCustomer.region()).isEqualTo("US")
        assertThat(businessCustomer.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(businessCustomer.address())
            .isEqualTo(
                Address.builder()
                    .country("US")
                    .line1("123 Main Street")
                    .postalCode("94105")
                    .city("San Francisco")
                    .line2("Apt 4B")
                    .state("CA")
                    .build()
            )
        assertThat(businessCustomer.beneficialOwners())
            .containsExactly(
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
        assertThat(businessCustomer.businessInfo())
            .isEqualTo(
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
                    .primaryContactFirstName("Jane")
                    .primaryContactLastName("Smith")
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
        assertThat(businessCustomer.kybStatus()).isEqualTo(BusinessCustomer.KybStatus.APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                        .primaryContactFirstName("Jane")
                        .primaryContactLastName("Smith")
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

        val roundtrippedBusinessCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomer),
                jacksonTypeRef<BusinessCustomer>(),
            )

        assertThat(roundtrippedBusinessCustomer).isEqualTo(businessCustomer)
    }
}
