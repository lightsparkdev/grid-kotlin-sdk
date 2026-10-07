// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlasmaWalletInfoTest {

    @Test
    fun create() {
        val plasmaWalletInfo =
            PlasmaWalletInfo.builder()
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .vaspName("Kraken")
                .accountType(PlasmaWalletInfo.AccountType.PLASMA_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        assertThat(plasmaWalletInfo.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
        assertThat(plasmaWalletInfo.vaspName()).isEqualTo("Kraken")
        assertThat(plasmaWalletInfo.accountType())
            .isEqualTo(PlasmaWalletInfo.AccountType.PLASMA_WALLET)
        assertThat(plasmaWalletInfo.address())
            .isEqualTo("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val plasmaWalletInfo =
            PlasmaWalletInfo.builder()
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .vaspName("Kraken")
                .accountType(PlasmaWalletInfo.AccountType.PLASMA_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val roundtrippedPlasmaWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(plasmaWalletInfo),
                jacksonTypeRef<PlasmaWalletInfo>(),
            )

        assertThat(roundtrippedPlasmaWalletInfo).isEqualTo(plasmaWalletInfo)
    }
}
