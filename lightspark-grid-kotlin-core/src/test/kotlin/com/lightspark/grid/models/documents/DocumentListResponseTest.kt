// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListResponseTest {

    @Test
    fun create() {
        val documentListResponse =
            DocumentListResponse.builder()
                .addData(
                    Document.builder()
                        .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .documentType(Document.DocumentType.PASSPORT)
                        .fileName("passport_scan.pdf")
                        .documentNumber("A12345678")
                        .issuingAuthority("U.S. Department of State")
                        .side(Document.Side.FRONT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(documentListResponse.data())
            .containsExactly(
                Document.builder()
                    .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentType(Document.DocumentType.PASSPORT)
                    .fileName("passport_scan.pdf")
                    .documentNumber("A12345678")
                    .issuingAuthority("U.S. Department of State")
                    .side(Document.Side.FRONT)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                    .build()
            )
        assertThat(documentListResponse.hasMore()).isEqualTo(true)
        assertThat(documentListResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(documentListResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListResponse =
            DocumentListResponse.builder()
                .addData(
                    Document.builder()
                        .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .documentType(Document.DocumentType.PASSPORT)
                        .fileName("passport_scan.pdf")
                        .documentNumber("A12345678")
                        .issuingAuthority("U.S. Department of State")
                        .side(Document.Side.FRONT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}
