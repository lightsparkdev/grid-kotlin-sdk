// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceCodeGetStatusResponseTest {

    @Test
    fun create() {
        val deviceCodeGetStatusResponse =
            DeviceCodeGetStatusResponse.builder()
                .code("GRID-AGENT-X7K9-M2P4")
                .redeemed(false)
                .build()

        assertThat(deviceCodeGetStatusResponse.code()).isEqualTo("GRID-AGENT-X7K9-M2P4")
        assertThat(deviceCodeGetStatusResponse.redeemed()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceCodeGetStatusResponse =
            DeviceCodeGetStatusResponse.builder()
                .code("GRID-AGENT-X7K9-M2P4")
                .redeemed(false)
                .build()

        val roundtrippedDeviceCodeGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceCodeGetStatusResponse),
                jacksonTypeRef<DeviceCodeGetStatusResponse>(),
            )

        assertThat(roundtrippedDeviceCodeGetStatusResponse).isEqualTo(deviceCodeGetStatusResponse)
    }
}
