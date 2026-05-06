// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.agents.transactions.TransactionApproveParams
import com.lightspark.grid.models.agents.transactions.TransactionRejectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun approve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transactionServiceAsync = client.agents().transactions()

        val response =
            transactionServiceAsync.approve(
                TransactionApproveParams.builder().agentId("agentId").actionId("actionId").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun reject() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transactionServiceAsync = client.agents().transactions()

        val response =
            transactionServiceAsync.reject(
                TransactionRejectParams.builder()
                    .agentId("agentId")
                    .actionId("actionId")
                    .reason("Transaction amount exceeds customer's current risk limit.")
                    .build()
            )

        response.validate()
    }
}
