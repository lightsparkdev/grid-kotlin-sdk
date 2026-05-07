// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDeviceCodeTest {

    @Test
    fun create() {
        val agentDeviceCode =
            AgentDeviceCode.builder()
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .code("GRID-AGENT-X7K9-M2P4")
                .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                .redeemed(false)
                .build()

        assertThat(agentDeviceCode.agentId())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentDeviceCode.code()).isEqualTo("GRID-AGENT-X7K9-M2P4")
        assertThat(agentDeviceCode.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
        assertThat(agentDeviceCode.redeemed()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDeviceCode =
            AgentDeviceCode.builder()
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .code("GRID-AGENT-X7K9-M2P4")
                .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                .redeemed(false)
                .build()

        val roundtrippedAgentDeviceCode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDeviceCode),
                jacksonTypeRef<AgentDeviceCode>(),
            )

        assertThat(roundtrippedAgentDeviceCode).isEqualTo(agentDeviceCode)
    }
}
