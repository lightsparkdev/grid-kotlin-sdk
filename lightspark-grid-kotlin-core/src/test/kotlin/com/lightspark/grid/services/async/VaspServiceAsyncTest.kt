// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.vasps.VaspListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VaspServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val vaspServiceAsync = client.vasps()

        val vaspListResponse =
            vaspServiceAsync.list(VaspListParams.builder().cursor("cursor").limit(1L).build())

        vaspListResponse.validate()
    }
}
