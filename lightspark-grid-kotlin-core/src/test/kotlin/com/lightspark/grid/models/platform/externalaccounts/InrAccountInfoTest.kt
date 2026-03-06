// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrAccountInfoTest {

    @Test
    fun create() {
        val inrAccountInfo =
            InrAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .vpa("vpa")
                .build()

        assertThat(inrAccountInfo.accountType()).isEqualTo(InrAccountInfo.AccountType.INR_ACCOUNT)
        assertThat(inrAccountInfo.paymentRails()).containsExactly(InrAccountInfo.PaymentRail.UPI)
        assertThat(inrAccountInfo.vpa()).isEqualTo("vpa")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrAccountInfo =
            InrAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .vpa("vpa")
                .build()

        val roundtrippedInrAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrAccountInfo),
                jacksonTypeRef<InrAccountInfo>(),
            )

        assertThat(roundtrippedInrAccountInfo).isEqualTo(inrAccountInfo)
    }
}
