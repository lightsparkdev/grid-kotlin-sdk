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
                CustomerCreateParams.CreateCustomerRequest.Individual.builder()
                    .platformCustomerId("ind-9f84e0c2")
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
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
                    CustomerCreateParams.CreateCustomerRequest.Individual.builder()
                        .platformCustomerId("ind-9f84e0c2")
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateParams.CreateCustomerRequest.ofIndividual(
                    CustomerCreateParams.CreateCustomerRequest.Individual.builder()
                        .platformCustomerId("ind-9f84e0c2")
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreateParams.builder().individualCreateCustomerRequest("ind-9f84e0c2").build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateParams.CreateCustomerRequest.ofIndividual(
                    CustomerCreateParams.CreateCustomerRequest.Individual.builder()
                        .platformCustomerId("ind-9f84e0c2")
                        .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
                        .build()
                )
            )
    }
}
