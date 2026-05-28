// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.customers.CustomerCreateParams
import com.lightspark.grid.models.customers.CustomerExportParams
import com.lightspark.grid.models.customers.CustomerGenerateKycLinkParams
import com.lightspark.grid.models.customers.CustomerUpdateInternalAccountParams
import com.lightspark.grid.models.customers.CustomerUpdateParams
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerServiceAsyncTest {

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
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.create(
                CustomerCreateParams.CreateCustomerRequest.Individual.builder()
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
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .fullName("Jane Smith")
                    .kycStatus(
                        CustomerCreateParams.CreateCustomerRequest.Individual.KycStatus.APPROVED
                    )
                    .nationality("US")
                    .platformCustomerId("ind-9f84e0c2")
                    .region("US")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )

        customer.validate()
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
        val customerServiceAsync = client.customers()

        val customer = customerServiceAsync.retrieve("customerId")

        customer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .customerId("customerId")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                    .updateCustomerRequest(
                        CustomerUpdateParams.UpdateCustomerRequest.Individual.builder()
                            .address(
                                Address.builder()
                                    .country("US")
                                    .line1("456 Market St")
                                    .postalCode("94103")
                                    .city("San Francisco")
                                    .line2("Apt 4B")
                                    .state("CA")
                                    .build()
                            )
                            .birthDate(LocalDate.parse("1985-06-15"))
                            .currencies(listOf("USD", "EUR", "USDC"))
                            .email("john.doe@example.com")
                            .fullName("John Smith")
                            .kycStatus(
                                CustomerUpdateParams.UpdateCustomerRequest.Individual.KycStatus
                                    .APPROVED
                            )
                            .nationality("US")
                            .umaAddress("\$john.doe@uma.domain.com")
                            .build()
                    )
                    .build()
            )

        customer.validate()
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
        val customerServiceAsync = client.customers()

        val page = customerServiceAsync.list()

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
        val customerServiceAsync = client.customers()

        val customer = customerServiceAsync.delete("customerId")

        customer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun export() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val customerServiceAsync = client.customers()

        val response =
            customerServiceAsync.export(
                CustomerExportParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun generateKycLink() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val customerServiceAsync = client.customers()

        val response =
            customerServiceAsync.generateKycLink(
                CustomerGenerateKycLinkParams.builder()
                    .customerId("customerId")
                    .idempotencyKey("<uuid>")
                    .redirectUri("https://app.example.com/onboarding/completed")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val customerServiceAsync = client.customers()

        val page = customerServiceAsync.listInternalAccounts()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateInternalAccount() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val customerServiceAsync = client.customers()

        val internalAccount =
            customerServiceAsync.updateInternalAccount(
                CustomerUpdateInternalAccountParams.builder()
                    .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                    .privateEnabled(true)
                    .build()
            )

        internalAccount.validate()
    }
}
