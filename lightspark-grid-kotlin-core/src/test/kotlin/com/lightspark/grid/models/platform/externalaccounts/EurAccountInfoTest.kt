// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EurAccountInfoTest {

    @Test
    fun create() {
        val eurAccountInfo =
            EurAccountInfo.builder()
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("iban")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftBic("swiftBic")
                .build()

        assertThat(eurAccountInfo.accountType()).isEqualTo(EurAccountInfo.AccountType.EUR_ACCOUNT)
        assertThat(eurAccountInfo.iban()).isEqualTo("iban")
        assertThat(eurAccountInfo.paymentRails()).containsExactly(EurAccountInfo.PaymentRail.SEPA)
        assertThat(eurAccountInfo.swiftBic()).isEqualTo("swiftBic")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eurAccountInfo =
            EurAccountInfo.builder()
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("iban")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftBic("swiftBic")
                .build()

        val roundtrippedEurAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eurAccountInfo),
                jacksonTypeRef<EurAccountInfo>(),
            )

        assertThat(roundtrippedEurAccountInfo).isEqualTo(eurAccountInfo)
    }
}
