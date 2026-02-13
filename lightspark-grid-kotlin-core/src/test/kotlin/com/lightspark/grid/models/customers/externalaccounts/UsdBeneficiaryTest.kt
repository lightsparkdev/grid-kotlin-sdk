// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdBeneficiaryTest {

    @Test
    fun create() {
        val usdBeneficiary =
            UsdBeneficiary.builder()
                .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .birthDate("birthDate")
                .fullName("fullName")
                .nationality("nationality")
                .address(
                    UsdBeneficiary.Address.builder()
                        .country("country")
                        .line1("line1")
                        .postalCode("postalCode")
                        .city("city")
                        .line2("line2")
                        .state("state")
                        .build()
                )
                .countryOfResidence("countryOfResidence")
                .email("email")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        assertThat(usdBeneficiary.beneficiaryType())
            .isEqualTo(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(usdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(usdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(usdBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(usdBeneficiary.address())
            .isEqualTo(
                UsdBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(usdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(usdBeneficiary.email()).isEqualTo("email")
        assertThat(usdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(usdBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdBeneficiary =
            UsdBeneficiary.builder()
                .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .birthDate("birthDate")
                .fullName("fullName")
                .nationality("nationality")
                .address(
                    UsdBeneficiary.Address.builder()
                        .country("country")
                        .line1("line1")
                        .postalCode("postalCode")
                        .city("city")
                        .line2("line2")
                        .state("state")
                        .build()
                )
                .countryOfResidence("countryOfResidence")
                .email("email")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        val roundtrippedUsdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdBeneficiary),
                jacksonTypeRef<UsdBeneficiary>(),
            )

        assertThat(roundtrippedUsdBeneficiary).isEqualTo(usdBeneficiary)
    }
}
