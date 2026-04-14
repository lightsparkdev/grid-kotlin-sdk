// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZarBeneficiaryTest {

    @Test
    fun create() {
        val zarBeneficiary =
            ZarBeneficiary.builder()
                .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(zarBeneficiary.beneficiaryType())
            .isEqualTo(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(zarBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(zarBeneficiary.address())
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
        assertThat(zarBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(zarBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(zarBeneficiary.email()).isEqualTo("email")
        assertThat(zarBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(zarBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zarBeneficiary =
            ZarBeneficiary.builder()
                .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedZarBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zarBeneficiary),
                jacksonTypeRef<ZarBeneficiary>(),
            )

        assertThat(roundtrippedZarBeneficiary).isEqualTo(zarBeneficiary)
    }
}
