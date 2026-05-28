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
                .accountNumber("x")
                .accountType(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .iban("EG380019000500000000263180002")
                .swiftCode("NBEGEGCX")
                .build()

        assertThat(egpExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(egpExternalAccountCreateInfo.accountType())
            .isEqualTo(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
        assertThat(egpExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(egpExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                EgpExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
            )
        assertThat(egpExternalAccountCreateInfo.iban()).isEqualTo("EG380019000500000000263180002")
        assertThat(egpExternalAccountCreateInfo.swiftCode()).isEqualTo("NBEGEGCX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpExternalAccountCreateInfo =
            EgpExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .iban("EG380019000500000000263180002")
                .swiftCode("NBEGEGCX")
                .build()

        val roundtrippedEgpExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpExternalAccountCreateInfo),
                jacksonTypeRef<EgpExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedEgpExternalAccountCreateInfo).isEqualTo(egpExternalAccountCreateInfo)
    }
}
