// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpExternalAccountInfoTest {

    @Test
    fun create() {
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            GbpBeneficiary.Address.builder()
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
                .sortCode("20-00-00")
                .build()

        assertThat(gbpExternalAccountInfo.accountNumber()).isEqualTo("12345678")
        assertThat(gbpExternalAccountInfo.accountType())
            .isEqualTo(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
        assertThat(gbpExternalAccountInfo.beneficiary())
            .isEqualTo(
                GbpExternalAccountInfo.Beneficiary.ofIndividual(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            GbpBeneficiary.Address.builder()
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
        assertThat(gbpExternalAccountInfo.sortCode()).isEqualTo("20-00-00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            GbpBeneficiary.Address.builder()
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
                .sortCode("20-00-00")
                .build()

        val roundtrippedGbpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpExternalAccountInfo),
                jacksonTypeRef<GbpExternalAccountInfo>(),
            )

        assertThat(roundtrippedGbpExternalAccountInfo).isEqualTo(gbpExternalAccountInfo)
    }
}
