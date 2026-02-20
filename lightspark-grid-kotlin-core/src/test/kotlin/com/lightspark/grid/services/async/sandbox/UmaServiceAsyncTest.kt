// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.sandbox.uma.UmaReceivePaymentParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UmaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun receivePayment() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val umaServiceAsync = client.sandbox().uma()

        val incomingTransaction =
            umaServiceAsync.receivePayment(
                UmaReceivePaymentParams.builder()
                    .receivingCurrencyAmount(1000L)
                    .receivingCurrencyCode("USD")
                    .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .receiverUmaAddress("\$receiver@uma.domain")
                    .build()
            )

        incomingTransaction.validate()
    }
}
