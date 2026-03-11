// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.customers

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.UsdExternalAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalAccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountService = client.customers().externalAccounts()

        val externalAccount =
            externalAccountService.create(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        UsdExternalAccountInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                            .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                            .routingNumber("123456789")
                            .beneficiary(
                                UsdBeneficiary.builder()
                                    .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .birthDate("1990-01-15")
                                    .fullName("John Doe")
                                    .nationality("US")
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
                            .build()
                    )
                    .currency("USD")
                    .cryptoNetwork("SOLANA_MAINNET")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )

        externalAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountService = client.customers().externalAccounts()

        val page = externalAccountService.list()

        page.response().validate()
    }
}
