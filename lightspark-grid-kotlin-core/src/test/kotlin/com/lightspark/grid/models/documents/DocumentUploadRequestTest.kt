// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadRequestTest {

    @Test
    fun create() {
        val documentUploadRequest =
            DocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentType.PASSPORT)
                .file("Example data")
                .documentNumber("A12345678")
                .issuingAuthority("U.S. Department of State")
                .side(DocumentUploadRequest.Side.FRONT)
                .build()

        assertThat(documentUploadRequest.country()).isEqualTo("US")
        assertThat(documentUploadRequest.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(documentUploadRequest.documentType()).isEqualTo(DocumentType.PASSPORT)
        assertThat(documentUploadRequest.file()).isEqualTo("Example data")
        assertThat(documentUploadRequest.documentNumber()).isEqualTo("A12345678")
        assertThat(documentUploadRequest.issuingAuthority()).isEqualTo("U.S. Department of State")
        assertThat(documentUploadRequest.side()).isEqualTo(DocumentUploadRequest.Side.FRONT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentUploadRequest =
            DocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentType.PASSPORT)
                .file("Example data")
                .documentNumber("A12345678")
                .issuingAuthority("U.S. Department of State")
                .side(DocumentUploadRequest.Side.FRONT)
                .build()

        val roundtrippedDocumentUploadRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentUploadRequest),
                jacksonTypeRef<DocumentUploadRequest>(),
            )

        assertThat(roundtrippedDocumentUploadRequest).isEqualTo(documentUploadRequest)
    }
}
