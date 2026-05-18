// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlvBeneficiaryTest {

    @Test
    fun create() {
        val slvBeneficiary =
            SlvBeneficiary.builder()
                .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(slvBeneficiary.beneficiaryType())
            .isEqualTo(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(slvBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(slvBeneficiary.address())
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
        assertThat(slvBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(slvBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(slvBeneficiary.email()).isEqualTo("email")
        assertThat(slvBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(slvBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slvBeneficiary =
            SlvBeneficiary.builder()
                .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedSlvBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slvBeneficiary),
                jacksonTypeRef<SlvBeneficiary>(),
            )

        assertThat(roundtrippedSlvBeneficiary).isEqualTo(slvBeneficiary)
    }
}
