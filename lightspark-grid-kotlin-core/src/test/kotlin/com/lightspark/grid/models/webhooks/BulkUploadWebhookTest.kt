// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.BulkCustomerImportErrorEntry
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkUploadWebhookTest {

    @Test
    fun create() {
        val bulkUploadWebhook =
            BulkUploadWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("BULK_UPLOAD.COMPLETED"))
                .data(
                    BulkUploadWebhook.Data.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhook.Data.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhook.Data.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkCustomerImportErrorEntry.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkCustomerImportErrorEntry.Details.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(bulkUploadWebhook.id()).isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(bulkUploadWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(bulkUploadWebhook._type()).isEqualTo(JsonValue.from("BULK_UPLOAD.COMPLETED"))
        assertThat(bulkUploadWebhook.data())
            .isEqualTo(
                BulkUploadWebhook.Data.builder()
                    .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                    .progress(
                        BulkUploadWebhook.Data.Progress.builder()
                            .failed(50L)
                            .processed(2500L)
                            .successful(2450L)
                            .total(5000L)
                            .build()
                    )
                    .status(BulkUploadWebhook.Data.Status.PROCESSING)
                    .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .addError(
                        BulkCustomerImportErrorEntry.builder()
                            .correlationId("biz456")
                            .code("code")
                            .details(
                                BulkCustomerImportErrorEntry.Details.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .message("message")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkUploadWebhook =
            BulkUploadWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("BULK_UPLOAD.COMPLETED"))
                .data(
                    BulkUploadWebhook.Data.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhook.Data.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhook.Data.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkCustomerImportErrorEntry.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkCustomerImportErrorEntry.Details.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBulkUploadWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkUploadWebhook),
                jacksonTypeRef<BulkUploadWebhook>(),
            )

        assertThat(roundtrippedBulkUploadWebhook).isEqualTo(bulkUploadWebhook)
    }
}
