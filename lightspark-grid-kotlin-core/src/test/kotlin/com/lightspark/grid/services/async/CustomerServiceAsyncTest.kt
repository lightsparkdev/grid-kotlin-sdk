// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.customers.CustomerCreateParams
import com.lightspark.grid.models.customers.CustomerGetKycLinkParams
import com.lightspark.grid.models.customers.CustomerUpdateParams
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
                .build()
        val customerServiceAsync = client.customers()

        val customerOneOf =
            customerServiceAsync.create(
                CustomerCreateParams.CreateCustomerRequest.Individual.builder()
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .customerType(
                        CustomerCreateParams.CreateCustomerRequest.Individual.CustomerType
                            .INDIVIDUAL
                    )
                    .address(
                        CustomerCreateParams.CreateCustomerRequest.Individual.Address.builder()
                            .country("US")
                            .line1("123 Main Street")
                            .postalCode("94105")
                            .city("San Francisco")
                            .line2("Apt 4B")
                            .state("CA")
                            .build()
                    )
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .fullName("John Michael Doe")
                    .nationality("US")
                    .build()
            )

        customerOneOf.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
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
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .customerId("customerId")
                    .updateCustomerRequest(
                        CustomerUpdateParams.UpdateCustomerRequest.Individual.builder()
                            .umaAddress("\$john.doe@uma.domain.com")
                            .customerType(
                                CustomerUpdateParams.UpdateCustomerRequest.Individual.CustomerType
                                    .INDIVIDUAL
                            )
                            .address(
                                CustomerUpdateParams.UpdateCustomerRequest.Individual.Address
                                    .builder()
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
                            .nationality("US")
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
                .build()
        val customerServiceAsync = client.customers()

        val customer = customerServiceAsync.delete("customerId")

        customer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getKycLink() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerServiceAsync = client.customers()

        val response =
            customerServiceAsync.getKycLink(
                CustomerGetKycLinkParams.builder()
                    .platformCustomerId("platformCustomerId")
                    .redirectUri("redirectUri")
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
                .build()
        val customerServiceAsync = client.customers()

        val page = customerServiceAsync.listInternalAccounts()

        page.response().validate()
    }
}
