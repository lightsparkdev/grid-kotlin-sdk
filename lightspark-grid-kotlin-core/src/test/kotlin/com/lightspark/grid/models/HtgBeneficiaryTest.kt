// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HtgBeneficiaryTest {

    @Test
    fun create() {
        val htgBeneficiary =
            HtgBeneficiary.builder()
                .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(htgBeneficiary.beneficiaryType())
            .isEqualTo(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(htgBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(htgBeneficiary.address())
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
        assertThat(htgBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(htgBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(htgBeneficiary.email()).isEqualTo("email")
        assertThat(htgBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(htgBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val htgBeneficiary =
            HtgBeneficiary.builder()
                .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedHtgBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(htgBeneficiary),
                jacksonTypeRef<HtgBeneficiary>(),
            )

        assertThat(roundtrippedHtgBeneficiary).isEqualTo(htgBeneficiary)
    }
}
