// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.GtqBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.GtqAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GtqExternalAccountInfoTest {

    @Test
    fun create() {
        val gtqExternalAccountInfo =
            GtqExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        assertThat(gtqExternalAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(gtqExternalAccountInfo.accountType())
            .isEqualTo(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
        assertThat(gtqExternalAccountInfo.paymentRails())
            .containsExactly(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(gtqExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(gtqExternalAccountInfo.beneficiary())
            .isEqualTo(
                GtqExternalAccountInfo.Beneficiary.ofIndividual(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
        val gtqExternalAccountInfo =
            GtqExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        val roundtrippedGtqExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtqExternalAccountInfo),
                jacksonTypeRef<GtqExternalAccountInfo>(),
            )

        assertThat(roundtrippedGtqExternalAccountInfo).isEqualTo(gtqExternalAccountInfo)
    }
}
