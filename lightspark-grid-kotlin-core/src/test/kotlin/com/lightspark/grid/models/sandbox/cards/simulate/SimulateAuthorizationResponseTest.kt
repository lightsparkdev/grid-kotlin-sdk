// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimulateAuthorizationResponseTest {

    @Test
    fun create() {
        val simulateAuthorizationResponse =
            SimulateAuthorizationResponse.builder()
                .issuerTransactionToken("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
                .build()

        assertThat(simulateAuthorizationResponse.issuerTransactionToken())
            .isEqualTo("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simulateAuthorizationResponse =
            SimulateAuthorizationResponse.builder()
                .issuerTransactionToken("f3a1c2d4-5b6e-7890-abcd-ef0123456789")
                .build()

        val roundtrippedSimulateAuthorizationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simulateAuthorizationResponse),
                jacksonTypeRef<SimulateAuthorizationResponse>(),
            )

        assertThat(roundtrippedSimulateAuthorizationResponse)
            .isEqualTo(simulateAuthorizationResponse)
    }
}
