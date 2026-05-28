// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerUpdateRequestOneOfTest {

    @Test
    fun ofIndividual() {
        val individual =
            IndividualCustomerUpdateRequest.builder()
                .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
                .nationality("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val customerUpdateRequestOneOf = CustomerUpdateRequestOneOf.ofIndividual(individual)

        assertThat(customerUpdateRequestOneOf.individual()).isEqualTo(individual)
        assertThat(customerUpdateRequestOneOf.business()).isNull()
    }

    @Test
    fun ofIndividualRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerUpdateRequestOneOf =
            CustomerUpdateRequestOneOf.ofIndividual(
                IndividualCustomerUpdateRequest.builder()
                    .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                    .currencies(listOf("USD", "EUR", "USDC"))
                    .email("john.doe@example.com")
                    .fullName("John Michael Doe")
                    .kycStatus(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
                    .nationality("US")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )

        val roundtrippedCustomerUpdateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerUpdateRequestOneOf),
                jacksonTypeRef<CustomerUpdateRequestOneOf>(),
            )

        assertThat(roundtrippedCustomerUpdateRequestOneOf).isEqualTo(customerUpdateRequestOneOf)
    }

    @Test
    fun ofBusiness() {
        val business =
            BusinessCustomerUpdateRequest.builder()
                .customerType(BusinessCustomerUpdateRequest.CustomerType.BUSINESS)
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
                    BusinessCustomerUpdateRequest.BusinessInfo.builder()
                        .businessType(
                            BusinessCustomerUpdateRequest.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .country("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerUpdateRequest.BusinessInfo.EntityType.LLC)
                        .expectedMonthlyTransactionCount(
                            BusinessCustomerUpdateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessCustomerUpdateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionVolume
                                .VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .purposeOfAccount(
                            BusinessCustomerUpdateRequest.BusinessInfo.PurposeOfAccount
                                .CONTRACTOR_PAYOUTS
                        )
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .taxId("47-1234567")
                        .build()
                )
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .kybStatus(BusinessCustomerUpdateRequest.KybStatus.APPROVED)
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val customerUpdateRequestOneOf = CustomerUpdateRequestOneOf.ofBusiness(business)

        assertThat(customerUpdateRequestOneOf.individual()).isNull()
        assertThat(customerUpdateRequestOneOf.business()).isEqualTo(business)
    }

    @Test
    fun ofBusinessRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerUpdateRequestOneOf =
            CustomerUpdateRequestOneOf.ofBusiness(
                BusinessCustomerUpdateRequest.builder()
                    .customerType(BusinessCustomerUpdateRequest.CustomerType.BUSINESS)
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
                        BusinessCustomerUpdateRequest.BusinessInfo.builder()
                            .businessType(
                                BusinessCustomerUpdateRequest.BusinessInfo.BusinessType
                                    .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                            )
                            .addCountriesOfOperation("US")
                            .country("US")
                            .doingBusinessAs("Acme")
                            .entityType(BusinessCustomerUpdateRequest.BusinessInfo.EntityType.LLC)
                            .expectedMonthlyTransactionCount(
                                BusinessCustomerUpdateRequest.BusinessInfo
                                    .ExpectedMonthlyTransactionCount
                                    .COUNT_100_TO_500
                            )
                            .expectedMonthlyTransactionVolume(
                                BusinessCustomerUpdateRequest.BusinessInfo
                                    .ExpectedMonthlyTransactionVolume
                                    .VOLUME_100_K_TO_1_M
                            )
                            .addExpectedRecipientJurisdiction("US")
                            .incorporatedOn(LocalDate.parse("2018-03-14"))
                            .legalName("Acme Corporation, Inc.")
                            .purposeOfAccount(
                                BusinessCustomerUpdateRequest.BusinessInfo.PurposeOfAccount
                                    .CONTRACTOR_PAYOUTS
                            )
                            .registrationNumber("5523041")
                            .sourceOfFunds(
                                "Funds derived from customer payments for software services"
                            )
                            .taxId("47-1234567")
                            .build()
                    )
                    .currencies(listOf("USD", "EUR", "USDC"))
                    .email("john.doe@example.com")
                    .kybStatus(BusinessCustomerUpdateRequest.KybStatus.APPROVED)
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )

        val roundtrippedCustomerUpdateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerUpdateRequestOneOf),
                jacksonTypeRef<CustomerUpdateRequestOneOf>(),
            )

        assertThat(roundtrippedCustomerUpdateRequestOneOf).isEqualTo(customerUpdateRequestOneOf)
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
        val customerUpdateRequestOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerUpdateRequestOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                customerUpdateRequestOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
