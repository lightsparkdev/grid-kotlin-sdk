// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.crypto.CryptoEstimateWithdrawalFeeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CryptoServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun estimateWithdrawalFee() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val cryptoService = client.crypto()

        val response =
            cryptoService.estimateWithdrawalFee(
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
