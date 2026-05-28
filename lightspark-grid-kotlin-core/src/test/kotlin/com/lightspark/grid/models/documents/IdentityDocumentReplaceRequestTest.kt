// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentityDocumentReplaceRequestTest {

    @Test
    fun create() {
        val identityDocumentReplaceRequest =
            IdentityDocumentReplaceRequest.builder()
                .country("US")
                .documentNumber("A12345678")
                .documentType(IdentityDocumentType.PASSPORT)
                .file("Example data")
                .issuingAuthority("U.S. Department of State")
                .side(IdentityDocumentReplaceRequest.Side.FRONT)
                .build()

        assertThat(identityDocumentReplaceRequest.country()).isEqualTo("US")
        assertThat(identityDocumentReplaceRequest.documentNumber()).isEqualTo("A12345678")
        assertThat(identityDocumentReplaceRequest.documentType())
            .isEqualTo(IdentityDocumentType.PASSPORT)
        assertThat(identityDocumentReplaceRequest.file()).isEqualTo("Example data")
        assertThat(identityDocumentReplaceRequest.issuingAuthority())
            .isEqualTo("U.S. Department of State")
        assertThat(identityDocumentReplaceRequest.side())
            .isEqualTo(IdentityDocumentReplaceRequest.Side.FRONT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identityDocumentReplaceRequest =
            IdentityDocumentReplaceRequest.builder()
                .country("US")
                .documentNumber("A12345678")
                .documentType(IdentityDocumentType.PASSPORT)
                .file("Example data")
                .issuingAuthority("U.S. Department of State")
                .side(IdentityDocumentReplaceRequest.Side.FRONT)
                .build()

        val roundtrippedIdentityDocumentReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identityDocumentReplaceRequest),
                jacksonTypeRef<IdentityDocumentReplaceRequest>(),
            )

        assertThat(roundtrippedIdentityDocumentReplaceRequest)
            .isEqualTo(identityDocumentReplaceRequest)
    }
}
