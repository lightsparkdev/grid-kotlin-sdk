// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListPageResponseTest {

    @Test
    fun create() {
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addData(
                    DocumentListResponse.builder()
                        .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .documentType(DocumentListResponse.DocumentType.PASSPORT)
                        .fileName("passport_scan.pdf")
                        .documentNumber("A12345678")
                        .side(DocumentListResponse.Side.FRONT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(documentListPageResponse.data())
            .containsExactly(
                DocumentListResponse.builder()
                    .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentType(DocumentListResponse.DocumentType.PASSPORT)
                    .fileName("passport_scan.pdf")
                    .documentNumber("A12345678")
                    .side(DocumentListResponse.Side.FRONT)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .build()
            )
        assertThat(documentListPageResponse.hasMore()).isEqualTo(true)
        assertThat(documentListPageResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(documentListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addData(
                    DocumentListResponse.builder()
                        .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .documentType(DocumentListResponse.DocumentType.PASSPORT)
                        .fileName("passport_scan.pdf")
                        .documentNumber("A12345678")
                        .side(DocumentListResponse.Side.FRONT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedDocumentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListPageResponse),
                jacksonTypeRef<DocumentListPageResponse>(),
            )

        assertThat(roundtrippedDocumentListPageResponse).isEqualTo(documentListPageResponse)
    }
}
