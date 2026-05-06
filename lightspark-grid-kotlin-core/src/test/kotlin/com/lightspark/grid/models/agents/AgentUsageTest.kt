// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUsageTest {

    @Test
    fun create() {
        val agentUsage =
            AgentUsage.builder()
                .dailySpend(150000L)
                .dailyTransactionCount(3L)
                .monthlySpend(750000L)
                .dailyResetDate(LocalDate.parse("2025-07-22"))
                .monthlyResetMonth("2025-08")
                .build()

        assertThat(agentUsage.dailySpend()).isEqualTo(150000L)
        assertThat(agentUsage.dailyTransactionCount()).isEqualTo(3L)
        assertThat(agentUsage.monthlySpend()).isEqualTo(750000L)
        assertThat(agentUsage.dailyResetDate()).isEqualTo(LocalDate.parse("2025-07-22"))
        assertThat(agentUsage.monthlyResetMonth()).isEqualTo("2025-08")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentUsage =
            AgentUsage.builder()
                .dailySpend(150000L)
                .dailyTransactionCount(3L)
                .monthlySpend(750000L)
                .dailyResetDate(LocalDate.parse("2025-07-22"))
                .monthlyResetMonth("2025-08")
                .build()

        val roundtrippedAgentUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUsage),
                jacksonTypeRef<AgentUsage>(),
            )

        assertThat(roundtrippedAgentUsage).isEqualTo(agentUsage)
    }
}
