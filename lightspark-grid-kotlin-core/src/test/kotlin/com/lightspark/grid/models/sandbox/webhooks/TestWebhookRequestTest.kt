// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestWebhookRequestTest {

    @Test
    fun create() {
        val testWebhookRequest =
            TestWebhookRequest.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("TEST"))
                .build()

        assertThat(testWebhookRequest.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(testWebhookRequest.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(testWebhookRequest._type()).isEqualTo(JsonValue.from("TEST"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testWebhookRequest =
            TestWebhookRequest.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("TEST"))
                .build()

        val roundtrippedTestWebhookRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testWebhookRequest),
                jacksonTypeRef<TestWebhookRequest>(),
            )

        assertThat(roundtrippedTestWebhookRequest).isEqualTo(testWebhookRequest)
    }
}
