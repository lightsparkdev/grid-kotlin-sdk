// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopAccountInfoTest {

    @Test
    fun create() {
        val copAccountInfo =
            CopAccountInfo.builder()
                .accountNumber("x")
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(copAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(copAccountInfo.accountType()).isEqualTo(CopAccountInfo.AccountType.COP_ACCOUNT)
        assertThat(copAccountInfo.bankAccountType())
            .isEqualTo(CopAccountInfo.BankAccountType.CHECKING)
        assertThat(copAccountInfo.bankName()).isEqualTo("x")
        assertThat(copAccountInfo.paymentRails())
            .containsExactly(CopAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copAccountInfo =
            CopAccountInfo.builder()
                .accountNumber("x")
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedCopAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copAccountInfo),
                jacksonTypeRef<CopAccountInfo>(),
            )

        assertThat(roundtrippedCopAccountInfo).isEqualTo(copAccountInfo)
    }
}
