// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.vasps.VaspListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VaspServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val vaspService = client.vasps()

        val vaspListResponse =
            vaspService.list(VaspListParams.builder().cursor("cursor").limit(1L).build())

        vaspListResponse.validate()
    }
}
