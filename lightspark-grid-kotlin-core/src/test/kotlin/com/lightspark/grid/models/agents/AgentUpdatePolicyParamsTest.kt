// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdatePolicyParamsTest {

    @Test
    fun create() {
        AgentUpdatePolicyParams.builder()
            .agentId("agentId")
            .agentPolicyUpdateRequest(
                AgentPolicyUpdateRequest.builder()
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
                    .defaultExecutionMode(AgentExecutionMode.AUTO)
                    .addPermission(AgentPermission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentSpendingLimitsUpdate.builder()
                            .currency("USD")
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .perTransactionLimit(50000L)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentUpdatePolicyParams.builder()
                .agentId("agentId")
                .agentPolicyUpdateRequest(AgentPolicyUpdateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdatePolicyParams.builder()
                .agentId("agentId")
                .agentPolicyUpdateRequest(
                    AgentPolicyUpdateRequest.builder()
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
                        .defaultExecutionMode(AgentExecutionMode.AUTO)
                        .addPermission(AgentPermission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentSpendingLimitsUpdate.builder()
                                .currency("USD")
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .perTransactionLimit(50000L)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AgentPolicyUpdateRequest.builder()
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
                    .defaultExecutionMode(AgentExecutionMode.AUTO)
                    .addPermission(AgentPermission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentSpendingLimitsUpdate.builder()
                            .currency("USD")
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .perTransactionLimit(50000L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentUpdatePolicyParams.builder()
                .agentId("agentId")
                .agentPolicyUpdateRequest(AgentPolicyUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AgentPolicyUpdateRequest.builder().build())
    }
}
