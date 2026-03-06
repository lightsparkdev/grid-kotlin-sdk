// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.IndividualCustomerFields
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycStatusWebhookEventTest {

    @Test
    fun create() {
        val kycStatusWebhookEvent =
            KycStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    KycStatusWebhookEvent.Data.builder()
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .isDeleted(false)
                        .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                        .fullName("John Michael Doe")
                        .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                        .nationality("US")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KycStatusWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                .build()

        assertThat(kycStatusWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(kycStatusWebhookEvent.data())
            .isEqualTo(
                KycStatusWebhookEvent.Data.builder()
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .isDeleted(false)
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .fullName("John Michael Doe")
                    .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                    .nationality("US")
                    .build()
            )
        assertThat(kycStatusWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(kycStatusWebhookEvent.type())
            .isEqualTo(KycStatusWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kycStatusWebhookEvent =
            KycStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    KycStatusWebhookEvent.Data.builder()
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .isDeleted(false)
                        .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                        .fullName("John Michael Doe")
                        .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                        .nationality("US")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KycStatusWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                .build()

        val roundtrippedKycStatusWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kycStatusWebhookEvent),
                jacksonTypeRef<KycStatusWebhookEvent>(),
            )

        assertThat(roundtrippedKycStatusWebhookEvent).isEqualTo(kycStatusWebhookEvent)
    }
}
