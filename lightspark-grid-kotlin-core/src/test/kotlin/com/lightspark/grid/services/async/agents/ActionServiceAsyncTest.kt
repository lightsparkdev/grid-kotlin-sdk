// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.agents.AgentActionRejectRequest
import com.lightspark.grid.models.agents.actions.ActionApproveParams
import com.lightspark.grid.models.agents.actions.ActionRejectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun approve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val actionServiceAsync = client.agents().actions()

        val agentAction =
            actionServiceAsync.approve(
                ActionApproveParams.builder().agentId("agentId").actionId("actionId").build()
            )

        agentAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun reject() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val actionServiceAsync = client.agents().actions()

        val agentAction =
            actionServiceAsync.reject(
                ActionRejectParams.builder()
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
