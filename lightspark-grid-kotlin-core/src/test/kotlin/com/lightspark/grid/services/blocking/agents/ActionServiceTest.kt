// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.agents.actions.ActionApproveParams
import com.lightspark.grid.models.agents.actions.ActionRejectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val actionService = client.agents().actions()

        val response =
            actionService.approve(
                ActionApproveParams.builder().agentId("agentId").actionId("actionId").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reject() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val actionService = client.agents().actions()

        val response =
            actionService.reject(
                ActionRejectParams.builder()
                    .agentId("agentId")
                    .actionId("actionId")
                    .reason("Transaction amount exceeds customer's current risk limit.")
                    .build()
            )

        response.validate()
    }
}
