// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpAccountInfoTest {

    @Test
    fun create() {
        val gbpAccountInfo =
            GbpAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
                .addPaymentRail(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("123456")
                .build()

        assertThat(gbpAccountInfo.accountNumber()).isEqualTo("12345678")
        assertThat(gbpAccountInfo.accountType()).isEqualTo(GbpAccountInfo.AccountType.GBP_ACCOUNT)
        assertThat(gbpAccountInfo.paymentRails())
            .containsExactly(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
        assertThat(gbpAccountInfo.sortCode()).isEqualTo("123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpAccountInfo =
            GbpAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
                .addPaymentRail(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("123456")
                .build()

        val roundtrippedGbpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpAccountInfo),
                jacksonTypeRef<GbpAccountInfo>(),
            )

        assertThat(roundtrippedGbpAccountInfo).isEqualTo(gbpAccountInfo)
    }
}
