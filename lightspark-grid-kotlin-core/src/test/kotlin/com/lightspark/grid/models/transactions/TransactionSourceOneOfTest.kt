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
    fun ofAccountSource() {
        val accountSource =
            TransactionSourceOneOf.AccountSource.builder()
                .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                .currency("USD")
                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .onChainTransaction(
                    TransactionSourceOneOf.AccountSource.OnChainTransaction.builder()
                        .network(
                            TransactionSourceOneOf.AccountSource.OnChainTransaction.Network.SOLANA
                        )
                        .transactionHash(
                            "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                        )
                        .build()
                )
                .build()

        val transactionSourceOneOf = TransactionSourceOneOf.ofAccountSource(accountSource)

        assertThat(transactionSourceOneOf.accountSource()).isEqualTo(accountSource)
        assertThat(transactionSourceOneOf.umaAddressSource()).isNull()
        assertThat(transactionSourceOneOf.externalFundingSource()).isNull()
    }

    @Test
    fun ofAccountSourceRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf =
            TransactionSourceOneOf.ofAccountSource(
                TransactionSourceOneOf.AccountSource.builder()
                    .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                    .currency("USD")
                    .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .onChainTransaction(
                        TransactionSourceOneOf.AccountSource.OnChainTransaction.builder()
                            .network(
                                TransactionSourceOneOf.AccountSource.OnChainTransaction.Network
                                    .SOLANA
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
    fun ofUmaAddressSource() {
        val umaAddressSource =
            TransactionSourceOneOf.UmaAddressSource.builder()
                .sourceType(BaseTransactionSource.SourceType.UMA_ADDRESS)
                .currency("USD")
                .umaAddress("\$sender@uma.domain.com")
                .build()

        val transactionSourceOneOf = TransactionSourceOneOf.ofUmaAddressSource(umaAddressSource)

        assertThat(transactionSourceOneOf.accountSource()).isNull()
        assertThat(transactionSourceOneOf.umaAddressSource()).isEqualTo(umaAddressSource)
        assertThat(transactionSourceOneOf.externalFundingSource()).isNull()
    }

    @Test
    fun ofUmaAddressSourceRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf =
            TransactionSourceOneOf.ofUmaAddressSource(
                TransactionSourceOneOf.UmaAddressSource.builder()
                    .sourceType(BaseTransactionSource.SourceType.UMA_ADDRESS)
                    .currency("USD")
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
    fun ofExternalFundingSource() {
        val externalFundingSource =
            TransactionSourceOneOf.ExternalFundingSource.builder()
                .sourceType(BaseTransactionSource.SourceType.REALTIME_FUNDING)
                .currency("USD")
                .accountHolderName("John Sender")
                .accountIdentifier("****6789")
                .bankIdentifier("021000021")
                .bankName("Chase Bank")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000009")
                .endToEndId("E2E-9f2c6b6f")
                .onChainTransaction(
                    TransactionSourceOneOf.ExternalFundingSource.OnChainTransaction.builder()
                        .network(
                            TransactionSourceOneOf.ExternalFundingSource.OnChainTransaction.Network
                                .SOLANA
                        )
                        .transactionHash(
                            "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                        )
                        .build()
                )
                .paymentRail(TransactionSourceOneOf.ExternalFundingSource.PaymentRail.ACH)
                .remittanceInformation("12345")
                .traceNumber("021000020123456")
                .build()

        val transactionSourceOneOf =
            TransactionSourceOneOf.ofExternalFundingSource(externalFundingSource)

        assertThat(transactionSourceOneOf.accountSource()).isNull()
        assertThat(transactionSourceOneOf.umaAddressSource()).isNull()
        assertThat(transactionSourceOneOf.externalFundingSource()).isEqualTo(externalFundingSource)
    }

    @Test
    fun ofExternalFundingSourceRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionSourceOneOf =
            TransactionSourceOneOf.ofExternalFundingSource(
                TransactionSourceOneOf.ExternalFundingSource.builder()
                    .sourceType(BaseTransactionSource.SourceType.REALTIME_FUNDING)
                    .currency("USD")
                    .accountHolderName("John Sender")
                    .accountIdentifier("****6789")
                    .bankIdentifier("021000021")
                    .bankName("Chase Bank")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000009")
                    .endToEndId("E2E-9f2c6b6f")
                    .onChainTransaction(
                        TransactionSourceOneOf.ExternalFundingSource.OnChainTransaction.builder()
                            .network(
                                TransactionSourceOneOf.ExternalFundingSource.OnChainTransaction
                                    .Network
                                    .SOLANA
                            )
                            .transactionHash(
                                "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                            )
                            .build()
                    )
                    .paymentRail(TransactionSourceOneOf.ExternalFundingSource.PaymentRail.ACH)
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
