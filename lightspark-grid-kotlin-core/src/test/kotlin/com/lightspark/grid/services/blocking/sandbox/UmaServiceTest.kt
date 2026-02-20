// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.sandbox

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.sandbox.uma.UmaReceivePaymentParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UmaServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun receivePayment() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val umaService = client.sandbox().uma()

        val incomingTransaction =
            umaService.receivePayment(
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
