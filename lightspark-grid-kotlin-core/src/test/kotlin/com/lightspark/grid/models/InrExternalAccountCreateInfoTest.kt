// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.InrBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val inrExternalAccountCreateInfo =
            InrExternalAccountCreateInfo.builder()
                .accountType(InrExternalAccountCreateInfo.AccountType.INR_ACCOUNT)
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .vpa("user@upi")
                .build()

        assertThat(inrExternalAccountCreateInfo.accountType())
            .isEqualTo(InrExternalAccountCreateInfo.AccountType.INR_ACCOUNT)
        assertThat(inrExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                InrExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(inrExternalAccountCreateInfo.vpa()).isEqualTo("user@upi")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrExternalAccountCreateInfo =
            InrExternalAccountCreateInfo.builder()
                .accountType(InrExternalAccountCreateInfo.AccountType.INR_ACCOUNT)
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .vpa("user@upi")
                .build()

        val roundtrippedInrExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrExternalAccountCreateInfo),
                jacksonTypeRef<InrExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedInrExternalAccountCreateInfo).isEqualTo(inrExternalAccountCreateInfo)
    }
}
