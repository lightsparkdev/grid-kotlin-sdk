// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.Customer
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerTest {

    @Test
    fun create() {
        val individualCustomer =
            IndividualCustomer.builder()
                .customerType(JsonValue.from("INDIVIDUAL"))
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .contactVerification(
                    Customer.ContactVerification.builder()
                        .email(Customer.ContactVerification.Email.VERIFIED)
                        .phone(Customer.ContactVerification.Phone.VERIFIED)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .phoneNumber("+14155551234")
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .annualIncomeRange(IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K)
                .birthDate(LocalDate.parse("1990-01-15"))
                .expectedMonthlyTransactionCount(
                    IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomer.PepStatus.NONE)
                .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.INVESTMENTS)
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .taxIdCountryOfIssuance("US")
                .taxIdentifier("123-45-6789")
                .taxIdType(IndividualCustomer.TaxIdType.SSN)
                .build()

        assertThat(individualCustomer._customerType()).isEqualTo(JsonValue.from("INDIVIDUAL"))
        assertThat(individualCustomer.platformCustomerId()).isEqualTo("9f84e0c2a72c4fa")
        assertThat(individualCustomer.umaAddress()).isEqualTo("\$john.doe@uma.domain.com")
        assertThat(individualCustomer.id())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(individualCustomer.contactVerification())
            .isEqualTo(
                Customer.ContactVerification.builder()
                    .email(Customer.ContactVerification.Email.VERIFIED)
                    .phone(Customer.ContactVerification.Phone.VERIFIED)
                    .build()
            )
        assertThat(individualCustomer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(individualCustomer.currencies()).containsExactly("USD", "USDC")
        assertThat(individualCustomer.email()).isEqualTo("john.doe@example.com")
        assertThat(individualCustomer.isDeleted()).isEqualTo(false)
        assertThat(individualCustomer.phoneNumber()).isEqualTo("+14155551234")
        assertThat(individualCustomer.region()).isEqualTo("US")
        assertThat(individualCustomer.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(individualCustomer.address())
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
        assertThat(individualCustomer.annualIncomeRange())
            .isEqualTo(IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K)
        assertThat(individualCustomer.birthDate()).isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomer.expectedMonthlyTransactionCount())
            .isEqualTo(IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500)
        assertThat(individualCustomer.expectedMonthlyTransactionVolume())
            .isEqualTo(IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M)
        assertThat(individualCustomer.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomer.kycStatus()).isEqualTo(IndividualCustomer.KycStatus.APPROVED)
        assertThat(individualCustomer.nationality()).isEqualTo("US")
        assertThat(individualCustomer.netWorthRange())
            .isEqualTo(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
        assertThat(individualCustomer.pepStatus()).isEqualTo(IndividualCustomer.PepStatus.NONE)
        assertThat(individualCustomer.purposeOfAccount())
            .isEqualTo(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
        assertThat(individualCustomer.purposeOfAccountOtherDescription())
            .isEqualTo("Household budgeting between spouses")
        assertThat(individualCustomer.sourceOfFundsCategories())
            .containsExactly(IndividualCustomer.SourceOfFundsCategory.SALARY)
        assertThat(individualCustomer.sourceOfFundsOtherDescription()).isEqualTo("Contest winnings")
        assertThat(individualCustomer.sourceOfWealthCategories())
            .containsExactly(
                IndividualCustomer.SourceOfWealthCategory.SALARY,
                IndividualCustomer.SourceOfWealthCategory.INVESTMENTS,
            )
        assertThat(individualCustomer.sourceOfWealthOtherDescription())
            .isEqualTo("Royalty income from published works")
        assertThat(individualCustomer.taxIdCountryOfIssuance()).isEqualTo("US")
        assertThat(individualCustomer.taxIdentifier()).isEqualTo("123-45-6789")
        assertThat(individualCustomer.taxIdType()).isEqualTo(IndividualCustomer.TaxIdType.SSN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomer =
            IndividualCustomer.builder()
                .customerType(JsonValue.from("INDIVIDUAL"))
                .platformCustomerId("9f84e0c2a72c4fa")
                .umaAddress("\$john.doe@uma.domain.com")
                .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .contactVerification(
                    Customer.ContactVerification.builder()
                        .email(Customer.ContactVerification.Email.VERIFIED)
                        .phone(Customer.ContactVerification.Phone.VERIFIED)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .addCurrency("USD")
                .addCurrency("USDC")
                .email("john.doe@example.com")
                .isDeleted(false)
                .phoneNumber("+14155551234")
                .region("US")
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                .annualIncomeRange(IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K)
                .birthDate(LocalDate.parse("1990-01-15"))
                .expectedMonthlyTransactionCount(
                    IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomer.PepStatus.NONE)
                .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.INVESTMENTS)
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .taxIdCountryOfIssuance("US")
                .taxIdentifier("123-45-6789")
                .taxIdType(IndividualCustomer.TaxIdType.SSN)
                .build()

        val roundtrippedIndividualCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomer),
                jacksonTypeRef<IndividualCustomer>(),
            )

        assertThat(roundtrippedIndividualCustomer).isEqualTo(individualCustomer)
    }
}
