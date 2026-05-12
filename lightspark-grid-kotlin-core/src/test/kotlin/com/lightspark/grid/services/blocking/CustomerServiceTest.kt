// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.customers.CustomerCreateParams
import com.lightspark.grid.models.customers.CustomerExportParams
import com.lightspark.grid.models.customers.CustomerGenerateKycLinkParams
import com.lightspark.grid.models.customers.CustomerUpdateInternalAccountParams
import com.lightspark.grid.models.customers.CustomerUpdateParams
import com.lightspark.grid.models.customers.IndividualCustomerFields
import com.lightspark.grid.models.customers.InternalAccountExportRequest
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val customerOneOf =
            customerService.create(
                CustomerCreateParams.CreateCustomerRequest.Individual.builder()
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .platformCustomerId("ind-9f84e0c2")
                    .region("US")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
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
                    .fullName("Jane Smith")
                    .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                    .nationality("US")
                    .build()
            )

        customerOneOf.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val customerOneOf = customerService.retrieve("customerId")

        customerOneOf.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val customerOneOf =
            customerService.update(
                CustomerUpdateParams.builder()
                    .customerId("customerId")
                    .updateCustomerRequest(
                        CustomerUpdateParams.UpdateCustomerRequest.Individual.builder()
                            .currencies(listOf("USD", "EUR", "USDC"))
                            .email("john.doe@example.com")
                            .umaAddress("\$john.doe@uma.domain.com")
                            .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
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
                            .fullName("John Smith")
                            .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                            .nationality("US")
                            .build()
                    )
                    .build()
            )

        customerOneOf.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val page = customerService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val customerOneOf = customerService.delete("customerId")

        customerOneOf.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun export() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val internalAccountExportResponse =
            customerService.export(
                CustomerExportParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .internalAccountExportRequest(
                        InternalAccountExportRequest.builder()
                            .clientPublicKey(
                                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                            )
                            .build()
                    )
                    .build()
            )

        internalAccountExportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateKycLink() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val response =
            customerService.generateKycLink(
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
    fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val page = customerService.listInternalAccounts()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateInternalAccount() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val internalAccount =
            customerService.updateInternalAccount(
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
