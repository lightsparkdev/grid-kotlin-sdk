// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceCodeRegenerateResponseTest {

    @Test
    fun create() {
        val deviceCodeRegenerateResponse =
            DeviceCodeRegenerateResponse.builder()
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .code("GRID-AGENT-X7K9-M2P4")
                .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                .redeemed(false)
                .build()

        assertThat(deviceCodeRegenerateResponse.agentId())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(deviceCodeRegenerateResponse.code()).isEqualTo("GRID-AGENT-X7K9-M2P4")
        assertThat(deviceCodeRegenerateResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
        assertThat(deviceCodeRegenerateResponse.redeemed()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceCodeRegenerateResponse =
            DeviceCodeRegenerateResponse.builder()
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .code("GRID-AGENT-X7K9-M2P4")
                .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                .redeemed(false)
                .build()

        val roundtrippedDeviceCodeRegenerateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceCodeRegenerateResponse),
                jacksonTypeRef<DeviceCodeRegenerateResponse>(),
            )

        assertThat(roundtrippedDeviceCodeRegenerateResponse).isEqualTo(deviceCodeRegenerateResponse)
    }
}
