// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BwpBeneficiaryTest {

    @Test
    fun create() {
        val bwpBeneficiary =
            BwpBeneficiary.builder()
                .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(bwpBeneficiary.beneficiaryType())
            .isEqualTo(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(bwpBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(bwpBeneficiary.address())
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
        assertThat(bwpBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(bwpBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(bwpBeneficiary.email()).isEqualTo("email")
        assertThat(bwpBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(bwpBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bwpBeneficiary =
            BwpBeneficiary.builder()
                .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBwpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bwpBeneficiary),
                jacksonTypeRef<BwpBeneficiary>(),
            )

        assertThat(roundtrippedBwpBeneficiary).isEqualTo(bwpBeneficiary)
    }
}
