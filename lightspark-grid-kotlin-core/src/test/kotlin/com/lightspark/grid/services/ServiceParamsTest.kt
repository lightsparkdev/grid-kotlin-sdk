// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.lightspark.grid.client.LightsparkGridClient
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.quotes.BaseDestination
import com.lightspark.grid.models.quotes.BaseQuoteSource
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteRequest
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: LightsparkGridClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LightsparkGridOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val quoteService = client.quotes()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        quoteService.create(
            QuoteCreateParams.builder()
                .idempotencyKey("<uuid>")
                .quoteRequest(
                    QuoteRequest.builder()
                        .destination(
                            QuoteDestinationOneOf.Account.builder()
                                .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .paymentRail(JsonValue.from("ACH"))
                                .build()
                        )
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                        .source(
                            QuoteSourceOneOf.Account.builder()
                                .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
