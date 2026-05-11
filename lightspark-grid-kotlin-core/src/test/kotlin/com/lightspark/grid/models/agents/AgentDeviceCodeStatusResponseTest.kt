// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDeviceCodeStatusResponseTest {

    @Test
    fun create() {
        val agentDeviceCodeStatusResponse =
            AgentDeviceCodeStatusResponse.builder()
                .code("GRID-AGENT-X7K9-M2P4")
                .redeemed(false)
                .build()

        assertThat(agentDeviceCodeStatusResponse.code()).isEqualTo("GRID-AGENT-X7K9-M2P4")
        assertThat(agentDeviceCodeStatusResponse.redeemed()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDeviceCodeStatusResponse =
            AgentDeviceCodeStatusResponse.builder()
                .code("GRID-AGENT-X7K9-M2P4")
                .redeemed(false)
                .build()

        val roundtrippedAgentDeviceCodeStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDeviceCodeStatusResponse),
                jacksonTypeRef<AgentDeviceCodeStatusResponse>(),
            )

        assertThat(roundtrippedAgentDeviceCodeStatusResponse)
            .isEqualTo(agentDeviceCodeStatusResponse)
    }
}
