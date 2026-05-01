// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
            .name("Payroll Automation Agent")
            .policy(
                AgentCreateParams.Policy.builder()
                    .defaultExecutionMode(AgentCreateParams.Policy.DefaultExecutionMode.AUTO)
                    .addPermission(AgentCreateParams.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentCreateParams.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        AgentCreateParams.Policy.AccountRestrictions.builder()
                            .addAccountRule(
                                AgentCreateParams.Policy.AccountRestrictions.AccountRule.builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        AgentCreateParams.Policy.AccountRestrictions.AccountRule
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
                        AgentCreateParams.Policy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
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
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .name("Payroll Automation Agent")
                .policy(
                    AgentCreateParams.Policy.builder()
                        .defaultExecutionMode(AgentCreateParams.Policy.DefaultExecutionMode.AUTO)
                        .addPermission(AgentCreateParams.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentCreateParams.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            AgentCreateParams.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    AgentCreateParams.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            AgentCreateParams.Policy.AccountRestrictions.AccountRule
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
                            AgentCreateParams.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.name()).isEqualTo("Payroll Automation Agent")
        assertThat(body.policy())
            .isEqualTo(
                AgentCreateParams.Policy.builder()
                    .defaultExecutionMode(AgentCreateParams.Policy.DefaultExecutionMode.AUTO)
                    .addPermission(AgentCreateParams.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentCreateParams.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        AgentCreateParams.Policy.AccountRestrictions.builder()
                            .addAccountRule(
                                AgentCreateParams.Policy.AccountRestrictions.AccountRule.builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        AgentCreateParams.Policy.AccountRestrictions.AccountRule
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
                        AgentCreateParams.Policy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .name("Payroll Automation Agent")
                .policy(
                    AgentCreateParams.Policy.builder()
                        .defaultExecutionMode(AgentCreateParams.Policy.DefaultExecutionMode.AUTO)
                        .addPermission(AgentCreateParams.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            AgentCreateParams.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.name()).isEqualTo("Payroll Automation Agent")
        assertThat(body.policy())
            .isEqualTo(
                AgentCreateParams.Policy.builder()
                    .defaultExecutionMode(AgentCreateParams.Policy.DefaultExecutionMode.AUTO)
                    .addPermission(AgentCreateParams.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        AgentCreateParams.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .build()
                    )
                    .build()
            )
    }
}
