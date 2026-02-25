// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnExternalAccountInfoTest {

    @Test
    fun create() {
        val mxnExternalAccountInfo =
            MxnExternalAccountInfo.builder()
                .accountType(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .clabeNumber("123456789012345678")
                .addCountry(MxnExternalAccountInfo.Country.MX)
                .addPaymentRail(MxnExternalAccountInfo.PaymentRail.SPEI)
                .build()

        assertThat(mxnExternalAccountInfo.accountType())
            .isEqualTo(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
        assertThat(mxnExternalAccountInfo.beneficiary())
            .isEqualTo(
                MxnExternalAccountInfo.Beneficiary.ofIndividual(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(mxnExternalAccountInfo.clabeNumber()).isEqualTo("123456789012345678")
        assertThat(mxnExternalAccountInfo.countries())
            .containsExactly(MxnExternalAccountInfo.Country.MX)
        assertThat(mxnExternalAccountInfo.paymentRails())
            .containsExactly(MxnExternalAccountInfo.PaymentRail.SPEI)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnExternalAccountInfo =
            MxnExternalAccountInfo.builder()
                .accountType(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .clabeNumber("123456789012345678")
                .addCountry(MxnExternalAccountInfo.Country.MX)
                .addPaymentRail(MxnExternalAccountInfo.PaymentRail.SPEI)
                .build()

        val roundtrippedMxnExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnExternalAccountInfo),
                jacksonTypeRef<MxnExternalAccountInfo>(),
            )

        assertThat(roundtrippedMxnExternalAccountInfo).isEqualTo(mxnExternalAccountInfo)
    }
}
