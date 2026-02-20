// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.transactions.TransactionApproveParams
import com.lightspark.grid.models.transactions.TransactionRejectParams
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
        val transactionServiceAsync = client.transactions()

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
        val transactionServiceAsync = client.transactions()

        val page = transactionServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun approve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transactionServiceAsync = client.transactions()

        val incomingTransaction =
            transactionServiceAsync.approve(
                TransactionApproveParams.builder()
                    .transactionId("transactionId")
                    .receiverCustomerInfo(
                        TransactionApproveParams.ReceiverCustomerInfo.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        incomingTransaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun reject() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transactionServiceAsync = client.transactions()

        val incomingTransaction =
            transactionServiceAsync.reject(
                TransactionRejectParams.builder()
                    .transactionId("transactionId")
                    .reason("RESTRICTED_JURISDICTION")
                    .build()
            )

        incomingTransaction.validate()
    }
}
