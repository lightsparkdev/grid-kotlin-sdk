// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .id("id")
            .gridWalletSignature(
                "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
            )
            .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
            .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
            .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
            .state(CardUpdateParams.State.FROZEN)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CardUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CardUpdateParams.builder()
                .id("id")
                .gridWalletSignature(
                    "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardUpdateParams.State.FROZEN)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE=",
                    )
                    .put("Request-Id", "7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CardUpdateParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CardUpdateParams.builder()
                .id("id")
                .gridWalletSignature(
                    "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardUpdateParams.State.FROZEN)
                .build()

        val body = params._body()

        assertThat(body.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(body.state()).isEqualTo(CardUpdateParams.State.FROZEN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
