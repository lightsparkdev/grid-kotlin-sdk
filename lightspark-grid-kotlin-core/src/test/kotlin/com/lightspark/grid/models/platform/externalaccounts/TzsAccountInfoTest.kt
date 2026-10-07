// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TzsAccountInfoTest {

    @Test
    fun create() {
        val tzsAccountInfo =
            TzsAccountInfo.builder()
                .accountType(TzsAccountInfo.AccountType.TZS_ACCOUNT)
                .addPaymentRail(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+255712345678")
                .provider("x")
                .build()

        assertThat(tzsAccountInfo.accountType()).isEqualTo(TzsAccountInfo.AccountType.TZS_ACCOUNT)
        assertThat(tzsAccountInfo.paymentRails())
            .containsExactly(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(tzsAccountInfo.phoneNumber()).isEqualTo("+255712345678")
        assertThat(tzsAccountInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tzsAccountInfo =
            TzsAccountInfo.builder()
                .accountType(TzsAccountInfo.AccountType.TZS_ACCOUNT)
                .addPaymentRail(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+255712345678")
                .provider("x")
                .build()

        val roundtrippedTzsAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tzsAccountInfo),
                jacksonTypeRef<TzsAccountInfo>(),
            )

        assertThat(roundtrippedTzsAccountInfo).isEqualTo(tzsAccountInfo)
    }
}
