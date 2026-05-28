// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.BeneficialOwner
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerListResponseTest {

    @Test
    fun create() {
        val beneficialOwnerListResponse =
            BeneficialOwnerListResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(beneficialOwnerListResponse.data())
            .containsExactly(
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
            )
        assertThat(beneficialOwnerListResponse.hasMore()).isEqualTo(true)
        assertThat(beneficialOwnerListResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(beneficialOwnerListResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerListResponse =
            BeneficialOwnerListResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedBeneficialOwnerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerListResponse),
                jacksonTypeRef<BeneficialOwnerListResponse>(),
            )

        assertThat(roundtrippedBeneficialOwnerListResponse).isEqualTo(beneficialOwnerListResponse)
    }
}
