// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BwpAccountInfoTest {

    @Test
    fun create() {
        val bwpAccountInfo =
            BwpAccountInfo.builder()
                .accountType(BwpAccountInfo.AccountType.BWP_ACCOUNT)
                .addPaymentRail(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        assertThat(bwpAccountInfo.accountType()).isEqualTo(BwpAccountInfo.AccountType.BWP_ACCOUNT)
        assertThat(bwpAccountInfo.paymentRails())
            .containsExactly(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(bwpAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(bwpAccountInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bwpAccountInfo =
            BwpAccountInfo.builder()
                .accountType(BwpAccountInfo.AccountType.BWP_ACCOUNT)
                .addPaymentRail(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val roundtrippedBwpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bwpAccountInfo),
                jacksonTypeRef<BwpAccountInfo>(),
            )

        assertThat(roundtrippedBwpAccountInfo).isEqualTo(bwpAccountInfo)
    }
}
