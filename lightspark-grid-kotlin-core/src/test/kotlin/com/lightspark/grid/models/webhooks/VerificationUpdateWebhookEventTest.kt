// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationUpdateWebhookEventTest {

    @Test
    fun create() {
        val verificationUpdateWebhookEvent =
            VerificationUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    VerificationUpdateWebhookEvent.Data.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationUpdateWebhookEvent.Data.Error.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationUpdateWebhookEvent.Data.Error.Type.MISSING_FIELD)
                                .addAcceptedDocumentType(
                                    VerificationUpdateWebhookEvent.Data.Error.AcceptedDocumentType
                                        .PASSPORT
                                )
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(
                            VerificationUpdateWebhookEvent.Data.VerificationStatus.RESOLVE_ERRORS
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
                .build()

        assertThat(verificationUpdateWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(verificationUpdateWebhookEvent.data())
            .isEqualTo(
                VerificationUpdateWebhookEvent.Data.builder()
                    .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .addError(
                        VerificationUpdateWebhookEvent.Data.Error.builder()
                            .reason("Business address line 1 is required")
                            .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .type(VerificationUpdateWebhookEvent.Data.Error.Type.MISSING_FIELD)
                            .addAcceptedDocumentType(
                                VerificationUpdateWebhookEvent.Data.Error.AcceptedDocumentType
                                    .PASSPORT
                            )
                            .field("customer.address.line1")
                            .build()
                    )
                    .verificationStatus(
                        VerificationUpdateWebhookEvent.Data.VerificationStatus.RESOLVE_ERRORS
                    )
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .build()
            )
        assertThat(verificationUpdateWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(verificationUpdateWebhookEvent.type())
            .isEqualTo(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationUpdateWebhookEvent =
            VerificationUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    VerificationUpdateWebhookEvent.Data.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationUpdateWebhookEvent.Data.Error.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationUpdateWebhookEvent.Data.Error.Type.MISSING_FIELD)
                                .addAcceptedDocumentType(
                                    VerificationUpdateWebhookEvent.Data.Error.AcceptedDocumentType
                                        .PASSPORT
                                )
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(
                            VerificationUpdateWebhookEvent.Data.VerificationStatus.RESOLVE_ERRORS
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
                .build()

        val roundtrippedVerificationUpdateWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationUpdateWebhookEvent),
                jacksonTypeRef<VerificationUpdateWebhookEvent>(),
            )

        assertThat(roundtrippedVerificationUpdateWebhookEvent)
            .isEqualTo(verificationUpdateWebhookEvent)
    }
}
