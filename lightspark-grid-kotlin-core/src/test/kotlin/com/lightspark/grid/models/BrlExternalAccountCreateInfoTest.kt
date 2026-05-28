// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BrlBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val brlExternalAccountCreateInfo =
            BrlExternalAccountCreateInfo.builder()
                .accountType(BrlExternalAccountCreateInfo.AccountType.BRL_ACCOUNT)
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .pixKey("user@example.com")
                .pixKeyType(BrlExternalAccountCreateInfo.PixKeyType.CPF)
                .taxId("11111111111")
                .build()

        assertThat(brlExternalAccountCreateInfo.accountType())
            .isEqualTo(BrlExternalAccountCreateInfo.AccountType.BRL_ACCOUNT)
        assertThat(brlExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                BrlExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(brlExternalAccountCreateInfo.pixKey()).isEqualTo("user@example.com")
        assertThat(brlExternalAccountCreateInfo.pixKeyType())
            .isEqualTo(BrlExternalAccountCreateInfo.PixKeyType.CPF)
        assertThat(brlExternalAccountCreateInfo.taxId()).isEqualTo("11111111111")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlExternalAccountCreateInfo =
            BrlExternalAccountCreateInfo.builder()
                .accountType(BrlExternalAccountCreateInfo.AccountType.BRL_ACCOUNT)
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .pixKey("user@example.com")
                .pixKeyType(BrlExternalAccountCreateInfo.PixKeyType.CPF)
                .taxId("11111111111")
                .build()

        val roundtrippedBrlExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlExternalAccountCreateInfo),
                jacksonTypeRef<BrlExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedBrlExternalAccountCreateInfo).isEqualTo(brlExternalAccountCreateInfo)
    }
}
