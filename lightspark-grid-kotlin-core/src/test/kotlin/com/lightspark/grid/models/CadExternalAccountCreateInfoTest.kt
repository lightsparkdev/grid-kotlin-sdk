// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CadExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val cadExternalAccountCreateInfo =
            CadExternalAccountCreateInfo.builder()
                .accountNumber("1234567")
                .accountType(CadExternalAccountCreateInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .beneficiary(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .branchCode("00012")
                .build()

        assertThat(cadExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567")
        assertThat(cadExternalAccountCreateInfo.accountType())
            .isEqualTo(CadExternalAccountCreateInfo.AccountType.CAD_ACCOUNT)
        assertThat(cadExternalAccountCreateInfo.bankCode()).isEqualTo("001")
        assertThat(cadExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                CadExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(cadExternalAccountCreateInfo.branchCode()).isEqualTo("00012")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cadExternalAccountCreateInfo =
            CadExternalAccountCreateInfo.builder()
                .accountNumber("1234567")
                .accountType(CadExternalAccountCreateInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .beneficiary(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .branchCode("00012")
                .build()

        val roundtrippedCadExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cadExternalAccountCreateInfo),
                jacksonTypeRef<CadExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedCadExternalAccountCreateInfo).isEqualTo(cadExternalAccountCreateInfo)
    }
}
