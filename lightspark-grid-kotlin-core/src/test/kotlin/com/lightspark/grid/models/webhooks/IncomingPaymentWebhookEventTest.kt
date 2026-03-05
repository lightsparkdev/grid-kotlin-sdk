// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomingPaymentWebhookEventTest {

    @Test
    fun create() {
        val incomingPaymentWebhookEvent =
            IncomingPaymentWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    IncomingPaymentWebhookEvent.Data.builder()
                        .addRequestedReceiverCustomerInfoField(
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.FULL_NAME)
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
                .build()

        assertThat(incomingPaymentWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(incomingPaymentWebhookEvent.data())
            .isEqualTo(
                IncomingPaymentWebhookEvent.Data.builder()
                    .addRequestedReceiverCustomerInfoField(
                        CounterpartyFieldDefinition.builder()
                            .mandatory(true)
                            .name(CustomerInfoFieldName.FULL_NAME)
                            .build()
                    )
                    .build()
            )
        assertThat(incomingPaymentWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(incomingPaymentWebhookEvent.type())
            .isEqualTo(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val incomingPaymentWebhookEvent =
            IncomingPaymentWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    IncomingPaymentWebhookEvent.Data.builder()
                        .addRequestedReceiverCustomerInfoField(
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.FULL_NAME)
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
                .build()

        val roundtrippedIncomingPaymentWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(incomingPaymentWebhookEvent),
                jacksonTypeRef<IncomingPaymentWebhookEvent>(),
            )

        assertThat(roundtrippedIncomingPaymentWebhookEvent).isEqualTo(incomingPaymentWebhookEvent)
    }
}
