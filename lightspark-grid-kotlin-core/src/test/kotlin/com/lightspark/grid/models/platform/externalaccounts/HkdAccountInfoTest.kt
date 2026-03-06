// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HkdAccountInfoTest {

    @Test
    fun create() {
        val hkdAccountInfo =
            HkdAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("HSBC Hong Kong")
                .addPaymentRail(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
                .build()

        assertThat(hkdAccountInfo.accountNumber()).isEqualTo("123456789012")
        assertThat(hkdAccountInfo.accountType()).isEqualTo(HkdAccountInfo.AccountType.HKD_ACCOUNT)
        assertThat(hkdAccountInfo.bankName()).isEqualTo("HSBC Hong Kong")
        assertThat(hkdAccountInfo.paymentRails())
            .containsExactly(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(hkdAccountInfo.swiftCode()).isEqualTo("HSBCHKHHHKH")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdAccountInfo =
            HkdAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("HSBC Hong Kong")
                .addPaymentRail(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
                .build()

        val roundtrippedHkdAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdAccountInfo),
                jacksonTypeRef<HkdAccountInfo>(),
            )

        assertThat(roundtrippedHkdAccountInfo).isEqualTo(hkdAccountInfo)
    }
}
