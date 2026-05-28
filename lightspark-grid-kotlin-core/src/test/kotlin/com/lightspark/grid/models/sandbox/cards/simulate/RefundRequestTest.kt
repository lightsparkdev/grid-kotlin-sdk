// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundRequestTest {

    @Test
    fun create() {
        val refundRequest =
            RefundRequest.builder()
                .amount(1500L)
                .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                .build()

        assertThat(refundRequest.amount()).isEqualTo(1500L)
        assertThat(refundRequest.cardTransactionId())
            .isEqualTo("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refundRequest =
            RefundRequest.builder()
                .amount(1500L)
                .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                .build()

        val roundtrippedRefundRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refundRequest),
                jacksonTypeRef<RefundRequest>(),
            )

        assertThat(roundtrippedRefundRequest).isEqualTo(refundRequest)
    }
}
