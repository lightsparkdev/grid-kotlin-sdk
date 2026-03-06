// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseQuoteSourceTest {

    @Test
    fun create() {
        val baseQuoteSource =
            BaseQuoteSource.builder().sourceType(BaseQuoteSource.SourceType.ACCOUNT).build()

        assertThat(baseQuoteSource.sourceType()).isEqualTo(BaseQuoteSource.SourceType.ACCOUNT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseQuoteSource =
            BaseQuoteSource.builder().sourceType(BaseQuoteSource.SourceType.ACCOUNT).build()

        val roundtrippedBaseQuoteSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseQuoteSource),
                jacksonTypeRef<BaseQuoteSource>(),
            )

        assertThat(roundtrippedBaseQuoteSource).isEqualTo(baseQuoteSource)
    }
}
