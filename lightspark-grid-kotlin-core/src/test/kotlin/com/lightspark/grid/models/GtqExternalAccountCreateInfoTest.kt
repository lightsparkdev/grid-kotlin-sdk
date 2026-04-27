// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GtqExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val gtqExternalAccountCreateInfo =
            GtqExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(GtqExternalAccountCreateInfo.AccountType.GTQ_ACCOUNT)
                .bankAccountType(GtqExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("x")
                .beneficiary(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
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
                        .build()
                )
                .build()

        assertThat(gtqExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(gtqExternalAccountCreateInfo.accountType())
            .isEqualTo(GtqExternalAccountCreateInfo.AccountType.GTQ_ACCOUNT)
        assertThat(gtqExternalAccountCreateInfo.bankAccountType())
            .isEqualTo(GtqExternalAccountCreateInfo.BankAccountType.CHECKING)
        assertThat(gtqExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(gtqExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                GtqExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
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
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gtqExternalAccountCreateInfo =
            GtqExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(GtqExternalAccountCreateInfo.AccountType.GTQ_ACCOUNT)
                .bankAccountType(GtqExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("x")
                .beneficiary(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
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
                        .build()
                )
                .build()

        val roundtrippedGtqExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtqExternalAccountCreateInfo),
                jacksonTypeRef<GtqExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedGtqExternalAccountCreateInfo).isEqualTo(gtqExternalAccountCreateInfo)
    }
}
