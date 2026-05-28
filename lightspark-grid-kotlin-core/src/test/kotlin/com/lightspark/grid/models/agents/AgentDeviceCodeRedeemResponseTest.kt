// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDeviceCodeRedeemResponseTest {

    @Test
    fun create() {
        val agentDeviceCodeRedeemResponse =
            AgentDeviceCodeRedeemResponse.builder()
                .accessToken("gat_ed0ad25881e234cc28fb2dec0a4fe64e4172a3b9")
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .agentName("Payroll Automation Agent")
                .policy(
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
                            AgentApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(agentDeviceCodeRedeemResponse.accessToken())
            .isEqualTo("gat_ed0ad25881e234cc28fb2dec0a4fe64e4172a3b9")
        assertThat(agentDeviceCodeRedeemResponse.agentId())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(agentDeviceCodeRedeemResponse.agentName()).isEqualTo("Payroll Automation Agent")
        assertThat(agentDeviceCodeRedeemResponse.policy())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDeviceCodeRedeemResponse =
            AgentDeviceCodeRedeemResponse.builder()
                .accessToken("gat_ed0ad25881e234cc28fb2dec0a4fe64e4172a3b9")
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .agentName("Payroll Automation Agent")
                .policy(
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
                            AgentApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAgentDeviceCodeRedeemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDeviceCodeRedeemResponse),
                jacksonTypeRef<AgentDeviceCodeRedeemResponse>(),
            )

        assertThat(roundtrippedAgentDeviceCodeRedeemResponse)
            .isEqualTo(agentDeviceCodeRedeemResponse)
    }
}
