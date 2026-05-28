// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentReplaceRequestTest {

    @Test
    fun create() {
        val documentReplaceRequest =
            DocumentReplaceRequest.builder()
                .country("US")
                .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                .file("Example data")
                .documentNumber("A12345678")
                .issuingAuthority("U.S. Department of State")
                .side(DocumentReplaceRequest.Side.FRONT)
                .build()

        assertThat(documentReplaceRequest.country()).isEqualTo("US")
        assertThat(documentReplaceRequest.documentType())
            .isEqualTo(DocumentReplaceRequest.DocumentType.PASSPORT)
        assertThat(documentReplaceRequest.file()).isEqualTo("Example data")
        assertThat(documentReplaceRequest.documentNumber()).isEqualTo("A12345678")
        assertThat(documentReplaceRequest.issuingAuthority()).isEqualTo("U.S. Department of State")
        assertThat(documentReplaceRequest.side()).isEqualTo(DocumentReplaceRequest.Side.FRONT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentReplaceRequest =
            DocumentReplaceRequest.builder()
                .country("US")
                .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                .file("Example data")
                .documentNumber("A12345678")
                .issuingAuthority("U.S. Department of State")
                .side(DocumentReplaceRequest.Side.FRONT)
                .build()

        val roundtrippedDocumentReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentReplaceRequest),
                jacksonTypeRef<DocumentReplaceRequest>(),
            )

        assertThat(roundtrippedDocumentReplaceRequest).isEqualTo(documentReplaceRequest)
    }
}
