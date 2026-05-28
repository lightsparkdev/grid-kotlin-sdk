// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.XafBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.XafAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XafExternalAccountInfoTest {

    @Test
    fun create() {
        val xafExternalAccountInfo =
            XafExternalAccountInfo.builder()
                .accountType(XafAccountInfo.AccountType.XAF_ACCOUNT)
                .addPaymentRail(XafAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafAccountInfo.Region.CM)
                .beneficiary(
                    XafBeneficiary.builder()
                        .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(xafExternalAccountInfo.accountType())
            .isEqualTo(XafAccountInfo.AccountType.XAF_ACCOUNT)
        assertThat(xafExternalAccountInfo.paymentRails())
            .containsExactly(XafAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(xafExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(xafExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(xafExternalAccountInfo.region()).isEqualTo(XafAccountInfo.Region.CM)
        assertThat(xafExternalAccountInfo.beneficiary())
            .isEqualTo(
                XafExternalAccountInfo.Beneficiary.ofIndividual(
                    XafBeneficiary.builder()
                        .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val xafExternalAccountInfo =
            XafExternalAccountInfo.builder()
                .accountType(XafAccountInfo.AccountType.XAF_ACCOUNT)
                .addPaymentRail(XafAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafAccountInfo.Region.CM)
                .beneficiary(
                    XafBeneficiary.builder()
                        .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedXafExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xafExternalAccountInfo),
                jacksonTypeRef<XafExternalAccountInfo>(),
            )

        assertThat(roundtrippedXafExternalAccountInfo).isEqualTo(xafExternalAccountInfo)
    }
}
