// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.customers.externalaccounts.BrlBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.BrlExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .externalAccountCreate(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        BrlExternalAccountInfo.builder()
                            .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                            .beneficiary(
                                BrlBeneficiary.builder()
                                    .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("John Doe")
                                    .address(
                                        BrlBeneficiary.Address.builder()
                                            .country("US")
                                            .line1("123 Main Street")
                                            .postalCode("94105")
                                            .city("San Francisco")
                                            .line2("line2")
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
                            .pixKey("pixKey")
                            .pixKeyType("pixKeyType")
                            .taxId("taxId")
                            .build()
                    )
                    .currency("USD")
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
                            BrlExternalAccountInfo.builder()
                                .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                                .beneficiary(
                                    BrlBeneficiary.builder()
                                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("John Doe")
                                        .address(
                                            BrlBeneficiary.Address.builder()
                                                .country("US")
                                                .line1("123 Main Street")
                                                .postalCode("94105")
                                                .city("San Francisco")
                                                .line2("line2")
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
                                .pixKey("pixKey")
                                .pixKeyType("pixKeyType")
                                .taxId("taxId")
                                .build()
                        )
                        .currency("USD")
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
                        BrlExternalAccountInfo.builder()
                            .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                            .beneficiary(
                                BrlBeneficiary.builder()
                                    .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("John Doe")
                                    .address(
                                        BrlBeneficiary.Address.builder()
                                            .country("US")
                                            .line1("123 Main Street")
                                            .postalCode("94105")
                                            .city("San Francisco")
                                            .line2("line2")
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
                            .pixKey("pixKey")
                            .pixKeyType("pixKeyType")
                            .taxId("taxId")
                            .build()
                    )
                    .currency("USD")
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
                            BrlExternalAccountInfo.builder()
                                .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                                .individualBeneficiary("John Doe")
                                .pixKey("pixKey")
                                .pixKeyType("pixKeyType")
                                .taxId("taxId")
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
                        BrlExternalAccountInfo.builder()
                            .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                            .individualBeneficiary("John Doe")
                            .pixKey("pixKey")
                            .pixKeyType("pixKeyType")
                            .taxId("taxId")
                            .build()
                    )
                    .currency("USD")
                    .build()
            )
    }
}
