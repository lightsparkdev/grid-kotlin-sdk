// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdAccountInfoTest {

    @Test
    fun create() {
        val usdAccountInfo =
            UsdAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                .routingNumber("021000021")
                .bankAccountType(UsdAccountInfo.BankAccountType.CHECKING)
                .bankName("Chase Bank")
                .fiToFiInformation("/BNF/Invoice 4471")
                .intermediaryBankName("JPMorgan Chase Bank")
                .intermediaryRoutingNumber("021000021")
                .build()

        assertThat(usdAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(usdAccountInfo.accountType()).isEqualTo(UsdAccountInfo.AccountType.USD_ACCOUNT)
        assertThat(usdAccountInfo.paymentRails()).containsExactly(UsdAccountInfo.PaymentRail.ACH)
        assertThat(usdAccountInfo.routingNumber()).isEqualTo("021000021")
        assertThat(usdAccountInfo.bankAccountType())
            .isEqualTo(UsdAccountInfo.BankAccountType.CHECKING)
        assertThat(usdAccountInfo.bankName()).isEqualTo("Chase Bank")
        assertThat(usdAccountInfo.fiToFiInformation()).isEqualTo("/BNF/Invoice 4471")
        assertThat(usdAccountInfo.intermediaryBankName()).isEqualTo("JPMorgan Chase Bank")
        assertThat(usdAccountInfo.intermediaryRoutingNumber()).isEqualTo("021000021")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdAccountInfo =
            UsdAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                .routingNumber("021000021")
                .bankAccountType(UsdAccountInfo.BankAccountType.CHECKING)
                .bankName("Chase Bank")
                .fiToFiInformation("/BNF/Invoice 4471")
                .intermediaryBankName("JPMorgan Chase Bank")
                .intermediaryRoutingNumber("021000021")
                .build()

        val roundtrippedUsdAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdAccountInfo),
                jacksonTypeRef<UsdAccountInfo>(),
            )

        assertThat(roundtrippedUsdAccountInfo).isEqualTo(usdAccountInfo)
    }
}
