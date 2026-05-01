// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionApproveParamsTest {

    @Test
    fun create() {
        ActionApproveParams.builder().agentId("agentId").actionId("actionId").build()
    }

    @Test
    fun pathParams() {
        val params = ActionApproveParams.builder().agentId("agentId").actionId("actionId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        assertThat(params._pathParam(1)).isEqualTo("actionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
