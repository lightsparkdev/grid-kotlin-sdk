// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VndAccountInfoTest {

    @Test
    fun create() {
        val vndAccountInfo =
            VndAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("Vietcombank")
                .addPaymentRail(VndAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BFTVVNVX")
                .build()

        assertThat(vndAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(vndAccountInfo.accountType()).isEqualTo(VndAccountInfo.AccountType.VND_ACCOUNT)
        assertThat(vndAccountInfo.bankName()).isEqualTo("Vietcombank")
        assertThat(vndAccountInfo.paymentRails())
            .containsExactly(VndAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(vndAccountInfo.swiftCode()).isEqualTo("BFTVVNVX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vndAccountInfo =
            VndAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("Vietcombank")
                .addPaymentRail(VndAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BFTVVNVX")
                .build()

        val roundtrippedVndAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vndAccountInfo),
                jacksonTypeRef<VndAccountInfo>(),
            )

        assertThat(roundtrippedVndAccountInfo).isEqualTo(vndAccountInfo)
    }
}
