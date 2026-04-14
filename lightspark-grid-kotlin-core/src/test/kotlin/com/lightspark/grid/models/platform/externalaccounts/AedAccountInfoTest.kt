// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AedAccountInfoTest {

    @Test
    fun create() {
        val aedAccountInfo =
            AedAccountInfo.builder()
                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                .iban("AE070331234567890123456")
                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("EBILAEAD")
                .build()

        assertThat(aedAccountInfo.accountType()).isEqualTo(AedAccountInfo.AccountType.AED_ACCOUNT)
        assertThat(aedAccountInfo.iban()).isEqualTo("AE070331234567890123456")
        assertThat(aedAccountInfo.paymentRails())
            .containsExactly(AedAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(aedAccountInfo.swiftCode()).isEqualTo("EBILAEAD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aedAccountInfo =
            AedAccountInfo.builder()
                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                .iban("AE070331234567890123456")
                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("EBILAEAD")
                .build()

        val roundtrippedAedAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aedAccountInfo),
                jacksonTypeRef<AedAccountInfo>(),
            )

        assertThat(roundtrippedAedAccountInfo).isEqualTo(aedAccountInfo)
    }
}
