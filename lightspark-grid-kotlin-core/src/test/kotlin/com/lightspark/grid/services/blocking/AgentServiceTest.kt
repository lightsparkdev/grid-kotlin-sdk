// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.agents.AgentCreateParams
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        val agent =
            agentService.create(
                AgentCreateParams.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .name("Payroll Automation Agent")
                    .policy(
                        AgentCreateParams.Policy.builder()
                            .defaultExecutionMode(
                                AgentCreateParams.Policy.DefaultExecutionMode.AUTO
                            )
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
                                            .accountId(
                                                "Account:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .executionMode(
                                                AgentCreateParams.Policy.AccountRestrictions
                                                    .AccountRule
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
                                AgentCreateParams.Policy.ApprovalThresholds.builder()
                                    .amount(100000L)
                                    .currency("USD")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        val agent = agentService.retrieve("agentId")

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        val agent =
            agentService.update(
                AgentUpdateParams.builder()
                    .agentId("agentId")
                    .isPaused(true)
                    .name("Updated Payroll Agent")
                    .build()
            )

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        val page = agentService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        agentService.delete("agentId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listApprovals() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        val page = agentService.listApprovals()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updatePolicy() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val agentService = client.agents()

        val response =
            agentService.updatePolicy(
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
            )

        response.validate()
    }
}
