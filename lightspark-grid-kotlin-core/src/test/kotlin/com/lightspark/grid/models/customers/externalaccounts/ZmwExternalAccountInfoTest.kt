// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.ZmwBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.ZmwAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZmwExternalAccountInfoTest {

    @Test
    fun create() {
        val zmwExternalAccountInfo =
            ZmwExternalAccountInfo.builder()
                .accountType(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
                .addPaymentRail(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+260971234567")
                .provider("x")
                .beneficiary(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(zmwExternalAccountInfo.accountType())
            .isEqualTo(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
        assertThat(zmwExternalAccountInfo.paymentRails())
            .containsExactly(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(zmwExternalAccountInfo.phoneNumber()).isEqualTo("+260971234567")
        assertThat(zmwExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(zmwExternalAccountInfo.beneficiary())
            .isEqualTo(
                ZmwExternalAccountInfo.Beneficiary.ofIndividual(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val zmwExternalAccountInfo =
            ZmwExternalAccountInfo.builder()
                .accountType(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
                .addPaymentRail(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+260971234567")
                .provider("x")
                .beneficiary(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedZmwExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zmwExternalAccountInfo),
                jacksonTypeRef<ZmwExternalAccountInfo>(),
            )

        assertThat(roundtrippedZmwExternalAccountInfo).isEqualTo(zmwExternalAccountInfo)
    }
}
