// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.agents.me.MeCreateTransferInParams
import com.lightspark.grid.models.agents.me.MeCreateTransferOutParams
import com.lightspark.grid.models.transferin.ExternalAccountReference
import com.lightspark.grid.models.transferin.InternalAccountReference
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meService = client.agents().me()

        val agent = meService.retrieve()

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createTransferIn() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meService = client.agents().me()

        val agentAction =
            meService.createTransferIn(
                MeCreateTransferInParams.builder()
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

        agentAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createTransferOut() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meService = client.agents().me()

        val agentAction =
            meService.createTransferOut(
                MeCreateTransferOutParams.builder()
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

        agentAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val meService = client.agents().me()

        val page = meService.listInternalAccounts()

        page.response().validate()
    }
}
