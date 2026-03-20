// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadResponseTest {

    @Test
    fun create() {
        val documentUploadResponse =
            DocumentUploadResponse.builder()
                .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                .country("US")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentUploadResponse.DocumentType.PASSPORT)
                .fileName("passport_scan.pdf")
                .documentNumber("A12345678")
                .side(DocumentUploadResponse.Side.FRONT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(documentUploadResponse.id())
            .isEqualTo("Document:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentUploadResponse.country()).isEqualTo("US")
        assertThat(documentUploadResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(documentUploadResponse.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentUploadResponse.documentType())
            .isEqualTo(DocumentUploadResponse.DocumentType.PASSPORT)
        assertThat(documentUploadResponse.fileName()).isEqualTo("passport_scan.pdf")
        assertThat(documentUploadResponse.documentNumber()).isEqualTo("A12345678")
        assertThat(documentUploadResponse.side()).isEqualTo(DocumentUploadResponse.Side.FRONT)
        assertThat(documentUploadResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentUploadResponse =
            DocumentUploadResponse.builder()
                .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                .country("US")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentUploadResponse.DocumentType.PASSPORT)
                .fileName("passport_scan.pdf")
                .documentNumber("A12345678")
                .side(DocumentUploadResponse.Side.FRONT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedDocumentUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentUploadResponse),
                jacksonTypeRef<DocumentUploadResponse>(),
            )

        assertThat(roundtrippedDocumentUploadResponse).isEqualTo(documentUploadResponse)
    }
}
