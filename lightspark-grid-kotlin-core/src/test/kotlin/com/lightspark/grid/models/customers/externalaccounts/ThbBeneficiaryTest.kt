// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThbBeneficiaryTest {

    @Test
    fun create() {
        val thbBeneficiary =
            ThbBeneficiary.builder()
                .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    ThbBeneficiary.Address.builder()
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

        assertThat(thbBeneficiary.beneficiaryType())
            .isEqualTo(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(thbBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(thbBeneficiary.address())
            .isEqualTo(
                ThbBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(thbBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(thbBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(thbBeneficiary.email()).isEqualTo("email")
        assertThat(thbBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(thbBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(thbBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thbBeneficiary =
            ThbBeneficiary.builder()
                .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    ThbBeneficiary.Address.builder()
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

        val roundtrippedThbBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbBeneficiary),
                jacksonTypeRef<ThbBeneficiary>(),
            )

        assertThat(roundtrippedThbBeneficiary).isEqualTo(thbBeneficiary)
    }
}
