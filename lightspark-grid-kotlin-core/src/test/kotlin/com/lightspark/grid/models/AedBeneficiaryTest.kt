// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AedBeneficiaryTest {

    @Test
    fun create() {
        val aedBeneficiary =
            AedBeneficiary.builder()
                .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(aedBeneficiary.beneficiaryType())
            .isEqualTo(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(aedBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(aedBeneficiary.address())
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
        assertThat(aedBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(aedBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(aedBeneficiary.email()).isEqualTo("email")
        assertThat(aedBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(aedBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aedBeneficiary =
            AedBeneficiary.builder()
                .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedAedBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aedBeneficiary),
                jacksonTypeRef<AedBeneficiary>(),
            )

        assertThat(roundtrippedAedBeneficiary).isEqualTo(aedBeneficiary)
    }
}
