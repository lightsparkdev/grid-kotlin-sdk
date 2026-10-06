// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.paymentdocuments

import com.lightspark.grid.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentDocumentUploadParamsTest {

    @Test
    fun create() {
        PaymentDocumentUploadParams.builder()
            .documentType(PaymentDocumentType.INVOICE)
            .file("Example data".byteInputStream())
            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentDocumentUploadParams.builder()
                .documentType(PaymentDocumentType.INVOICE)
                .file("Example data".byteInputStream())
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                        "documentType" to MultipartField.of(PaymentDocumentType.INVOICE),
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "customerId" to
                            MultipartField.of("Customer:019542f5-b3e7-1d02-0000-000000000001"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentDocumentUploadParams.builder()
                .documentType(PaymentDocumentType.INVOICE)
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
                        "documentType" to MultipartField.of(PaymentDocumentType.INVOICE),
                        "file" to MultipartField.of("Example data".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
