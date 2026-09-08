// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessCustomerCreateRequestTest {

    @Test
    fun create() {
        val businessCustomerCreateRequest =
            BusinessCustomerCreateRequest.builder()
                .businessInfo(
                    BusinessCustomerCreateRequest.BusinessInfo.builder()
                        .country("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .taxId("47-1234567")
                        .businessType(
                            BusinessCustomerCreateRequest.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerCreateRequest.BusinessInfo.EntityType.LLC)
                        .addExpectedCounterpartyCountry("US")
                        .expectedMonthlyTransactionCount(
                            BusinessCustomerCreateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessCustomerCreateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionVolume
                                .VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .naicsCode("541511")
                        .primaryContactFirstName("Jane")
                        .primaryContactLastName("Smith")
                        .purposeOfAccount(
                            BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                                .CONTRACTOR_PAYOUTS
                        )
                        .purposeOfAccountOtherDescription("Escrow for equipment leases")
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                        .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                        .build()
                )
                .customerType(BusinessCustomerCreateRequest.CustomerType.BUSINESS)
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
                .kybStatus(BusinessCustomerCreateRequest.KybStatus.APPROVED)
                .phoneNumber("+14155551234")
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        assertThat(businessCustomerCreateRequest.businessInfo())
            .isEqualTo(
                BusinessCustomerCreateRequest.BusinessInfo.builder()
                    .country("US")
                    .incorporatedOn(LocalDate.parse("2018-03-14"))
                    .legalName("Acme Corporation, Inc.")
                    .taxId("47-1234567")
                    .businessType(
                        BusinessCustomerCreateRequest.BusinessInfo.BusinessType
                            .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                    )
                    .addCountriesOfOperation("US")
                    .doingBusinessAs("Acme")
                    .entityType(BusinessCustomerCreateRequest.BusinessInfo.EntityType.LLC)
                    .addExpectedCounterpartyCountry("US")
                    .expectedMonthlyTransactionCount(
                        BusinessCustomerCreateRequest.BusinessInfo.ExpectedMonthlyTransactionCount
                            .COUNT_100_TO_500
                    )
                    .expectedMonthlyTransactionVolume(
                        BusinessCustomerCreateRequest.BusinessInfo.ExpectedMonthlyTransactionVolume
                            .VOLUME_100_K_TO_1_M
                    )
                    .addExpectedRecipientJurisdiction("US")
                    .naicsCode("541511")
                    .primaryContactFirstName("Jane")
                    .primaryContactLastName("Smith")
                    .purposeOfAccount(
                        BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                            .CONTRACTOR_PAYOUTS
                    )
                    .purposeOfAccountOtherDescription("Escrow for equipment leases")
                    .registrationNumber("5523041")
                    .sourceOfFunds("Funds derived from customer payments for software services")
                    .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                    .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                    .build()
            )
        assertThat(businessCustomerCreateRequest.customerType())
            .isEqualTo(BusinessCustomerCreateRequest.CustomerType.BUSINESS)
        assertThat(businessCustomerCreateRequest.address())
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
        assertThat(businessCustomerCreateRequest.currencies()).containsExactly("USD", "USDC")
        assertThat(businessCustomerCreateRequest.email()).isEqualTo("john.doe@example.com")
        assertThat(businessCustomerCreateRequest.endUserTermsConsent())
            .isEqualTo(
                EndUserTermsConsentRequest.builder()
                    .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipAddress("198.51.100.24")
                    .termsVersion("V1")
                    .build()
            )
        assertThat(businessCustomerCreateRequest.kybStatus())
            .isEqualTo(BusinessCustomerCreateRequest.KybStatus.APPROVED)
        assertThat(businessCustomerCreateRequest.phoneNumber()).isEqualTo("+14155551234")
        assertThat(businessCustomerCreateRequest.platformCustomerId()).isEqualTo("9f84e0c2a72c4fa")
        assertThat(businessCustomerCreateRequest.region()).isEqualTo("US")
        assertThat(businessCustomerCreateRequest.umaAddress())
            .isEqualTo("\$john.doe@uma.domain.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessCustomerCreateRequest =
            BusinessCustomerCreateRequest.builder()
                .businessInfo(
                    BusinessCustomerCreateRequest.BusinessInfo.builder()
                        .country("US")
                        .incorporatedOn(LocalDate.parse("2018-03-14"))
                        .legalName("Acme Corporation, Inc.")
                        .taxId("47-1234567")
                        .businessType(
                            BusinessCustomerCreateRequest.BusinessInfo.BusinessType
                                .AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                        )
                        .addCountriesOfOperation("US")
                        .doingBusinessAs("Acme")
                        .entityType(BusinessCustomerCreateRequest.BusinessInfo.EntityType.LLC)
                        .addExpectedCounterpartyCountry("US")
                        .expectedMonthlyTransactionCount(
                            BusinessCustomerCreateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionCount
                                .COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            BusinessCustomerCreateRequest.BusinessInfo
                                .ExpectedMonthlyTransactionVolume
                                .VOLUME_100_K_TO_1_M
                        )
                        .addExpectedRecipientJurisdiction("US")
                        .naicsCode("541511")
                        .primaryContactFirstName("Jane")
                        .primaryContactLastName("Smith")
                        .purposeOfAccount(
                            BusinessCustomerCreateRequest.BusinessInfo.PurposeOfAccount
                                .CONTRACTOR_PAYOUTS
                        )
                        .purposeOfAccountOtherDescription("Escrow for equipment leases")
                        .registrationNumber("5523041")
                        .sourceOfFunds("Funds derived from customer payments for software services")
                        .addSourceOfFundsCategory(JsonValue.from("OPERATING_REVENUE"))
                        .sourceOfFundsOtherDescription("Proceeds from a legal settlement")
                        .build()
                )
                .customerType(BusinessCustomerCreateRequest.CustomerType.BUSINESS)
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
                .kybStatus(BusinessCustomerCreateRequest.KybStatus.APPROVED)
                .phoneNumber("+14155551234")
                .platformCustomerId("9f84e0c2a72c4fa")
                .region("US")
                .umaAddress("\$john.doe@uma.domain.com")
                .build()

        val roundtrippedBusinessCustomerCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessCustomerCreateRequest),
                jacksonTypeRef<BusinessCustomerCreateRequest>(),
            )

        assertThat(roundtrippedBusinessCustomerCreateRequest)
            .isEqualTo(businessCustomerCreateRequest)
    }
}
