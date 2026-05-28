// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerUpdateRequestTest {

    @Test
    fun create() {
        val beneficialOwnerUpdateRequest =
            BeneficialOwnerUpdateRequest.builder()
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerUpdateRequest.PersonalInfo.builder()
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
                        .idType(BeneficialOwnerUpdateRequest.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .middleName("Marie")
                        .nationality("US")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerUpdateRequest.Role.UBO)
                .addRole(BeneficialOwnerUpdateRequest.Role.DIRECTOR)
                .build()

        assertThat(beneficialOwnerUpdateRequest.ownershipPercentage()).isEqualTo(51L)
        assertThat(beneficialOwnerUpdateRequest.personalInfo())
            .isEqualTo(
                BeneficialOwnerUpdateRequest.PersonalInfo.builder()
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
                    .idType(BeneficialOwnerUpdateRequest.PersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .middleName("Marie")
                    .nationality("US")
                    .phoneNumber("+14155550192")
                    .build()
            )
        assertThat(beneficialOwnerUpdateRequest.roles())
            .containsExactly(
                BeneficialOwnerUpdateRequest.Role.UBO,
                BeneficialOwnerUpdateRequest.Role.DIRECTOR,
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerUpdateRequest =
            BeneficialOwnerUpdateRequest.builder()
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerUpdateRequest.PersonalInfo.builder()
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
                        .idType(BeneficialOwnerUpdateRequest.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .middleName("Marie")
                        .nationality("US")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerUpdateRequest.Role.UBO)
                .addRole(BeneficialOwnerUpdateRequest.Role.DIRECTOR)
                .build()

        val roundtrippedBeneficialOwnerUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerUpdateRequest),
                jacksonTypeRef<BeneficialOwnerUpdateRequest>(),
            )

        assertThat(roundtrippedBeneficialOwnerUpdateRequest).isEqualTo(beneficialOwnerUpdateRequest)
    }
}
