// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.XofBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.XofAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XofExternalAccountInfoTest {

    @Test
    fun create() {
        val xofExternalAccountInfo =
            XofExternalAccountInfo.builder()
                .accountType(XofAccountInfo.AccountType.XOF_ACCOUNT)
                .addPaymentRail(XofAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofAccountInfo.Region.BJ)
                .beneficiary(
                    XofBeneficiary.builder()
                        .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(xofExternalAccountInfo.accountType())
            .isEqualTo(XofAccountInfo.AccountType.XOF_ACCOUNT)
        assertThat(xofExternalAccountInfo.paymentRails())
            .containsExactly(XofAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(xofExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(xofExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(xofExternalAccountInfo.region()).isEqualTo(XofAccountInfo.Region.BJ)
        assertThat(xofExternalAccountInfo.beneficiary())
            .isEqualTo(
                XofExternalAccountInfo.Beneficiary.ofIndividual(
                    XofBeneficiary.builder()
                        .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val xofExternalAccountInfo =
            XofExternalAccountInfo.builder()
                .accountType(XofAccountInfo.AccountType.XOF_ACCOUNT)
                .addPaymentRail(XofAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofAccountInfo.Region.BJ)
                .beneficiary(
                    XofBeneficiary.builder()
                        .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedXofExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xofExternalAccountInfo),
                jacksonTypeRef<XofExternalAccountInfo>(),
            )

        assertThat(roundtrippedXofExternalAccountInfo).isEqualTo(xofExternalAccountInfo)
    }
}
