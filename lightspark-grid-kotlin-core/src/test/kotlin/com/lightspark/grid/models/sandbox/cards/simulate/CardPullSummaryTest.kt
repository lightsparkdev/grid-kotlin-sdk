// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPullSummaryTest {

    @Test
    fun create() {
        val cardPullSummary =
            CardPullSummary.builder().count(2L).totalAmount(1500L).pendingCount(0L).build()

        assertThat(cardPullSummary.count()).isEqualTo(2L)
        assertThat(cardPullSummary.totalAmount()).isEqualTo(1500L)
        assertThat(cardPullSummary.pendingCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPullSummary =
            CardPullSummary.builder().count(2L).totalAmount(1500L).pendingCount(0L).build()

        val roundtrippedCardPullSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPullSummary),
                jacksonTypeRef<CardPullSummary>(),
            )

        assertThat(roundtrippedCardPullSummary).isEqualTo(cardPullSummary)
    }
}
