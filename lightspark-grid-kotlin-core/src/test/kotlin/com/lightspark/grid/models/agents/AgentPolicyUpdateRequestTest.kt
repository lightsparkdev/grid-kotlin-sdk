// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentPolicyUpdateRequestTest {

    @Test
    fun create() {
        val agentPolicyUpdateRequest =
            AgentPolicyUpdateRequest.builder()
                .accountRestrictions(
                    AgentAccountRestrictions.builder()
                        .addAccountRule(
                            AgentAccountRule.builder()
                                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .executionMode(AgentAccountRule.ExecutionMode.AUTO)
                                .perTransactionLimit(10000L)
                                .build()
                        )
                        .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .approvalThresholds(
                    AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()
                )
                .defaultExecutionMode(AgentPolicyUpdateRequest.DefaultExecutionMode.AUTO)
                .addPermission(AgentPolicyUpdateRequest.Permission.VIEW_TRANSACTIONS)
                .spendingLimits(
                    AgentPolicyUpdateRequest.SpendingLimits.builder()
                        .currency("USD")
                        .dailyLimit(500000L)
                        .dailyTransactionLimit(10L)
                        .monthlyLimit(5000000L)
                        .perTransactionLimit(50000L)
                        .build()
                )
                .build()

        assertThat(agentPolicyUpdateRequest.accountRestrictions())
            .isEqualTo(
                AgentAccountRestrictions.builder()
                    .addAccountRule(
                        AgentAccountRule.builder()
                            .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .executionMode(AgentAccountRule.ExecutionMode.AUTO)
                            .perTransactionLimit(10000L)
                            .build()
                    )
                    .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )
        assertThat(agentPolicyUpdateRequest.approvalThresholds())
            .isEqualTo(AgentApprovalThresholds.builder().amount(100000L).currency("USD").build())
        assertThat(agentPolicyUpdateRequest.defaultExecutionMode())
            .isEqualTo(AgentPolicyUpdateRequest.DefaultExecutionMode.AUTO)
        assertThat(agentPolicyUpdateRequest.permissions())
            .containsExactly(AgentPolicyUpdateRequest.Permission.VIEW_TRANSACTIONS)
        assertThat(agentPolicyUpdateRequest.spendingLimits())
            .isEqualTo(
                AgentPolicyUpdateRequest.SpendingLimits.builder()
                    .currency("USD")
                    .dailyLimit(500000L)
                    .dailyTransactionLimit(10L)
                    .monthlyLimit(5000000L)
                    .perTransactionLimit(50000L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentPolicyUpdateRequest =
            AgentPolicyUpdateRequest.builder()
                .accountRestrictions(
                    AgentAccountRestrictions.builder()
                        .addAccountRule(
                            AgentAccountRule.builder()
                                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .executionMode(AgentAccountRule.ExecutionMode.AUTO)
                                .perTransactionLimit(10000L)
                                .build()
                        )
                        .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .approvalThresholds(
                    AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()
                )
                .defaultExecutionMode(AgentPolicyUpdateRequest.DefaultExecutionMode.AUTO)
                .addPermission(AgentPolicyUpdateRequest.Permission.VIEW_TRANSACTIONS)
                .spendingLimits(
                    AgentPolicyUpdateRequest.SpendingLimits.builder()
                        .currency("USD")
                        .dailyLimit(500000L)
                        .dailyTransactionLimit(10L)
                        .monthlyLimit(5000000L)
                        .perTransactionLimit(50000L)
                        .build()
                )
                .build()

        val roundtrippedAgentPolicyUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentPolicyUpdateRequest),
                jacksonTypeRef<AgentPolicyUpdateRequest>(),
            )

        assertThat(roundtrippedAgentPolicyUpdateRequest).isEqualTo(agentPolicyUpdateRequest)
    }
}
