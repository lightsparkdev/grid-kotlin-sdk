// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.receiver

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.config.CustomerInfoFieldName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyFieldDefinitionTest {

    @Test
    fun create() {
        val counterpartyFieldDefinition =
            CounterpartyFieldDefinition.builder()
                .mandatory(true)
                .name(CustomerInfoFieldName.FULL_NAME)
                .build()

        assertThat(counterpartyFieldDefinition.mandatory()).isEqualTo(true)
        assertThat(counterpartyFieldDefinition.name()).isEqualTo(CustomerInfoFieldName.FULL_NAME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterpartyFieldDefinition =
            CounterpartyFieldDefinition.builder()
                .mandatory(true)
                .name(CustomerInfoFieldName.FULL_NAME)
                .build()

        val roundtrippedCounterpartyFieldDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterpartyFieldDefinition),
                jacksonTypeRef<CounterpartyFieldDefinition>(),
            )

        assertThat(roundtrippedCounterpartyFieldDefinition).isEqualTo(counterpartyFieldDefinition)
    }
}
