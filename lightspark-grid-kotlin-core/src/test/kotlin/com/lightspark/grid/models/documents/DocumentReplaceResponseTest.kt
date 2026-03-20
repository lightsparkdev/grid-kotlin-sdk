// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentReplaceResponseTest {

    @Test
    fun create() {
        val documentReplaceResponse =
            DocumentReplaceResponse.builder()
                .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                .country("US")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentReplaceResponse.DocumentType.PASSPORT)
                .fileName("passport_scan.pdf")
                .documentNumber("A12345678")
                .side(DocumentReplaceResponse.Side.FRONT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(documentReplaceResponse.id())
            .isEqualTo("Document:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentReplaceResponse.country()).isEqualTo("US")
        assertThat(documentReplaceResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(documentReplaceResponse.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentReplaceResponse.documentType())
            .isEqualTo(DocumentReplaceResponse.DocumentType.PASSPORT)
        assertThat(documentReplaceResponse.fileName()).isEqualTo("passport_scan.pdf")
        assertThat(documentReplaceResponse.documentNumber()).isEqualTo("A12345678")
        assertThat(documentReplaceResponse.side()).isEqualTo(DocumentReplaceResponse.Side.FRONT)
        assertThat(documentReplaceResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentReplaceResponse =
            DocumentReplaceResponse.builder()
                .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                .country("US")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentReplaceResponse.DocumentType.PASSPORT)
                .fileName("passport_scan.pdf")
                .documentNumber("A12345678")
                .side(DocumentReplaceResponse.Side.FRONT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedDocumentReplaceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentReplaceResponse),
                jacksonTypeRef<DocumentReplaceResponse>(),
            )

        assertThat(roundtrippedDocumentReplaceResponse).isEqualTo(documentReplaceResponse)
    }
}
