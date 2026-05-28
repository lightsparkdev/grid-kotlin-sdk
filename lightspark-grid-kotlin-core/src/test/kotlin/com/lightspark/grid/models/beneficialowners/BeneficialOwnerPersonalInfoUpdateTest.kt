// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerPersonalInfoUpdateTest {

    @Test
    fun create() {
        val beneficialOwnerPersonalInfoUpdate =
            BeneficialOwnerPersonalInfoUpdate.builder()
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
                .countryOfIssuance("US")
                .email("jane.smith@acmecorp.com")
                .firstName("Jane")
                .identifier("123-45-6789")
                .idType(BeneficialOwnerPersonalInfoUpdate.IdType.SSN)
                .lastName("Smith")
                .middleName("Marie")
                .nationality("US")
                .phoneNumber("+14155550192")
                .build()

        assertThat(beneficialOwnerPersonalInfoUpdate.address())
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
        assertThat(beneficialOwnerPersonalInfoUpdate.birthDate())
            .isEqualTo(LocalDate.parse("1978-06-15"))
        assertThat(beneficialOwnerPersonalInfoUpdate.countryOfIssuance()).isEqualTo("US")
        assertThat(beneficialOwnerPersonalInfoUpdate.email()).isEqualTo("jane.smith@acmecorp.com")
        assertThat(beneficialOwnerPersonalInfoUpdate.firstName()).isEqualTo("Jane")
        assertThat(beneficialOwnerPersonalInfoUpdate.identifier()).isEqualTo("123-45-6789")
        assertThat(beneficialOwnerPersonalInfoUpdate.idType())
            .isEqualTo(BeneficialOwnerPersonalInfoUpdate.IdType.SSN)
        assertThat(beneficialOwnerPersonalInfoUpdate.lastName()).isEqualTo("Smith")
        assertThat(beneficialOwnerPersonalInfoUpdate.middleName()).isEqualTo("Marie")
        assertThat(beneficialOwnerPersonalInfoUpdate.nationality()).isEqualTo("US")
        assertThat(beneficialOwnerPersonalInfoUpdate.phoneNumber()).isEqualTo("+14155550192")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerPersonalInfoUpdate =
            BeneficialOwnerPersonalInfoUpdate.builder()
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
                .countryOfIssuance("US")
                .email("jane.smith@acmecorp.com")
                .firstName("Jane")
                .identifier("123-45-6789")
                .idType(BeneficialOwnerPersonalInfoUpdate.IdType.SSN)
                .lastName("Smith")
                .middleName("Marie")
                .nationality("US")
                .phoneNumber("+14155550192")
                .build()

        val roundtrippedBeneficialOwnerPersonalInfoUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerPersonalInfoUpdate),
                jacksonTypeRef<BeneficialOwnerPersonalInfoUpdate>(),
            )

        assertThat(roundtrippedBeneficialOwnerPersonalInfoUpdate)
            .isEqualTo(beneficialOwnerPersonalInfoUpdate)
    }
}
