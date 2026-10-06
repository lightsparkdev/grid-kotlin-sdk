// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfirmStatementDeliveryRequestTest {

    @Test
    fun create() {
        val confirmStatementDeliveryRequest =
            ConfirmStatementDeliveryRequest.builder()
                .periodStart(LocalDate.parse("2026-09-01"))
                .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                .build()

        assertThat(confirmStatementDeliveryRequest.periodStart())
            .isEqualTo(LocalDate.parse("2026-09-01"))
        assertThat(confirmStatementDeliveryRequest.statementDeliveredAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val confirmStatementDeliveryRequest =
            ConfirmStatementDeliveryRequest.builder()
                .periodStart(LocalDate.parse("2026-09-01"))
                .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                .build()

        val roundtrippedConfirmStatementDeliveryRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(confirmStatementDeliveryRequest),
                jacksonTypeRef<ConfirmStatementDeliveryRequest>(),
            )

        assertThat(roundtrippedConfirmStatementDeliveryRequest)
            .isEqualTo(confirmStatementDeliveryRequest)
    }
}
