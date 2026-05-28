// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionApproveParamsTest {

    @Test
    fun create() {
        TransactionApproveParams.builder().agentId("agentId").actionId("actionId").build()
    }

    @Test
    fun pathParams() {
        val params =
            TransactionApproveParams.builder().agentId("agentId").actionId("actionId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        assertThat(params._pathParam(1)).isEqualTo("actionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
