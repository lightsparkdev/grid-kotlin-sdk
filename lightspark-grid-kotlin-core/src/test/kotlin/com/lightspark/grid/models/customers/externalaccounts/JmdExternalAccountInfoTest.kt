// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.JmdBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.JmdAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JmdExternalAccountInfoTest {

    @Test
    fun create() {
        val jmdExternalAccountInfo =
            JmdExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .branchCode("21029")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    JmdBeneficiary.builder()
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
                        .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        assertThat(jmdExternalAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(jmdExternalAccountInfo.accountType())
            .isEqualTo(JmdAccountInfo.AccountType.JMD_ACCOUNT)
        assertThat(jmdExternalAccountInfo.bankAccountType())
            .isEqualTo(JmdAccountInfo.BankAccountType.CHECKING)
        assertThat(jmdExternalAccountInfo.bankName()).isEqualTo("x")
        assertThat(jmdExternalAccountInfo.branchCode()).isEqualTo("21029")
        assertThat(jmdExternalAccountInfo.paymentRails())
            .containsExactly(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(jmdExternalAccountInfo.beneficiary())
            .isEqualTo(
                JmdExternalAccountInfo.Beneficiary.ofIndividual(
                    JmdBeneficiary.builder()
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
                        .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jmdExternalAccountInfo =
            JmdExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .branchCode("21029")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    JmdBeneficiary.builder()
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
                        .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        val roundtrippedJmdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jmdExternalAccountInfo),
                jacksonTypeRef<JmdExternalAccountInfo>(),
            )

        assertThat(roundtrippedJmdExternalAccountInfo).isEqualTo(jmdExternalAccountInfo)
    }
}
