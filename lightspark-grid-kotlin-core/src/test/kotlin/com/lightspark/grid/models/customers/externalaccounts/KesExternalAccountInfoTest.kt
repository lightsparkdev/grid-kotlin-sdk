// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.KesBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.KesAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KesExternalAccountInfoTest {

    @Test
    fun create() {
        val kesExternalAccountInfo =
            KesExternalAccountInfo.builder()
                .accountType(KesAccountInfo.AccountType.KES_ACCOUNT)
                .addPaymentRail(KesAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+254712345678")
                .provider("x")
                .beneficiary(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(kesExternalAccountInfo.accountType())
            .isEqualTo(KesAccountInfo.AccountType.KES_ACCOUNT)
        assertThat(kesExternalAccountInfo.paymentRails())
            .containsExactly(KesAccountInfo.PaymentRail.MOBILE_MONEY)
        assertThat(kesExternalAccountInfo.phoneNumber()).isEqualTo("+254712345678")
        assertThat(kesExternalAccountInfo.provider()).isEqualTo("x")
        assertThat(kesExternalAccountInfo.beneficiary())
            .isEqualTo(
                KesExternalAccountInfo.Beneficiary.ofIndividual(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val kesExternalAccountInfo =
            KesExternalAccountInfo.builder()
                .accountType(KesAccountInfo.AccountType.KES_ACCOUNT)
                .addPaymentRail(KesAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+254712345678")
                .provider("x")
                .beneficiary(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedKesExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kesExternalAccountInfo),
                jacksonTypeRef<KesExternalAccountInfo>(),
            )

        assertThat(roundtrippedKesExternalAccountInfo).isEqualTo(kesExternalAccountInfo)
    }
}
