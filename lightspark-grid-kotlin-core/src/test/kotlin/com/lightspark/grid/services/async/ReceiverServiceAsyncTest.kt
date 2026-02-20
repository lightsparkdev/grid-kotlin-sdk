// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.receiver.ReceiverLookupExternalAccountParams
import com.lightspark.grid.models.receiver.ReceiverLookupUmaParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReceiverServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun lookupExternalAccount() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val receiverServiceAsync = client.receiver()

        val response =
            receiverServiceAsync.lookupExternalAccount(
                ReceiverLookupExternalAccountParams.builder()
                    .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .customerId("customerId")
                    .senderUmaAddress("senderUmaAddress")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun lookupUma() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val receiverServiceAsync = client.receiver()

        val response =
            receiverServiceAsync.lookupUma(
                ReceiverLookupUmaParams.builder()
                    .receiverUmaAddress("receiverUmaAddress")
                    .customerId("customerId")
                    .senderUmaAddress("senderUmaAddress")
                    .build()
            )

        response.validate()
    }
}
