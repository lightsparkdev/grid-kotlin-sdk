// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NgnBeneficiaryTest {

    @Test
    fun create() {
        val ngnBeneficiary =
            NgnBeneficiary.builder()
                .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(ngnBeneficiary.beneficiaryType())
            .isEqualTo(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(ngnBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(ngnBeneficiary.address())
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
        assertThat(ngnBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(ngnBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(ngnBeneficiary.email()).isEqualTo("email")
        assertThat(ngnBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(ngnBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ngnBeneficiary =
            NgnBeneficiary.builder()
                .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedNgnBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ngnBeneficiary),
                jacksonTypeRef<NgnBeneficiary>(),
            )

        assertThat(roundtrippedNgnBeneficiary).isEqualTo(ngnBeneficiary)
    }
}
