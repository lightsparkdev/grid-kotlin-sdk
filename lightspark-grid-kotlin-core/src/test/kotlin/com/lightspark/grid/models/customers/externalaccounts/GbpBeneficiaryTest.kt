// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpBeneficiaryTest {

    @Test
    fun create() {
        val gbpBeneficiary =
            GbpBeneficiary.builder()
                .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(gbpBeneficiary.beneficiaryType())
            .isEqualTo(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(gbpBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(gbpBeneficiary.address())
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
        assertThat(gbpBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(gbpBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(gbpBeneficiary.email()).isEqualTo("email")
        assertThat(gbpBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(gbpBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpBeneficiary =
            GbpBeneficiary.builder()
                .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedGbpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpBeneficiary),
                jacksonTypeRef<GbpBeneficiary>(),
            )

        assertThat(roundtrippedGbpBeneficiary).isEqualTo(gbpBeneficiary)
    }
}
