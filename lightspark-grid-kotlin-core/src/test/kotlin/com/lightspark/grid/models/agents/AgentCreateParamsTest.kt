// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .agentCreateRequest(
                AgentCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                                        AgentAccountRestrictions.AccountRule.builder()
                                            .accountId(
                                                "Account:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .executionMode(
                                                AgentAccountRestrictions.AccountRule.ExecutionMode
                                                    .AUTO
                                            )
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
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentCreateParams.builder()
                .agentCreateRequest(
                    AgentCreateRequest.builder()
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                                            AgentAccountRestrictions.AccountRule.builder()
                                                .accountId(
                                                    "Account:019542f5-b3e7-1d02-0000-000000000001"
                                                )
                                                .executionMode(
                                                    AgentAccountRestrictions.AccountRule
                                                        .ExecutionMode
                                                        .AUTO
                                                )
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AgentCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                                        AgentAccountRestrictions.AccountRule.builder()
                                            .accountId(
                                                "Account:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .executionMode(
                                                AgentAccountRestrictions.AccountRule.ExecutionMode
                                                    .AUTO
                                            )
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
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .agentCreateRequest(
                    AgentCreateRequest.builder()
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .name("Payroll Automation Agent")
                        .policy(
                            AgentPolicy.builder()
                                .defaultExecutionMode(AgentPolicy.DefaultExecutionMode.AUTO)
                                .addPermission(AgentPolicy.Permission.VIEW_TRANSACTIONS)
                                .spendingLimits(
                                    AgentPolicy.SpendingLimits.builder()
                                        .currency("USD")
                                        .perTransactionLimit(50000L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AgentCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .name("Payroll Automation Agent")
                    .policy(
                        AgentPolicy.builder()
                            .defaultExecutionMode(AgentPolicy.DefaultExecutionMode.AUTO)
                            .addPermission(AgentPolicy.Permission.VIEW_TRANSACTIONS)
                            .spendingLimits(
                                AgentPolicy.SpendingLimits.builder()
                                    .currency("USD")
                                    .perTransactionLimit(50000L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
