// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GhsBeneficiaryTest {

    @Test
    fun create() {
        val ghsBeneficiary =
            GhsBeneficiary.builder()
                .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(ghsBeneficiary.beneficiaryType())
            .isEqualTo(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(ghsBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(ghsBeneficiary.address())
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
        assertThat(ghsBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(ghsBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(ghsBeneficiary.email()).isEqualTo("email")
        assertThat(ghsBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(ghsBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ghsBeneficiary =
            GhsBeneficiary.builder()
                .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedGhsBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ghsBeneficiary),
                jacksonTypeRef<GhsBeneficiary>(),
            )

        assertThat(roundtrippedGhsBeneficiary).isEqualTo(ghsBeneficiary)
    }
}
