// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MwkAccountInfoTest {

    @Test
    fun create() {
        val mwkAccountInfo =
            MwkAccountInfo.builder()
                .accountType(MwkAccountInfo.AccountType.MWK_ACCOUNT)
                .addPaymentRail(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        assertThat(mwkAccountInfo.accountType()).isEqualTo(MwkAccountInfo.AccountType.MWK_ACCOUNT)
        assertThat(mwkAccountInfo.paymentRails())
            .containsExactly(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(mwkAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(mwkAccountInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mwkAccountInfo =
            MwkAccountInfo.builder()
                .accountType(MwkAccountInfo.AccountType.MWK_ACCOUNT)
                .addPaymentRail(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val roundtrippedMwkAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mwkAccountInfo),
                jacksonTypeRef<MwkAccountInfo>(),
            )

        assertThat(roundtrippedMwkAccountInfo).isEqualTo(mwkAccountInfo)
    }
}
