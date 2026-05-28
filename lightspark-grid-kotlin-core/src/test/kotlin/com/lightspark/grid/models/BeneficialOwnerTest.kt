// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerTest {

    @Test
    fun create() {
        val beneficialOwner =
            BeneficialOwner.builder()
                .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(BeneficialOwner.KycStatus.APPROVED)
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
                .addRole(BeneficialOwner.Role.UBO)
                .addRole(BeneficialOwner.Role.DIRECTOR)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(beneficialOwner.id())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwner.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(beneficialOwner.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwner.kycStatus()).isEqualTo(BeneficialOwner.KycStatus.APPROVED)
        assertThat(beneficialOwner.ownershipPercentage()).isEqualTo(51L)
        assertThat(beneficialOwner.personalInfo())
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
        assertThat(beneficialOwner.roles())
            .containsExactly(BeneficialOwner.Role.UBO, BeneficialOwner.Role.DIRECTOR)
        assertThat(beneficialOwner.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwner =
            BeneficialOwner.builder()
                .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(BeneficialOwner.KycStatus.APPROVED)
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
                .addRole(BeneficialOwner.Role.UBO)
                .addRole(BeneficialOwner.Role.DIRECTOR)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedBeneficialOwner =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwner),
                jacksonTypeRef<BeneficialOwner>(),
            )

        assertThat(roundtrippedBeneficialOwner).isEqualTo(beneficialOwner)
    }
}
