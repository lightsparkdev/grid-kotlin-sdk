// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.platform

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
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
                        ExternalAccountInfoOneOf.BrlAccount.builder()
                            .beneficiary(
                                ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.builder()
                                    .fullName("John Doe")
                                    .address(
                                        ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual
                                            .Address
                                            .builder()
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
                            .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                            .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                            .pixKey("pixKey")
                            .pixKeyType("pixKeyType")
                            .taxId("taxId")
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
