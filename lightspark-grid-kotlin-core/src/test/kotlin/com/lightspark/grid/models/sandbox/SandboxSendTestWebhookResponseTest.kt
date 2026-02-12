// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxSendTestWebhookResponseTest {

    @Test
    fun create() {
        val sandboxSendTestWebhookResponse =
            SandboxSendTestWebhookResponse.builder()
                .responseStatus(200L)
                .responseBody("response_body")
                .url("https://api.mycompany.com/webhooks/uma")
                .build()

        assertThat(sandboxSendTestWebhookResponse.responseStatus()).isEqualTo(200L)
        assertThat(sandboxSendTestWebhookResponse.responseBody()).isEqualTo("response_body")
        assertThat(sandboxSendTestWebhookResponse.url())
            .isEqualTo("https://api.mycompany.com/webhooks/uma")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxSendTestWebhookResponse =
            SandboxSendTestWebhookResponse.builder()
                .responseStatus(200L)
                .responseBody("response_body")
                .url("https://api.mycompany.com/webhooks/uma")
                .build()

        val roundtrippedSandboxSendTestWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxSendTestWebhookResponse),
                jacksonTypeRef<SandboxSendTestWebhookResponse>(),
            )

        assertThat(roundtrippedSandboxSendTestWebhookResponse)
            .isEqualTo(sandboxSendTestWebhookResponse)
    }
}
