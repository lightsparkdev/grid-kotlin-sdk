// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class WalletBeneficiaryOneOfTest {

    @Test
    fun ofIndividual() {
        val individual =
            WalletIndividualBeneficiary.builder()
                .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("US")
                .fullName("John Michael Doe")
                .build()

        val walletBeneficiaryOneOf = WalletBeneficiaryOneOf.ofIndividual(individual)

        assertThat(walletBeneficiaryOneOf.individual()).isEqualTo(individual)
        assertThat(walletBeneficiaryOneOf.business()).isNull()
    }

    @Test
    fun ofIndividualRoundtrip() {
        val jsonMapper = jsonMapper()
        val walletBeneficiaryOneOf =
            WalletBeneficiaryOneOf.ofIndividual(
                WalletIndividualBeneficiary.builder()
                    .beneficiaryType(WalletIndividualBeneficiary.BeneficiaryType.INDIVIDUAL)
                    .countryOfResidence("US")
                    .fullName("John Michael Doe")
                    .build()
            )

        val roundtrippedWalletBeneficiaryOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletBeneficiaryOneOf),
                jacksonTypeRef<WalletBeneficiaryOneOf>(),
            )

        assertThat(roundtrippedWalletBeneficiaryOneOf).isEqualTo(walletBeneficiaryOneOf)
    }

    @Test
    fun ofBusiness() {
        val business =
            BusinessBeneficiary.builder()
                .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                .legalName("legalName")
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
                .countryOfResidence("countryOfResidence")
                .email("email")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .taxId("taxId")
                .build()

        val walletBeneficiaryOneOf = WalletBeneficiaryOneOf.ofBusiness(business)

        assertThat(walletBeneficiaryOneOf.individual()).isNull()
        assertThat(walletBeneficiaryOneOf.business()).isEqualTo(business)
    }

    @Test
    fun ofBusinessRoundtrip() {
        val jsonMapper = jsonMapper()
        val walletBeneficiaryOneOf =
            WalletBeneficiaryOneOf.ofBusiness(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName("legalName")
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
                    .countryOfResidence("countryOfResidence")
                    .email("email")
                    .phoneNumber("phoneNumber")
                    .registrationNumber("registrationNumber")
                    .taxId("taxId")
                    .build()
            )

        val roundtrippedWalletBeneficiaryOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletBeneficiaryOneOf),
                jacksonTypeRef<WalletBeneficiaryOneOf>(),
            )

        assertThat(roundtrippedWalletBeneficiaryOneOf).isEqualTo(walletBeneficiaryOneOf)
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
        val walletBeneficiaryOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<WalletBeneficiaryOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { walletBeneficiaryOneOf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
