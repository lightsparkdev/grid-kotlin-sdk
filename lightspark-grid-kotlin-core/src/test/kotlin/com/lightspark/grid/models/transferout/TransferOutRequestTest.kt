// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferout

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.transferin.ExternalAccountReference
import com.lightspark.grid.models.transferin.InternalAccountReference
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferOutRequestTest {

    @Test
    fun create() {
        val transferOutRequest =
            TransferOutRequest.builder()
                .destination(
                    ExternalAccountReference.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .build()
                )
                .source(
                    InternalAccountReference.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .build()
                )
                .amount(12550L)
                .build()

        assertThat(transferOutRequest.destination())
            .isEqualTo(
                ExternalAccountReference.builder()
                    .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .build()
            )
        assertThat(transferOutRequest.source())
            .isEqualTo(
                InternalAccountReference.builder()
                    .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .build()
            )
        assertThat(transferOutRequest.amount()).isEqualTo(12550L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferOutRequest =
            TransferOutRequest.builder()
                .destination(
                    ExternalAccountReference.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .build()
                )
                .source(
                    InternalAccountReference.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .build()
                )
                .amount(12550L)
                .build()

        val roundtrippedTransferOutRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferOutRequest),
                jacksonTypeRef<TransferOutRequest>(),
            )

        assertThat(roundtrippedTransferOutRequest).isEqualTo(transferOutRequest)
    }
}
