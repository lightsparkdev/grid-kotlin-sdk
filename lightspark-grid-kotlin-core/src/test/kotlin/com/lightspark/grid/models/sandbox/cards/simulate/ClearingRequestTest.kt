// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClearingRequestTest {

    @Test
    fun create() {
        val clearingRequest =
            ClearingRequest.builder()
                .amount(1500L)
                .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                .build()

        assertThat(clearingRequest.amount()).isEqualTo(1500L)
        assertThat(clearingRequest.cardTransactionId())
            .isEqualTo("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clearingRequest =
            ClearingRequest.builder()
                .amount(1500L)
                .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                .build()

        val roundtrippedClearingRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clearingRequest),
                jacksonTypeRef<ClearingRequest>(),
            )

        assertThat(roundtrippedClearingRequest).isEqualTo(clearingRequest)
    }
}
