// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerPersonalInfoTest {

    @Test
    fun create() {
        val beneficialOwnerPersonalInfo =
            BeneficialOwnerPersonalInfo.builder()
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
                .birthDate(LocalDate.parse("1978-06-15"))
                .firstName("Jane")
                .identifier("123-45-6789")
                .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                .lastName("Smith")
                .nationality("US")
                .countryOfIssuance("US")
                .email("jane.smith@acmecorp.com")
                .middleName("Marie")
                .phoneNumber("+14155550192")
                .build()

        assertThat(beneficialOwnerPersonalInfo.address())
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
        assertThat(beneficialOwnerPersonalInfo.birthDate()).isEqualTo(LocalDate.parse("1978-06-15"))
        assertThat(beneficialOwnerPersonalInfo.firstName()).isEqualTo("Jane")
        assertThat(beneficialOwnerPersonalInfo.identifier()).isEqualTo("123-45-6789")
        assertThat(beneficialOwnerPersonalInfo.idType())
            .isEqualTo(BeneficialOwnerPersonalInfo.IdType.SSN)
        assertThat(beneficialOwnerPersonalInfo.lastName()).isEqualTo("Smith")
        assertThat(beneficialOwnerPersonalInfo.nationality()).isEqualTo("US")
        assertThat(beneficialOwnerPersonalInfo.countryOfIssuance()).isEqualTo("US")
        assertThat(beneficialOwnerPersonalInfo.email()).isEqualTo("jane.smith@acmecorp.com")
        assertThat(beneficialOwnerPersonalInfo.middleName()).isEqualTo("Marie")
        assertThat(beneficialOwnerPersonalInfo.phoneNumber()).isEqualTo("+14155550192")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerPersonalInfo =
            BeneficialOwnerPersonalInfo.builder()
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
                .birthDate(LocalDate.parse("1978-06-15"))
                .firstName("Jane")
                .identifier("123-45-6789")
                .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                .lastName("Smith")
                .nationality("US")
                .countryOfIssuance("US")
                .email("jane.smith@acmecorp.com")
                .middleName("Marie")
                .phoneNumber("+14155550192")
                .build()

        val roundtrippedBeneficialOwnerPersonalInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerPersonalInfo),
                jacksonTypeRef<BeneficialOwnerPersonalInfo>(),
            )

        assertThat(roundtrippedBeneficialOwnerPersonalInfo).isEqualTo(beneficialOwnerPersonalInfo)
    }
}
