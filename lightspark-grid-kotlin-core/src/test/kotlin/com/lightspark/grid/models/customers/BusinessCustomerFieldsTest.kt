// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessCustomerFieldsTest {

    @Test
    fun create() {
        val businessCustomerFields =
            BusinessCustomerFields.builder()
                .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                .addBeneficialOwner(
                    BusinessCustomerFields.BeneficialOwner.builder()
                        .fullName("John Michael Doe")
                        .individualType(
                            BusinessCustomerFields.BeneficialOwner.IndividualType.DIRECTOR
                        )
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
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .emailAddress("example@test.com")
                        .nationality("US")
                        .percentageOwnership(25.0)
                        .phoneNumber("+5555555555")
                        .taxId("EIN-987654321")
                        .title("CEO, COO, President")
                        .build()
                )
                .businessInfo(
                    BusinessCustomerFields.BusinessInfo.builder()
                        .businessType(
                            BusinessCustomerFields.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .legalName("Acme Corporation, Inc.")
                        .registrationNumber("BRN-123456789")
                        .taxId("EIN-987654321")
                        .build()
                )
                .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                .build()

        assertThat(businessCustomerFields.customerType())
            .isEqualTo(BusinessCustomerFields.CustomerType.BUSINESS)
        assertThat(businessCustomerFields.address())
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
        assertThat(businessCustomerFields.beneficialOwners())
            .containsExactly(
                BusinessCustomerFields.BeneficialOwner.builder()
                    .fullName("John Michael Doe")
                    .individualType(BusinessCustomerFields.BeneficialOwner.IndividualType.DIRECTOR)
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
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .emailAddress("example@test.com")
                    .nationality("US")
                    .percentageOwnership(25.0)
                    .phoneNumber("+5555555555")
                    .taxId("EIN-987654321")
                    .title("CEO, COO, President")
                    .build()
            )
        assertThat(businessCustomerFields.businessInfo())
            .isEqualTo(
                BusinessCustomerFields.BusinessInfo.builder()
                    .businessType(
                        BusinessCustomerFields.BusinessInfo.BusinessType
                            .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                    )
                    .legalName("Acme Corporation, Inc.")
                    .registrationNumber("BRN-123456789")
                    .taxId("EIN-987654321")
                    .build()
            )
        assertThat(businessCustomerFields.kybStatus())
            .isEqualTo(BusinessCustomerFields.KybStatus.APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessCustomerFields =
            BusinessCustomerFields.builder()
                .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
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
                .addBeneficialOwner(
                    BusinessCustomerFields.BeneficialOwner.builder()
                        .fullName("John Michael Doe")
                        .individualType(
                            BusinessCustomerFields.BeneficialOwner.IndividualType.DIRECTOR
                        )
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
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .emailAddress("example@test.com")
                        .nationality("US")
                        .percentageOwnership(25.0)
                        .phoneNumber("+5555555555")
                        .taxId("EIN-987654321")
                        .title("CEO, COO, President")
                        .build()
                )
                .businessInfo(
                    BusinessCustomerFields.BusinessInfo.builder()
                        .businessType(
                            BusinessCustomerFields.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .legalName("Acme Corporation, Inc.")
                        .registrationNumber("BRN-123456789")
                        .taxId("EIN-987654321")
                        .build()
                )
                .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                .build()

        val roundtrippedBusinessCustomerFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomerFields),
                jacksonTypeRef<BusinessCustomerFields>(),
            )

        assertThat(roundtrippedBusinessCustomerFields).isEqualTo(businessCustomerFields)
    }
}
