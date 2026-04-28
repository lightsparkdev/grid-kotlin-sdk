// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GhsExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val ghsExternalAccountCreateInfo =
            GhsExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
                .beneficiary(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(ghsExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(ghsExternalAccountCreateInfo.accountType())
            .isEqualTo(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
        assertThat(ghsExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                GhsExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(ghsExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ghsExternalAccountCreateInfo =
            GhsExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
                .beneficiary(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedGhsExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ghsExternalAccountCreateInfo),
                jacksonTypeRef<GhsExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedGhsExternalAccountCreateInfo).isEqualTo(ghsExternalAccountCreateInfo)
    }
}
