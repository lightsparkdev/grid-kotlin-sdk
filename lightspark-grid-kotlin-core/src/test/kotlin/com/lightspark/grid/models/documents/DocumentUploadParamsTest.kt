// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.lightspark.grid.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadParamsTest {

    @Test
    fun create() {
        DocumentUploadParams.builder()
            .body(
                DocumentUploadParams.Body.IdentityDocumentUploadRequest.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentNumber("A12345678")
                    .documentType(
                        DocumentUploadParams.Body.IdentityDocumentUploadRequest.DocumentType
                            .PASSPORT
                    )
                    .file("Example data".byteInputStream())
                    .issuingAuthority("U.S. Department of State")
                    .side(DocumentUploadParams.Body.IdentityDocumentUploadRequest.Side.FRONT)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentUploadParams.builder()
                .body(
                    DocumentUploadParams.Body.IdentityDocumentUploadRequest.builder()
                        .country("US")
                        .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .documentNumber("A12345678")
                        .documentType(
                            DocumentUploadParams.Body.IdentityDocumentUploadRequest.DocumentType
                                .PASSPORT
                        )
                        .file("Example data".byteInputStream())
                        .issuingAuthority("U.S. Department of State")
                        .side(DocumentUploadParams.Body.IdentityDocumentUploadRequest.Side.FRONT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "body" to
                            MultipartField.builder<DocumentUploadParams.Body>()
                                .value(
                                    DocumentUploadParams.Body.ofIdentityDocumentUploadRequest(
                                        DocumentUploadParams.Body.IdentityDocumentUploadRequest
                                            .builder()
                                            .country("US")
                                            .documentHolder(
                                                "BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .documentNumber("A12345678")
                                            .documentType(
                                                DocumentUploadParams.Body
                                                    .IdentityDocumentUploadRequest
                                                    .DocumentType
                                                    .PASSPORT
                                            )
                                            .file("Example data".byteInputStream())
                                            .issuingAuthority("U.S. Department of State")
                                            .side(
                                                DocumentUploadParams.Body
                                                    .IdentityDocumentUploadRequest
                                                    .Side
                                                    .FRONT
                                            )
                                            .build()
                                    )
                                )
                                .contentType("application/octet-stream")
                                .build()
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentUploadParams.builder()
                .body(
                    DocumentUploadParams.Body.IdentityDocumentUploadRequest.builder()
                        .country("US")
                        .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .documentNumber("A12345678")
                        .documentType(
                            DocumentUploadParams.Body.IdentityDocumentUploadRequest.DocumentType
                                .PASSPORT
                        )
                        .file("Example data".byteInputStream())
                        .issuingAuthority("U.S. Department of State")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "body" to
                            MultipartField.builder<DocumentUploadParams.Body>()
                                .value(
                                    DocumentUploadParams.Body.ofIdentityDocumentUploadRequest(
                                        DocumentUploadParams.Body.IdentityDocumentUploadRequest
                                            .builder()
                                            .country("US")
                                            .documentHolder(
                                                "BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .documentNumber("A12345678")
                                            .documentType(
                                                DocumentUploadParams.Body
                                                    .IdentityDocumentUploadRequest
                                                    .DocumentType
                                                    .PASSPORT
                                            )
                                            .file("Example data".byteInputStream())
                                            .issuingAuthority("U.S. Department of State")
                                            .build()
                                    )
                                )
                                .contentType("application/octet-stream")
                                .build()
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
