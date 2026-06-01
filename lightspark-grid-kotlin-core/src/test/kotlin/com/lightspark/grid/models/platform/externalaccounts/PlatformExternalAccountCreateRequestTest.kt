// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlatformExternalAccountCreateRequestTest {

    @Test
    fun create() {
        val platformExternalAccountCreateRequest =
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

        assertThat(platformExternalAccountCreateRequest.accountInfo())
            .isEqualTo(
                PlatformExternalAccountCreateRequest.AccountInfo.ofAedAccount(
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
            )
        assertThat(platformExternalAccountCreateRequest.currency()).isEqualTo("USD")
        assertThat(platformExternalAccountCreateRequest.platformAccountId())
            .isEqualTo("ext_acc_123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val platformExternalAccountCreateRequest =
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

        val roundtrippedPlatformExternalAccountCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(platformExternalAccountCreateRequest),
                jacksonTypeRef<PlatformExternalAccountCreateRequest>(),
            )

        assertThat(roundtrippedPlatformExternalAccountCreateRequest)
            .isEqualTo(platformExternalAccountCreateRequest)
    }
}
