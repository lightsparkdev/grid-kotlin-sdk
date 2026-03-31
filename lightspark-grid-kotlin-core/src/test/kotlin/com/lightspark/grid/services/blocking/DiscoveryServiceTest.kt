// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.discoveries.DiscoveryListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DiscoveryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val discoveryService = client.discoveries()

        val discoveries =
            discoveryService.list(
                DiscoveryListParams.builder().country("country").currency("currency").build()
            )

        discoveries.validate()
    }
}
