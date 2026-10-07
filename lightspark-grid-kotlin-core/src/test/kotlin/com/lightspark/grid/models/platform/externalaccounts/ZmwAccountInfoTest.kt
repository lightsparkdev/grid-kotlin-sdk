// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZmwAccountInfoTest {

    @Test
    fun create() {
        val zmwAccountInfo =
            ZmwAccountInfo.builder()
                .accountType(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
                .addPaymentRail(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+260971234567")
                .provider("x")
                .build()

        assertThat(zmwAccountInfo.accountType()).isEqualTo(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
        assertThat(zmwAccountInfo.paymentRails())
            .containsExactly(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(zmwAccountInfo.phoneNumber()).isEqualTo("+260971234567")
        assertThat(zmwAccountInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zmwAccountInfo =
            ZmwAccountInfo.builder()
                .accountType(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
                .addPaymentRail(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+260971234567")
                .provider("x")
                .build()

        val roundtrippedZmwAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zmwAccountInfo),
                jacksonTypeRef<ZmwAccountInfo>(),
            )

        assertThat(roundtrippedZmwAccountInfo).isEqualTo(zmwAccountInfo)
    }
}
