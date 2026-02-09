// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.TestServerExtension
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.platform.PlatformListInternalAccountsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlatformServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val platformServiceAsync = client.platform()

        val response =
            platformServiceAsync.listInternalAccounts(
                PlatformListInternalAccountsParams.builder().currency("currency").build()
            )

        response.validate()
    }
}
