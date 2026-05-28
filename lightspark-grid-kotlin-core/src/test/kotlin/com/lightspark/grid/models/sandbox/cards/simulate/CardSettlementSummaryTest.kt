// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardSettlementSummaryTest {

    @Test
    fun create() {
        val cardSettlementSummary =
            CardSettlementSummary.builder().count(1L).totalAmount(1500L).build()

        assertThat(cardSettlementSummary.count()).isEqualTo(1L)
        assertThat(cardSettlementSummary.totalAmount()).isEqualTo(1500L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardSettlementSummary =
            CardSettlementSummary.builder().count(1L).totalAmount(1500L).build()

        val roundtrippedCardSettlementSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardSettlementSummary),
                jacksonTypeRef<CardSettlementSummary>(),
            )

        assertThat(roundtrippedCardSettlementSummary).isEqualTo(cardSettlementSummary)
    }
}
