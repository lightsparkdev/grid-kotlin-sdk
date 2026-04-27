// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GtqAccountInfoTest {

    @Test
    fun create() {
        val gtqAccountInfo =
            GtqAccountInfo.builder()
                .accountNumber("x")
                .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                .bankAccountType(GtqAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(gtqAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(gtqAccountInfo.accountType()).isEqualTo(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
        assertThat(gtqAccountInfo.bankAccountType())
            .isEqualTo(GtqAccountInfo.BankAccountType.CHECKING)
        assertThat(gtqAccountInfo.bankName()).isEqualTo("x")
        assertThat(gtqAccountInfo.paymentRails())
            .containsExactly(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gtqAccountInfo =
            GtqAccountInfo.builder()
                .accountNumber("x")
                .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                .bankAccountType(GtqAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedGtqAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtqAccountInfo),
                jacksonTypeRef<GtqAccountInfo>(),
            )

        assertThat(roundtrippedGtqAccountInfo).isEqualTo(gtqAccountInfo)
    }
}
