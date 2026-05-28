// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentPolicyTest {

    @Test
    fun create() {
        val agentPolicy =
            AgentPolicy.builder()
                .defaultExecutionMode(AgentExecutionMode.AUTO)
                .addPermission(AgentPermission.VIEW_TRANSACTIONS)
                .spendingLimits(
                    AgentSpendingLimits.builder()
                        .currency("USD")
                        .perTransactionLimit(50000L)
                        .dailyLimit(500000L)
                        .dailyTransactionLimit(10L)
                        .monthlyLimit(5000000L)
                        .build()
                )
                .accountRestrictions(
                    AgentAccountRestrictions.builder()
                        .addAccountRule(
                            AgentAccountRule.builder()
                                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .executionMode(AgentExecutionMode.AUTO)
                                .perTransactionLimit(10000L)
                                .build()
                        )
                        .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .approvalThresholds(
                    AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()
                )
                .build()

        assertThat(agentPolicy.defaultExecutionMode()).isEqualTo(AgentExecutionMode.AUTO)
        assertThat(agentPolicy.permissions()).containsExactly(AgentPermission.VIEW_TRANSACTIONS)
        assertThat(agentPolicy.spendingLimits())
            .isEqualTo(
                AgentSpendingLimits.builder()
                    .currency("USD")
                    .perTransactionLimit(50000L)
                    .dailyLimit(500000L)
                    .dailyTransactionLimit(10L)
                    .monthlyLimit(5000000L)
                    .build()
            )
        assertThat(agentPolicy.accountRestrictions())
            .isEqualTo(
                AgentAccountRestrictions.builder()
                    .addAccountRule(
                        AgentAccountRule.builder()
                            .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .executionMode(AgentExecutionMode.AUTO)
                            .perTransactionLimit(10000L)
                            .build()
                    )
                    .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )
        assertThat(agentPolicy.approvalThresholds())
            .isEqualTo(AgentApprovalThresholds.builder().amount(100000L).currency("USD").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentPolicy =
            AgentPolicy.builder()
                .defaultExecutionMode(AgentExecutionMode.AUTO)
                .addPermission(AgentPermission.VIEW_TRANSACTIONS)
                .spendingLimits(
                    AgentSpendingLimits.builder()
                        .currency("USD")
                        .perTransactionLimit(50000L)
                        .dailyLimit(500000L)
                        .dailyTransactionLimit(10L)
                        .monthlyLimit(5000000L)
                        .build()
                )
                .accountRestrictions(
                    AgentAccountRestrictions.builder()
                        .addAccountRule(
                            AgentAccountRule.builder()
                                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .executionMode(AgentExecutionMode.AUTO)
                                .perTransactionLimit(10000L)
                                .build()
                        )
                        .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .approvalThresholds(
                    AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()
                )
                .build()

        val roundtrippedAgentPolicy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentPolicy),
                jacksonTypeRef<AgentPolicy>(),
            )

        assertThat(roundtrippedAgentPolicy).isEqualTo(agentPolicy)
    }
}
