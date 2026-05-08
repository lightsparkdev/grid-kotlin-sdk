// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .agentId("agentId")
            .isPaused(true)
            .name("Updated Payroll Agent")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().agentId("agentId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agentId")
                .isPaused(true)
                .name("Updated Payroll Agent")
                .build()

        val body = params._body()

        assertThat(body.isPaused()).isEqualTo(true)
        assertThat(body.name()).isEqualTo("Updated Payroll Agent")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().agentId("agentId").build()

        val body = params._body()
    }
}
