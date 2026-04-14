// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.GbpBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val gbpExternalAccountCreateInfo =
            GbpExternalAccountCreateInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountCreateInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .sortCode("123456")
                .build()

        assertThat(gbpExternalAccountCreateInfo.accountNumber()).isEqualTo("12345678")
        assertThat(gbpExternalAccountCreateInfo.accountType())
            .isEqualTo(GbpExternalAccountCreateInfo.AccountType.GBP_ACCOUNT)
        assertThat(gbpExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                GbpExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(gbpExternalAccountCreateInfo.sortCode()).isEqualTo("123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpExternalAccountCreateInfo =
            GbpExternalAccountCreateInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountCreateInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .sortCode("123456")
                .build()

        val roundtrippedGbpExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpExternalAccountCreateInfo),
                jacksonTypeRef<GbpExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedGbpExternalAccountCreateInfo).isEqualTo(gbpExternalAccountCreateInfo)
    }
}
