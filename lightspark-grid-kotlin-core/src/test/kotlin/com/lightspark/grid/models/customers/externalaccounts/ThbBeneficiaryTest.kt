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

        assertThat(thbBeneficiary.beneficiaryType())
            .isEqualTo(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(thbBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(thbBeneficiary.address())
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
        assertThat(thbBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(thbBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(thbBeneficiary.email()).isEqualTo("email")
        assertThat(thbBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(thbBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thbBeneficiary =
            ThbBeneficiary.builder()
                .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedThbBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbBeneficiary),
                jacksonTypeRef<ThbBeneficiary>(),
            )

        assertThat(roundtrippedThbBeneficiary).isEqualTo(thbBeneficiary)
    }
}
