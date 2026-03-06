// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NgnAccountInfoTest {

    @Test
    fun create() {
        val ngnAccountInfo =
            NgnAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("First Bank of Nigeria")
                .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(ngnAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(ngnAccountInfo.accountType()).isEqualTo(NgnAccountInfo.AccountType.NGN_ACCOUNT)
        assertThat(ngnAccountInfo.bankName()).isEqualTo("First Bank of Nigeria")
        assertThat(ngnAccountInfo.paymentRails())
            .containsExactly(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ngnAccountInfo =
            NgnAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("First Bank of Nigeria")
                .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedNgnAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ngnAccountInfo),
                jacksonTypeRef<NgnAccountInfo>(),
            )

        assertThat(roundtrippedNgnAccountInfo).isEqualTo(ngnAccountInfo)
    }
}
