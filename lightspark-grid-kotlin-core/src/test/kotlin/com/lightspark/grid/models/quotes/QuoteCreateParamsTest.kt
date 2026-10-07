// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteCreateParamsTest {

    @Test
    fun create() {
        QuoteCreateParams.builder()
            .idempotencyKey("<uuid>")
            .destination(
                QuoteDestinationOneOf.Account.builder()
                    .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                    .build()
            )
            .lockedCurrencyAmount(12550L)
            .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
            .source(
                QuoteSourceOneOf.Account.builder()
                    .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )
            .description("Same-currency payout, no exchange required.")
            .documentIds(
                listOf(
                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                )
            )
            .immediatelyExecute(true)
            .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
            .platformFeeOverride(
                QuoteCreateParams.PlatformFeeOverride.builder()
                    .platformFixedFee(
                        QuoteCreateParams.PlatformFeeOverride.PlatformFixedFee.builder()
                            .amount(50L)
                            .currency("USD")
                            .build()
                    )
                    .platformVariableFeeBps(30L)
                    .build()
            )
            .purposeOfPayment(QuoteCreateParams.PurposeOfPayment.GIFT)
            .remittanceInformation("INV-12345")
            .scaFactor(QuoteCreateParams.ScaFactor.SMS_OTP)
            .senderCustomerInfo(
                QuoteCreateParams.SenderCustomerInfo.builder()
                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            QuoteCreateParams.builder()
                .idempotencyKey("<uuid>")
                .destination(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
                .lockedCurrencyAmount(12550L)
                .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                .source(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .description("Same-currency payout, no exchange required.")
                .documentIds(
                    listOf(
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                    )
                )
                .immediatelyExecute(true)
                .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                .platformFeeOverride(
                    QuoteCreateParams.PlatformFeeOverride.builder()
                        .platformFixedFee(
                            QuoteCreateParams.PlatformFeeOverride.PlatformFixedFee.builder()
                                .amount(50L)
                                .currency("USD")
                                .build()
                        )
                        .platformVariableFeeBps(30L)
                        .build()
                )
                .purposeOfPayment(QuoteCreateParams.PurposeOfPayment.GIFT)
                .remittanceInformation("INV-12345")
                .scaFactor(QuoteCreateParams.ScaFactor.SMS_OTP)
                .senderCustomerInfo(
                    QuoteCreateParams.SenderCustomerInfo.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Idempotency-Key", "<uuid>").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            QuoteCreateParams.builder()
                .accountDestination("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .lockedCurrencyAmount(12550L)
                .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                .accountSource("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            QuoteCreateParams.builder()
                .idempotencyKey("<uuid>")
                .destination(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
                .lockedCurrencyAmount(12550L)
                .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                .source(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .description("Same-currency payout, no exchange required.")
                .documentIds(
                    listOf(
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                    )
                )
                .immediatelyExecute(true)
                .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                .platformFeeOverride(
                    QuoteCreateParams.PlatformFeeOverride.builder()
                        .platformFixedFee(
                            QuoteCreateParams.PlatformFeeOverride.PlatformFixedFee.builder()
                                .amount(50L)
                                .currency("USD")
                                .build()
                        )
                        .platformVariableFeeBps(30L)
                        .build()
                )
                .purposeOfPayment(QuoteCreateParams.PurposeOfPayment.GIFT)
                .remittanceInformation("INV-12345")
                .scaFactor(QuoteCreateParams.ScaFactor.SMS_OTP)
                .senderCustomerInfo(
                    QuoteCreateParams.SenderCustomerInfo.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.destination())
            .isEqualTo(
                QuoteDestinationOneOf.ofAccount(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
            )
        assertThat(body.lockedCurrencyAmount()).isEqualTo(12550L)
        assertThat(body.lockedCurrencySide())
            .isEqualTo(QuoteCreateParams.LockedCurrencySide.SENDING)
        assertThat(body.source())
            .isEqualTo(
                QuoteSourceOneOf.ofAccount(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
            )
        assertThat(body.description()).isEqualTo("Same-currency payout, no exchange required.")
        assertThat(body.documentIds())
            .containsExactly(
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(body.immediatelyExecute()).isEqualTo(true)
        assertThat(body.lookupId()).isEqualTo("Lookup:019542f5-b3e7-1d02-0000-000000000009")
        assertThat(body.platformFeeOverride())
            .isEqualTo(
                QuoteCreateParams.PlatformFeeOverride.builder()
                    .platformFixedFee(
                        QuoteCreateParams.PlatformFeeOverride.PlatformFixedFee.builder()
                            .amount(50L)
                            .currency("USD")
                            .build()
                    )
                    .platformVariableFeeBps(30L)
                    .build()
            )
        assertThat(body.purposeOfPayment()).isEqualTo(QuoteCreateParams.PurposeOfPayment.GIFT)
        assertThat(body.remittanceInformation()).isEqualTo("INV-12345")
        assertThat(body.scaFactor()).isEqualTo(QuoteCreateParams.ScaFactor.SMS_OTP)
        assertThat(body.senderCustomerInfo())
            .isEqualTo(
                QuoteCreateParams.SenderCustomerInfo.builder()
                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            QuoteCreateParams.builder()
                .accountDestination("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .lockedCurrencyAmount(12550L)
                .lockedCurrencySide(QuoteCreateParams.LockedCurrencySide.SENDING)
                .accountSource("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val body = params._body()

        assertThat(body.destination())
            .isEqualTo(
                QuoteDestinationOneOf.ofAccount(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .build()
                )
            )
        assertThat(body.lockedCurrencyAmount()).isEqualTo(12550L)
        assertThat(body.lockedCurrencySide())
            .isEqualTo(QuoteCreateParams.LockedCurrencySide.SENDING)
        assertThat(body.source())
            .isEqualTo(
                QuoteSourceOneOf.ofAccount(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .build()
                )
            )
    }
}
