// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkAccountInfoTest {

    @Test
    fun create() {
        val dkkAccountInfo =
            DkkAccountInfo.builder()
                .accountType(DkkAccountInfo.AccountType.DKK_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(DkkAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .build()

        assertThat(dkkAccountInfo.accountType()).isEqualTo(DkkAccountInfo.AccountType.DKK_ACCOUNT)
        assertThat(dkkAccountInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(dkkAccountInfo.paymentRails()).containsExactly(DkkAccountInfo.PaymentRail.SEPA)
        assertThat(dkkAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dkkAccountInfo =
            DkkAccountInfo.builder()
                .accountType(DkkAccountInfo.AccountType.DKK_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(DkkAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .build()

        val roundtrippedDkkAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkAccountInfo),
                jacksonTypeRef<DkkAccountInfo>(),
            )

        assertThat(roundtrippedDkkAccountInfo).isEqualTo(dkkAccountInfo)
    }
}
