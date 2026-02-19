// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycStatusWebhookEventTest {

    @Test
    fun create() {
        val kycStatusWebhookEvent =
            KycStatusWebhookEvent.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(KycStatusWebhookEvent.KycStatus.APPROVED)
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KycStatusWebhookEvent.Type.INCOMING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        assertThat(kycStatusWebhookEvent.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(kycStatusWebhookEvent.kycStatus())
            .isEqualTo(KycStatusWebhookEvent.KycStatus.APPROVED)
        assertThat(kycStatusWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(kycStatusWebhookEvent.type())
            .isEqualTo(KycStatusWebhookEvent.Type.INCOMING_PAYMENT)
        assertThat(kycStatusWebhookEvent.webhookId())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kycStatusWebhookEvent =
            KycStatusWebhookEvent.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(KycStatusWebhookEvent.KycStatus.APPROVED)
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KycStatusWebhookEvent.Type.INCOMING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val roundtrippedKycStatusWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kycStatusWebhookEvent),
                jacksonTypeRef<KycStatusWebhookEvent>(),
            )

        assertThat(roundtrippedKycStatusWebhookEvent).isEqualTo(kycStatusWebhookEvent)
    }
}
