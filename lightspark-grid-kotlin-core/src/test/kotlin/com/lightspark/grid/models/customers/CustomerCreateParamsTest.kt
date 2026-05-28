// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .createCustomerRequest(
                IndividualCustomerCreateRequest.builder()
                    .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
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
                    .fullName("John Michael Doe")
                    .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                    .nationality("US")
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .region("US")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
                    IndividualCustomerCreateRequest.builder()
                        .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
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
                        .fullName("John Michael Doe")
                        .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                        .nationality("US")
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .region("US")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateRequestOneOf.ofIndividual(
                    IndividualCustomerCreateRequest.builder()
                        .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
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
                        .fullName("John Michael Doe")
                        .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                        .nationality("US")
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .region("US")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
                    IndividualCustomerCreateRequest.builder()
                        .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateRequestOneOf.ofIndividual(
                    IndividualCustomerCreateRequest.builder()
                        .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
            )
    }
}
