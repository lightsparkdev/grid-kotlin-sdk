// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.uma

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReceiveRequestTest {

    @Test
    fun create() {
        val receiveRequest =
            ReceiveRequest.builder()
                .receivingCurrencyAmount(1000L)
                .receivingCurrencyCode("USD")
                .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .receiverUmaAddress("\$receiver@uma.domain")
                .build()

        assertThat(receiveRequest.receivingCurrencyAmount()).isEqualTo(1000L)
        assertThat(receiveRequest.receivingCurrencyCode()).isEqualTo("USD")
        assertThat(receiveRequest.senderUmaAddress())
            .isEqualTo("\$success.usd@sandbox.grid.uma.money")
        assertThat(receiveRequest.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(receiveRequest.receiverUmaAddress()).isEqualTo("\$receiver@uma.domain")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val receiveRequest =
            ReceiveRequest.builder()
                .receivingCurrencyAmount(1000L)
                .receivingCurrencyCode("USD")
                .senderUmaAddress("\$success.usd@sandbox.grid.uma.money")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .receiverUmaAddress("\$receiver@uma.domain")
                .build()

        val roundtrippedReceiveRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(receiveRequest),
                jacksonTypeRef<ReceiveRequest>(),
            )

        assertThat(roundtrippedReceiveRequest).isEqualTo(receiveRequest)
    }
}
