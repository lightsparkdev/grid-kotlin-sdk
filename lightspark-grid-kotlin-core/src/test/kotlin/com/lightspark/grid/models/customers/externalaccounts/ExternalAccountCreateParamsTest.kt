// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .externalAccountCreate(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        UsdExternalAccountCreateInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                            .beneficiary(
                                UsdBeneficiary.builder()
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
                                    .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .birthDate("1990-01-15")
                                    .fullName("John Doe")
                                    .nationality("US")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .routingNumber("123456789")
                            .build()
                    )
                    .currency("USD")
                    .cryptoNetwork("SOLANA_MAINNET")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .externalAccountCreate(
                    ExternalAccountCreate.builder()
                        .accountInfo(
                            UsdExternalAccountCreateInfo.builder()
                                .accountNumber("12345678901")
                                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                                .beneficiary(
                                    UsdBeneficiary.builder()
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
                                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .birthDate("1990-01-15")
                                        .fullName("John Doe")
                                        .nationality("US")
                                        .countryOfResidence("countryOfResidence")
                                        .email("email")
                                        .phoneNumber("phoneNumber")
                                        .build()
                                )
                                .routingNumber("123456789")
                                .build()
                        )
                        .currency("USD")
                        .cryptoNetwork("SOLANA_MAINNET")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .defaultUmaDepositAccount(true)
                        .platformAccountId("ext_acc_123456")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        UsdExternalAccountCreateInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                            .beneficiary(
                                UsdBeneficiary.builder()
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
                                    .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .birthDate("1990-01-15")
                                    .fullName("John Doe")
                                    .nationality("US")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .routingNumber("123456789")
                            .build()
                    )
                    .currency("USD")
                    .cryptoNetwork("SOLANA_MAINNET")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .externalAccountCreate(
                    ExternalAccountCreate.builder()
                        .accountInfo(
                            UsdExternalAccountCreateInfo.builder()
                                .accountNumber("12345678901")
                                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                                .beneficiary(
                                    UsdBeneficiary.builder()
                                        .address(
                                            Address.builder()
                                                .country("US")
                                                .line1("123 Main Street")
                                                .postalCode("94105")
                                                .build()
                                        )
                                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .birthDate("1990-01-15")
                                        .fullName("John Doe")
                                        .nationality("US")
                                        .build()
                                )
                                .routingNumber("123456789")
                                .build()
                        )
                        .currency("USD")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        UsdExternalAccountCreateInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                            .beneficiary(
                                UsdBeneficiary.builder()
                                    .address(
                                        Address.builder()
                                            .country("US")
                                            .line1("123 Main Street")
                                            .postalCode("94105")
                                            .build()
                                    )
                                    .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .birthDate("1990-01-15")
                                    .fullName("John Doe")
                                    .nationality("US")
                                    .build()
                            )
                            .routingNumber("123456789")
                            .build()
                    )
                    .currency("USD")
                    .build()
            )
    }
}
