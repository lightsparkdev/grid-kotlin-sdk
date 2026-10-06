// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TransactionSourceOneOfTest {

    @Test
    fun ofAccount() {
        val account =
            TransactionSourceOneOf.Account.builder()
                .currency("USD")
                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                .onChainTransaction(
                    TransactionSourceOneOf.Account.OnChainTransaction.builder()
                        .network(TransactionSourceOneOf.Account.OnChainTransaction.Network.SOLANA)
                        .transactionHash(
                            "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                        )
                        .build()
                )
                .build()

        val transactionSourceOneOf = TransactionSourceOneOf.ofAccount(account)

        assertThat(transactionSourceOneOf.account()).isEqualTo(account)
        assertThat(transactionSourceOneOf.umaAddress()).isNull()
        assertThat(transactionSourceOneOf.realtimeFunding()).isNull()
    }

    @Test
    fun ofAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf =
            TransactionSourceOneOf.ofAccount(
                TransactionSourceOneOf.Account.builder()
                    .currency("USD")
                    .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                    .onChainTransaction(
                        TransactionSourceOneOf.Account.OnChainTransaction.builder()
                            .network(
                                TransactionSourceOneOf.Account.OnChainTransaction.Network.SOLANA
                            )
                            .transactionHash(
                                "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedTransactionSourceOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSourceOneOf),
                jacksonTypeRef<TransactionSourceOneOf>(),
            )

        assertThat(roundtrippedTransactionSourceOneOf).isEqualTo(transactionSourceOneOf)
    }

    @Test
    fun ofUmaAddress() {
        val umaAddress =
            TransactionSourceOneOf.UmaAddress.builder()
                .currency("USD")
                .sourceType(TransactionSourceOneOf.UmaAddress.SourceType.UMA_ADDRESS)
                .umaAddress("\$sender@uma.domain.com")
                .build()

        val transactionSourceOneOf = TransactionSourceOneOf.ofUmaAddress(umaAddress)

        assertThat(transactionSourceOneOf.account()).isNull()
        assertThat(transactionSourceOneOf.umaAddress()).isEqualTo(umaAddress)
        assertThat(transactionSourceOneOf.realtimeFunding()).isNull()
    }

    @Test
    fun ofUmaAddressRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf =
            TransactionSourceOneOf.ofUmaAddress(
                TransactionSourceOneOf.UmaAddress.builder()
                    .currency("USD")
                    .sourceType(TransactionSourceOneOf.UmaAddress.SourceType.UMA_ADDRESS)
                    .umaAddress("\$sender@uma.domain.com")
                    .build()
            )

        val roundtrippedTransactionSourceOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSourceOneOf),
                jacksonTypeRef<TransactionSourceOneOf>(),
            )

        assertThat(roundtrippedTransactionSourceOneOf).isEqualTo(transactionSourceOneOf)
    }

    @Test
    fun ofRealtimeFunding() {
        val realtimeFunding =
            TransactionSourceOneOf.RealtimeFunding.builder()
                .currency("USD")
                .sourceType(TransactionSourceOneOf.RealtimeFunding.SourceType.REALTIME_FUNDING)
                .accountHolderName("John Sender")
                .accountIdentifier("****6789")
                .bankIdentifier("021000021")
                .bankName("Chase Bank")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000009")
                .endToEndId("E2E-9f2c6b6f")
                .onChainTransaction(
                    TransactionSourceOneOf.RealtimeFunding.OnChainTransaction.builder()
                        .network(
                            TransactionSourceOneOf.RealtimeFunding.OnChainTransaction.Network.SOLANA
                        )
                        .transactionHash(
                            "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                        )
                        .build()
                )
                .paymentRail(TransactionSourceOneOf.RealtimeFunding.PaymentRail.ACH)
                .remittanceInformation("12345")
                .traceNumber("021000020123456")
                .build()

        val transactionSourceOneOf = TransactionSourceOneOf.ofRealtimeFunding(realtimeFunding)

        assertThat(transactionSourceOneOf.account()).isNull()
        assertThat(transactionSourceOneOf.umaAddress()).isNull()
        assertThat(transactionSourceOneOf.realtimeFunding()).isEqualTo(realtimeFunding)
    }

    @Test
    fun ofRealtimeFundingRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf =
            TransactionSourceOneOf.ofRealtimeFunding(
                TransactionSourceOneOf.RealtimeFunding.builder()
                    .currency("USD")
                    .sourceType(TransactionSourceOneOf.RealtimeFunding.SourceType.REALTIME_FUNDING)
                    .accountHolderName("John Sender")
                    .accountIdentifier("****6789")
                    .bankIdentifier("021000021")
                    .bankName("Chase Bank")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000009")
                    .endToEndId("E2E-9f2c6b6f")
                    .onChainTransaction(
                        TransactionSourceOneOf.RealtimeFunding.OnChainTransaction.builder()
                            .network(
                                TransactionSourceOneOf.RealtimeFunding.OnChainTransaction.Network
                                    .SOLANA
                            )
                            .transactionHash(
                                "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                            )
                            .build()
                    )
                    .paymentRail(TransactionSourceOneOf.RealtimeFunding.PaymentRail.ACH)
                    .remittanceInformation("12345")
                    .traceNumber("021000020123456")
                    .build()
            )

        val roundtrippedTransactionSourceOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionSourceOneOf),
                jacksonTypeRef<TransactionSourceOneOf>(),
            )

        assertThat(roundtrippedTransactionSourceOneOf).isEqualTo(transactionSourceOneOf)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val transactionSourceOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TransactionSourceOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { transactionSourceOneOf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
