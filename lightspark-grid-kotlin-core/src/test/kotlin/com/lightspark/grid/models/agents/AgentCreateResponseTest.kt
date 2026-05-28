// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateResponseTest {

    @Test
    fun create() {
        val agentCreateResponse =
            AgentCreateResponse.builder()
                .agent(
                    Agent.builder()
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
                                    AgentAccountRestrictions.builder()
                                        .addAccountRule(
                                            AgentAccountRule.builder()
                                                .accountId(
                                                    "Account:019542f5-b3e7-1d02-0000-000000000001"
                                                )
                                                .executionMode(AgentAccountRule.ExecutionMode.AUTO)
                                                .perTransactionLimit(10000L)
                                                .build()
                                        )
                                        .addAllowedAccountId(
                                            "Account:019542f5-b3e7-1d02-0000-000000000001"
                                        )
                                        .build()
                                )
                                .approvalThresholds(
                                    AgentApprovalThresholds.builder()
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
                )
                .deviceCode(
                    AgentDeviceCode.builder()
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                        .code("GRID-AGENT-X7K9-M2P4")
                        .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                        .redeemed(false)
                        .build()
                )
                .build()

        assertThat(agentCreateResponse.agent())
            .isEqualTo(
                Agent.builder()
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
                                AgentAccountRestrictions.builder()
                                    .addAccountRule(
                                        AgentAccountRule.builder()
                                            .accountId(
                                                "Account:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .executionMode(AgentAccountRule.ExecutionMode.AUTO)
                                            .perTransactionLimit(10000L)
                                            .build()
                                    )
                                    .addAllowedAccountId(
                                        "Account:019542f5-b3e7-1d02-0000-000000000001"
                                    )
                                    .build()
                            )
                            .approvalThresholds(
                                AgentApprovalThresholds.builder()
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
            )
        assertThat(agentCreateResponse.deviceCode())
            .isEqualTo(
                AgentDeviceCode.builder()
                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                    .code("GRID-AGENT-X7K9-M2P4")
                    .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                    .redeemed(false)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentCreateResponse =
            AgentCreateResponse.builder()
                .agent(
                    Agent.builder()
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
                                    AgentAccountRestrictions.builder()
                                        .addAccountRule(
                                            AgentAccountRule.builder()
                                                .accountId(
                                                    "Account:019542f5-b3e7-1d02-0000-000000000001"
                                                )
                                                .executionMode(AgentAccountRule.ExecutionMode.AUTO)
                                                .perTransactionLimit(10000L)
                                                .build()
                                        )
                                        .addAllowedAccountId(
                                            "Account:019542f5-b3e7-1d02-0000-000000000001"
                                        )
                                        .build()
                                )
                                .approvalThresholds(
                                    AgentApprovalThresholds.builder()
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
                )
                .deviceCode(
                    AgentDeviceCode.builder()
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                        .code("GRID-AGENT-X7K9-M2P4")
                        .expiresAt(OffsetDateTime.parse("2025-07-22T17:32:28Z"))
                        .redeemed(false)
                        .build()
                )
                .build()

        val roundtrippedAgentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentCreateResponse),
                jacksonTypeRef<AgentCreateResponse>(),
            )

        assertThat(roundtrippedAgentCreateResponse).isEqualTo(agentCreateResponse)
    }
}
