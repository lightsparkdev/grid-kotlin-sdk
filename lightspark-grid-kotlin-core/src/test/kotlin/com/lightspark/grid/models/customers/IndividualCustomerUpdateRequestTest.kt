// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerUpdateRequestTest {

    @Test
    fun create() {
        val individualCustomerUpdateRequest =
            IndividualCustomerUpdateRequest.builder()
                .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
                .nationality("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(individualCustomerUpdateRequest.customerType())
            .isEqualTo(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
        assertThat(individualCustomerUpdateRequest.address())
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
        assertThat(individualCustomerUpdateRequest.birthDate())
            .isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomerUpdateRequest.currencies())
            .containsExactly("USD", "EUR", "USDC")
        assertThat(individualCustomerUpdateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(individualCustomerUpdateRequest.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomerUpdateRequest.kycStatus())
            .isEqualTo(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
        assertThat(individualCustomerUpdateRequest.nationality()).isEqualTo("US")
        assertThat(individualCustomerUpdateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomerUpdateRequest =
            IndividualCustomerUpdateRequest.builder()
                .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
                .nationality("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedIndividualCustomerUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomerUpdateRequest),
                jacksonTypeRef<IndividualCustomerUpdateRequest>(),
            )

        assertThat(roundtrippedIndividualCustomerUpdateRequest)
            .isEqualTo(individualCustomerUpdateRequest)
    }
}
