// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceCodeRetrieveStatusResponseTest {

    @Test
    fun create() {
        val deviceCodeRetrieveStatusResponse =
            DeviceCodeRetrieveStatusResponse.builder()
                .code("GRID-AGENT-X7K9-M2P4")
                .redeemed(false)
                .build()

        assertThat(deviceCodeRetrieveStatusResponse.code()).isEqualTo("GRID-AGENT-X7K9-M2P4")
        assertThat(deviceCodeRetrieveStatusResponse.redeemed()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceCodeRetrieveStatusResponse =
            DeviceCodeRetrieveStatusResponse.builder()
                .code("GRID-AGENT-X7K9-M2P4")
                .redeemed(false)
                .build()

        val roundtrippedDeviceCodeRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceCodeRetrieveStatusResponse),
                jacksonTypeRef<DeviceCodeRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedDeviceCodeRetrieveStatusResponse)
            .isEqualTo(deviceCodeRetrieveStatusResponse)
    }
}
