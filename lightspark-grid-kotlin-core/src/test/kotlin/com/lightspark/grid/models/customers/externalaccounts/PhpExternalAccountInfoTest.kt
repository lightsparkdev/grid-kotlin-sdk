// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpExternalAccountInfoTest {

    @Test
    fun create() {
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            PhpBeneficiary.Address.builder()
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

        assertThat(phpExternalAccountInfo.accountNumber()).isEqualTo("001234567890")
        assertThat(phpExternalAccountInfo.accountType())
            .isEqualTo(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
        assertThat(phpExternalAccountInfo.bankName()).isEqualTo("BDO Unibank")
        assertThat(phpExternalAccountInfo.beneficiary())
            .isEqualTo(
                PhpExternalAccountInfo.Beneficiary.ofIndividual(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            PhpBeneficiary.Address.builder()
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
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            PhpBeneficiary.Address.builder()
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

        val roundtrippedPhpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpExternalAccountInfo),
                jacksonTypeRef<PhpExternalAccountInfo>(),
            )

        assertThat(roundtrippedPhpExternalAccountInfo).isEqualTo(phpExternalAccountInfo)
    }
}
