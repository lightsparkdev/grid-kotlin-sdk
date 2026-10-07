// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KesAccountInfoTest {

    @Test
    fun create() {
        val kesAccountInfo =
            KesAccountInfo.builder()
                .accountType(KesAccountInfo.AccountType.KES_ACCOUNT)
                .addPaymentRail(KesAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+254712345678")
                .provider("x")
                .build()

        assertThat(kesAccountInfo.accountType()).isEqualTo(KesAccountInfo.AccountType.KES_ACCOUNT)
        assertThat(kesAccountInfo.paymentRails())
            .containsExactly(KesAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(kesAccountInfo.phoneNumber()).isEqualTo("+254712345678")
        assertThat(kesAccountInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kesAccountInfo =
            KesAccountInfo.builder()
                .accountType(KesAccountInfo.AccountType.KES_ACCOUNT)
                .addPaymentRail(KesAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+254712345678")
                .provider("x")
                .build()

        val roundtrippedKesAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kesAccountInfo),
                jacksonTypeRef<KesAccountInfo>(),
            )

        assertThat(roundtrippedKesAccountInfo).isEqualTo(kesAccountInfo)
    }
}
