// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.BusinessType
import com.lightspark.grid.models.customers.EntityType
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessInfoUpdateTest {

    @Test
    fun create() {
        val businessInfoUpdate =
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

        assertThat(businessInfoUpdate.businessType())
            .isEqualTo(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
        assertThat(businessInfoUpdate.countriesOfOperation()).containsExactly("US")
        assertThat(businessInfoUpdate.country()).isEqualTo("US")
        assertThat(businessInfoUpdate.doingBusinessAs()).isEqualTo("Acme")
        assertThat(businessInfoUpdate.entityType()).isEqualTo(EntityType.LLC)
        assertThat(businessInfoUpdate.expectedMonthlyTransactionCount())
            .isEqualTo(BusinessInfoUpdate.ExpectedMonthlyTransactionCount.COUNT_100_TO_500)
        assertThat(businessInfoUpdate.expectedMonthlyTransactionVolume())
            .isEqualTo(BusinessInfoUpdate.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M)
        assertThat(businessInfoUpdate.expectedRecipientJurisdictions()).containsExactly("US")
        assertThat(businessInfoUpdate.incorporatedOn()).isEqualTo(LocalDate.parse("2018-03-14"))
        assertThat(businessInfoUpdate.legalName()).isEqualTo("Acme Corporation, Inc.")
        assertThat(businessInfoUpdate.purposeOfAccount())
            .isEqualTo(BusinessInfoUpdate.PurposeOfAccount.CONTRACTOR_PAYOUTS)
        assertThat(businessInfoUpdate.registrationNumber()).isEqualTo("5523041")
        assertThat(businessInfoUpdate.sourceOfFunds())
            .isEqualTo("Funds derived from customer payments for software services")
        assertThat(businessInfoUpdate.taxId()).isEqualTo("47-1234567")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessInfoUpdate =
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

        val roundtrippedBusinessInfoUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessInfoUpdate),
                jacksonTypeRef<BusinessInfoUpdate>(),
            )

        assertThat(roundtrippedBusinessInfoUpdate).isEqualTo(businessInfoUpdate)
    }
}
