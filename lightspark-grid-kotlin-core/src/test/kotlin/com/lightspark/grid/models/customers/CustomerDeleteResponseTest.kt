// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.BeneficialOwner
import com.lightspark.grid.models.BusinessCustomer
import com.lightspark.grid.models.BusinessInfoUpdate
import com.lightspark.grid.models.IndividualCustomer
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerDeleteResponseTest {

    @Test
    fun ofIndividual() {
        val individual =
            IndividualCustomer.builder()
                .customerType(IndividualCustomer.CustomerType.INDIVIDUAL)
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .fullName("John Michael Doe")
                .isDeleted(false)
                .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                .nationality("US")
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .build()

        val customerDeleteResponse = CustomerDeleteResponse.ofIndividual(individual)

        assertThat(customerDeleteResponse.individual()).isEqualTo(individual)
        assertThat(customerDeleteResponse.business()).isNull()
    }

    @Test
    fun ofIndividualRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerDeleteResponse =
            CustomerDeleteResponse.ofIndividual(
                IndividualCustomer.builder()
                    .customerType(IndividualCustomer.CustomerType.INDIVIDUAL)
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .fullName("John Michael Doe")
                    .isDeleted(false)
                    .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                    .nationality("US")
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .build()
            )

        val roundtrippedCustomerDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerDeleteResponse),
                jacksonTypeRef<CustomerDeleteResponse>(),
            )

        assertThat(roundtrippedCustomerDeleteResponse).isEqualTo(customerDeleteResponse)
    }

    @Test
    fun ofBusiness() {
        val business =
            BusinessCustomer.builder()
                .customerType(BusinessCustomer.CustomerType.BUSINESS)
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                .businessInfo(
                    BusinessCustomer.BusinessInfo.builder()
                        .businessType(
                            BusinessInfoUpdate.BusinessType.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessInfoUpdate.EntityType.LLC)
                        .expectedMonthlyTransactionCount(
                            BusinessInfoUpdate.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessInfoUpdate.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .purposeOfAccount(BusinessInfoUpdate.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .kybStatus(BusinessCustomer.KybStatus.APPROVED)
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .build()

        val customerDeleteResponse = CustomerDeleteResponse.ofBusiness(business)

        assertThat(customerDeleteResponse.individual()).isNull()
        assertThat(customerDeleteResponse.business()).isEqualTo(business)
    }

    @Test
    fun ofBusinessRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerDeleteResponse =
            CustomerDeleteResponse.ofBusiness(
                BusinessCustomer.builder()
                    .customerType(BusinessCustomer.CustomerType.BUSINESS)
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
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
                    .businessInfo(
                        BusinessCustomer.BusinessInfo.builder()
                            .businessType(
                                BusinessInfoUpdate.BusinessType
                                    .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                            )
                            .addCountriesOfOperation("US")
                            .country("US")
                            .doingBusinessAs("Acme")
                            .entityType(BusinessInfoUpdate.EntityType.LLC)
                            .expectedMonthlyTransactionCount(
                                BusinessInfoUpdate.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                            )
                            .expectedMonthlyTransactionVolume(
                                BusinessInfoUpdate.ExpectedMonthlyTransactionVolume
                                    .VOLUME_100_K_TO_1_M
                            )
                            .addExpectedRecipientJurisdiction("US")
                            .incorporatedOn(LocalDate.parse("2018-03-14"))
                            .legalName("Acme Corporation, Inc.")
                            .purposeOfAccount(
                                BusinessInfoUpdate.PurposeOfAccount.CONTRACTOR_PAYOUTS
                            )
                            .registrationNumber("5523041")
                            .sourceOfFunds(
                                "Funds derived from customer payments for software services"
                            )
                            .taxId("47-1234567")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .isDeleted(false)
                    .kybStatus(BusinessCustomer.KybStatus.APPROVED)
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .build()
            )

        val roundtrippedCustomerDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerDeleteResponse),
                jacksonTypeRef<CustomerDeleteResponse>(),
            )

        assertThat(roundtrippedCustomerDeleteResponse).isEqualTo(customerDeleteResponse)
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
        val customerDeleteResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerDeleteResponse>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { customerDeleteResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
