// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.agents.AgentAccountRestrictions
import com.lightspark.grid.models.agents.AgentAccountRule
import com.lightspark.grid.models.agents.AgentApprovalThresholds
import com.lightspark.grid.models.agents.AgentCreateRequest
import com.lightspark.grid.models.agents.AgentExecutionMode
import com.lightspark.grid.models.agents.AgentPermission
import com.lightspark.grid.models.agents.AgentPolicy
import com.lightspark.grid.models.agents.AgentPolicyUpdateRequest
import com.lightspark.grid.models.agents.AgentSpendingLimits
import com.lightspark.grid.models.agents.AgentSpendingLimitsUpdate
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import com.lightspark.grid.models.agents.AgentUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        val agentCreateResponse =
            agentServiceAsync.create(
                AgentCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .name("Payroll Automation Agent")
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
                                            .accountId(
                                                "Account:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .executionMode(AgentExecutionMode.AUTO)
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
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        val agent = agentServiceAsync.retrieve("agentId")

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        val agent =
            agentServiceAsync.update(
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
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        val page = agentServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        agentServiceAsync.delete("agentId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listApprovals() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        val page = agentServiceAsync.listApprovals()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updatePolicy() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val agentServiceAsync = client.agents()

        val agent =
            agentServiceAsync.updatePolicy(
                AgentUpdatePolicyParams.builder()
                    .agentId("agentId")
                    .agentPolicyUpdateRequest(
                        AgentPolicyUpdateRequest.builder()
                            .accountRestrictions(
                                AgentAccountRestrictions.builder()
                                    .addAccountRule(
                                        AgentAccountRule.builder()
                                            .accountId(
                                                "Account:019542f5-b3e7-1d02-0000-000000000001"
                                            )
                                            .executionMode(AgentExecutionMode.AUTO)
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
            )

        agent.validate()
    }
}
