// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTest {

    @Test
    fun create() {
        val document =
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

        assertThat(document.id()).isEqualTo("Document:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(document.country()).isEqualTo("US")
        assertThat(document.createdAt()).isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(document.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(document.documentType()).isEqualTo(Document.DocumentType.PASSPORT)
        assertThat(document.fileName()).isEqualTo("passport_scan.pdf")
        assertThat(document.documentNumber()).isEqualTo("A12345678")
        assertThat(document.issuingAuthority()).isEqualTo("U.S. Department of State")
        assertThat(document.side()).isEqualTo(Document.Side.FRONT)
        assertThat(document.updatedAt()).isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val document =
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

        val roundtrippedDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(document),
                jacksonTypeRef<Document>(),
            )

        assertThat(roundtrippedDocument).isEqualTo(document)
    }
}
