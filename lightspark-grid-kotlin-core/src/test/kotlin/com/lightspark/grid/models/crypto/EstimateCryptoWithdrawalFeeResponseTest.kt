// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.crypto

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EstimateCryptoWithdrawalFeeResponseTest {

    @Test
    fun create() {
        val estimateCryptoWithdrawalFeeResponse =
            EstimateCryptoWithdrawalFeeResponse.builder()
                .applicationFee(0L)
                .netAmount(995000L)
                .networkFee(5000L)
                .networkFeeAsset("SOL")
                .totalFee(5000L)
                .build()

        assertThat(estimateCryptoWithdrawalFeeResponse.applicationFee()).isEqualTo(0L)
        assertThat(estimateCryptoWithdrawalFeeResponse.netAmount()).isEqualTo(995000L)
        assertThat(estimateCryptoWithdrawalFeeResponse.networkFee()).isEqualTo(5000L)
        assertThat(estimateCryptoWithdrawalFeeResponse.networkFeeAsset()).isEqualTo("SOL")
        assertThat(estimateCryptoWithdrawalFeeResponse.totalFee()).isEqualTo(5000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val estimateCryptoWithdrawalFeeResponse =
            EstimateCryptoWithdrawalFeeResponse.builder()
                .applicationFee(0L)
                .netAmount(995000L)
                .networkFee(5000L)
                .networkFeeAsset("SOL")
                .totalFee(5000L)
                .build()

        val roundtrippedEstimateCryptoWithdrawalFeeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(estimateCryptoWithdrawalFeeResponse),
                jacksonTypeRef<EstimateCryptoWithdrawalFeeResponse>(),
            )

        assertThat(roundtrippedEstimateCryptoWithdrawalFeeResponse)
            .isEqualTo(estimateCryptoWithdrawalFeeResponse)
    }
}
