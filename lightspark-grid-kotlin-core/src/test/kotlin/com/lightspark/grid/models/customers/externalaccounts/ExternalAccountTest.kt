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
                                    BrlBeneficiary.Address.builder()
                                        .country("country")
                                        .line1("line1")
                                        .postalCode("postalCode")
                                        .city("city")
                                        .line2("line2")
                                        .state("state")
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
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
                .currency("USD")
                .status(ExternalAccount.Status.ACTIVE)
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
                                    BrlBeneficiary.Address.builder()
                                        .country("country")
                                        .line1("line1")
                                        .postalCode("postalCode")
                                        .city("city")
                                        .line2("line2")
                                        .state("state")
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
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
            )
        assertThat(externalAccount.currency()).isEqualTo("USD")
        assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
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
                                    BrlBeneficiary.Address.builder()
                                        .country("country")
                                        .line1("line1")
                                        .postalCode("postalCode")
                                        .city("city")
                                        .line2("line2")
                                        .state("state")
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
                        .pixKey("pixKey")
                        .pixKeyType("pixKeyType")
                        .taxId("taxId")
                        .build()
                )
                .currency("USD")
                .status(ExternalAccount.Status.ACTIVE)
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
