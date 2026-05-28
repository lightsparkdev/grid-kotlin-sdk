// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.IndividualCustomer
import com.lightspark.grid.models.customers.CustomerOneOf
import com.lightspark.grid.models.customers.KycStatus
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerWebhookTest {

    @Test
    fun create() {
        val customerWebhook =
            CustomerWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CUSTOMER.KYC_APPROVED"))
                .data(
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
                )
                .build()

        assertThat(customerWebhook.id()).isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(customerWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(customerWebhook._type()).isEqualTo(JsonValue.from("CUSTOMER.KYC_APPROVED"))
        assertThat(customerWebhook.data())
            .isEqualTo(
                CustomerOneOf.ofIndividualCustomer(
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
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerWebhook =
            CustomerWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CUSTOMER.KYC_APPROVED"))
                .data(
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
                )
                .build()

        val roundtrippedCustomerWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerWebhook),
                jacksonTypeRef<CustomerWebhook>(),
            )

        assertThat(roundtrippedCustomerWebhook).isEqualTo(customerWebhook)
    }
}
