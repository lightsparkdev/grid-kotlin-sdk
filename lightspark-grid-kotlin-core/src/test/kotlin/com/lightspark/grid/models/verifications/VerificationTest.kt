// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.VerificationError
import com.lightspark.grid.models.documents.DocumentType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationTest {

    @Test
    fun create() {
        val verification =
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

        assertThat(verification.id()).isEqualTo("Verification:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verification.createdAt()).isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(verification.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verification.errors())
            .containsExactly(
                VerificationError.builder()
                    .reason("Business address line 1 is required")
                    .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .type(VerificationErrorType.MISSING_FIELD)
                    .addAcceptedDocumentType(DocumentType.PASSPORT)
                    .field("customer.address.line1")
                    .build()
            )
        assertThat(verification.verificationStatus()).isEqualTo(VerificationStatus.RESOLVE_ERRORS)
        assertThat(verification.updatedAt()).isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verification =
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

        val roundtrippedVerification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verification),
                jacksonTypeRef<Verification>(),
            )

        assertThat(roundtrippedVerification).isEqualTo(verification)
    }
}
