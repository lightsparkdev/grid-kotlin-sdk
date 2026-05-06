// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateResponseTest {

    @Test
    fun create() {
        val agentUpdateResponse =
            AgentUpdateResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    AgentPolicy.builder()
                        .defaultExecutionMode(AgentPolicy.DefaultExecutionMode.AUTO)
                        .addPermission(AgentPolicy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentPolicy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentPolicy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentPolicy.AccountRestrictions.AccountRule.builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentPolicy.AccountRestrictions.AccountRule
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
                            AgentPolicy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    AgentUsage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        assertThat(agentUpdateResponse.id()).isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(agentUpdateResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentUpdateResponse.isConnected()).isEqualTo(true)
        assertThat(agentUpdateResponse.isPaused()).isEqualTo(false)
        assertThat(agentUpdateResponse.name()).isEqualTo("Payroll Automation Agent")
        assertThat(agentUpdateResponse.policy())
            .isEqualTo(
                AgentPolicy.builder()
                    .defaultExecutionMode(AgentPolicy.DefaultExecutionMode.AUTO)
                    .addPermission(AgentPolicy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentPolicy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        AgentPolicy.AccountRestrictions.builder()
                            .addAccountRule(
                                AgentPolicy.AccountRestrictions.AccountRule.builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        AgentPolicy.AccountRestrictions.AccountRule.ExecutionMode
                                            .AUTO
                                    )
                                    .perTransactionLimit(10000L)
                                    .build()
                            )
                            .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .approvalThresholds(
                        AgentPolicy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(agentUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(agentUpdateResponse.usage())
            .isEqualTo(
                AgentUsage.builder()
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
        val agentUpdateResponse =
            AgentUpdateResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    AgentPolicy.builder()
                        .defaultExecutionMode(AgentPolicy.DefaultExecutionMode.AUTO)
                        .addPermission(AgentPolicy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentPolicy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentPolicy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentPolicy.AccountRestrictions.AccountRule.builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentPolicy.AccountRestrictions.AccountRule
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
                            AgentPolicy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    AgentUsage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        val roundtrippedAgentUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdateResponse),
                jacksonTypeRef<AgentUpdateResponse>(),
            )

        assertThat(roundtrippedAgentUpdateResponse).isEqualTo(agentUpdateResponse)
    }
}
