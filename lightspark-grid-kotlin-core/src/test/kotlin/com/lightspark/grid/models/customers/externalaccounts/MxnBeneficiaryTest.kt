// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnBeneficiaryTest {

    @Test
    fun create() {
        val mxnBeneficiary =
            MxnBeneficiary.builder()
                .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    MxnBeneficiary.Address.builder()
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

        assertThat(mxnBeneficiary.beneficiaryType())
            .isEqualTo(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(mxnBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(mxnBeneficiary.address())
            .isEqualTo(
                MxnBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(mxnBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(mxnBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(mxnBeneficiary.email()).isEqualTo("email")
        assertThat(mxnBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(mxnBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(mxnBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnBeneficiary =
            MxnBeneficiary.builder()
                .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    MxnBeneficiary.Address.builder()
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

        val roundtrippedMxnBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnBeneficiary),
                jacksonTypeRef<MxnBeneficiary>(),
            )

        assertThat(roundtrippedMxnBeneficiary).isEqualTo(mxnBeneficiary)
    }
}
