// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimulateReturnResponseTest {

    @Test
    fun create() {
        val simulateReturnResponse =
            SimulateReturnResponse.builder()
                .issuerTransactionToken("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
                .build()

        assertThat(simulateReturnResponse.issuerTransactionToken())
            .isEqualTo("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simulateReturnResponse =
            SimulateReturnResponse.builder()
                .issuerTransactionToken("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
                .build()

        val roundtrippedSimulateReturnResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simulateReturnResponse),
                jacksonTypeRef<SimulateReturnResponse>(),
            )

        assertThat(roundtrippedSimulateReturnResponse).isEqualTo(simulateReturnResponse)
    }
}
