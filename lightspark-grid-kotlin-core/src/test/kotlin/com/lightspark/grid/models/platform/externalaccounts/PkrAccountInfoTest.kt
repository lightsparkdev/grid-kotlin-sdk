// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PkrAccountInfoTest {

    @Test
    fun create() {
        val pkrAccountInfo =
            PkrAccountInfo.builder()
                .accountNumber("x")
                .accountType(PkrAccountInfo.AccountType.PKR_ACCOUNT)
                .addPaymentRail(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .iban("DE89370400440532013000")
                .build()

        assertThat(pkrAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(pkrAccountInfo.accountType()).isEqualTo(PkrAccountInfo.AccountType.PKR_ACCOUNT)
        assertThat(pkrAccountInfo.paymentRails())
            .containsExactly(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(pkrAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(pkrAccountInfo.iban()).isEqualTo("DE89370400440532013000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pkrAccountInfo =
            PkrAccountInfo.builder()
                .accountNumber("x")
                .accountType(PkrAccountInfo.AccountType.PKR_ACCOUNT)
                .addPaymentRail(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .iban("DE89370400440532013000")
                .build()

        val roundtrippedPkrAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pkrAccountInfo),
                jacksonTypeRef<PkrAccountInfo>(),
            )

        assertThat(roundtrippedPkrAccountInfo).isEqualTo(pkrAccountInfo)
    }
}
