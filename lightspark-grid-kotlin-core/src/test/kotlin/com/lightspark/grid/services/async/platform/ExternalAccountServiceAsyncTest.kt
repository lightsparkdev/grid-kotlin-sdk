// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.platform

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.UsdExternalAccountInfo
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
                        UsdExternalAccountInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
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
                            .addCountry(UsdExternalAccountInfo.Country.US)
                            .addPaymentRail(UsdExternalAccountInfo.PaymentRail.ACH)
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
}
