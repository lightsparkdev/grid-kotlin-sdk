// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArbitrumWalletInfoTest {

    @Test
    fun create() {
        val arbitrumWalletInfo =
            ArbitrumWalletInfo.builder()
                .accountType(ArbitrumWalletInfo.AccountType.ARBITRUM_WALLET)
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

        assertThat(arbitrumWalletInfo.accountType())
            .isEqualTo(ArbitrumWalletInfo.AccountType.ARBITRUM_WALLET)
        assertThat(arbitrumWalletInfo.address())
            .isEqualTo("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
        assertThat(arbitrumWalletInfo.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
        assertThat(arbitrumWalletInfo.vaspName()).isEqualTo("Kraken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val arbitrumWalletInfo =
            ArbitrumWalletInfo.builder()
                .accountType(ArbitrumWalletInfo.AccountType.ARBITRUM_WALLET)
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

        val roundtrippedArbitrumWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(arbitrumWalletInfo),
                jacksonTypeRef<ArbitrumWalletInfo>(),
            )

        assertThat(roundtrippedArbitrumWalletInfo).isEqualTo(arbitrumWalletInfo)
    }
}
