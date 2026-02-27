// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkExternalAccountInfoTest {

    @Test
    fun create() {
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .accountType(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .iban("iban")
                .addPaymentRail(DkkExternalAccountInfo.PaymentRail.SEPA)
                .swiftBic("swiftBic")
                .build()

        assertThat(dkkExternalAccountInfo.accountType())
            .isEqualTo(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
        assertThat(dkkExternalAccountInfo.beneficiary())
            .isEqualTo(
                DkkExternalAccountInfo.Beneficiary.ofIndividual(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(dkkExternalAccountInfo.iban()).isEqualTo("iban")
        assertThat(dkkExternalAccountInfo.paymentRails())
            .containsExactly(DkkExternalAccountInfo.PaymentRail.SEPA)
        assertThat(dkkExternalAccountInfo.swiftBic()).isEqualTo("swiftBic")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .accountType(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .iban("iban")
                .addPaymentRail(DkkExternalAccountInfo.PaymentRail.SEPA)
                .swiftBic("swiftBic")
                .build()

        val roundtrippedDkkExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkExternalAccountInfo),
                jacksonTypeRef<DkkExternalAccountInfo>(),
            )

        assertThat(roundtrippedDkkExternalAccountInfo).isEqualTo(dkkExternalAccountInfo)
    }
}
