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
                .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .accountNumber("1234567890")
                .bankAccountType(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
                .phoneNumber("+1234567890")
                .build()

        assertThat(copExternalAccountCreateInfo.accountType())
            .isEqualTo(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
        assertThat(copExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                CopExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(copExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(copExternalAccountCreateInfo.bankAccountType())
            .isEqualTo(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
        assertThat(copExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copExternalAccountCreateInfo =
            CopExternalAccountCreateInfo.builder()
                .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .accountNumber("1234567890")
                .bankAccountType(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
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
