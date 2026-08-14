// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletIndividualBeneficiaryTest {

    @Test
    fun create() {
        val walletIndividualBeneficiary =
            WalletIndividualBeneficiary.builder()
                .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("US")
                .fullName("John Michael Doe")
                .build()

        assertThat(walletIndividualBeneficiary.beneficiaryType())
            .isEqualTo(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(walletIndividualBeneficiary.countryOfResidence()).isEqualTo("US")
        assertThat(walletIndividualBeneficiary.fullName()).isEqualTo("John Michael Doe")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val walletIndividualBeneficiary =
            WalletIndividualBeneficiary.builder()
                .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("US")
                .fullName("John Michael Doe")
                .build()

        val roundtrippedWalletIndividualBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletIndividualBeneficiary),
                jacksonTypeRef<WalletIndividualBeneficiary>(),
            )

        assertThat(roundtrippedWalletIndividualBeneficiary).isEqualTo(walletIndividualBeneficiary)
    }
}
