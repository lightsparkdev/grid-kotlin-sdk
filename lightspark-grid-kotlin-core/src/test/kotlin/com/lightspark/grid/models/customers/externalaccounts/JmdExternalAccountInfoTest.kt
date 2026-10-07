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
                .accountNumber("1234567890")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .bankName("National Commercial Bank Ja Ltd")
                .branchCode("11111")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

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
        assertThat(jmdExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(jmdExternalAccountInfo.accountType())
            .isEqualTo(JmdAccountInfo.AccountType.JMD_ACCOUNT)
        assertThat(jmdExternalAccountInfo.bankAccountType())
            .isEqualTo(JmdAccountInfo.BankAccountType.CHECKING)
        assertThat(jmdExternalAccountInfo.bankName()).isEqualTo("National Commercial Bank Ja Ltd")
        assertThat(jmdExternalAccountInfo.branchCode()).isEqualTo("11111")
        assertThat(jmdExternalAccountInfo.paymentRails())
            .containsExactly(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jmdExternalAccountInfo =
            JmdExternalAccountInfo.builder()
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
                .accountNumber("1234567890")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .bankName("National Commercial Bank Ja Ltd")
                .branchCode("11111")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedJmdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jmdExternalAccountInfo),
                jacksonTypeRef<JmdExternalAccountInfo>(),
            )

        assertThat(roundtrippedJmdExternalAccountInfo).isEqualTo(jmdExternalAccountInfo)
    }
}
