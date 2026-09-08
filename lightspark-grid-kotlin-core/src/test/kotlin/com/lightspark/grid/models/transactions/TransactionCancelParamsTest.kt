// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionCancelParamsTest {

    @Test
    fun create() {
        TransactionCancelParams.builder()
            .transactionId("transactionId")
            .cancelTransactionRequest(
                CancelTransactionRequest.builder().reason("REQUESTED_AFTER_HOURS").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = TransactionCancelParams.builder().transactionId("transactionId").build()

        assertThat(params._pathParam(0)).isEqualTo("transactionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TransactionCancelParams.builder()
                .transactionId("transactionId")
                .cancelTransactionRequest(
                    CancelTransactionRequest.builder().reason("REQUESTED_AFTER_HOURS").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(CancelTransactionRequest.builder().reason("REQUESTED_AFTER_HOURS").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TransactionCancelParams.builder().transactionId("transactionId").build()

        val body = params._body()
    }
}
