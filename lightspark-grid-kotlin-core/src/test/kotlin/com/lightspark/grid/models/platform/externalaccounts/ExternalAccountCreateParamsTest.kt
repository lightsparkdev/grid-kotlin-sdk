// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .platformExternalAccountCreateRequest(
                PlatformExternalAccountCreateRequest.builder()
                    .accountInfo(
                        AedExternalAccountCreateInfo.builder()
                            .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
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
                            .iban("AE070331234567890123456")
                            .swiftCode("EBILAEAD")
                            .build()
                    )
                    .currency("USD")
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .platformExternalAccountCreateRequest(
                    PlatformExternalAccountCreateRequest.builder()
                        .accountInfo(
                            AedExternalAccountCreateInfo.builder()
                                .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
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
                                .iban("AE070331234567890123456")
                                .swiftCode("EBILAEAD")
                                .build()
                        )
                        .currency("USD")
                        .platformAccountId("ext_acc_123456")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlatformExternalAccountCreateRequest.builder()
                    .accountInfo(
                        AedExternalAccountCreateInfo.builder()
                            .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
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
                            .iban("AE070331234567890123456")
                            .swiftCode("EBILAEAD")
                            .build()
                    )
                    .currency("USD")
                    .platformAccountId("ext_acc_123456")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .platformExternalAccountCreateRequest(
                    PlatformExternalAccountCreateRequest.builder()
                        .accountInfo(
                            AedExternalAccountCreateInfo.builder()
                                .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                                .beneficiary(
                                    AedBeneficiary.builder()
                                        .address(
                                            Address.builder()
                                                .country("US")
                                                .line1("123 Main Street")
                                                .postalCode("94105")
                                                .build()
                                        )
                                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
                                        .build()
                                )
                                .iban("AE070331234567890123456")
                                .build()
                        )
                        .currency("USD")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlatformExternalAccountCreateRequest.builder()
                    .accountInfo(
                        AedExternalAccountCreateInfo.builder()
                            .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                            .beneficiary(
                                AedBeneficiary.builder()
                                    .address(
                                        Address.builder()
                                            .country("US")
                                            .line1("123 Main Street")
                                            .postalCode("94105")
                                            .build()
                                    )
                                    .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("fullName")
                                    .build()
                            )
                            .iban("AE070331234567890123456")
                            .build()
                    )
                    .currency("USD")
                    .build()
            )
    }
}
