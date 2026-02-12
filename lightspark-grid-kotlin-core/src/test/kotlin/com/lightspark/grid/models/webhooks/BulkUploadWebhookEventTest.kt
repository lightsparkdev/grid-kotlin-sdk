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
                .bulkCustomerImportJob(
                    BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                        .jobId("Job:019542f5-b3e7-1d02-0000-000000000006")
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
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        assertThat(bulkUploadWebhookEvent.bulkCustomerImportJob())
            .isEqualTo(
                BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                    .jobId("Job:019542f5-b3e7-1d02-0000-000000000006")
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
        assertThat(bulkUploadWebhookEvent.webhookId())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkUploadWebhookEvent =
            BulkUploadWebhookEvent.builder()
                .bulkCustomerImportJob(
                    BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                        .jobId("Job:019542f5-b3e7-1d02-0000-000000000006")
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
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val roundtrippedBulkUploadWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkUploadWebhookEvent),
                jacksonTypeRef<BulkUploadWebhookEvent>(),
            )

        assertThat(roundtrippedBulkUploadWebhookEvent).isEqualTo(bulkUploadWebhookEvent)
    }
}
