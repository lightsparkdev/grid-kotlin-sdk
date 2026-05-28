// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.AedExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.BeneficiaryVerifiedData
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.platform.externalaccounts.AedAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountListPageResponseTest {

    @Test
    fun create() {
        val externalAccountListPageResponse =
            ExternalAccountListPageResponse.builder()
                .addData(
                    ExternalAccount.builder()
                        .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .accountInfo(
                            AedExternalAccountInfo.builder()
                                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                                .iban("AE070331234567890123456")
                                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                                .swiftCode("EBILAEAD")
                                .beneficiary(
                                    AedBeneficiary.builder()
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
                                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
                                        .birthDate("birthDate")
                                        .countryOfResidence("countryOfResidence")
                                        .email("email")
                                        .nationality("nationality")
                                        .phoneNumber("phoneNumber")
                                        .build()
                                )
                                .build()
                        )
                        .currency("USD")
                        .status(ExternalAccount.Status.ACTIVE)
                        .beneficiaryVerificationStatus(
                            ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                        )
                        .beneficiaryVerifiedData(
                            BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                        )
                        .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                        .defaultUmaDepositAccount(false)
                        .platformAccountId("acc_123456789")
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(externalAccountListPageResponse.data())
            .containsExactly(
                ExternalAccount.builder()
                    .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .accountInfo(
                        AedExternalAccountInfo.builder()
                            .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                            .iban("AE070331234567890123456")
                            .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                            .swiftCode("EBILAEAD")
                            .beneficiary(
                                AedBeneficiary.builder()
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
                                    .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("fullName")
                                    .birthDate("birthDate")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .nationality("nationality")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .build()
                    )
                    .currency("USD")
                    .status(ExternalAccount.Status.ACTIVE)
                    .beneficiaryVerificationStatus(
                        ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                    )
                    .beneficiaryVerifiedData(
                        BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                    )
                    .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                    .defaultUmaDepositAccount(false)
                    .platformAccountId("acc_123456789")
                    .build()
            )
        assertThat(externalAccountListPageResponse.hasMore()).isEqualTo(true)
        assertThat(externalAccountListPageResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(externalAccountListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountListPageResponse =
            ExternalAccountListPageResponse.builder()
                .addData(
                    ExternalAccount.builder()
                        .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .accountInfo(
                            AedExternalAccountInfo.builder()
                                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                                .iban("AE070331234567890123456")
                                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                                .swiftCode("EBILAEAD")
                                .beneficiary(
                                    AedBeneficiary.builder()
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
                                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
                                        .birthDate("birthDate")
                                        .countryOfResidence("countryOfResidence")
                                        .email("email")
                                        .nationality("nationality")
                                        .phoneNumber("phoneNumber")
                                        .build()
                                )
                                .build()
                        )
                        .currency("USD")
                        .status(ExternalAccount.Status.ACTIVE)
                        .beneficiaryVerificationStatus(
                            ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                        )
                        .beneficiaryVerifiedData(
                            BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                        )
                        .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                        .defaultUmaDepositAccount(false)
                        .platformAccountId("acc_123456789")
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedExternalAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountListPageResponse),
                jacksonTypeRef<ExternalAccountListPageResponse>(),
            )

        assertThat(roundtrippedExternalAccountListPageResponse)
            .isEqualTo(externalAccountListPageResponse)
    }
}
