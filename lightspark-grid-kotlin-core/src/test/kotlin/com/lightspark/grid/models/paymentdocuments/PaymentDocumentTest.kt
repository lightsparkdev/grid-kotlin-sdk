// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.paymentdocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentDocumentTest {

    @Test
    fun create() {
        val paymentDocument =
            PaymentDocument.builder()
                .id("PaymentDocument:019542f5-b3e7-1d02-0000-000000000001")
                .contentType("application/pdf")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentType(PaymentDocumentType.INVOICE)
                .expiresAt(OffsetDateTime.parse("2025-10-04T12:00:00Z"))
                .fileName("invoice-2025-0142.pdf")
                .sizeBytes(482133L)
                .status(PaymentDocumentStatus.UPLOADED)
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .build()

        assertThat(paymentDocument.id())
            .isEqualTo("PaymentDocument:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(paymentDocument.contentType()).isEqualTo("application/pdf")
        assertThat(paymentDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(paymentDocument.documentType()).isEqualTo(PaymentDocumentType.INVOICE)
        assertThat(paymentDocument.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-04T12:00:00Z"))
        assertThat(paymentDocument.fileName()).isEqualTo("invoice-2025-0142.pdf")
        assertThat(paymentDocument.sizeBytes()).isEqualTo(482133L)
        assertThat(paymentDocument.status()).isEqualTo(PaymentDocumentStatus.UPLOADED)
        assertThat(paymentDocument.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(paymentDocument.quoteId())
            .isEqualTo("Quote:019542f5-b3e7-1d02-0000-000000000006")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentDocument =
            PaymentDocument.builder()
                .id("PaymentDocument:019542f5-b3e7-1d02-0000-000000000001")
                .contentType("application/pdf")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .documentType(PaymentDocumentType.INVOICE)
                .expiresAt(OffsetDateTime.parse("2025-10-04T12:00:00Z"))
                .fileName("invoice-2025-0142.pdf")
                .sizeBytes(482133L)
                .status(PaymentDocumentStatus.UPLOADED)
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .build()

        val roundtrippedPaymentDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentDocument),
                jacksonTypeRef<PaymentDocument>(),
            )

        assertThat(roundtrippedPaymentDocument).isEqualTo(paymentDocument)
    }
}
