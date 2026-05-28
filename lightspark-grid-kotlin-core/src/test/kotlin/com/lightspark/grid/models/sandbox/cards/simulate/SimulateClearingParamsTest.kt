// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimulateClearingParamsTest {

    @Test
    fun create() {
        SimulateClearingParams.builder()
            .id("Card:019542f5-b3e7-1d02-0000-000000000010")
            .clearingRequest(
                ClearingRequest.builder()
                    .amount(1500L)
                    .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SimulateClearingParams.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .clearingRequest(
                    ClearingRequest.builder()
                        .amount(1500L)
                        .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SimulateClearingParams.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .clearingRequest(
                    ClearingRequest.builder()
                        .amount(1500L)
                        .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ClearingRequest.builder()
                    .amount(1500L)
                    .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                    .build()
            )
    }
}
