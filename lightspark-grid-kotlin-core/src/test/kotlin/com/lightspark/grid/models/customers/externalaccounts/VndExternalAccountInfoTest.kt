// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VndExternalAccountInfoTest {

    @Test
    fun create() {
        val vndExternalAccountInfo =
            VndExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            VndBeneficiary.Address.builder()
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

        assertThat(vndExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(vndExternalAccountInfo.accountType())
            .isEqualTo(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
        assertThat(vndExternalAccountInfo.bankName()).isEqualTo("bankName")
        assertThat(vndExternalAccountInfo.beneficiary())
            .isEqualTo(
                VndExternalAccountInfo.Beneficiary.ofIndividual(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            VndBeneficiary.Address.builder()
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
        val vndExternalAccountInfo =
            VndExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            VndBeneficiary.Address.builder()
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

        val roundtrippedVndExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vndExternalAccountInfo),
                jacksonTypeRef<VndExternalAccountInfo>(),
            )

        assertThat(roundtrippedVndExternalAccountInfo).isEqualTo(vndExternalAccountInfo)
    }
}
