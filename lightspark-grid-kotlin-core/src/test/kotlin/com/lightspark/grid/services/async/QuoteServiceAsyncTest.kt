// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteExecuteParams
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
        val quoteServiceAsync = client.quotes()

        val quote =
            quoteServiceAsync.create(
                QuoteCreateParams.builder()
                    .idempotencyKey("<uuid>")
                    .destination(
                        QuoteDestinationOneOf.AccountDestination.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .destinationType(
                                QuoteDestinationOneOf.AccountDestination.DestinationType.ACCOUNT
                            )
                            .paymentRail(QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH)
                            .build()
                    )
                    .lockedCurrencyAmount(12550L)
                    .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                    .source(
                        QuoteSourceOneOf.AccountQuoteSource.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .sourceType(QuoteSourceOneOf.AccountQuoteSource.SourceType.ACCOUNT)
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .description("Same-currency payout, no exchange required.")
                    .documentIds(
                        listOf(
                            "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                            "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                            "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                        )
                    )
                    .immediatelyExecute(true)
                    .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                    .platformFeeOverride(
                        QuoteCreateParams.PlatformFeeOverride.builder()
                            .platformFixedFee(
                                QuoteCreateParams.PlatformFeeOverride.PlatformFixedFee.builder()
                                    .amount(50L)
                                    .currency("USD")
                                    .build()
                            )
                            .platformVariableFeeBps(30L)
                            .build()
                    )
                    .purposeOfPayment(QuoteCreateParams.PurposeOfPayment.GIFT)
                    .remittanceInformation("INV-12345")
                    .scaFactor(QuoteCreateParams.ScaFactor.SMS_OTP)
                    .senderCustomerInfo(
                        QuoteCreateParams.SenderCustomerInfo.builder()
                            .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                            .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
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
        val quoteServiceAsync = client.quotes()

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
        val quoteServiceAsync = client.quotes()

        val quote =
            quoteServiceAsync.execute(
                QuoteExecuteParams.builder()
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000001")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                    )
                    .idempotencyKey("<uuid>")
                    .scaFactor(QuoteExecuteParams.ScaFactor.SMS_OTP)
                    .build()
            )

        quote.validate()
    }
}
