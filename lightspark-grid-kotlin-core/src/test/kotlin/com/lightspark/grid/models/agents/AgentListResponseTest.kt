// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListResponseTest {

    @Test
    fun create() {
        val agentListResponse =
            AgentListResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    AgentListResponse.Policy.builder()
                        .defaultExecutionMode(AgentListResponse.Policy.DefaultExecutionMode.AUTO)
                        .addPermission(AgentListResponse.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentListResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentListResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentListResponse.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentListResponse.Policy.AccountRestrictions.AccountRule
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
                            AgentListResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    AgentListResponse.Usage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        assertThat(agentListResponse.id()).isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(agentListResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentListResponse.isConnected()).isEqualTo(true)
        assertThat(agentListResponse.isPaused()).isEqualTo(false)
        assertThat(agentListResponse.name()).isEqualTo("Payroll Automation Agent")
        assertThat(agentListResponse.policy())
            .isEqualTo(
                AgentListResponse.Policy.builder()
                    .defaultExecutionMode(AgentListResponse.Policy.DefaultExecutionMode.AUTO)
                    .addPermission(AgentListResponse.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentListResponse.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        AgentListResponse.Policy.AccountRestrictions.builder()
                            .addAccountRule(
                                AgentListResponse.Policy.AccountRestrictions.AccountRule.builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        AgentListResponse.Policy.AccountRestrictions.AccountRule
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
                        AgentListResponse.Policy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(agentListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(agentListResponse.usage())
            .isEqualTo(
                AgentListResponse.Usage.builder()
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
        val agentListResponse =
            AgentListResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    AgentListResponse.Policy.builder()
                        .defaultExecutionMode(AgentListResponse.Policy.DefaultExecutionMode.AUTO)
                        .addPermission(AgentListResponse.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentListResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentListResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentListResponse.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentListResponse.Policy.AccountRestrictions.AccountRule
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
                            AgentListResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    AgentListResponse.Usage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        val roundtrippedAgentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListResponse),
                jacksonTypeRef<AgentListResponse>(),
            )

        assertThat(roundtrippedAgentListResponse).isEqualTo(agentListResponse)
    }
}
