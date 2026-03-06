// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlAccountInfoTest {

    @Test
    fun create() {
        val brlAccountInfo =
            BrlAccountInfo.builder()
                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .build()

        assertThat(brlAccountInfo.accountType()).isEqualTo(BrlAccountInfo.AccountType.BRL_ACCOUNT)
        assertThat(brlAccountInfo.paymentRails()).containsExactly(BrlAccountInfo.PaymentRail.PIX)
        assertThat(brlAccountInfo.pixKey()).isEqualTo("pixKey")
        assertThat(brlAccountInfo.pixKeyType()).isEqualTo("pixKeyType")
        assertThat(brlAccountInfo.taxId()).isEqualTo("taxId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlAccountInfo =
            BrlAccountInfo.builder()
                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .build()

        val roundtrippedBrlAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlAccountInfo),
                jacksonTypeRef<BrlAccountInfo>(),
            )

        assertThat(roundtrippedBrlAccountInfo).isEqualTo(brlAccountInfo)
    }
}
