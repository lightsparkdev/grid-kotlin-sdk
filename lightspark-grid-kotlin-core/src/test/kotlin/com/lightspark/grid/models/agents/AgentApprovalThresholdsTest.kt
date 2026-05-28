// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentApprovalThresholdsTest {

    @Test
    fun create() {
        val agentApprovalThresholds =
            AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()

        assertThat(agentApprovalThresholds.amount()).isEqualTo(100000L)
        assertThat(agentApprovalThresholds.currency()).isEqualTo("USD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentApprovalThresholds =
            AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()

        val roundtrippedAgentApprovalThresholds =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentApprovalThresholds),
                jacksonTypeRef<AgentApprovalThresholds>(),
            )

        assertThat(roundtrippedAgentApprovalThresholds).isEqualTo(agentApprovalThresholds)
    }
}
