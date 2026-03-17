// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.GbpAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpExternalAccountInfoTest {

    @Test
    fun create() {
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
                .addPaymentRail(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("123456")
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
                .build()

        assertThat(gbpExternalAccountInfo.accountNumber()).isEqualTo("12345678")
        assertThat(gbpExternalAccountInfo.accountType())
            .isEqualTo(GbpAccountInfo.AccountType.GBP_ACCOUNT)
        assertThat(gbpExternalAccountInfo.paymentRails())
            .containsExactly(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
        assertThat(gbpExternalAccountInfo.sortCode()).isEqualTo("123456")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
                .addPaymentRail(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("123456")
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
                .build()

        val roundtrippedGbpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpExternalAccountInfo),
                jacksonTypeRef<GbpExternalAccountInfo>(),
            )

        assertThat(roundtrippedGbpExternalAccountInfo).isEqualTo(gbpExternalAccountInfo)
    }
}
