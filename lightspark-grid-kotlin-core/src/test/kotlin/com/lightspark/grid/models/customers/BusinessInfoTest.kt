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
                .expectedActivityVolumes(
                    BusinessInfo.ExpectedActivityVolumes.builder()
                        .monthlyTransactionCount(
                            BusinessInfo.ExpectedActivityVolumes.MonthlyTransactionCount._100_TO_500
                        )
                        .monthlyTransactionVolume(
                            BusinessInfo.ExpectedActivityVolumes.MonthlyTransactionVolume
                                ._100_K_TO_1_M
                        )
                        .build()
                )
                .addExpectedRecipientJurisdiction("US")
                .incorporatedOn(LocalDate.parse("2018-03-14"))
                .purposeOfAccount(BusinessInfo.PurposeOfAccount.PAYMENTS)
                .registrationNumber("5523041")
                .sourceOfFunds(BusinessInfo.SourceOfFunds.OPERATING_REVENUE)
                .taxId("47-1234567")
                .build()

        assertThat(businessInfo.legalName()).isEqualTo("Acme Corporation, Inc.")
        assertThat(businessInfo.businessType())
            .isEqualTo(BusinessInfo.BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
        assertThat(businessInfo.countriesOfOperation()).containsExactly("US")
        assertThat(businessInfo.country()).isEqualTo("US")
        assertThat(businessInfo.doingBusinessAs()).isEqualTo("Acme")
        assertThat(businessInfo.entityType()).isEqualTo(BusinessInfo.EntityType.LLC)
        assertThat(businessInfo.expectedActivityVolumes())
            .isEqualTo(
                BusinessInfo.ExpectedActivityVolumes.builder()
                    .monthlyTransactionCount(
                        BusinessInfo.ExpectedActivityVolumes.MonthlyTransactionCount._100_TO_500
                    )
                    .monthlyTransactionVolume(
                        BusinessInfo.ExpectedActivityVolumes.MonthlyTransactionVolume._100_K_TO_1_M
                    )
                    .build()
            )
        assertThat(businessInfo.expectedRecipientJurisdictions()).containsExactly("US")
        assertThat(businessInfo.incorporatedOn()).isEqualTo(LocalDate.parse("2018-03-14"))
        assertThat(businessInfo.purposeOfAccount())
            .isEqualTo(BusinessInfo.PurposeOfAccount.PAYMENTS)
        assertThat(businessInfo.registrationNumber()).isEqualTo("5523041")
        assertThat(businessInfo.sourceOfFunds())
            .isEqualTo(BusinessInfo.SourceOfFunds.OPERATING_REVENUE)
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
                .expectedActivityVolumes(
                    BusinessInfo.ExpectedActivityVolumes.builder()
                        .monthlyTransactionCount(
                            BusinessInfo.ExpectedActivityVolumes.MonthlyTransactionCount._100_TO_500
                        )
                        .monthlyTransactionVolume(
                            BusinessInfo.ExpectedActivityVolumes.MonthlyTransactionVolume
                                ._100_K_TO_1_M
                        )
                        .build()
                )
                .addExpectedRecipientJurisdiction("US")
                .incorporatedOn(LocalDate.parse("2018-03-14"))
                .purposeOfAccount(BusinessInfo.PurposeOfAccount.PAYMENTS)
                .registrationNumber("5523041")
                .sourceOfFunds(BusinessInfo.SourceOfFunds.OPERATING_REVENUE)
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
