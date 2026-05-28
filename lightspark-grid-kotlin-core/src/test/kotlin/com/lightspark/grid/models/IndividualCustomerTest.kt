// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.KycStatus
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerTest {

    @Test
    fun create() {
        val individualCustomer =
            IndividualCustomer.builder()
                .customerType(JsonValue.from("INDIVIDUAL"))
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .fullName("John Michael Doe")
                .kycStatus(KycStatus.APPROVED)
                .nationality("US")
                .build()

        assertThat(individualCustomer._customerType()).isEqualTo(JsonValue.from("INDIVIDUAL"))
        assertThat(individualCustomer.platformCustomerId()).isEqualTo("9f84e0c2a72c4fa")
        assertThat(individualCustomer.umaAddress()).isEqualTo("\$john.doe@uma.domain.com")
        assertThat(individualCustomer.id())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(individualCustomer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(individualCustomer.currencies()).containsExactly("USD", "USDC")
        assertThat(individualCustomer.email()).isEqualTo("john.doe@example.com")
        assertThat(individualCustomer.isDeleted()).isEqualTo(false)
        assertThat(individualCustomer.region()).isEqualTo("US")
        assertThat(individualCustomer.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(individualCustomer.address())
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
        assertThat(individualCustomer.birthDate()).isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomer.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomer.kycStatus()).isEqualTo(KycStatus.APPROVED)
        assertThat(individualCustomer.nationality()).isEqualTo("US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomer =
            IndividualCustomer.builder()
                .customerType(JsonValue.from("INDIVIDUAL"))
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .fullName("John Michael Doe")
                .kycStatus(KycStatus.APPROVED)
                .nationality("US")
                .build()

        val roundtrippedIndividualCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomer),
                jacksonTypeRef<IndividualCustomer>(),
            )

        assertThat(roundtrippedIndividualCustomer).isEqualTo(individualCustomer)
    }
}
