// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.TestServerExtension
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.platform.PlatformListInternalAccountsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlatformServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
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
