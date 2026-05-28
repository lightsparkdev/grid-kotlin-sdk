// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.crypto

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CryptoEstimateWithdrawalFeeParamsTest {

    @Test
    fun create() {
        CryptoEstimateWithdrawalFeeParams.builder()
            .estimateCryptoWithdrawalFeeRequest(
                EstimateCryptoWithdrawalFeeRequest.builder()
                    .amount(1000000L)
                    .cryptoNetwork("SOLANA")
                    .currency("USDC")
                    .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                    .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CryptoEstimateWithdrawalFeeParams.builder()
                .estimateCryptoWithdrawalFeeRequest(
                    EstimateCryptoWithdrawalFeeRequest.builder()
                        .amount(1000000L)
                        .cryptoNetwork("SOLANA")
                        .currency("USDC")
                        .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                        .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EstimateCryptoWithdrawalFeeRequest.builder()
                    .amount(1000000L)
                    .cryptoNetwork("SOLANA")
                    .currency("USDC")
                    .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                    .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .build()
            )
    }
}
