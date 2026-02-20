// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
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
                .build()
        val quoteService = client.quotes()

        val quote =
            quoteService.create(
                QuoteCreateParams.builder()
                    .destination(
                        QuoteDestinationOneOf.AccountDestination.builder()
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .lockedCurrencyAmount(10000L)
                    .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                    .source(
                        QuoteSourceOneOf.AccountQuoteSource.builder()
                            .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .description("Transfer between accounts, either internal or external.")
                    .immediatelyExecute(false)
                    .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                    .purposeOfPayment(QuoteCreateParams.PurposeOfPayment.GIFT)
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
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val quoteService = client.quotes()

        val quote = quoteService.retrieve("quoteId")

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val quoteService = client.quotes()

        val page = quoteService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun execute() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val quoteService = client.quotes()

        val quote = quoteService.execute("Quote:019542f5-b3e7-1d02-0000-000000000001")

        quote.validate()
    }
}
