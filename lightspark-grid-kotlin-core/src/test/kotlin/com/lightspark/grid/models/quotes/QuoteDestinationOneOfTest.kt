// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BrlBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.BrlExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.platform.externalaccounts.BrlAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class QuoteDestinationOneOfTest {

    @Test
    fun ofAccountDestination() {
        val accountDestination =
            QuoteDestinationOneOf.AccountDestination.builder()
                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .paymentRail("ACH")
                .build()

        val quoteDestinationOneOf = QuoteDestinationOneOf.ofAccountDestination(accountDestination)

        assertThat(quoteDestinationOneOf.accountDestination()).isEqualTo(accountDestination)
        assertThat(quoteDestinationOneOf.umaAddressDestination()).isNull()
        assertThat(quoteDestinationOneOf.externalAccountDetailsDestination()).isNull()
    }

    @Test
    fun ofAccountDestinationRoundtrip() {
        val jsonMapper = jsonMapper()
        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofAccountDestination(
                QuoteDestinationOneOf.AccountDestination.builder()
                    .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .paymentRail("ACH")
                    .build()
            )

        val roundtrippedQuoteDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quoteDestinationOneOf),
                jacksonTypeRef<QuoteDestinationOneOf>(),
            )

        assertThat(roundtrippedQuoteDestinationOneOf).isEqualTo(quoteDestinationOneOf)
    }

    @Test
    fun ofUmaAddressDestination() {
        val umaAddressDestination =
            QuoteDestinationOneOf.UmaAddressDestination.builder()
                .umaAddress("\$receiver@uma.domain.com")
                .currency("EUR")
                .build()

        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofUmaAddressDestination(umaAddressDestination)

        assertThat(quoteDestinationOneOf.accountDestination()).isNull()
        assertThat(quoteDestinationOneOf.umaAddressDestination()).isEqualTo(umaAddressDestination)
        assertThat(quoteDestinationOneOf.externalAccountDetailsDestination()).isNull()
    }

    @Test
    fun ofUmaAddressDestinationRoundtrip() {
        val jsonMapper = jsonMapper()
        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofUmaAddressDestination(
                QuoteDestinationOneOf.UmaAddressDestination.builder()
                    .umaAddress("\$receiver@uma.domain.com")
                    .currency("EUR")
                    .build()
            )

        val roundtrippedQuoteDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quoteDestinationOneOf),
                jacksonTypeRef<QuoteDestinationOneOf>(),
            )

        assertThat(roundtrippedQuoteDestinationOneOf).isEqualTo(quoteDestinationOneOf)
    }

    @Test
    fun ofExternalAccountDetailsDestination() {
        val externalAccountDetailsDestination =
            QuoteDestinationOneOf.ExternalAccountDetailsDestination.builder()
                .externalAccountDetails(
                    ExternalAccountCreate.builder()
                        .accountInfo(
                            BrlExternalAccountInfo.builder()
                                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                                .pixKey("x")
                                .pixKeyType(BrlAccountInfo.PixKeyType.CPF)
                                .taxId("26912511571360")
                                .beneficiary(
                                    BrlBeneficiary.builder()
                                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                                        .registrationNumber("registrationNumber")
                                        .build()
                                )
                                .build()
                        )
                        .currency("USD")
                        .cryptoNetwork("SOLANA_MAINNET")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .defaultUmaDepositAccount(true)
                        .platformAccountId("ext_acc_123456")
                        .build()
                )
                .build()

        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofExternalAccountDetailsDestination(
                externalAccountDetailsDestination
            )

        assertThat(quoteDestinationOneOf.accountDestination()).isNull()
        assertThat(quoteDestinationOneOf.umaAddressDestination()).isNull()
        assertThat(quoteDestinationOneOf.externalAccountDetailsDestination())
            .isEqualTo(externalAccountDetailsDestination)
    }

    @Test
    fun ofExternalAccountDetailsDestinationRoundtrip() {
        val jsonMapper = jsonMapper()
        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofExternalAccountDetailsDestination(
                QuoteDestinationOneOf.ExternalAccountDetailsDestination.builder()
                    .externalAccountDetails(
                        ExternalAccountCreate.builder()
                            .accountInfo(
                                BrlExternalAccountInfo.builder()
                                    .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                                    .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                                    .pixKey("x")
                                    .pixKeyType(BrlAccountInfo.PixKeyType.CPF)
                                    .taxId("26912511571360")
                                    .beneficiary(
                                        BrlBeneficiary.builder()
                                            .beneficiaryType(
                                                BrlBeneficiary.BeneficiaryType.INDIVIDUAL
                                            )
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
                                            .registrationNumber("registrationNumber")
                                            .build()
                                    )
                                    .build()
                            )
                            .currency("USD")
                            .cryptoNetwork("SOLANA_MAINNET")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .defaultUmaDepositAccount(true)
                            .platformAccountId("ext_acc_123456")
                            .build()
                    )
                    .build()
            )

        val roundtrippedQuoteDestinationOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quoteDestinationOneOf),
                jacksonTypeRef<QuoteDestinationOneOf>(),
            )

        assertThat(roundtrippedQuoteDestinationOneOf).isEqualTo(quoteDestinationOneOf)
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
        val quoteDestinationOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<QuoteDestinationOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { quoteDestinationOneOf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
