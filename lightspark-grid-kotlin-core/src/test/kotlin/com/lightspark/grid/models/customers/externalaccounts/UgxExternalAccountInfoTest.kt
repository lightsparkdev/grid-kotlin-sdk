// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.UgxBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.UgxAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UgxExternalAccountInfoTest {

    @Test
    fun create() {
        val ugxExternalAccountInfo =
            UgxExternalAccountInfo.builder()
                .accountType(UgxAccountInfo.AccountType.UGX_ACCOUNT)
                .addPaymentRail(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .build()
                )
                .build()

        assertThat(ugxExternalAccountInfo.accountType())
            .isEqualTo(UgxAccountInfo.AccountType.UGX_ACCOUNT)
        assertThat(ugxExternalAccountInfo.paymentRails())
            .containsExactly(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(ugxExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(ugxExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(ugxExternalAccountInfo.beneficiary())
            .isEqualTo(
                UgxExternalAccountInfo.Beneficiary.ofIndividual(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ugxExternalAccountInfo =
            UgxExternalAccountInfo.builder()
                .accountType(UgxAccountInfo.AccountType.UGX_ACCOUNT)
                .addPaymentRail(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .build()
                )
                .build()

        val roundtrippedUgxExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ugxExternalAccountInfo),
                jacksonTypeRef<UgxExternalAccountInfo>(),
            )

        assertThat(roundtrippedUgxExternalAccountInfo).isEqualTo(ugxExternalAccountInfo)
    }
}
