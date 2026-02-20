// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccountFundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InternalAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun fund() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val internalAccountServiceAsync = client.sandbox().internalAccounts()

        val internalAccount =
            internalAccountServiceAsync.fund(
                InternalAccountFundParams.builder()
                    .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .amount(100000L)
                    .build()
            )

        internalAccount.validate()
    }
}
