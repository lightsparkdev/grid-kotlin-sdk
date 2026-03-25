// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerUpdateResponseTest {

    @Test
    fun create() {
        val beneficialOwnerUpdateResponse =
            BeneficialOwnerUpdateResponse.builder()
                .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(BeneficialOwnerUpdateResponse.KycStatus.APPROVED)
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerUpdateResponse.PersonalInfo.builder()
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
                        .idType(BeneficialOwnerUpdateResponse.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .nationality("US")
                        .countryOfIssuance("US")
                        .email("jane.smith@acmecorp.com")
                        .middleName("Marie")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerUpdateResponse.Role.UBO)
                .addRole(BeneficialOwnerUpdateResponse.Role.DIRECTOR)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        assertThat(beneficialOwnerUpdateResponse.id())
            .isEqualTo("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwnerUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(beneficialOwnerUpdateResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(beneficialOwnerUpdateResponse.kycStatus())
            .isEqualTo(BeneficialOwnerUpdateResponse.KycStatus.APPROVED)
        assertThat(beneficialOwnerUpdateResponse.ownershipPercentage()).isEqualTo(51L)
        assertThat(beneficialOwnerUpdateResponse.personalInfo())
            .isEqualTo(
                BeneficialOwnerUpdateResponse.PersonalInfo.builder()
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
                    .idType(BeneficialOwnerUpdateResponse.PersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .nationality("US")
                    .countryOfIssuance("US")
                    .email("jane.smith@acmecorp.com")
                    .middleName("Marie")
                    .phoneNumber("+14155550192")
                    .build()
            )
        assertThat(beneficialOwnerUpdateResponse.roles())
            .containsExactly(
                BeneficialOwnerUpdateResponse.Role.UBO,
                BeneficialOwnerUpdateResponse.Role.DIRECTOR,
            )
        assertThat(beneficialOwnerUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerUpdateResponse =
            BeneficialOwnerUpdateResponse.builder()
                .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(BeneficialOwnerUpdateResponse.KycStatus.APPROVED)
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerUpdateResponse.PersonalInfo.builder()
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
                        .idType(BeneficialOwnerUpdateResponse.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .nationality("US")
                        .countryOfIssuance("US")
                        .email("jane.smith@acmecorp.com")
                        .middleName("Marie")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerUpdateResponse.Role.UBO)
                .addRole(BeneficialOwnerUpdateResponse.Role.DIRECTOR)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .build()

        val roundtrippedBeneficialOwnerUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerUpdateResponse),
                jacksonTypeRef<BeneficialOwnerUpdateResponse>(),
            )

        assertThat(roundtrippedBeneficialOwnerUpdateResponse)
            .isEqualTo(beneficialOwnerUpdateResponse)
    }
}
