// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardIssueParamsTest {

    @Test
    fun create() {
        CardIssueParams.builder()
            .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
            .cardCreateRequest(
                CardCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardCreateRequest.Form.VIRTUAL)
                    .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .maxSpendPerDay(25000L)
                    .maxSpendPerTransaction(5000L)
                    .maxTransactionsPerDay(20)
                    .platformCardId("card-emp-001")
                    .threeDSecurePassword("AbCd1234EfGh5678")
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            CardIssueParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardCreateRequest.Form.VIRTUAL)
                        .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .maxSpendPerDay(25000L)
                        .maxSpendPerTransaction(5000L)
                        .maxTransactionsPerDay(20)
                        .platformCardId("card-emp-001")
                        .threeDSecurePassword("AbCd1234EfGh5678")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CardIssueParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardCreateRequest.Form.VIRTUAL)
                        .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            CardIssueParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardCreateRequest.Form.VIRTUAL)
                        .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .maxSpendPerDay(25000L)
                        .maxSpendPerTransaction(5000L)
                        .maxTransactionsPerDay(20)
                        .platformCardId("card-emp-001")
                        .threeDSecurePassword("AbCd1234EfGh5678")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardCreateRequest.Form.VIRTUAL)
                    .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .maxSpendPerDay(25000L)
                    .maxSpendPerTransaction(5000L)
                    .maxTransactionsPerDay(20)
                    .platformCardId("card-emp-001")
                    .threeDSecurePassword("AbCd1234EfGh5678")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardIssueParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardCreateRequest.Form.VIRTUAL)
                        .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardCreateRequest.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardCreateRequest.Form.VIRTUAL)
                    .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .build()
            )
    }
}
