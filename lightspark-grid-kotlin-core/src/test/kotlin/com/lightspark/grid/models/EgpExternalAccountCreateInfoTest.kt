// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EgpExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val egpExternalAccountCreateInfo =
            EgpExternalAccountCreateInfo.builder()
                .accountType(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
                .beneficiary(
                    EgpBeneficiary.builder()
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .iban("EG380019000500000000263180002")
                .phoneNumber("+1234567890")
                .build()

        assertThat(egpExternalAccountCreateInfo.accountType())
            .isEqualTo(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
        assertThat(egpExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                EgpExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    EgpBeneficiary.builder()
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(egpExternalAccountCreateInfo.iban()).isEqualTo("EG380019000500000000263180002")
        assertThat(egpExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpExternalAccountCreateInfo =
            EgpExternalAccountCreateInfo.builder()
                .accountType(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
                .beneficiary(
                    EgpBeneficiary.builder()
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .iban("EG380019000500000000263180002")
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedEgpExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpExternalAccountCreateInfo),
                jacksonTypeRef<EgpExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedEgpExternalAccountCreateInfo).isEqualTo(egpExternalAccountCreateInfo)
    }
}
