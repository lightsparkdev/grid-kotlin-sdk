// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.transferout.TransferOutCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferOutServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val transferOutService = client.transferOut()

        val transaction =
            transferOutService.create(
                TransferOutCreateParams.builder()
                    .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                    .destination(
                        TransferOutCreateParams.Destination.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .source(
                        TransferOutCreateParams.Source.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )

        transaction.validate()
    }
}
