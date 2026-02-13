// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnExternalAccountInfoTest {

    @Test
    fun create() {
        val mxnExternalAccountInfo =
            MxnExternalAccountInfo.builder()
                .accountType(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MxnBeneficiary.Address.builder()
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
                .clabeNumber("123456789012345678")
                .build()

        assertThat(mxnExternalAccountInfo.accountType())
            .isEqualTo(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
        assertThat(mxnExternalAccountInfo.beneficiary())
            .isEqualTo(
                MxnExternalAccountInfo.Beneficiary.ofIndividual(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MxnBeneficiary.Address.builder()
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
        assertThat(mxnExternalAccountInfo.clabeNumber()).isEqualTo("123456789012345678")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnExternalAccountInfo =
            MxnExternalAccountInfo.builder()
                .accountType(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MxnBeneficiary.Address.builder()
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
                .clabeNumber("123456789012345678")
                .build()

        val roundtrippedMxnExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnExternalAccountInfo),
                jacksonTypeRef<MxnExternalAccountInfo>(),
            )

        assertThat(roundtrippedMxnExternalAccountInfo).isEqualTo(mxnExternalAccountInfo)
    }
}
