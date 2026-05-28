// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerOneOfTest {

    @Test
    fun ofIndividual() {
        val individual =
            CustomerOneOf.Individual.builder()
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
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
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                .nationality("US")
                .build()

        val customerOneOf = CustomerOneOf.ofIndividual(individual)

        assertThat(customerOneOf.individual()).isEqualTo(individual)
        assertThat(customerOneOf.business()).isNull()
    }

    @Test
    fun ofIndividualRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerOneOf =
            CustomerOneOf.ofIndividual(
                CustomerOneOf.Individual.builder()
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .isDeleted(false)
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
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
                    .fullName("John Michael Doe")
                    .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                    .nationality("US")
                    .build()
            )

        val roundtrippedCustomerOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerOneOf),
                jacksonTypeRef<CustomerOneOf>(),
            )

        assertThat(roundtrippedCustomerOneOf).isEqualTo(customerOneOf)
    }

    @Test
    fun ofBusiness() {
        val business =
            CustomerOneOf.Business.builder()
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .businessInfo(
                    BusinessCustomerFields.BusinessInfo.builder()
                        .legalName("Acme Corporation, Inc.")
                        .businessType(
                            BusinessCustomerFields.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerFields.BusinessInfo.EntityType.LLC)
                        .expectedMonthlyTransactionCount(
                            BusinessCustomerFields.BusinessInfo.ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessCustomerFields.BusinessInfo.ExpectedMonthlyTransactionVolume
                                .VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .purposeOfAccount(
                            BusinessCustomerFields.BusinessInfo.PurposeOfAccount.CONTRACTOR_PAYOUTS
                        )
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                .addBeneficialOwner(
                    CustomerOneOf.Business.BeneficialOwner.builder()
                        .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .kycStatus(CustomerOneOf.Business.BeneficialOwner.KycStatus.APPROVED)
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
                        .addRole(CustomerOneOf.Business.BeneficialOwner.Role.UBO)
                        .addRole(CustomerOneOf.Business.BeneficialOwner.Role.DIRECTOR)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .build()

        val customerOneOf = CustomerOneOf.ofBusiness(business)

        assertThat(customerOneOf.individual()).isNull()
        assertThat(customerOneOf.business()).isEqualTo(business)
    }

    @Test
    fun ofBusinessRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerOneOf =
            CustomerOneOf.ofBusiness(
                CustomerOneOf.Business.builder()
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .isDeleted(false)
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .businessInfo(
                        BusinessCustomerFields.BusinessInfo.builder()
                            .legalName("Acme Corporation, Inc.")
                            .businessType(
                                BusinessCustomerFields.BusinessInfo.BusinessType
                                    .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                            )
                            .addCountriesOfOperation("US")
                            .country("US")
                            .doingBusinessAs("Acme")
                            .entityType(BusinessCustomerFields.BusinessInfo.EntityType.LLC)
                            .expectedMonthlyTransactionCount(
                                BusinessCustomerFields.BusinessInfo.ExpectedMonthlyTransactionCount
                                    .COUNT_100_TO_500
                            )
                            .expectedMonthlyTransactionVolume(
                                BusinessCustomerFields.BusinessInfo.ExpectedMonthlyTransactionVolume
                                    .VOLUME_100_K_TO_1_M
                            )
                            .addExpectedRecipientJurisdiction("US")
                            .incorporatedOn(LocalDate.parse("2018-03-14"))
                            .purposeOfAccount(
                                BusinessCustomerFields.BusinessInfo.PurposeOfAccount
                                    .CONTRACTOR_PAYOUTS
                            )
                            .registrationNumber("5523041")
                            .sourceOfFunds(
                                "Funds derived from customer payments for software services"
                            )
                            .taxId("47-1234567")
                            .build()
                    )
                    .kybStatus(BusinessCustomerFields.KybStatus.APPROVED)
                    .addBeneficialOwner(
                        CustomerOneOf.Business.BeneficialOwner.builder()
                            .id("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .kycStatus(CustomerOneOf.Business.BeneficialOwner.KycStatus.APPROVED)
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
                            .addRole(CustomerOneOf.Business.BeneficialOwner.Role.UBO)
                            .addRole(CustomerOneOf.Business.BeneficialOwner.Role.DIRECTOR)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedCustomerOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerOneOf),
                jacksonTypeRef<CustomerOneOf>(),
            )

        assertThat(roundtrippedCustomerOneOf).isEqualTo(customerOneOf)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerOneOf>())

        val e = assertThrows<LightsparkGridInvalidDataException> { customerOneOf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
