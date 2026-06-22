// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.SgdBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val sgdExternalAccountCreateInfo =
            SgdExternalAccountCreateInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountCreateInfo.AccountType.SGD_ACCOUNT)
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("DBSSSGSG")
                .bankName("DBS Bank Ltd")
                .build()

        assertThat(sgdExternalAccountCreateInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(sgdExternalAccountCreateInfo.accountType())
            .isEqualTo(SgdExternalAccountCreateInfo.AccountType.SGD_ACCOUNT)
        assertThat(sgdExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                SgdExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(sgdExternalAccountCreateInfo.swiftCode()).isEqualTo("DBSSSGSG")
        assertThat(sgdExternalAccountCreateInfo.bankName()).isEqualTo("DBS Bank Ltd")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdExternalAccountCreateInfo =
            SgdExternalAccountCreateInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountCreateInfo.AccountType.SGD_ACCOUNT)
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("DBSSSGSG")
                .bankName("DBS Bank Ltd")
                .build()

        val roundtrippedSgdExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdExternalAccountCreateInfo),
                jacksonTypeRef<SgdExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedSgdExternalAccountCreateInfo).isEqualTo(sgdExternalAccountCreateInfo)
    }
}
