// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents.me

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transactionServiceAsync = client.agents().me().transactions()

        val transaction = transactionServiceAsync.retrieve("transactionId")

        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transactionServiceAsync = client.agents().me().transactions()

        val page = transactionServiceAsync.list()

        page.response().validate()
    }
}
