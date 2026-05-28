// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me

import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.models.transferin.ExternalAccountReference
import com.lightspark.grid.models.transferin.InternalAccountReference
import com.lightspark.grid.models.transferin.TransferInRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeCreateTransferInParamsTest {

    @Test
    fun create() {
        MeCreateTransferInParams.builder()
            .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
            .transferInRequest(
                TransferInRequest.builder()
                    .destination(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .source(
                        ExternalAccountReference.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            MeCreateTransferInParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .transferInRequest(
                    TransferInRequest.builder()
                        .destination(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .source(
                            ExternalAccountReference.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .amount(12550L)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            MeCreateTransferInParams.builder()
                .transferInRequest(
                    TransferInRequest.builder()
                        .destination(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .source(
                            ExternalAccountReference.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            MeCreateTransferInParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .transferInRequest(
                    TransferInRequest.builder()
                        .destination(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .source(
                            ExternalAccountReference.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .amount(12550L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TransferInRequest.builder()
                    .destination(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .source(
                        ExternalAccountReference.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeCreateTransferInParams.builder()
                .transferInRequest(
                    TransferInRequest.builder()
                        .destination(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .source(
                            ExternalAccountReference.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TransferInRequest.builder()
                    .destination(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .source(
                        ExternalAccountReference.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .build()
            )
    }
}
