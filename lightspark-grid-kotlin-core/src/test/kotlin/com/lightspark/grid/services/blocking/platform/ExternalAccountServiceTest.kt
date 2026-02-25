// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.platform

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountListParams
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
        val externalAccountService = client.platform().externalAccounts()

        val externalAccount =
            externalAccountService.create(
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
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountService = client.platform().externalAccounts()

        val externalAccounts =
            externalAccountService.list(
                ExternalAccountListParams.builder().currency("currency").build()
            )

        externalAccounts.validate()
    }
}
