// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentAccountRestrictionsTest {

    @Test
    fun create() {
        val agentAccountRestrictions =
            AgentAccountRestrictions.builder()
                .addAccountRule(
                    AgentAccountRestrictions.AccountRule.builder()
                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                        .executionMode(AgentAccountRestrictions.AccountRule.ExecutionMode.AUTO)
                        .perTransactionLimit(10000L)
                        .build()
                )
                .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        assertThat(agentAccountRestrictions.accountRules())
            .containsExactly(
                AgentAccountRestrictions.AccountRule.builder()
                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                    .executionMode(AgentAccountRestrictions.AccountRule.ExecutionMode.AUTO)
                    .perTransactionLimit(10000L)
                    .build()
            )
        assertThat(agentAccountRestrictions.allowedAccountIds())
            .containsExactly("Account:019542f5-b3e7-1d02-0000-000000000001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentAccountRestrictions =
            AgentAccountRestrictions.builder()
                .addAccountRule(
                    AgentAccountRestrictions.AccountRule.builder()
                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                        .executionMode(AgentAccountRestrictions.AccountRule.ExecutionMode.AUTO)
                        .perTransactionLimit(10000L)
                        .build()
                )
                .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        val roundtrippedAgentAccountRestrictions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentAccountRestrictions),
                jacksonTypeRef<AgentAccountRestrictions>(),
            )

        assertThat(roundtrippedAgentAccountRestrictions).isEqualTo(agentAccountRestrictions)
    }
}
