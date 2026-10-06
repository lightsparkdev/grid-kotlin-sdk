// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseQuoteSourceTest {

    @Test
    fun create() {
        val baseQuoteSource =
            BaseQuoteSource.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseQuoteSource =
            BaseQuoteSource.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()

        val roundtrippedBaseQuoteSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseQuoteSource),
                jacksonTypeRef<BaseQuoteSource>(),
            )

        assertThat(roundtrippedBaseQuoteSource).isEqualTo(baseQuoteSource)
    }
}
