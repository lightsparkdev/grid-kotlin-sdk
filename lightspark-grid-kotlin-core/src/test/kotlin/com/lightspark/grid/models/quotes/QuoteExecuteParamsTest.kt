// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteExecuteParamsTest {

    @Test
    fun create() {
        QuoteExecuteParams.builder()
            .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000001")
            .idempotencyKey("<uuid>")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            QuoteExecuteParams.builder()
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("Quote:019542f5-b3e7-1d02-0000-000000000001")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            QuoteExecuteParams.builder()
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000001")
                .idempotencyKey("<uuid>")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Idempotency-Key", "<uuid>").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            QuoteExecuteParams.builder()
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
