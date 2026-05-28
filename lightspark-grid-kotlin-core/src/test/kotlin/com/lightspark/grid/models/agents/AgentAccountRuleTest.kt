// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentAccountRuleTest {

    @Test
    fun create() {
        val agentAccountRule =
            AgentAccountRule.builder()
                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                .executionMode(AgentExecutionMode.AUTO)
                .perTransactionLimit(10000L)
                .build()

        assertThat(agentAccountRule.accountId())
            .isEqualTo("Account:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentAccountRule.executionMode()).isEqualTo(AgentExecutionMode.AUTO)
        assertThat(agentAccountRule.perTransactionLimit()).isEqualTo(10000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentAccountRule =
            AgentAccountRule.builder()
                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                .executionMode(AgentExecutionMode.AUTO)
                .perTransactionLimit(10000L)
                .build()

        val roundtrippedAgentAccountRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentAccountRule),
                jacksonTypeRef<AgentAccountRule>(),
            )

        assertThat(roundtrippedAgentAccountRule).isEqualTo(agentAccountRule)
    }
}
