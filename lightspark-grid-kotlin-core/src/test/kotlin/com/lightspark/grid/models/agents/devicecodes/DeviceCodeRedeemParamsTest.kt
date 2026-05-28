// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceCodeRedeemParamsTest {

    @Test
    fun create() {
        DeviceCodeRedeemParams.builder().code("code").build()
    }

    @Test
    fun pathParams() {
        val params = DeviceCodeRedeemParams.builder().code("code").build()

        assertThat(params._pathParam(0)).isEqualTo("code")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
