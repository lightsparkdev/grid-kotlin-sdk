// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HtgAccountInfoTest {

    @Test
    fun create() {
        val htgAccountInfo =
            HtgAccountInfo.builder()
                .accountType(HtgAccountInfo.AccountType.HTG_ACCOUNT)
                .addPaymentRail(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .build()

        assertThat(htgAccountInfo.accountType()).isEqualTo(HtgAccountInfo.AccountType.HTG_ACCOUNT)
        assertThat(htgAccountInfo.paymentRails())
            .containsExactly(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(htgAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val htgAccountInfo =
            HtgAccountInfo.builder()
                .accountType(HtgAccountInfo.AccountType.HTG_ACCOUNT)
                .addPaymentRail(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedHtgAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(htgAccountInfo),
                jacksonTypeRef<HtgAccountInfo>(),
            )

        assertThat(roundtrippedHtgAccountInfo).isEqualTo(htgAccountInfo)
    }
}
