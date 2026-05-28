// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import com.lightspark.grid.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentReplaceParamsTest {

    @Test
    fun create() {
        DocumentReplaceParams.builder()
            .documentId("documentId")
            .documentReplaceRequest(
                IdentityDocumentReplaceRequest.builder()
                    .country("US")
                    .documentNumber("A12345678")
                    .documentType(IdentityDocumentType.PASSPORT)
                    .file("Example data")
                    .issuingAuthority("U.S. Department of State")
                    .side(IdentityDocumentReplaceRequest.Side.FRONT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentReplaceParams.builder()
                .documentId("documentId")
                .documentReplaceRequest(
                    IdentityDocumentReplaceRequest.builder()
                        .country("US")
                        .documentNumber("A12345678")
                        .documentType(IdentityDocumentType.PASSPORT)
                        .file("Example data")
                        .issuingAuthority("U.S. Department of State")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("documentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DocumentReplaceParams.builder()
                .documentId("documentId")
                .documentReplaceRequest(
                    IdentityDocumentReplaceRequest.builder()
                        .country("US")
                        .documentNumber("A12345678")
                        .documentType(IdentityDocumentType.PASSPORT)
                        .file("Example data")
                        .issuingAuthority("U.S. Department of State")
                        .side(IdentityDocumentReplaceRequest.Side.FRONT)
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
                        "DocumentReplaceRequest" to
                            MultipartField.of(
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
                            )
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentReplaceParams.builder()
                .documentId("documentId")
                .documentReplaceRequest(
                    IdentityDocumentReplaceRequest.builder()
                        .country("US")
                        .documentNumber("A12345678")
                        .documentType(IdentityDocumentType.PASSPORT)
                        .file("Example data")
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
                        "DocumentReplaceRequest" to
                            MultipartField.of(
                                DocumentReplaceRequest.ofIdentity(
                                    IdentityDocumentReplaceRequest.builder()
                                        .country("US")
                                        .documentNumber("A12345678")
                                        .documentType(IdentityDocumentType.PASSPORT)
                                        .file("Example data")
                                        .issuingAuthority("U.S. Department of State")
                                        .build()
                                )
                            )
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
