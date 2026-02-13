// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlBeneficiaryTest {

    @Test
    fun create() {
        val brlBeneficiary =
            BrlBeneficiary.builder()
                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    BrlBeneficiary.Address.builder()
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

        assertThat(brlBeneficiary.beneficiaryType())
            .isEqualTo(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(brlBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(brlBeneficiary.address())
            .isEqualTo(
                BrlBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(brlBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(brlBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(brlBeneficiary.email()).isEqualTo("email")
        assertThat(brlBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(brlBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(brlBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlBeneficiary =
            BrlBeneficiary.builder()
                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    BrlBeneficiary.Address.builder()
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

        val roundtrippedBrlBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlBeneficiary),
                jacksonTypeRef<BrlBeneficiary>(),
            )

        assertThat(roundtrippedBrlBeneficiary).isEqualTo(brlBeneficiary)
    }
}
