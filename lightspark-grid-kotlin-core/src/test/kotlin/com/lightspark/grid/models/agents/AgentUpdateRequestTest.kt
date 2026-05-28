// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateRequestTest {

    @Test
    fun create() {
        val agentUpdateRequest =
            AgentUpdateRequest.builder().isPaused(true).name("Updated Payroll Agent").build()

        assertThat(agentUpdateRequest.isPaused()).isEqualTo(true)
        assertThat(agentUpdateRequest.name()).isEqualTo("Updated Payroll Agent")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentUpdateRequest =
            AgentUpdateRequest.builder().isPaused(true).name("Updated Payroll Agent").build()

        val roundtrippedAgentUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdateRequest),
                jacksonTypeRef<AgentUpdateRequest>(),
            )

        assertThat(roundtrippedAgentUpdateRequest).isEqualTo(agentUpdateRequest)
    }
}
