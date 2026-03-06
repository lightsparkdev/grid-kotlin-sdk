// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CadAccountInfoTest {

    @Test
    fun create() {
        val cadAccountInfo =
            CadAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .branchCode("00012")
                .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(cadAccountInfo.accountNumber()).isEqualTo("1234567")
        assertThat(cadAccountInfo.accountType()).isEqualTo(CadAccountInfo.AccountType.CAD_ACCOUNT)
        assertThat(cadAccountInfo.bankCode()).isEqualTo("001")
        assertThat(cadAccountInfo.branchCode()).isEqualTo("00012")
        assertThat(cadAccountInfo.paymentRails())
            .containsExactly(CadAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cadAccountInfo =
            CadAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .branchCode("00012")
                .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedCadAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cadAccountInfo),
                jacksonTypeRef<CadAccountInfo>(),
            )

        assertThat(roundtrippedCadAccountInfo).isEqualTo(cadAccountInfo)
    }
}
