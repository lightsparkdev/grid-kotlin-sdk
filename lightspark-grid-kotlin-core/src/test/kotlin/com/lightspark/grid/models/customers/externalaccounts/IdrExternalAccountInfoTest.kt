// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrExternalAccountInfoTest {

    @Test
    fun create() {
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            IdrBeneficiary.Address.builder()
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
                .sortCode("sortCode")
                .build()

        assertThat(idrExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(idrExternalAccountInfo.accountType())
            .isEqualTo(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
        assertThat(idrExternalAccountInfo.beneficiary())
            .isEqualTo(
                IdrExternalAccountInfo.Beneficiary.ofIndividual(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            IdrBeneficiary.Address.builder()
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
        assertThat(idrExternalAccountInfo.sortCode()).isEqualTo("sortCode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            IdrBeneficiary.Address.builder()
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
                .sortCode("sortCode")
                .build()

        val roundtrippedIdrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrExternalAccountInfo),
                jacksonTypeRef<IdrExternalAccountInfo>(),
            )

        assertThat(roundtrippedIdrExternalAccountInfo).isEqualTo(idrExternalAccountInfo)
    }
}
