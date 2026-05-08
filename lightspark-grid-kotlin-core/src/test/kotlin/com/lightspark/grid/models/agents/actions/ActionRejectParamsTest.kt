// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRejectParamsTest {

    @Test
    fun create() {
        ActionRejectParams.builder()
            .agentId("agentId")
            .actionId("actionId")
            .reason("Transaction amount exceeds customer's current risk limit.")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionRejectParams.builder().agentId("agentId").actionId("actionId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        assertThat(params._pathParam(1)).isEqualTo("actionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRejectParams.builder()
                .agentId("agentId")
                .actionId("actionId")
                .reason("Transaction amount exceeds customer's current risk limit.")
                .build()

        val body = params._body()

        assertThat(body.reason())
            .isEqualTo("Transaction amount exceeds customer's current risk limit.")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionRejectParams.builder().agentId("agentId").actionId("actionId").build()

        val body = params._body()
    }
}
