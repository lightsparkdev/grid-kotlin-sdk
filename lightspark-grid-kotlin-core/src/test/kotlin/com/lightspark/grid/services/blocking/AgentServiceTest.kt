// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.agents.AgentAccountRestrictions
import com.lightspark.grid.models.agents.AgentApprovalThresholds
import com.lightspark.grid.models.agents.AgentCreateRequest
import com.lightspark.grid.models.agents.AgentPolicy
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import com.lightspark.grid.models.agents.AgentUpdateRequest
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

        val agentCreateResponse =
            agentService.create(
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

        agentCreateResponse.validate()
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
                    .agentUpdateRequest(
                        AgentUpdateRequest.builder()
                            .isPaused(true)
                            .name("Updated Payroll Agent")
                            .build()
                    )
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

        val agent =
            agentService.updatePolicy(
                AgentUpdatePolicyParams.builder()
                    .agentId("agentId")
                    .accountRestrictions(
                        AgentAccountRestrictions.builder()
                            .addAccountRule(
                                AgentAccountRestrictions.AccountRule.builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        AgentAccountRestrictions.AccountRule.ExecutionMode.AUTO
                                    )
                                    .perTransactionLimit(10000L)
                                    .build()
                            )
                            .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .approvalThresholds(
                        AgentApprovalThresholds.builder().amount(100000L).currency("USD").build()
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

        agent.validate()
    }
}
