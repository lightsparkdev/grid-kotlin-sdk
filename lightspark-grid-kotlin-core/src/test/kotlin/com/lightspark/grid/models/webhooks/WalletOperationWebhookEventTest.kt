// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletOperationWebhookEventTest {

    @Test
    fun create() {
        val walletOperationWebhookEvent =
            WalletOperationWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    WalletOperationWebhookEvent.Data.Completed.builder()
                        .operationId("Operation:019542f5-b3e7-1d02-0000-000000000099")
                        .operationType(
                            WalletOperationWebhookEvent.Data.Completed.OperationType.WALLET_EXPORT
                        )
                        .requestId("Request:9f7a2c10-5e88-4fb1-bd0e-1c3a8e7b2d45")
                        .resourceId("InternalAccount:019542f5-b3e7-1d02-0000-000000000005")
                        .resourceType(
                            WalletOperationWebhookEvent.Data.Completed.ResourceType.INTERNAL_ACCOUNT
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(WalletOperationWebhookEvent.Type.WALLET_OPERATION_COMPLETED)
                .build()

        assertThat(walletOperationWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(walletOperationWebhookEvent.data())
            .isEqualTo(
                WalletOperationWebhookEvent.Data.ofCompleted(
                    WalletOperationWebhookEvent.Data.Completed.builder()
                        .operationId("Operation:019542f5-b3e7-1d02-0000-000000000099")
                        .operationType(
                            WalletOperationWebhookEvent.Data.Completed.OperationType.WALLET_EXPORT
                        )
                        .requestId("Request:9f7a2c10-5e88-4fb1-bd0e-1c3a8e7b2d45")
                        .resourceId("InternalAccount:019542f5-b3e7-1d02-0000-000000000005")
                        .resourceType(
                            WalletOperationWebhookEvent.Data.Completed.ResourceType.INTERNAL_ACCOUNT
                        )
                        .build()
                )
            )
        assertThat(walletOperationWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(walletOperationWebhookEvent.type())
            .isEqualTo(WalletOperationWebhookEvent.Type.WALLET_OPERATION_COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val walletOperationWebhookEvent =
            WalletOperationWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    WalletOperationWebhookEvent.Data.Completed.builder()
                        .operationId("Operation:019542f5-b3e7-1d02-0000-000000000099")
                        .operationType(
                            WalletOperationWebhookEvent.Data.Completed.OperationType.WALLET_EXPORT
                        )
                        .requestId("Request:9f7a2c10-5e88-4fb1-bd0e-1c3a8e7b2d45")
                        .resourceId("InternalAccount:019542f5-b3e7-1d02-0000-000000000005")
                        .resourceType(
                            WalletOperationWebhookEvent.Data.Completed.ResourceType.INTERNAL_ACCOUNT
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(WalletOperationWebhookEvent.Type.WALLET_OPERATION_COMPLETED)
                .build()

        val roundtrippedWalletOperationWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletOperationWebhookEvent),
                jacksonTypeRef<WalletOperationWebhookEvent>(),
            )

        assertThat(roundtrippedWalletOperationWebhookEvent).isEqualTo(walletOperationWebhookEvent)
    }
}
