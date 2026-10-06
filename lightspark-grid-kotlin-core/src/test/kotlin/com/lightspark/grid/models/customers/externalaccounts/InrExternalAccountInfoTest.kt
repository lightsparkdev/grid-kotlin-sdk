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
                        .build()
                )
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .accountNumber("000111222333")
                .ifsc("HDFC0001234")
                .rail("NEFT")
                .vpa("user@upi")
                .build()

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
                        .build()
                )
            )
        assertThat(inrExternalAccountInfo.accountType())
            .isEqualTo(InrAccountInfo.AccountType.INR_ACCOUNT)
        assertThat(inrExternalAccountInfo.paymentRails())
            .containsExactly(InrAccountInfo.PaymentRail.UPI)
        assertThat(inrExternalAccountInfo.accountNumber()).isEqualTo("000111222333")
        assertThat(inrExternalAccountInfo.ifsc()).isEqualTo("HDFC0001234")
        assertThat(inrExternalAccountInfo.rail()).isEqualTo("NEFT")
        assertThat(inrExternalAccountInfo.vpa()).isEqualTo("user@upi")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
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
                        .build()
                )
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .accountNumber("000111222333")
                .ifsc("HDFC0001234")
                .rail("NEFT")
                .vpa("user@upi")
                .build()

        val roundtrippedInrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrExternalAccountInfo),
                jacksonTypeRef<InrExternalAccountInfo>(),
            )

        assertThat(roundtrippedInrExternalAccountInfo).isEqualTo(inrExternalAccountInfo)
    }
}
