// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentActionRejectRequestTest {

    @Test
    fun create() {
        val agentActionRejectRequest =
            AgentActionRejectRequest.builder()
                .reason("Transaction amount exceeds customer's current risk limit.")
                .build()

        assertThat(agentActionRejectRequest.reason())
            .isEqualTo("Transaction amount exceeds customer's current risk limit.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentActionRejectRequest =
            AgentActionRejectRequest.builder()
                .reason("Transaction amount exceeds customer's current risk limit.")
                .build()

        val roundtrippedAgentActionRejectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentActionRejectRequest),
                jacksonTypeRef<AgentActionRejectRequest>(),
            )

        assertThat(roundtrippedAgentActionRejectRequest).isEqualTo(agentActionRejectRequest)
    }
}
