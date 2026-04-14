// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.VerificationError
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationSubmitResponseTest {

    @Test
    fun create() {
        val verificationSubmitResponse =
            VerificationSubmitResponse.builder()
                .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .addError(
                    VerificationError.builder()
                        .reason("Business address line 1 is required")
                        .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .type(VerificationError.Type.MISSING_FIELD)
                        .addAcceptedDocumentType(VerificationError.AcceptedDocumentType.PASSPORT)
                        .field("customer.address.line1")
                        .build()
                )
                .verificationStatus(VerificationSubmitResponse.VerificationStatus.RESOLVE_ERRORS)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(verificationSubmitResponse.id())
            .isEqualTo("Verification:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verificationSubmitResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(verificationSubmitResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verificationSubmitResponse.errors())
            .containsExactly(
                VerificationError.builder()
                    .reason("Business address line 1 is required")
                    .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .type(VerificationError.Type.MISSING_FIELD)
                    .addAcceptedDocumentType(VerificationError.AcceptedDocumentType.PASSPORT)
                    .field("customer.address.line1")
                    .build()
            )
        assertThat(verificationSubmitResponse.verificationStatus())
            .isEqualTo(VerificationSubmitResponse.VerificationStatus.RESOLVE_ERRORS)
        assertThat(verificationSubmitResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationSubmitResponse =
            VerificationSubmitResponse.builder()
                .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .addError(
                    VerificationError.builder()
                        .reason("Business address line 1 is required")
                        .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .type(VerificationError.Type.MISSING_FIELD)
                        .addAcceptedDocumentType(VerificationError.AcceptedDocumentType.PASSPORT)
                        .field("customer.address.line1")
                        .build()
                )
                .verificationStatus(VerificationSubmitResponse.VerificationStatus.RESOLVE_ERRORS)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedVerificationSubmitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationSubmitResponse),
                jacksonTypeRef<VerificationSubmitResponse>(),
            )

        assertThat(roundtrippedVerificationSubmitResponse).isEqualTo(verificationSubmitResponse)
    }
}
