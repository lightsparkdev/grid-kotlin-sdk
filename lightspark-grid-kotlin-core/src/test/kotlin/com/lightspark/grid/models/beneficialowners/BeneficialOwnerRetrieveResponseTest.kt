// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerRetrieveResponseTest {

    @Test
    fun create() {
        val beneficialOwnerRetrieveResponse =
            BeneficialOwnerRetrieveResponse.builder()
                .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(BeneficialOwnerRetrieveResponse.KycStatus.APPROVED)
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerRetrieveResponse.PersonalInfo.builder()
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
                        .idType(BeneficialOwnerRetrieveResponse.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .nationality("US")
                        .countryOfIssuance("US")
                        .email("jane.smith@acmecorp.com")
                        .middleName("Marie")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerRetrieveResponse.Role.UBO)
                .addRole(BeneficialOwnerRetrieveResponse.Role.DIRECTOR)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(beneficialOwnerRetrieveResponse.id())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwnerRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(beneficialOwnerRetrieveResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwnerRetrieveResponse.kycStatus())
            .isEqualTo(BeneficialOwnerRetrieveResponse.KycStatus.APPROVED)
        assertThat(beneficialOwnerRetrieveResponse.ownershipPercentage()).isEqualTo(51L)
        assertThat(beneficialOwnerRetrieveResponse.personalInfo())
            .isEqualTo(
                BeneficialOwnerRetrieveResponse.PersonalInfo.builder()
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
                    .idType(BeneficialOwnerRetrieveResponse.PersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .nationality("US")
                    .countryOfIssuance("US")
                    .email("jane.smith@acmecorp.com")
                    .middleName("Marie")
                    .phoneNumber("+14155550192")
                    .build()
            )
        assertThat(beneficialOwnerRetrieveResponse.roles())
            .containsExactly(
                BeneficialOwnerRetrieveResponse.Role.UBO,
                BeneficialOwnerRetrieveResponse.Role.DIRECTOR,
            )
        assertThat(beneficialOwnerRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerRetrieveResponse =
            BeneficialOwnerRetrieveResponse.builder()
                .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(BeneficialOwnerRetrieveResponse.KycStatus.APPROVED)
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerRetrieveResponse.PersonalInfo.builder()
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
                        .idType(BeneficialOwnerRetrieveResponse.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .nationality("US")
                        .countryOfIssuance("US")
                        .email("jane.smith@acmecorp.com")
                        .middleName("Marie")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerRetrieveResponse.Role.UBO)
                .addRole(BeneficialOwnerRetrieveResponse.Role.DIRECTOR)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedBeneficialOwnerRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerRetrieveResponse),
                jacksonTypeRef<BeneficialOwnerRetrieveResponse>(),
            )

        assertThat(roundtrippedBeneficialOwnerRetrieveResponse)
            .isEqualTo(beneficialOwnerRetrieveResponse)
    }
}
