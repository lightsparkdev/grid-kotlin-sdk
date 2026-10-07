// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.RwfBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.RwfAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RwfExternalAccountInfoTest {

    @Test
    fun create() {
        val rwfExternalAccountInfo =
            RwfExternalAccountInfo.builder()
                .accountType(RwfAccountInfo.AccountType.RWF_ACCOUNT)
                .addPaymentRail(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+250781234567")
                .provider("x")
                .beneficiary(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(rwfExternalAccountInfo.accountType())
            .isEqualTo(RwfAccountInfo.AccountType.RWF_ACCOUNT)
        assertThat(rwfExternalAccountInfo.paymentRails())
            .containsExactly(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(rwfExternalAccountInfo.phoneNumber()).isEqualTo("+250781234567")
        assertThat(rwfExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(rwfExternalAccountInfo.beneficiary())
            .isEqualTo(
                RwfExternalAccountInfo.Beneficiary.ofIndividual(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val rwfExternalAccountInfo =
            RwfExternalAccountInfo.builder()
                .accountType(RwfAccountInfo.AccountType.RWF_ACCOUNT)
                .addPaymentRail(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+250781234567")
                .provider("x")
                .beneficiary(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedRwfExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rwfExternalAccountInfo),
                jacksonTypeRef<RwfExternalAccountInfo>(),
            )

        assertThat(roundtrippedRwfExternalAccountInfo).isEqualTo(rwfExternalAccountInfo)
    }
}
