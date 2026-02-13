// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
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
