// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlvExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val slvExternalAccountCreateInfo =
            SlvExternalAccountCreateInfo.builder()
                .accountType(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
                .beneficiary(
                    SlvBeneficiary.builder()
                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountNumber("x")
                .bankAccountType(SlvExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("x")
                .phoneNumber("+50312345678")
                .build()

        assertThat(slvExternalAccountCreateInfo.accountType())
            .isEqualTo(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
        assertThat(slvExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                SlvExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    SlvBeneficiary.builder()
                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(slvExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(slvExternalAccountCreateInfo.bankAccountType())
            .isEqualTo(SlvExternalAccountCreateInfo.BankAccountType.CHECKING)
        assertThat(slvExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(slvExternalAccountCreateInfo.phoneNumber()).isEqualTo("+50312345678")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slvExternalAccountCreateInfo =
            SlvExternalAccountCreateInfo.builder()
                .accountType(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
                .beneficiary(
                    SlvBeneficiary.builder()
                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountNumber("x")
                .bankAccountType(SlvExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("x")
                .phoneNumber("+50312345678")
                .build()

        val roundtrippedSlvExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slvExternalAccountCreateInfo),
                jacksonTypeRef<SlvExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedSlvExternalAccountCreateInfo).isEqualTo(slvExternalAccountCreateInfo)
    }
}
