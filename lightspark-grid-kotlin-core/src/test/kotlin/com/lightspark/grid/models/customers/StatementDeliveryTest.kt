// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementDeliveryTest {

    @Test
    fun create() {
        val statementDelivery =
            StatementDelivery.builder()
                .internalAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .periodStart(LocalDate.parse("2026-09-01"))
                .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                .fetchedAt(OffsetDateTime.parse("2026-10-01T09:00:00Z"))
                .build()

        assertThat(statementDelivery.internalAccountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(statementDelivery.periodStart()).isEqualTo(LocalDate.parse("2026-09-01"))
        assertThat(statementDelivery.statementDeliveredAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
        assertThat(statementDelivery.fetchedAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-01T09:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementDelivery =
            StatementDelivery.builder()
                .internalAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .periodStart(LocalDate.parse("2026-09-01"))
                .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                .fetchedAt(OffsetDateTime.parse("2026-10-01T09:00:00Z"))
                .build()

        val roundtrippedStatementDelivery =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementDelivery),
                jacksonTypeRef<StatementDelivery>(),
            )

        assertThat(roundtrippedStatementDelivery).isEqualTo(statementDelivery)
    }
}
