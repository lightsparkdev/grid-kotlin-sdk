// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class QuoteDestinationOneOfTest {

    @Test
    fun ofAccount() {
        val account =
            QuoteDestinationOneOf.Account.builder()
                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                .build()

        val quoteDestinationOneOf = QuoteDestinationOneOf.ofAccount(account)

        assertThat(quoteDestinationOneOf.account()).isEqualTo(account)
        assertThat(quoteDestinationOneOf.umaAddress()).isNull()
    }

    @Test
    fun ofAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofAccount(
                QuoteDestinationOneOf.Account.builder()
                    .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
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
    fun ofUmaAddress() {
        val umaAddress =
            QuoteDestinationOneOf.UmaAddress.builder()
                .currency("EUR")
                .umaAddress("\$receiver@uma.domain.com")
                .build()

        val quoteDestinationOneOf = QuoteDestinationOneOf.ofUmaAddress(umaAddress)

        assertThat(quoteDestinationOneOf.account()).isNull()
        assertThat(quoteDestinationOneOf.umaAddress()).isEqualTo(umaAddress)
    }

    @Test
    fun ofUmaAddressRoundtrip() {
        val jsonMapper = jsonMapper()
        val quoteDestinationOneOf =
            QuoteDestinationOneOf.ofUmaAddress(
                QuoteDestinationOneOf.UmaAddress.builder()
                    .currency("EUR")
                    .umaAddress("\$receiver@uma.domain.com")
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
