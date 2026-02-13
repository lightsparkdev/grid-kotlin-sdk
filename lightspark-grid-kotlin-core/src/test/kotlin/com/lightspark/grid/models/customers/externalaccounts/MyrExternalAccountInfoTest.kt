// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrExternalAccountInfoTest {

    @Test
    fun create() {
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MyrBeneficiary.Address.builder()
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
                .build()

        assertThat(myrExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(myrExternalAccountInfo.accountType())
            .isEqualTo(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
        assertThat(myrExternalAccountInfo.bankName()).isEqualTo("bankName")
        assertThat(myrExternalAccountInfo.beneficiary())
            .isEqualTo(
                MyrExternalAccountInfo.Beneficiary.ofIndividual(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MyrBeneficiary.Address.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MyrBeneficiary.Address.builder()
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
                .build()

        val roundtrippedMyrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrExternalAccountInfo),
                jacksonTypeRef<MyrExternalAccountInfo>(),
            )

        assertThat(roundtrippedMyrExternalAccountInfo).isEqualTo(myrExternalAccountInfo)
    }
}
