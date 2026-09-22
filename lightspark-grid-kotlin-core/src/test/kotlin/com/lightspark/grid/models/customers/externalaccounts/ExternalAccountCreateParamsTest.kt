// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .accountInfo(
                UsdExternalAccountCreateInfo.builder()
                    .accountNumber("12345678901")
                    .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
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
                    .routingNumber("123456789")
                    .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
                    .bankName("Chase Bank")
                    .fiToFiInformation("/BNF/Invoice 4471")
                    .intermediaryBankName("JPMorgan Chase Bank")
                    .intermediaryRoutingNumber("021000021")
                    .build()
            )
            .currency("USD")
            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
            .defaultUmaDepositAccount(true)
            .ownershipType(ExternalAccountCreateParams.OwnershipType.FIRST_PARTY)
            .platformAccountId("ext_acc_123456")
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountInfo(
                    UsdExternalAccountCreateInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
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
                        .routingNumber("123456789")
                        .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
                        .bankName("Chase Bank")
                        .fiToFiInformation("/BNF/Invoice 4471")
                        .intermediaryBankName("JPMorgan Chase Bank")
                        .intermediaryRoutingNumber("021000021")
                        .build()
                )
                .currency("USD")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .defaultUmaDepositAccount(true)
                .ownershipType(ExternalAccountCreateParams.OwnershipType.FIRST_PARTY)
                .platformAccountId("ext_acc_123456")
                .build()

        val body = params._body()

        assertThat(body.accountInfo())
            .isEqualTo(
                ExternalAccountCreateParams.AccountInfo.ofUsdAccount(
                    UsdExternalAccountCreateInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
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
                        .routingNumber("123456789")
                        .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
                        .bankName("Chase Bank")
                        .fiToFiInformation("/BNF/Invoice 4471")
                        .intermediaryBankName("JPMorgan Chase Bank")
                        .intermediaryRoutingNumber("021000021")
                        .build()
                )
            )
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.customerId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.defaultUmaDepositAccount()).isEqualTo(true)
        assertThat(body.ownershipType())
            .isEqualTo(ExternalAccountCreateParams.OwnershipType.FIRST_PARTY)
        assertThat(body.platformAccountId()).isEqualTo("ext_acc_123456")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountInfo(
                    UsdExternalAccountCreateInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                        .individualBeneficiary("John Doe")
                        .routingNumber("123456789")
                        .build()
                )
                .currency("USD")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        val body = params._body()

        assertThat(body.accountInfo())
            .isEqualTo(
                ExternalAccountCreateParams.AccountInfo.ofUsdAccount(
                    UsdExternalAccountCreateInfo.builder()
                        .accountNumber("12345678901")
                        .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                        .individualBeneficiary("John Doe")
                        .routingNumber("123456789")
                        .build()
                )
            )
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.customerId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
    }
}
