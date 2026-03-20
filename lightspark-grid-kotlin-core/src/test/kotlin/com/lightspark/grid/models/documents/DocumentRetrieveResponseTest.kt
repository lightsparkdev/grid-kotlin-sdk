// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentRetrieveResponseTest {

    @Test
    fun create() {
        val documentRetrieveResponse =
            DocumentRetrieveResponse.builder()
                .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                .country("US")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentRetrieveResponse.DocumentType.PASSPORT)
                .fileName("passport_scan.pdf")
                .documentNumber("A12345678")
                .side(DocumentRetrieveResponse.Side.FRONT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(documentRetrieveResponse.id())
            .isEqualTo("Document:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentRetrieveResponse.country()).isEqualTo("US")
        assertThat(documentRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(documentRetrieveResponse.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentRetrieveResponse.documentType())
            .isEqualTo(DocumentRetrieveResponse.DocumentType.PASSPORT)
        assertThat(documentRetrieveResponse.fileName()).isEqualTo("passport_scan.pdf")
        assertThat(documentRetrieveResponse.documentNumber()).isEqualTo("A12345678")
        assertThat(documentRetrieveResponse.side()).isEqualTo(DocumentRetrieveResponse.Side.FRONT)
        assertThat(documentRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentRetrieveResponse =
            DocumentRetrieveResponse.builder()
                .id("Document:019542f5-b3e7-1d02-0000-000000000001")
                .country("US")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentRetrieveResponse.DocumentType.PASSPORT)
                .fileName("passport_scan.pdf")
                .documentNumber("A12345678")
                .side(DocumentRetrieveResponse.Side.FRONT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedDocumentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentRetrieveResponse),
                jacksonTypeRef<DocumentRetrieveResponse>(),
            )

        assertThat(roundtrippedDocumentRetrieveResponse).isEqualTo(documentRetrieveResponse)
    }
}
