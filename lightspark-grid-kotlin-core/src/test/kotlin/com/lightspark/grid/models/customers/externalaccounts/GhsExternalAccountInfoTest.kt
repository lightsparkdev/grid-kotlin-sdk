// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.GhsBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.GhsAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GhsExternalAccountInfoTest {

    @Test
    fun create() {
        val ghsExternalAccountInfo =
            GhsExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(GhsAccountInfo.AccountType.GHS_ACCOUNT)
                .addPaymentRail(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        assertThat(ghsExternalAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(ghsExternalAccountInfo.accountType())
            .isEqualTo(GhsAccountInfo.AccountType.GHS_ACCOUNT)
        assertThat(ghsExternalAccountInfo.paymentRails())
            .containsExactly(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(ghsExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(ghsExternalAccountInfo.beneficiary())
            .isEqualTo(
                GhsExternalAccountInfo.Beneficiary.ofIndividual(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ghsExternalAccountInfo =
            GhsExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(GhsAccountInfo.AccountType.GHS_ACCOUNT)
                .addPaymentRail(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        val roundtrippedGhsExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ghsExternalAccountInfo),
                jacksonTypeRef<GhsExternalAccountInfo>(),
            )

        assertThat(roundtrippedGhsExternalAccountInfo).isEqualTo(ghsExternalAccountInfo)
    }
}
