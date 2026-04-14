// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZmwBeneficiaryTest {

    @Test
    fun create() {
        val zmwBeneficiary =
            ZmwBeneficiary.builder()
                .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(zmwBeneficiary.beneficiaryType())
            .isEqualTo(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(zmwBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(zmwBeneficiary.address())
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
        assertThat(zmwBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(zmwBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(zmwBeneficiary.email()).isEqualTo("email")
        assertThat(zmwBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(zmwBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zmwBeneficiary =
            ZmwBeneficiary.builder()
                .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedZmwBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zmwBeneficiary),
                jacksonTypeRef<ZmwBeneficiary>(),
            )

        assertThat(roundtrippedZmwBeneficiary).isEqualTo(zmwBeneficiary)
    }
}
