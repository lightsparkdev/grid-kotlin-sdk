// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolygonWalletInfoTest {

    @Test
    fun create() {
        val polygonWalletInfo =
            PolygonWalletInfo.builder()
                .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .vaspName("Kraken")
                .build()

        assertThat(polygonWalletInfo.accountType())
            .isEqualTo(PolygonWalletInfo.AccountType.POLYGON_WALLET)
        assertThat(polygonWalletInfo.address())
            .isEqualTo("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
        assertThat(polygonWalletInfo.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
        assertThat(polygonWalletInfo.vaspName()).isEqualTo("Kraken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val polygonWalletInfo =
            PolygonWalletInfo.builder()
                .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .vaspName("Kraken")
                .build()

        val roundtrippedPolygonWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(polygonWalletInfo),
                jacksonTypeRef<PolygonWalletInfo>(),
            )

        assertThat(roundtrippedPolygonWalletInfo).isEqualTo(polygonWalletInfo)
    }
}
