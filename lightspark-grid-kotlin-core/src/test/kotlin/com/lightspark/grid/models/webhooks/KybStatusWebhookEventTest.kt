// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.BusinessCustomerFields
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KybStatusWebhookEventTest {

    @Test
    fun create() {
        val kybStatusWebhookEvent =
            KybStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    KybStatusWebhookEvent.Data.builder()
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .isDeleted(false)
                        .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                        .addBeneficialOwner(
                            BusinessCustomerFields.BeneficialOwner.builder()
                                .fullName("John Michael Doe")
                                .individualType(
                                    BusinessCustomerFields.BeneficialOwner.IndividualType.DIRECTOR
                                )
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
                                .emailAddress("example@test.com")
                                .nationality("US")
                                .percentageOwnership(25.0)
                                .phoneNumber("+5555555555")
                                .taxId("EIN-987654321")
                                .title("CEO, COO, President")
                                .build()
                        )
                        .businessInfo(
                            BusinessCustomerFields.BusinessInfo.builder()
                                .legalName("Acme Corporation, Inc.")
                                .registrationNumber("BRN-123456789")
                                .taxId("EIN-987654321")
                                .build()
                        )
                        .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KybStatusWebhookEvent.Type.CUSTOMER_KYB_APPROVED)
                .build()

        assertThat(kybStatusWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(kybStatusWebhookEvent.data())
            .isEqualTo(
                KybStatusWebhookEvent.Data.builder()
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .isDeleted(false)
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                    .addBeneficialOwner(
                        BusinessCustomerFields.BeneficialOwner.builder()
                            .fullName("John Michael Doe")
                            .individualType(
                                BusinessCustomerFields.BeneficialOwner.IndividualType.DIRECTOR
                            )
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
                            .emailAddress("example@test.com")
                            .nationality("US")
                            .percentageOwnership(25.0)
                            .phoneNumber("+5555555555")
                            .taxId("EIN-987654321")
                            .title("CEO, COO, President")
                            .build()
                    )
                    .businessInfo(
                        BusinessCustomerFields.BusinessInfo.builder()
                            .legalName("Acme Corporation, Inc.")
                            .registrationNumber("BRN-123456789")
                            .taxId("EIN-987654321")
                            .build()
                    )
                    .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                    .build()
            )
        assertThat(kybStatusWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(kybStatusWebhookEvent.type())
            .isEqualTo(KybStatusWebhookEvent.Type.CUSTOMER_KYB_APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kybStatusWebhookEvent =
            KybStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    KybStatusWebhookEvent.Data.builder()
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .isDeleted(false)
                        .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                        .addBeneficialOwner(
                            BusinessCustomerFields.BeneficialOwner.builder()
                                .fullName("John Michael Doe")
                                .individualType(
                                    BusinessCustomerFields.BeneficialOwner.IndividualType.DIRECTOR
                                )
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
                                .emailAddress("example@test.com")
                                .nationality("US")
                                .percentageOwnership(25.0)
                                .phoneNumber("+5555555555")
                                .taxId("EIN-987654321")
                                .title("CEO, COO, President")
                                .build()
                        )
                        .businessInfo(
                            BusinessCustomerFields.BusinessInfo.builder()
                                .legalName("Acme Corporation, Inc.")
                                .registrationNumber("BRN-123456789")
                                .taxId("EIN-987654321")
                                .build()
                        )
                        .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KybStatusWebhookEvent.Type.CUSTOMER_KYB_APPROVED)
                .build()

        val roundtrippedKybStatusWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kybStatusWebhookEvent),
                jacksonTypeRef<KybStatusWebhookEvent>(),
            )

        assertThat(roundtrippedKybStatusWebhookEvent).isEqualTo(kybStatusWebhookEvent)
    }
}
