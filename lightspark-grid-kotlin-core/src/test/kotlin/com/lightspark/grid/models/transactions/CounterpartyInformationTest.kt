// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyInformationTest {

    @Test
    fun create() {
        val counterpartyInformation =
            CounterpartyInformation.builder()
                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterpartyInformation =
            CounterpartyInformation.builder()
                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                .build()

        val roundtrippedCounterpartyInformation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterpartyInformation),
                jacksonTypeRef<CounterpartyInformation>(),
            )

        assertThat(roundtrippedCounterpartyInformation).isEqualTo(counterpartyInformation)
    }
}
