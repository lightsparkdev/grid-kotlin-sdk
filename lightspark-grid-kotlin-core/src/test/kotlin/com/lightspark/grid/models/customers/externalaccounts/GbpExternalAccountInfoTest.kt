// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpExternalAccountInfoTest {

    @Test
    fun create() {
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(GbpExternalAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("20-00-00")
                .build()

        assertThat(gbpExternalAccountInfo.accountNumber()).isEqualTo("12345678")
        assertThat(gbpExternalAccountInfo.accountType())
            .isEqualTo(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
        assertThat(gbpExternalAccountInfo.beneficiary())
            .isEqualTo(
                GbpExternalAccountInfo.Beneficiary.ofIndividual(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(gbpExternalAccountInfo.paymentRails())
            .containsExactly(GbpExternalAccountInfo.PaymentRail.FASTER_PAYMENTS)
        assertThat(gbpExternalAccountInfo.sortCode()).isEqualTo("20-00-00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(GbpExternalAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("20-00-00")
                .build()

        val roundtrippedGbpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpExternalAccountInfo),
                jacksonTypeRef<GbpExternalAccountInfo>(),
            )

        assertThat(roundtrippedGbpExternalAccountInfo).isEqualTo(gbpExternalAccountInfo)
    }
}
