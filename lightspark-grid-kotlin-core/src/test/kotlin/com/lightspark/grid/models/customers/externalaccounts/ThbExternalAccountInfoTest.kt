// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThbExternalAccountInfoTest {

    @Test
    fun create() {
        val thbExternalAccountInfo =
            ThbExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            ThbBeneficiary.Address.builder()
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

        assertThat(thbExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(thbExternalAccountInfo.accountType())
            .isEqualTo(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
        assertThat(thbExternalAccountInfo.bankName()).isEqualTo("bankName")
        assertThat(thbExternalAccountInfo.beneficiary())
            .isEqualTo(
                ThbExternalAccountInfo.Beneficiary.ofIndividual(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            ThbBeneficiary.Address.builder()
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
        val thbExternalAccountInfo =
            ThbExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            ThbBeneficiary.Address.builder()
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

        val roundtrippedThbExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbExternalAccountInfo),
                jacksonTypeRef<ThbExternalAccountInfo>(),
            )

        assertThat(roundtrippedThbExternalAccountInfo).isEqualTo(thbExternalAccountInfo)
    }
}
