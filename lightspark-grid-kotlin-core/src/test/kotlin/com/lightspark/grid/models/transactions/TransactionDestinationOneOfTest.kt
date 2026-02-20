// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.BeneficiaryOneOf
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.UsAccountInfo
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TransactionDestinationOneOfTest {

    @Test
    fun ofAccountTransactionDestination() {
        val accountTransactionDestination =
            TransactionDestinationOneOf.AccountTransactionDestination.builder()
                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val transactionDestinationOneOf =
            TransactionDestinationOneOf.ofAccountTransactionDestination(
                accountTransactionDestination
            )

        assertThat(transactionDestinationOneOf.accountTransactionDestination())
            .isEqualTo(accountTransactionDestination)
        assertThat(transactionDestinationOneOf.umaAddressTransactionDestination()).isNull()
        assertThat(transactionDestinationOneOf.externalAccountDetails()).isNull()
    }

    @Test
    fun ofAccountTransactionDestinationRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionDestinationOneOf =
            TransactionDestinationOneOf.ofAccountTransactionDestination(
                TransactionDestinationOneOf.AccountTransactionDestination.builder()
                    .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .build()
            )

        val roundtrippedTransactionDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionDestinationOneOf),
                jacksonTypeRef<TransactionDestinationOneOf>(),
            )

        assertThat(roundtrippedTransactionDestinationOneOf).isEqualTo(transactionDestinationOneOf)
    }

    @Test
    fun ofUmaAddressTransactionDestination() {
        val umaAddressTransactionDestination =
            TransactionDestinationOneOf.UmaAddressTransactionDestination.builder()
                .umaAddress("\$receiver@uma.domain.com")
                .build()

        val transactionDestinationOneOf =
            TransactionDestinationOneOf.ofUmaAddressTransactionDestination(
                umaAddressTransactionDestination
            )

        assertThat(transactionDestinationOneOf.accountTransactionDestination()).isNull()
        assertThat(transactionDestinationOneOf.umaAddressTransactionDestination())
            .isEqualTo(umaAddressTransactionDestination)
        assertThat(transactionDestinationOneOf.externalAccountDetails()).isNull()
    }

    @Test
    fun ofUmaAddressTransactionDestinationRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionDestinationOneOf =
            TransactionDestinationOneOf.ofUmaAddressTransactionDestination(
                TransactionDestinationOneOf.UmaAddressTransactionDestination.builder()
                    .umaAddress("\$receiver@uma.domain.com")
                    .build()
            )

        val roundtrippedTransactionDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionDestinationOneOf),
                jacksonTypeRef<TransactionDestinationOneOf>(),
            )

        assertThat(roundtrippedTransactionDestinationOneOf).isEqualTo(transactionDestinationOneOf)
    }

    @Test
    fun ofExternalAccountDetails() {
        val externalAccountDetails =
            TransactionDestinationOneOf.ExternalAccountDetails.builder()
                .currency("EUR")
                .destinationType(
                    TransactionDestinationOneOf.ExternalAccountDetails.DestinationType
                        .EXTERNAL_ACCOUNT_DETAILS
                )
                .externalAccountDetails(
                    ExternalAccountCreate.builder()
                        .accountInfo(
                            UsAccountInfo.builder()
                                .accountCategory(UsAccountInfo.AccountCategory.CHECKING)
                                .accountNumber("123456789")
                                .accountType(UsAccountInfo.AccountType.US_ACCOUNT)
                                .beneficiary(
                                    BeneficiaryOneOf.Individual.builder()
                                        .birthDate(LocalDate.parse("1990-01-15"))
                                        .fullName("John Michael Doe")
                                        .nationality("US")
                                        .address(
                                            BeneficiaryOneOf.Individual.Address.builder()
                                                .country("US")
                                                .line1("123 Main Street")
                                                .postalCode("94105")
                                                .city("San Francisco")
                                                .line2("Apt 4B")
                                                .state("CA")
                                                .build()
                                        )
                                        .build()
                                )
                                .routingNumber("987654321")
                                .bankName("Chase Bank")
                                .build()
                        )
                        .currency("USD")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .defaultUmaDepositAccount(true)
                        .platformAccountId("ext_acc_123456")
                        .build()
                )
                .build()

        val transactionDestinationOneOf =
            TransactionDestinationOneOf.ofExternalAccountDetails(externalAccountDetails)

        assertThat(transactionDestinationOneOf.accountTransactionDestination()).isNull()
        assertThat(transactionDestinationOneOf.umaAddressTransactionDestination()).isNull()
        assertThat(transactionDestinationOneOf.externalAccountDetails())
            .isEqualTo(externalAccountDetails)
    }

    @Test
    fun ofExternalAccountDetailsRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionDestinationOneOf =
            TransactionDestinationOneOf.ofExternalAccountDetails(
                TransactionDestinationOneOf.ExternalAccountDetails.builder()
                    .currency("EUR")
                    .destinationType(
                        TransactionDestinationOneOf.ExternalAccountDetails.DestinationType
                            .EXTERNAL_ACCOUNT_DETAILS
                    )
                    .externalAccountDetails(
                        ExternalAccountCreate.builder()
                            .accountInfo(
                                UsAccountInfo.builder()
                                    .accountCategory(UsAccountInfo.AccountCategory.CHECKING)
                                    .accountNumber("123456789")
                                    .accountType(UsAccountInfo.AccountType.US_ACCOUNT)
                                    .beneficiary(
                                        BeneficiaryOneOf.Individual.builder()
                                            .birthDate(LocalDate.parse("1990-01-15"))
                                            .fullName("John Michael Doe")
                                            .nationality("US")
                                            .address(
                                                BeneficiaryOneOf.Individual.Address.builder()
                                                    .country("US")
                                                    .line1("123 Main Street")
                                                    .postalCode("94105")
                                                    .city("San Francisco")
                                                    .line2("Apt 4B")
                                                    .state("CA")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .routingNumber("987654321")
                                    .bankName("Chase Bank")
                                    .build()
                            )
                            .currency("USD")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .defaultUmaDepositAccount(true)
                            .platformAccountId("ext_acc_123456")
                            .build()
                    )
                    .build()
            )

        val roundtrippedTransactionDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionDestinationOneOf),
                jacksonTypeRef<TransactionDestinationOneOf>(),
            )

        assertThat(roundtrippedTransactionDestinationOneOf).isEqualTo(transactionDestinationOneOf)
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
        val transactionDestinationOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TransactionDestinationOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                transactionDestinationOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
