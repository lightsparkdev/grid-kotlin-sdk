// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomingRateDetailsTest {

    @Test
    fun create() {
        val incomingRateDetails =
            IncomingRateDetails.builder()
                .gridApiFixedFee(10L)
                .gridApiMultiplier(0.925)
                .gridApiVariableFeeAmount(30.0)
                .gridApiVariableFeeRate(0.003)
                .build()

        assertThat(incomingRateDetails.gridApiFixedFee()).isEqualTo(10L)
        assertThat(incomingRateDetails.gridApiMultiplier()).isEqualTo(0.925)
        assertThat(incomingRateDetails.gridApiVariableFeeAmount()).isEqualTo(30.0)
        assertThat(incomingRateDetails.gridApiVariableFeeRate()).isEqualTo(0.003)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val incomingRateDetails =
            IncomingRateDetails.builder()
                .gridApiFixedFee(10L)
                .gridApiMultiplier(0.925)
                .gridApiVariableFeeAmount(30.0)
                .gridApiVariableFeeRate(0.003)
                .build()

        val roundtrippedIncomingRateDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(incomingRateDetails),
                jacksonTypeRef<IncomingRateDetails>(),
            )

        assertThat(roundtrippedIncomingRateDetails).isEqualTo(incomingRateDetails)
    }
}
