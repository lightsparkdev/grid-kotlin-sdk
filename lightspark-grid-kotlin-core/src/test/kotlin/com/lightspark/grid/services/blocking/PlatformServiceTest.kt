// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.platform.PlatformListInternalAccountsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlatformServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val platformService = client.platform()

        val response =
            platformService.listInternalAccounts(
                PlatformListInternalAccountsParams.builder().currency("currency").build()
            )

        response.validate()
    }
}
