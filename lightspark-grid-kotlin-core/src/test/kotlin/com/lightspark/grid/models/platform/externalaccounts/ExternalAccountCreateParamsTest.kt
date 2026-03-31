// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.UsdExternalAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .accountInfo(
                UsdExternalAccountInfo.builder()
                    .accountNumber("12345678901")
                    .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                    .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                    .routingNumber("123456789")
                    .beneficiary(
                        UsdBeneficiary.builder()
                            .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .build()
                    )
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
                    UsdExternalAccountInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("123456789")
                        .beneficiary(
                            UsdBeneficiary.builder()
                                .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                                .build()
                        )
                        .build()
                )
                .currency("USD")
                .platformAccountId("ext_acc_123456")
                .build()

        val body = params._body()

        assertThat(body.accountInfo())
            .isEqualTo(
                ExternalAccountInfoOneOf.ofUsdAccount(
                    UsdExternalAccountInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("123456789")
                        .beneficiary(
                            UsdBeneficiary.builder()
                                .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                                .build()
                        )
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
                    UsdExternalAccountInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("123456789")
                        .individualBeneficiary("John Doe")
                        .build()
                )
                .currency("USD")
                .build()

        val body = params._body()

        assertThat(body.accountInfo())
            .isEqualTo(
                ExternalAccountInfoOneOf.ofUsdAccount(
                    UsdExternalAccountInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("123456789")
                        .individualBeneficiary("John Doe")
                        .build()
                )
            )
        assertThat(body.currency()).isEqualTo("USD")
    }
}
