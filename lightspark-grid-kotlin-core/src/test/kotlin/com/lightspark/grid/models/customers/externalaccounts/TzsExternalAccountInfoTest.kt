// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.TzsBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.TzsAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TzsExternalAccountInfoTest {

    @Test
    fun create() {
        val tzsExternalAccountInfo =
            TzsExternalAccountInfo.builder()
                .beneficiary(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountType(TzsAccountInfo.AccountType.TZS_ACCOUNT)
                .addPaymentRail(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+255712345678")
                .provider("Example Provider")
                .build()

        assertThat(tzsExternalAccountInfo.beneficiary())
            .isEqualTo(
                TzsExternalAccountInfo.Beneficiary.ofIndividual(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(tzsExternalAccountInfo.accountType())
            .isEqualTo(TzsAccountInfo.AccountType.TZS_ACCOUNT)
        assertThat(tzsExternalAccountInfo.paymentRails())
            .containsExactly(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(tzsExternalAccountInfo.phoneNumber()).isEqualTo("+255712345678")
        assertThat(tzsExternalAccountInfo.provider()).isEqualTo("Example Provider")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tzsExternalAccountInfo =
            TzsExternalAccountInfo.builder()
                .beneficiary(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountType(TzsAccountInfo.AccountType.TZS_ACCOUNT)
                .addPaymentRail(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+255712345678")
                .provider("Example Provider")
                .build()

        val roundtrippedTzsExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tzsExternalAccountInfo),
                jacksonTypeRef<TzsExternalAccountInfo>(),
            )

        assertThat(roundtrippedTzsExternalAccountInfo).isEqualTo(tzsExternalAccountInfo)
    }
}
