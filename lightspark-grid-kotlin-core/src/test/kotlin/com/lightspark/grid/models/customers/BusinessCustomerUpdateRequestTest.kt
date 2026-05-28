// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.BusinessInfoUpdate
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessCustomerUpdateRequestTest {

    @Test
    fun create() {
        val businessCustomerUpdateRequest =
            BusinessCustomerUpdateRequest.builder()
                .customerType(BusinessCustomerUpdateRequest.CustomerType.BUSINESS)
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
                .businessInfo(
                    BusinessInfoUpdate.builder()
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
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .kybStatus(KybStatus.APPROVED)
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(businessCustomerUpdateRequest.customerType())
            .isEqualTo(BusinessCustomerUpdateRequest.CustomerType.BUSINESS)
        assertThat(businessCustomerUpdateRequest.address())
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
        assertThat(businessCustomerUpdateRequest.businessInfo())
            .isEqualTo(
                BusinessInfoUpdate.builder()
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
        assertThat(businessCustomerUpdateRequest.currencies()).containsExactly("USD", "EUR", "USDC")
        assertThat(businessCustomerUpdateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(businessCustomerUpdateRequest.kybStatus()).isEqualTo(KybStatus.APPROVED)
        assertThat(businessCustomerUpdateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessCustomerUpdateRequest =
            BusinessCustomerUpdateRequest.builder()
                .customerType(BusinessCustomerUpdateRequest.CustomerType.BUSINESS)
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
                .businessInfo(
                    BusinessInfoUpdate.builder()
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
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .kybStatus(KybStatus.APPROVED)
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedBusinessCustomerUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomerUpdateRequest),
                jacksonTypeRef<BusinessCustomerUpdateRequest>(),
            )

        assertThat(roundtrippedBusinessCustomerUpdateRequest)
            .isEqualTo(businessCustomerUpdateRequest)
    }
}
