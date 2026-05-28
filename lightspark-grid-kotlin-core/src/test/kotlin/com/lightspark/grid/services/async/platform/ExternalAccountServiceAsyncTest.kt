// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.platform

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.platform.externalaccounts.PlatformExternalAccountCreateRequest
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
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.platform().externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
                PlatformExternalAccountCreateRequest.builder()
                    .accountInfo(
                        AedExternalAccountCreateInfo.builder()
                            .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                            .beneficiary(
                                AedBeneficiary.builder()
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
                                    .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("fullName")
                                    .birthDate("birthDate")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .nationality("nationality")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .iban("AE070331234567890123456")
                            .swiftCode("EBILAEAD")
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
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
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
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.platform().externalAccounts()

        val page = externalAccountServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.platform().externalAccounts()

        externalAccountServiceAsync.delete("externalAccountId")
    }
}
