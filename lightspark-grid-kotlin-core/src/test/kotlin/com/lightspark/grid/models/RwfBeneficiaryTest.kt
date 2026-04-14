// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RwfBeneficiaryTest {

    @Test
    fun create() {
        val rwfBeneficiary =
            RwfBeneficiary.builder()
                .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(rwfBeneficiary.beneficiaryType())
            .isEqualTo(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(rwfBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(rwfBeneficiary.address())
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
        assertThat(rwfBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(rwfBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(rwfBeneficiary.email()).isEqualTo("email")
        assertThat(rwfBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(rwfBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rwfBeneficiary =
            RwfBeneficiary.builder()
                .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedRwfBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rwfBeneficiary),
                jacksonTypeRef<RwfBeneficiary>(),
            )

        assertThat(roundtrippedRwfBeneficiary).isEqualTo(rwfBeneficiary)
    }
}
