// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.crypto

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CryptoEstimateWithdrawalFeeResponseTest {

    @Test
    fun create() {
        val cryptoEstimateWithdrawalFeeResponse =
            CryptoEstimateWithdrawalFeeResponse.builder()
                .applicationFee(0L)
                .netAmount(995000L)
                .networkFee(5000L)
                .networkFeeAsset("SOL")
                .totalFee(5000L)
                .build()

        assertThat(cryptoEstimateWithdrawalFeeResponse.applicationFee()).isEqualTo(0L)
        assertThat(cryptoEstimateWithdrawalFeeResponse.netAmount()).isEqualTo(995000L)
        assertThat(cryptoEstimateWithdrawalFeeResponse.networkFee()).isEqualTo(5000L)
        assertThat(cryptoEstimateWithdrawalFeeResponse.networkFeeAsset()).isEqualTo("SOL")
        assertThat(cryptoEstimateWithdrawalFeeResponse.totalFee()).isEqualTo(5000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cryptoEstimateWithdrawalFeeResponse =
            CryptoEstimateWithdrawalFeeResponse.builder()
                .applicationFee(0L)
                .netAmount(995000L)
                .networkFee(5000L)
                .networkFeeAsset("SOL")
                .totalFee(5000L)
                .build()

        val roundtrippedCryptoEstimateWithdrawalFeeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cryptoEstimateWithdrawalFeeResponse),
                jacksonTypeRef<CryptoEstimateWithdrawalFeeResponse>(),
            )

        assertThat(roundtrippedCryptoEstimateWithdrawalFeeResponse)
            .isEqualTo(cryptoEstimateWithdrawalFeeResponse)
    }
}
