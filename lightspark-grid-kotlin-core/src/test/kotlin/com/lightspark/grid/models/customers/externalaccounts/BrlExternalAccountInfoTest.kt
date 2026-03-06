// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.BrlAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlExternalAccountInfoTest {

    @Test
    fun create() {
        val brlExternalAccountInfo =
            BrlExternalAccountInfo.builder()
                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(brlExternalAccountInfo.accountType())
            .isEqualTo(BrlAccountInfo.AccountType.BRL_ACCOUNT)
        assertThat(brlExternalAccountInfo.paymentRails())
            .containsExactly(BrlAccountInfo.PaymentRail.PIX)
        assertThat(brlExternalAccountInfo.pixKey()).isEqualTo("pixKey")
        assertThat(brlExternalAccountInfo.pixKeyType()).isEqualTo("pixKeyType")
        assertThat(brlExternalAccountInfo.taxId()).isEqualTo("taxId")
        assertThat(brlExternalAccountInfo.beneficiary())
            .isEqualTo(
                BrlExternalAccountInfo.Beneficiary.ofIndividual(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val brlExternalAccountInfo =
            BrlExternalAccountInfo.builder()
                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBrlExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlExternalAccountInfo),
                jacksonTypeRef<BrlExternalAccountInfo>(),
            )

        assertThat(roundtrippedBrlExternalAccountInfo).isEqualTo(brlExternalAccountInfo)
    }
}
