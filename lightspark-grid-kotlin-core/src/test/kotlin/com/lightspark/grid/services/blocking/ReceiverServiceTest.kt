// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.TestServerExtension
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.receiver.ReceiverLookupExternalAccountParams
import com.lightspark.grid.models.receiver.ReceiverLookupUmaParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReceiverServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun lookupExternalAccount() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val receiverService = client.receiver()

        val response =
            receiverService.lookupExternalAccount(
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
    fun lookupUma() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val receiverService = client.receiver()

        val response =
            receiverService.lookupUma(
                ReceiverLookupUmaParams.builder()
                    .receiverUmaAddress("receiverUmaAddress")
                    .customerId("customerId")
                    .senderUmaAddress("senderUmaAddress")
                    .build()
            )

        response.validate()
    }
}
