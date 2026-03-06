// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrAccountInfoTest {

    @Test
    fun create() {
        val idrAccountInfo =
            IdrAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(IdrAccountInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia")
                .addPaymentRail(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

        assertThat(idrAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(idrAccountInfo.accountType()).isEqualTo(IdrAccountInfo.AccountType.IDR_ACCOUNT)
        assertThat(idrAccountInfo.bankName()).isEqualTo("Bank Central Asia")
        assertThat(idrAccountInfo.paymentRails())
            .containsExactly(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(idrAccountInfo.phoneNumber()).isEqualTo("+6281234567890")
        assertThat(idrAccountInfo.swiftCode()).isEqualTo("CENAIDJA")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrAccountInfo =
            IdrAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(IdrAccountInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia")
                .addPaymentRail(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

        val roundtrippedIdrAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrAccountInfo),
                jacksonTypeRef<IdrAccountInfo>(),
            )

        assertThat(roundtrippedIdrAccountInfo).isEqualTo(idrAccountInfo)
    }
}
