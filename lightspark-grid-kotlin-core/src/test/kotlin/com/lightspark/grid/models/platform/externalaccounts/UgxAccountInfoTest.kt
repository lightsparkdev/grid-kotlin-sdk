// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UgxAccountInfoTest {

    @Test
    fun create() {
        val ugxAccountInfo =
            UgxAccountInfo.builder()
                .accountType(UgxAccountInfo.AccountType.UGX_ACCOUNT)
                .addPaymentRail(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        assertThat(ugxAccountInfo.accountType()).isEqualTo(UgxAccountInfo.AccountType.UGX_ACCOUNT)
        assertThat(ugxAccountInfo.paymentRails())
            .containsExactly(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(ugxAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(ugxAccountInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ugxAccountInfo =
            UgxAccountInfo.builder()
                .accountType(UgxAccountInfo.AccountType.UGX_ACCOUNT)
                .addPaymentRail(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val roundtrippedUgxAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ugxAccountInfo),
                jacksonTypeRef<UgxAccountInfo>(),
            )

        assertThat(roundtrippedUgxAccountInfo).isEqualTo(ugxAccountInfo)
    }
}
