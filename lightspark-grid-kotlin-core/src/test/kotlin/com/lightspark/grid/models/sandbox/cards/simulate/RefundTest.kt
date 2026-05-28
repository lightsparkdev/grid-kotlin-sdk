// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundTest {

    @Test
    fun create() {
        val refund =
            Refund.builder()
                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .reference("UMA-Q12345-REFUND")
                .status(Refund.Status.COMPLETED)
                .reason(Refund.Reason.TRANSACTION_FAILED)
                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                .build()

        assertThat(refund.initiatedAt()).isEqualTo(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
        assertThat(refund.reference()).isEqualTo("UMA-Q12345-REFUND")
        assertThat(refund.status()).isEqualTo(Refund.Status.COMPLETED)
        assertThat(refund.reason()).isEqualTo(Refund.Reason.TRANSACTION_FAILED)
        assertThat(refund.settledAt()).isEqualTo(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refund =
            Refund.builder()
                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .reference("UMA-Q12345-REFUND")
                .status(Refund.Status.COMPLETED)
                .reason(Refund.Reason.TRANSACTION_FAILED)
                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                .build()

        val roundtrippedRefund =
            jsonMapper.readValue(jsonMapper.writeValueAsString(refund), jacksonTypeRef<Refund>())

        assertThat(roundtrippedRefund).isEqualTo(refund)
    }
}
