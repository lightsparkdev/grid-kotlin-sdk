// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolanaWalletInfoTest {

    @Test
    fun create() {
        val solanaWalletInfo =
            SolanaWalletInfo.builder()
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .vaspName("Kraken")
                .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                .address("4Nd1m6Qkq7RfKuE5vQ9qP9Tn6H94Ueqb4xXHzsAbd8Wg")
                .build()

        assertThat(solanaWalletInfo.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
        assertThat(solanaWalletInfo.vaspName()).isEqualTo("Kraken")
        assertThat(solanaWalletInfo.accountType())
            .isEqualTo(SolanaWalletInfo.AccountType.SOLANA_WALLET)
        assertThat(solanaWalletInfo.address())
            .isEqualTo("4Nd1m6Qkq7RfKuE5vQ9qP9Tn6H94Ueqb4xXHzsAbd8Wg")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val solanaWalletInfo =
            SolanaWalletInfo.builder()
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .vaspName("Kraken")
                .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                .address("4Nd1m6Qkq7RfKuE5vQ9qP9Tn6H94Ueqb4xXHzsAbd8Wg")
                .build()

        val roundtrippedSolanaWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(solanaWalletInfo),
                jacksonTypeRef<SolanaWalletInfo>(),
            )

        assertThat(roundtrippedSolanaWalletInfo).isEqualTo(solanaWalletInfo)
    }
}
