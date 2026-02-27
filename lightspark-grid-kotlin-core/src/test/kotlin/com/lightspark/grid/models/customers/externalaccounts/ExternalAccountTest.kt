// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountTest {

    @Test
    fun create() {
        val externalAccount =
            ExternalAccount.builder()
                .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .accountInfo(
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .beneficiary(
                            BrlBeneficiary.builder()
                                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                .fullName("fullName")
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
                                .birthDate("birthDate")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("nationality")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
                .currency("USD")
                .status(ExternalAccount.Status.ACTIVE)
                .beneficiaryVerificationStatus(
                    ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                )
                .beneficiaryVerifiedData(
                    ExternalAccount.BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                )
                .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                .defaultUmaDepositAccount(false)
                .platformAccountId("acc_123456789")
                .build()

        assertThat(externalAccount.id())
            .isEqualTo("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
        assertThat(externalAccount.accountInfo())
            .isEqualTo(
                ExternalAccountInfoOneOf.ofBrlAccount(
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .beneficiary(
                            BrlBeneficiary.builder()
                                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                .fullName("fullName")
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
                                .birthDate("birthDate")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("nationality")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
            )
        assertThat(externalAccount.currency()).isEqualTo("USD")
        assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
        assertThat(externalAccount.beneficiaryVerificationStatus())
            .isEqualTo(ExternalAccount.BeneficiaryVerificationStatus.MATCHED)
        assertThat(externalAccount.beneficiaryVerifiedData())
            .isEqualTo(
                ExternalAccount.BeneficiaryVerifiedData.builder().fullName("John Doe").build()
            )
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
                    BrlExternalAccountInfo.builder()
                        .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                        .beneficiary(
                            BrlBeneficiary.builder()
                                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                                .fullName("fullName")
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
                                .birthDate("birthDate")
                                .countryOfResidence("countryOfResidence")
                                .email("email")
                                .nationality("nationality")
                                .phoneNumber("phoneNumber")
                                .registrationNumber("registrationNumber")
                                .build()
                        )
                        .addPaymentRail(BrlExternalAccountInfo.PaymentRail.PIX)
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
                .currency("USD")
                .status(ExternalAccount.Status.ACTIVE)
                .beneficiaryVerificationStatus(
                    ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                )
                .beneficiaryVerifiedData(
                    ExternalAccount.BeneficiaryVerifiedData.builder().fullName("John Doe").build()
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
