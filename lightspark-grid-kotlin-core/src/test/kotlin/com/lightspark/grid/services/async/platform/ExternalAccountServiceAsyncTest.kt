// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.platform

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountListParams
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
        val externalAccountServiceAsync = client.platform().externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
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
                            .build()
                    )
                    .currency("USD")
                    .platformAccountId("ext_acc_123456")
                    .build()
            )

        externalAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountServiceAsync = client.platform().externalAccounts()

        val externalAccount = externalAccountServiceAsync.retrieve("externalAccountId")

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
        val externalAccountServiceAsync = client.platform().externalAccounts()

        val externalAccounts =
            externalAccountServiceAsync.list(
                ExternalAccountListParams.builder().currency("currency").build()
            )

        externalAccounts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountServiceAsync = client.platform().externalAccounts()

        externalAccountServiceAsync.delete("externalAccountId")
    }
}
