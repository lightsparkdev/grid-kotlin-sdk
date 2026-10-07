// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .platformExternalAccountCreateRequest(
                PlatformExternalAccountCreateRequest.builder()
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
                    .ownershipType(PlatformExternalAccountCreateRequest.OwnershipType.FIRST_PARTY)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .platformExternalAccountCreateRequest(
                    PlatformExternalAccountCreateRequest.builder()
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
                        .ownershipType(
                            PlatformExternalAccountCreateRequest.OwnershipType.FIRST_PARTY
                        )
                        .platformAccountId("ext_acc_123456")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlatformExternalAccountCreateRequest.builder()
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
                    .ownershipType(PlatformExternalAccountCreateRequest.OwnershipType.FIRST_PARTY)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .platformExternalAccountCreateRequest(
                    PlatformExternalAccountCreateRequest.builder()
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
                PlatformExternalAccountCreateRequest.builder()
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
