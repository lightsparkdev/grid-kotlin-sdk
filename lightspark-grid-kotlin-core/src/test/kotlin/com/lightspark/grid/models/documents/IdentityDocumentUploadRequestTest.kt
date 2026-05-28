// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentityDocumentUploadRequestTest {

    @Test
    fun create() {
        val identityDocumentUploadRequest =
            IdentityDocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentNumber("A12345678")
                .documentType(IdentityDocumentType.PASSPORT)
                .file("Example data")
                .issuingAuthority("U.S. Department of State")
                .side(IdentityDocumentUploadRequest.Side.FRONT)
                .build()

        assertThat(identityDocumentUploadRequest.country()).isEqualTo("US")
        assertThat(identityDocumentUploadRequest.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(identityDocumentUploadRequest.documentNumber()).isEqualTo("A12345678")
        assertThat(identityDocumentUploadRequest.documentType())
            .isEqualTo(IdentityDocumentType.PASSPORT)
        assertThat(identityDocumentUploadRequest.file()).isEqualTo("Example data")
        assertThat(identityDocumentUploadRequest.issuingAuthority())
            .isEqualTo("U.S. Department of State")
        assertThat(identityDocumentUploadRequest.side())
            .isEqualTo(IdentityDocumentUploadRequest.Side.FRONT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identityDocumentUploadRequest =
            IdentityDocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentNumber("A12345678")
                .documentType(IdentityDocumentType.PASSPORT)
                .file("Example data")
                .issuingAuthority("U.S. Department of State")
                .side(IdentityDocumentUploadRequest.Side.FRONT)
                .build()

        val roundtrippedIdentityDocumentUploadRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identityDocumentUploadRequest),
                jacksonTypeRef<IdentityDocumentUploadRequest>(),
            )

        assertThat(roundtrippedIdentityDocumentUploadRequest)
            .isEqualTo(identityDocumentUploadRequest)
    }
}
