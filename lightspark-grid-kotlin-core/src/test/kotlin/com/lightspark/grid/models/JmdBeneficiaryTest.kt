// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JmdBeneficiaryTest {

    @Test
    fun create() {
        val jmdBeneficiary =
            JmdBeneficiary.builder()
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
                .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("countryOfResidence")
                .fullName("fullName")
                .phoneNumber("phoneNumber")
                .birthDate("birthDate")
                .email("email")
                .nationality("nationality")
                .build()

        assertThat(jmdBeneficiary.address())
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
        assertThat(jmdBeneficiary.beneficiaryType())
            .isEqualTo(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(jmdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(jmdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(jmdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(jmdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(jmdBeneficiary.email()).isEqualTo("email")
        assertThat(jmdBeneficiary.nationality()).isEqualTo("nationality")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jmdBeneficiary =
            JmdBeneficiary.builder()
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
                .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("countryOfResidence")
                .fullName("fullName")
                .phoneNumber("phoneNumber")
                .birthDate("birthDate")
                .email("email")
                .nationality("nationality")
                .build()

        val roundtrippedJmdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jmdBeneficiary),
                jacksonTypeRef<JmdBeneficiary>(),
            )

        assertThat(roundtrippedJmdBeneficiary).isEqualTo(jmdBeneficiary)
    }
}
