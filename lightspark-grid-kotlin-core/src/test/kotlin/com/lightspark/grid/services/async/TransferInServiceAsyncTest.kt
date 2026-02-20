// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.transferin.TransferInCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferInServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transferInServiceAsync = client.transferIn()

        val transferIn =
            transferInServiceAsync.create(
                TransferInCreateParams.builder()
                    .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                    .destination(
                        TransferInCreateParams.Destination.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .source(
                        TransferInCreateParams.Source.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )

        transferIn.validate()
    }
}
