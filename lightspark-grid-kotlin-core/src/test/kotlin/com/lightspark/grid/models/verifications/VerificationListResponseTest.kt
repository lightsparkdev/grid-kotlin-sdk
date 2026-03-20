// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationListResponseTest {

    @Test
    fun create() {
        val verificationListResponse =
            VerificationListResponse.builder()
                .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .addError(
                    VerificationListResponse.Error.builder()
                        .reason("Business address line 1 is required")
                        .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .type(VerificationListResponse.Error.Type.MISSING_FIELD)
                        .addAcceptedDocumentType(
                            VerificationListResponse.Error.AcceptedDocumentType.PASSPORT
                        )
                        .field("customer.address.line1")
                        .build()
                )
                .verificationStatus(VerificationListResponse.VerificationStatus.RESOLVE_ERRORS)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(verificationListResponse.id())
            .isEqualTo("Verification:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verificationListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(verificationListResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verificationListResponse.errors())
            .containsExactly(
                VerificationListResponse.Error.builder()
                    .reason("Business address line 1 is required")
                    .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .type(VerificationListResponse.Error.Type.MISSING_FIELD)
                    .addAcceptedDocumentType(
                        VerificationListResponse.Error.AcceptedDocumentType.PASSPORT
                    )
                    .field("customer.address.line1")
                    .build()
            )
        assertThat(verificationListResponse.verificationStatus())
            .isEqualTo(VerificationListResponse.VerificationStatus.RESOLVE_ERRORS)
        assertThat(verificationListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationListResponse =
            VerificationListResponse.builder()
                .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .addError(
                    VerificationListResponse.Error.builder()
                        .reason("Business address line 1 is required")
                        .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .type(VerificationListResponse.Error.Type.MISSING_FIELD)
                        .addAcceptedDocumentType(
                            VerificationListResponse.Error.AcceptedDocumentType.PASSPORT
                        )
                        .field("customer.address.line1")
                        .build()
                )
                .verificationStatus(VerificationListResponse.VerificationStatus.RESOLVE_ERRORS)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedVerificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationListResponse),
                jacksonTypeRef<VerificationListResponse>(),
            )

        assertThat(roundtrippedVerificationListResponse).isEqualTo(verificationListResponse)
    }
}
