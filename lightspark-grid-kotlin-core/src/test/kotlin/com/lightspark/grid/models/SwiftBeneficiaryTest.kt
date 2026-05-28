// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwiftBeneficiaryTest {

    @Test
    fun create() {
        val swiftBeneficiary =
            SwiftBeneficiary.builder()
                .beneficiaryType(SwiftBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(swiftBeneficiary.beneficiaryType())
            .isEqualTo(SwiftBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(swiftBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(swiftBeneficiary.address())
            .isEqualTo(
                Address.builder()
                    .country("US")
                    .line1("123 Main Street")
                    .postalCode("94105")
                    .city("San Francisco")
                    .line2("Apt 4B")
                    .state("CA")
                    .build()
            )
        assertThat(swiftBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(swiftBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(swiftBeneficiary.email()).isEqualTo("email")
        assertThat(swiftBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(swiftBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swiftBeneficiary =
            SwiftBeneficiary.builder()
                .beneficiaryType(SwiftBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedSwiftBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swiftBeneficiary),
                jacksonTypeRef<SwiftBeneficiary>(),
            )

        assertThat(roundtrippedSwiftBeneficiary).isEqualTo(swiftBeneficiary)
    }
}
