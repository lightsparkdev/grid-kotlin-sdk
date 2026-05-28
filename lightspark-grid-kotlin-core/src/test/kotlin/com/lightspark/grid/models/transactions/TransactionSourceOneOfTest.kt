// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSourceOneOfTest {

    @Test
    fun create() {
        val transactionSourceOneOf = TransactionSourceOneOf.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf = TransactionSourceOneOf.builder().build()

        val roundtrippedTransactionSourceOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSourceOneOf),
                jacksonTypeRef<TransactionSourceOneOf>(),
            )

        assertThat(roundtrippedTransactionSourceOneOf).isEqualTo(transactionSourceOneOf)
    }
}
