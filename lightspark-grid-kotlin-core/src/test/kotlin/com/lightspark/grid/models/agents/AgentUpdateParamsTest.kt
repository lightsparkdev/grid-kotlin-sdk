// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .agentId("agentId")
            .agentUpdateRequest(
                AgentUpdateRequest.builder().isPaused(true).name("Updated Payroll Agent").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agentId")
                .agentUpdateRequest(AgentUpdateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agentId")
                .agentUpdateRequest(
                    AgentUpdateRequest.builder()
                        .isPaused(true)
                        .name("Updated Payroll Agent")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AgentUpdateRequest.builder().isPaused(true).name("Updated Payroll Agent").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agentId")
                .agentUpdateRequest(AgentUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AgentUpdateRequest.builder().build())
    }
}
