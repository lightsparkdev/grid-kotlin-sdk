// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkUploadWebhookEventTest {

    @Test
    fun create() {
        val bulkUploadWebhookEvent =
            BulkUploadWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .bulkCustomerImportJob(
                    BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhookEvent.BulkCustomerImportJob.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhookEvent.BulkCustomerImportJob.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkUploadWebhookEvent.BulkCustomerImportJob.Error.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkUploadWebhookEvent.BulkCustomerImportJob.Error.Details
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD)
                .build()

        assertThat(bulkUploadWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(bulkUploadWebhookEvent.bulkCustomerImportJob())
            .isEqualTo(
                BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                    .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                    .progress(
                        BulkUploadWebhookEvent.BulkCustomerImportJob.Progress.builder()
                            .failed(50L)
                            .processed(2500L)
                            .successful(2450L)
                            .total(5000L)
                            .build()
                    )
                    .status(BulkUploadWebhookEvent.BulkCustomerImportJob.Status.PROCESSING)
                    .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .addError(
                        BulkUploadWebhookEvent.BulkCustomerImportJob.Error.builder()
                            .correlationId("biz456")
                            .code("code")
                            .details(
                                BulkUploadWebhookEvent.BulkCustomerImportJob.Error.Details.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .message("message")
                            .build()
                    )
                    .build()
            )
        assertThat(bulkUploadWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(bulkUploadWebhookEvent.type()).isEqualTo(BulkUploadWebhookEvent.Type.BULK_UPLOAD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkUploadWebhookEvent =
            BulkUploadWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .bulkCustomerImportJob(
                    BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhookEvent.BulkCustomerImportJob.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhookEvent.BulkCustomerImportJob.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkUploadWebhookEvent.BulkCustomerImportJob.Error.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkUploadWebhookEvent.BulkCustomerImportJob.Error.Details
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD)
                .build()

        val roundtrippedBulkUploadWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkUploadWebhookEvent),
                jacksonTypeRef<BulkUploadWebhookEvent>(),
            )

        assertThat(roundtrippedBulkUploadWebhookEvent).isEqualTo(bulkUploadWebhookEvent)
    }
}
