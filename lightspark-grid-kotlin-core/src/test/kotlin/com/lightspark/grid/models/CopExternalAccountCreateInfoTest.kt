// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val copExternalAccountCreateInfo =
            CopExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+1234567890")
                .build()

        assertThat(copExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(copExternalAccountCreateInfo.accountType())
            .isEqualTo(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
        assertThat(copExternalAccountCreateInfo.bankAccountType())
            .isEqualTo(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
        assertThat(copExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                CopExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(copExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copExternalAccountCreateInfo =
            CopExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedCopExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copExternalAccountCreateInfo),
                jacksonTypeRef<CopExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedCopExternalAccountCreateInfo).isEqualTo(copExternalAccountCreateInfo)
    }
}
