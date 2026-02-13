// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateTest {

    @Test
    fun create() {
        val externalAccountCreate =
            ExternalAccountCreate.builder()
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
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .defaultUmaDepositAccount(true)
                .platformAccountId("ext_acc_123456")
                .build()

        assertThat(externalAccountCreate.accountInfo())
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
        assertThat(externalAccountCreate.currency()).isEqualTo("USD")
        assertThat(externalAccountCreate.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(externalAccountCreate.defaultUmaDepositAccount()).isEqualTo(true)
        assertThat(externalAccountCreate.platformAccountId()).isEqualTo("ext_acc_123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreate =
            ExternalAccountCreate.builder()
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
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .defaultUmaDepositAccount(true)
                .platformAccountId("ext_acc_123456")
                .build()

        val roundtrippedExternalAccountCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreate),
                jacksonTypeRef<ExternalAccountCreate>(),
            )

        assertThat(roundtrippedExternalAccountCreate).isEqualTo(externalAccountCreate)
    }
}
