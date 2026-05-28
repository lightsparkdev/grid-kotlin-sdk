// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.exchangerates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateFeesTest {

    @Test
    fun create() {
        val exchangeRateFees = ExchangeRateFees.builder().fixed(100L).build()

        assertThat(exchangeRateFees.fixed()).isEqualTo(100L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exchangeRateFees = ExchangeRateFees.builder().fixed(100L).build()

        val roundtrippedExchangeRateFees =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exchangeRateFees),
                jacksonTypeRef<ExchangeRateFees>(),
            )

        assertThat(roundtrippedExchangeRateFees).isEqualTo(exchangeRateFees)
    }
}
