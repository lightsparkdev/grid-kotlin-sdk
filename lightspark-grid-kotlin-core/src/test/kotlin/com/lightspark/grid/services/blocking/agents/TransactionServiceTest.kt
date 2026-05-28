// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.agents.AgentActionRejectRequest
import com.lightspark.grid.models.agents.transactions.TransactionApproveParams
import com.lightspark.grid.models.agents.transactions.TransactionRejectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val transactionService = client.agents().transactions()

        val agentAction =
            transactionService.approve(
                TransactionApproveParams.builder().agentId("agentId").actionId("actionId").build()
            )

        agentAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reject() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val transactionService = client.agents().transactions()

        val agentAction =
            transactionService.reject(
                TransactionRejectParams.builder()
                    .agentId("agentId")
                    .actionId("actionId")
                    .agentActionRejectRequest(
                        AgentActionRejectRequest.builder()
                            .reason("Transaction amount exceeds customer's current risk limit.")
                            .build()
                    )
                    .build()
            )

        agentAction.validate()
    }
}
