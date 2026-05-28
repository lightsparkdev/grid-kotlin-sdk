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
                DocumentReplaceRequest.builder()
                    .country("US")
                    .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                    .file("Example data")
                    .documentNumber("A12345678")
                    .issuingAuthority("U.S. Department of State")
                    .side(DocumentReplaceRequest.Side.FRONT)
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
                    DocumentReplaceRequest.builder()
                        .country("US")
                        .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                        .file("Example data")
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
                    DocumentReplaceRequest.builder()
                        .country("US")
                        .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                        .file("Example data")
                        .documentNumber("A12345678")
                        .issuingAuthority("U.S. Department of State")
                        .side(DocumentReplaceRequest.Side.FRONT)
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
                            MultipartField.builder<DocumentReplaceRequest>()
                                .value(
                                    DocumentReplaceRequest.builder()
                                        .country("US")
                                        .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                                        .file("Example data")
                                        .documentNumber("A12345678")
                                        .issuingAuthority("U.S. Department of State")
                                        .side(DocumentReplaceRequest.Side.FRONT)
                                        .build()
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
            DocumentReplaceParams.builder()
                .documentId("documentId")
                .documentReplaceRequest(
                    DocumentReplaceRequest.builder()
                        .country("US")
                        .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                        .file("Example data")
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
                            MultipartField.builder<DocumentReplaceRequest>()
                                .value(
                                    DocumentReplaceRequest.builder()
                                        .country("US")
                                        .documentType(DocumentReplaceRequest.DocumentType.PASSPORT)
                                        .file("Example data")
                                        .build()
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
