// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GtqBeneficiaryTest {

    @Test
    fun create() {
        val gtqBeneficiary =
            GtqBeneficiary.builder()
                .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("countryOfResidence")
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
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .build()

        assertThat(gtqBeneficiary.beneficiaryType())
            .isEqualTo(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(gtqBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(gtqBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(gtqBeneficiary.address())
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
        assertThat(gtqBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(gtqBeneficiary.email()).isEqualTo("email")
        assertThat(gtqBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(gtqBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gtqBeneficiary =
            GtqBeneficiary.builder()
                .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("countryOfResidence")
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
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .build()

        val roundtrippedGtqBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtqBeneficiary),
                jacksonTypeRef<GtqBeneficiary>(),
            )

        assertThat(roundtrippedGtqBeneficiary).isEqualTo(gtqBeneficiary)
    }
}
