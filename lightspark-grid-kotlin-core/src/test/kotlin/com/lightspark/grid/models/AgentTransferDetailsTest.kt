// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTransferDetailsTest {

    @Test
    fun create() {
        val agentTransferDetails =
            AgentTransferDetails.builder()
                .amount(50000L)
                .currency("USD")
                .destinationAccountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .sourceAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        assertThat(agentTransferDetails.amount()).isEqualTo(50000L)
        assertThat(agentTransferDetails.currency()).isEqualTo("USD")
        assertThat(agentTransferDetails.destinationAccountId())
            .isEqualTo("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
        assertThat(agentTransferDetails.sourceAccountId())
            .isEqualTo("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTransferDetails =
            AgentTransferDetails.builder()
                .amount(50000L)
                .currency("USD")
                .destinationAccountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .sourceAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val roundtrippedAgentTransferDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTransferDetails),
                jacksonTypeRef<AgentTransferDetails>(),
            )

        assertThat(roundtrippedAgentTransferDetails).isEqualTo(agentTransferDetails)
    }
}
