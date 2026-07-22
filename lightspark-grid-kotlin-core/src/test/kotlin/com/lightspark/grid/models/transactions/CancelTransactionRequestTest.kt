// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CancelTransactionRequestTest {

    @Test
    fun create() {
        val cancelTransactionRequest =
            CancelTransactionRequest.builder().reason("REQUESTED_AFTER_HOURS").build()

        assertThat(cancelTransactionRequest.reason()).isEqualTo("REQUESTED_AFTER_HOURS")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelTransactionRequest =
            CancelTransactionRequest.builder().reason("REQUESTED_AFTER_HOURS").build()

        val roundtrippedCancelTransactionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelTransactionRequest),
                jacksonTypeRef<CancelTransactionRequest>(),
            )

        assertThat(roundtrippedCancelTransactionRequest).isEqualTo(cancelTransactionRequest)
    }
}
