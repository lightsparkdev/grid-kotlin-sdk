// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerCreateRequestTest {

    @Test
    fun create() {
        val beneficialOwnerCreateRequest =
            BeneficialOwnerCreateRequest.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .ownershipPercentage(51L)
                .personalInfo(
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
                )
                .addRole(BeneficialOwnerRole.UBO)
                .addRole(BeneficialOwnerRole.DIRECTOR)
                .build()

        assertThat(beneficialOwnerCreateRequest.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwnerCreateRequest.ownershipPercentage()).isEqualTo(51L)
        assertThat(beneficialOwnerCreateRequest.personalInfo())
            .isEqualTo(
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
            )
        assertThat(beneficialOwnerCreateRequest.roles())
            .containsExactly(BeneficialOwnerRole.UBO, BeneficialOwnerRole.DIRECTOR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerCreateRequest =
            BeneficialOwnerCreateRequest.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .ownershipPercentage(51L)
                .personalInfo(
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
                )
                .addRole(BeneficialOwnerRole.UBO)
                .addRole(BeneficialOwnerRole.DIRECTOR)
                .build()

        val roundtrippedBeneficialOwnerCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerCreateRequest),
                jacksonTypeRef<BeneficialOwnerCreateRequest>(),
            )

        assertThat(roundtrippedBeneficialOwnerCreateRequest).isEqualTo(beneficialOwnerCreateRequest)
    }
}
