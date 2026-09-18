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
                .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .maxSpendPerDay(25000L)
                .maxSpendPerTransaction(10000L)
                .maxTransactionsPerDay(20)
                .reason("Cardholder reported the card stolen.")
                .status(CardUpdateRequest.Status.FROZEN)
                .substatus(CardUpdateRequest.Substatus.SUSPICIOUS_ACTIVITY)
                .build()

        assertThat(cardUpdateRequest.fundingSource())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(cardUpdateRequest.maxSpendPerDay()).isEqualTo(25000L)
        assertThat(cardUpdateRequest.maxSpendPerTransaction()).isEqualTo(10000L)
        assertThat(cardUpdateRequest.maxTransactionsPerDay()).isEqualTo(20)
        assertThat(cardUpdateRequest.reason()).isEqualTo("Cardholder reported the card stolen.")
        assertThat(cardUpdateRequest.status()).isEqualTo(CardUpdateRequest.Status.FROZEN)
        assertThat(cardUpdateRequest.substatus())
            .isEqualTo(CardUpdateRequest.Substatus.SUSPICIOUS_ACTIVITY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardUpdateRequest =
            CardUpdateRequest.builder()
                .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .maxSpendPerDay(25000L)
                .maxSpendPerTransaction(10000L)
                .maxTransactionsPerDay(20)
                .reason("Cardholder reported the card stolen.")
                .status(CardUpdateRequest.Status.FROZEN)
                .substatus(CardUpdateRequest.Substatus.SUSPICIOUS_ACTIVITY)
                .build()

        val roundtrippedCardUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardUpdateRequest),
                jacksonTypeRef<CardUpdateRequest>(),
            )

        assertThat(roundtrippedCardUpdateRequest).isEqualTo(cardUpdateRequest)
    }
}
