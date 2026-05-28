// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseTransactionDestinationTest {

    @Test
    fun create() {
        val baseTransactionDestination =
            BaseTransactionDestination.builder()
                .destinationType(JsonValue.from(mapOf<String, Any>()))
                .currency("EUR")
                .build()

        assertThat(baseTransactionDestination._destinationType())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(baseTransactionDestination.currency()).isEqualTo("EUR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseTransactionDestination =
            BaseTransactionDestination.builder()
                .destinationType(JsonValue.from(mapOf<String, Any>()))
                .currency("EUR")
                .build()

        val roundtrippedBaseTransactionDestination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseTransactionDestination),
                jacksonTypeRef<BaseTransactionDestination>(),
            )

        assertThat(roundtrippedBaseTransactionDestination).isEqualTo(baseTransactionDestination)
    }
}
