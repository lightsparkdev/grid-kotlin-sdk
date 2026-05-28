// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .createCustomerRequest(
                CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest.builder()
                    .customerType(JsonValue.from("INDIVIDUAL"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .platformCustomerId("ind-9f84e0c2")
                    .region("US")
                    .umaAddress("\$john.doe@uma.domain.com")
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
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
                    CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .addCurrency("USD")
                        .addCurrency("USDC")
                        .email("john.doe@example.com")
                        .platformCustomerId("ind-9f84e0c2")
                        .region("US")
                        .umaAddress("\$john.doe@uma.domain.com")
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateParams.CreateCustomerRequest.ofIndividualCustomerCreate(
                    CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .addCurrency("USD")
                        .addCurrency("USDC")
                        .email("john.doe@example.com")
                        .platformCustomerId("ind-9f84e0c2")
                        .region("US")
                        .umaAddress("\$john.doe@uma.domain.com")
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
                    CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateParams.CreateCustomerRequest.ofIndividualCustomerCreate(
                    CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .build()
                )
            )
    }
}
