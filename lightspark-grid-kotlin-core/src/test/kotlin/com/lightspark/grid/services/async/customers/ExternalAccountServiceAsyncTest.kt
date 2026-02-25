// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.customers

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BrlBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.BrlExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
                ExternalAccountCreate.builder()
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
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )

        externalAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val page = externalAccountServiceAsync.list()

        page.response().validate()
    }
}
