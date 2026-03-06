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
            ReconciliationInstructions.builder().reference("UMA-Q12345-REF").build()

        assertThat(reconciliationInstructions.reference()).isEqualTo("UMA-Q12345-REF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reconciliationInstructions =
            ReconciliationInstructions.builder().reference("UMA-Q12345-REF").build()

        val roundtrippedReconciliationInstructions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reconciliationInstructions),
                jacksonTypeRef<ReconciliationInstructions>(),
            )

        assertThat(roundtrippedReconciliationInstructions).isEqualTo(reconciliationInstructions)
    }
}
