// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.cards.CardCreateRequest
import com.lightspark.grid.models.cards.CardIssueParams
import com.lightspark.grid.models.cards.CardUpdateParams
import com.lightspark.grid.models.cards.CardUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardServiceAsync = client.cards()

        val card = cardServiceAsync.retrieve("id")

        card.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.update(
                CardUpdateParams.builder()
                    .id("id")
                    .cardUpdateRequest(
                        CardUpdateRequest.builder()
                            .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                            .maxSpendPerDay(25000L)
                            .maxSpendPerTransaction(10000L)
                            .maxTransactionsPerDay(20)
                            .state(CardUpdateRequest.State.FROZEN)
                            .build()
                    )
                    .build()
            )

        card.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardServiceAsync = client.cards()

        val page = cardServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun issue() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.issue(
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
            )

        card.validate()
    }
}
