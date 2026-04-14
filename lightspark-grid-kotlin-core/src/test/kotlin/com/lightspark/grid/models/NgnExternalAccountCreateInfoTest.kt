// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NgnExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val ngnExternalAccountCreateInfo =
            NgnExternalAccountCreateInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnExternalAccountCreateInfo.AccountType.NGN_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        assertThat(ngnExternalAccountCreateInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(ngnExternalAccountCreateInfo.accountType())
            .isEqualTo(NgnExternalAccountCreateInfo.AccountType.NGN_ACCOUNT)
        assertThat(ngnExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(ngnExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                NgnExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ngnExternalAccountCreateInfo =
            NgnExternalAccountCreateInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnExternalAccountCreateInfo.AccountType.NGN_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val roundtrippedNgnExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ngnExternalAccountCreateInfo),
                jacksonTypeRef<NgnExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedNgnExternalAccountCreateInfo).isEqualTo(ngnExternalAccountCreateInfo)
    }
}
