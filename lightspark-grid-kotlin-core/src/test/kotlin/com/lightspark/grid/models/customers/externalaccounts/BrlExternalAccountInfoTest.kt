// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlExternalAccountInfoTest {

    @Test
    fun create() {
        val brlExternalAccountInfo =
            BrlExternalAccountInfo.builder()
                .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            BrlBeneficiary.Address.builder()
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
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .build()

        assertThat(brlExternalAccountInfo.accountType())
            .isEqualTo(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
        assertThat(brlExternalAccountInfo.beneficiary())
            .isEqualTo(
                BrlExternalAccountInfo.Beneficiary.ofIndividual(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            BrlBeneficiary.Address.builder()
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
        assertThat(brlExternalAccountInfo.pixKey()).isEqualTo("pixKey")
        assertThat(brlExternalAccountInfo.pixKeyType()).isEqualTo("pixKeyType")
        assertThat(brlExternalAccountInfo.taxId()).isEqualTo("taxId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlExternalAccountInfo =
            BrlExternalAccountInfo.builder()
                .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            BrlBeneficiary.Address.builder()
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
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .build()

        val roundtrippedBrlExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlExternalAccountInfo),
                jacksonTypeRef<BrlExternalAccountInfo>(),
            )

        assertThat(roundtrippedBrlExternalAccountInfo).isEqualTo(brlExternalAccountInfo)
    }
}
