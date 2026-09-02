// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .id("id")
            .cardUpdateRequest(
                CardUpdateRequest.builder()
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                    .maxSpendPerDay(25000L)
                    .maxSpendPerTransaction(10000L)
                    .state(CardUpdateRequest.State.FROZEN)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardUpdateParams.builder()
                .id("id")
                .cardUpdateRequest(CardUpdateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardUpdateParams.builder()
                .id("id")
                .cardUpdateRequest(
                    CardUpdateRequest.builder()
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .maxSpendPerDay(25000L)
                        .maxSpendPerTransaction(10000L)
                        .state(CardUpdateRequest.State.FROZEN)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardUpdateRequest.builder()
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                    .maxSpendPerDay(25000L)
                    .maxSpendPerTransaction(10000L)
                    .state(CardUpdateRequest.State.FROZEN)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder()
                .id("id")
                .cardUpdateRequest(CardUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CardUpdateRequest.builder().build())
    }
}
