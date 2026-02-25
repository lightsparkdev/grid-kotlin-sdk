// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .accountInfo(
                ExternalAccountInfoOneOf.BrlAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.builder()
                            .fullName("John Doe")
                            .address(
                                ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.Address
                                    .builder()
                                    .country("US")
                                    .line1("123 Main Street")
                                    .postalCode("94105")
                                    .city("San Francisco")
                                    .line2("Apt 4B")
                                    .state("CA")
                                    .build()
                            )
                            .birthDate("1990-01-15")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("US")
                            .phoneNumber("phoneNumber")
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                    .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                    .pixKey("pixKey")
                    .pixKeyType("pixKeyType")
                    .taxId("taxId")
                    .build()
            )
            .currency("USD")
            .platformAccountId("ext_acc_123456")
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountInfo(
                    ExternalAccountInfoOneOf.BrlAccount.builder()
                        .beneficiary(
                            ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.builder()
                                .fullName("John Doe")
                                .address(
                                    ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual
                                        .Address
                                        .builder()
                                        .country("US")
                                        .line1("123 Main Street")
                                        .postalCode("94105")
                                        .city("San Francisco")
                                        .line2("Apt 4B")
                                        .state("CA")
                                        .build()
                                )
                                .birthDate("1990-01-15")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("US")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                        .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
                .currency("USD")
                .platformAccountId("ext_acc_123456")
                .build()

        val body = params._body()

        assertThat(body.accountInfo())
            .isEqualTo(
                ExternalAccountInfoOneOf.ofBrlAccount(
                    ExternalAccountInfoOneOf.BrlAccount.builder()
                        .beneficiary(
                            ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.builder()
                                .fullName("John Doe")
                                .address(
                                    ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual
                                        .Address
                                        .builder()
                                        .country("US")
                                        .line1("123 Main Street")
                                        .postalCode("94105")
                                        .city("San Francisco")
                                        .line2("Apt 4B")
                                        .state("CA")
                                        .build()
                                )
                                .birthDate("1990-01-15")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("US")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                        .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
            )
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.platformAccountId()).isEqualTo("ext_acc_123456")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountInfo(
                    ExternalAccountInfoOneOf.BrlAccount.builder()
                        .individualBeneficiary("John Doe")
                        .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                        .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
                .currency("USD")
                .build()

        val body = params._body()

        assertThat(body.accountInfo())
            .isEqualTo(
                ExternalAccountInfoOneOf.ofBrlAccount(
                    ExternalAccountInfoOneOf.BrlAccount.builder()
                        .individualBeneficiary("John Doe")
                        .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                        .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
            )
        assertThat(body.currency()).isEqualTo("USD")
    }
}
