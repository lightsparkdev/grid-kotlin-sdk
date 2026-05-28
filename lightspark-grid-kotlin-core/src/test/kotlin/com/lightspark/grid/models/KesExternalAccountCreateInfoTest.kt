// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KesExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val kesExternalAccountCreateInfo =
            KesExternalAccountCreateInfo.builder()
                .accountType(KesExternalAccountCreateInfo.AccountType.KES_ACCOUNT)
                .beneficiary(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+254712345678")
                .provider("x")
                .build()

        assertThat(kesExternalAccountCreateInfo.accountType())
            .isEqualTo(KesExternalAccountCreateInfo.AccountType.KES_ACCOUNT)
        assertThat(kesExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                KesExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(kesExternalAccountCreateInfo.phoneNumber()).isEqualTo("+254712345678")
        assertThat(kesExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kesExternalAccountCreateInfo =
            KesExternalAccountCreateInfo.builder()
                .accountType(KesExternalAccountCreateInfo.AccountType.KES_ACCOUNT)
                .beneficiary(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+254712345678")
                .provider("x")
                .build()

        val roundtrippedKesExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kesExternalAccountCreateInfo),
                jacksonTypeRef<KesExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedKesExternalAccountCreateInfo).isEqualTo(kesExternalAccountCreateInfo)
    }
}
