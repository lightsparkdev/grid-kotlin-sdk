// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRetrieveParamsTest {

    @Test
    fun create() {
        ActionRetrieveParams.builder().actionId("actionId").build()
    }

    @Test
    fun pathParams() {
        val params = ActionRetrieveParams.builder().actionId("actionId").build()

        assertThat(params._pathParam(0)).isEqualTo("actionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
