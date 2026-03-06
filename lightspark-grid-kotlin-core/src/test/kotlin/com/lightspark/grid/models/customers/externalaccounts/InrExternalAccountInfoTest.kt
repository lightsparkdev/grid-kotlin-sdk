// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.InrAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrExternalAccountInfoTest {

    @Test
    fun create() {
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .vpa("vpa")
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        assertThat(inrExternalAccountInfo.accountType())
            .isEqualTo(InrAccountInfo.AccountType.INR_ACCOUNT)
        assertThat(inrExternalAccountInfo.paymentRails())
            .containsExactly(InrAccountInfo.PaymentRail.UPI)
        assertThat(inrExternalAccountInfo.vpa()).isEqualTo("vpa")
        assertThat(inrExternalAccountInfo.beneficiary())
            .isEqualTo(
                InrExternalAccountInfo.Beneficiary.ofIndividual(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .vpa("vpa")
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val roundtrippedInrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrExternalAccountInfo),
                jacksonTypeRef<InrExternalAccountInfo>(),
            )

        assertThat(roundtrippedInrExternalAccountInfo).isEqualTo(inrExternalAccountInfo)
    }
}
