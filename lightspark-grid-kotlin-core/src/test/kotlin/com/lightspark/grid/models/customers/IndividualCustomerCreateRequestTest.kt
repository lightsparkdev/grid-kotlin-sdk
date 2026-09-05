// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerCreateRequestTest {

    @Test
    fun create() {
        val individualCustomerCreateRequest =
            IndividualCustomerCreateRequest.builder()
                .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
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
                    IndividualCustomerCreateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                )
                .birthDate(LocalDate.parse("1990-01-15"))
                .countryOfIssuance("US")
                .addCurrency("USD")
                .addCurrency("USDC")
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
                    IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomerCreateRequest.ExpectedMonthlyTransactionVolume
                        .VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .identifier("123-45-6789")
                .idType(IndividualCustomerCreateRequest.IdType.SSN)
                .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomerCreateRequest.PepStatus.NONE)
                .phoneNumber("+14155551234")
                .platformCustomerId("9f84e0c2a72c4fa")
                .purposeOfAccount(
                    IndividualCustomerCreateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                )
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .region("US")
                .addSourceOfFundsCategory(
                    IndividualCustomerCreateRequest.SourceOfFundsCategory.SALARY
                )
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(
                    IndividualCustomerCreateRequest.SourceOfWealthCategory.SALARY
                )
                .addSourceOfWealthCategory(
                    IndividualCustomerCreateRequest.SourceOfWealthCategory.INVESTMENTS
                )
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(individualCustomerCreateRequest.customerType())
            .isEqualTo(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
        assertThat(individualCustomerCreateRequest.address())
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
        assertThat(individualCustomerCreateRequest.annualIncomeRange())
            .isEqualTo(IndividualCustomerCreateRequest.AnnualIncomeRange.RANGE_100_K_250_K)
        assertThat(individualCustomerCreateRequest.birthDate())
            .isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomerCreateRequest.countryOfIssuance()).isEqualTo("US")
        assertThat(individualCustomerCreateRequest.currencies()).containsExactly("USD", "USDC")
        assertThat(individualCustomerCreateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(individualCustomerCreateRequest.endUserTermsConsent())
            .isEqualTo(
                EndUserTermsConsentRequest.builder()
                    .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipAddress("198.51.100.24")
                    .termsVersion("V1")
                    .build()
            )
        assertThat(individualCustomerCreateRequest.expectedMonthlyTransactionCount())
            .isEqualTo(
                IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
            )
        assertThat(individualCustomerCreateRequest.expectedMonthlyTransactionVolume())
            .isEqualTo(
                IndividualCustomerCreateRequest.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
            )
        assertThat(individualCustomerCreateRequest.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomerCreateRequest.identifier()).isEqualTo("123-45-6789")
        assertThat(individualCustomerCreateRequest.idType())
            .isEqualTo(IndividualCustomerCreateRequest.IdType.SSN)
        assertThat(individualCustomerCreateRequest.kycStatus())
            .isEqualTo(IndividualCustomerCreateRequest.KycStatus.APPROVED)
        assertThat(individualCustomerCreateRequest.nationality()).isEqualTo("US")
        assertThat(individualCustomerCreateRequest.netWorthRange())
            .isEqualTo(IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M)
        assertThat(individualCustomerCreateRequest.pepStatus())
            .isEqualTo(IndividualCustomerCreateRequest.PepStatus.NONE)
        assertThat(individualCustomerCreateRequest.phoneNumber()).isEqualTo("+14155551234")
        assertThat(individualCustomerCreateRequest.platformCustomerId())
            .isEqualTo("9f84e0c2a72c4fa")
        assertThat(individualCustomerCreateRequest.purposeOfAccount())
            .isEqualTo(IndividualCustomerCreateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS)
        assertThat(individualCustomerCreateRequest.purposeOfAccountOtherDescription())
            .isEqualTo("Household budgeting between spouses")
        assertThat(individualCustomerCreateRequest.region()).isEqualTo("US")
        assertThat(individualCustomerCreateRequest.sourceOfFundsCategories())
            .containsExactly(IndividualCustomerCreateRequest.SourceOfFundsCategory.SALARY)
        assertThat(individualCustomerCreateRequest.sourceOfFundsOtherDescription())
            .isEqualTo("Contest winnings")
        assertThat(individualCustomerCreateRequest.sourceOfWealthCategories())
            .containsExactly(
                IndividualCustomerCreateRequest.SourceOfWealthCategory.SALARY,
                IndividualCustomerCreateRequest.SourceOfWealthCategory.INVESTMENTS,
            )
        assertThat(individualCustomerCreateRequest.sourceOfWealthOtherDescription())
            .isEqualTo("Royalty income from published works")
        assertThat(individualCustomerCreateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomerCreateRequest =
            IndividualCustomerCreateRequest.builder()
                .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
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
                    IndividualCustomerCreateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                )
                .birthDate(LocalDate.parse("1990-01-15"))
                .countryOfIssuance("US")
                .addCurrency("USD")
                .addCurrency("USDC")
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
                    IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                )
                .expectedMonthlyTransactionVolume(
                    IndividualCustomerCreateRequest.ExpectedMonthlyTransactionVolume
                        .VOLUME_100_K_TO_1_M
                )
                .fullName("John Michael Doe")
                .identifier("123-45-6789")
                .idType(IndividualCustomerCreateRequest.IdType.SSN)
                .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                .nationality("US")
                .netWorthRange(IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M)
                .pepStatus(IndividualCustomerCreateRequest.PepStatus.NONE)
                .phoneNumber("+14155551234")
                .platformCustomerId("9f84e0c2a72c4fa")
                .purposeOfAccount(
                    IndividualCustomerCreateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                )
                .purposeOfAccountOtherDescription("Household budgeting between spouses")
                .region("US")
                .addSourceOfFundsCategory(
                    IndividualCustomerCreateRequest.SourceOfFundsCategory.SALARY
                )
                .sourceOfFundsOtherDescription("Contest winnings")
                .addSourceOfWealthCategory(
                    IndividualCustomerCreateRequest.SourceOfWealthCategory.SALARY
                )
                .addSourceOfWealthCategory(
                    IndividualCustomerCreateRequest.SourceOfWealthCategory.INVESTMENTS
                )
                .sourceOfWealthOtherDescription("Royalty income from published works")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedIndividualCustomerCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomerCreateRequest),
                jacksonTypeRef<IndividualCustomerCreateRequest>(),
            )

        assertThat(roundtrippedIndividualCustomerCreateRequest)
            .isEqualTo(individualCustomerCreateRequest)
    }
}
