// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.VerificationError
import com.lightspark.grid.models.documents.DocumentType
import com.lightspark.grid.models.verifications.Verification
import com.lightspark.grid.models.verifications.VerificationErrorType
import com.lightspark.grid.models.verifications.VerificationStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationWebhookTest {

    @Test
    fun create() {
        val verificationWebhook =
            VerificationWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("VERIFICATION.APPROVED"))
                .data(
                    Verification.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationErrorType.MISSING_FIELD)
                                .addAcceptedDocumentType(DocumentType.PASSPORT)
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(VerificationStatus.RESOLVE_ERRORS)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .build()

        assertThat(verificationWebhook.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(verificationWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(verificationWebhook._type()).isEqualTo(JsonValue.from("VERIFICATION.APPROVED"))
        assertThat(verificationWebhook.data())
            .isEqualTo(
                Verification.builder()
                    .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .addError(
                        VerificationError.builder()
                            .reason("Business address line 1 is required")
                            .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .type(VerificationErrorType.MISSING_FIELD)
                            .addAcceptedDocumentType(DocumentType.PASSPORT)
                            .field("customer.address.line1")
                            .build()
                    )
                    .verificationStatus(VerificationStatus.RESOLVE_ERRORS)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationWebhook =
            VerificationWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("VERIFICATION.APPROVED"))
                .data(
                    Verification.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationErrorType.MISSING_FIELD)
                                .addAcceptedDocumentType(DocumentType.PASSPORT)
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(VerificationStatus.RESOLVE_ERRORS)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .build()

        val roundtrippedVerificationWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationWebhook),
                jacksonTypeRef<VerificationWebhook>(),
            )

        assertThat(roundtrippedVerificationWebhook).isEqualTo(verificationWebhook)
    }
}
