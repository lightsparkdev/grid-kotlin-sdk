// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents.me

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.agents.me.quotes.QuoteCreateParams
import com.lightspark.grid.models.agents.me.quotes.QuoteExecuteParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteRequest
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QuoteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val quoteServiceAsync = client.agents().me().quotes()

        val quote =
            quoteServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val quoteServiceAsync = client.agents().me().quotes()

        val quote = quoteServiceAsync.retrieve("quoteId")

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun execute() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val quoteServiceAsync = client.agents().me().quotes()

        val agentAction =
            quoteServiceAsync.execute(
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
