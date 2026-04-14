// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TzsExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val tzsExternalAccountCreateInfo =
            TzsExternalAccountCreateInfo.builder()
                .accountType(TzsExternalAccountCreateInfo.AccountType.TZS_ACCOUNT)
                .beneficiary(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+255712345678")
                .provider("x")
                .build()

        assertThat(tzsExternalAccountCreateInfo.accountType())
            .isEqualTo(TzsExternalAccountCreateInfo.AccountType.TZS_ACCOUNT)
        assertThat(tzsExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                TzsExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(tzsExternalAccountCreateInfo.phoneNumber()).isEqualTo("+255712345678")
        assertThat(tzsExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tzsExternalAccountCreateInfo =
            TzsExternalAccountCreateInfo.builder()
                .accountType(TzsExternalAccountCreateInfo.AccountType.TZS_ACCOUNT)
                .beneficiary(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+255712345678")
                .provider("x")
                .build()

        val roundtrippedTzsExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tzsExternalAccountCreateInfo),
                jacksonTypeRef<TzsExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedTzsExternalAccountCreateInfo).isEqualTo(tzsExternalAccountCreateInfo)
    }
}
