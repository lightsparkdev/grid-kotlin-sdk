// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdAccountInfoTest {

    @Test
    fun create() {
        val sgdAccountInfo =
            SgdAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .addPaymentRail(SgdAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .build()

        assertThat(sgdAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(sgdAccountInfo.accountType()).isEqualTo(SgdAccountInfo.AccountType.SGD_ACCOUNT)
        assertThat(sgdAccountInfo.bankName()).isEqualTo("DBS Bank Ltd")
        assertThat(sgdAccountInfo.paymentRails()).containsExactly(SgdAccountInfo.PaymentRail.PAYNOW)
        assertThat(sgdAccountInfo.swiftCode()).isEqualTo("DBSSSGSG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdAccountInfo =
            SgdAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .addPaymentRail(SgdAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .build()

        val roundtrippedSgdAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdAccountInfo),
                jacksonTypeRef<SgdAccountInfo>(),
            )

        assertThat(roundtrippedSgdAccountInfo).isEqualTo(sgdAccountInfo)
    }
}
