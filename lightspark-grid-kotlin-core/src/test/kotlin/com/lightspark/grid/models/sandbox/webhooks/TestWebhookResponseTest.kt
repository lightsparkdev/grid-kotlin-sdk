// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestWebhookResponseTest {

    @Test
    fun create() {
        val testWebhookResponse =
            TestWebhookResponse.builder()
                .responseStatus(200L)
                .responseBody("response_body")
                .url("https://api.mycompany.com/webhooks/uma")
                .build()

        assertThat(testWebhookResponse.responseStatus()).isEqualTo(200L)
        assertThat(testWebhookResponse.responseBody()).isEqualTo("response_body")
        assertThat(testWebhookResponse.url()).isEqualTo("https://api.mycompany.com/webhooks/uma")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testWebhookResponse =
            TestWebhookResponse.builder()
                .responseStatus(200L)
                .responseBody("response_body")
                .url("https://api.mycompany.com/webhooks/uma")
                .build()

        val roundtrippedTestWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testWebhookResponse),
                jacksonTypeRef<TestWebhookResponse>(),
            )

        assertThat(roundtrippedTestWebhookResponse).isEqualTo(testWebhookResponse)
    }
}
