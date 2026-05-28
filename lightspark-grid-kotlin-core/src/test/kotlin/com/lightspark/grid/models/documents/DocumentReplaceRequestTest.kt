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

internal class DocumentReplaceRequestTest {

    @Test
    fun ofIdentity() {
        val identity =
            IdentityDocumentReplaceRequest.builder()
                .country("US")
                .documentNumber("A12345678")
                .documentType(IdentityDocumentType.PASSPORT)
                .file("Example data")
                .issuingAuthority("U.S. Department of State")
                .side(IdentityDocumentReplaceRequest.Side.FRONT)
                .build()

        val documentReplaceRequest = DocumentReplaceRequest.ofIdentity(identity)

        assertThat(documentReplaceRequest.identity()).isEqualTo(identity)
        assertThat(documentReplaceRequest.nonIdentity()).isNull()
    }

    @Test
    fun ofIdentityRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentReplaceRequest =
            DocumentReplaceRequest.ofIdentity(
                IdentityDocumentReplaceRequest.builder()
                    .country("US")
                    .documentNumber("A12345678")
                    .documentType(IdentityDocumentType.PASSPORT)
                    .file("Example data")
                    .issuingAuthority("U.S. Department of State")
                    .side(IdentityDocumentReplaceRequest.Side.FRONT)
                    .build()
            )

        val roundtrippedDocumentReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentReplaceRequest),
                jacksonTypeRef<DocumentReplaceRequest>(),
            )

        assertThat(roundtrippedDocumentReplaceRequest).isEqualTo(documentReplaceRequest)
    }

    @Test
    fun ofNonIdentity() {
        val nonIdentity =
            NonIdentityDocumentReplaceRequest.builder()
                .country("US")
                .documentType(NonIdentityDocumentType.UTILITY_BILL)
                .file("Example data")
                .documentNumber("20240312-INV-9821")
                .issuingAuthority("City of San Francisco")
                .side(NonIdentityDocumentReplaceRequest.Side.FRONT)
                .build()

        val documentReplaceRequest = DocumentReplaceRequest.ofNonIdentity(nonIdentity)

        assertThat(documentReplaceRequest.identity()).isNull()
        assertThat(documentReplaceRequest.nonIdentity()).isEqualTo(nonIdentity)
    }

    @Test
    fun ofNonIdentityRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentReplaceRequest =
            DocumentReplaceRequest.ofNonIdentity(
                NonIdentityDocumentReplaceRequest.builder()
                    .country("US")
                    .documentType(NonIdentityDocumentType.UTILITY_BILL)
                    .file("Example data")
                    .documentNumber("20240312-INV-9821")
                    .issuingAuthority("City of San Francisco")
                    .side(NonIdentityDocumentReplaceRequest.Side.FRONT)
                    .build()
            )

        val roundtrippedDocumentReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentReplaceRequest),
                jacksonTypeRef<DocumentReplaceRequest>(),
            )

        assertThat(roundtrippedDocumentReplaceRequest).isEqualTo(documentReplaceRequest)
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
        val documentReplaceRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<DocumentReplaceRequest>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { documentReplaceRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
