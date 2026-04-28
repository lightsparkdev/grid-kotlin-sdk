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
                .accountNumber("x")
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("EG380019000500000000263180002")
                .swiftCode("NBEGEGCX")
                .build()

        assertThat(egpAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(egpAccountInfo.accountType()).isEqualTo(EgpAccountInfo.AccountType.EGP_ACCOUNT)
        assertThat(egpAccountInfo.bankName()).isEqualTo("x")
        assertThat(egpAccountInfo.paymentRails())
            .containsExactly(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(egpAccountInfo.iban()).isEqualTo("EG380019000500000000263180002")
        assertThat(egpAccountInfo.swiftCode()).isEqualTo("NBEGEGCX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpAccountInfo =
            EgpAccountInfo.builder()
                .accountNumber("x")
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("EG380019000500000000263180002")
                .swiftCode("NBEGEGCX")
                .build()

        val roundtrippedEgpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpAccountInfo),
                jacksonTypeRef<EgpAccountInfo>(),
            )

        assertThat(roundtrippedEgpAccountInfo).isEqualTo(egpAccountInfo)
    }
}
