// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.IndividualCustomer
import com.lightspark.grid.models.customers.Customer
import com.lightspark.grid.models.customers.CustomerOneOf
import com.lightspark.grid.models.customers.EndUserTermsConsentRequest
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateWebhookEventTest {

    @Test
    fun create() {
        val customerUpdateWebhookEvent =
            CustomerUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
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
                        .countryOfIssuance("US")
                        .expectedMonthlyTransactionCount(
                            IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .fullName("John Michael Doe")
                        .identifier("123-45-6789")
                        .idType(IndividualCustomer.IdType.SSN)
                        .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                        .nationality("US")
                        .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                        .pepStatus(IndividualCustomer.PepStatus.NONE)
                        .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .purposeOfAccountOtherDescription("Household budgeting between spouses")
                        .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                        .sourceOfFundsOtherDescription("Contest winnings")
                        .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                        .addSourceOfWealthCategory(
                            IndividualCustomer.SourceOfWealthCategory.INVESTMENTS
                        )
                        .sourceOfWealthOtherDescription("Royalty income from published works")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                .build()

        assertThat(customerUpdateWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(customerUpdateWebhookEvent.data())
            .isEqualTo(
                CustomerOneOf.ofIndividualCustomer(
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
                        .countryOfIssuance("US")
                        .expectedMonthlyTransactionCount(
                            IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .fullName("John Michael Doe")
                        .identifier("123-45-6789")
                        .idType(IndividualCustomer.IdType.SSN)
                        .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                        .nationality("US")
                        .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                        .pepStatus(IndividualCustomer.PepStatus.NONE)
                        .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .purposeOfAccountOtherDescription("Household budgeting between spouses")
                        .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                        .sourceOfFundsOtherDescription("Contest winnings")
                        .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                        .addSourceOfWealthCategory(
                            IndividualCustomer.SourceOfWealthCategory.INVESTMENTS
                        )
                        .sourceOfWealthOtherDescription("Royalty income from published works")
                        .build()
                )
            )
        assertThat(customerUpdateWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(customerUpdateWebhookEvent.type())
            .isEqualTo(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerUpdateWebhookEvent =
            CustomerUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
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
                        .countryOfIssuance("US")
                        .expectedMonthlyTransactionCount(
                            IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .fullName("John Michael Doe")
                        .identifier("123-45-6789")
                        .idType(IndividualCustomer.IdType.SSN)
                        .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                        .nationality("US")
                        .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                        .pepStatus(IndividualCustomer.PepStatus.NONE)
                        .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .purposeOfAccountOtherDescription("Household budgeting between spouses")
                        .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                        .sourceOfFundsOtherDescription("Contest winnings")
                        .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                        .addSourceOfWealthCategory(
                            IndividualCustomer.SourceOfWealthCategory.INVESTMENTS
                        )
                        .sourceOfWealthOtherDescription("Royalty income from published works")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                .build()

        val roundtrippedCustomerUpdateWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerUpdateWebhookEvent),
                jacksonTypeRef<CustomerUpdateWebhookEvent>(),
            )

        assertThat(roundtrippedCustomerUpdateWebhookEvent).isEqualTo(customerUpdateWebhookEvent)
    }
}
