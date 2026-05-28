// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThbAccountInfoTest {

    @Test
    fun create() {
        val thbAccountInfo =
            ThbAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ThbAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BKKBTHBK")
                .build()

        assertThat(thbAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(thbAccountInfo.accountType()).isEqualTo(ThbAccountInfo.AccountType.THB_ACCOUNT)
        assertThat(thbAccountInfo.bankName()).isEqualTo("x")
        assertThat(thbAccountInfo.paymentRails())
            .containsExactly(ThbAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(thbAccountInfo.swiftCode()).isEqualTo("BKKBTHBK")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thbAccountInfo =
            ThbAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ThbAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BKKBTHBK")
                .build()

        val roundtrippedThbAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbAccountInfo),
                jacksonTypeRef<ThbAccountInfo>(),
            )

        assertThat(roundtrippedThbAccountInfo).isEqualTo(thbAccountInfo)
    }
}
