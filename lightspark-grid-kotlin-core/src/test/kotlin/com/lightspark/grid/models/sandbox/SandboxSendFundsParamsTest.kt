// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxSendFundsParamsTest {

    @Test
    fun create() {
        SandboxSendFundsParams.builder()
            .sendRequest(
                SendRequest.builder()
                    .currencyCode("USD")
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .currencyAmount(1000L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxSendFundsParams.builder()
                .sendRequest(
                    SendRequest.builder()
                        .currencyCode("USD")
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .currencyAmount(1000L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SendRequest.builder()
                    .currencyCode("USD")
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .currencyAmount(1000L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SandboxSendFundsParams.builder()
                .sendRequest(
                    SendRequest.builder()
                        .currencyCode("USD")
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SendRequest.builder()
                    .currencyCode("USD")
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .build()
            )
    }
}
