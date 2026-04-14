// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MwkExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val mwkExternalAccountCreateInfo =
            MwkExternalAccountCreateInfo.builder()
                .accountType(MwkExternalAccountCreateInfo.AccountType.MWK_ACCOUNT)
                .beneficiary(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(mwkExternalAccountCreateInfo.accountType())
            .isEqualTo(MwkExternalAccountCreateInfo.AccountType.MWK_ACCOUNT)
        assertThat(mwkExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                MwkExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(mwkExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(mwkExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mwkExternalAccountCreateInfo =
            MwkExternalAccountCreateInfo.builder()
                .accountType(MwkExternalAccountCreateInfo.AccountType.MWK_ACCOUNT)
                .beneficiary(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedMwkExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mwkExternalAccountCreateInfo),
                jacksonTypeRef<MwkExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedMwkExternalAccountCreateInfo).isEqualTo(mwkExternalAccountCreateInfo)
    }
}
