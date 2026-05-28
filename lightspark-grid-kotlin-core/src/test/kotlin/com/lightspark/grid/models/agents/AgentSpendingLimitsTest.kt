// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSpendingLimitsTest {

    @Test
    fun create() {
        val agentSpendingLimits =
            AgentSpendingLimits.builder()
                .currency("USD")
                .perTransactionLimit(50000L)
                .dailyLimit(500000L)
                .dailyTransactionLimit(10L)
                .monthlyLimit(5000000L)
                .build()

        assertThat(agentSpendingLimits.currency()).isEqualTo("USD")
        assertThat(agentSpendingLimits.perTransactionLimit()).isEqualTo(50000L)
        assertThat(agentSpendingLimits.dailyLimit()).isEqualTo(500000L)
        assertThat(agentSpendingLimits.dailyTransactionLimit()).isEqualTo(10L)
        assertThat(agentSpendingLimits.monthlyLimit()).isEqualTo(5000000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentSpendingLimits =
            AgentSpendingLimits.builder()
                .currency("USD")
                .perTransactionLimit(50000L)
                .dailyLimit(500000L)
                .dailyTransactionLimit(10L)
                .monthlyLimit(5000000L)
                .build()

        val roundtrippedAgentSpendingLimits =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentSpendingLimits),
                jacksonTypeRef<AgentSpendingLimits>(),
            )

        assertThat(roundtrippedAgentSpendingLimits).isEqualTo(agentSpendingLimits)
    }
}
