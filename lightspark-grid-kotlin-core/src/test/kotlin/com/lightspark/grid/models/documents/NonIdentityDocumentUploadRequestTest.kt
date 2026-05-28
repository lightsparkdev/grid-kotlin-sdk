// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NonIdentityDocumentUploadRequestTest {

    @Test
    fun create() {
        val nonIdentityDocumentUploadRequest =
            NonIdentityDocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(NonIdentityDocumentType.UTILITY_BILL)
                .file("Example data")
                .documentNumber("20240312-INV-9821")
                .issuingAuthority("City of San Francisco")
                .side(NonIdentityDocumentUploadRequest.Side.FRONT)
                .build()

        assertThat(nonIdentityDocumentUploadRequest.country()).isEqualTo("US")
        assertThat(nonIdentityDocumentUploadRequest.documentHolder())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(nonIdentityDocumentUploadRequest.documentType())
            .isEqualTo(NonIdentityDocumentType.UTILITY_BILL)
        assertThat(nonIdentityDocumentUploadRequest.file()).isEqualTo("Example data")
        assertThat(nonIdentityDocumentUploadRequest.documentNumber()).isEqualTo("20240312-INV-9821")
        assertThat(nonIdentityDocumentUploadRequest.issuingAuthority())
            .isEqualTo("City of San Francisco")
        assertThat(nonIdentityDocumentUploadRequest.side())
            .isEqualTo(NonIdentityDocumentUploadRequest.Side.FRONT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nonIdentityDocumentUploadRequest =
            NonIdentityDocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(NonIdentityDocumentType.UTILITY_BILL)
                .file("Example data")
                .documentNumber("20240312-INV-9821")
                .issuingAuthority("City of San Francisco")
                .side(NonIdentityDocumentUploadRequest.Side.FRONT)
                .build()

        val roundtrippedNonIdentityDocumentUploadRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nonIdentityDocumentUploadRequest),
                jacksonTypeRef<NonIdentityDocumentUploadRequest>(),
            )

        assertThat(roundtrippedNonIdentityDocumentUploadRequest)
            .isEqualTo(nonIdentityDocumentUploadRequest)
    }
}
