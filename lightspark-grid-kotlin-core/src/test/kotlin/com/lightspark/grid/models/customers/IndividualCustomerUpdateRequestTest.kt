// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerUpdateRequestTest {

    @Test
    fun create() {
        val individualCustomerUpdateRequest =
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
                .annualIncomeRange(
                    IndividualCustomerUpdateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                )
                .birthDate(LocalDate.parse("1990-01-15"))
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .endUserTermsConsent(
                    EndUserTermsConsentRequest.builder()
                        .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("198.51.100.24")
                        .termsVersion("V1")
                        .build()
                )
                .expectedMonthlyTransactionCount(
                    IndividualCustomerUpdateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomerUpdateRequest.ExpectedMonthlyTransactionVolume
                        .VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomerUpdateRequest.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomerUpdateRequest.PepStatus.NONE)
                .phoneNumber("+14155551234")
                .purposeOfAccount(
                    IndividualCustomerUpdateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                )
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .addSourceOfFundsCategory(
                    IndividualCustomerUpdateRequest.SourceOfFundsCategory.SALARY
                )
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(
                    IndividualCustomerUpdateRequest.SourceOfWealthCategory.SALARY
                )
                .addSourceOfWealthCategory(
                    IndividualCustomerUpdateRequest.SourceOfWealthCategory.INVESTMENTS
                )
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .taxIdCountryOfIssuance("US")
                .taxIdentifier("123-45-6789")
                .taxIdType(IndividualCustomerUpdateRequest.TaxIdType.SSN)
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(individualCustomerUpdateRequest.customerType())
            .isEqualTo(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
        assertThat(individualCustomerUpdateRequest.address())
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
        assertThat(individualCustomerUpdateRequest.annualIncomeRange())
            .isEqualTo(IndividualCustomerUpdateRequest.AnnualIncomeRange.RANGE_100_K_250_K)
        assertThat(individualCustomerUpdateRequest.birthDate())
            .isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomerUpdateRequest.currencies())
            .containsExactly("USD", "EUR", "USDC")
        assertThat(individualCustomerUpdateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(individualCustomerUpdateRequest.endUserTermsConsent())
            .isEqualTo(
                EndUserTermsConsentRequest.builder()
                    .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipAddress("198.51.100.24")
                    .termsVersion("V1")
                    .build()
            )
        assertThat(individualCustomerUpdateRequest.expectedMonthlyTransactionCount())
            .isEqualTo(
                IndividualCustomerUpdateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
            )
        assertThat(individualCustomerUpdateRequest.expectedMonthlyTransactionVolume())
            .isEqualTo(
                IndividualCustomerUpdateRequest.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
            )
        assertThat(individualCustomerUpdateRequest.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomerUpdateRequest.kycStatus())
            .isEqualTo(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
        assertThat(individualCustomerUpdateRequest.nationality()).isEqualTo("US")
        assertThat(individualCustomerUpdateRequest.netWorthRange())
            .isEqualTo(IndividualCustomerUpdateRequest.NetWorthRange.RANGE_500_K_1_M)
        assertThat(individualCustomerUpdateRequest.pepStatus())
            .isEqualTo(IndividualCustomerUpdateRequest.PepStatus.NONE)
        assertThat(individualCustomerUpdateRequest.phoneNumber()).isEqualTo("+14155551234")
        assertThat(individualCustomerUpdateRequest.purposeOfAccount())
            .isEqualTo(IndividualCustomerUpdateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS)
        assertThat(individualCustomerUpdateRequest.purposeOfAccountOtherDescription())
            .isEqualTo("Household budgeting between spouses")
        assertThat(individualCustomerUpdateRequest.sourceOfFundsCategories())
            .containsExactly(IndividualCustomerUpdateRequest.SourceOfFundsCategory.SALARY)
        assertThat(individualCustomerUpdateRequest.sourceOfFundsOtherDescription())
            .isEqualTo("Contest winnings")
        assertThat(individualCustomerUpdateRequest.sourceOfWealthCategories())
            .containsExactly(
                IndividualCustomerUpdateRequest.SourceOfWealthCategory.SALARY,
                IndividualCustomerUpdateRequest.SourceOfWealthCategory.INVESTMENTS,
            )
        assertThat(individualCustomerUpdateRequest.sourceOfWealthOtherDescription())
            .isEqualTo("Royalty income from published works")
        assertThat(individualCustomerUpdateRequest.taxIdCountryOfIssuance()).isEqualTo("US")
        assertThat(individualCustomerUpdateRequest.taxIdentifier()).isEqualTo("123-45-6789")
        assertThat(individualCustomerUpdateRequest.taxIdType())
            .isEqualTo(IndividualCustomerUpdateRequest.TaxIdType.SSN)
        assertThat(individualCustomerUpdateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomerUpdateRequest =
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
                .annualIncomeRange(
                    IndividualCustomerUpdateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                )
                .birthDate(LocalDate.parse("1990-01-15"))
                .currencies(listOf("USD", "EUR", "USDC"))
                .email("john.doe@example.com")
                .endUserTermsConsent(
                    EndUserTermsConsentRequest.builder()
                        .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("198.51.100.24")
                        .termsVersion("V1")
                        .build()
                )
                .expectedMonthlyTransactionCount(
                    IndividualCustomerUpdateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomerUpdateRequest.ExpectedMonthlyTransactionVolume
                        .VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerUpdateRequest.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomerUpdateRequest.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomerUpdateRequest.PepStatus.NONE)
                .phoneNumber("+14155551234")
                .purposeOfAccount(
                    IndividualCustomerUpdateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                )
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .addSourceOfFundsCategory(
                    IndividualCustomerUpdateRequest.SourceOfFundsCategory.SALARY
                )
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(
                    IndividualCustomerUpdateRequest.SourceOfWealthCategory.SALARY
                )
                .addSourceOfWealthCategory(
                    IndividualCustomerUpdateRequest.SourceOfWealthCategory.INVESTMENTS
                )
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .taxIdCountryOfIssuance("US")
                .taxIdentifier("123-45-6789")
                .taxIdType(IndividualCustomerUpdateRequest.TaxIdType.SSN)
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedIndividualCustomerUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomerUpdateRequest),
                jacksonTypeRef<IndividualCustomerUpdateRequest>(),
            )

        assertThat(roundtrippedIndividualCustomerUpdateRequest)
            .isEqualTo(individualCustomerUpdateRequest)
    }
}
