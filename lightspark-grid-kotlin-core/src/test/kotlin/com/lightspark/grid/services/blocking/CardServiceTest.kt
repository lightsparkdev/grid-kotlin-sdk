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
                    .threeDSecurePassword("AbCd1234EfGh5678")
                    .build()
            )

        card.validate()
    }
}
