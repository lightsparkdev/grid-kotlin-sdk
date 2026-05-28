// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendRequestTest {

    @Test
    fun create() {
        val sendRequest =
            SendRequest.builder()
                .currencyCode("USD")
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .currencyAmount(1000L)
                .build()

        assertThat(sendRequest.currencyCode()).isEqualTo("USD")
        assertThat(sendRequest.quoteId()).isEqualTo("Quote:019542f5-b3e7-1d02-0000-000000000006")
        assertThat(sendRequest.currencyAmount()).isEqualTo(1000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendRequest =
            SendRequest.builder()
                .currencyCode("USD")
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .currencyAmount(1000L)
                .build()

        val roundtrippedSendRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendRequest),
                jacksonTypeRef<SendRequest>(),
            )

        assertThat(roundtrippedSendRequest).isEqualTo(sendRequest)
    }
}
