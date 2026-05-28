// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSpendingLimitsUpdateTest {

    @Test
    fun create() {
        val agentSpendingLimitsUpdate =
            AgentSpendingLimitsUpdate.builder()
                .currency("USD")
                .dailyLimit(500000L)
                .dailyTransactionLimit(10L)
                .monthlyLimit(5000000L)
                .perTransactionLimit(50000L)
                .build()

        assertThat(agentSpendingLimitsUpdate.currency()).isEqualTo("USD")
        assertThat(agentSpendingLimitsUpdate.dailyLimit()).isEqualTo(500000L)
        assertThat(agentSpendingLimitsUpdate.dailyTransactionLimit()).isEqualTo(10L)
        assertThat(agentSpendingLimitsUpdate.monthlyLimit()).isEqualTo(5000000L)
        assertThat(agentSpendingLimitsUpdate.perTransactionLimit()).isEqualTo(50000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentSpendingLimitsUpdate =
            AgentSpendingLimitsUpdate.builder()
                .currency("USD")
                .dailyLimit(500000L)
                .dailyTransactionLimit(10L)
                .monthlyLimit(5000000L)
                .perTransactionLimit(50000L)
                .build()

        val roundtrippedAgentSpendingLimitsUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentSpendingLimitsUpdate),
                jacksonTypeRef<AgentSpendingLimitsUpdate>(),
            )

        assertThat(roundtrippedAgentSpendingLimitsUpdate).isEqualTo(agentSpendingLimitsUpdate)
    }
}
