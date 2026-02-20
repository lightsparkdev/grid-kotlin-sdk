// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.customers.CustomerCreateParams
import com.lightspark.grid.models.customers.CustomerGetKycLinkParams
import com.lightspark.grid.models.customers.CustomerUpdateParams
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
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val customer = customerService.retrieve("customerId")

        customer.validate()
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

        val customer =
            customerService.update(
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

        val customer = customerService.delete("customerId")

        customer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getKycLink() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val customerService = client.customers()

        val response =
            customerService.getKycLink(
                CustomerGetKycLinkParams.builder()
                    .platformCustomerId("platformCustomerId")
                    .redirectUri("redirectUri")
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
}
