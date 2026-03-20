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

        assertThat(documentListResponse.id())
            .isEqualTo("Document:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentListResponse.country()).isEqualTo("US")
        assertThat(documentListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(documentListResponse.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentListResponse.documentType())
            .isEqualTo(DocumentListResponse.DocumentType.PASSPORT)
        assertThat(documentListResponse.fileName()).isEqualTo("passport_scan.pdf")
        assertThat(documentListResponse.documentNumber()).isEqualTo("A12345678")
        assertThat(documentListResponse.side()).isEqualTo(DocumentListResponse.Side.FRONT)
        assertThat(documentListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListResponse =
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

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}
