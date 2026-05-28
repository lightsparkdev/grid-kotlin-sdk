// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardMerchantTest {

    @Test
    fun create() {
        val cardMerchant =
            CardMerchant.builder()
                .descriptor("BLUE BOTTLE COFFEE SF")
                .country("US")
                .mcc("5814")
                .build()

        assertThat(cardMerchant.descriptor()).isEqualTo("BLUE BOTTLE COFFEE SF")
        assertThat(cardMerchant.country()).isEqualTo("US")
        assertThat(cardMerchant.mcc()).isEqualTo("5814")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardMerchant =
            CardMerchant.builder()
                .descriptor("BLUE BOTTLE COFFEE SF")
                .country("US")
                .mcc("5814")
                .build()

        val roundtrippedCardMerchant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardMerchant),
                jacksonTypeRef<CardMerchant>(),
            )

        assertThat(roundtrippedCardMerchant).isEqualTo(cardMerchant)
    }
}
