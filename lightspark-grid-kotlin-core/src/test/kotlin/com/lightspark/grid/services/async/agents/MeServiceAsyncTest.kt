// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.agents.me.MeRetrieveInternalAccountsParams
import com.lightspark.grid.models.agents.me.MeTransferInParams
import com.lightspark.grid.models.agents.me.MeTransferOutParams
import com.lightspark.grid.models.transferin.ExternalAccountReference
import com.lightspark.grid.models.transferin.InternalAccountReference
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meServiceAsync = client.agents().me()

        val mes = meServiceAsync.list()

        mes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveInternalAccounts() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meServiceAsync = client.agents().me()

        val response =
            meServiceAsync.retrieveInternalAccounts(
                MeRetrieveInternalAccountsParams.builder()
                    .currency("currency")
                    .cursor("cursor")
                    .limit(1L)
                    .type(MeRetrieveInternalAccountsParams.Type.INTERNAL_FIAT)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun transferIn() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meServiceAsync = client.agents().me()

        val response =
            meServiceAsync.transferIn(
                MeTransferInParams.builder()
                    .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                    .destination(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .source(
                        ExternalAccountReference.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun transferOut() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meServiceAsync = client.agents().me()

        val response =
            meServiceAsync.transferOut(
                MeTransferOutParams.builder()
                    .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                    .destination(
                        ExternalAccountReference.builder()
                            .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .source(
                        InternalAccountReference.builder()
                            .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .amount(12550L)
                    .build()
            )

        response.validate()
    }
}
