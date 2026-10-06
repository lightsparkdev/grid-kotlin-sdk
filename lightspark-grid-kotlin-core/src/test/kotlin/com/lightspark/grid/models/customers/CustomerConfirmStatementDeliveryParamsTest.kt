// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerConfirmStatementDeliveryParamsTest {

    @Test
    fun create() {
        CustomerConfirmStatementDeliveryParams.builder()
            .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
            .confirmStatementDeliveryRequest(
                ConfirmStatementDeliveryRequest.builder()
                    .periodStart(LocalDate.parse("2026-09-01"))
                    .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerConfirmStatementDeliveryParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .confirmStatementDeliveryRequest(
                    ConfirmStatementDeliveryRequest.builder()
                        .periodStart(LocalDate.parse("2026-09-01"))
                        .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerConfirmStatementDeliveryParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .confirmStatementDeliveryRequest(
                    ConfirmStatementDeliveryRequest.builder()
                        .periodStart(LocalDate.parse("2026-09-01"))
                        .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ConfirmStatementDeliveryRequest.builder()
                    .periodStart(LocalDate.parse("2026-09-01"))
                    .statementDeliveredAt(OffsetDateTime.parse("2026-10-03T14:31:00Z"))
                    .build()
            )
    }
}
