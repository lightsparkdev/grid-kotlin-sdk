// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.WalletBeneficiaryOneOf
import com.lightspark.grid.models.customers.externalaccounts.WalletIndividualBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EthereumWalletExternalAccountInfoTest {

    @Test
    fun create() {
        val ethereumWalletExternalAccountInfo =
            EthereumWalletExternalAccountInfo.builder()
                .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
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

        assertThat(ethereumWalletExternalAccountInfo.accountType())
            .isEqualTo(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
        assertThat(ethereumWalletExternalAccountInfo.address())
            .isEqualTo("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
        assertThat(ethereumWalletExternalAccountInfo.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
        assertThat(ethereumWalletExternalAccountInfo.vaspName()).isEqualTo("Kraken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ethereumWalletExternalAccountInfo =
            EthereumWalletExternalAccountInfo.builder()
                .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
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

        val roundtrippedEthereumWalletExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ethereumWalletExternalAccountInfo),
                jacksonTypeRef<EthereumWalletExternalAccountInfo>(),
            )

        assertThat(roundtrippedEthereumWalletExternalAccountInfo)
            .isEqualTo(ethereumWalletExternalAccountInfo)
    }
}
