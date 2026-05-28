// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents.me

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val transactionService = client.agents().me().transactions()

        val transaction = transactionService.retrieve("transactionId")

        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val transactionService = client.agents().me().transactions()

        val page = transactionService.list()

        page.response().validate()
    }
}
