// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestWebhookWebhookEventTest {

    @Test
    fun create() {
        val testWebhookWebhookEvent =
            TestWebhookWebhookEvent.builder()
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(TestWebhookWebhookEvent.Type.TEST)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        assertThat(testWebhookWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(testWebhookWebhookEvent.type()).isEqualTo(TestWebhookWebhookEvent.Type.TEST)
        assertThat(testWebhookWebhookEvent.webhookId())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testWebhookWebhookEvent =
            TestWebhookWebhookEvent.builder()
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(TestWebhookWebhookEvent.Type.TEST)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val roundtrippedTestWebhookWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testWebhookWebhookEvent),
                jacksonTypeRef<TestWebhookWebhookEvent>(),
            )

        assertThat(roundtrippedTestWebhookWebhookEvent).isEqualTo(testWebhookWebhookEvent)
    }
}
