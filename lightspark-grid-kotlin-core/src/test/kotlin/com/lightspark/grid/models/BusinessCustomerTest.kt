// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRole
import com.lightspark.grid.models.customers.BusinessType
import com.lightspark.grid.models.customers.EntityType
import com.lightspark.grid.models.customers.KybStatus
import com.lightspark.grid.models.customers.KycStatus
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
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
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
                        .kycStatus(KycStatus.APPROVED)
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
                        .addRole(BeneficialOwnerRole.UBO)
                        .addRole(BeneficialOwnerRole.DIRECTOR)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .businessInfo(
                    BusinessCustomer.BusinessInfo.builder()
                        .businessType(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(EntityType.LLC)
                        .expectedMonthlyTransactionCount(
                            BusinessInfoUpdate.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessInfoUpdate.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .purposeOfAccount(BusinessInfoUpdate.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .kybStatus(KybStatus.APPROVED)
                .build()

        assertThat(businessCustomer._customerType()).isEqualTo(JsonValue.from("BUSINESS"))
        assertThat(businessCustomer.platformCustomerId()).isEqualTo("9f84e0c2a72c4fa")
        assertThat(businessCustomer.umaAddress()).isEqualTo("\$john.doe@uma.domain.com")
        assertThat(businessCustomer.id()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(businessCustomer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(businessCustomer.currencies()).containsExactly("USD", "USDC")
        assertThat(businessCustomer.email()).isEqualTo("john.doe@example.com")
        assertThat(businessCustomer.isDeleted()).isEqualTo(false)
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
                    .kycStatus(KycStatus.APPROVED)
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
                    .addRole(BeneficialOwnerRole.UBO)
                    .addRole(BeneficialOwnerRole.DIRECTOR)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .build()
            )
        assertThat(businessCustomer.businessInfo())
            .isEqualTo(
                BusinessCustomer.BusinessInfo.builder()
                    .businessType(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                    .addCountriesOfOperation("US")
                    .country("US")
                    .doingBusinessAs("Acme")
                    .entityType(EntityType.LLC)
                    .expectedMonthlyTransactionCount(
                        BusinessInfoUpdate.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                    )
                    .expectedMonthlyTransactionVolume(
                        BusinessInfoUpdate.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                    )
                    .addExpectedRecipientJurisdiction("US")
                    .incorporatedOn(LocalDate.parse("2018-03-14"))
                    .legalName("Acme Corporation, Inc.")
                    .purposeOfAccount(BusinessInfoUpdate.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                    .registrationNumber("5523041")
                    .sourceOfFunds("Funds derived from customer payments for software services")
                    .taxId("47-1234567")
                    .build()
            )
        assertThat(businessCustomer.kybStatus()).isEqualTo(KybStatus.APPROVED)
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
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
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
                        .kycStatus(KycStatus.APPROVED)
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
                        .addRole(BeneficialOwnerRole.UBO)
                        .addRole(BeneficialOwnerRole.DIRECTOR)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .businessInfo(
                    BusinessCustomer.BusinessInfo.builder()
                        .businessType(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(EntityType.LLC)
                        .expectedMonthlyTransactionCount(
                            BusinessInfoUpdate.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessInfoUpdate.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .purposeOfAccount(BusinessInfoUpdate.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .kybStatus(KybStatus.APPROVED)
                .build()

        val roundtrippedBusinessCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomer),
                jacksonTypeRef<BusinessCustomer>(),
            )

        assertThat(roundtrippedBusinessCustomer).isEqualTo(businessCustomer)
    }
}
