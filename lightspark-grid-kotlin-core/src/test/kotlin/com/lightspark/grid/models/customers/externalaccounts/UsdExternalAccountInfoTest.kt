// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdExternalAccountInfoTest {

    @Test
    fun create() {
        val usdExternalAccountInfo =
            UsdExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
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
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(UsdExternalAccountInfo.PaymentRail.ACH)
                .routingNumber("routingNumber")
                .build()

        assertThat(usdExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(usdExternalAccountInfo.accountType())
            .isEqualTo(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
        assertThat(usdExternalAccountInfo.beneficiary())
            .isEqualTo(
                UsdExternalAccountInfo.Beneficiary.ofIndividual(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
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
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(usdExternalAccountInfo.paymentRails())
            .containsExactly(UsdExternalAccountInfo.PaymentRail.ACH)
        assertThat(usdExternalAccountInfo.routingNumber()).isEqualTo("routingNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdExternalAccountInfo =
            UsdExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
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
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(UsdExternalAccountInfo.PaymentRail.ACH)
                .routingNumber("routingNumber")
                .build()

        val roundtrippedUsdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdExternalAccountInfo),
                jacksonTypeRef<UsdExternalAccountInfo>(),
            )

        assertThat(roundtrippedUsdExternalAccountInfo).isEqualTo(usdExternalAccountInfo)
    }
}
