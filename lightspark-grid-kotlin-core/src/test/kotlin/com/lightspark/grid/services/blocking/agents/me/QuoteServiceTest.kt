// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents.me

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.agents.me.quotes.QuoteCreateParams
import com.lightspark.grid.models.agents.me.quotes.QuoteExecuteParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteRequest
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QuoteServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val quoteService = client.agents().me().quotes()

        val quote =
            quoteService.create(
                QuoteCreateParams.builder()
                    .idempotencyKey("<uuid>")
                    .quoteRequest(
                        QuoteRequest.builder()
                            .destination(QuoteDestinationOneOf.builder().build())
                            .lockedCurrencyAmount(1000L)
                            .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                            .source(QuoteSourceOneOf.builder().build())
                            .description("Invoice #1234 payment")
                            .immediatelyExecute(false)
                            .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                            .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
                            .senderCustomerInfo(
                                QuoteRequest.SenderCustomerInfo.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        quote.validate()
    }

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
        val quoteService = client.agents().me().quotes()

        val quote = quoteService.retrieve("quoteId")

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun execute() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val quoteService = client.agents().me().quotes()

        val agentAction =
            quoteService.execute(
                QuoteExecuteParams.builder()
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000001")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                    )
                    .idempotencyKey("<uuid>")
                    .build()
            )

        agentAction.validate()
    }
}
