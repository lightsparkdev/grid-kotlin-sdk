// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JmdAccountInfoTest {

    @Test
    fun create() {
        val jmdAccountInfo =
            JmdAccountInfo.builder()
                .accountNumber("x")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .branchCode("21029")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(jmdAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(jmdAccountInfo.accountType()).isEqualTo(JmdAccountInfo.AccountType.JMD_ACCOUNT)
        assertThat(jmdAccountInfo.bankAccountType())
            .isEqualTo(JmdAccountInfo.BankAccountType.CHECKING)
        assertThat(jmdAccountInfo.branchCode()).isEqualTo("21029")
        assertThat(jmdAccountInfo.paymentRails())
            .containsExactly(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jmdAccountInfo =
            JmdAccountInfo.builder()
                .accountNumber("x")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .branchCode("21029")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedJmdAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jmdAccountInfo),
                jacksonTypeRef<JmdAccountInfo>(),
            )

        assertThat(roundtrippedJmdAccountInfo).isEqualTo(jmdAccountInfo)
    }
}
