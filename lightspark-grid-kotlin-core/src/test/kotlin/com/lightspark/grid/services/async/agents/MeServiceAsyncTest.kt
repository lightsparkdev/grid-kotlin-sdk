// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.agents.me.MeCreateTransferInParams
import com.lightspark.grid.models.agents.me.MeCreateTransferOutParams
import com.lightspark.grid.models.transferin.ExternalAccountReference
import com.lightspark.grid.models.transferin.InternalAccountReference
import com.lightspark.grid.models.transferin.TransferInRequest
import com.lightspark.grid.models.transferout.TransferOutRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val meServiceAsync = client.agents().me()

        val agent = meServiceAsync.retrieve()

        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createTransferIn() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val meServiceAsync = client.agents().me()

        val agentAction =
            meServiceAsync.createTransferIn(
                MeCreateTransferInParams.builder()
                    .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                    .transferInRequest(
                        TransferInRequest.builder()
                            .destination(
                                InternalAccountReference.builder()
                                    .accountId(
                                        "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .build()
                            )
                            .source(
                                ExternalAccountReference.builder()
                                    .accountId(
                                        "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .build()
                            )
                            .amount(12550L)
                            .build()
                    )
                    .build()
            )

        agentAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createTransferOut() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val meServiceAsync = client.agents().me()

        val agentAction =
            meServiceAsync.createTransferOut(
                MeCreateTransferOutParams.builder()
                    .idempotencyKey("550e8400-e29b-41d4-a716-446655440000")
                    .transferOutRequest(
                        TransferOutRequest.builder()
                            .destination(
                                TransferOutRequest.Destination.builder()
                                    .accountId(
                                        "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .paymentRail(TransferOutRequest.Destination.PaymentRail.ACH)
                                    .build()
                            )
                            .source(
                                InternalAccountReference.builder()
                                    .accountId(
                                        "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .build()
                            )
                            .amount(12550L)
                            .build()
                    )
                    .build()
            )

        agentAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listInternalAccounts() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val meServiceAsync = client.agents().me()

        val page = meServiceAsync.listInternalAccounts()

        page.response().validate()
    }
}
