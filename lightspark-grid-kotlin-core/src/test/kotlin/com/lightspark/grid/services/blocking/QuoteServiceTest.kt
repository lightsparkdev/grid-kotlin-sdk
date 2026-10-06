// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.quotes.BaseDestination
import com.lightspark.grid.models.quotes.BaseQuoteSource
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteExecuteParams
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
        val quoteService = client.quotes()

        val quote =
            quoteService.create(
                QuoteCreateParams.builder()
                    .idempotencyKey("<uuid>")
                    .quoteRequest(
                        QuoteRequest.builder()
                            .destination(
                                QuoteDestinationOneOf.Account.builder()
                                    .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                                    .build()
                            )
                            .lockedCurrencyAmount(1000L)
                            .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                            .source(
                                QuoteSourceOneOf.Account.builder()
                                    .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .build()
                            )
                            .description("Invoice #1234 payment")
                            .documentIds(
                                listOf(
                                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                                )
                            )
                            .immediatelyExecute(false)
                            .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                            .platformFeeOverride(
                                QuoteRequest.PlatformFeeOverride.builder()
                                    .platformFixedFee(
                                        QuoteRequest.PlatformFeeOverride.PlatformFixedFee.builder()
                                            .amount(50L)
                                            .currency("USD")
                                            .build()
                                    )
                                    .platformVariableFeeBps(30L)
                                    .build()
                            )
                            .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
                            .remittanceInformation("12345")
                            .scaFactor(QuoteRequest.ScaFactor.SMS_OTP)
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
        val quoteService = client.quotes()

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
        val quoteService = client.quotes()

        val quote =
            quoteService.execute(
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
