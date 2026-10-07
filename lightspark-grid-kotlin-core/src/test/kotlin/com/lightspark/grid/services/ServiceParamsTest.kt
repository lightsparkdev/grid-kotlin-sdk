// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
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
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
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
                .destination(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
                .lockedCurrencyAmount(12550L)
                .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                .source(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
