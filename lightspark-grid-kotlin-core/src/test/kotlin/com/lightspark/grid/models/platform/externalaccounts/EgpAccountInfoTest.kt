// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EgpAccountInfoTest {

    @Test
    fun create() {
        val egpAccountInfo =
            EgpAccountInfo.builder()
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("EG380019000500000000263180002")
                .phoneNumber("+1234567890")
                .build()

        assertThat(egpAccountInfo.accountType()).isEqualTo(EgpAccountInfo.AccountType.EGP_ACCOUNT)
        assertThat(egpAccountInfo.paymentRails())
            .containsExactly(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(egpAccountInfo.iban()).isEqualTo("EG380019000500000000263180002")
        assertThat(egpAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpAccountInfo =
            EgpAccountInfo.builder()
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("EG380019000500000000263180002")
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedEgpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpAccountInfo),
                jacksonTypeRef<EgpAccountInfo>(),
            )

        assertThat(roundtrippedEgpAccountInfo).isEqualTo(egpAccountInfo)
    }
}
