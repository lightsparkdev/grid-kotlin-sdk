// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessInfoResponseTest {

    @Test
    fun create() {
        val businessInfoResponse =
            BusinessInfoResponse.builder()
                .legalName("Acme Corporation, Inc.")
                .businessType(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                .addCountriesOfOperation("US")
                .country("US")
                .doingBusinessAs("Acme")
                .entityType(EntityType.LLC)
                .expectedMonthlyTransactionCount(
                    BusinessInfoResponse.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    BusinessInfoResponse.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .addExpectedRecipientJurisdiction("US")
                .incorporatedOn(LocalDate.parse("2018-03-14"))
                .purposeOfAccount(BusinessInfoResponse.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .registrationNumber("5523041")
                .sourceOfFunds("Funds derived from customer payments for software services")
                .taxId("47-1234567")
                .build()

        assertThat(businessInfoResponse.legalName()).isEqualTo("Acme Corporation, Inc.")
        assertThat(businessInfoResponse.businessType())
            .isEqualTo(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
        assertThat(businessInfoResponse.countriesOfOperation()).containsExactly("US")
        assertThat(businessInfoResponse.country()).isEqualTo("US")
        assertThat(businessInfoResponse.doingBusinessAs()).isEqualTo("Acme")
        assertThat(businessInfoResponse.entityType()).isEqualTo(EntityType.LLC)
        assertThat(businessInfoResponse.expectedMonthlyTransactionCount())
            .isEqualTo(BusinessInfoResponse.ExpectedMonthlyTransactionCount.COUNT_100_TO_500)
        assertThat(businessInfoResponse.expectedMonthlyTransactionVolume())
            .isEqualTo(BusinessInfoResponse.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M)
        assertThat(businessInfoResponse.expectedRecipientJurisdictions()).containsExactly("US")
        assertThat(businessInfoResponse.incorporatedOn()).isEqualTo(LocalDate.parse("2018-03-14"))
        assertThat(businessInfoResponse.purposeOfAccount())
            .isEqualTo(BusinessInfoResponse.PurposeOfAccount.CONTRACTOR_PAYOUTS)
        assertThat(businessInfoResponse.registrationNumber()).isEqualTo("5523041")
        assertThat(businessInfoResponse.sourceOfFunds())
            .isEqualTo("Funds derived from customer payments for software services")
        assertThat(businessInfoResponse.taxId()).isEqualTo("47-1234567")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessInfoResponse =
            BusinessInfoResponse.builder()
                .legalName("Acme Corporation, Inc.")
                .businessType(BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING)
                .addCountriesOfOperation("US")
                .country("US")
                .doingBusinessAs("Acme")
                .entityType(EntityType.LLC)
                .expectedMonthlyTransactionCount(
                    BusinessInfoResponse.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    BusinessInfoResponse.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .addExpectedRecipientJurisdiction("US")
                .incorporatedOn(LocalDate.parse("2018-03-14"))
                .purposeOfAccount(BusinessInfoResponse.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .registrationNumber("5523041")
                .sourceOfFunds("Funds derived from customer payments for software services")
                .taxId("47-1234567")
                .build()

        val roundtrippedBusinessInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessInfoResponse),
                jacksonTypeRef<BusinessInfoResponse>(),
            )

        assertThat(roundtrippedBusinessInfoResponse).isEqualTo(businessInfoResponse)
    }
}
