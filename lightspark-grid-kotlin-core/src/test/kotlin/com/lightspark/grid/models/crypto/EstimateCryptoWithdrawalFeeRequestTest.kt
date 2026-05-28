// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.crypto

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EstimateCryptoWithdrawalFeeRequestTest {

    @Test
    fun create() {
        val estimateCryptoWithdrawalFeeRequest =
            EstimateCryptoWithdrawalFeeRequest.builder()
                .amount(1000000L)
                .cryptoNetwork("SOLANA")
                .currency("USDC")
                .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        assertThat(estimateCryptoWithdrawalFeeRequest.amount()).isEqualTo(1000000L)
        assertThat(estimateCryptoWithdrawalFeeRequest.cryptoNetwork()).isEqualTo("SOLANA")
        assertThat(estimateCryptoWithdrawalFeeRequest.currency()).isEqualTo("USDC")
        assertThat(estimateCryptoWithdrawalFeeRequest.destinationAddress())
            .isEqualTo("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
        assertThat(estimateCryptoWithdrawalFeeRequest.internalAccountId())
            .isEqualTo("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val estimateCryptoWithdrawalFeeRequest =
            EstimateCryptoWithdrawalFeeRequest.builder()
                .amount(1000000L)
                .cryptoNetwork("SOLANA")
                .currency("USDC")
                .destinationAddress("7xKXtg2CW87d97TXJSDpbD5jBkheTqA83TZRuJosgAsU")
                .internalAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val roundtrippedEstimateCryptoWithdrawalFeeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(estimateCryptoWithdrawalFeeRequest),
                jacksonTypeRef<EstimateCryptoWithdrawalFeeRequest>(),
            )

        assertThat(roundtrippedEstimateCryptoWithdrawalFeeRequest)
            .isEqualTo(estimateCryptoWithdrawalFeeRequest)
    }
}
