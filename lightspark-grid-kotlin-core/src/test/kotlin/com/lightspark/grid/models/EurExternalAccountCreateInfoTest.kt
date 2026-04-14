// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EurExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val eurExternalAccountCreateInfo =
            EurExternalAccountCreateInfo.builder()
                .accountType(EurExternalAccountCreateInfo.AccountType.EUR_ACCOUNT)
                .beneficiary(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .iban("DE89370400440532013000")
                .swiftCode("DEUTDEFF")
                .build()

        assertThat(eurExternalAccountCreateInfo.accountType())
            .isEqualTo(EurExternalAccountCreateInfo.AccountType.EUR_ACCOUNT)
        assertThat(eurExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                EurExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(eurExternalAccountCreateInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(eurExternalAccountCreateInfo.swiftCode()).isEqualTo("DEUTDEFF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eurExternalAccountCreateInfo =
            EurExternalAccountCreateInfo.builder()
                .accountType(EurExternalAccountCreateInfo.AccountType.EUR_ACCOUNT)
                .beneficiary(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .iban("DE89370400440532013000")
                .swiftCode("DEUTDEFF")
                .build()

        val roundtrippedEurExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eurExternalAccountCreateInfo),
                jacksonTypeRef<EurExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedEurExternalAccountCreateInfo).isEqualTo(eurExternalAccountCreateInfo)
    }
}
