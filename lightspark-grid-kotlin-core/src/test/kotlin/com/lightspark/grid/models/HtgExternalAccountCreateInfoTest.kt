// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HtgExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val htgExternalAccountCreateInfo =
            HtgExternalAccountCreateInfo.builder()
                .accountType(HtgExternalAccountCreateInfo.AccountType.HTG_ACCOUNT)
                .beneficiary(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(htgExternalAccountCreateInfo.accountType())
            .isEqualTo(HtgExternalAccountCreateInfo.AccountType.HTG_ACCOUNT)
        assertThat(htgExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                HtgExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(htgExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val htgExternalAccountCreateInfo =
            HtgExternalAccountCreateInfo.builder()
                .accountType(HtgExternalAccountCreateInfo.AccountType.HTG_ACCOUNT)
                .beneficiary(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedHtgExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(htgExternalAccountCreateInfo),
                jacksonTypeRef<HtgExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedHtgExternalAccountCreateInfo).isEqualTo(htgExternalAccountCreateInfo)
    }
}
