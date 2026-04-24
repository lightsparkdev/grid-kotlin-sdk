// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.internalaccounts.InternalAccountExportParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InternalAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun export() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val response =
            internalAccountServiceAsync.export(
                InternalAccountExportParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .build()
            )

        response.validate()
    }
}
