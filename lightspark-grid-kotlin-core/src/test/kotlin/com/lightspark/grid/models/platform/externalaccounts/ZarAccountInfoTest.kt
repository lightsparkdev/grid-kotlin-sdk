// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZarAccountInfoTest {

    @Test
    fun create() {
        val zarAccountInfo =
            ZarAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(zarAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(zarAccountInfo.accountType()).isEqualTo(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
        assertThat(zarAccountInfo.bankName()).isEqualTo("x")
        assertThat(zarAccountInfo.paymentRails())
            .containsExactly(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zarAccountInfo =
            ZarAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedZarAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zarAccountInfo),
                jacksonTypeRef<ZarAccountInfo>(),
            )

        assertThat(roundtrippedZarAccountInfo).isEqualTo(zarAccountInfo)
    }
}
