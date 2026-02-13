// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.BrlBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.BrlExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
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
                .counterpartyInformation(
                    QuoteDestinationOneOf.UmaAddressDestination.CounterpartyInformation.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
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
                    .counterpartyInformation(
                        QuoteDestinationOneOf.UmaAddressDestination.CounterpartyInformation
                            .builder()
                            .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                            .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                            .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                            .build()
                    )
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
                                .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                                .beneficiary(
                                    BrlBeneficiary.builder()
                                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
                                        .address(
                                            BrlBeneficiary.Address.builder()
                                                .country("country")
                                                .line1("line1")
                                                .postalCode("postalCode")
                                                .city("city")
                                                .line2("line2")
                                                .state("state")
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
                                .pixKey("pixKey")
                                .pixKeyType("pixKeyType")
                                .taxId("taxId")
                                .build()
                        )
                        .currency("USD")
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
                                    .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                                    .beneficiary(
                                        BrlBeneficiary.builder()
                                            .beneficiaryType(
                                                BrlBeneficiary.BeneficiaryType.INDIVIDUAL
                                            )
                                            .fullName("fullName")
                                            .address(
                                                BrlBeneficiary.Address.builder()
                                                    .country("country")
                                                    .line1("line1")
                                                    .postalCode("postalCode")
                                                    .city("city")
                                                    .line2("line2")
                                                    .state("state")
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
                                    .pixKey("pixKey")
                                    .pixKeyType("pixKeyType")
                                    .taxId("taxId")
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
