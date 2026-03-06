// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnAccountInfoTest {

    @Test
    fun create() {
        val mxnAccountInfo =
            MxnAccountInfo.builder()
                .accountType(MxnAccountInfo.AccountType.MXN_ACCOUNT)
                .clabeNumber("123456789012345678")
                .addPaymentRail(MxnAccountInfo.PaymentRail.SPEI)
                .build()

        assertThat(mxnAccountInfo.accountType()).isEqualTo(MxnAccountInfo.AccountType.MXN_ACCOUNT)
        assertThat(mxnAccountInfo.clabeNumber()).isEqualTo("123456789012345678")
        assertThat(mxnAccountInfo.paymentRails()).containsExactly(MxnAccountInfo.PaymentRail.SPEI)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnAccountInfo =
            MxnAccountInfo.builder()
                .accountType(MxnAccountInfo.AccountType.MXN_ACCOUNT)
                .clabeNumber("123456789012345678")
                .addPaymentRail(MxnAccountInfo.PaymentRail.SPEI)
                .build()

        val roundtrippedMxnAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnAccountInfo),
                jacksonTypeRef<MxnAccountInfo>(),
            )

        assertThat(roundtrippedMxnAccountInfo).isEqualTo(mxnAccountInfo)
    }
}
