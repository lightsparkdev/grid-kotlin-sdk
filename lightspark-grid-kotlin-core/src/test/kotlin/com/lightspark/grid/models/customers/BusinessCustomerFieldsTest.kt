// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessCustomerFieldsTest {

    @Test
    fun create() {
        val businessCustomerFields =
            BusinessCustomerFields.builder()
                .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                    BusinessCustomerFields.BusinessInfo.builder()
                        .businessType(
                            BusinessCustomerFields.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerFields.BusinessInfo.EntityType.LLC)
                        .expectedMonthlyTransactionCount("100_TO_500")
                        .expectedMonthlyTransactionVolume("100K_TO_1M")
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .purposeOfAccount("Payout to contractors")
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                .build()

        assertThat(businessCustomerFields.customerType())
            .isEqualTo(BusinessCustomerFields.CustomerType.BUSINESS)
        assertThat(businessCustomerFields.address())
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
        assertThat(businessCustomerFields.businessInfo())
            .isEqualTo(
                BusinessCustomerFields.BusinessInfo.builder()
                    .businessType(
                        BusinessCustomerFields.BusinessInfo.BusinessType
                            .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                    )
                    .addCountriesOfOperation("US")
                    .country("US")
                    .doingBusinessAs("Acme")
                    .entityType(BusinessCustomerFields.BusinessInfo.EntityType.LLC)
                    .expectedMonthlyTransactionCount("100_TO_500")
                    .expectedMonthlyTransactionVolume("100K_TO_1M")
                    .addExpectedRecipientJurisdiction("US")
                    .incorporatedOn(LocalDate.parse("2018-03-14"))
                    .legalName("Acme Corporation, Inc.")
                    .purposeOfAccount("Payout to contractors")
                    .registrationNumber("5523041")
                    .sourceOfFunds("Funds derived from customer payments for software services")
                    .taxId("47-1234567")
                    .build()
            )
        assertThat(businessCustomerFields.kybStatus())
            .isEqualTo(BusinessCustomerFields.KybStatus.APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessCustomerFields =
            BusinessCustomerFields.builder()
                .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                    BusinessCustomerFields.BusinessInfo.builder()
                        .businessType(
                            BusinessCustomerFields.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerFields.BusinessInfo.EntityType.LLC)
                        .expectedMonthlyTransactionCount("100_TO_500")
                        .expectedMonthlyTransactionVolume("100K_TO_1M")
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .purposeOfAccount("Payout to contractors")
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                .build()

        val roundtrippedBusinessCustomerFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomerFields),
                jacksonTypeRef<BusinessCustomerFields>(),
            )

        assertThat(roundtrippedBusinessCustomerFields).isEqualTo(businessCustomerFields)
    }
}
