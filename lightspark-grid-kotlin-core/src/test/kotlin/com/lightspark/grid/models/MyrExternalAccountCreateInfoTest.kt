// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.MyrBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val myrExternalAccountCreateInfo =
            MyrExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrExternalAccountCreateInfo.AccountType.MYR_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .swiftCode("MABORUMMYYY")
                .build()

        assertThat(myrExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(myrExternalAccountCreateInfo.accountType())
            .isEqualTo(MyrExternalAccountCreateInfo.AccountType.MYR_ACCOUNT)
        assertThat(myrExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(myrExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                MyrExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(myrExternalAccountCreateInfo.swiftCode()).isEqualTo("MABORUMMYYY")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrExternalAccountCreateInfo =
            MyrExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrExternalAccountCreateInfo.AccountType.MYR_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .swiftCode("MABORUMMYYY")
                .build()

        val roundtrippedMyrExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrExternalAccountCreateInfo),
                jacksonTypeRef<MyrExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedMyrExternalAccountCreateInfo).isEqualTo(myrExternalAccountCreateInfo)
    }
}
