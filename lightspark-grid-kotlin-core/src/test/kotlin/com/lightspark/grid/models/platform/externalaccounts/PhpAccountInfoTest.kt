// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpAccountInfoTest {

    @Test
    fun create() {
        val phpAccountInfo =
            PhpAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .addPaymentRail(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(phpAccountInfo.accountNumber()).isEqualTo("001234567890")
        assertThat(phpAccountInfo.accountType()).isEqualTo(PhpAccountInfo.AccountType.PHP_ACCOUNT)
        assertThat(phpAccountInfo.bankName()).isEqualTo("BDO Unibank")
        assertThat(phpAccountInfo.paymentRails())
            .containsExactly(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpAccountInfo =
            PhpAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .addPaymentRail(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedPhpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpAccountInfo),
                jacksonTypeRef<PhpAccountInfo>(),
            )

        assertThat(roundtrippedPhpAccountInfo).isEqualTo(phpAccountInfo)
    }
}
