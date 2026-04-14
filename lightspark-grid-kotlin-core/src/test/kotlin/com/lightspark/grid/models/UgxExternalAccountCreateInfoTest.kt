// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UgxExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val ugxExternalAccountCreateInfo =
            UgxExternalAccountCreateInfo.builder()
                .accountType(UgxExternalAccountCreateInfo.AccountType.UGX_ACCOUNT)
                .beneficiary(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        assertThat(ugxExternalAccountCreateInfo.accountType())
            .isEqualTo(UgxExternalAccountCreateInfo.AccountType.UGX_ACCOUNT)
        assertThat(ugxExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                UgxExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(ugxExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(ugxExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ugxExternalAccountCreateInfo =
            UgxExternalAccountCreateInfo.builder()
                .accountType(UgxExternalAccountCreateInfo.AccountType.UGX_ACCOUNT)
                .beneficiary(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val roundtrippedUgxExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ugxExternalAccountCreateInfo),
                jacksonTypeRef<UgxExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedUgxExternalAccountCreateInfo).isEqualTo(ugxExternalAccountCreateInfo)
    }
}
