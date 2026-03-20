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
            .country("US")
            .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
            .documentType(DocumentUploadParams.DocumentType.PASSPORT)
            .file("Example data".byteInputStream())
            .documentNumber("A12345678")
            .side(DocumentUploadParams.Side.FRONT)
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentUploadParams.builder()
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentUploadParams.DocumentType.PASSPORT)
                .file("Example data".byteInputStream())
                .documentNumber("A12345678")
                .side(DocumentUploadParams.Side.FRONT)
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
                        "documentHolder" to
                            MultipartField.of(
                                "BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001"
                            ),
                        "documentType" to
                            MultipartField.of(DocumentUploadParams.DocumentType.PASSPORT),
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "documentNumber" to MultipartField.of("A12345678"),
                        "side" to MultipartField.of(DocumentUploadParams.Side.FRONT),
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
                .country("US")
                .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .documentType(DocumentUploadParams.DocumentType.PASSPORT)
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
                        "documentHolder" to
                            MultipartField.of(
                                "BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001"
                            ),
                        "documentType" to
                            MultipartField.of(DocumentUploadParams.DocumentType.PASSPORT),
                        "file" to MultipartField.of("Example data".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
