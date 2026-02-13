// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdExternalAccountInfoTest {

    @Test
    fun create() {
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            SgdBeneficiary.Address.builder()
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
                .swiftCode("DBSSSGSG")
                .build()

        assertThat(sgdExternalAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(sgdExternalAccountInfo.accountType())
            .isEqualTo(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
        assertThat(sgdExternalAccountInfo.bankName()).isEqualTo("DBS Bank Ltd")
        assertThat(sgdExternalAccountInfo.beneficiary())
            .isEqualTo(
                SgdExternalAccountInfo.Beneficiary.ofIndividual(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            SgdBeneficiary.Address.builder()
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
        assertThat(sgdExternalAccountInfo.swiftCode()).isEqualTo("DBSSSGSG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            SgdBeneficiary.Address.builder()
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
                .swiftCode("DBSSSGSG")
                .build()

        val roundtrippedSgdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdExternalAccountInfo),
                jacksonTypeRef<SgdExternalAccountInfo>(),
            )

        assertThat(roundtrippedSgdExternalAccountInfo).isEqualTo(sgdExternalAccountInfo)
    }
}
