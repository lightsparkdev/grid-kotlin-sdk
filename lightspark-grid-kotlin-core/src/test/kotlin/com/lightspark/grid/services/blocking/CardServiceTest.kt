// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.cards.CardCreateRequest
import com.lightspark.grid.models.cards.CardUpdateParams
import com.lightspark.grid.models.cards.CardUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardService = client.cards()

        val card = cardService.retrieve("id")

        card.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardService = client.cards()

        val card =
            cardService.update(
                CardUpdateParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .cardUpdateRequest(
                        CardUpdateRequest.builder()
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                            )
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003"
                            )
                            .state(CardUpdateRequest.State.FROZEN)
                            .build()
                    )
                    .build()
            )

        card.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardService = client.cards()

        val page = cardService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun issue() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val cardService = client.cards()

        val card =
            cardService.issue(
                CardCreateRequest.builder()
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardCreateRequest.Form.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .platformCardId("card-emp-aary-001")
                    .build()
            )

        card.validate()
    }
}
