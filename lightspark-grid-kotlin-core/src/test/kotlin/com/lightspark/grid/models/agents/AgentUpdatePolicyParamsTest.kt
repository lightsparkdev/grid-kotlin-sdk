// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdatePolicyParamsTest {

    @Test
    fun create() {
        AgentUpdatePolicyParams.builder()
            .agentId("agentId")
            .accountRestrictions(
                AgentUpdatePolicyParams.AccountRestrictions.builder()
                    .addAccountRule(
                        AgentUpdatePolicyParams.AccountRestrictions.AccountRule.builder()
                            .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .executionMode(
                                AgentUpdatePolicyParams.AccountRestrictions.AccountRule
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
                AgentUpdatePolicyParams.ApprovalThresholds.builder()
                    .amount(100000L)
                    .currency("USD")
                    .build()
            )
            .defaultExecutionMode(AgentUpdatePolicyParams.DefaultExecutionMode.AUTO)
            .addPermission(AgentUpdatePolicyParams.Permission.VIEW_TRANSACTIONS)
            .spendingLimits(
                AgentUpdatePolicyParams.SpendingLimits.builder()
                    .currency("USD")
                    .dailyLimit(500000L)
                    .dailyTransactionLimit(10L)
                    .monthlyLimit(5000000L)
                    .perTransactionLimit(50000L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdatePolicyParams.builder().agentId("agentId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdatePolicyParams.builder()
                .agentId("agentId")
                .accountRestrictions(
                    AgentUpdatePolicyParams.AccountRestrictions.builder()
                        .addAccountRule(
                            AgentUpdatePolicyParams.AccountRestrictions.AccountRule.builder()
                                .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .executionMode(
                                    AgentUpdatePolicyParams.AccountRestrictions.AccountRule
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
                    AgentUpdatePolicyParams.ApprovalThresholds.builder()
                        .amount(100000L)
                        .currency("USD")
                        .build()
                )
                .defaultExecutionMode(AgentUpdatePolicyParams.DefaultExecutionMode.AUTO)
                .addPermission(AgentUpdatePolicyParams.Permission.VIEW_TRANSACTIONS)
                .spendingLimits(
                    AgentUpdatePolicyParams.SpendingLimits.builder()
                        .currency("USD")
                        .dailyLimit(500000L)
                        .dailyTransactionLimit(10L)
                        .monthlyLimit(5000000L)
                        .perTransactionLimit(50000L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountRestrictions())
            .isEqualTo(
                AgentUpdatePolicyParams.AccountRestrictions.builder()
                    .addAccountRule(
                        AgentUpdatePolicyParams.AccountRestrictions.AccountRule.builder()
                            .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .executionMode(
                                AgentUpdatePolicyParams.AccountRestrictions.AccountRule
                                    .ExecutionMode
                                    .AUTO
                            )
                            .perTransactionLimit(10000L)
                            .build()
                    )
                    .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )
        assertThat(body.approvalThresholds())
            .isEqualTo(
                AgentUpdatePolicyParams.ApprovalThresholds.builder()
                    .amount(100000L)
                    .currency("USD")
                    .build()
            )
        assertThat(body.defaultExecutionMode())
            .isEqualTo(AgentUpdatePolicyParams.DefaultExecutionMode.AUTO)
        assertThat(body.permissions())
            .containsExactly(AgentUpdatePolicyParams.Permission.VIEW_TRANSACTIONS)
        assertThat(body.spendingLimits())
            .isEqualTo(
                AgentUpdatePolicyParams.SpendingLimits.builder()
                    .currency("USD")
                    .dailyLimit(500000L)
                    .dailyTransactionLimit(10L)
                    .monthlyLimit(5000000L)
                    .perTransactionLimit(50000L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdatePolicyParams.builder().agentId("agentId").build()

        val body = params._body()
    }
}
