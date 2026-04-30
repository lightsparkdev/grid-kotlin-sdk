// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.HtgBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.HtgAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HtgExternalAccountInfoTest {

    @Test
    fun create() {
        val htgExternalAccountInfo =
            HtgExternalAccountInfo.builder()
                .accountType(HtgAccountInfo.AccountType.HTG_ACCOUNT)
                .addPaymentRail(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .beneficiary(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        assertThat(htgExternalAccountInfo.accountType())
            .isEqualTo(HtgAccountInfo.AccountType.HTG_ACCOUNT)
        assertThat(htgExternalAccountInfo.paymentRails())
            .containsExactly(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(htgExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(htgExternalAccountInfo.beneficiary())
            .isEqualTo(
                HtgExternalAccountInfo.Beneficiary.ofIndividual(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
        val htgExternalAccountInfo =
            HtgExternalAccountInfo.builder()
                .accountType(HtgAccountInfo.AccountType.HTG_ACCOUNT)
                .addPaymentRail(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .beneficiary(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        val roundtrippedHtgExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(htgExternalAccountInfo),
                jacksonTypeRef<HtgExternalAccountInfo>(),
            )

        assertThat(roundtrippedHtgExternalAccountInfo).isEqualTo(htgExternalAccountInfo)
    }
}
