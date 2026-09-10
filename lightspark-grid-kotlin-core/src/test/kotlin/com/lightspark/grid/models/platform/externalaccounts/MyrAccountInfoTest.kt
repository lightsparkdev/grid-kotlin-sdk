// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrAccountInfoTest {

    @Test
    fun create() {
        val myrAccountInfo =
            MyrAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("Maybank")
                .addPaymentRail(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("MABORUMMYYY")
                .build()

        assertThat(myrAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(myrAccountInfo.accountType()).isEqualTo(MyrAccountInfo.AccountType.MYR_ACCOUNT)
        assertThat(myrAccountInfo.bankName()).isEqualTo("Maybank")
        assertThat(myrAccountInfo.paymentRails())
            .containsExactly(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(myrAccountInfo.swiftCode()).isEqualTo("MABORUMMYYY")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrAccountInfo =
            MyrAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("Maybank")
                .addPaymentRail(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("MABORUMMYYY")
                .build()

        val roundtrippedMyrAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrAccountInfo),
                jacksonTypeRef<MyrAccountInfo>(),
            )

        assertThat(roundtrippedMyrAccountInfo).isEqualTo(myrAccountInfo)
    }
}
