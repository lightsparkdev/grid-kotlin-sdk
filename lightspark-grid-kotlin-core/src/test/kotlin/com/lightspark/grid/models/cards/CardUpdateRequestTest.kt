// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateRequestTest {

    @Test
    fun create() {
        val cardUpdateRequest =
            CardUpdateRequest.builder()
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardUpdateRequest.State.FROZEN)
                .build()

        assertThat(cardUpdateRequest.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(cardUpdateRequest.state()).isEqualTo(CardUpdateRequest.State.FROZEN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardUpdateRequest =
            CardUpdateRequest.builder()
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardUpdateRequest.State.FROZEN)
                .build()

        val roundtrippedCardUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardUpdateRequest),
                jacksonTypeRef<CardUpdateRequest>(),
            )

        assertThat(roundtrippedCardUpdateRequest).isEqualTo(cardUpdateRequest)
    }
}
