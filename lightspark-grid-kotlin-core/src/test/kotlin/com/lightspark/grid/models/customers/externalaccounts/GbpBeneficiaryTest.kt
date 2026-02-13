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
                    GbpBeneficiary.Address.builder()
                        .country("country")
                        .line1("line1")
                        .postalCode("postalCode")
                        .city("city")
                        .line2("line2")
                        .state("state")
                        .build()
                )
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        assertThat(gbpBeneficiary.beneficiaryType())
            .isEqualTo(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(gbpBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(gbpBeneficiary.address())
            .isEqualTo(
                GbpBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(gbpBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(gbpBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(gbpBeneficiary.email()).isEqualTo("email")
        assertThat(gbpBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(gbpBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(gbpBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpBeneficiary =
            GbpBeneficiary.builder()
                .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    GbpBeneficiary.Address.builder()
                        .country("country")
                        .line1("line1")
                        .postalCode("postalCode")
                        .city("city")
                        .line2("line2")
                        .state("state")
                        .build()
                )
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        val roundtrippedGbpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpBeneficiary),
                jacksonTypeRef<GbpBeneficiary>(),
            )

        assertThat(roundtrippedGbpBeneficiary).isEqualTo(gbpBeneficiary)
    }
}
