// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BdtAccountInfoTest {

    @Test
    fun create() {
        val bdtAccountInfo =
            BdtAccountInfo.builder()
                .accountNumber("x")
                .accountType(BdtAccountInfo.AccountType.BDT_ACCOUNT)
                .branchCode("21029")
                .addPaymentRail(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .swiftCode("DEUTDEFF")
                .build()

        assertThat(bdtAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(bdtAccountInfo.accountType()).isEqualTo(BdtAccountInfo.AccountType.BDT_ACCOUNT)
        assertThat(bdtAccountInfo.branchCode()).isEqualTo("21029")
        assertThat(bdtAccountInfo.paymentRails())
            .containsExactly(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(bdtAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(bdtAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bdtAccountInfo =
            BdtAccountInfo.builder()
                .accountNumber("x")
                .accountType(BdtAccountInfo.AccountType.BDT_ACCOUNT)
                .branchCode("21029")
                .addPaymentRail(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .swiftCode("DEUTDEFF")
                .build()

        val roundtrippedBdtAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bdtAccountInfo),
                jacksonTypeRef<BdtAccountInfo>(),
            )

        assertThat(roundtrippedBdtAccountInfo).isEqualTo(bdtAccountInfo)
    }
}
