// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletBeneficiaryFieldsTest {

    @Test
    fun create() {
        val walletBeneficiaryFields =
            WalletBeneficiaryFields.builder()
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .build()

        assertThat(walletBeneficiaryFields.beneficiary())
            .isEqualTo(
                WalletBeneficiaryOneOf.ofIndividual(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val walletBeneficiaryFields =
            WalletBeneficiaryFields.builder()
                .beneficiary(
                    WalletIndividualBeneficiary.builder()
                        .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("US")
                        .fullName("John Michael Doe")
                        .build()
                )
                .build()

        val roundtrippedWalletBeneficiaryFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletBeneficiaryFields),
                jacksonTypeRef<WalletBeneficiaryFields>(),
            )

        assertThat(roundtrippedWalletBeneficiaryFields).isEqualTo(walletBeneficiaryFields)
    }
}
