// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRefundSummaryTest {

    @Test
    fun create() {
        val cardRefundSummary = CardRefundSummary.builder().count(0L).totalAmount(0L).build()

        assertThat(cardRefundSummary.count()).isEqualTo(0L)
        assertThat(cardRefundSummary.totalAmount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardRefundSummary = CardRefundSummary.builder().count(0L).totalAmount(0L).build()

        val roundtrippedCardRefundSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardRefundSummary),
                jacksonTypeRef<CardRefundSummary>(),
            )

        assertThat(roundtrippedCardRefundSummary).isEqualTo(cardRefundSummary)
    }
}
