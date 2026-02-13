// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrExternalAccountInfoTest {

    @Test
    fun create() {
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
                .accountType(InrExternalAccountInfo.AccountType.INR_ACCOUNT)
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            InrBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .vpa("vpa")
                .build()

        assertThat(inrExternalAccountInfo.accountType())
            .isEqualTo(InrExternalAccountInfo.AccountType.INR_ACCOUNT)
        assertThat(inrExternalAccountInfo.beneficiary())
            .isEqualTo(
                InrExternalAccountInfo.Beneficiary.ofIndividual(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            InrBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(inrExternalAccountInfo.vpa()).isEqualTo("vpa")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
                .accountType(InrExternalAccountInfo.AccountType.INR_ACCOUNT)
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            InrBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .vpa("vpa")
                .build()

        val roundtrippedInrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrExternalAccountInfo),
                jacksonTypeRef<InrExternalAccountInfo>(),
            )

        assertThat(roundtrippedInrExternalAccountInfo).isEqualTo(inrExternalAccountInfo)
    }
}
