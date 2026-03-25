// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessInfoTest {

    @Test
    fun create() {
        val businessInfo =
            BusinessInfo.builder()
                .legalName("Acme Corporation, Inc.")
                .businessType(BusinessInfo.BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                .addCountriesOfOperation("US")
                .country("US")
                .doingBusinessAs("Acme")
                .entityType(BusinessInfo.EntityType.LLC)
                .expectedMonthlyTransactionCount(
                    BusinessInfo.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    BusinessInfo.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .addExpectedRecipientJurisdiction("US")
                .incorporatedOn(LocalDate.parse("2018-03-14"))
                .purposeOfAccount(BusinessInfo.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .registrationNumber("5523041")
                .sourceOfFunds("Funds derived from customer payments for software services")
                .taxId("47-1234567")
                .build()

        assertThat(businessInfo.legalName()).isEqualTo("Acme Corporation, Inc.")
        assertThat(businessInfo.businessType())
            .isEqualTo(BusinessInfo.BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
        assertThat(businessInfo.countriesOfOperation()).containsExactly("US")
        assertThat(businessInfo.country()).isEqualTo("US")
        assertThat(businessInfo.doingBusinessAs()).isEqualTo("Acme")
        assertThat(businessInfo.entityType()).isEqualTo(BusinessInfo.EntityType.LLC)
        assertThat(businessInfo.expectedMonthlyTransactionCount())
            .isEqualTo(BusinessInfo.ExpectedMonthlyTransactionCount.COUNT_100_TO_500)
        assertThat(businessInfo.expectedMonthlyTransactionVolume())
            .isEqualTo(BusinessInfo.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M)
        assertThat(businessInfo.expectedRecipientJurisdictions()).containsExactly("US")
        assertThat(businessInfo.incorporatedOn()).isEqualTo(LocalDate.parse("2018-03-14"))
        assertThat(businessInfo.purposeOfAccount())
            .isEqualTo(BusinessInfo.PurposeOfAccount.CONTRACTOR_PAYOUTS)
        assertThat(businessInfo.registrationNumber()).isEqualTo("5523041")
        assertThat(businessInfo.sourceOfFunds())
            .isEqualTo("Funds derived from customer payments for software services")
        assertThat(businessInfo.taxId()).isEqualTo("47-1234567")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessInfo =
            BusinessInfo.builder()
                .legalName("Acme Corporation, Inc.")
                .businessType(BusinessInfo.BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                .addCountriesOfOperation("US")
                .country("US")
                .doingBusinessAs("Acme")
                .entityType(BusinessInfo.EntityType.LLC)
                .expectedMonthlyTransactionCount(
                    BusinessInfo.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    BusinessInfo.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .addExpectedRecipientJurisdiction("US")
                .incorporatedOn(LocalDate.parse("2018-03-14"))
                .purposeOfAccount(BusinessInfo.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .registrationNumber("5523041")
                .sourceOfFunds("Funds derived from customer payments for software services")
                .taxId("47-1234567")
                .build()

        val roundtrippedBusinessInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessInfo),
                jacksonTypeRef<BusinessInfo>(),
            )

        assertThat(roundtrippedBusinessInfo).isEqualTo(businessInfo)
    }
}
