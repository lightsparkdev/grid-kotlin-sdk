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
            .country("US")
            .documentType(DocumentReplaceParams.DocumentType.PASSPORT)
            .file("Example data".byteInputStream())
            .documentNumber("A12345678")
            .side(DocumentReplaceParams.Side.FRONT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentReplaceParams.builder()
                .documentId("documentId")
                .country("US")
                .documentType(DocumentReplaceParams.DocumentType.PASSPORT)
                .file("Example data".byteInputStream())
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
                .country("US")
                .documentType(DocumentReplaceParams.DocumentType.PASSPORT)
                .file("Example data".byteInputStream())
                .documentNumber("A12345678")
                .side(DocumentReplaceParams.Side.FRONT)
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
                        "country" to MultipartField.of("US"),
                        "documentType" to
                            MultipartField.of(DocumentReplaceParams.DocumentType.PASSPORT),
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "documentNumber" to MultipartField.of("A12345678"),
                        "side" to MultipartField.of(DocumentReplaceParams.Side.FRONT),
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
                .country("US")
                .documentType(DocumentReplaceParams.DocumentType.PASSPORT)
                .file("Example data".byteInputStream())
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
                        "country" to MultipartField.of("US"),
                        "documentType" to
                            MultipartField.of(DocumentReplaceParams.DocumentType.PASSPORT),
                        "file" to MultipartField.of("Example data".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
