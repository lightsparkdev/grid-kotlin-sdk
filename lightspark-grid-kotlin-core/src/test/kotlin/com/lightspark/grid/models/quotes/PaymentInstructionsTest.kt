// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentInstructionsTest {

    @Test
    fun create() {
        val paymentInstructions =
            PaymentInstructions.builder()
                .accountOrWalletInfo(
                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                        .accountNumber("x")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("021000021")
                        .reference("UMA-Q12345-REF")
                        .build()
                )
                .instructionsNotes(
                    "Please ensure the reference code is included in the payment memo/description field"
                )
                .isPlatformAccount(true)
                .build()

        assertThat(paymentInstructions.accountOrWalletInfo())
            .isEqualTo(
                PaymentInstructions.AccountOrWalletInfo.ofUsdAccount(
                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                        .accountNumber("x")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("021000021")
                        .reference("UMA-Q12345-REF")
                        .build()
                )
            )
        assertThat(paymentInstructions.instructionsNotes())
            .isEqualTo(
                "Please ensure the reference code is included in the payment memo/description field"
            )
        assertThat(paymentInstructions.isPlatformAccount()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentInstructions =
            PaymentInstructions.builder()
                .accountOrWalletInfo(
                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                        .accountNumber("x")
                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                        .routingNumber("021000021")
                        .reference("UMA-Q12345-REF")
                        .build()
                )
                .instructionsNotes(
                    "Please ensure the reference code is included in the payment memo/description field"
                )
                .isPlatformAccount(true)
                .build()

        val roundtrippedPaymentInstructions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentInstructions),
                jacksonTypeRef<PaymentInstructions>(),
            )

        assertThat(roundtrippedPaymentInstructions).isEqualTo(paymentInstructions)
    }
}
