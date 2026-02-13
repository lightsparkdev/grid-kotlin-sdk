// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkExternalAccountInfoTest {

    @Test
    fun create() {
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .accountType(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            DkkBeneficiary.Address.builder()
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
                .iban("iban")
                .swiftBic("swiftBic")
                .build()

        assertThat(dkkExternalAccountInfo.accountType())
            .isEqualTo(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
        assertThat(dkkExternalAccountInfo.beneficiary())
            .isEqualTo(
                DkkExternalAccountInfo.Beneficiary.ofIndividual(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            DkkBeneficiary.Address.builder()
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
        assertThat(dkkExternalAccountInfo.iban()).isEqualTo("iban")
        assertThat(dkkExternalAccountInfo.swiftBic()).isEqualTo("swiftBic")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .accountType(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            DkkBeneficiary.Address.builder()
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
                .iban("iban")
                .swiftBic("swiftBic")
                .build()

        val roundtrippedDkkExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkExternalAccountInfo),
                jacksonTypeRef<DkkExternalAccountInfo>(),
            )

        assertThat(roundtrippedDkkExternalAccountInfo).isEqualTo(dkkExternalAccountInfo)
    }
}
