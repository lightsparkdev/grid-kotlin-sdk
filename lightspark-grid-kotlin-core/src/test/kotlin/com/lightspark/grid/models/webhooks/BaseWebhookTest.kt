// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseWebhookTest {

    @Test
    fun create() {
        val baseWebhook =
            BaseWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(baseWebhook.id()).isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(baseWebhook.timestamp()).isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(baseWebhook._type()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseWebhook =
            BaseWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedBaseWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseWebhook),
                jacksonTypeRef<BaseWebhook>(),
            )

        assertThat(roundtrippedBaseWebhook).isEqualTo(baseWebhook)
    }
}
