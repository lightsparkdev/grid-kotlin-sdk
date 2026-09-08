// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrAccountInfoTest {

    @Test
    fun create() {
        val inrAccountInfo =
            InrAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .accountNumber("000111222333")
                .bankName("Example Bank")
                .ifsc("HDFC0001234")
                .rail("NEFT")
                .vpa("user@upi")
                .build()

        assertThat(inrAccountInfo.accountType()).isEqualTo(InrAccountInfo.AccountType.INR_ACCOUNT)
        assertThat(inrAccountInfo.paymentRails()).containsExactly(InrAccountInfo.PaymentRail.UPI)
        assertThat(inrAccountInfo.accountNumber()).isEqualTo("000111222333")
        assertThat(inrAccountInfo.bankName()).isEqualTo("Example Bank")
        assertThat(inrAccountInfo.ifsc()).isEqualTo("HDFC0001234")
        assertThat(inrAccountInfo.rail()).isEqualTo("NEFT")
        assertThat(inrAccountInfo.vpa()).isEqualTo("user@upi")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrAccountInfo =
            InrAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .accountNumber("000111222333")
                .bankName("Example Bank")
                .ifsc("HDFC0001234")
                .rail("NEFT")
                .vpa("user@upi")
                .build()

        val roundtrippedInrAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrAccountInfo),
                jacksonTypeRef<InrAccountInfo>(),
            )

        assertThat(roundtrippedInrAccountInfo).isEqualTo(inrAccountInfo)
    }
}
