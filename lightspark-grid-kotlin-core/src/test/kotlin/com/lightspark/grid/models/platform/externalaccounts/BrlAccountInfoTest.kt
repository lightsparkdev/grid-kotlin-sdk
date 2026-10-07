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
                .pixKey("x")
                .pixKeyType(BrlAccountInfo.PixKeyType.CPF)
                .taxId("26912511571360")
                .build()

        assertThat(brlAccountInfo.accountType()).isEqualTo(BrlAccountInfo.AccountType.BRL_ACCOUNT)
        assertThat(brlAccountInfo.paymentRails()).containsExactly(BrlAccountInfo.PaymentRail.PIX)
        assertThat(brlAccountInfo.pixKey()).isEqualTo("x")
        assertThat(brlAccountInfo.pixKeyType()).isEqualTo(BrlAccountInfo.PixKeyType.CPF)
        assertThat(brlAccountInfo.taxId()).isEqualTo("26912511571360")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlAccountInfo =
            BrlAccountInfo.builder()
                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                .pixKey("x")
                .pixKeyType(BrlAccountInfo.PixKeyType.CPF)
                .taxId("26912511571360")
                .build()

        val roundtrippedBrlAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlAccountInfo),
                jacksonTypeRef<BrlAccountInfo>(),
            )

        assertThat(roundtrippedBrlAccountInfo).isEqualTo(brlAccountInfo)
    }
}
