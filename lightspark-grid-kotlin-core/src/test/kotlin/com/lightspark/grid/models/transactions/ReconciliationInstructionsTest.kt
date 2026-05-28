// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReconciliationInstructionsTest {

    @Test
    fun create() {
        val reconciliationInstructions =
            ReconciliationInstructions.builder()
                .reference("UMA-Q12345-REF")
                .transactionHash(
                    "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                )
                .build()

        assertThat(reconciliationInstructions.reference()).isEqualTo("UMA-Q12345-REF")
        assertThat(reconciliationInstructions.transactionHash())
            .isEqualTo("0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reconciliationInstructions =
            ReconciliationInstructions.builder()
                .reference("UMA-Q12345-REF")
                .transactionHash(
                    "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                )
                .build()

        val roundtrippedReconciliationInstructions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reconciliationInstructions),
                jacksonTypeRef<ReconciliationInstructions>(),
            )

        assertThat(roundtrippedReconciliationInstructions).isEqualTo(reconciliationInstructions)
    }
}
