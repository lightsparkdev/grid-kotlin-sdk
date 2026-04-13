// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateTest {

    @Test
    fun create() {
        val externalAccountCreate =
            ExternalAccountCreate.builder()
                .accountInfo(
                    ExternalAccountCreate.AccountInfo.AedAccount.builder()
                        .beneficiary(
                            ExternalAccountCreate.AccountInfo.AedAccount.Beneficiary.Individual
                                .builder()
                                .fullName("fullName")
                                .address(
                                    Address.builder()
                                        .country("US")
                                        .line1("123 Main Street")
                                        .postalCode("94105")
                                        .city("San Francisco")
                                        .line2("Apt 4B")
                                        .state("CA")
                                        .build()
                                )
                                .birthDate("birthDate")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("nationality")
                                .phoneNumber("phoneNumber")
                                .build()
                        )
                        .iban("AE070331234567890123456")
                        .swiftCode("EBILAEAD")
                        .build()
                )
                .currency("USD")
                .cryptoNetwork("SOLANA_MAINNET")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .defaultUmaDepositAccount(true)
                .platformAccountId("ext_acc_123456")
                .build()

        assertThat(externalAccountCreate.accountInfo())
            .isEqualTo(
                ExternalAccountCreate.AccountInfo.ofAedAccount(
                    ExternalAccountCreate.AccountInfo.AedAccount.builder()
                        .beneficiary(
                            ExternalAccountCreate.AccountInfo.AedAccount.Beneficiary.Individual
                                .builder()
                                .fullName("fullName")
                                .address(
                                    Address.builder()
                                        .country("US")
                                        .line1("123 Main Street")
                                        .postalCode("94105")
                                        .city("San Francisco")
                                        .line2("Apt 4B")
                                        .state("CA")
                                        .build()
                                )
                                .birthDate("birthDate")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("nationality")
                                .phoneNumber("phoneNumber")
                                .build()
                        )
                        .iban("AE070331234567890123456")
                        .swiftCode("EBILAEAD")
                        .build()
                )
            )
        assertThat(externalAccountCreate.currency()).isEqualTo("USD")
        assertThat(externalAccountCreate.cryptoNetwork()).isEqualTo("SOLANA_MAINNET")
        assertThat(externalAccountCreate.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(externalAccountCreate.defaultUmaDepositAccount()).isEqualTo(true)
        assertThat(externalAccountCreate.platformAccountId()).isEqualTo("ext_acc_123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreate =
            ExternalAccountCreate.builder()
                .accountInfo(
                    ExternalAccountCreate.AccountInfo.AedAccount.builder()
                        .beneficiary(
                            ExternalAccountCreate.AccountInfo.AedAccount.Beneficiary.Individual
                                .builder()
                                .fullName("fullName")
                                .address(
                                    Address.builder()
                                        .country("US")
                                        .line1("123 Main Street")
                                        .postalCode("94105")
                                        .city("San Francisco")
                                        .line2("Apt 4B")
                                        .state("CA")
                                        .build()
                                )
                                .birthDate("birthDate")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("nationality")
                                .phoneNumber("phoneNumber")
                                .build()
                        )
                        .iban("AE070331234567890123456")
                        .swiftCode("EBILAEAD")
                        .build()
                )
                .currency("USD")
                .cryptoNetwork("SOLANA_MAINNET")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .defaultUmaDepositAccount(true)
                .platformAccountId("ext_acc_123456")
                .build()

        val roundtrippedExternalAccountCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreate),
                jacksonTypeRef<ExternalAccountCreate>(),
            )

        assertThat(roundtrippedExternalAccountCreate).isEqualTo(externalAccountCreate)
    }
}
