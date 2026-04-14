// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.VerificationError
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationListPageResponseTest {

    @Test
    fun create() {
        val verificationListPageResponse =
            VerificationListPageResponse.builder()
                .addData(
                    VerificationListResponse.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationError.Type.MISSING_FIELD)
                                .addAcceptedDocumentType(
                                    VerificationError.AcceptedDocumentType.PASSPORT
                                )
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(
                            VerificationListResponse.VerificationStatus.RESOLVE_ERRORS
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(verificationListPageResponse.data())
            .containsExactly(
                VerificationListResponse.builder()
                    .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .addError(
                        VerificationError.builder()
                            .reason("Business address line 1 is required")
                            .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .type(VerificationError.Type.MISSING_FIELD)
                            .addAcceptedDocumentType(
                                VerificationError.AcceptedDocumentType.PASSPORT
                            )
                            .field("customer.address.line1")
                            .build()
                    )
                    .verificationStatus(VerificationListResponse.VerificationStatus.RESOLVE_ERRORS)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .build()
            )
        assertThat(verificationListPageResponse.hasMore()).isEqualTo(true)
        assertThat(verificationListPageResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(verificationListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationListPageResponse =
            VerificationListPageResponse.builder()
                .addData(
                    VerificationListResponse.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationError.Type.MISSING_FIELD)
                                .addAcceptedDocumentType(
                                    VerificationError.AcceptedDocumentType.PASSPORT
                                )
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(
                            VerificationListResponse.VerificationStatus.RESOLVE_ERRORS
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedVerificationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationListPageResponse),
                jacksonTypeRef<VerificationListPageResponse>(),
            )

        assertThat(roundtrippedVerificationListPageResponse).isEqualTo(verificationListPageResponse)
    }
}
