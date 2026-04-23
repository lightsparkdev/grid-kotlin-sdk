// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JmdExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val jmdExternalAccountCreateInfo =
            JmdExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(JmdExternalAccountCreateInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("x")
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
                .branchCode("21029")
                .build()

        assertThat(jmdExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(jmdExternalAccountCreateInfo.accountType())
            .isEqualTo(JmdExternalAccountCreateInfo.AccountType.JMD_ACCOUNT)
        assertThat(jmdExternalAccountCreateInfo.bankAccountType())
            .isEqualTo(JmdExternalAccountCreateInfo.BankAccountType.CHECKING)
        assertThat(jmdExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(jmdExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                JmdExternalAccountCreateInfo.Beneficiary.ofIndividual(
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
        assertThat(jmdExternalAccountCreateInfo.branchCode()).isEqualTo("21029")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jmdExternalAccountCreateInfo =
            JmdExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(JmdExternalAccountCreateInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("x")
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
                .branchCode("21029")
                .build()

        val roundtrippedJmdExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jmdExternalAccountCreateInfo),
                jacksonTypeRef<JmdExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedJmdExternalAccountCreateInfo).isEqualTo(jmdExternalAccountCreateInfo)
    }
}
