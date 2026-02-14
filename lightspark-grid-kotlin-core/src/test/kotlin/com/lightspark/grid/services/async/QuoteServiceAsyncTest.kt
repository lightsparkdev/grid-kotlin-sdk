// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.TestServerExtension
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.quotes.QuoteCreateParams
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class QuoteServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val quoteServiceAsync = client.quotes()

        val quote =
            quoteServiceAsync.create(
                QuoteCreateParams.builder()
                    .destination(
                        QuoteDestinationOneOf.AccountDestination.builder()
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .lockedCurrencyAmount(10000L)
                    .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                    .source(
                        QuoteCreateParams.Source.AccountQuoteSource.builder()
                            .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .description("Transfer between accounts, either internal or external.")
                    .immediatelyExecute(false)
                    .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
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

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val quoteServiceAsync = client.quotes()

        val quote = quoteServiceAsync.retrieve("quoteId")

        quote.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val quoteServiceAsync = client.quotes()

        val page = quoteServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun execute() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val quoteServiceAsync = client.quotes()

        val quote = quoteServiceAsync.execute("Quote:019542f5-b3e7-1d02-0000-000000000001")

        quote.validate()
    }
}
