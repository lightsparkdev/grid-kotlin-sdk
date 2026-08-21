// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.cards.CardCreateRequest
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
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                            )
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003"
                            )
                            .maxSpendPerTransaction(10000L)
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
                CardCreateRequest.builder()
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardCreateRequest.Form.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .maxSpendPerTransaction(5000L)
                    .platformCardId("card-emp-aary-001")
                    .threeDSecurePassword("AbCd1234EfGh5678")
                    .build()
            )

        card.validate()
    }
}
