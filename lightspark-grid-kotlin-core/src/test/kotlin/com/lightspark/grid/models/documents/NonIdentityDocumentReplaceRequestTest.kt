// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NonIdentityDocumentReplaceRequestTest {

    @Test
    fun create() {
        val nonIdentityDocumentReplaceRequest =
            NonIdentityDocumentReplaceRequest.builder()
                .country("US")
                .documentType(NonIdentityDocumentType.UTILITY_BILL)
                .file("Example data")
                .documentNumber("20240312-INV-9821")
                .issuingAuthority("City of San Francisco")
                .side(NonIdentityDocumentReplaceRequest.Side.FRONT)
                .build()

        assertThat(nonIdentityDocumentReplaceRequest.country()).isEqualTo("US")
        assertThat(nonIdentityDocumentReplaceRequest.documentType())
            .isEqualTo(NonIdentityDocumentType.UTILITY_BILL)
        assertThat(nonIdentityDocumentReplaceRequest.file()).isEqualTo("Example data")
        assertThat(nonIdentityDocumentReplaceRequest.documentNumber())
            .isEqualTo("20240312-INV-9821")
        assertThat(nonIdentityDocumentReplaceRequest.issuingAuthority())
            .isEqualTo("City of San Francisco")
        assertThat(nonIdentityDocumentReplaceRequest.side())
            .isEqualTo(NonIdentityDocumentReplaceRequest.Side.FRONT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nonIdentityDocumentReplaceRequest =
            NonIdentityDocumentReplaceRequest.builder()
                .country("US")
                .documentType(NonIdentityDocumentType.UTILITY_BILL)
                .file("Example data")
                .documentNumber("20240312-INV-9821")
                .issuingAuthority("City of San Francisco")
                .side(NonIdentityDocumentReplaceRequest.Side.FRONT)
                .build()

        val roundtrippedNonIdentityDocumentReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nonIdentityDocumentReplaceRequest),
                jacksonTypeRef<NonIdentityDocumentReplaceRequest>(),
            )

        assertThat(roundtrippedNonIdentityDocumentReplaceRequest)
            .isEqualTo(nonIdentityDocumentReplaceRequest)
    }
}
