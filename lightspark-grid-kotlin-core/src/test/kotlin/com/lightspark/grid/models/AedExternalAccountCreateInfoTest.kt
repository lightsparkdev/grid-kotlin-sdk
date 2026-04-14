// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AedExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val aedExternalAccountCreateInfo =
            AedExternalAccountCreateInfo.builder()
                .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                .beneficiary(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .iban("AE070331234567890123456")
                .swiftCode("EBILAEAD")
                .build()

        assertThat(aedExternalAccountCreateInfo.accountType())
            .isEqualTo(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
        assertThat(aedExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                AedExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(aedExternalAccountCreateInfo.iban()).isEqualTo("AE070331234567890123456")
        assertThat(aedExternalAccountCreateInfo.swiftCode()).isEqualTo("EBILAEAD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aedExternalAccountCreateInfo =
            AedExternalAccountCreateInfo.builder()
                .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                .beneficiary(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .iban("AE070331234567890123456")
                .swiftCode("EBILAEAD")
                .build()

        val roundtrippedAedExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aedExternalAccountCreateInfo),
                jacksonTypeRef<AedExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedAedExternalAccountCreateInfo).isEqualTo(aedExternalAccountCreateInfo)
    }
}
