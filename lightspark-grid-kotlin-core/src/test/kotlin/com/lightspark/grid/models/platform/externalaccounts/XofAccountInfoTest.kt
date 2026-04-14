// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XofAccountInfoTest {

    @Test
    fun create() {
        val xofAccountInfo =
            XofAccountInfo.builder()
                .accountType(XofAccountInfo.AccountType.XOF_ACCOUNT)
                .addPaymentRail(XofAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofAccountInfo.Region.BJ)
                .build()

        assertThat(xofAccountInfo.accountType()).isEqualTo(XofAccountInfo.AccountType.XOF_ACCOUNT)
        assertThat(xofAccountInfo.paymentRails())
            .containsExactly(XofAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(xofAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(xofAccountInfo.provider()).isEqualTo("x")
        assertThat(xofAccountInfo.region()).isEqualTo(XofAccountInfo.Region.BJ)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xofAccountInfo =
            XofAccountInfo.builder()
                .accountType(XofAccountInfo.AccountType.XOF_ACCOUNT)
                .addPaymentRail(XofAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofAccountInfo.Region.BJ)
                .build()

        val roundtrippedXofAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xofAccountInfo),
                jacksonTypeRef<XofAccountInfo>(),
            )

        assertThat(roundtrippedXofAccountInfo).isEqualTo(xofAccountInfo)
    }
}
