// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdatePolicyResponseTest {

    @Test
    fun create() {
        val agentUpdatePolicyResponse =
            AgentUpdatePolicyResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    AgentUpdatePolicyResponse.Policy.builder()
                        .defaultExecutionMode(
                            AgentUpdatePolicyResponse.Policy.DefaultExecutionMode.AUTO
                        )
                        .addPermission(
                            AgentUpdatePolicyResponse.Policy.Permission.VIEW_TRANSACTIONS
                        )
                        .spendingLimits(
                            AgentUpdatePolicyResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentUpdatePolicyResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentUpdatePolicyResponse.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentUpdatePolicyResponse.Policy.AccountRestrictions
                                                .AccountRule
                                                .ExecutionMode
                                                .AUTO
                                        )
                                        .perTransactionLimit(10000L)
                                        .build()
                                )
                                .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .build()
                        )
                        .approvalThresholds(
                            AgentUpdatePolicyResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    AgentUpdatePolicyResponse.Usage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        assertThat(agentUpdatePolicyResponse.id())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentUpdatePolicyResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(agentUpdatePolicyResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentUpdatePolicyResponse.isConnected()).isEqualTo(true)
        assertThat(agentUpdatePolicyResponse.isPaused()).isEqualTo(false)
        assertThat(agentUpdatePolicyResponse.name()).isEqualTo("Payroll Automation Agent")
        assertThat(agentUpdatePolicyResponse.policy())
            .isEqualTo(
                AgentUpdatePolicyResponse.Policy.builder()
                    .defaultExecutionMode(
                        AgentUpdatePolicyResponse.Policy.DefaultExecutionMode.AUTO
                    )
                    .addPermission(AgentUpdatePolicyResponse.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentUpdatePolicyResponse.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        AgentUpdatePolicyResponse.Policy.AccountRestrictions.builder()
                            .addAccountRule(
                                AgentUpdatePolicyResponse.Policy.AccountRestrictions.AccountRule
                                    .builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        AgentUpdatePolicyResponse.Policy.AccountRestrictions
                                            .AccountRule
                                            .ExecutionMode
                                            .AUTO
                                    )
                                    .perTransactionLimit(10000L)
                                    .build()
                            )
                            .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .approvalThresholds(
                        AgentUpdatePolicyResponse.Policy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(agentUpdatePolicyResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(agentUpdatePolicyResponse.usage())
            .isEqualTo(
                AgentUpdatePolicyResponse.Usage.builder()
                    .dailySpend(150000L)
                    .dailyTransactionCount(3L)
                    .monthlySpend(750000L)
                    .dailyResetDate(LocalDate.parse("2025-07-22"))
                    .monthlyResetMonth("2025-08")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentUpdatePolicyResponse =
            AgentUpdatePolicyResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    AgentUpdatePolicyResponse.Policy.builder()
                        .defaultExecutionMode(
                            AgentUpdatePolicyResponse.Policy.DefaultExecutionMode.AUTO
                        )
                        .addPermission(
                            AgentUpdatePolicyResponse.Policy.Permission.VIEW_TRANSACTIONS
                        )
                        .spendingLimits(
                            AgentUpdatePolicyResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentUpdatePolicyResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentUpdatePolicyResponse.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentUpdatePolicyResponse.Policy.AccountRestrictions
                                                .AccountRule
                                                .ExecutionMode
                                                .AUTO
                                        )
                                        .perTransactionLimit(10000L)
                                        .build()
                                )
                                .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .build()
                        )
                        .approvalThresholds(
                            AgentUpdatePolicyResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    AgentUpdatePolicyResponse.Usage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        val roundtrippedAgentUpdatePolicyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdatePolicyResponse),
                jacksonTypeRef<AgentUpdatePolicyResponse>(),
            )

        assertThat(roundtrippedAgentUpdatePolicyResponse).isEqualTo(agentUpdatePolicyResponse)
    }
}
