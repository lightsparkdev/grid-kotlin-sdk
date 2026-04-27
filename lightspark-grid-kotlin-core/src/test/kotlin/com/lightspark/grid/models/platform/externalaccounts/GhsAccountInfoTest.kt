// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GhsAccountInfoTest {

    @Test
    fun create() {
        val ghsAccountInfo =
            GhsAccountInfo.builder()
                .accountNumber("x")
                .accountType(GhsAccountInfo.AccountType.GHS_ACCOUNT)
                .bankName("x")
                .addPaymentRail(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .build()

        assertThat(ghsAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(ghsAccountInfo.accountType()).isEqualTo(GhsAccountInfo.AccountType.GHS_ACCOUNT)
        assertThat(ghsAccountInfo.bankName()).isEqualTo("x")
        assertThat(ghsAccountInfo.paymentRails())
            .containsExactly(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(ghsAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ghsAccountInfo =
            GhsAccountInfo.builder()
                .accountNumber("x")
                .accountType(GhsAccountInfo.AccountType.GHS_ACCOUNT)
                .bankName("x")
                .addPaymentRail(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedGhsAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ghsAccountInfo),
                jacksonTypeRef<GhsAccountInfo>(),
            )

        assertThat(roundtrippedGhsAccountInfo).isEqualTo(ghsAccountInfo)
    }
}
