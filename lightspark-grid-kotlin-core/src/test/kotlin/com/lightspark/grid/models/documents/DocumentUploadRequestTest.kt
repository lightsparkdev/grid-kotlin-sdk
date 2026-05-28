// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DocumentUploadRequestTest {

    @Test
    fun ofIdentity() {
        val identity =
            IdentityDocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentNumber("A12345678")
                .documentType(IdentityDocumentType.PASSPORT)
                .file("Example data")
                .issuingAuthority("U.S. Department of State")
                .side(IdentityDocumentUploadRequest.Side.FRONT)
                .build()

        val documentUploadRequest = DocumentUploadRequest.ofIdentity(identity)

        assertThat(documentUploadRequest.identity()).isEqualTo(identity)
        assertThat(documentUploadRequest.nonIdentity()).isNull()
    }

    @Test
    fun ofIdentityRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentUploadRequest =
            DocumentUploadRequest.ofIdentity(
                IdentityDocumentUploadRequest.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentNumber("A12345678")
                    .documentType(IdentityDocumentType.PASSPORT)
                    .file("Example data")
                    .issuingAuthority("U.S. Department of State")
                    .side(IdentityDocumentUploadRequest.Side.FRONT)
                    .build()
            )

        val roundtrippedDocumentUploadRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentUploadRequest),
                jacksonTypeRef<DocumentUploadRequest>(),
            )

        assertThat(roundtrippedDocumentUploadRequest).isEqualTo(documentUploadRequest)
    }

    @Test
    fun ofNonIdentity() {
        val nonIdentity =
            NonIdentityDocumentUploadRequest.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(NonIdentityDocumentType.UTILITY_BILL)
                .file("Example data")
                .documentNumber("20240312-INV-9821")
                .issuingAuthority("City of San Francisco")
                .side(NonIdentityDocumentUploadRequest.Side.FRONT)
                .build()

        val documentUploadRequest = DocumentUploadRequest.ofNonIdentity(nonIdentity)

        assertThat(documentUploadRequest.identity()).isNull()
        assertThat(documentUploadRequest.nonIdentity()).isEqualTo(nonIdentity)
    }

    @Test
    fun ofNonIdentityRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentUploadRequest =
            DocumentUploadRequest.ofNonIdentity(
                NonIdentityDocumentUploadRequest.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentType(NonIdentityDocumentType.UTILITY_BILL)
                    .file("Example data")
                    .documentNumber("20240312-INV-9821")
                    .issuingAuthority("City of San Francisco")
                    .side(NonIdentityDocumentUploadRequest.Side.FRONT)
                    .build()
            )

        val roundtrippedDocumentUploadRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentUploadRequest),
                jacksonTypeRef<DocumentUploadRequest>(),
            )

        assertThat(roundtrippedDocumentUploadRequest).isEqualTo(documentUploadRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val documentUploadRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<DocumentUploadRequest>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { documentUploadRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
