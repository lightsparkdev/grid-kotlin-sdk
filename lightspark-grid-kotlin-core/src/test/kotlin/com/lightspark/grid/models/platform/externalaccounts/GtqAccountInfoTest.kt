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
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .build()

        assertThat(gtqAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(gtqAccountInfo.accountType()).isEqualTo(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
        assertThat(gtqAccountInfo.paymentRails())
            .containsExactly(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(gtqAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gtqAccountInfo =
            GtqAccountInfo.builder()
                .accountNumber("x")
                .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedGtqAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtqAccountInfo),
                jacksonTypeRef<GtqAccountInfo>(),
            )

        assertThat(roundtrippedGtqAccountInfo).isEqualTo(gtqAccountInfo)
    }
}
