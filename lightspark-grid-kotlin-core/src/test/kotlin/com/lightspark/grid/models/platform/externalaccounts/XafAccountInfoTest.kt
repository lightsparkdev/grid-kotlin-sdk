// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XafAccountInfoTest {

    @Test
    fun create() {
        val xafAccountInfo =
            XafAccountInfo.builder()
                .accountType(XafAccountInfo.AccountType.XAF_ACCOUNT)
                .addPaymentRail(XafAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafAccountInfo.Region.CM)
                .build()

        assertThat(xafAccountInfo.accountType()).isEqualTo(XafAccountInfo.AccountType.XAF_ACCOUNT)
        assertThat(xafAccountInfo.paymentRails())
            .containsExactly(XafAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(xafAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(xafAccountInfo.provider()).isEqualTo("x")
        assertThat(xafAccountInfo.region()).isEqualTo(XafAccountInfo.Region.CM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xafAccountInfo =
            XafAccountInfo.builder()
                .accountType(XafAccountInfo.AccountType.XAF_ACCOUNT)
                .addPaymentRail(XafAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafAccountInfo.Region.CM)
                .build()

        val roundtrippedXafAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xafAccountInfo),
                jacksonTypeRef<XafAccountInfo>(),
            )

        assertThat(roundtrippedXafAccountInfo).isEqualTo(xafAccountInfo)
    }
}
