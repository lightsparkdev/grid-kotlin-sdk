// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BwpExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val bwpExternalAccountCreateInfo =
            BwpExternalAccountCreateInfo.builder()
                .accountType(BwpExternalAccountCreateInfo.AccountType.BWP_ACCOUNT)
                .beneficiary(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(bwpExternalAccountCreateInfo.accountType())
            .isEqualTo(BwpExternalAccountCreateInfo.AccountType.BWP_ACCOUNT)
        assertThat(bwpExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                BwpExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(bwpExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(bwpExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bwpExternalAccountCreateInfo =
            BwpExternalAccountCreateInfo.builder()
                .accountType(BwpExternalAccountCreateInfo.AccountType.BWP_ACCOUNT)
                .beneficiary(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBwpExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bwpExternalAccountCreateInfo),
                jacksonTypeRef<BwpExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedBwpExternalAccountCreateInfo).isEqualTo(bwpExternalAccountCreateInfo)
    }
}
