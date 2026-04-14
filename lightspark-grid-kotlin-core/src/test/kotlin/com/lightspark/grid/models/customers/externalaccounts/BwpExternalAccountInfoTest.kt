// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.BwpBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.BwpAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BwpExternalAccountInfoTest {

    @Test
    fun create() {
        val bwpExternalAccountInfo =
            BwpExternalAccountInfo.builder()
                .accountType(BwpAccountInfo.AccountType.BWP_ACCOUNT)
                .addPaymentRail(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(bwpExternalAccountInfo.accountType())
            .isEqualTo(BwpAccountInfo.AccountType.BWP_ACCOUNT)
        assertThat(bwpExternalAccountInfo.paymentRails())
            .containsExactly(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(bwpExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(bwpExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(bwpExternalAccountInfo.beneficiary())
            .isEqualTo(
                BwpExternalAccountInfo.Beneficiary.ofIndividual(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val bwpExternalAccountInfo =
            BwpExternalAccountInfo.builder()
                .accountType(BwpAccountInfo.AccountType.BWP_ACCOUNT)
                .addPaymentRail(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBwpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bwpExternalAccountInfo),
                jacksonTypeRef<BwpExternalAccountInfo>(),
            )

        assertThat(roundtrippedBwpExternalAccountInfo).isEqualTo(bwpExternalAccountInfo)
    }
}
