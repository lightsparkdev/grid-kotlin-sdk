// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.externalaccounts

import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountAddParamsTest {

    @Test
    fun create() {
        ExternalAccountAddParams.builder()
            .externalAccountCreate(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        UsdExternalAccountCreateInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                            .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
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
                            .bankName("Chase Bank")
                            .fiToFiInformation("/BNF/Invoice 4471")
                            .intermediaryBankName("JPMorgan Chase Bank")
                            .intermediaryRoutingNumber("021000021")
                            .build()
                    )
                    .currency("USD")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .ownershipType(ExternalAccountCreate.OwnershipType.FIRST_PARTY)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountAddParams.builder()
                .externalAccountCreate(
                    ExternalAccountCreate.builder()
                        .accountInfo(
                            UsdExternalAccountCreateInfo.builder()
                                .accountNumber("12345678901")
                                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                                .bankAccountType(
                                    UsdExternalAccountCreateInfo.BankAccountType.CHECKING
                                )
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
                                .bankName("Chase Bank")
                                .fiToFiInformation("/BNF/Invoice 4471")
                                .intermediaryBankName("JPMorgan Chase Bank")
                                .intermediaryRoutingNumber("021000021")
                                .build()
                        )
                        .currency("USD")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .defaultUmaDepositAccount(true)
                        .ownershipType(ExternalAccountCreate.OwnershipType.FIRST_PARTY)
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
                            .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
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
                            .bankName("Chase Bank")
                            .fiToFiInformation("/BNF/Invoice 4471")
                            .intermediaryBankName("JPMorgan Chase Bank")
                            .intermediaryRoutingNumber("021000021")
                            .build()
                    )
                    .currency("USD")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .ownershipType(ExternalAccountCreate.OwnershipType.FIRST_PARTY)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountAddParams.builder()
                .externalAccountCreate(
                    ExternalAccountCreate.builder()
                        .accountInfo(
                            UsdExternalAccountCreateInfo.builder()
                                .accountNumber("12345678901")
                                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                                .bankAccountType(
                                    UsdExternalAccountCreateInfo.BankAccountType.CHECKING
                                )
                                .individualBeneficiary("John Doe")
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
                            .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
                            .individualBeneficiary("John Doe")
                            .routingNumber("123456789")
                            .build()
                    )
                    .currency("USD")
                    .build()
            )
    }
}
