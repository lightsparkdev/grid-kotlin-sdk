// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferInRequestTest {

    @Test
    fun create() {
        val transferInRequest =
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

        assertThat(transferInRequest.destination())
            .isEqualTo(
                InternalAccountReference.builder()
                    .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .build()
            )
        assertThat(transferInRequest.source())
            .isEqualTo(
                ExternalAccountReference.builder()
                    .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .build()
            )
        assertThat(transferInRequest.amount()).isEqualTo(12550L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferInRequest =
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

        val roundtrippedTransferInRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferInRequest),
                jacksonTypeRef<TransferInRequest>(),
            )

        assertThat(roundtrippedTransferInRequest).isEqualTo(transferInRequest)
    }
}
