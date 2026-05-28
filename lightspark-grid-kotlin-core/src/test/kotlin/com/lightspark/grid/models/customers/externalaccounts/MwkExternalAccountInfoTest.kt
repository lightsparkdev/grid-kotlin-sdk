// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.MwkBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.MwkAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MwkExternalAccountInfoTest {

    @Test
    fun create() {
        val mwkExternalAccountInfo =
            MwkExternalAccountInfo.builder()
                .accountType(MwkAccountInfo.AccountType.MWK_ACCOUNT)
                .addPaymentRail(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(mwkExternalAccountInfo.accountType())
            .isEqualTo(MwkAccountInfo.AccountType.MWK_ACCOUNT)
        assertThat(mwkExternalAccountInfo.paymentRails())
            .containsExactly(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(mwkExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(mwkExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(mwkExternalAccountInfo.beneficiary())
            .isEqualTo(
                MwkExternalAccountInfo.Beneficiary.ofIndividual(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val mwkExternalAccountInfo =
            MwkExternalAccountInfo.builder()
                .accountType(MwkAccountInfo.AccountType.MWK_ACCOUNT)
                .addPaymentRail(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedMwkExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mwkExternalAccountInfo),
                jacksonTypeRef<MwkExternalAccountInfo>(),
            )

        assertThat(roundtrippedMwkExternalAccountInfo).isEqualTo(mwkExternalAccountInfo)
    }
}
