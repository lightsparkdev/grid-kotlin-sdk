// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PkrBeneficiaryTest {

    @Test
    fun create() {
        val pkrBeneficiary =
            PkrBeneficiary.builder()
                .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(pkrBeneficiary.beneficiaryType())
            .isEqualTo(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(pkrBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(pkrBeneficiary.address())
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
        assertThat(pkrBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(pkrBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(pkrBeneficiary.email()).isEqualTo("email")
        assertThat(pkrBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(pkrBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pkrBeneficiary =
            PkrBeneficiary.builder()
                .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedPkrBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pkrBeneficiary),
                jacksonTypeRef<PkrBeneficiary>(),
            )

        assertThat(roundtrippedPkrBeneficiary).isEqualTo(pkrBeneficiary)
    }
}
