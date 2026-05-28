// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerCreateRequestTest {

    @Test
    fun create() {
        val individualCustomerCreateRequest =
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
                .kycStatus(KycStatus.APPROVED)
                .nationality("US")
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(individualCustomerCreateRequest.customerType())
            .isEqualTo(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
        assertThat(individualCustomerCreateRequest.address())
            .isEqualTo(
                Address.builder()
                    .country("US")
                    .line1("123 Main Street")
                    .postalCode("94105")
                    .city("San Francisco")
                    .line2("Apt 4B")
                    .state("CA")
                    .build()
            )
        assertThat(individualCustomerCreateRequest.birthDate())
            .isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomerCreateRequest.currencies()).containsExactly("USD", "USDC")
        assertThat(individualCustomerCreateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(individualCustomerCreateRequest.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomerCreateRequest.kycStatus()).isEqualTo(KycStatus.APPROVED)
        assertThat(individualCustomerCreateRequest.nationality()).isEqualTo("US")
        assertThat(individualCustomerCreateRequest.platformCustomerId())
            .isEqualTo("9f84e0c2a72c4fa")
        assertThat(individualCustomerCreateRequest.region()).isEqualTo("US")
        assertThat(individualCustomerCreateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomerCreateRequest =
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
                .kycStatus(KycStatus.APPROVED)
                .nationality("US")
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedIndividualCustomerCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomerCreateRequest),
                jacksonTypeRef<IndividualCustomerCreateRequest>(),
            )

        assertThat(roundtrippedIndividualCustomerCreateRequest)
            .isEqualTo(individualCustomerCreateRequest)
    }
}
