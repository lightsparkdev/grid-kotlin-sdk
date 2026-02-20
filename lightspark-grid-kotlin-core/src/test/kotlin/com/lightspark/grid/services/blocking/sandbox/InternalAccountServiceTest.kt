// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.sandbox

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccountFundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InternalAccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun fund() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val internalAccountService = client.sandbox().internalAccounts()

        val internalAccount =
            internalAccountService.fund(
                InternalAccountFundParams.builder()
                    .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .amount(100000L)
                    .build()
            )

        internalAccount.validate()
    }
}
