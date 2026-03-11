// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.crypto

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CryptoEstimateWithdrawalFeeParamsTest {

    @Test
    fun create() {
        CryptoEstimateWithdrawalFeeParams.builder()
            .amount(1000000L)
            .cryptoNetwork("SOLANA_MAINNET")
            .currency("USDC")
            .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
            .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
            .build()
    }

    @Test
    fun body() {
        val params =
            CryptoEstimateWithdrawalFeeParams.builder()
                .amount(1000000L)
                .cryptoNetwork("SOLANA_MAINNET")
                .currency("USDC")
                .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000000L)
        assertThat(body.cryptoNetwork()).isEqualTo("SOLANA_MAINNET")
        assertThat(body.currency()).isEqualTo("USDC")
        assertThat(body.destinationAddress())
            .isEqualTo("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
        assertThat(body.internalAccountId())
            .isEqualTo("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
    }
}
