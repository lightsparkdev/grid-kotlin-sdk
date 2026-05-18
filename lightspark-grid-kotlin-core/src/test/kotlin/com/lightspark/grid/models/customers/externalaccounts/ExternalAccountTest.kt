// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.AedAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountTest {

    @Test
    fun create() {
        val externalAccount =
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

        assertThat(externalAccount.id())
            .isEqualTo("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
        assertThat(externalAccount.accountInfo())
            .isEqualTo(
                ExternalAccountInfoOneOf.ofAedAccount(
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
            )
        assertThat(externalAccount.currency()).isEqualTo("USD")
        assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
        assertThat(externalAccount.beneficiaryVerificationStatus())
            .isEqualTo(ExternalAccount.BeneficiaryVerificationStatus.MATCHED)
        assertThat(externalAccount.beneficiaryVerifiedData())
            .isEqualTo(BeneficiaryVerifiedData.builder().fullName("John Doe").build())
        assertThat(externalAccount.customerId())
            .isEqualTo("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
        assertThat(externalAccount.defaultUmaDepositAccount()).isEqualTo(false)
        assertThat(externalAccount.platformAccountId()).isEqualTo("acc_123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccount =
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

        val roundtrippedExternalAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccount),
                jacksonTypeRef<ExternalAccount>(),
            )

        assertThat(roundtrippedExternalAccount).isEqualTo(externalAccount)
    }
}
