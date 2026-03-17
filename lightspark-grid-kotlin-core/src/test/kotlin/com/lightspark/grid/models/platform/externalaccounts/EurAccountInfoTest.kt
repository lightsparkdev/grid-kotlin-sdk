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
                .iban("DE89370400440532013000")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .build()

        assertThat(eurAccountInfo.accountType()).isEqualTo(EurAccountInfo.AccountType.EUR_ACCOUNT)
        assertThat(eurAccountInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(eurAccountInfo.paymentRails()).containsExactly(EurAccountInfo.PaymentRail.SEPA)
        assertThat(eurAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eurAccountInfo =
            EurAccountInfo.builder()
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .build()

        val roundtrippedEurAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eurAccountInfo),
                jacksonTypeRef<EurAccountInfo>(),
            )

        assertThat(roundtrippedEurAccountInfo).isEqualTo(eurAccountInfo)
    }
}
