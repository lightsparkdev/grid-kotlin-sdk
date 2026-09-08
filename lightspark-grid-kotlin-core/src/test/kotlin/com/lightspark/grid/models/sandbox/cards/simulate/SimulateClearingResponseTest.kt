// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimulateClearingResponseTest {

    @Test
    fun create() {
        val simulateClearingResponse =
            SimulateClearingResponse.builder()
                .issuerTransactionToken("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
                .build()

        assertThat(simulateClearingResponse.issuerTransactionToken())
            .isEqualTo("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simulateClearingResponse =
            SimulateClearingResponse.builder()
                .issuerTransactionToken("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
                .build()

        val roundtrippedSimulateClearingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simulateClearingResponse),
                jacksonTypeRef<SimulateClearingResponse>(),
            )

        assertThat(roundtrippedSimulateClearingResponse).isEqualTo(simulateClearingResponse)
    }
}
