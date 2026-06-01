// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me

import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.models.transferin.InternalAccountReference
import com.lightspark.grid.models.transferout.TransferOutRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeCreateTransferOutParamsTest {

    @Test
    fun create() {
        MeCreateTransferOutParams.builder()
            .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
            .transferOutRequest(
                TransferOutRequest.builder()
                    .destination(
                        TransferOutRequest.Destination.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .paymentRail(TransferOutRequest.Destination.PaymentRail.ACH)
                            .build()
                    )
                    .source(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
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
            MeCreateTransferOutParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .transferOutRequest(
                    TransferOutRequest.builder()
                        .destination(
                            TransferOutRequest.Destination.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .paymentRail(TransferOutRequest.Destination.PaymentRail.ACH)
                                .build()
                        )
                        .source(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
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
            MeCreateTransferOutParams.builder()
                .transferOutRequest(
                    TransferOutRequest.builder()
                        .destination(
                            TransferOutRequest.Destination.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .source(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
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
            MeCreateTransferOutParams.builder()
                .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                .transferOutRequest(
                    TransferOutRequest.builder()
                        .destination(
                            TransferOutRequest.Destination.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .paymentRail(TransferOutRequest.Destination.PaymentRail.ACH)
                                .build()
                        )
                        .source(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .amount(12550L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TransferOutRequest.builder()
                    .destination(
                        TransferOutRequest.Destination.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .paymentRail(TransferOutRequest.Destination.PaymentRail.ACH)
                            .build()
                    )
                    .source(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeCreateTransferOutParams.builder()
                .transferOutRequest(
                    TransferOutRequest.builder()
                        .destination(
                            TransferOutRequest.Destination.builder()
                                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .source(
                            InternalAccountReference.builder()
                                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TransferOutRequest.builder()
                    .destination(
                        TransferOutRequest.Destination.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .source(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .build()
            )
    }
}
