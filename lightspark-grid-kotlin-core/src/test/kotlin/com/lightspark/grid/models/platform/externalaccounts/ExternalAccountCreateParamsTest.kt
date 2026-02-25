// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BrlBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.BrlExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .accountInfo(
                BrlExternalAccountInfo.builder()
                    .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                    .beneficiary(
                        BrlBeneficiary.builder()
                            .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("John Doe")
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
                            .birthDate("1990-01-15")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("US")
                            .phoneNumber("phoneNumber")
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(BrlExternalAccountInfo.Country.BR)
                    .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
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
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .beneficiary(
                            BrlBeneficiary.builder()
                                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                .fullName("John Doe")
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
                                .birthDate("1990-01-15")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("US")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addCountry(BrlExternalAccountInfo.Country.BR)
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
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
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .beneficiary(
                            BrlBeneficiary.builder()
                                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                .fullName("John Doe")
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
                                .birthDate("1990-01-15")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("US")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addCountry(BrlExternalAccountInfo.Country.BR)
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
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
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .individualBeneficiary("John Doe")
                        .addCountry(BrlExternalAccountInfo.Country.BR)
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
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
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .individualBeneficiary("John Doe")
                        .addCountry(BrlExternalAccountInfo.Country.BR)
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
            )
        assertThat(body.currency()).isEqualTo("USD")
    }
}
