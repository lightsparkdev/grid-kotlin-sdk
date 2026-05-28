// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RwfAccountInfoTest {

    @Test
    fun create() {
        val rwfAccountInfo =
            RwfAccountInfo.builder()
                .accountType(RwfAccountInfo.AccountType.RWF_ACCOUNT)
                .addPaymentRail(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+250781234567")
                .provider("Example Provider")
                .build()

        assertThat(rwfAccountInfo.accountType()).isEqualTo(RwfAccountInfo.AccountType.RWF_ACCOUNT)
        assertThat(rwfAccountInfo.paymentRails())
            .containsExactly(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(rwfAccountInfo.phoneNumber()).isEqualTo("+250781234567")
        assertThat(rwfAccountInfo.provider()).isEqualTo("Example Provider")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rwfAccountInfo =
            RwfAccountInfo.builder()
                .accountType(RwfAccountInfo.AccountType.RWF_ACCOUNT)
                .addPaymentRail(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+250781234567")
                .provider("Example Provider")
                .build()

        val roundtrippedRwfAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rwfAccountInfo),
                jacksonTypeRef<RwfAccountInfo>(),
            )

        assertThat(roundtrippedRwfAccountInfo).isEqualTo(rwfAccountInfo)
    }
}
