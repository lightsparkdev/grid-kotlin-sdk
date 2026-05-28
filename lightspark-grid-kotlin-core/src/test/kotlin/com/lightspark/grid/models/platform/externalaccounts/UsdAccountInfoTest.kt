// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdAccountInfoTest {

    @Test
    fun create() {
        val usdAccountInfo =
            UsdAccountInfo.builder()
                .accountNumber("x")
                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                .routingNumber("021000021")
                .build()

        assertThat(usdAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(usdAccountInfo.accountType()).isEqualTo(UsdAccountInfo.AccountType.USD_ACCOUNT)
        assertThat(usdAccountInfo.paymentRails()).containsExactly(UsdAccountInfo.PaymentRail.ACH)
        assertThat(usdAccountInfo.routingNumber()).isEqualTo("021000021")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdAccountInfo =
            UsdAccountInfo.builder()
                .accountNumber("x")
                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                .routingNumber("021000021")
                .build()

        val roundtrippedUsdAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdAccountInfo),
                jacksonTypeRef<UsdAccountInfo>(),
            )

        assertThat(roundtrippedUsdAccountInfo).isEqualTo(usdAccountInfo)
    }
}
