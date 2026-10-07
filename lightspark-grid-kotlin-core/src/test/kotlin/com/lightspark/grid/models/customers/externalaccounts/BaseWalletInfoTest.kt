// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseWalletInfoTest {

    @Test
    fun create() {
        val baseWalletInfo =
            BaseWalletInfo.builder()
                .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
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

        assertThat(baseWalletInfo.accountType()).isEqualTo(BaseWalletInfo.AccountType.BASE_WALLET)
        assertThat(baseWalletInfo.address()).isEqualTo("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
        assertThat(baseWalletInfo.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
        assertThat(baseWalletInfo.vaspName()).isEqualTo("Kraken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseWalletInfo =
            BaseWalletInfo.builder()
                .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
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

        val roundtrippedBaseWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseWalletInfo),
                jacksonTypeRef<BaseWalletInfo>(),
            )

        assertThat(roundtrippedBaseWalletInfo).isEqualTo(baseWalletInfo)
    }
}
