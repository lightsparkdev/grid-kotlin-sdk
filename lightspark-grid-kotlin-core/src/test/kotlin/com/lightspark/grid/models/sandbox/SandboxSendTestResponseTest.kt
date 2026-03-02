// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxSendTestResponseTest {

    @Test
    fun create() {
        val sandboxSendTestResponse =
            SandboxSendTestResponse.builder()
                .responseStatus(200L)
                .responseBody("response_body")
                .url("https://api.mycompany.com/webhooks/uma")
                .build()

        assertThat(sandboxSendTestResponse.responseStatus()).isEqualTo(200L)
        assertThat(sandboxSendTestResponse.responseBody()).isEqualTo("response_body")
        assertThat(sandboxSendTestResponse.url())
            .isEqualTo("https://api.mycompany.com/webhooks/uma")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxSendTestResponse =
            SandboxSendTestResponse.builder()
                .responseStatus(200L)
                .responseBody("response_body")
                .url("https://api.mycompany.com/webhooks/uma")
                .build()

        val roundtrippedSandboxSendTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxSendTestResponse),
                jacksonTypeRef<SandboxSendTestResponse>(),
            )

        assertThat(roundtrippedSandboxSendTestResponse).isEqualTo(sandboxSendTestResponse)
    }
}
