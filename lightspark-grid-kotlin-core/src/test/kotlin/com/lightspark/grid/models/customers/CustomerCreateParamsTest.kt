// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .createCustomerRequest(
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
                        IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount
                            .COUNT_100_TO_500
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
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
                                .acceptanceMethod(
                                    EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX
                                )
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .ipAddress("198.51.100.24")
                                .termsVersion("V1")
                                .build()
                        )
                        .expectedMonthlyTransactionCount(
                            IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
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
                        .netWorthRange(
                            IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M
                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateRequestOneOf.ofIndividual(
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
                                .acceptanceMethod(
                                    EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX
                                )
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .ipAddress("198.51.100.24")
                                .termsVersion("V1")
                                .build()
                        )
                        .expectedMonthlyTransactionCount(
                            IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
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
                        .netWorthRange(
                            IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M
                        )
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
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreateParams.builder()
                .createCustomerRequest(
                    IndividualCustomerCreateRequest.builder()
                        .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreateRequestOneOf.ofIndividual(
                    IndividualCustomerCreateRequest.builder()
                        .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
            )
    }
}
