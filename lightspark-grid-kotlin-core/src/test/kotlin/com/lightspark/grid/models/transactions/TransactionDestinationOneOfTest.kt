// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionDestinationOneOfTest {

    @Test
    fun create() {
        val transactionDestinationOneOf = TransactionDestinationOneOf.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionDestinationOneOf = TransactionDestinationOneOf.builder().build()

        val roundtrippedTransactionDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionDestinationOneOf),
                jacksonTypeRef<TransactionDestinationOneOf>(),
            )

        assertThat(roundtrippedTransactionDestinationOneOf).isEqualTo(transactionDestinationOneOf)
    }
}
