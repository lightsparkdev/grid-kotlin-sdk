// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.DkkBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val dkkExternalAccountCreateInfo =
            DkkExternalAccountCreateInfo.builder()
                .accountType(DkkExternalAccountCreateInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .iban("DK5000400040116243")
                .swiftCode("DABADKKK")
                .build()

        assertThat(dkkExternalAccountCreateInfo.accountType())
            .isEqualTo(DkkExternalAccountCreateInfo.AccountType.DKK_ACCOUNT)
        assertThat(dkkExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                DkkExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(dkkExternalAccountCreateInfo.iban()).isEqualTo("DK5000400040116243")
        assertThat(dkkExternalAccountCreateInfo.swiftCode()).isEqualTo("DABADKKK")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dkkExternalAccountCreateInfo =
            DkkExternalAccountCreateInfo.builder()
                .accountType(DkkExternalAccountCreateInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .iban("DK5000400040116243")
                .swiftCode("DABADKKK")
                .build()

        val roundtrippedDkkExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkExternalAccountCreateInfo),
                jacksonTypeRef<DkkExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedDkkExternalAccountCreateInfo).isEqualTo(dkkExternalAccountCreateInfo)
    }
}
