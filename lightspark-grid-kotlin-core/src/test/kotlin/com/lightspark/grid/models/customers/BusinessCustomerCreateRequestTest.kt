// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessCustomerCreateRequestTest {

    @Test
    fun create() {
        val businessCustomerCreateRequest =
            BusinessCustomerCreateRequest.builder()
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
                        .purposeOfAccount(
                            BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                                .CONTRACTOR_PAYOUTS
                        )
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .build()
                )
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .kybStatus(BusinessCustomerCreateRequest.KybStatus.APPROVED)
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(businessCustomerCreateRequest.customerType())
            .isEqualTo(BusinessCustomerCreateRequest.CustomerType.BUSINESS)
        assertThat(businessCustomerCreateRequest.address())
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
        assertThat(businessCustomerCreateRequest.businessInfo())
            .isEqualTo(
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
                    .expectedMonthlyTransactionCount(
                        BusinessCustomerCreateRequest.BusinessInfo.ExpectedMonthlyTransactionCount
                            .COUNT_100_TO_500
                    )
                    .expectedMonthlyTransactionVolume(
                        BusinessCustomerCreateRequest.BusinessInfo.ExpectedMonthlyTransactionVolume
                            .VOLUME_100_K_TO_1_M
                    )
                    .addExpectedRecipientJurisdiction("US")
                    .purposeOfAccount(
                        BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                            .CONTRACTOR_PAYOUTS
                    )
                    .registrationNumber("5523041")
                    .sourceOfFunds("Funds derived from customer payments for software services")
                    .build()
            )
        assertThat(businessCustomerCreateRequest.currencies()).containsExactly("USD", "USDC")
        assertThat(businessCustomerCreateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(businessCustomerCreateRequest.kybStatus())
            .isEqualTo(BusinessCustomerCreateRequest.KybStatus.APPROVED)
        assertThat(businessCustomerCreateRequest.platformCustomerId()).isEqualTo("9f84e0c2a72c4fa")
        assertThat(businessCustomerCreateRequest.region()).isEqualTo("US")
        assertThat(businessCustomerCreateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessCustomerCreateRequest =
            BusinessCustomerCreateRequest.builder()
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
                        .purposeOfAccount(
                            BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                                .CONTRACTOR_PAYOUTS
                        )
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .build()
                )
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .kybStatus(BusinessCustomerCreateRequest.KybStatus.APPROVED)
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedBusinessCustomerCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomerCreateRequest),
                jacksonTypeRef<BusinessCustomerCreateRequest>(),
            )

        assertThat(roundtrippedBusinessCustomerCreateRequest)
            .isEqualTo(businessCustomerCreateRequest)
    }
}
