// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.uma

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UmaReceivePaymentParamsTest {

    @Test
    fun create() {
        UmaReceivePaymentParams.builder()
            .receiveRequest(
                ReceiveRequest.builder()
                    .receivingCurrencyAmount(1000L)
                    .receivingCurrencyCode("USD")
                    .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .receiverUmaAddress("\$receiver@uma.domain")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UmaReceivePaymentParams.builder()
                .receiveRequest(
                    ReceiveRequest.builder()
                        .receivingCurrencyAmount(1000L)
                        .receivingCurrencyCode("USD")
                        .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .receiverUmaAddress("\$receiver@uma.domain")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ReceiveRequest.builder()
                    .receivingCurrencyAmount(1000L)
                    .receivingCurrencyCode("USD")
                    .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .receiverUmaAddress("\$receiver@uma.domain")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UmaReceivePaymentParams.builder()
                .receiveRequest(
                    ReceiveRequest.builder()
                        .receivingCurrencyAmount(1000L)
                        .receivingCurrencyCode("USD")
                        .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ReceiveRequest.builder()
                    .receivingCurrencyAmount(1000L)
                    .receivingCurrencyCode("USD")
                    .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                    .build()
            )
    }
}
