// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.crypto.CryptoEstimateWithdrawalFeeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CryptoServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun estimateWithdrawalFee() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val cryptoServiceAsync = client.crypto()

        val response =
            cryptoServiceAsync.estimateWithdrawalFee(
                CryptoEstimateWithdrawalFeeParams.builder()
                    .amount(1000000L)
                    .cryptoNetwork("SOLANA_MAINNET")
                    .currency("USDC")
                    .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                    .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .build()
            )

        response.validate()
    }
}
